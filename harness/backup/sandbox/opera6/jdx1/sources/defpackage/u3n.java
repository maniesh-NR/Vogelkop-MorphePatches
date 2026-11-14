package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public interface u3n {
    Range C();

    Range E();

    boolean f();

    Range g(int i);

    int h();

    boolean i(int i, int i2);

    default boolean o(int i, int i2) {
        if (i(i, i2)) {
            return true;
        }
        return f() && i(i2, i);
    }

    int q();

    Range r();

    Range z(int i);
}
