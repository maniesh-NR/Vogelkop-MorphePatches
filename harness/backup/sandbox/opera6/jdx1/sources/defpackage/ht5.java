package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes.dex */
public abstract class ht5 {
    public static final SharedPreferences a;

    static {
        tgk tgkVarM = tgk.m();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(t8.a);
            tgkVarM.close();
            a = defaultSharedPreferences;
        } catch (Throwable th) {
            try {
                tgkVarM.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
