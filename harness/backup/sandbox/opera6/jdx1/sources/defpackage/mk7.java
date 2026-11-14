package defpackage;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public interface mk7 extends n27 {
    static void E0(mk7 mk7Var, dz3 dz3Var, long j, long j2, float f, nk7 nk7Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = l0(mk7Var.e(), j3);
        }
        mk7Var.P(dz3Var, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? a39.a : nk7Var);
    }

    static void F0(mk7 mk7Var, d91 d91Var, long j, float f, nk7 nk7Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        mk7Var.T(d91Var, j, f, nk7Var);
    }

    static void I(mk7 mk7Var, long j, float f, long j2, nk7 nk7Var, int i) {
        if ((i & 4) != 0) {
            j2 = mk7Var.w0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            nk7Var = a39.a;
        }
        mk7Var.h0(j, f, j3, nk7Var);
    }

    static void O(mk7 mk7Var, long j, long j2, long j3, long j4, nk7 nk7Var, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        mk7Var.H(j, j5, (i & 4) != 0 ? l0(mk7Var.e(), j5) : j3, j4, (i & 16) != 0 ? a39.a : nk7Var);
    }

    static void a0(o3c o3cVar, nvj nvjVar, long j, long j2, long j3, nk7 nk7Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        o3cVar.d(nvjVar, j4, (i & 4) != 0 ? l0(o3cVar.a.e(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? a39.a : nk7Var);
    }

    static void e0(mk7 mk7Var, j71 j71Var, long j, long j2, long j3, float f, kh3 kh3Var, int i, int i2) {
        mk7Var.L(j71Var, (i2 & 2) != 0 ? 0L : j, j2, (i2 & 16) != 0 ? j2 : j3, (i2 & 32) != 0 ? 1.0f : f, (i2 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? null : kh3Var, (i2 & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? 1 : i);
    }

    static long l0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    static void m0(mk7 mk7Var, d91 d91Var, dz3 dz3Var, float f, nk7 nk7Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            nk7Var = a39.a;
        }
        mk7Var.S(d91Var, dz3Var, f2, nk7Var, (i & 32) != 0 ? 3 : 0);
    }

    static void p0(mk7 mk7Var, long j, long j2, long j3, float f, int i) {
        mk7Var.q(j, j2, j3, f, (i & 16) != 0 ? 0 : 1);
    }

    static void s(mk7 mk7Var, long j, float f, float f2, long j2, long j3, float f3, nk7 nk7Var, int i) {
        mk7Var.m(j, f, f2, j2, j3, (i & 64) != 0 ? 1.0f : f3, nk7Var);
    }

    static void u0(o3c o3cVar, j71 j71Var, kh3 kh3Var) {
        uh4 uh4Var = o3cVar.a;
        uh4Var.a.c.c(j71Var, uh4Var.c(null, a39.a, 1.0f, kh3Var, 3, 1));
    }

    static void z0(mk7 mk7Var, long j, long j2, float f, int i) {
        if ((i & 4) != 0) {
            j2 = l0(mk7Var.e(), 0L);
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        mk7Var.C0(j, 0L, j3, f, (i & 64) != 0 ? 3 : 0);
    }

    void C0(long j, long j2, long j3, float f, int i);

    void H(long j, long j2, long j3, long j4, nk7 nk7Var);

    void L(j71 j71Var, long j, long j2, long j3, float f, kh3 kh3Var, int i);

    void P(dz3 dz3Var, long j, long j2, float f, nk7 nk7Var);

    void S(d91 d91Var, dz3 dz3Var, float f, nk7 nk7Var, int i);

    void T(d91 d91Var, long j, float f, nk7 nk7Var);

    default long e() {
        return s0().D();
    }

    d2c getLayoutDirection();

    void h0(long j, float f, long j2, nk7 nk7Var);

    void m(long j, float f, float f2, long j2, long j3, float f3, nk7 nk7Var);

    void q(long j, long j2, long j3, float f, int i);

    d5o s0();

    default long w0() {
        return mfh.o(s0().D());
    }
}
