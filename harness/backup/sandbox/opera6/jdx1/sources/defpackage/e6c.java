package defpackage;

/* loaded from: classes.dex */
public final class e6c extends b8e implements i0j {
    public vtb o;
    public y5c p;
    public fsf q;
    public boolean r;
    public eoi s;
    public final c6c t = new c6c(this, (byte) 0);
    public c6c u;

    public e6c(vtb vtbVar, y5c y5cVar, fsf fsfVar, boolean z) {
        this.o = vtbVar;
        this.p = y5cVar;
        this.q = fsfVar;
        this.r = z;
        T0();
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        xtb[] xtbVarArr;
        o0j.k(q0jVar);
        q0jVar.b(n0j.P, this.t);
        fsf fsfVar = this.q;
        fsf fsfVar2 = fsf.a;
        eoi eoiVar = this.s;
        if (fsfVar == fsfVar2) {
            if (eoiVar == null) {
                eoiVar = null;
            }
            p0j p0jVar = n0j.w;
            xtbVarArr = o0j.a;
            xtb xtbVar = xtbVarArr[13];
            p0jVar.getClass();
            q0jVar.b(p0jVar, eoiVar);
        } else {
            if (eoiVar == null) {
                eoiVar = null;
            }
            p0j p0jVar2 = n0j.v;
            xtbVarArr = o0j.a;
            xtb xtbVar2 = xtbVarArr[12];
            p0jVar2.getClass();
            q0jVar.b(p0jVar2, eoiVar);
        }
        c6c c6cVar = this.u;
        if (c6cVar != null) {
            q0jVar.b(e0j.f, new c8(null, c6cVar));
        }
        q0jVar.b(e0j.C, new c8(null, new tji(new d6c(this, (byte) 2), (byte) 11)));
        c95 c95VarC = this.p.c();
        p0j p0jVar3 = n0j.f;
        xtb xtbVar3 = xtbVarArr[24];
        p0jVar3.getClass();
        q0jVar.b(p0jVar3, c95VarC);
    }

    public final void T0() {
        this.s = new eoi(new d6c(this, (byte) 0), new d6c(this, (byte) 1));
        this.u = this.r ? new c6c(this, (byte) 1) : null;
    }
}
