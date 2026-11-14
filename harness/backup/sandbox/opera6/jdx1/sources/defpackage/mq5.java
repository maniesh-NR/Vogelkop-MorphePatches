package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mq5 extends b8e implements hi5, xfd {
    public fsf o;
    public final spi p;
    public boolean q;
    public xs3 r;
    public final hpi s;
    public boolean u;
    public boolean w;
    public final wth t = new wth((byte) 18);
    public long v = -1;

    public mq5(fsf fsfVar, spi spiVar, boolean z, xs3 xs3Var, hpi hpiVar) {
        this.o = fsfVar;
        this.p = spiVar;
        this.q = z;
        this.r = xs3Var;
        this.s = hpiVar;
    }

    public static boolean V0(mq5 mq5Var, voh vohVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = mq5Var.U0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jX0 = mq5Var.X0(vohVar, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jX0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jX0 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    public final float T0(xs3 xs3Var, long j) {
        float f;
        voh vohVar;
        int iCompare;
        long j2 = this.v;
        dfe dfeVar = (dfe) this.t.b;
        int i = dfeVar.c - 1;
        Object[] objArr = dfeVar.a;
        if (i < objArr.length) {
            vohVar = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                voh vohVar2 = (voh) ((jq5) objArr[i]).a.invoke();
                if (vohVar2 != null) {
                    long jC = vohVar2.c();
                    long jG0 = fr3.g0(U0());
                    f = 0.0f;
                    int iOrdinal = this.o.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jG0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            h9o.p();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jG0 >> 32)));
                    }
                    if (iCompare <= 0) {
                        vohVar = vohVar2;
                    } else if (vohVar == null) {
                        vohVar = vohVar2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            vohVar = null;
        }
        if (vohVar == null) {
            voh vohVar3 = this.u ? (voh) this.s.invoke() : null;
            if (vohVar3 == null) {
                return f;
            }
            vohVar = vohVar3;
        }
        long jG02 = fr3.g0(j2);
        int iOrdinal2 = this.o.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = vohVar.b;
            return xs3Var.a(f2 - ((int) (j & 4294967295L)), vohVar.d - f2, Float.intBitsToFloat((int) (jG02 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = vohVar.a;
            return xs3Var.a(f3 - ((int) (j >> 32)), vohVar.c - f3, Float.intBitsToFloat((int) (jG02 >> 32)));
        }
        h9o.p();
        return f;
    }

    public final long U0() {
        long j = this.v;
        if (gcb.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void W0(long j) {
        xs3 xs3Var = this.r;
        if (xs3Var == null) {
            xs3Var = (xs3) z4o.N(this, zs3.a);
        }
        xs3 xs3Var2 = xs3Var;
        if (this.w) {
            d8b.c("launchAnimation called when previous animation was running");
        }
        xs3 xs3Var3 = this.r;
        if (xs3Var3 == null) {
            xs3Var3 = (xs3) z4o.N(this, zs3.a);
        }
        xs3Var3.getClass();
        xs3.a.getClass();
        na2.B(H0(), null, rx5.d, new lq5(this, new vnm(ws3.b), xs3Var2, j, null), 1);
    }

    public final long X0(voh vohVar, long j, long j2) {
        long jG0 = fr3.g0(j);
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            xs3 xs3Var = this.r;
            if (xs3Var == null) {
                xs3Var = (xs3) z4o.N(this, zs3.a);
            }
            float f = vohVar.b;
            return Float.floatToRawIntBits(xs3Var.a(f - ((int) (j2 & 4294967295L)), vohVar.d - f, Float.intBitsToFloat((int) (jG0 & 4294967295L)))) & 4294967295L;
        }
        if (iOrdinal != 1) {
            h9o.p();
            return 0L;
        }
        xs3 xs3Var2 = this.r;
        if (xs3Var2 == null) {
            xs3Var2 = (xs3) z4o.N(this, zs3.a);
        }
        float f2 = vohVar.a;
        return Float.floatToRawIntBits(xs3Var2.a(f2 - ((int) (j2 >> 32)), vohVar.c - f2, Float.intBitsToFloat((int) (jG0 >> 32)))) << 32;
    }

    @Override // defpackage.xfd
    public final void a(long j) {
        int iB;
        long jU0 = U0();
        this.v = j;
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 0) {
            iB = Intrinsics.b((int) (j & 4294967295L), (int) (jU0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            iB = Intrinsics.b((int) (j >> 32), (int) (jU0 >> 32));
        }
        if (iB < 0) {
            long j2 = !this.q ? this.o == fsf.a ? (((int) (jU0 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L : (((int) (jU0 >> 32)) - ((int) (j >> 32))) << 32 : 0L;
            voh vohVar = (voh) this.s.invoke();
            if (vohVar == null || this.w || this.u || !V0(this, vohVar, jU0, 0L, 2) || V0(this, vohVar, 0L, j2, 1)) {
                return;
            }
            this.u = true;
            W0(j2);
        }
    }
}
