package com.leanplum.internal;

import com.leanplum.internal.Constants;
import com.leanplum.internal.Request;
import com.leanplum.internal.http.NetworkOperation;
import defpackage.qj;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FileTransferManager {
    private static final FileTransferManager INSTANCE = new FileTransferManager();
    private NoPendingDownloadsCallback noPendingDownloadsBlock;
    private int pendingDownloads;
    private final Map<String, Boolean> fileTransferStatus = new HashMap();
    private final Map<File, Long> fileUploadSize = new HashMap();
    private final Map<File, Double> fileUploadProgress = new HashMap();
    private final Object uploadFileLock = new Object();
    private String fileUploadProgressString = "";

    public interface NoPendingDownloadsCallback {
        void noPendingDownloads();
    }

    private FileTransferManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadHelper(Request request, String str, String str2, String str3, String str4, Map<String, Object> map) throws Throwable {
        Exception exc;
        URL url;
        Throwable th;
        NoPendingDownloadsCallback noPendingDownloadsCallback;
        String str5;
        NetworkOperation networkOperation;
        URL url2;
        NoPendingDownloadsCallback noPendingDownloadsCallback2;
        String httpMethod = request.getHttpMethod();
        NetworkOperation networkOperation2 = null;
        try {
            try {
                if (str4 == null) {
                    str5 = str;
                    networkOperation = new NetworkOperation(str5, str2, map, httpMethod, Constants.API_SSL, Constants.NETWORK_TIMEOUT_SECONDS_FOR_DOWNLOADS);
                } else {
                    str5 = str;
                    networkOperation = new NetworkOperation(str4, httpMethod, str4.startsWith("https://"), Constants.NETWORK_TIMEOUT_SECONDS_FOR_DOWNLOADS);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                try {
                    url2 = networkOperation.getURL();
                } catch (Exception e) {
                    exc = e;
                    url = null;
                }
                try {
                    networkOperation.connect();
                    int responseCode = networkOperation.getResponseCode();
                    if (responseCode != 200) {
                        throw new Exception("Leanplum: Error sending request to: " + str5 + ", HTTP status code: " + responseCode);
                    }
                    Stack stack = new Stack();
                    String parent = str3;
                    while (true) {
                        parent = new File(parent).getParent();
                        if (parent == null) {
                            break;
                        } else {
                            stack.push(parent);
                        }
                    }
                    while (!stack.isEmpty()) {
                        String strFileRelativeToDocuments = FileManager.fileRelativeToDocuments((String) stack.pop());
                        if (!new File(strFileRelativeToDocuments).mkdir()) {
                            Log.d("Failed to create directory: ", strFileRelativeToDocuments);
                        }
                    }
                    networkOperation.saveResponse(new FileOutputStream(new File(FileManager.fileRelativeToDocuments(str3))));
                    this.pendingDownloads--;
                    Request.ResponseCallback responseCallback = request.response;
                    if (responseCallback != null) {
                        responseCallback.response(null);
                    }
                    if (this.pendingDownloads == 0 && (noPendingDownloadsCallback2 = this.noPendingDownloadsBlock) != null) {
                        noPendingDownloadsCallback2.noPendingDownloads();
                    }
                    networkOperation.disconnect();
                } catch (Exception e2) {
                    url = url2;
                    exc = e2;
                    networkOperation2 = networkOperation;
                    if ((exc instanceof EOFException) && networkOperation2 != null && !networkOperation2.getURL().equals(url)) {
                        downloadHelper(request, null, networkOperation2.getURL().toString(), str3, str4, new HashMap());
                        networkOperation2.disconnect();
                        return;
                    }
                    Log.e("Error downloading resource:" + str3, exc);
                    this.pendingDownloads = this.pendingDownloads + (-1);
                    Request.ErrorCallback errorCallback = request.error;
                    if (errorCallback != null) {
                        errorCallback.error(exc);
                    }
                    if (this.pendingDownloads == 0 && (noPendingDownloadsCallback = this.noPendingDownloadsBlock) != null) {
                        noPendingDownloadsCallback.noPendingDownloads();
                    }
                    if (networkOperation2 != null) {
                        networkOperation2.disconnect();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                networkOperation2 = networkOperation;
                if (networkOperation2 == null) {
                    throw th;
                }
                networkOperation2.disconnect();
                throw th;
            }
        } catch (Exception e3) {
            exc = e3;
            url = null;
        }
    }

    public static FileTransferManager getInstance() {
        return INSTANCE;
    }

    private static String getSizeAsString(int i) {
        if (i < 1024) {
            return u35.g(i, " B");
        }
        if (i < 1048576) {
            return p3p.k(i >> 10, " KB", new StringBuilder());
        }
        return p3p.k(i >> 20, " MB", new StringBuilder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$downloadFile$0(Runnable runnable, JSONObject jSONObject) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$downloadFile$1(Runnable runnable, Exception exc) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printUploadProgress() {
        int size = this.fileUploadSize.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<File, Long> entry : this.fileUploadSize.entrySet()) {
            File key = entry.getKey();
            long jLongValue = entry.getValue().longValue();
            double dDoubleValue = this.fileUploadProgress.get(key).doubleValue();
            if (dDoubleValue == 1.0d) {
                i++;
            }
            i2 += (int) (jLongValue * dDoubleValue);
            i3 = (int) (i3 + jLongValue);
        }
        StringBuilder sb = new StringBuilder("Uploading resources. ");
        sb.append(i);
        sb.append('/');
        sb.append(size);
        sb.append(" files completed; ");
        sb.append(getSizeAsString(i2));
        sb.append('/');
        String strL = z1m.l(sb, getSizeAsString(i3), " transferred.");
        if (this.fileUploadProgressString.equals(strL)) {
            return;
        }
        this.fileUploadProgressString = strL;
        Log.d(strL, new Object[0]);
    }

    public void downloadFile(final String str, final String str2, Runnable runnable, Runnable runnable2) {
        if (Constants.isTestMode) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.fileTransferStatus.get(str))) {
            return;
        }
        final Request requestCreate = RequestBuilder.withDownloadFileAction().create();
        requestCreate.onResponse(new qj(runnable, (byte) 2));
        requestCreate.onError(new qj(runnable2, (byte) 3));
        this.pendingDownloads++;
        Log.d("Downloading resource: %s", str);
        this.fileTransferStatus.put(str, bool);
        final Map<String, Object> mapCreateArgsDictionary = RequestSender.createArgsDictionary(requestCreate);
        mapCreateArgsDictionary.put(Constants.Keys.FILENAME, str);
        if (APIConfig.getInstance().attachApiKeys(mapCreateArgsDictionary)) {
            OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.internal.FileTransferManager.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        FileTransferManager.this.downloadHelper(requestCreate, Constants.API_HOST_NAME, Constants.API_SERVLET, str, str2, mapCreateArgsDictionary);
                    } catch (Throwable th) {
                        Log.exception(th);
                    }
                }
            });
        }
    }

    public int numPendingDownloads() {
        return this.pendingDownloads;
    }

    public void onNoPendingDownloads(NoPendingDownloadsCallback noPendingDownloadsCallback) {
        this.noPendingDownloadsBlock = noPendingDownloadsCallback;
    }

    public void sendFilesNow(List<JSONObject> list, List<String> list2, final List<InputStream> list3) {
        long length;
        final Request requestCreate = RequestBuilder.withUploadFileAction().andParam(Constants.Params.DATA, list.toString()).create();
        if (Constants.isTestMode) {
            return;
        }
        final Map<String, Object> mapCreateArgsDictionary = RequestSender.createArgsDictionary(requestCreate);
        if (APIConfig.getInstance().attachApiKeys(mapCreateArgsDictionary)) {
            final ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list2.size(); i++) {
                String str = list2.get(i);
                if (str != null && !Boolean.TRUE.equals(this.fileTransferStatus.get(str))) {
                    File file = new File(str);
                    try {
                        length = list3.get(i).available();
                    } catch (IOException unused) {
                        length = file.length();
                    } catch (NullPointerException unused2) {
                        Log.e("Unable to read file ".concat(str), new Object[0]);
                    }
                    this.fileTransferStatus.put(str, Boolean.TRUE);
                    arrayList.add(file);
                    this.fileUploadSize.put(file, Long.valueOf(length));
                    this.fileUploadProgress.put(file, Double.valueOf(0.0d));
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            printUploadProgress();
            OperationQueue.sharedInstance().addParallelOperation(new Runnable() { // from class: com.leanplum.internal.FileTransferManager.2
                /* JADX WARN: Removed duplicated region for block: B:49:0x00ba A[Catch: all -> 0x00e1, LOOP:0: B:47:0x00b4->B:49:0x00ba, LOOP_END, TryCatch #0 {, blocks: (B:18:0x0061, B:46:0x00ae, B:47:0x00b4, B:49:0x00ba, B:50:0x00d0, B:51:0x00d5, B:56:0x00db, B:57:0x00de, B:45:0x00ab), top: B:62:0x000a }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 228
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.leanplum.internal.FileTransferManager.AnonymousClass2.run():void");
                }
            });
        }
    }
}
