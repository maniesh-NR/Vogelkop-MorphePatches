package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class pjm {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT < 30;
    }
}
