package defpackage;

/* loaded from: classes.dex */
public final class u95 {
    public static final long b = cs5.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        cs5.d(4282664004L);
        cs5.d(4287137928L);
        cs5.d(4291611852L);
        c = cs5.d(4294967295L);
        d = cs5.d(4294901760L);
        cs5.d(4278255360L);
        e = cs5.d(4278190335L);
        cs5.d(4294967040L);
        cs5.d(4278255615L);
        cs5.d(4294902015L);
        f = cs5.c(0);
        float[] fArr = xa5.a;
        g = cs5.b(0.0f, 0.0f, 0.0f, 0.0f, xa5.u);
    }

    public /* synthetic */ u95(long j) {
        this.a = j;
    }

    public static final long a(long j, va5 va5Var) {
        zm5 zm5VarP;
        va5 va5VarE = e(j);
        int i = va5VarE.c;
        int i2 = va5Var.c;
        if ((i | i2) < 0) {
            zm5VarP = ui6.p(va5VarE, va5Var);
        } else {
            jde jdeVar = an5.a;
            int i3 = i | (i2 << 6);
            Object objE = jdeVar.e(i3);
            if (objE == null) {
                objE = ui6.p(va5VarE, va5Var);
                jdeVar.i(i3, objE);
            }
            zm5VarP = (zm5) objE;
        }
        return zm5VarP.a(j);
    }

    public static long b(long j, float f2) {
        return cs5.b(g(j), f(j), d(j), f2, e(j));
    }

    public static final float c(long j) {
        float fR;
        float f2;
        long j2 = 63 & j;
        igm igmVar = jgm.b;
        if (j2 == 0) {
            fR = (float) a4h.r((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fR = (float) a4h.r((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fR / f2;
    }

    public static final float d(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        igm igmVar = jgm.b;
        if (j2 == 0) {
            return ((float) a4h.r((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - 0.5f;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i4 << 16) | (i3 << 23) | i2);
    }

    public static final va5 e(long j) {
        float[] fArr = xa5.a;
        igm igmVar = jgm.b;
        return xa5.y[(int) (j & 63)];
    }

    public static final float f(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        igm igmVar = jgm.b;
        if (j2 == 0) {
            return ((float) a4h.r((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - 0.5f;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i4 << 16) | (i3 << 23) | i2);
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        igm igmVar = jgm.b;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) a4h.r(j3 & 255)) / 255.0f;
        }
        short s = (short) (j3 & 65535);
        int i4 = 32768 & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - 0.5f;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i4 << 16) | (i3 << 23) | i2);
    }

    public static String h(long j) {
        float fG = g(j);
        float f2 = f(j);
        float fD = d(j);
        float fC = c(j);
        String str = e(j).a;
        StringBuilder sbP = am2.p("Color(", fG, ", ", f2, ", ");
        sbP.append(fD);
        sbP.append(", ");
        sbP.append(fC);
        sbP.append(", ");
        return z1m.l(sbP, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u95) {
            return this.a == ((u95) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        igm igmVar = jgm.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
