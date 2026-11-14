package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j03 extends b8e implements lk7, j7f, i0j {
    public long o;
    public dz3 p;
    public float q;
    public paj r;
    public long s;
    public d2c t;
    public w7d u;
    public paj v;
    public w7d w;

    public final void J() {
        this.s = 9205357640488583168L;
        this.t = null;
        this.u = null;
        this.v = null;
        c26.y(this);
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        o0j.i(q0jVar, this.r);
    }

    @Override // defpackage.i0j
    public final boolean g() {
        return false;
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        w7d w7dVar;
        dz3 dz3Var;
        float f;
        d91 d91Var;
        o3c o3cVar2;
        uh4 uh4Var = o3cVar.a;
        if (this.r == kfo.i) {
            if (!jgm.a(this.o, u95.g)) {
                mk7.z0(o3cVar, this.o, 0L, 0.0f, 126);
            }
            dz3 dz3Var2 = this.p;
            if (dz3Var2 != null) {
                mk7.E0(o3cVar, dz3Var2, 0L, 0L, this.q, null, 118);
            }
        } else {
            if (bpj.a(uh4Var.e(), this.s) && o3cVar.getLayoutDirection() == this.t && Intrinsics.a(this.v, this.r)) {
                w7dVar = this.u;
            } else {
                x7d.y(this, new x2(this, o3cVar, (byte) 29));
                w7dVar = this.w;
                this.w = null;
            }
            this.u = w7dVar;
            this.s = uh4Var.e();
            this.t = o3cVar.getLayoutDirection();
            this.v = this.r;
            if (!jgm.a(this.o, u95.g)) {
                x7d.f(o3cVar, w7dVar, this.o);
            }
            dz3 dz3Var3 = this.p;
            if (dz3Var3 != null) {
                float f2 = this.q;
                boolean z = w7dVar instanceof mtf;
                a39 a39Var = a39.a;
                if (z) {
                    voh vohVar = ((mtf) w7dVar).k;
                    float f3 = vohVar.a;
                    float f4 = vohVar.b;
                    o3cVar.P(dz3Var3, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), x7d.C(vohVar), f2, a39Var);
                } else {
                    if (w7dVar instanceof ntf) {
                        ntf ntfVar = (ntf) w7dVar;
                        dz3Var = dz3Var3;
                        d91Var = ntfVar.l;
                        if (d91Var != null) {
                            o3cVar2 = o3cVar;
                            f = f2;
                        } else {
                            h8i h8iVar = ntfVar.k;
                            float f5 = h8iVar.b;
                            float f6 = h8iVar.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (h8iVar.h >> 32));
                            float f7 = h8iVar.c - f6;
                            float f8 = h8iVar.d - f5;
                            o3cVar.d(dz3Var, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), f2, a39Var);
                        }
                    } else {
                        if (!(w7dVar instanceof ltf)) {
                            h9o.p();
                            return;
                        }
                        d91 d91Var2 = ((ltf) w7dVar).k;
                        dz3Var = dz3Var3;
                        f = f2;
                        d91Var = d91Var2;
                        o3cVar2 = o3cVar;
                    }
                    o3cVar2.S(d91Var, dz3Var, f, a39Var, 3);
                }
            }
        }
        o3cVar.a();
    }
}
