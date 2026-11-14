package defpackage;

import android.graphics.Rect;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes.dex */
public abstract class c4o {
    public static Rect a(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }

    public static void b(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }
}
