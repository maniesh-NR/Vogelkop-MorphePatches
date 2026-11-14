package com.leanplum.internal;

import com.leanplum.callbacks.StartCallback;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Request;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Registration {
    public static void registerDevice(String str, final StartCallback startCallback) {
        Request requestCreate = RequestBuilder.withRegisterForDevelopmentAction().andParam(Constants.Params.EMAIL, str).andType(Request.RequestType.IMMEDIATE).create();
        requestCreate.onResponse(new Request.ResponseCallback() { // from class: com.leanplum.internal.Registration.1
            @Override // com.leanplum.internal.Request.ResponseCallback
            public void response(JSONObject jSONObject) {
                try {
                    boolean zIsResponseSuccess = RequestUtil.isResponseSuccess(jSONObject);
                    startCallback.setSuccess(zIsResponseSuccess);
                    if (!zIsResponseSuccess) {
                        Log.e(RequestUtil.getResponseError(jSONObject), new Object[0]);
                    }
                    OperationQueue.sharedInstance().addUiOperation(startCallback);
                } catch (Throwable th) {
                    Log.exception(th);
                }
            }
        });
        requestCreate.onError(new Request.ErrorCallback() { // from class: com.leanplum.internal.Registration.2
            @Override // com.leanplum.internal.Request.ErrorCallback
            public void error(Exception exc) {
                startCallback.setSuccess(false);
                OperationQueue.sharedInstance().addUiOperation(startCallback);
            }
        });
        RequestSender.getInstance().send(requestCreate);
    }
}
