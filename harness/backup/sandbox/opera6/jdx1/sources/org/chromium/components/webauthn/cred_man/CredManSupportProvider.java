package org.chromium.components.webauthn.cred_man;

import android.content.pm.PackageInfo;
import android.os.Build;
import defpackage.cs5;
import defpackage.j14;
import defpackage.t8;
import defpackage.tgk;
import defpackage.uyn;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public final class CredManSupportProvider {
    public static int a;

    public static int getCredManSupport() {
        int i = a;
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT < 34) {
            a = -1;
            uyn.a("Disabled because of Android version.", new Object[0]);
            return a;
        }
        int i2 = j14.w;
        if (i2 == 0) {
            PackageInfo packageInfoK = cs5.K("com.google.android.gms", 0);
            i2 = packageInfoK != null ? packageInfoK.versionCode : -1;
            j14.w = i2;
        }
        if (i2 < 242300000) {
            a = -1;
            uyn.a("Disabled because of old GMS version.", new Object[0]);
            return a;
        }
        if (t8.a.getSystemService("credential") == null) {
            a = -1;
            ioh.t("WebAuthentication.Android.CredManAvailability", false);
            uyn.a("Disabled because CredentialManager is not available.", new Object[0]);
            return a;
        }
        ioh.t("WebAuthentication.Android.CredManAvailability", true);
        tgk tgkVarL = tgk.l();
        try {
            try {
                Iterator it = Arrays.asList(new b16[0]).iterator();
                Object next = it.hasNext() ? it.next() : null;
                tgkVarL.close();
                if (next != null) {
                    h9o.t();
                    return 0;
                }
                if (dpj.b == null) {
                    dpj.b = new dpj((byte) 10);
                }
                a = 2;
                uyn.a("Support is %d", 2);
                return a;
            } catch (Throwable th) {
                try {
                    tgkVarL.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            throw new ServiceConfigurationError(th3.getMessage(), th3);
        }
    }
}
