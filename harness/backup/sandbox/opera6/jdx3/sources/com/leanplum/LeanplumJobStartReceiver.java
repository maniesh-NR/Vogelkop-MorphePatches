package com.leanplum;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.leanplum.internal.Log;

/* loaded from: classes.dex */
public class LeanplumJobStartReceiver extends BroadcastReceiver {
    public static final String LP_EXTRA_JOB_ID = "com.leanplum.service_job_id";
    public static final String LP_EXTRA_SERVICE_CLASS = "com.leanplum.service_class";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws ClassNotFoundException {
        try {
            if (intent.getExtras() == null) {
                Log.d("Cannot enqueue work on JobIntentService, no extras in intent.", new Object[0]);
                return;
            }
            String stringExtra = intent.getStringExtra(LP_EXTRA_SERVICE_CLASS);
            int intExtra = intent.getIntExtra(LP_EXTRA_JOB_ID, 0);
            Class<?> cls = Class.forName(stringExtra);
            if (!iob.class.isAssignableFrom(cls)) {
                Log.d("The service provided is not a type of JobIntentService.", new Object[0]);
            } else {
                intent.setClass(context, cls);
                iob.enqueueWork(context, cls, intExtra, intent);
            }
        } catch (Exception e) {
            Log.exception(e);
        }
    }
}
