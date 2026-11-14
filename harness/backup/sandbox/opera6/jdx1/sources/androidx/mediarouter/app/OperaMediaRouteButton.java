package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
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
import defpackage.cnf;
import defpackage.cod;
import defpackage.coh;
import defpackage.dhh;
import defpackage.dod;
import defpackage.fr3;
import defpackage.lmd;
import defpackage.n5n;
import defpackage.o0g;
import defpackage.omd;
import defpackage.r16;
import defpackage.r5n;
import defpackage.sgb;
import defpackage.vnd;
import defpackage.ymd;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class OperaMediaRouteButton extends View {
    public static cnf p;
    public static final SparseArray q = new SparseArray(2);
    public static final int[] r = {R.attr.state_checked};
    public static final int[] s = {R.attr.state_checkable};
    public final dod a;
    public final lmd b;
    public vnd c;
    public cnd d;
    public r16 e;
    public boolean f;
    public int g;
    public py8 h;
    public Drawable i;
    public int j;
    public int k;
    public ColorStateList l;
    public final int m;
    public final int n;
    public boolean o;

    public OperaMediaRouteButton(Context context, AttributeSet attributeSet) {
        Drawable.ConstantState constantState;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, o0g.W(context));
        int iY = o0g.Y(2130970333, contextThemeWrapper);
        super(iY != 0 ? new ContextThemeWrapper(contextThemeWrapper, iY) : contextThemeWrapper, attributeSet, 2130970321);
        this.c = vnd.c;
        this.d = cnd.a;
        this.g = 0;
        Context context2 = getContext();
        int[] iArr = dhh.a;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130970321, 0);
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(this, context2, iArr, attributeSet, typedArrayObtainStyledAttributes, 2130970321, 0);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.i = sgb.F(typedArrayObtainStyledAttributes.getResourceId(3, 0), context2);
            return;
        }
        this.a = dod.d(context2);
        this.b = new lmd(this, (byte) 7);
        if (p == null) {
            p = new cnf(context2.getApplicationContext());
        }
        this.l = typedArrayObtainStyledAttributes.getColorStateList(4);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.j = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i = this.j;
        SparseArray sparseArray = q;
        if (i != 0 && (constantState = (Drawable.ConstantState) sparseArray.get(i)) != null) {
            Drawable drawableNewDrawable = constantState.newDrawable();
            this.j = 0;
            d(drawableNewDrawable);
        }
        if (this.i == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) sparseArray.get(resourceId);
                if (constantState2 != null) {
                    d(constantState2.newDrawable());
                } else {
                    py8 py8Var = new py8(this, resourceId, getContext(), (byte) 2);
                    this.h = py8Var;
                    py8Var.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        i();
        setClickable(true);
    }

    public final void a() {
        if (this.j > 0) {
            py8 py8Var = this.h;
            if (py8Var != null) {
                py8Var.cancel(false);
            }
            py8 py8Var2 = new py8(this, this.j, getContext(), (byte) 2);
            this.h = py8Var2;
            this.j = 0;
            py8Var2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        boolean z;
        this.a.getClass();
        cod codVarG = dod.g();
        int i = (!codVarG.d() && codVarG.c.equals(fr3.i) && codVarG.h(this.c)) ? codVarG.i : 0;
        if (this.k != i) {
            this.k = i;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
        if (this.f) {
            setEnabled(f() || dod.i(this.c, 1));
        }
        Drawable drawable = this.i;
        if (drawable == null || !(drawable.getCurrent() instanceof AnimationDrawable)) {
            return;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) this.i.getCurrent();
        if (this.f) {
            if ((z || i == 1) && !animationDrawable.isRunning()) {
                animationDrawable.start();
                return;
            }
            return;
        }
        if (i == 2) {
            if (animationDrawable.isRunning()) {
                animationDrawable.stop();
            }
            animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
        }
    }

    public final void c() {
        super.setVisibility((this.g != 0 || f() || p.b) ? this.g : 4);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public final void d(Drawable drawable) {
        Drawable drawable2;
        py8 py8Var = this.h;
        if (py8Var != null) {
            py8Var.cancel(false);
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.i);
        }
        if (drawable != null) {
            if (this.l != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.l);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.i = drawable;
        refreshDrawableState();
        if (this.f && (drawable2 = this.i) != null && (drawable2.getCurrent() instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) this.i.getCurrent();
            int i = this.k;
            if (i == 1) {
                if (animationDrawable.isRunning()) {
                    return;
                }
                animationDrawable.start();
            } else if (i == 2) {
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
                animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
            }
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.i != null) {
            this.i.setState(getDrawableState());
            invalidate();
        }
    }

    public final void e(vnd vndVar) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            return;
        }
        if (this.c.equals(vndVar)) {
            return;
        }
        if (this.f) {
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

    public final boolean f() {
        if (this.e == null) {
            return false;
        }
        getContext();
        if (!ipe.G()) {
            return false;
        }
        r16 r16Var = this.e;
        Context context = getContext();
        r16Var.getClass();
        return !fr3.Q(context, "android.permission.ACCESS_LOCAL_NETWORK");
    }

    public final boolean g() {
        if (!this.f) {
            return false;
        }
        if (this.e != null) {
            getContext();
            if (ipe.G()) {
                r16 r16Var = this.e;
                Context context = getContext();
                r16Var.getClass();
                if (!fr3.Q(context, "android.permission.ACCESS_LOCAL_NETWORK")) {
                    r16 r16Var2 = this.e;
                    Context context2 = getContext();
                    vdf vdfVar = new vdf(this, (byte) 8);
                    r16Var2.getClass();
                    dx3 dx3VarP = q9n.p(context2);
                    if (dx3VarP == null) {
                        vdfVar.run();
                        return true;
                    }
                    f03.U(dx3VarP.j, "android.permission.ACCESS_LOCAL_NETWORK", new aha(vdfVar, (byte) 1));
                    return true;
                }
            }
        }
        this.a.getClass();
        dod.b();
        god godVar = dod.c().v;
        if (godVar == null) {
            return h();
        }
        if (godVar.c) {
            if ((dod.c != null ? dod.c().i() : false) && coh.l(getContext())) {
                return true;
            }
        }
        return h();
    }

    public final boolean h() {
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
        cod codVarG = dod.g();
        if (!codVarG.d() && codVarG.c.equals(fr3.i) && codVarG.h(this.c)) {
            if (supportFragmentManager.F("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
                ymd ymdVarB = this.d.b();
                ymdVarB.h0(this.c);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(0, ymdVarB, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                aVar.i(true, true);
                return true;
            }
        } else if (supportFragmentManager.F("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
            omd omdVarA = this.d.a();
            omdVarA.i0(this.c);
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.e(0, omdVarA, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
            aVar2.i(true, true);
            return true;
        }
        return false;
    }

    public final void i() {
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
        Drawable drawable = this.i;
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
        this.f = true;
        if (!this.c.d()) {
            this.a.a(this.c, this.b, 0);
        }
        b();
        cnf cnfVar = p;
        ArrayList arrayList = (ArrayList) cnfVar.d;
        if (arrayList.size() == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            ((Context) cnfVar.c).registerReceiver(cnfVar, intentFilter);
        }
        arrayList.add(this);
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a != null) {
            dod.b();
            god godVar = dod.c().v;
            if (!(godVar != null ? godVar.f.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false)) {
                int i2 = this.k;
                if (i2 == 1) {
                    View.mergeDrawableStates(iArrOnCreateDrawableState, s);
                    return iArrOnCreateDrawableState;
                }
                if (i2 == 2) {
                    View.mergeDrawableStates(iArrOnCreateDrawableState, r);
                    return iArrOnCreateDrawableState;
                }
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f = false;
            if (!this.c.d()) {
                this.a.j(this.b);
            }
            cnf cnfVar = p;
            ArrayList arrayList = (ArrayList) cnfVar.d;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                ((Context) cnfVar.c).unregisterReceiver(cnfVar);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.i.getIntrinsicWidth();
            int intrinsicHeight = this.i.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.i.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.i.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.i;
        int paddingBottom = 0;
        if (drawable != null) {
            paddingRight = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            paddingRight = 0;
        }
        int iMax = Math.max(this.m, paddingRight);
        Drawable drawable2 = this.i;
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
        return g() || zPerformClick;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.g = i;
        c();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i;
    }
}
