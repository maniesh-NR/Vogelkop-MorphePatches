package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class i8b extends q1d {
    @Override // defpackage.pfd
    public final int E(int i) {
        c37 c37VarT = this.u.u.t();
        tfd tfdVarU = c37VarT.u();
        m3c m3cVar = (m3c) c37VarT.a;
        return tfdVarU.c((wye) m3cVar.F.e, m3cVar.l(), i);
    }

    @Override // defpackage.pfd
    public final int J(int i) {
        c37 c37VarT = this.u.u.t();
        tfd tfdVarU = c37VarT.u();
        m3c m3cVar = (m3c) c37VarT.a;
        return tfdVarU.a((wye) m3cVar.F.e, m3cVar.l(), i);
    }

    @Override // defpackage.pfd
    public final ifg N(long j) {
        g0(j);
        wye wyeVar = this.u;
        dfe dfeVarZ = wyeVar.u.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((m3c) objArr[i2]).G.q.j = k3c.c;
        }
        m3c m3cVar = wyeVar.u;
        R0(m3cVar.w.b(this, m3cVar.l(), j));
        return this;
    }

    @Override // defpackage.q1d
    public final void O0() {
        this.u.u.G.q.A0();
    }

    @Override // defpackage.pfd
    public final int c(int i) {
        c37 c37VarT = this.u.u.t();
        tfd tfdVarU = c37VarT.u();
        m3c m3cVar = (m3c) c37VarT.a;
        return tfdVarU.d((wye) m3cVar.F.e, m3cVar.l(), i);
    }

    @Override // defpackage.o1d
    public final int q0(sz0 sz0Var) {
        u1d u1dVar = this.u.u.G.q;
        n3c n3cVar = u1dVar.r;
        if (!u1dVar.k) {
            q3c q3cVar = u1dVar.f;
            if (q3cVar.d == i3c.b) {
                n3cVar.f = true;
                if (n3cVar.b) {
                    q3cVar.f = true;
                    q3cVar.g = true;
                }
            } else {
                n3cVar.g = true;
            }
        }
        i8b i8bVar = u1dVar.C().c0;
        Boolean boolValueOf = i8bVar != null ? Boolean.valueOf(i8bVar.o) : null;
        i8b i8bVar2 = u1dVar.C().c0;
        if (i8bVar2 != null) {
            i8bVar2.o = true;
        }
        u1dVar.t();
        i8b i8bVar3 = u1dVar.C().c0;
        if (i8bVar3 != null) {
            i8bVar3.o = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) n3cVar.i.get(sz0Var);
        int iIntValue = num != null ? num.intValue() : LinearLayoutManager.INVALID_OFFSET;
        this.z.g(iIntValue, sz0Var);
        return iIntValue;
    }

    @Override // defpackage.pfd
    public final int z(int i) {
        c37 c37VarT = this.u.u.t();
        tfd tfdVarU = c37VarT.u();
        m3c m3cVar = (m3c) c37VarT.a;
        return tfdVarU.e((wye) m3cVar.F.e, m3cVar.l(), i);
    }
}
