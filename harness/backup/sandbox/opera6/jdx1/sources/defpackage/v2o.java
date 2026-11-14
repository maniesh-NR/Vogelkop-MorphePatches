package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class v2o extends d3o {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public r9b[] d;
    public r9b e;
    public g3o f;
    public r9b g;
    public int h;
    public mb7 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public v2o(g3o g3oVar, WindowInsets windowInsets) {
        super(g3oVar);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    public v2o(g3o g3oVar, v2o v2oVar) {
        this(g3oVar, new WindowInsets(v2oVar.c));
    }

    private mb7 C(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return mb7.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        t8i t8iVarT = m41.t(display, 0);
        t8i t8iVarT2 = m41.t(display, 1);
        t8i t8iVarT3 = m41.t(display, 2);
        t8i t8iVarT4 = m41.t(display, 3);
        return mb7.a(point.x, point.y, false, t8iVarT != null ? t8iVarT.b : 0, t8iVarT2 != null ? t8iVarT2.b : 0, t8iVarT3 != null ? t8iVarT3.b : 0, t8iVarT4 != null ? t8iVarT4.b : 0);
    }

    private static List<Rect> D(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[n1h.i(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] E(r9b r9bVar) {
        ArrayList arrayList = new ArrayList();
        int i = r9bVar.a;
        int i2 = r9bVar.d;
        int i3 = r9bVar.c;
        int i4 = r9bVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, r9bVar.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    private r9b F(int i, boolean z) {
        r9b r9bVarA = r9b.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                r9bVarA = r9b.a(r9bVarA, G(i2, z));
            }
        }
        return r9bVarA;
    }

    private r9b H() {
        g3o g3oVar = this.f;
        return g3oVar != null ? g3oVar.a.l() : r9b.e;
    }

    private r9b I(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            yt7.k("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            K();
        }
        Method method = o;
        if (method != null && p != null && q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) q.get(r.get(objInvoke));
                    if (rect != null) {
                        return r9b.c(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void K() throws ClassNotFoundException, SecurityException {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        n = true;
    }

    public static boolean L(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.d3o
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.d3o
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public r9b G(int i, boolean z) {
        r9b r9bVarL;
        int i2;
        r9b r9bVar = r9b.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    r9b[] r9bVarArr = this.d;
                    r9bVarL = r9bVarArr != null ? r9bVarArr[n1h.i(8)] : null;
                    if (r9bVarL != null) {
                        return r9bVarL;
                    }
                    r9b r9bVarN = n();
                    r9b r9bVarH = H();
                    int i3 = r9bVarN.d;
                    if (i3 > r9bVarH.d) {
                        return r9b.c(0, 0, 0, i3);
                    }
                    r9b r9bVar2 = this.g;
                    if (r9bVar2 != null && !r9bVar2.equals(r9bVar) && (i2 = this.g.d) > r9bVarH.d) {
                        return r9b.c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        g3o g3oVar = this.f;
                        jb7 jb7VarH = g3oVar != null ? g3oVar.a.h() : h();
                        if (jb7VarH != null) {
                            DisplayCutout displayCutout = jb7VarH.a;
                            return r9b.c(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z) {
                    r9b r9bVarH2 = H();
                    r9b r9bVarL2 = l();
                    return r9b.c(Math.max(r9bVarH2.a, r9bVarL2.a), 0, Math.max(r9bVarH2.c, r9bVarL2.c), Math.max(r9bVarH2.d, r9bVarL2.d));
                }
                if ((this.h & 2) == 0) {
                    r9b r9bVarN2 = n();
                    g3o g3oVar2 = this.f;
                    r9bVarL = g3oVar2 != null ? g3oVar2.a.l() : null;
                    int iMin = r9bVarN2.d;
                    if (r9bVarL != null) {
                        iMin = Math.min(iMin, r9bVarL.d);
                    }
                    return r9b.c(r9bVarN2.a, 0, r9bVarN2.c, iMin);
                }
            }
        } else {
            if (z) {
                return r9b.c(0, Math.max(H().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return r9b.c(0, n().b, 0, 0);
            }
        }
        return r9bVar;
    }

    public boolean J(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !G(i, false).equals(r9b.e);
    }

    @Override // defpackage.d3o
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.k = view.getWidth();
        this.j = view.getHeight();
        r9b r9bVarI = I(view);
        if (r9bVarI == null) {
            r9bVarI = r9b.e;
        }
        x(r9bVarI);
    }

    @Override // defpackage.d3o
    public void e(g3o g3oVar) {
        g3oVar.a.y(this.f);
        r9b r9bVar = this.g;
        d3o d3oVar = g3oVar.a;
        d3oVar.x(r9bVar);
        d3oVar.z(this.h);
        d3oVar.v(this.i);
        d3oVar.A(this.l);
        d3oVar.B(this.m);
    }

    @Override // defpackage.d3o
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        v2o v2oVar = (v2o) obj;
        return Objects.equals(this.g, v2oVar.g) && L(this.h, v2oVar.h);
    }

    @Override // defpackage.d3o
    public List<Rect> f(int i) {
        return D(this.l, i);
    }

    @Override // defpackage.d3o
    public List<Rect> g(int i) {
        return D(this.m, i);
    }

    @Override // defpackage.d3o
    public r9b i(int i) {
        return F(i, false);
    }

    @Override // defpackage.d3o
    public r9b j(int i) {
        return F(i, true);
    }

    @Override // defpackage.d3o
    public final r9b n() {
        r9b r9bVar = this.e;
        if (r9bVar != null) {
            return r9bVar;
        }
        WindowInsets windowInsets = this.c;
        r9b r9bVarC = r9b.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = r9bVarC;
        return r9bVarC;
    }

    @Override // defpackage.d3o
    public void p(View view) {
        this.i = C(view);
    }

    @Override // defpackage.d3o
    @SuppressLint({"WrongConstant"})
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int i2 = n1h.i(i);
            this.l[i2] = E(i(i));
            if (i != 8) {
                this.m[i2] = E(j(i));
            }
        }
    }

    @Override // defpackage.d3o
    public g3o r(int i, int i2, int i3, int i4) {
        g3o g3oVarG = g3o.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        u2o t2oVar = i5 >= 36 ? new t2o(g3oVarG) : i5 >= 35 ? new s2o(g3oVarG) : i5 >= 34 ? new r2o(g3oVarG) : i5 >= 31 ? new q2o(g3oVarG) : i5 >= 30 ? new p2o(g3oVarG) : new o2o(g3oVarG);
        t2oVar.h(g3o.e(n(), i, i2, i3, i4));
        t2oVar.f(g3o.e(l(), i, i2, i3, i4));
        return t2oVar.b();
    }

    @Override // defpackage.d3o
    public boolean t() {
        return this.c.isRound();
    }

    @Override // defpackage.d3o
    @SuppressLint({"WrongConstant"})
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !J(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.d3o
    public void v(mb7 mb7Var) {
        this.i = mb7Var;
    }

    @Override // defpackage.d3o
    public void w(r9b[] r9bVarArr) {
        this.d = r9bVarArr;
    }

    @Override // defpackage.d3o
    public void x(r9b r9bVar) {
        this.g = r9bVar;
    }

    @Override // defpackage.d3o
    public void y(g3o g3oVar) {
        this.f = g3oVar;
    }

    @Override // defpackage.d3o
    public void z(int i) {
        this.h = i;
    }
}
