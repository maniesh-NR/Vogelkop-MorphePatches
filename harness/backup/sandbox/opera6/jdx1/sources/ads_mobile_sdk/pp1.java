package ads_mobile_sdk;

import defpackage.ioj;
import defpackage.pio;
import defpackage.r05;

/* loaded from: classes.dex */
public final class pp1 implements pio {
    public final ku0 a;
    public final ioj b;

    public pp1(ioj iojVar, ku0 ku0Var) {
        this.b = iojVar;
        this.a = ku0Var;
    }

    @Override // defpackage.pio
    public final ku0 a() {
        ku0 ku0Var = this.a;
        if (ku0Var != null) {
            return (ku0) ku0Var.a(4, (ku0) null);
        }
        iu0 iu0Var = (iu0) ku0Var.a(5, (ku0) null);
        boolean zJ = iu0Var.b.j();
        ku0 ku0Var2 = iu0Var.b;
        if (!zJ) {
            return ku0Var2;
        }
        ku0Var2.k();
        return iu0Var.b;
    }

    @Override // defpackage.pio
    public final void a(g gVar, r05 r05Var, ul0 ul0Var) {
        this.b.getClass();
        ioj.c(gVar);
        gVar.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.pio
    public final void a(Object obj, e7 e7Var) {
        throw sko.g(obj);
    }

    @Override // defpackage.pio
    public final void a(Object obj, Object obj2) {
        b03.a(this.b, obj, obj2);
    }

    @Override // defpackage.pio
    public final void a(Object obj, byte[] bArr, int i, int i2, defpackage.f72 f72Var) {
        ku0 ku0Var = (ku0) obj;
        if (ku0Var.b == yk3.f) {
            ku0Var.b = yk3.b();
        }
        throw sko.g(obj);
    }

    @Override // defpackage.pio
    public final boolean a(Object obj) {
        throw sko.g(obj);
    }

    @Override // defpackage.pio
    public final int b(ku0 ku0Var) {
        this.b.getClass();
        yk3 yk3Var = ku0Var.b;
        int i = yk3Var.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < yk3Var.a; i2++) {
            int i3 = yk3Var.b[i2] >>> 3;
            iA += ov.a((hr) yk3Var.c[i2]) + ov.h(3) + ov.i(i3) + ov.h(2) + (ov.h(1) << 1);
        }
        yk3Var.d = iA;
        return iA;
    }

    @Override // defpackage.pio
    public final boolean b(ku0 ku0Var, ku0 ku0Var2) {
        this.b.getClass();
        return ku0Var.b.equals(ku0Var2.b);
    }

    @Override // defpackage.pio
    public final void c(Object obj) {
        this.b.getClass();
        yk3 yk3Var = ((ku0) obj).b;
        if (yk3Var.e) {
            yk3Var.e = false;
        }
        throw sko.g(obj);
    }

    @Override // defpackage.pio
    public final int d(ku0 ku0Var) {
        this.b.getClass();
        return ku0Var.b.hashCode();
    }
}
