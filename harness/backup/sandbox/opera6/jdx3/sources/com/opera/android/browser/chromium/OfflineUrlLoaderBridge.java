package com.opera.android.browser.chromium;

import J.N;
import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import defpackage.ks3;
import defpackage.vml;

/* loaded from: classes.dex */
public final class OfflineUrlLoaderBridge {
    public static void getOfflinePageMimeTypeAndPath(final long j, final long j2) {
        vml.c(new Runnable() { // from class: w8f
            @Override // java.lang.Runnable
            public final void run() {
                Context context = t8.a;
                String[] strArr = OperaApplication.K;
                glh glhVarH = ((OperaApplication) context.getApplicationContext()).H();
                final long j3 = j2;
                final long j4 = j;
                glhVarH.c(new Callback() { // from class: x8f
                    @Override // com.opera.api.Callback
                    public final void run(Object obj) {
                        String str;
                        String str2;
                        ilh ilhVar = (ilh) obj;
                        if (ilhVar != null) {
                            String str3 = ilhVar.j;
                            str2 = ilhVar.f;
                            str = str3;
                        } else {
                            str = "";
                            str2 = str;
                        }
                        N.MFLyNg5d(j3, j4, str, str2);
                    }
                }, j4);
            }
        });
    }

    public static void reportProblem(int i, @NonNull String str) {
        scd.p("contentScheme", str);
        ks3.E(new yo8("Offline page failure", "Failure: " + i), hsh.m(1, new Object[]{"contentScheme", str}, (k1b) null));
    }
}
