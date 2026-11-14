package com.opera.android.browser;

import J.N;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.PasswordImporter;
import com.opera.android.import_data.ImportChromeDataActivity;
import com.opera.api.Callback;
import defpackage.a32;
import defpackage.b3b;
import defpackage.bu3;
import defpackage.cx3;
import defpackage.ikf;
import defpackage.j2b;
import defpackage.jkf;
import defpackage.l2b;
import defpackage.re7;
import defpackage.rf7;
import defpackage.s29;
import defpackage.u92;
import defpackage.vdf;
import defpackage.vml;
import defpackage.x92;
import defpackage.xf7;
import defpackage.zr9;
import java.io.File;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OperaDownloadManagerDelegate {

    public static class TargetCallback implements Callback {
        public final long a;

        public TargetCallback(long j) {
            this.a = j;
        }

        public final void finalize() throws Throwable {
            N.MgCi$nPM(this, this.a);
            super.finalize();
        }

        @Override // com.opera.api.Callback
        public final void run(Object obj) {
            N.MkE07MDU(this, this.a, (String) obj);
        }
    }

    @SuppressLint({"WrongConstant"})
    public static void onShowDownloadPathDialog(boolean z, long j, @NonNull TargetCallback targetCallback, @NonNull String str, boolean z2) {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        rf7 rf7Var = ((OperaApplication) context.getApplicationContext()).m().a;
        long j2 = (z ? 4611686018427387904L : 0L) | j;
        re7 re7VarD = rf7Var.d(j2);
        if (re7VarD == null) {
            rf7Var.b(new jkf(j2, new ikf(z, j, targetCallback, str, z2), new vdf(targetCallback, (byte) 3)));
            return;
        }
        xf7 xf7Var = re7VarD.a;
        bu3 bu3Var = new bu3((byte) 1, re7VarD, targetCallback, z2);
        if (re7VarD.d == null) {
            Uri uriM = ((OperaApplication) xf7Var.d.b.getApplicationContext()).J().m();
            if (!uriM.equals(re7VarD.d)) {
                re7VarD.d = uriM;
                re7VarD.e = null;
            }
        }
        re7VarD.p = str;
        xf7Var.c.e(new a32(re7VarD, re7VarD.d, str, (byte) 7)).c(new ge5(re7VarD, bu3Var, (byte) 14)).a(null, null);
    }

    public static void openDownload(boolean z, long j) {
        cx3 cx3Var;
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        re7 re7VarD = ((OperaApplication) context.getApplicationContext()).m().a.d(j | (z ? 4611686018427387904L : 0L));
        if (re7VarD != null) {
            int iM = re7VarD.t.m();
            if (iM != 0 && iM != 1) {
                if (iM != 2 || (cx3Var = re7VarD.x) == null) {
                    return;
                }
                switch (cx3Var.b) {
                    case 0:
                        Uri uriG = re7VarD.g();
                        if (uriG != null) {
                            cx3Var.c.F().j(Collections.singletonList(new u92(uriG, rf7.g(re7VarD), re7VarD.m, s29.d(re7VarD.f()))), x92.d);
                            break;
                        }
                        break;
                }
            }
            cx3 cx3Var2 = re7VarD.x;
            if (cx3Var2 != null) {
                switch (cx3Var2.b) {
                    case 0:
                        fp1 fp1Var = cx3Var2.c;
                        String[] strArr2 = OperaApplication.K;
                        ((OperaApplication) fp1Var.getApplication()).m().a.p(re7VarD, fp1Var, cx3Var2.e(re7VarD), false);
                        break;
                    case 1:
                        j2b j2bVar = Intrinsics.a(re7VarD.m, "text/csv") ? j2b.c : j2b.d;
                        File file = new File(re7VarD.h(), re7VarD.f());
                        boolean zExists = file.exists();
                        ImportChromeDataActivity importChromeDataActivity = (ImportChromeDataActivity) cx3Var2.c;
                        if (!zExists) {
                            b3b[] b3bVarArr = b3b.a;
                            int i = ImportChromeDataActivity.d0;
                            importChromeDataActivity.S0(j2bVar, -6);
                            break;
                        } else {
                            int i2 = ImportChromeDataActivity.d0;
                            if (j2bVar != j2b.c) {
                                if (j2bVar == j2b.d) {
                                    vml.d.c(new zr9(importChromeDataActivity, file, (byte) 7)).a(null);
                                    break;
                                }
                            } else {
                                new PasswordImporter(new d06(importChromeDataActivity)).a(file.getAbsolutePath());
                                break;
                            }
                        }
                        break;
                    default:
                        File file2 = new File(re7VarD.h(), re7VarD.f());
                        boolean zExists2 = file2.exists();
                        l2b l2bVar = (l2b) cx3Var2.c;
                        if (!zExists2) {
                            b3b[] b3bVarArr2 = b3b.a;
                            l2bVar.E0(-6);
                            break;
                        } else {
                            l2bVar.W.append('f');
                            l2bVar.C0(file2);
                            break;
                        }
                }
            }
        }
    }
}
