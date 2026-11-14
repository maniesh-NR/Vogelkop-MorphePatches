package com.leanplum.internal;

import androidx.annotation.NonNull;
import com.leanplum.Leanplum;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Request;
import com.leanplum.internal.http.NetworkOperation;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RequestSender {
    private static RequestSender INSTANCE = new RequestSender();
    private final LeanplumEventCallbackManager eventCallbackManager = new LeanplumEventCallbackManager();
    private final RequestBatchFactory batchFactory = new RequestBatchFactory();
    private final RequestUuidHelper uuidHelper = new RequestUuidHelper();
    private final List<Map<String, Object>> localErrors = new ArrayList();

    private void addLocalError(Request request) {
        this.localErrors.add(createArgsDictionary(request));
    }

    public static Map<String, Object> createArgsDictionary(Request request) {
        HashMap map = new HashMap();
        map.put(Constants.Params.DEVICE_ID, APIConfig.getInstance().deviceId());
        map.put(Constants.Params.USER_ID, APIConfig.getInstance().userId());
        map.put("action", request.getApiAction());
        map.put(Constants.Params.SDK_VERSION, Constants.LEANPLUM_VERSION);
        map.put(Constants.Params.DEV_MODE, Boolean.toString(Constants.isDevelopmentModeEnabled));
        map.put(Constants.Params.TIME, Double.toString(new Date().getTime() / 1000.0d));
        map.put(Constants.Params.REQUEST_ID, request.getRequestId());
        String str = APIConfig.getInstance().token();
        if (str != null) {
            map.put("token", str);
        }
        map.putAll(request.getParams());
        return map;
    }

    private RequestBatch createNextBatch() {
        int size = this.localErrors.size();
        RequestBatchFactory requestBatchFactory = this.batchFactory;
        return size > 0 ? requestBatchFactory.createErrorBatch(this.localErrors) : requestBatchFactory.createNextBatch();
    }

    public static RequestSender getInstance() {
        return INSTANCE;
    }

    private boolean handleDatabaseError(Request request) {
        if (!LeanplumEventDataManager.sharedInstance().hasDatabaseError()) {
            return false;
        }
        if (!RequestBuilder.ACTION_LOG.equals(request.getApiAction())) {
            return true;
        }
        addLocalError(request);
        return true;
    }

    private void invokeCallbacksWithError(@NonNull Exception exc) {
        this.eventCallbackManager.invokeAllCallbacksWithError(exc);
    }

    private void saveRequest(Request request) {
        if (handleDatabaseError(request)) {
            return;
        }
        Map<String, Object> mapCreateArgsDictionary = createArgsDictionary(request);
        try {
            if (this.uuidHelper.attachUuid(mapCreateArgsDictionary)) {
                LeanplumEventDataManager.sharedInstance().insertEvent(JsonConverter.toJson(mapCreateArgsDictionary));
                if (request.response == null && (request.error == null || Util.isConnected())) {
                    return;
                }
                this.eventCallbackManager.addCallbacks(request, request.response, request.error);
            }
        } catch (Throwable th) {
            Log.exception(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSync(@NonNull Request request) {
        if (Constants.isTestMode) {
            return;
        }
        saveRequest(request);
        if (Constants.isDevelopmentModeEnabled || Request.RequestType.IMMEDIATE.equals(request.getType())) {
            try {
                if (validateConfig(request)) {
                    sendRequests();
                }
            } catch (Throwable th) {
                Log.exception(th);
            }
        }
    }

    public static void setInstance(RequestSender requestSender) {
        INSTANCE = requestSender;
    }

    private boolean validateConfig(@NonNull Request request) {
        if (APIConfig.getInstance().appId() == null) {
            Log.e("Cannot send request. appId is not set.", new Object[0]);
            return false;
        }
        if (APIConfig.getInstance().accessKey() == null) {
            Log.e("Cannot send request. accessKey is not set.", new Object[0]);
            return false;
        }
        if (Util.isConnected()) {
            return true;
        }
        Log.d("Device is offline, will try sending requests again later.", new Object[0]);
        Request.ErrorCallback errorCallback = request.error;
        if (errorCallback != null) {
            errorCallback.error(new Exception("Leanplum: device is offline"));
        }
        return false;
    }

    public void invokeCallbacks(@NonNull JSONObject jSONObject) {
        this.eventCallbackManager.invokeCallbacks(jSONObject);
    }

    public void send(@NonNull final Request request) {
        OperationQueue.sharedInstance().addOperation(new Runnable() { // from class: com.leanplum.internal.RequestSender.1
            @Override // java.lang.Runnable
            public void run() {
                RequestSender.this.sendSync(request);
            }
        });
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x014b -> B:54:0x014f). Please report as a decompilation issue!!! */
    public void sendRequests() {
        Throwable th;
        NetworkOperation networkOperation;
        Leanplum.countAggregator().sendAllCounts();
        RequestBatch requestBatchCreateNextBatch = createNextBatch();
        if (requestBatchCreateNextBatch.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        if (APIConfig.getInstance().attachApiKeys(map)) {
            map.put(Constants.Params.DATA, requestBatchCreateNextBatch.getJson());
            map.put(Constants.Params.SDK_VERSION, Constants.LEANPLUM_VERSION);
            map.put("action", RequestBuilder.ACTION_MULTI);
            map.put(Constants.Params.TIME, Double.toString(new Date().getTime() / 1000.0d));
            NetworkOperation networkOperation2 = null;
            try {
                try {
                    try {
                        networkOperation = new NetworkOperation(Constants.API_HOST_NAME, Constants.API_SERVLET, map, RequestBuilder.POST, Constants.API_SSL, Constants.NETWORK_TIMEOUT_SECONDS);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (JSONException e) {
                    e = e;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th3) {
                Log.exception(th3);
            }
            try {
                JSONObject jsonResponse = networkOperation.getJsonResponse();
                int responseCode = networkOperation.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Exception exc = new Exception("HTTP error " + responseCode);
                    String message = exc.getMessage();
                    if (jsonResponse != null) {
                        message = message + " " + jsonResponse.toString();
                    }
                    Log.i(message, new Object[0]);
                    if (responseCode != -1 && responseCode != 408 && responseCode != 429 && (responseCode < 500 || responseCode > 599)) {
                        this.batchFactory.deleteFinishedBatch(requestBatchCreateNextBatch);
                    }
                    invokeCallbacksWithError(exc);
                } else {
                    invokeCallbacks(jsonResponse);
                    this.localErrors.clear();
                    this.batchFactory.deleteFinishedBatch(requestBatchCreateNextBatch);
                    if (requestBatchCreateNextBatch.isFull()) {
                        sendRequests();
                    }
                }
                networkOperation.disconnect();
            } catch (JSONException e3) {
                e = e3;
                networkOperation2 = networkOperation;
                Log.e("Error parsing JSON response: " + e.toString() + "\n" + Log.getStackTraceString(e), new Object[0]);
                this.batchFactory.deleteFinishedBatch(requestBatchCreateNextBatch);
                invokeCallbacksWithError(e);
                if (networkOperation2 != null) {
                    networkOperation2.disconnect();
                }
            } catch (Exception e4) {
                e = e4;
                networkOperation2 = networkOperation;
                Log.e("Unable to send request: " + e.toString() + "\n" + Log.getStackTraceString(e), new Object[0]);
                invokeCallbacksWithError(e);
                if (networkOperation2 != null) {
                    networkOperation2.disconnect();
                }
            } catch (Throwable th4) {
                th = th4;
                networkOperation2 = networkOperation;
                if (networkOperation2 == null) {
                    throw th;
                }
                networkOperation2.disconnect();
                throw th;
            }
        }
    }
}
