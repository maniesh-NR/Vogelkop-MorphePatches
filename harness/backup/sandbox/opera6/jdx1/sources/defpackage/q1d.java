package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class q1d extends o1d implements pfd {
    public final wye u;
    public LinkedHashMap w;
    public ufd y;
    public final zde z;
    public long v = 0;
    public final r1d x = new r1d(this);

    public q1d(wye wyeVar) {
        this.u = wyeVar;
        zde zdeVar = n6f.a;
        this.z = new zde();
    }

    @Override // defpackage.o1d
    public final b2c A0() {
        return this.x;
    }

    @Override // defpackage.o1d
    public final boolean B0() {
        return this.y != null;
    }

    @Override // defpackage.o1d
    public final m3c D0() {
        return this.u.u;
    }

    @Override // defpackage.o1d, defpackage.shb
    public final boolean F() {
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    @Override // defpackage.o1d
    public final ufd G0() throws pxb {
        ufd ufdVar = this.y;
        if (ufdVar != null) {
            return ufdVar;
        }
        throw vep.q("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.o1d
    public final o1d H0() {
        wye wyeVar = this.u.w;
        if (wyeVar != null) {
            return wyeVar.X0();
        }
        return null;
    }

    @Override // defpackage.o1d
    public final long I0() {
        return this.v;
    }

    @Override // defpackage.o1d
    public final void M0() {
        d0(this.v, 0.0f, null);
    }

    public void O0() {
        G0().b();
    }

    public final void P0(long j) {
        if (!ybb.a(this.v, j)) {
            this.v = j;
            wye wyeVar = this.u;
            u1d u1dVar = wyeVar.u.G.q;
            if (u1dVar != null) {
                u1dVar.v0();
            }
            o1d.K0(wyeVar);
        }
        if (this.o) {
            return;
        }
        v0(G0());
    }

    public final long Q0(q1d q1dVar, boolean z) {
        long jC = 0;
        while (!Intrinsics.a(this, q1dVar)) {
            if (!this.l || !z) {
                jC = ybb.c(jC, this.v);
            }
            this = this.u.w.X0();
        }
        return jC;
    }

    public final void R0(ufd ufdVar) {
        LinkedHashMap linkedHashMap;
        if (ufdVar != null) {
            f0((ufdVar.getWidth() << 32) | (ufdVar.getHeight() & 4294967295L));
        } else {
            f0(0L);
        }
        if (!Intrinsics.a(this.y, ufdVar) && ufdVar != null && ((((linkedHashMap = this.w) != null && !linkedHashMap.isEmpty()) || !ufdVar.a().isEmpty()) && !Intrinsics.a(ufdVar.a(), this.w))) {
            this.u.u.G.q.r.f();
            LinkedHashMap linkedHashMap2 = this.w;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.w = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(ufdVar.a());
        }
        this.y = ufdVar;
    }

    @Override // defpackage.n27
    public final float b() {
        return this.u.b();
    }

    @Override // defpackage.ifg
    public final void d0(long j, float f, Function1 function1) {
        P0(j);
        if (this.n) {
            return;
        }
        O0();
    }

    @Override // defpackage.shb
    public final d2c getLayoutDirection() {
        return this.u.u.z;
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.u.n0();
    }

    @Override // defpackage.ifg, defpackage.pfd
    public final Object p() {
        return this.u.p();
    }

    @Override // defpackage.o1d
    public final o1d x0() {
        wye wyeVar = this.u.v;
        if (wyeVar != null) {
            return wyeVar.X0();
        }
        return null;
    }
}
