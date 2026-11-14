package defpackage;

import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class lpd implements eig {
    public final WeakReference a;
    public final WeakReference b;

    public lpd(npd npdVar, xkg xkgVar) {
        this.a = new WeakReference(npdVar);
        this.b = new WeakReference(xkgVar);
    }

    @Override // defpackage.eig
    public final void A(float f) {
        npd npdVarD = d();
        if (npdVarD == null) {
            return;
        }
        npdVarD.u();
        npdVarD.s = npdVarD.s.n(f);
        npdVarD.c.a(true, true);
        try {
            npdVarD.h.h.getClass();
        } catch (RemoteException e) {
            w7d.r("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.eig
    public final void B(int i, qjd qjdVar) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z2 = ijgVar.u;
            boolean z3 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z4 = ijgVar.x;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j = ijgVar.C;
            long j2 = ijgVar.D;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.v(qjdVar);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void E(y36 y36Var) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            int i = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z2 = ijgVar.u;
            boolean z3 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z4 = ijgVar.x;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j = ijgVar.C;
            long j2 = ijgVar.D;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
        }
    }

    @Override // defpackage.eig
    public final void F(rhg rhgVar) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            int i = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z2 = ijgVar.u;
            boolean z3 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z4 = ijgVar.x;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j = ijgVar.C;
            long j2 = ijgVar.D;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
            try {
                aqd aqdVar = (aqd) npdVarD.h.h.e;
                aqdVar.Y(aqdVar.f.t);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void G(fzl fzlVar) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            npdVarD.s = npdVarD.s.b(fzlVar);
            npdVarD.c.a(true, false);
            npdVarD.c(new kpd((byte) 0));
        }
    }

    @Override // defpackage.eig
    public final void I(vjd vjdVar) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            int i = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar2 = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z2 = ijgVar.u;
            boolean z3 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z4 = ijgVar.x;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            long j = ijgVar.C;
            long j2 = ijgVar.D;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar2, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar, j, j2, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.M();
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void J(long j) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            int i = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z2 = ijgVar.u;
            boolean z3 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z4 = ijgVar.x;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j2 = ijgVar.C;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j2, j, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.getClass();
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void K(gql gqlVar, int i) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            xkg xkgVar = (xkg) this.b.get();
            if (xkgVar == null) {
                return;
            }
            npdVarD.s = npdVarD.s.l(gqlVar, xkgVar.v0(), i);
            npdVarD.c.a(false, true);
            try {
                npdVarD.h.h.G(gqlVar);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void M(thg thgVar) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            npdVarD.s = npdVarD.s.e(thgVar);
            npdVarD.c.a(true, true);
            try {
                aqd aqdVar = (aqd) npdVarD.h.h.e;
                aqdVar.Y(aqdVar.f.t);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void N(cig cigVar) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            npdVarD.e(cigVar);
        }
    }

    @Override // defpackage.eig
    public final void O(long j) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            int i = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z2 = ijgVar.u;
            boolean z3 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z4 = ijgVar.x;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j2 = ijgVar.C;
            long j3 = ijgVar.D;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j2, j3, j, fzlVar, nylVar);
            npdVarD.c.a(true, true);
        }
    }

    @Override // defpackage.eig
    public final void P(boolean z) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            int i = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z2 = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z3 = ijgVar.u;
            boolean z4 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j = ijgVar.C;
            long j2 = ijgVar.D;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z2, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z3, z4, i7, i8, i9, z, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
            try {
                aqd aqdVar = (aqd) npdVarD.h.h.e;
                aqdVar.Y(aqdVar.f.t);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
            npdVarD.s();
        }
    }

    @Override // defpackage.eig
    public final void a(r4n r4nVar) {
        npd npdVarD = d();
        if (npdVarD == null) {
            return;
        }
        npdVarD.u();
        ijg ijgVar = npdVarD.s;
        rhg rhgVar = ijgVar.a;
        int i = ijgVar.b;
        c4j c4jVar = ijgVar.c;
        fig figVar = ijgVar.d;
        fig figVar2 = ijgVar.e;
        int i2 = ijgVar.f;
        thg thgVar = ijgVar.g;
        int i3 = ijgVar.h;
        boolean z = ijgVar.i;
        gql gqlVar = ijgVar.j;
        int i4 = ijgVar.k;
        vjd vjdVar = ijgVar.m;
        float f = ijgVar.n;
        float f2 = ijgVar.o;
        int i5 = ijgVar.p;
        pf2 pf2Var = ijgVar.q;
        y36 y36Var = ijgVar.r;
        u67 u67Var = ijgVar.s;
        int i6 = ijgVar.t;
        boolean z2 = ijgVar.u;
        boolean z3 = ijgVar.v;
        int i7 = ijgVar.w;
        boolean z4 = ijgVar.x;
        boolean z5 = ijgVar.y;
        int i8 = ijgVar.z;
        int i9 = ijgVar.A;
        vjd vjdVar2 = ijgVar.B;
        long j = ijgVar.C;
        long j2 = ijgVar.D;
        long j3 = ijgVar.E;
        fzl fzlVar = ijgVar.F;
        nyl nylVar = ijgVar.G;
        z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
        npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
        npdVarD.c.a(true, true);
        try {
            npdVarD.h.h.getClass();
        } catch (RemoteException e) {
            w7d.r("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.eig
    public final void b(int i) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            npdVarD.s = ijgVar.d(ijgVar.w, i, ijgVar.v);
            npdVarD.c.a(true, true);
            try {
                aqd aqdVar = (aqd) npdVarD.h.h.e;
                aqdVar.Y(aqdVar.f.t);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    public final npd d() {
        return (npd) this.a.get();
    }

    @Override // defpackage.eig
    public final void g(int i) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            int i2 = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i3 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i4 = ijgVar.h;
            boolean z = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i5 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z2 = ijgVar.u;
            boolean z3 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z4 = ijgVar.x;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j = ijgVar.C;
            long j2 = ijgVar.D;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i2, c4jVar, figVar, figVar2, i3, thgVar, i4, z, r4nVar, gqlVar, i5, vjdVar, f, f2, pf2Var, i, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.getClass();
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void h(int i) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            xkg xkgVar = (xkg) this.b.get();
            if (xkgVar == null) {
                return;
            }
            npdVarD.s = npdVarD.s.f(i, xkgVar.s());
            npdVarD.c.a(true, true);
            try {
                ypd ypdVar = npdVarD.h.h;
                xkgVar.s();
                aqd aqdVar = (aqd) ypdVar.e;
                aqdVar.Y(aqdVar.f.t);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void l(int i, boolean z) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) != null) {
                npdVarD.s = npdVarD.s.c(i, z);
                npdVarD.c.a(true, true);
                try {
                    wpd wpdVar = ((aqd) npdVarD.h.h.e).m;
                    if (wpdVar != null) {
                        if (z) {
                            i = 0;
                        }
                        wpdVar.d = i;
                        wpdVar.a().setCurrentVolume(i);
                    }
                } catch (RemoteException e) {
                    w7d.r("Exception in using media1 API", e);
                }
            }
        }
    }

    @Override // defpackage.eig
    public final void m(long j) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            int i = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z2 = ijgVar.u;
            boolean z3 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z4 = ijgVar.x;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j2 = ijgVar.D;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.getClass();
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void n(int i, fig figVar, fig figVar2) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            npdVarD.s = npdVarD.s.h(i, figVar, figVar2);
            npdVarD.c.a(true, true);
            try {
                aqd aqdVar = (aqd) npdVarD.h.h.e;
                aqdVar.Y(aqdVar.f.t);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void o(vjd vjdVar) {
        npd npdVarD = d();
        if (npdVarD == null) {
            return;
        }
        npdVarD.u();
        npdVarD.s = npdVarD.s.g(vjdVar);
        npdVarD.c.a(true, true);
        try {
            npdVarD.h.h.A(vjdVar);
        } catch (RemoteException e) {
            w7d.r("Exception in using media1 API", e);
        }
    }

    @Override // defpackage.eig
    public final void onRenderedFirstFrame() {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            vzk vzkVar = npdVarD.g.b;
            h1b h1bVarH = vzkVar.H();
            for (int i = 0; i < h1bVarH.size(); i++) {
                nod nodVar = (nod) h1bVarH.get(i);
                vzkVar.M(nodVar);
                npdVarD.b(nodVar, new kpd((byte) 1));
            }
        }
    }

    @Override // defpackage.eig
    public final void onRepeatModeChanged(int i) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            npdVarD.s = npdVarD.s.i(i);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.B(i);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void onShuffleModeEnabledChanged(boolean z) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            npdVarD.s = npdVarD.s.k(z);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.F(z);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void r(u67 u67Var) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            int i = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            int i6 = ijgVar.t;
            boolean z2 = ijgVar.u;
            boolean z3 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z4 = ijgVar.x;
            boolean z5 = ijgVar.y;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j = ijgVar.C;
            long j2 = ijgVar.D;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z2, z3, i7, i8, i9, z4, z5, vjdVar2, j, j2, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.t();
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void s(int i, int i2) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            npdVarD.c(new gi8(i, i2, (byte) 3));
        }
    }

    @Override // defpackage.eig
    public final void v(pf2 pf2Var) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            npdVarD.s = npdVarD.s.a(pf2Var);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.s(pf2Var);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }

    @Override // defpackage.eig
    public final void w(nyl nylVar) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            npdVarD.s = npdVarD.s.m(nylVar);
            npdVarD.c.a(true, true);
            npdVarD.c(new kpd((byte) 2));
        }
    }

    @Override // defpackage.eig
    public final void x(boolean z) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            rhg rhgVar = ijgVar.a;
            int i = ijgVar.b;
            c4j c4jVar = ijgVar.c;
            fig figVar = ijgVar.d;
            fig figVar2 = ijgVar.e;
            int i2 = ijgVar.f;
            thg thgVar = ijgVar.g;
            int i3 = ijgVar.h;
            boolean z2 = ijgVar.i;
            gql gqlVar = ijgVar.j;
            int i4 = ijgVar.k;
            r4n r4nVar = ijgVar.l;
            vjd vjdVar = ijgVar.m;
            float f = ijgVar.n;
            float f2 = ijgVar.o;
            int i5 = ijgVar.p;
            pf2 pf2Var = ijgVar.q;
            y36 y36Var = ijgVar.r;
            u67 u67Var = ijgVar.s;
            int i6 = ijgVar.t;
            boolean z3 = ijgVar.u;
            boolean z4 = ijgVar.v;
            int i7 = ijgVar.w;
            boolean z5 = ijgVar.x;
            int i8 = ijgVar.z;
            int i9 = ijgVar.A;
            vjd vjdVar2 = ijgVar.B;
            long j = ijgVar.C;
            long j2 = ijgVar.D;
            long j3 = ijgVar.E;
            fzl fzlVar = ijgVar.F;
            nyl nylVar = ijgVar.G;
            z4o.H(gqlVar.p() || c4jVar.a.b < gqlVar.o());
            npdVarD.s = new ijg(rhgVar, i, c4jVar, figVar, figVar2, i2, thgVar, i3, z2, r4nVar, gqlVar, i4, vjdVar, f, f2, pf2Var, i5, y36Var, u67Var, i6, z3, z4, i7, i8, i9, z5, z, vjdVar2, j, j2, j3, fzlVar, nylVar);
            npdVarD.c.a(true, true);
            try {
                npdVarD.h.h.getClass();
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
            npdVarD.s();
        }
    }

    @Override // defpackage.eig
    public final void z(int i, boolean z) {
        npd npdVarD = d();
        if (npdVarD != null) {
            npdVarD.u();
            if (((xkg) this.b.get()) == null) {
                return;
            }
            ijg ijgVar = npdVarD.s;
            npdVarD.s = ijgVar.d(i, ijgVar.z, z);
            npdVarD.c.a(true, true);
            try {
                aqd aqdVar = (aqd) npdVarD.h.h.e;
                aqdVar.Y(aqdVar.f.t);
            } catch (RemoteException e) {
                w7d.r("Exception in using media1 API", e);
            }
        }
    }
}
