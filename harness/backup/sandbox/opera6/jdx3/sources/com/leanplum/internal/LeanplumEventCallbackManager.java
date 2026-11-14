package com.leanplum.internal;

import androidx.annotation.NonNull;
import com.leanplum.internal.Request;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
class LeanplumEventCallbackManager {
    private final ConcurrentHashMap<String, LeanplumEventCallbacks> callbacks = new ConcurrentHashMap<>();

    private static class LeanplumEventCallbacks {
        private Request.ErrorCallback errorCallback;
        private Request.ResponseCallback responseCallback;

        public LeanplumEventCallbacks(Request.ResponseCallback responseCallback, Request.ErrorCallback errorCallback) {
            this.responseCallback = responseCallback;
            this.errorCallback = errorCallback;
        }
    }

    public void addCallbacks(Request request, Request.ResponseCallback responseCallback, Request.ErrorCallback errorCallback) {
        if (request != null) {
            if (responseCallback == null && errorCallback == null) {
                return;
            }
            this.callbacks.put(request.getRequestId(), new LeanplumEventCallbacks(responseCallback, errorCallback));
        }
    }

    public void invokeAllCallbacksWithError(@NonNull final Exception exc) {
        if (this.callbacks.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, LeanplumEventCallbacks> entry : this.callbacks.entrySet()) {
                String key = entry.getKey();
                final LeanplumEventCallbacks value = entry.getValue();
                if (value != null) {
                    OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.internal.LeanplumEventCallbackManager.3
                        @Override // java.lang.Runnable
                        public void run() {
                            if (value.errorCallback != null) {
                                value.errorCallback.error(exc);
                            }
                        }
                    });
                    arrayList.add(key);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.callbacks.remove((String) obj);
            }
        }
    }

    public void invokeCallbacks(JSONObject jSONObject) {
        final JSONObject responseForId;
        if (jSONObject == null || this.callbacks.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, LeanplumEventCallbacks> entry : this.callbacks.entrySet()) {
            String key = entry.getKey();
            final LeanplumEventCallbacks value = entry.getValue();
            if (key != null && value != null && (responseForId = RequestUtil.getResponseForId(jSONObject, key)) != null) {
                if (RequestUtil.isResponseSuccess(responseForId)) {
                    OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.internal.LeanplumEventCallbackManager.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (value.responseCallback != null) {
                                value.responseCallback.response(responseForId);
                            }
                        }
                    });
                } else {
                    final String readableErrorMessage = RequestUtil.getReadableErrorMessage(RequestUtil.getResponseError(responseForId));
                    OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.internal.LeanplumEventCallbackManager.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (value.errorCallback != null) {
                                value.errorCallback.error(new Exception(readableErrorMessage));
                            }
                        }
                    });
                }
                arrayList.add(key);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.callbacks.remove((String) obj);
        }
    }
}
