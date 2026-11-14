package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class rh5 implements prd, bm7 {
    public final Object a;
    public ro9 b;
    public am7 c;
    public final /* synthetic */ th5 d;

    public rh5(th5 th5Var, Object obj) {
        this.d = th5Var;
        this.b = th5Var.b(null);
        this.c = new am7(th5Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.prd
    public final void C(int i, jrd jrdVar, bsc bscVar, tjd tjdVar) {
        if (a(i, jrdVar)) {
            ro9 ro9Var = this.b;
            ro9Var.m(new mrd(ro9Var, bscVar, b(tjdVar, jrdVar), (byte) 1));
        }
    }

    @Override // defpackage.prd
    public final void D(int i, jrd jrdVar, bsc bscVar, tjd tjdVar) {
        if (a(i, jrdVar)) {
            ro9 ro9Var = this.b;
            ro9Var.m(new mrd(ro9Var, bscVar, b(tjdVar, jrdVar), (byte) 0));
        }
    }

    @Override // defpackage.bm7
    public final void L(int i, jrd jrdVar) {
        if (a(i, jrdVar)) {
            this.c.e();
        }
    }

    public final boolean a(int i, jrd jrdVar) {
        jrd jrdVarU;
        Object obj = this.a;
        th5 th5Var = this.d;
        if (jrdVar != null) {
            jrdVarU = th5Var.u(obj, jrdVar);
            if (jrdVarU == null) {
                return false;
            }
        } else {
            jrdVarU = null;
        }
        int iW = th5Var.w(obj, i);
        ro9 ro9Var = this.b;
        if (ro9Var.b != iW || !Objects.equals((jrd) ro9Var.c, jrdVarU)) {
            this.b = new ro9((CopyOnWriteArrayList) th5Var.c.d, iW, jrdVarU);
        }
        am7 am7Var = this.c;
        if (am7Var.a == iW && Objects.equals(am7Var.b, jrdVarU)) {
            return true;
        }
        this.c = new am7(th5Var.d.c, iW, jrdVarU);
        return true;
    }

    public final tjd b(tjd tjdVar, jrd jrdVar) {
        long j = tjdVar.f;
        th5 th5Var = this.d;
        Object obj = this.a;
        long jV = th5Var.v(obj, j);
        long j2 = tjdVar.g;
        long jV2 = th5Var.v(obj, j2);
        return (jV == j && jV2 == j2) ? tjdVar : new tjd(tjdVar.a, tjdVar.b, tjdVar.c, tjdVar.d, tjdVar.e, jV, jV2);
    }

    @Override // defpackage.bm7
    public final void d(int i, jrd jrdVar, Exception exc) {
        if (a(i, jrdVar)) {
            this.c.d(exc);
        }
    }

    @Override // defpackage.prd
    public final void e(int i, jrd jrdVar, tjd tjdVar) {
        if (a(i, jrdVar)) {
            ro9 ro9Var = this.b;
            tjd tjdVarB = b(tjdVar, jrdVar);
            jrd jrdVar2 = (jrd) ro9Var.c;
            jrdVar2.getClass();
            ro9Var.m(new a32(ro9Var, jrdVar2, tjdVarB, (byte) 19));
        }
    }

    @Override // defpackage.bm7
    public final void f(int i, jrd jrdVar, int i2) {
        if (a(i, jrdVar)) {
            this.c.c(i2);
        }
    }

    @Override // defpackage.prd
    public final void i(int i, jrd jrdVar, bsc bscVar, tjd tjdVar, IOException iOException, boolean z) {
        if (a(i, jrdVar)) {
            ro9 ro9Var = this.b;
            ro9Var.m(new nrd(ro9Var, bscVar, b(tjdVar, jrdVar), iOException, z));
        }
    }

    @Override // defpackage.bm7
    public final void j(int i, jrd jrdVar, ix5 ix5Var) {
        if (a(i, jrdVar)) {
            this.c.a(ix5Var);
        }
    }

    @Override // defpackage.bm7
    public final void k(int i, jrd jrdVar) {
        if (a(i, jrdVar)) {
            this.c.b();
        }
    }

    @Override // defpackage.prd
    public final void t(int i, jrd jrdVar, bsc bscVar, tjd tjdVar, int i2) {
        if (a(i, jrdVar)) {
            ro9 ro9Var = this.b;
            ro9Var.m(new qo4(ro9Var, bscVar, b(tjdVar, jrdVar), i2));
        }
    }

    @Override // defpackage.prd
    public final void u(int i, jrd jrdVar, tjd tjdVar) {
        if (a(i, jrdVar)) {
            ro9 ro9Var = this.b;
            ro9Var.m(new z0c(ro9Var, b(tjdVar, jrdVar), (byte) 22));
        }
    }
}
