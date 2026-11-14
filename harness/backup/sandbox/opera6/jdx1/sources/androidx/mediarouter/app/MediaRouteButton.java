package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import defpackage.cnd;
import defpackage.cod;
import defpackage.coh;
import defpackage.dhh;
import defpackage.dod;
import defpackage.lmd;
import defpackage.n5n;
import defpackage.o0g;
import defpackage.omd;
import defpackage.r5n;
import defpackage.sgb;
import defpackage.vnd;
import defpackage.ymd;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MediaRouteButton extends View {
    public static final SparseArray p = new SparseArray(2);
    public static final int[] q = {R.attr.state_checked};
    public static final int[] r = {R.attr.state_checkable};
    public final dod a;
    public final lmd b;
    public vnd c;
    public cnd d;
    public boolean e;
    public boolean f;
    public py8 g;
    public Drawable h;
    public int i;
    public int j;
    public int k;
    public final ColorStateList l;
    public final int m;
    public final int n;
    public boolean o;

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, o0g.W(context));
        int iY = o0g.Y(2130970333, contextThemeWrapper);
        super(iY != 0 ? new ContextThemeWrapper(contextThemeWrapper, iY) : contextThemeWrapper, attributeSet, 2130970321);
        this.c = vnd.c;
        this.d = cnd.a;
        Context context2 = getContext();
        int[] iArr = dhh.a;
        byte b = 0;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130970321, 0);
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(this, context2, iArr, attributeSet, typedArrayObtainStyledAttributes, 2130970321, 0);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.h = sgb.F(typedArrayObtainStyledAttributes.getResourceId(3, 0), context2);
            return;
        }
        this.a = dod.d(context2);
        this.b = new lmd(this, b);
        cod codVarG = dod.g();
        int i = !codVarG.d() ? codVarG.i : 0;
        this.k = i;
        this.j = i;
        this.l = typedArrayObtainStyledAttributes.getColorStateList(4);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i2 = this.i;
        SparseArray sparseArray = p;
        if (i2 != 0 && (constantState = (Drawable.ConstantState) sparseArray.get(i2)) != null) {
            Drawable drawableNewDrawable = constantState.newDrawable();
            this.i = 0;
            c(drawableNewDrawable);
        }
        if (this.h == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) sparseArray.get(resourceId);
                if (constantState2 != null) {
                    c(constantState2.newDrawable());
                } else {
                    py8 py8Var = new py8(this, resourceId, getContext(), (byte) 1);
                    this.g = py8Var;
                    py8Var.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        g();
        setClickable(true);
    }

    public final void a() {
        if (this.i > 0) {
            py8 py8Var = this.g;
            if (py8Var != null) {
                py8Var.cancel(false);
            }
            py8 py8Var2 = new py8(this, this.i, getContext(), (byte) 1);
            this.g = py8Var2;
            this.i = 0;
            py8Var2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.a.getClass();
        cod codVarG = dod.g();
        int i = !codVarG.d() ? codVarG.i : 0;
        if (this.k != i) {
            this.k = i;
            g();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
    }

    public final void c(Drawable drawable) {
        py8 py8Var = this.g;
        if (py8Var != null) {
            py8Var.cancel(false);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.h);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.l;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                drawable.setTintList(colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.h = drawable;
        refreshDrawableState();
    }

    public final void d(vnd vndVar) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return;
        }
        if (this.c.equals(vndVar)) {
            return;
        }
        if (this.e) {
            boolean zD = this.c.d();
            lmd lmdVar = this.b;
            dod dodVar = this.a;
            if (!zD) {
                dodVar.j(lmdVar);
            }
            if (!vndVar.d()) {
                dodVar.a(vndVar, lmdVar, 0);
            }
        }
        this.c = vndVar;
        b();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.h != null) {
            this.h.setState(getDrawableState());
            if (this.h.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.h.getCurrent();
                int i = this.k;
                if (i == 1 || this.j != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.j = this.k;
    }

    public final boolean e() {
        if (!this.e) {
            return false;
        }
        this.a.getClass();
        dod.b();
        god godVar = dod.c().v;
        if (godVar == null) {
            return f();
        }
        if (godVar.c) {
            if ((dod.c != null ? dod.c().i() : false) && coh.l(getContext())) {
                return true;
            }
        }
        return f();
    }

    public final boolean f() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        w supportFragmentManager = activity instanceof r ? ((r) activity).getSupportFragmentManager() : null;
        if (supportFragmentManager == null) {
            qp2.n("The activity must be a subclass of FragmentActivity");
            return false;
        }
        this.a.getClass();
        if (dod.g().d()) {
            if (supportFragmentManager.F("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
                this.d.getClass();
                omd omdVar = new omd();
                omdVar.i0(this.c);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(0, omdVar, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                aVar.i(true, true);
                return true;
            }
        } else if (supportFragmentManager.F("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
            this.d.getClass();
            ymd ymdVar = new ymd();
            ymdVar.h0(this.c);
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.e(0, ymdVar, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
            aVar2.i(true, true);
            return true;
        }
        return false;
    }

    public final void g() {
        int i = this.k;
        String string = getContext().getString(i != 1 ? i != 2 ? 2132019819 : 2132019817 : 2132019818);
        setContentDescription(string);
        if (!this.o || TextUtils.isEmpty(string)) {
            string = null;
        }
        setTooltipText(string);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.e = true;
        if (!this.c.d()) {
            this.a.a(this.c, this.b, 0);
        }
        b();
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a != null && !this.f) {
            int i2 = this.k;
            if (i2 == 1) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, r);
                return iArrOnCreateDrawableState;
            }
            if (i2 == 2) {
                View.mergeDrawableStates(iArrOnCreateDrawableState, q);
                return iArrOnCreateDrawableState;
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.e = false;
            if (!this.c.d()) {
                this.a.j(this.b);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.h.getIntrinsicWidth();
            int intrinsicHeight = this.h.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.h.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.h.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.h;
        int paddingBottom = 0;
        if (drawable != null) {
            paddingRight = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            paddingRight = 0;
        }
        int iMax = Math.max(this.m, paddingRight);
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int iMax2 = Math.max(this.n, paddingBottom);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        a();
        return e() || zPerformClick;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h;
    }
}
