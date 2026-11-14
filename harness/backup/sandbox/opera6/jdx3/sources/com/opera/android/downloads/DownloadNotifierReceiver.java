package com.opera.android.downloads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import com.opera.android.OperaApplication;
import defpackage.nc0;
import defpackage.qc0;
import defpackage.re7;
import defpackage.rf7;
import defpackage.sf7;
import defpackage.vf7;
import defpackage.x5f;

/* loaded from: classes.dex */
public class DownloadNotifierReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        if (sfe.g0(context)) {
            return;
        }
        String action = intent.getAction();
        if (TextUtils.equals(action, "com.opera.android.action.DOWNLOAD_NOTIFICATION_DELETED")) {
            int intExtra = intent.getIntExtra(Constants.Kinds.DICTIONARY, -1);
            String[] strArr = OperaApplication.K;
            sf7 sf7VarM = ((OperaApplication) context.getApplicationContext()).m();
            x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
            rf7 rf7Var = sf7VarM.a;
            if (rf7Var.j == null && (i = ((SharedPreferences) rf7Var.h.get()).getInt("last_downloaded_file_type", -1)) != -1) {
                rf7Var.j = nc0.a(i);
            }
            nc0 nc0Var = rf7Var.j;
            if (x5fVar.h) {
                x5fVar.P(qc0.d, nc0Var);
            }
            igi igiVar = sf7VarM.b;
            igiVar.getClass();
            igiVar.q(vf7.values()[intExtra]);
            return;
        }
        if (TextUtils.equals(action, "com.opera.android.action.PAUSE_ACTIVE_DOWNLOADS")) {
            String[] strArr2 = OperaApplication.K;
            ((OperaApplication) context.getApplicationContext()).m().a.r();
            return;
        }
        if (!TextUtils.equals(action, "com.opera.android.action.RESUME_FAILED_DOWNLOADS")) {
            if (TextUtils.equals(action, "com.opera.android.action.RESUME_DOWNLOADS")) {
                DownloadService.d(context, true);
                return;
            }
            return;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("to-resume");
        if (stringArrayExtra != null) {
            String[] strArr3 = OperaApplication.K;
            rf7 rf7Var2 = ((OperaApplication) context.getApplicationContext()).m().a;
            for (String str : stringArrayExtra) {
                re7 re7VarE = rf7Var2.e(Uri.parse(str), 0);
                if (re7VarE != null) {
                    re7VarE.u();
                }
            }
        }
    }
}
