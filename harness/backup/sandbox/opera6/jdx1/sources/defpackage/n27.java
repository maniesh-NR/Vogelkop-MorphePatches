package defpackage;

/* loaded from: classes.dex */
public interface n27 {
    default int M(float f) {
        float fO0 = o0(f);
        if (Float.isInfinite(fO0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fO0);
    }

    default float Q(long j) {
        if (!skl.a(rkl.b(j), 4294967296L)) {
            c8b.b("Only Sp can convert to Px");
        }
        return o0(o(j));
    }

    float b();

    default long j(float f) {
        float[] fArr = ei9.a;
        if (n0() < 1.03f) {
            return rih.s(4294967296L, f / n0());
        }
        di9 di9VarA = ei9.a(n0());
        return rih.s(4294967296L, di9VarA != null ? di9VarA.a(f) : f / n0());
    }

    default float j0(int i) {
        return i / b();
    }

    default long k(long j) {
        if (j != 9205357640488583168L) {
            return fsp.b(k0(Float.intBitsToFloat((int) (j >> 32))), k0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float k0(float f) {
        return f / b();
    }

    float n0();

    default float o(long j) {
        if (!skl.a(rkl.b(j), 4294967296L)) {
            c8b.b("Only Sp can convert to Px");
        }
        float[] fArr = ei9.a;
        if (n0() < 1.03f) {
            return n0() * rkl.c(j);
        }
        di9 di9VarA = ei9.a(n0());
        if (di9VarA != null) {
            return di9VarA.b(rkl.c(j));
        }
        return n0() * rkl.c(j);
    }

    default float o0(float f) {
        return b() * f;
    }

    default int t0(long j) {
        return Math.round(Q(j));
    }

    default long u(float f) {
        return j(k0(f));
    }

    default long y0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fO0 = o0(kh7.b(j));
        float fO02 = o0(kh7.a(j));
        return (Float.floatToRawIntBits(fO0) << 32) | (Float.floatToRawIntBits(fO02) & 4294967295L);
    }
}
