package defpackage;

import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a73 {
    public final y63 c;
    public ua7 e;
    public final ArrayList a = new ArrayList(1);
    public boolean b = false;
    public float d = 0.0f;
    public Object f = null;
    public float g = -1.0f;
    public float h = -1.0f;

    public a73(List list) {
        ulp hrVar;
        if (list.isEmpty()) {
            hrVar = new ulp((byte) 23);
        } else {
            hrVar = list.size() == 1 ? new hr(list) : new z63(list);
        }
        this.c = hrVar;
    }

    public final void a(x63 x63Var) {
        this.a.add(x63Var);
    }

    public float b() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float fU = this.c.u();
        this.h = fU;
        return fU;
    }

    public final float c() {
        zvb zvbVarH = this.c.h();
        if (zvbVarH == null || zvbVarH.c()) {
            return 0.0f;
        }
        return zvbVarH.d.getInterpolation(d());
    }

    public final float d() {
        if (this.b) {
            return 0.0f;
        }
        zvb zvbVarH = this.c.h();
        if (zvbVarH.c()) {
            return 0.0f;
        }
        return (this.d - zvbVarH.b()) / (zvbVarH.a() - zvbVarH.b());
    }

    public Object e() {
        float fD = d();
        ua7 ua7Var = this.e;
        y63 y63Var = this.c;
        if (ua7Var == null && y63Var.f(fD)) {
            return this.f;
        }
        zvb zvbVarH = y63Var.h();
        BaseInterpolator baseInterpolator = zvbVarH.e;
        BaseInterpolator baseInterpolator2 = zvbVarH.f;
        Object objF = (baseInterpolator == null || baseInterpolator2 == null) ? f(zvbVarH, c()) : g(zvbVarH, fD, baseInterpolator.getInterpolation(fD), baseInterpolator2.getInterpolation(fD));
        this.f = objF;
        return objF;
    }

    public abstract Object f(zvb zvbVar, float f);

    public Object g(zvb zvbVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((x63) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f) {
        y63 y63Var = this.c;
        if (y63Var.isEmpty()) {
            return;
        }
        float fK = this.g;
        if (fK == -1.0f) {
            fK = y63Var.k();
            this.g = fK;
        }
        float f2 = fK;
        if (f < fK) {
            if (f2 == -1.0f) {
                f = y63Var.k();
                this.g = f;
            } else {
                f = f2;
            }
        } else if (f > b()) {
            f = b();
        }
        if (f != this.d) {
            this.d = f;
            if (y63Var.i(f)) {
                h();
            }
        }
    }

    public final void j(ua7 ua7Var) {
        ua7 ua7Var2 = this.e;
        if (ua7Var2 != null) {
            ua7Var2.c = null;
        }
        this.e = ua7Var;
        if (ua7Var != null) {
            ua7Var.c = this;
        }
    }
}
