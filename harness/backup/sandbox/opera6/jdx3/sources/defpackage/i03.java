package defpackage;

import android.content.Context;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class i03 extends FrameLayout {
    public final h03 a;
    public c1f b;
    public boolean c;
    public final pde d;
    public int e;
    public int f;

    public i03(Context context) {
        super(context);
        this.a = new h03(this, (byte) 0);
        this.d = new pde(new g03(0, 0));
        setWillNotDraw(false);
    }

    public final void a() {
        c1f c1fVar;
        c1f c1fVar2;
        boolean zIsAttachedToWindow = isAttachedToWindow();
        h03 h03Var = this.a;
        if (zIsAttachedToWindow && q9n.x(this)) {
            if (this.c || (c1fVar2 = this.b) == null) {
                return;
            }
            this.c = true;
            c1fVar2.d(h03Var);
            return;
        }
        if (!this.c || (c1fVar = this.b) == null) {
            return;
        }
        this.c = false;
        c1fVar.g(h03Var);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        d3o d3oVar = g3o.g(this, windowInsets).a;
        r9b r9bVarI = d3oVar.i(519);
        r9b r9bVarI2 = d3oVar.i(8);
        int i = r9bVarI.b;
        int i2 = r9bVarI.d;
        xf8.F0(this.d, new g03(i2, Math.max(i2, r9bVarI2.d)));
        setPadding(0, i, 0, 0);
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = c1f.c(this);
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c1f c1fVar;
        super.onDetachedFromWindow();
        if (this.c && (c1fVar = this.b) != null) {
            this.c = false;
            c1fVar.g(this.a);
        }
        this.b = null;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        a();
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        if (f != getAlpha()) {
            super.setAlpha(f);
            invalidate();
            c1f c1fVar = this.b;
            if (c1fVar != null) {
                c1fVar.e();
            }
        }
    }
}
