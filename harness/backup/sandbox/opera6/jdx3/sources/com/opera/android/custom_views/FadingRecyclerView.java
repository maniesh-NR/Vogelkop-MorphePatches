package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import defpackage.a6n;
import defpackage.dll;
import defpackage.g00;
import defpackage.hjf;
import defpackage.khh;
import defpackage.nij;
import defpackage.pc5;
import defpackage.u8n;
import defpackage.w3a;
import defpackage.z5n;

/* loaded from: classes.dex */
public class FadingRecyclerView extends RecyclerViewForScreenshot implements a6n, nij {
    public static final /* synthetic */ int V0 = 0;
    public final z5n I0;
    public final uuj J0;
    public int K0;
    public float L0;
    public final Paint M0;
    public m9f N0;
    public g00 O0;
    public final boolean P0;
    public final boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public w3a U0;

    /* JADX WARN: Multi-variable type inference failed */
    public FadingRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.G0 = ((RecyclerView) this).M;
        this.K0 = -1;
        Paint paint = new Paint(1);
        this.M0 = paint;
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(2131167213) << 1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(f03.D(getContext()).getDefaultColor());
        pc5 pc5Var = new pc5((Object) this, (byte) 11);
        dll dllVarV = hjf.v(getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, this, pc5Var);
        }
        this.I0 = new z5n(this, context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.U);
        try {
            uuj uujVar = null;
            if (typedArrayObtainStyledAttributes.hasValue(0) || typedArrayObtainStyledAttributes.hasValue(1)) {
                int color = typedArrayObtainStyledAttributes.getColor(0, -16777216);
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 2);
                uuj uujVar2 = new uuj();
                uujVar2.b = this;
                uujVar2.a = dimensionPixelSize;
                Paint paint2 = new Paint();
                uujVar2.c = paint2;
                paint2.setColor(color);
                typedArrayObtainStyledAttributes.recycle();
                uujVar = uujVar2;
            } else {
                typedArrayObtainStyledAttributes.recycle();
            }
            this.J0 = uujVar;
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.m);
            this.P0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
            if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
                this.N0 = new m9f(this);
                this.Q0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                this.S0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            } else {
                this.Q0 = false;
                this.S0 = false;
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Rect N0(View view) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int paddingLeft = (width / 2) + view.getPaddingLeft() + view.getLeft();
        return new Rect(paddingLeft, view.getBottom(), width + paddingLeft, 0);
    }

    @Override // defpackage.nij
    public final void a(g00 g00Var) {
        this.O0 = g00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a6n
    public final void c() {
        if (this.S0) {
            return;
        }
        this.S0 = true;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchDraw(Canvas canvas) {
        super/*android.view.View*/.dispatchDraw(canvas);
        w3a w3aVar = this.U0;
        if (w3aVar != null) {
            w3aVar.setBounds(0, 0, getWidth(), getHeight());
            this.U0.draw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(Canvas canvas) {
        f fVar;
        View viewFindViewByPosition;
        Rect rectN0;
        super.draw(canvas);
        View viewFindViewByPosition2 = null;
        uuj uujVar = this.J0;
        if (uujVar != null) {
            RecyclerView recyclerView = (FadingRecyclerView) uujVar.b;
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft();
            int paddingRight = recyclerView.getPaddingRight();
            int i = uujVar.a;
            int i2 = i / 2;
            int i3 = i % 2 == 0 ? i2 : i2 + 1;
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = recyclerView.getChildAt(i4);
                i4++;
                View childAt2 = i4 < childCount ? recyclerView.getChildAt(i4) : null;
                Object tag = childAt.getTag(2131365026);
                if ((tag != null ? ((Boolean) tag).booleanValue() : false) && childAt2 != null) {
                    Object tag2 = childAt2.getTag(2131365027);
                    if (tag2 != null ? ((Boolean) tag2).booleanValue() : false) {
                        int bottom = childAt.getBottom();
                        canvas.drawRect(paddingLeft, bottom - i2, canvas.getWidth() - paddingRight, bottom + i3, (Paint) uujVar.c);
                    }
                }
            }
        }
        this.I0.a(canvas, this, getLeftFadingEdgeStrength(), getTopFadingEdgeStrength(), getRightFadingEdgeStrength(), getBottomFadingEdgeStrength());
        if (this.P0) {
            float f = this.L0;
            int i5 = this.K0;
            if (i5 == -1 || getChildCount() <= 0 || (viewFindViewByPosition = (fVar = ((RecyclerView) this).n).findViewByPosition(i5)) == null) {
                return;
            }
            if (f != 0.0f) {
                viewFindViewByPosition2 = fVar.findViewByPosition(f > 0.0f ? i5 + 1 : i5 - 1);
            }
            Rect rectN02 = N0(viewFindViewByPosition);
            if (viewFindViewByPosition2 == null) {
                int width = viewFindViewByPosition.getWidth() + rectN02.left;
                rectN0 = new Rect(width, rectN02.top, rectN02.width() + width, 0);
            } else {
                rectN0 = N0(viewFindViewByPosition2);
            }
            float fAbs = Math.abs(f);
            int iO = ((int) cs5.O(rectN02.left, rectN0.left, fAbs)) - (((int) cs5.O(rectN02.width(), rectN0.width(), fAbs)) / 2);
            float fO = (int) cs5.O(rectN02.top, rectN0.top, fAbs);
            canvas.drawLine(iO, fO, iO + r3, fO, this.M0);
        }
    }

    @Override // defpackage.a6n
    public final void f() {
        z5n z5nVar = this.I0;
        if (z5nVar.n) {
            return;
        }
        z5nVar.n = true;
        z5nVar.a.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getBottomFadingEdgeStrength() {
        if (canScrollVertically(1)) {
            return super/*android.view.View*/.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    public final int getHorizontalFadingEdgeLength() {
        return this.I0.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getTopFadingEdgeStrength() {
        if (!(((RecyclerView) this).n instanceof LinearLayoutManager)) {
            return super/*android.view.View*/.getTopFadingEdgeStrength();
        }
        int iComputeVerticalScrollOffset = computeVerticalScrollOffset();
        int i = this.I0.f;
        if (iComputeVerticalScrollOffset < i) {
            return iComputeVerticalScrollOffset / i;
        }
        return 1.0f;
    }

    public final int getVerticalFadingEdgeLength() {
        return this.I0.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a6n
    public final void h(ColorStateList colorStateList) {
        this.I0.r = colorStateList;
        invalidate();
    }

    @Override // com.opera.android.custom_views.RecyclerViewForScreenshot
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9f m9fVar = this.N0;
        if (m9fVar != null) {
            m9fVar.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        m9f m9fVar = this.N0;
        if (m9fVar != null) {
            m9fVar.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.custom_views.RecyclerViewForScreenshot
    public void onMeasure(int i, int i2) {
        m9f m9fVar = this.N0;
        boolean z = this.Q0;
        z5n z5nVar = this.I0;
        boolean z2 = false;
        if (m9fVar == null) {
            if (z) {
                z5nVar.f(false);
            }
            if (this.S0) {
                z5nVar.e(false);
            }
        } else if (View.MeasureSpec.getMode(i) != 0) {
            int iE = this.N0.e();
            boolean z3 = iE > 0;
            this.R0 = true;
            setPadding(iE, getPaddingTop(), iE, getPaddingBottom());
            this.R0 = false;
            z5nVar.f(z && iE > 0);
            if (this.S0 && iE > 0) {
                z2 = true;
            }
            z5nVar.e(z2);
            z2 = z3;
        }
        super.onMeasure(i, i2);
        if (z2 != this.T0) {
            this.T0 = z2;
            g00 g00Var = this.O0;
            if (g00Var != null) {
                g00Var.a(z2);
            }
        }
    }

    public final void requestLayout() {
        if (this.R0) {
            return;
        }
        super.requestLayout();
    }
}
