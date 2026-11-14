package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class bog extends s16 {
    @Override // defpackage.s16
    public final void r(Rect rect, View view) {
        rect.set(((WindowManager) view.getContext().getSystemService("window")).getCurrentWindowMetrics().getBounds());
    }
}
