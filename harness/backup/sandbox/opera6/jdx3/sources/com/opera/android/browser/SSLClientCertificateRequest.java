package com.opera.android.browser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.security.KeyChain;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContent;
import defpackage.bei;
import defpackage.x56;
import defpackage.x5f;
import defpackage.zpa;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class SSLClientCertificateRequest {
    public static boolean selectClientCertificate(long j, @NonNull ChromiumContent chromiumContent, @NonNull String[] strArr, @NonNull byte[][] bArr, @NonNull String str, int i) {
        X500Principal[] x500PrincipalArr;
        Context context = t8.a;
        String[] strArr2 = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            am2.f(zpaVar, x56VarF).b.p(17, 1, 1L);
            x5fVar.U0(x56VarF);
        }
        Activity activity = (Activity) chromiumContent.b.m().get();
        if (activity != null) {
            if (bArr.length > 0) {
                X500Principal[] x500PrincipalArr2 = new X500Principal[bArr.length];
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    try {
                        x500PrincipalArr2[i2] = new X500Principal(bArr[i2]);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                x500PrincipalArr = x500PrincipalArr2;
            } else {
                x500PrincipalArr = null;
            }
            bei beiVar = new bei(activity.getApplicationContext(), j);
            try {
                KeyChain.choosePrivateKeyAlias(activity, beiVar, strArr, x500PrincipalArr, str, i, null);
                return true;
            } catch (ActivityNotFoundException unused2) {
                beiVar.alias(null);
                return true;
            }
        }
        return false;
    }
}
