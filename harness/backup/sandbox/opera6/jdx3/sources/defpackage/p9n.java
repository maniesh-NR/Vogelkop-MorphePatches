package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public interface p9n {
    void h(View view);

    default boolean m(View view) {
        h(view);
        return false;
    }
}
