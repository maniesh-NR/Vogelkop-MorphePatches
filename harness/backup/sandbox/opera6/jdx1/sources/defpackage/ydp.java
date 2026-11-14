package defpackage;

import J.N;
import ads_mobile_sdk.q9;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.opera.android.browser.chromium.OperaBrowserContext;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class ydp implements zl2, j0n, hyd, kkk, f45, dr3, g, qro, f94, ltm, w62, z62, u24 {
    public static final ydp b = new ydp(1);
    public static final ydp c = new ydp(2);
    public static final ydp d = new ydp(3);
    public static final ydp e = new ydp(4);
    public static final ydp f = new ydp(5);
    public static final ydp g = new ydp(6);
    public static final ydp h = new ydp(7);
    public static final ydp i = new ydp(8);
    public static final ydp j = new ydp(9);
    public static final ydp k = new ydp(10);
    public static final ydp l = new ydp(11);
    public static final ydp m = new ydp(12);
    public static final ydp n = new ydp(13);
    public final /* synthetic */ byte a;

    public /* synthetic */ ydp(byte b2) {
        this.a = b2;
    }

    public static q9 j(int i2) throws Exception {
        q9 q9Var = (q9) q9.c.get(Integer.valueOf(i2));
        if (q9Var != null) {
            return q9Var;
        }
        throw new Exception("Invalid for value enum " + ydp.class.getName() + ": " + i2);
    }

    public static e05 p(String str) {
        e05 e05Var = new e05(str);
        e05.d.put(str, e05Var);
        return e05Var;
    }

    public static void q(View view, Drawable drawable) {
        Drawable colorDrawable;
        int i2 = d03.e;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null || (colorDrawable = constantState.newDrawable()) == null) {
            colorDrawable = new ColorDrawable(0);
        } else {
            colorDrawable.mutate();
            if (colorDrawable instanceof GradientDrawable) {
                ((GradientDrawable) colorDrawable).setColor(-16777216);
            } else if (colorDrawable instanceof ColorDrawable) {
                ((ColorDrawable) colorDrawable).setColor(-16777216);
            }
        }
        view.setBackground(s(drawable, view, colorDrawable));
    }

    public static d03 s(Drawable drawable, View view, Drawable drawable2) {
        Object tag = view.getTag(2131362118);
        x03 x03Var = tag instanceof x03 ? (x03) tag : null;
        if (x03Var == null) {
            x03Var = new x03(view);
            view.setTag(2131362118, x03Var);
        }
        return new d03(x03Var, drawable, drawable2);
    }

    @Override // defpackage.u24
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.w62, defpackage.z62
    public final float b() {
        return 0.0f;
    }

    @Override // defpackage.w62
    public final void c(n27 n27Var, int i2, int[] iArr, d2c d2cVar, int[] iArr2) {
        if (d2cVar == d2c.a) {
            b72.a(i2, iArr, iArr2, false);
        } else {
            b72.a(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.zl2
    public final int d() {
        return 1;
    }

    @Override // defpackage.z62
    public final void e(n27 n27Var, int i2, int[] iArr, int[] iArr2) {
        b72.a(i2, iArr, iArr2, false);
    }

    public final void f(Drawable drawable, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(257732500);
        int i3 = (vt9Var.h(drawable) ? 4 : 2) | i2;
        if (vt9Var.N(i3 & 1, (i3 & 3) != 2)) {
            c8e c8eVarH = mpj.h(z7e.b, bt5.e);
            boolean zH = vt9Var.h(drawable);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new qfl(drawable, (byte) 0);
                vt9Var.g0(objK);
            }
            nr3.a(fr3.D(c8eVarH, (Function1) objK), vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new oyj(this, drawable, i2, (byte) 3);
        }
    }

    @Override // defpackage.u24
    public final Object g(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    public final PointF h(gyd gydVar, int i2) {
        float f2 = gydVar.b;
        float f3 = gydVar.a;
        return i2 == 1 ? new PointF(1.0f - f3, f2) : new PointF(f3, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    @Override // defpackage.qro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList i(zjo r28, pro r29) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydp.i(zjo, pro):java.util.ArrayList");
    }

    public final String k() {
        j4c j4cVar = OperaBrowserContext.b;
        return (String) N.MFXyJri2();
    }

    public final synchronized e05 l(String str) {
        e05 e05Var;
        LinkedHashMap linkedHashMap = e05.d;
        e05Var = (e05) linkedHashMap.get(str);
        if (e05Var == null) {
            e05Var = (e05) linkedHashMap.get(c.q(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : c.q(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
            if (e05Var == null) {
                e05Var = new e05(str);
            }
            linkedHashMap.put(str, e05Var);
        }
        return e05Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: q6 */
    public final void m(pna pnaVar, kuk kukVar) throws q6 {
        cr9 cr9Var = (cr9) kukVar;
        c30 c30Var = new c30((byte) 7, "BeforeReceive", false);
        mpa mpaVar = pnaVar.e;
        c30 c30Var2 = mpa.n;
        if (!mpaVar.e(c30Var)) {
            int iC = mpaVar.c(c30Var2);
            if (iC == -1) {
                throw new q6("Phase " + c30Var2 + " was not registered for this pipeline", (byte) 4);
            }
            ((cfg) mpaVar).a.add(iC, new fdg(c30Var, new gfg()));
        }
        mpaVar.f(c30Var, new kmh((byte) 0, (mt5) null, cr9Var));
    }

    @Override // defpackage.j0n
    public final Object n(esb esbVar, float f2) {
        switch (this.a) {
            case 2:
                boolean z = esbVar.t() == 1;
                if (z) {
                    esbVar.h();
                }
                double dQ = esbVar.q();
                double dQ2 = esbVar.q();
                double dQ3 = esbVar.q();
                double dQ4 = esbVar.t() == 7 ? esbVar.q() : 1.0d;
                if (z) {
                    esbVar.l();
                }
                if (dQ <= 1.0d && dQ2 <= 1.0d && dQ3 <= 1.0d) {
                    dQ *= 255.0d;
                    dQ2 *= 255.0d;
                    dQ3 *= 255.0d;
                    if (dQ4 <= 1.0d) {
                        dQ4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dQ4, (int) dQ, (int) dQ2, (int) dQ3));
            case 3:
            default:
                return Integer.valueOf(Math.round(xsb.d(esbVar) * f2));
            case 4:
                return Float.valueOf(xsb.d(esbVar) * f2);
        }
    }

    @Override // defpackage.dr3
    public final long o(r05 r05Var, int i2) {
        return ((njl) r05Var.e).j(i2);
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        xvg.l(pzhVar);
    }

    @Override // defpackage.kkk
    public final void r(jkk jkkVar) {
        jkkVar.clear();
    }

    public final String toString() {
        switch (this.a) {
            case 22:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kkk
    public final boolean u(Object obj, Object obj2) {
        return false;
    }
}
