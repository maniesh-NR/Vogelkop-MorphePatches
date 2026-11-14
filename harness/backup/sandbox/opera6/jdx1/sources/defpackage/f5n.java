package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class f5n {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = f6n.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }
}
