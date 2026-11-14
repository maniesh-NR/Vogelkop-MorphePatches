package com.opera.android.feed;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.c5k;
import defpackage.fx8;
import defpackage.go8;
import defpackage.gvl;
import defpackage.hr5;
import defpackage.hw7;
import defpackage.i4d;
import defpackage.i7f;
import defpackage.ks3;
import defpackage.rp3;
import defpackage.ut3;
import defpackage.xw8;

/* loaded from: classes.dex */
public class FeedScrollView extends NestedScrollView {
    public static final /* synthetic */ int T = 0;
    public final i7f D;
    public int E;
    public int F;
    public int G;
    public i4d H;
    public fx8 I;
    public ut3 J;
    public boolean K;
    public float L;
    public go8 M;
    public final Paint N;
    public final Paint O;
    public final Paint P;
    public int Q;
    public int R;
    public boolean S;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = new i7f();
        this.I = new hr5();
        this.M = go8.d;
        Paint paint = new Paint();
        this.N = paint;
        Paint paint2 = new Paint();
        this.O = paint2;
        Paint paint3 = new Paint();
        this.P = paint3;
        setWillNotDraw(false);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint3.setXfermode(new PorterDuffXfermode(mode));
        ((NestedScrollView) this).z = new hw7(this, (byte) 1);
    }

    public static void G(View view, int[] iArr, int i, ViewGroup viewGroup) {
        if (view != viewGroup) {
            viewGroup.scrollBy(0, i);
            iArr[1] = iArr[1] + i;
        }
    }

    public final void F(ile ileVar) {
        this.D.b(ileVar);
    }

    public final void b(int i, View view) {
        int i2;
        super.b(i, view);
        int i3 = this.Q - 1;
        this.Q = i3;
        if (i == 0 && (i2 = this.R) > 0) {
            this.R = i2 - 1;
        }
        if (i3 == 0) {
            this.I.a(i == 1 ? Float.valueOf(this.L) : null);
        }
    }

    public final boolean canScrollVertically(int i) {
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        if (iComputeVerticalScrollRange == 0) {
            return false;
        }
        return i < 0 ? iComputeVerticalScrollOffset > 0 : iComputeVerticalScrollOffset < iComputeVerticalScrollRange;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.clipRect(0, getScrollY() + this.G, getWidth(), getHeight() + getScrollY());
        try {
            super/*android.view.View*/.dispatchDraw(canvas);
        } catch (NullPointerException unused) {
            if (!this.K) {
                this.K = true;
                ks3.B("dispatchDraw threw NPE", null);
            }
        }
        canvas.restore();
        if (this.M.b.a()) {
            canvas.save();
            canvas.translate(0.0f, getScrollY());
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.M.b.a, this.N);
            canvas2 = canvas;
            float width = getWidth();
            gvl gvlVar = this.M.b;
            canvas2.drawRect(0.0f, 0.0f, width, gvlVar.c + gvlVar.b, this.O);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (this.M.c.a()) {
            rp3 rp3Var = this.M.c;
            int i = rp3Var.a + rp3Var.b;
            canvas2.save();
            canvas2.translate(0.0f, (getHeight() + getScrollY()) - i);
            canvas2.drawRect(0.0f, 0.0f, getWidth(), i, this.P);
            canvas2.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.S = false;
        }
        if (motionEvent.getAction() == 0 && this.M.c.a() && motionEvent.getY() > getHeight() - this.M.c.b) {
            return true;
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        xw8 xw8VarB;
        ((NestedScrollView) this).x.v(i, i2, i3, iArr, null);
        int i4 = i2 - iArr[1];
        boolean z = i4 > 0;
        i4d i4dVar = this.H;
        RecyclerView recyclerView = null;
        if (i4dVar != null && (xw8VarB = ((c5k) i4dVar.b).b()) != null) {
            recyclerView = xw8VarB.g;
        }
        if (z) {
            if (canScrollVertically(1)) {
                G(view, iArr, i4, this);
                return;
            } else {
                if (recyclerView != null) {
                    G(view, iArr, i4, recyclerView);
                    return;
                }
                return;
            }
        }
        if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
            G(view, iArr, i4, recyclerView);
        } else if (canScrollVertically(-1)) {
            G(view, iArr, i4, this);
        }
    }

    public final boolean k(View view, View view2, int i, int i2) {
        i4d i4dVar = this.H;
        if (i4dVar != null) {
            c5k c5kVar = (c5k) i4dVar.b;
            RecyclerView recyclerView = c5kVar.o;
            xw8 xw8VarB = c5kVar.b();
            RecyclerView recyclerView2 = xw8VarB != null ? xw8VarB.g : null;
            if (view2 == recyclerView2 && recyclerView != null) {
                recyclerView.L0();
            } else if (view2 == recyclerView && recyclerView2 != null) {
                recyclerView2.L0();
            }
        }
        if (!super.k(view, view2, i, i2)) {
            return false;
        }
        this.Q++;
        if (i2 == 0) {
            this.R++;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.S = false;
        this.R = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        xw8 xw8VarB;
        super.onLayout(z, i, i2, i3, i4);
        i4d i4dVar = this.H;
        RecyclerView recyclerView = null;
        if (i4dVar != null && (xw8VarB = ((c5k) i4dVar.b).b()) != null) {
            recyclerView = xw8VarB.g;
        }
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return;
        }
        scrollBy(0, computeVerticalScrollRange() - computeVerticalScrollExtent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        View childAt;
        int size = View.MeasureSpec.getSize(i);
        this.F = size;
        ut3 ut3Var = this.J;
        if (ut3Var != null) {
            ut3Var.accept(size);
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.E;
        if (i3 != 0 && i3 != size2 && (childAt = getChildAt(0)) != null) {
            childAt.forceLayout();
        }
        this.E = size2;
        super.onMeasure(i, i2);
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        this.L = f2;
        return ((NestedScrollView) this).x.u(f, f2);
    }

    public final void z(n9n n9nVar) {
    }
}
