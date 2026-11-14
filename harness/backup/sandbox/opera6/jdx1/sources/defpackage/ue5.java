package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ue5 implements Function2, cr9, dr9, er9, fr9, gr9, hr9, ir9, nq9, oq9, qq9, rq9, sq9, tq9, uq9, vq9, wq9, yq9, zq9 {
    public final int a;
    public final boolean b;
    public Object c;
    public znh d;
    public ArrayList e;

    public ue5(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public final Object a(ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(this.a);
        g(vt9Var);
        int iL = i | (vt9Var.f(this) ? gyg.l(2, 0) : gyg.l(1, 0));
        Object obj = this.c;
        y9m.t(2, obj);
        Object objInvoke = ((Function2) obj).invoke(vt9Var, Integer.valueOf(iL));
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new te5(2, this, ue5.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, (byte) 0);
        }
        return objInvoke;
    }

    public final Object b(Object obj, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(this.a);
        g(vt9Var);
        byte b = 2;
        int iL = vt9Var.f(this) ? gyg.l(2, 1) : gyg.l(1, 1);
        Object obj2 = this.c;
        y9m.t(3, obj2);
        Object objInvoke = ((cr9) obj2).invoke(obj, vt9Var, Integer.valueOf(iL | i));
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uf1(this, obj, i, b);
        }
        return objInvoke;
    }

    public final Object c(Object obj, Object obj2, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(this.a);
        g(vt9Var);
        int iL = vt9Var.f(this) ? gyg.l(2, 2) : gyg.l(1, 2);
        Object obj3 = this.c;
        y9m.t(4, obj3);
        Object objJ = ((dr9) obj3).j(obj, obj2, vt9Var, Integer.valueOf(iL | i));
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1(this, obj, obj2, i);
        }
        return objJ;
    }

    public final Object d(Object obj, Object obj2, Object obj3, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(this.a);
        g(vt9Var);
        int iL = vt9Var.f(this) ? gyg.l(2, 3) : gyg.l(1, 3);
        Object obj4 = this.c;
        y9m.t(5, obj4);
        Object objM = ((er9) obj4).m(obj, obj2, obj3, vt9Var, Integer.valueOf(iL | i));
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0(this, obj, obj2, obj3, i);
        }
        return objM;
    }

    public final Object e(Object obj, Object obj2, Object obj3, Object obj4, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(this.a);
        g(vt9Var);
        int iL = vt9Var.f(this) ? gyg.l(2, 4) : gyg.l(1, 4);
        Object obj5 = this.c;
        y9m.t(6, obj5);
        Object objK = ((fr9) obj5).k(obj, obj2, obj3, obj4, vt9Var, Integer.valueOf(i | iL));
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lc1(this, obj, obj2, obj3, obj4, i, (byte) 2);
        }
        return objK;
    }

    public final Object f(String str, Boolean bool, is5 is5Var, Object obj, Object obj2, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(this.a);
        g(vt9Var);
        int iL = vt9Var.f(this) ? gyg.l(2, 6) : gyg.l(1, 6);
        Object obj3 = this.c;
        y9m.t(8, obj3);
        Object objN = ((hr9) obj3).n(str, bool, is5Var, obj, obj2, vt9Var, Integer.valueOf(i | iL));
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new se5(this, str, bool, is5Var, obj, obj2, i);
        }
        return objN;
    }

    public final void g(ih5 ih5Var) {
        znh znhVarW;
        if (!this.b || (znhVarW = ((vt9) ih5Var).w()) == null) {
            return;
        }
        znhVarW.b |= 1;
        znh znhVar = this.d;
        if (znhVar == null || !znhVar.a() || znhVar == znhVarW || Intrinsics.a(znhVar.c, znhVarW.c)) {
            this.d = znhVarW;
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            arrayList2.add(znhVarW);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            znh znhVar2 = (znh) arrayList.get(i);
            if (znhVar2 == null || !znhVar2.a() || znhVar2 == znhVarW || Intrinsics.a(znhVar2.c, znhVarW.c)) {
                arrayList.set(i, znhVarW);
                return;
            }
        }
        arrayList.add(znhVarW);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((ih5) obj, ((Number) obj2).intValue());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(obj, (ih5) obj2, ((Number) obj3).intValue());
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (ih5) obj3, ((Number) obj4).intValue());
    }

    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return e(obj, obj2, obj3, obj4, (ih5) obj5, ((Number) obj6).intValue());
    }

    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return d(obj, obj2, obj3, (ih5) obj4, ((Number) obj5).intValue());
    }

    @Override // defpackage.hr9
    public final /* bridge */ /* synthetic */ Object n(String str, Boolean bool, is5 is5Var, Object obj, Object obj2, vt9 vt9Var, Integer num) {
        return f(str, bool, is5Var, obj, obj2, vt9Var, num.intValue());
    }
}
