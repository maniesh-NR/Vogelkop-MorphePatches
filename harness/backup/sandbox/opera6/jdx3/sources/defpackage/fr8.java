package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class fr8 extends TextView {
    public final gjf a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Rect e;
    public int f;
    public int g;
    public vr8 h;
    public o8f i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public ds8 n;
    public int o;
    public Drawable p;
    public final zu4 q;
    public final Rect r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [android.graphics.drawable.Drawable, zu4] */
    public fr8(Context context, tta ttaVar, vr8 vr8Var) throws Resources.NotFoundException {
        super(context);
        this.l = true;
        this.a = gjf.a(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970235});
        this.b = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        xf8.r0(this, 2132083336);
        int i = ttaVar.a;
        int i2 = ttaVar.g;
        this.c = i;
        if (this.g != i) {
            this.g = i;
            invalidate();
        }
        int i3 = ttaVar.e;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165721);
        setPadding(0, dimensionPixelSize, 0, 0);
        int i4 = ttaVar.c;
        this.r = new Rect(0, 0, i4, this.g + (dimensionPixelSize << 1));
        int i5 = this.g;
        this.d = new Rect(0, 0, i5, i5);
        int i6 = this.g;
        int i7 = ((int) ((i6 / 2.4d) + 2.0d)) / 2;
        int i8 = i6 / 8;
        int i9 = cs5.L(this) == 1 ? i8 : this.g - i8;
        int i10 = this.g - i8;
        this.e = new Rect(i9 - i7, i10 - i7, i9 + i7, i10 + i7);
        setMaxLines(i2);
        setLines(i2);
        if (i2 == 1) {
            setSingleLine();
        }
        this.h = vr8Var;
        setHorizontallyScrolling(false);
        setTextSize(0, ttaVar.d);
        setEllipsize(TextUtils.TruncateAt.END);
        setCompoundDrawablePadding(i3);
        setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new hc(this), (Drawable) null, (Drawable) null);
        setTextAlignment(4);
        setLayoutParams(new ViewGroup.LayoutParams(i4, getPaddingBottom() + getLineHeight() + getPaddingTop() + this.g + i3 + ttaVar.f));
        pc5 pc5Var = new pc5((Object) this, (byte) 14);
        dll dllVarS = q9n.s(this);
        if (dllVarS != null) {
            u8n.b(dllVarS, this, pc5Var);
        }
        pc5Var.a(this);
        Context context2 = getContext();
        setForeground(new uf9(context2, null, fan.a(4.0f, context2.getResources()), 2130969721));
        ?? zu4Var = new zu4(sgb.F(2131233220, getContext()));
        this.q = zu4Var;
        setBackground(zu4Var);
    }

    public void b(vr8 vr8Var, boolean z) {
        if (this.b == 2) {
            invalidate();
        }
        vr8Var.b.a(this);
        this.f = vr8Var.d.a(getContext());
        setTextColor(vr8Var.a.a(getContext()));
    }

    public boolean d() {
        return true;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o8f o8fVar = this.i;
        if (o8fVar != null) {
            o8fVar.run(this);
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public final d03 e() {
        gjf gjfVar = this.a;
        int i = this.b;
        ecd ecdVar = new ecd(gjfVar, i);
        ecdVar.setTint(this.h.e.a(getContext()));
        ecd ecdVar2 = new ecd(gjfVar, i);
        int i2 = d03.e;
        return ydp.s(ecdVar, this, ecdVar2);
    }

    public final void f() {
        performClick();
    }

    public void g(Canvas canvas) {
        ColorStateList textColors = getTextColors();
        setTextColor(0);
        int shadowColor = getShadowColor();
        setShadowLayer(getShadowRadius(), getShadowDx(), getShadowDy(), 0);
        draw(canvas);
        setTextColor(textColors);
        setShadowLayer(getShadowRadius(), getShadowDx(), getShadowDy(), shadowColor);
    }

    public View getView() {
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean hasOverlappingRendering() {
        return true;
    }

    public final void i(Rect rect) {
        int iD = z1m.d((getWidth() - getPaddingLeft()) - getPaddingRight(), this.g, 2, getPaddingLeft());
        int paddingTop = getPaddingTop();
        int i = this.g;
        rect.set(iD, paddingTop, iD + i, i + paddingTop);
    }

    public int k() {
        return this.c;
    }

    public final void l() {
        if (this.m) {
            return;
        }
        this.m = true;
        ds8 ds8Var = this.n;
        if (ds8Var != null) {
            ds8Var.run();
            this.n = null;
        }
    }

    public abstract void n(Canvas canvas, Rect rect);

    public void o() {
        b(this.h, false);
        if (this.o != 0) {
            this.p = sgb.F(this.o, getContext());
        }
        invalidate();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.g;
        int i2 = this.c;
        if (i == i2) {
            return;
        }
        this.g = i2;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i5 = this.g;
            int i6 = this.c;
            if (i5 != i6) {
                this.g = i6;
                invalidate();
            }
            q(false);
        }
    }

    public final void p(vr8 vr8Var) {
        if (vr8Var.equals(this.h)) {
            return;
        }
        boolean z = this.h.k != vr8Var.k;
        this.h = vr8Var;
        b(vr8Var, z);
        invalidate();
    }

    public void q(boolean z) {
    }

    public void s() {
        setText(" ");
    }
}
