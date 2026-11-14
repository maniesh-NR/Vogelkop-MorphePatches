package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class p27 implements o27, v3o {
    public static final p27 a = new p27();
    public static final p27 b = new p27();

    public final float b(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.v3o
    public final r3o h(Context context, o27 o27Var) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        return new r3o(windowManager.getCurrentWindowMetrics().getBounds(), windowManager.getCurrentWindowMetrics().getDensity());
    }
}
