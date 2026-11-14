package defpackage;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes.dex */
public abstract class yto {
    public static final String a;

    static {
        String string;
        try {
            string = Settings.Secure.getString(((Context) phf.a.a).getContentResolver(), "android_id");
        } catch (SecurityException unused) {
            string = null;
        }
        a = string;
    }
}
