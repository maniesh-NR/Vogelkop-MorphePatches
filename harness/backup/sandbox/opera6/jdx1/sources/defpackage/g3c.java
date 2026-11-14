package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g3c extends wye {
    public static final zg d0;
    public e3c b0;
    public f3c c0;

    static {
        zg zgVarD = na2.d();
        int i = u95.h;
        zgVarD.D(u95.e);
        zgVarD.J(1.0f);
        zgVarD.K(1);
        d0 = zgVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g3c(m3c m3cVar, e3c e3cVar) {
        super(m3cVar);
        this.b0 = e3cVar;
        this.c0 = m3cVar.h != null ? new f3c(this) : null;
        if ((((b8e) e3cVar).a.c & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
            return;
        }
        h9o.t();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C1(e3c e3cVar) {
        if (e3cVar.equals(this.b0) || (((b8e) e3cVar).a.c & NotificationCompat.FLAG_GROUP_SUMMARY) == 0) {
            this.b0 = e3cVar;
        } else {
            h9o.t();
        }
    }

    @Override // defpackage.pfd
    public final int E(int i) {
        return this.b0.N(this, this.v, i);
    }

    @Override // defpackage.pfd
    public final int J(int i) {
        return this.b0.f(this, this.v, i);
    }

    @Override // defpackage.pfd
    public final ifg N(long j) throws pxb {
        g0(j);
        t1(this.b0.c(this, this.v, j));
        k1();
        return this;
    }

    @Override // defpackage.wye
    public final void U0() {
        if (this.c0 == null) {
            this.c0 = new f3c(this);
        }
    }

    @Override // defpackage.wye
    public final q1d X0() {
        return this.c0;
    }

    @Override // defpackage.wye
    public final b8e Z0() {
        return ((b8e) this.b0).a;
    }

    @Override // defpackage.pfd
    public final int c(int i) {
        return this.b0.E(this, this.v, i);
    }

    @Override // defpackage.ifg
    public final void d0(long j, float f, Function1 function1) throws pxb {
        q1(j, f, function1);
        if (this.n) {
            return;
        }
        l1();
        wye wyeVar = this.v;
        boolean z = wyeVar.o;
        wyeVar.o = this.o;
        G0().b();
        wyeVar.o = z;
    }

    @Override // defpackage.wye
    public final void p1(sh4 sh4Var, q3a q3aVar) {
        wye wyeVar;
        this.v.S0(sh4Var, q3aVar);
        if (!p3c.a(this.u).n() || (wyeVar = this.v) == null) {
            return;
        }
        if (gcb.a(this.c, wyeVar.c) && ybb.a(wyeVar.F, 0L)) {
            return;
        }
        long j = this.c;
        sh4Var.o(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, d0);
    }

    @Override // defpackage.o1d
    public final int q0(sz0 sz0Var) {
        f3c f3cVar = this.c0;
        if (f3cVar == null) {
            return a26.o(this, sz0Var);
        }
        zde zdeVar = f3cVar.z;
        int iD = zdeVar.d(sz0Var);
        return iD >= 0 ? zdeVar.c[iD] : LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // defpackage.pfd
    public final int z(int i) {
        return this.b0.r0(this, this.v, i);
    }
}
