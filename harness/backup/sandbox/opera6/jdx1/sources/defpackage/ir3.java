package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class ir3 implements hr3, v3o {
    public static final ir3 a = new ir3();
    public static final ir3 b = new ir3();

    @Override // defpackage.hr3
    public final Rect c(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }

    @Override // defpackage.v3o
    public final r3o h(Context context, o27 o27Var) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        return new r3o(windowManager.getCurrentWindowMetrics().getBounds(), context.getResources().getDisplayMetrics().density);
    }
}
