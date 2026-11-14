package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class yvk extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ short b;
    public final /* synthetic */ SwipeRefreshLayout c;

    /* JADX WARN: Multi-variable type inference failed */
    public yvk(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.c.y.setAlpha((int) (((this.b - r0) * f) + this.a));
    }
}
