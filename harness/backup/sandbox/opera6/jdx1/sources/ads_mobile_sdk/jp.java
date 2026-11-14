package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import defpackage.c26;
import defpackage.cs5;
import defpackage.fdp;
import defpackage.gdp;
import defpackage.hkm;
import defpackage.mip;
import defpackage.qlo;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class jp implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, qlo, fdp {
    public static final long p;
    public final Context a;
    public final nx5 b;
    public final gdp c;
    public final kj0 d;
    public final mip e;
    public final qr0 f;
    public final av2 g;
    public final g0 h;
    public View i;
    public boolean j;
    public WeakReference k = new WeakReference(null);
    public int l = -1;
    public long m;
    public Boolean n;
    public fp o;

    static {
        on7 on7Var = pn7.b;
        p = cs5.x0(200, un7.d);
    }

    public jp(Context context, nx5 nx5Var, gdp gdpVar, kj0 kj0Var, mip mipVar, qr0 qr0Var, av2 av2Var, g0 g0Var, a2 a2Var) {
        this.a = context;
        this.b = nx5Var;
        this.c = gdpVar;
        this.d = kj0Var;
        this.e = mipVar;
        this.f = qr0Var;
        this.g = av2Var;
        this.h = g0Var;
        this.j = kj0Var.a(av2Var, a2Var);
        pn7.b.getClass();
        this.m = 0L;
    }

    public static final Object a(jp jpVar, pn3 pn3Var, kuk kukVar) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Resources resources;
        qr0 qr0Var = jpVar.f;
        kj0 kj0Var = jpVar.d;
        Rect rect = new Rect();
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = null;
        boolean z = true;
        try {
            View view = jpVar.i;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            int i = iArr[0];
            rect.left = i;
            rect.top = iArr[1];
            View view2 = jpVar.i;
            if (view2 != null) {
                rect.right = i + view2.getWidth();
                rect.bottom = rect.top + view2.getHeight();
            }
        } catch (Exception e) {
            vr3 vr3Var = xu0.a;
            xu0.c("Failed to get view location: " + e.getMessage(), null);
        }
        Rect rect2 = new Rect();
        WindowManager windowManagerB = kj0Var.b(jpVar.a);
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManagerB.getCurrentWindowMetrics();
            rect2.right = currentWindowMetrics.getBounds().width();
            rect2.bottom = currentWindowMetrics.getBounds().height();
        } else {
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            windowManagerB.getDefaultDisplay().getMetrics(displayMetrics2);
            rect2.right = displayMetrics2.widthPixels;
            rect2.bottom = displayMetrics2.heightPixels;
        }
        Rect rect3 = new Rect();
        View view3 = jpVar.i;
        if (view3 != null && (resources = view3.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        if (displayMetrics == null) {
            displayMetrics = new DisplayMetrics();
        }
        rect3.right = displayMetrics.widthPixels + 1;
        rect3.bottom = displayMetrics.heightPixels + 1;
        Rect rect4 = new Rect();
        View view4 = jpVar.i;
        boolean globalVisibleRect = view4 != null ? view4.getGlobalVisibleRect(rect4) : false;
        Rect rect5 = new Rect();
        View view5 = jpVar.i;
        boolean localVisibleRect = view5 != null ? view5.getLocalVisibleRect(rect5) : false;
        Rect rect6 = new Rect();
        View view6 = jpVar.i;
        if (view6 != null) {
            view6.getHitRect(rect6);
        }
        View view7 = jpVar.i;
        int windowVisibility = view7 != null ? view7.getWindowVisibility() : 8;
        int i2 = jpVar.l;
        if (i2 == -1) {
            i2 = windowVisibility;
        }
        View view8 = jpVar.i;
        boolean zA = view8 != null ? kj0Var.a(view8, jpVar.j) : false;
        boolean z2 = jpVar.g == av2.l && !Rect.intersects(rect, rect3);
        if (!qr0Var.B0() ? !zA || z2 : !zA || ((jpVar.l != -1 && i2 != 0) || z2)) {
            z = false;
        }
        int i3 = qr0Var.B0() ? i2 : windowVisibility;
        View view9 = jpVar.i;
        Rect rect7 = (view9 == null || (context4 = view9.getContext()) == null) ? new Rect() : ioh.f(context4, rect);
        View view10 = jpVar.i;
        boolean zIsAttachedToWindow = view10 != null ? view10.isAttachedToWindow() : false;
        View view11 = jpVar.i;
        Rect rect8 = (view11 == null || (context3 = view11.getContext()) == null) ? new Rect() : ioh.f(context3, rect2);
        View view12 = jpVar.i;
        Rect rect9 = (view12 == null || (context2 = view12.getContext()) == null) ? new Rect() : ioh.f(context2, rect4);
        View view13 = jpVar.i;
        boolean z3 = z;
        nn3 nn3Var = new nn3(pn3Var, z3, i3, rect7, zIsAttachedToWindow, rect8, rect9, globalVisibleRect, (view13 == null || (context = view13.getContext()) == null) ? new Rect() : ioh.f(context, rect5), localVisibleRect, rect6);
        on7 on7Var = pn7.b;
        jpVar.e.getClass();
        long jY0 = cs5.y0(SystemClock.elapsedRealtime(), un7.d);
        if (pn3Var == pn3.c && Boolean.valueOf(z3).equals(jpVar.n) && pn7.c(jY0, pn7.m(jpVar.m, p)) < 0) {
            return Unit.a;
        }
        jpVar.n = Boolean.valueOf(z3);
        jpVar.m = jY0;
        Object objC = jpVar.c.c(nn3Var, kukVar);
        return objC != px5.a ? Unit.a : objC;
    }

    public final void a(Activity activity, int i) {
        Window window;
        View viewPeekDecorView;
        View view = this.i;
        if (view == null || (window = activity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null || !Intrinsics.a(view.getRootView(), viewPeekDecorView.getRootView())) {
            return;
        }
        this.l = i;
    }

    public final void a(View view) {
        view.addOnAttachStateChangeListener(this);
        WeakReference weakReference = new WeakReference(this);
        g0 g0Var = this.h;
        fp fpVar = new fp(weakReference, g0Var);
        this.o = fpVar;
        Set setSingleton = Collections.singleton(fpVar);
        g0Var.getClass();
        synchronized (g0Var) {
            g0Var.h.addAll(setSingleton);
        }
        if (view.isAttachedToWindow()) {
            b(view);
        } else {
            b(pn3.b);
        }
    }

    @Override // defpackage.qlo
    public final Object b(long j, kuk kukVar) {
        if (this.f.B0()) {
            return Unit.a;
        }
        b(pn3.d);
        return Unit.a;
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.k.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            try {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                viewTreeObserver.removeOnScrollChangedListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.k = new WeakReference(null);
        if (this.f.B0()) {
            g0 g0Var = this.h;
            g0Var.getClass();
            synchronized (g0Var) {
                Iterator it = g0Var.i.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    if (weakReference.get() == null || Intrinsics.a(weakReference.get(), this)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void b(pn3 pn3Var) {
        mt5 mt5Var = null;
        c26.K(new hkm(this, pn3Var, mt5Var, (byte) 14));
        pn3 pn3Var2 = pn3.c;
        nx5 nx5Var = this.b;
        if (pn3Var == pn3Var2) {
            defpackage.na2.B(nx5Var, null, null, new hp(this, mt5Var, (byte) 0), 3);
        } else {
            defpackage.na2.B(nx5Var, null, null, new hp(this, mt5Var, (byte) 1), 3);
        }
    }

    public final void b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.k = new WeakReference(viewTreeObserver);
            try {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        if (this.f.B0()) {
            g0 g0Var = this.h;
            g0Var.getClass();
            synchronized (g0Var) {
                g0Var.i.add(new WeakReference(this));
            }
        }
    }

    @Override // defpackage.qlo
    public final Object d(long j, kuk kukVar) {
        if (this.f.B0()) {
            return Unit.a;
        }
        b(pn3.d);
        return Unit.a;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        b(pn3.a);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        b(pn3.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.l = -1;
        b(view);
        b(pn3.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l = -1;
        b(pn3.b);
        b();
    }
}
