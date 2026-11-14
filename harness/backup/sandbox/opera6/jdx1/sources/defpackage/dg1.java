package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class dg1 {
    public static final dg1 a = new dg1();

    public final int a(@NotNull Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        int i3 = rect.bottom;
        return i - (i2 + (i3 > i ? i3 - i : 0));
    }
}
