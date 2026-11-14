package com.leanplum;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Log;
import java.util.UUID;

/* loaded from: classes.dex */
public class LeanplumLocalPushListenerService extends iob {
    private static final String LP_CLASS_NAME = "com.leanplum.LeanplumLocalPushListenerService";
    private static final int LP_JOB_ID = 1;

    public static Intent getIntent(Context context) {
        Intent intent = new Intent();
        intent.putExtra(LeanplumJobStartReceiver.LP_EXTRA_SERVICE_CLASS, LP_CLASS_NAME);
        intent.putExtra(LeanplumJobStartReceiver.LP_EXTRA_JOB_ID, 1);
        intent.putExtra(Constants.Keys.LOCAL_PUSH_OCCURRENCE_ID, UUID.randomUUID().toString());
        intent.setClass(context, LeanplumJobStartReceiver.class);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onHandleWork(@NonNull Intent intent) {
        try {
            if (intent == null) {
                Log.e("The intent cannot be null", new Object[0]);
                return;
            }
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey(Constants.Keys.PUSH_MESSAGE_TEXT)) {
                return;
            }
            LeanplumPushService.handleNotification(this, extras);
        } catch (Throwable th) {
            Log.exception(th);
        }
    }
}
