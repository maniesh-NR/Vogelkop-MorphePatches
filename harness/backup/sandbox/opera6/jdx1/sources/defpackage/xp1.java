package defpackage;

import ads_mobile_sdk.pd;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xp1 extends pp1 implements htd, LayoutInflater.Factory2 {
    public static final hkj g0 = new hkj(0);
    public static final int[] h0 = {R.attr.windowBackground};
    public static final boolean i0 = !"robolectric".equals(Build.FINGERPRINT);
    public ViewGroup A;
    public TextView B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public wp1[] K;
    public wp1 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Configuration Q;
    public final int R;
    public int S;
    public int T;
    public boolean U;
    public tp1 V;
    public tp1 W;
    public boolean X;
    public int Y;
    public boolean a0;
    public Rect b0;
    public Rect c0;
    public er1 d0;
    public OnBackInvokedDispatcher e0;
    public wi f0;
    public final Object j;
    public final Context k;
    public Window l;
    public sp1 m;
    public final kp1 n;
    public gc o;
    public lsk p;
    public CharSequence q;
    public ActionBarOverlayLayout r;
    public u59 s;
    public tw2 t;
    public se u;
    public ActionBarContextView v;
    public PopupWindow w;
    public qp1 x;
    public boolean z;
    public l8n y = null;
    public final qp1 Z = new qp1(this, 0);

    public xp1(Context context, Window window, kp1 kp1Var, Object obj) {
        fp1 fp1Var = null;
        this.R = -100;
        this.k = context;
        this.n = kp1Var;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof fp1)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        fp1Var = (fp1) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (fp1Var != null) {
                this.R = ((xp1) fp1Var.getDelegate()).R;
            }
        }
        if (this.R == -100) {
            String name = this.j.getClass().getName();
            hkj hkjVar = g0;
            Integer num = (Integer) hkjVar.get(name);
            if (num != null) {
                this.R = num.intValue();
                hkjVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        AppCompatDrawableManager.g();
    }

    public static bwc o(Context context) {
        bwc bwcVar;
        bwc bwcVar2;
        if (Build.VERSION.SDK_INT >= 33 || (bwcVar = pp1.c) == null) {
            return null;
        }
        bwc bwcVarA = bwc.a(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        if (bwcVar.a.a.isEmpty()) {
            bwcVar2 = bwc.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < bwcVarA.c() + bwcVar.c()) {
                Locale localeB = i < bwcVar.c() ? bwcVar.b(i) : bwcVarA.b(i - bwcVar.c());
                if (localeB != null) {
                    linkedHashSet.add(localeB);
                }
                i++;
            }
            bwcVar2 = new bwc(new cwc(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return bwcVar2.a.a.isEmpty() ? bwcVarA : bwcVar2;
    }

    public static Configuration t(Context context, int i, bwc bwcVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (bwcVar != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(bwcVar.a.a.toLanguageTags()));
        }
        return configuration2;
    }

    public final wp1 A(int i) {
        wp1[] wp1VarArr = this.K;
        if (wp1VarArr == null || wp1VarArr.length <= i) {
            wp1[] wp1VarArr2 = new wp1[i + 1];
            if (wp1VarArr != null) {
                System.arraycopy(wp1VarArr, 0, wp1VarArr2, 0, wp1VarArr.length);
            }
            this.K = wp1VarArr2;
            wp1VarArr = wp1VarArr2;
        }
        wp1 wp1Var = wp1VarArr[i];
        if (wp1Var != null) {
            return wp1Var;
        }
        wp1 wp1Var2 = new wp1();
        wp1Var2.a = i;
        wp1Var2.n = false;
        wp1VarArr[i] = wp1Var2;
        return wp1Var2;
    }

    public final void B() {
        gc y1oVar;
        w();
        if (this.E && (y1oVar = this.o) == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                y1oVar = new y1o((Activity) obj, this.F);
                this.o = y1oVar;
            } else if (obj instanceof Dialog) {
                y1oVar = new y1o((Dialog) obj);
                this.o = y1oVar;
            }
            if (y1oVar != null) {
                y1oVar.m(this.a0);
            }
        }
    }

    public final void C(int i) {
        this.Y |= 1 << i;
        if (this.X) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = r5n.a;
        decorView.postOnAnimation(this.Z);
        this.X = true;
    }

    public final int D(int i, Context context) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            qp2.n("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        tp1 tp1Var = this.W;
                        if (tp1Var == null) {
                            tp1Var = new tp1(this, context);
                            this.W = tp1Var;
                        }
                        return tp1Var.S();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return z(context).S();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean E() {
        boolean z = this.M;
        this.M = false;
        wp1 wp1VarA = A(0);
        if (!wp1VarA.m) {
            se seVar = this.u;
            if (seVar != null) {
                seVar.a();
                return true;
            }
            B();
            gc gcVar = this.o;
            if (gcVar == null || !gcVar.b()) {
                return false;
            }
        } else if (!z) {
            r(wp1VarA, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x015e, code lost:
    
        if (r6.getCount() > 0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(defpackage.wp1 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.F(wp1, android.view.KeyEvent):void");
    }

    public final boolean G(wp1 wp1Var, int i, KeyEvent keyEvent) {
        itd itdVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((wp1Var.k || H(wp1Var, keyEvent)) && (itdVar = wp1Var.h) != null) {
            return itdVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(defpackage.wp1 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.H(wp1, android.view.KeyEvent):boolean");
    }

    public final void I() {
        if (this.z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.e0 != null && (A(0).m || this.u != null)) {
                z = true;
            }
            wi wiVar = this.f0;
            if (z) {
                if (wiVar == null) {
                    this.f0 = t8.P(this.e0, this);
                }
            } else if (wiVar != null) {
                t8.h0(this.e0, wiVar);
                this.f0 = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    @Override // defpackage.pp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.a(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // defpackage.pp1
    public final void b() {
        if (this.o != null) {
            B();
            if (this.o.g()) {
                return;
            }
            C(0);
        }
    }

    @Override // defpackage.pp1
    public final void d() throws PackageManager.NameNotFoundException {
        String strL;
        this.N = true;
        m(false, true);
        y();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strL = kfo.L(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strL = null;
            }
            if (strL != null) {
                gc gcVar = this.o;
                if (gcVar == null) {
                    this.a0 = true;
                } else {
                    gcVar.m(true);
                }
            }
            synchronized (pp1.h) {
                pp1.f(this);
                pp1.g.add(new WeakReference(this));
            }
        }
        this.Q = new Configuration(this.k.getResources().getConfiguration());
        this.O = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // defpackage.pp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L12
            java.lang.Object r0 = defpackage.pp1.h
            monitor-enter(r0)
            defpackage.pp1.f(r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            goto L12
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
        L10:
            r3 = move-exception
            goto Le
        L12:
            boolean r0 = r3.X
            if (r0 == 0) goto L21
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            qp1 r1 = r3.Z
            r0.removeCallbacks(r1)
        L21:
            r0 = 1
            r3.P = r0
            int r0 = r3.R
            r1 = -100
            if (r0 == r1) goto L4e
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4e
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4e
            hkj r0 = defpackage.xp1.g0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.R
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5d
        L4e:
            hkj r0 = defpackage.xp1.g0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5d:
            gc r0 = r3.o
            if (r0 == 0) goto L64
            r0.i()
        L64:
            tp1 r0 = r3.V
            if (r0 == 0) goto L6b
            r0.L()
        L6b:
            tp1 r3 = r3.W
            if (r3 == 0) goto L72
            r3.L()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.e():void");
    }

    @Override // defpackage.pp1
    public final boolean g(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.I && i == 108) {
            return false;
        }
        if (this.E && i == 1) {
            this.E = false;
        }
        if (i == 1) {
            I();
            this.I = true;
            return true;
        }
        if (i == 2) {
            I();
            this.C = true;
            return true;
        }
        if (i == 5) {
            I();
            this.D = true;
            return true;
        }
        if (i == 10) {
            I();
            this.G = true;
            return true;
        }
        if (i == 108) {
            I();
            this.E = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        I();
        this.F = true;
        return true;
    }

    @Override // defpackage.pp1
    public final void h(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.pp1
    public final void i(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.pp1
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.pp1
    public final void k(CharSequence charSequence) {
        this.q = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.r;
        if (actionBarOverlayLayout == null) {
            gc gcVar = this.o;
            if (gcVar != null) {
                gcVar.t(charSequence);
                return;
            }
            TextView textView = this.B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        actionBarOverlayLayout.h();
        rtl rtlVar = actionBarOverlayLayout.e;
        if (rtlVar.g) {
            return;
        }
        Toolbar toolbar = rtlVar.a;
        rtlVar.h = charSequence;
        if ((rtlVar.b & 8) != 0) {
            toolbar.D(charSequence);
            if (rtlVar.g) {
                r5n.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2  */
    @Override // defpackage.pp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.se l(defpackage.re r9) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.l(re):se");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r17, boolean r18) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.m(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.view.Window r6) {
        /*
            r5 = this;
            android.view.Window r0 = r5.l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L76
            android.view.Window$Callback r0 = r6.getCallback()
            boolean r2 = r0 instanceof defpackage.sp1
            if (r2 != 0) goto L72
            sp1 r1 = new sp1
            r1.<init>(r5, r0)
            r5.m = r1
            r6.setCallback(r1)
            int[] r0 = defpackage.xp1.h0
            android.content.Context r1 = r5.k
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L37
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L37
            androidx.appcompat.widget.AppCompatDrawableManager r4 = androidx.appcompat.widget.AppCompatDrawableManager.a()
            android.graphics.drawable.Drawable r1 = r4.c(r3, r1)
            goto L38
        L37:
            r1 = r2
        L38:
            if (r1 == 0) goto L3d
            r6.setBackgroundDrawable(r1)
        L3d:
            r0.recycle()
            r5.l = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r6 < r0) goto L71
            android.window.OnBackInvokedDispatcher r6 = r5.e0
            if (r6 != 0) goto L71
            if (r6 == 0) goto L57
            wi r0 = r5.f0
            if (r0 == 0) goto L57
            defpackage.t8.h0(r6, r0)
            r5.f0 = r2
        L57:
            java.lang.Object r6 = r5.j
            boolean r0 = r6 instanceof android.app.Activity
            if (r0 == 0) goto L6c
            android.app.Activity r6 = (android.app.Activity) r6
            android.view.Window r0 = r6.getWindow()
            if (r0 == 0) goto L6c
            android.window.OnBackInvokedDispatcher r6 = defpackage.t8.r(r6)
            r5.e0 = r6
            goto L6e
        L6c:
            r5.e0 = r2
        L6e:
            r5.J()
        L71:
            return
        L72:
            qp2.n(r1)
            return
        L76:
            qp2.n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.n(android.view.Window):void");
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return a(str, context, attributeSet);
    }

    public final void p(int i, wp1 wp1Var, itd itdVar) {
        if (itdVar == null) {
            if (wp1Var == null && i >= 0) {
                wp1[] wp1VarArr = this.K;
                if (i < wp1VarArr.length) {
                    wp1Var = wp1VarArr[i];
                }
            }
            if (wp1Var != null) {
                itdVar = wp1Var.h;
            }
        }
        if ((wp1Var == null || wp1Var.m) && !this.P) {
            sp1 sp1Var = this.m;
            Window.Callback callback = this.l.getCallback();
            sp1Var.getClass();
            try {
                sp1Var.e = true;
                callback.onPanelClosed(i, itdVar);
            } finally {
                sp1Var.e = false;
            }
        }
    }

    public final void q(itd itdVar) {
        ne neVar;
        if (this.J) {
            return;
        }
        this.J = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.r;
        actionBarOverlayLayout.h();
        qe qeVar = actionBarOverlayLayout.e.a.a;
        if (qeVar != null && (neVar = qeVar.t) != null) {
            neVar.j();
            le leVar = neVar.p;
            if (leVar != null && leVar.b()) {
                leVar.j.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.P) {
            callback.onPanelClosed(pd.i1, itdVar);
        }
        this.J = false;
    }

    public final void r(wp1 wp1Var, boolean z) {
        vp1 vp1Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && wp1Var.a == 0 && (actionBarOverlayLayout = this.r) != null) {
            actionBarOverlayLayout.h();
            if (actionBarOverlayLayout.e.a.t()) {
                q(wp1Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && wp1Var.m && (vp1Var = wp1Var.e) != null) {
            windowManager.removeView(vp1Var);
            if (z) {
                p(wp1Var.a, wp1Var, null);
            }
        }
        wp1Var.k = false;
        wp1Var.l = false;
        wp1Var.m = false;
        wp1Var.f = null;
        wp1Var.n = true;
        if (this.L == wp1Var) {
            this.L = null;
        }
        if (wp1Var.a == 0) {
            J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // defpackage.htd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.itd r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.r
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lbe
            r6.h()
            rtl r6 = r6.e
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Lbe
            qe r6 = r6.a
            if (r6 == 0) goto Lbe
            boolean r6 = r6.s
            if (r6 == 0) goto Lbe
            android.content.Context r6 = r5.k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L42
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.r
            r6.h()
            rtl r6 = r6.e
            androidx.appcompat.widget.Toolbar r6 = r6.a
            qe r6 = r6.a
            if (r6 == 0) goto Lbe
            ne r6 = r6.t
            if (r6 == 0) goto Lbe
            vr9 r2 = r6.q
            if (r2 != 0) goto L42
            boolean r6 = r6.k()
            if (r6 == 0) goto Lbe
        L42:
            android.view.Window r6 = r5.l
            android.view.Window$Callback r6 = r6.getCallback()
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r5.r
            r2.h()
            rtl r2 = r2.e
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.t()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L7b
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r5.r
            r0.h()
            rtl r0 = r0.e
            androidx.appcompat.widget.Toolbar r0 = r0.a
            qe r0 = r0.a
            if (r0 == 0) goto L6d
            ne r0 = r0.t
            if (r0 == 0) goto L6d
            r0.j()
        L6d:
            boolean r0 = r5.P
            if (r0 != 0) goto Lbd
            wp1 r5 = r5.A(r1)
            itd r5 = r5.h
            r6.onPanelClosed(r3, r5)
            return
        L7b:
            if (r6 == 0) goto Lbd
            boolean r2 = r5.P
            if (r2 != 0) goto Lbd
            boolean r2 = r5.X
            if (r2 == 0) goto L98
            int r2 = r5.Y
            r2 = r2 & r0
            if (r2 == 0) goto L98
            android.view.Window r0 = r5.l
            android.view.View r0 = r0.getDecorView()
            qp1 r2 = r5.Z
            r0.removeCallbacks(r2)
            r2.run()
        L98:
            wp1 r0 = r5.A(r1)
            itd r2 = r0.h
            if (r2 == 0) goto Lbd
            boolean r4 = r0.o
            if (r4 != 0) goto Lbd
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Lbd
            itd r0 = r0.h
            r6.onMenuOpened(r3, r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = r5.r
            r5.h()
            rtl r5 = r5.e
            androidx.appcompat.widget.Toolbar r5 = r5.a
            r5.F()
        Lbd:
            return
        Lbe:
            wp1 r6 = r5.A(r1)
            r6.n = r0
            r5.r(r6, r1)
            r0 = 0
            r5.F(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.s(itd):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.u(android.view.KeyEvent):boolean");
    }

    public final void v(int i) {
        wp1 wp1VarA = A(i);
        if (wp1VarA.h != null) {
            Bundle bundle = new Bundle();
            wp1VarA.h.t(bundle);
            if (bundle.size() > 0) {
                wp1VarA.p = bundle;
            }
            wp1VarA.h.w();
            wp1VarA.h.clear();
        }
        wp1VarA.o = true;
        wp1VarA.n = true;
        if ((i == 108 || i == 0) && this.r != null) {
            wp1 wp1VarA2 = A(0);
            wp1VarA2.k = false;
            H(wp1VarA2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.z) {
            return;
        }
        Context context = this.k;
        int[] iArr = zhh.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            qp2.n("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(pd.i1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(pd.j1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.H = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.I) {
            viewGroup = this.G ? (ViewGroup) layoutInflaterFrom.inflate(2131558422, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(2131558421, (ViewGroup) null);
        } else if (this.H) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(2131558412, (ViewGroup) null);
            this.F = false;
            this.E = false;
        } else if (this.E) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968589, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ft5(context, typedValue.resourceId) : context).inflate(2131558423, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(2131362503);
            this.r = actionBarOverlayLayout;
            Window.Callback callback = this.l.getCallback();
            actionBarOverlayLayout.h();
            actionBarOverlayLayout.e.k = callback;
            if (this.F) {
                this.r.f(pd.j1);
            }
            if (this.C) {
                this.r.f(2);
            }
            if (this.D) {
                this.r.f(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.E);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.F);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.H);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.G);
            sb.append(", windowNoTitle: ");
            qp2.o(z1m.m(sb, this.I, " }"));
            return;
        }
        wth wthVar = new wth(this, (byte) 8);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(viewGroup, wthVar);
        if (this.r == null) {
            this.B = (TextView) viewGroup.findViewById(2131363525);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131361859);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.h = new pjn(this, (byte) 9);
        this.A = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.r;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.h();
                rtl rtlVar = actionBarOverlayLayout2.e;
                if (!rtlVar.g) {
                    Toolbar toolbar = rtlVar.a;
                    rtlVar.h = title;
                    if ((rtlVar.b & 8) != 0) {
                        toolbar.D(title);
                        if (rtlVar.g) {
                            r5n.m(toolbar.getRootView(), title);
                        }
                    }
                }
            } else {
                gc gcVar = this.o;
                if (gcVar != null) {
                    gcVar.t(title);
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        TypedValue typedValue2 = contentFrameLayout2.a;
        if (typedValue2 == null) {
            typedValue2 = new TypedValue();
            contentFrameLayout2.a = typedValue2;
        }
        typedArrayObtainStyledAttributes2.getValue(124, typedValue2);
        TypedValue typedValue3 = contentFrameLayout2.b;
        if (typedValue3 == null) {
            typedValue3 = new TypedValue();
            contentFrameLayout2.b = typedValue3;
        }
        typedArrayObtainStyledAttributes2.getValue(125, typedValue3);
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            TypedValue typedValue4 = contentFrameLayout2.c;
            if (typedValue4 == null) {
                typedValue4 = new TypedValue();
                contentFrameLayout2.c = typedValue4;
            }
            typedArrayObtainStyledAttributes2.getValue(122, typedValue4);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            TypedValue typedValue5 = contentFrameLayout2.d;
            if (typedValue5 == null) {
                typedValue5 = new TypedValue();
                contentFrameLayout2.d = typedValue5;
            }
            typedArrayObtainStyledAttributes2.getValue(123, typedValue5);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            TypedValue typedValue6 = contentFrameLayout2.e;
            if (typedValue6 == null) {
                typedValue6 = new TypedValue();
                contentFrameLayout2.e = typedValue6;
            }
            typedArrayObtainStyledAttributes2.getValue(120, typedValue6);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            TypedValue typedValue7 = contentFrameLayout2.f;
            if (typedValue7 == null) {
                typedValue7 = new TypedValue();
                contentFrameLayout2.f = typedValue7;
            }
            typedArrayObtainStyledAttributes2.getValue(121, typedValue7);
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.z = true;
        wp1 wp1VarA = A(0);
        if (this.P || wp1VarA.h != null) {
            return;
        }
        C(pd.i1);
    }

    @Override // defpackage.htd
    public final boolean x(itd itdVar, MenuItem menuItem) {
        wp1 wp1Var;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.P) {
            itd itdVarK = itdVar.k();
            wp1[] wp1VarArr = this.K;
            int length = wp1VarArr != null ? wp1VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    wp1Var = wp1VarArr[i];
                    if (wp1Var != null && wp1Var.h == itdVarK) {
                        break;
                    }
                    i++;
                } else {
                    wp1Var = null;
                    break;
                }
            }
            if (wp1Var != null) {
                return callback.onMenuItemSelected(wp1Var.a, menuItem);
            }
        }
        return false;
    }

    public final void y() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
            return;
        }
        qp2.n("We have not been given a Window");
    }

    public final k8 z(Context context) {
        tp1 tp1Var = this.V;
        if (tp1Var == null) {
            shf shfVar = shf.d;
            if (shfVar == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                shfVar = new shf();
                shfVar.c = new unk();
                shfVar.a = applicationContext;
                shfVar.b = locationManager;
                shf.d = shfVar;
            }
            tp1Var = new tp1(this, shfVar);
            this.V = tp1Var;
        }
        return tp1Var;
    }
}
