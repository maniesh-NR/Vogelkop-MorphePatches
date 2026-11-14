package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public interface w8g {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
