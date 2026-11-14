package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e5i extends va5 {
    public static final j9h r = new j9h((byte) 21);
    public final r0o d;
    public final float e;
    public final float f;
    public final x1m g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final ke7 k;
    public final d5i l;
    public final a5i m;
    public final ke7 n;
    public final d5i o;
    public final a5i p;
    public final boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    public e5i(String str, float[] fArr, r0o r0oVar, double d, float f, float f2, int i) {
        ke7 b5iVar;
        ke7 b5iVar2;
        if (d == 1.0d) {
            b5iVar2 = r;
            b5iVar = b5iVar2;
        } else {
            b5iVar = new b5i(d, (byte) 0);
            b5iVar2 = new b5i(d, (byte) 1);
        }
        this(str, fArr, r0oVar, null, b5iVar, b5iVar2, f, f2, new x1m(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }

    public e5i(String str, float[] fArr, r0o r0oVar, final x1m x1mVar, int i) {
        double d;
        ke7 ke7Var;
        ke7 ke7Var2;
        double d2 = x1mVar.a;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = d2 == -3.0d;
        double d3 = x1mVar.g;
        double d4 = x1mVar.f;
        if (z) {
            d = -3.0d;
            final byte b3 = 4;
            ke7Var = new ke7() { // from class: c5i
                @Override // defpackage.ke7
                public final double d(double d5) {
                    byte b4 = b3;
                    x1m x1mVar2 = x1mVar;
                    switch (b4) {
                        case 0:
                            float[] fArr2 = xa5.a;
                            return xa5.a(x1mVar2, d5);
                        case 1:
                            float[] fArr3 = xa5.a;
                            return xa5.c(x1mVar2, d5);
                        case 2:
                            double d6 = x1mVar2.b;
                            return d5 >= x1mVar2.e ? Math.pow((d6 * d5) + x1mVar2.c, x1mVar2.a) : x1mVar2.d * d5;
                        case 3:
                            double d7 = x1mVar2.b;
                            double d8 = x1mVar2.c;
                            double d9 = x1mVar2.d;
                            return d5 >= x1mVar2.e ? Math.pow((d7 * d5) + d8, x1mVar2.a) + x1mVar2.f : (d9 * d5) + x1mVar2.g;
                        case 4:
                            float[] fArr4 = xa5.a;
                            return xa5.b(x1mVar2, d5);
                        case 5:
                            float[] fArr5 = xa5.a;
                            return xa5.d(x1mVar2, d5);
                        case 6:
                            double d10 = x1mVar2.b;
                            double d11 = x1mVar2.c;
                            double d12 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d12 ? (Math.pow(d5, 1.0d / x1mVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = x1mVar2.b;
                            double d14 = x1mVar2.c;
                            double d15 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d15 ? (Math.pow(d5 - x1mVar2.f, 1.0d / x1mVar2.a) - d14) / d13 : (d5 - x1mVar2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final byte b4 = 5;
                ke7Var = new ke7() { // from class: c5i
                    @Override // defpackage.ke7
                    public final double d(double d5) {
                        byte b42 = b4;
                        x1m x1mVar2 = x1mVar;
                        switch (b42) {
                            case 0:
                                float[] fArr2 = xa5.a;
                                return xa5.a(x1mVar2, d5);
                            case 1:
                                float[] fArr3 = xa5.a;
                                return xa5.c(x1mVar2, d5);
                            case 2:
                                double d6 = x1mVar2.b;
                                return d5 >= x1mVar2.e ? Math.pow((d6 * d5) + x1mVar2.c, x1mVar2.a) : x1mVar2.d * d5;
                            case 3:
                                double d7 = x1mVar2.b;
                                double d8 = x1mVar2.c;
                                double d9 = x1mVar2.d;
                                return d5 >= x1mVar2.e ? Math.pow((d7 * d5) + d8, x1mVar2.a) + x1mVar2.f : (d9 * d5) + x1mVar2.g;
                            case 4:
                                float[] fArr4 = xa5.a;
                                return xa5.b(x1mVar2, d5);
                            case 5:
                                float[] fArr5 = xa5.a;
                                return xa5.d(x1mVar2, d5);
                            case 6:
                                double d10 = x1mVar2.b;
                                double d11 = x1mVar2.c;
                                double d12 = x1mVar2.d;
                                return d5 >= x1mVar2.e * d12 ? (Math.pow(d5, 1.0d / x1mVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = x1mVar2.b;
                                double d14 = x1mVar2.c;
                                double d15 = x1mVar2.d;
                                return d5 >= x1mVar2.e * d15 ? (Math.pow(d5 - x1mVar2.f, 1.0d / x1mVar2.a) - d14) / d13 : (d5 - x1mVar2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final byte b5 = 6;
                ke7Var = new ke7() { // from class: c5i
                    @Override // defpackage.ke7
                    public final double d(double d5) {
                        byte b42 = b5;
                        x1m x1mVar2 = x1mVar;
                        switch (b42) {
                            case 0:
                                float[] fArr2 = xa5.a;
                                return xa5.a(x1mVar2, d5);
                            case 1:
                                float[] fArr3 = xa5.a;
                                return xa5.c(x1mVar2, d5);
                            case 2:
                                double d6 = x1mVar2.b;
                                return d5 >= x1mVar2.e ? Math.pow((d6 * d5) + x1mVar2.c, x1mVar2.a) : x1mVar2.d * d5;
                            case 3:
                                double d7 = x1mVar2.b;
                                double d8 = x1mVar2.c;
                                double d9 = x1mVar2.d;
                                return d5 >= x1mVar2.e ? Math.pow((d7 * d5) + d8, x1mVar2.a) + x1mVar2.f : (d9 * d5) + x1mVar2.g;
                            case 4:
                                float[] fArr4 = xa5.a;
                                return xa5.b(x1mVar2, d5);
                            case 5:
                                float[] fArr5 = xa5.a;
                                return xa5.d(x1mVar2, d5);
                            case 6:
                                double d10 = x1mVar2.b;
                                double d11 = x1mVar2.c;
                                double d12 = x1mVar2.d;
                                return d5 >= x1mVar2.e * d12 ? (Math.pow(d5, 1.0d / x1mVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = x1mVar2.b;
                                double d14 = x1mVar2.c;
                                double d15 = x1mVar2.d;
                                return d5 >= x1mVar2.e * d15 ? (Math.pow(d5 - x1mVar2.f, 1.0d / x1mVar2.a) - d14) / d13 : (d5 - x1mVar2.g) / d15;
                        }
                    }
                };
            } else {
                final byte b6 = 7;
                ke7Var = new ke7() { // from class: c5i
                    @Override // defpackage.ke7
                    public final double d(double d5) {
                        byte b42 = b6;
                        x1m x1mVar2 = x1mVar;
                        switch (b42) {
                            case 0:
                                float[] fArr2 = xa5.a;
                                return xa5.a(x1mVar2, d5);
                            case 1:
                                float[] fArr3 = xa5.a;
                                return xa5.c(x1mVar2, d5);
                            case 2:
                                double d6 = x1mVar2.b;
                                return d5 >= x1mVar2.e ? Math.pow((d6 * d5) + x1mVar2.c, x1mVar2.a) : x1mVar2.d * d5;
                            case 3:
                                double d7 = x1mVar2.b;
                                double d8 = x1mVar2.c;
                                double d9 = x1mVar2.d;
                                return d5 >= x1mVar2.e ? Math.pow((d7 * d5) + d8, x1mVar2.a) + x1mVar2.f : (d9 * d5) + x1mVar2.g;
                            case 4:
                                float[] fArr4 = xa5.a;
                                return xa5.b(x1mVar2, d5);
                            case 5:
                                float[] fArr5 = xa5.a;
                                return xa5.d(x1mVar2, d5);
                            case 6:
                                double d10 = x1mVar2.b;
                                double d11 = x1mVar2.c;
                                double d12 = x1mVar2.d;
                                return d5 >= x1mVar2.e * d12 ? (Math.pow(d5, 1.0d / x1mVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = x1mVar2.b;
                                double d14 = x1mVar2.c;
                                double d15 = x1mVar2.d;
                                return d5 >= x1mVar2.e * d15 ? (Math.pow(d5 - x1mVar2.f, 1.0d / x1mVar2.a) - d14) / d13 : (d5 - x1mVar2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            ke7Var2 = new ke7() { // from class: c5i
                @Override // defpackage.ke7
                public final double d(double d5) {
                    byte b42 = b;
                    x1m x1mVar2 = x1mVar;
                    switch (b42) {
                        case 0:
                            float[] fArr2 = xa5.a;
                            return xa5.a(x1mVar2, d5);
                        case 1:
                            float[] fArr3 = xa5.a;
                            return xa5.c(x1mVar2, d5);
                        case 2:
                            double d6 = x1mVar2.b;
                            return d5 >= x1mVar2.e ? Math.pow((d6 * d5) + x1mVar2.c, x1mVar2.a) : x1mVar2.d * d5;
                        case 3:
                            double d7 = x1mVar2.b;
                            double d8 = x1mVar2.c;
                            double d9 = x1mVar2.d;
                            return d5 >= x1mVar2.e ? Math.pow((d7 * d5) + d8, x1mVar2.a) + x1mVar2.f : (d9 * d5) + x1mVar2.g;
                        case 4:
                            float[] fArr4 = xa5.a;
                            return xa5.b(x1mVar2, d5);
                        case 5:
                            float[] fArr5 = xa5.a;
                            return xa5.d(x1mVar2, d5);
                        case 6:
                            double d10 = x1mVar2.b;
                            double d11 = x1mVar2.c;
                            double d12 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d12 ? (Math.pow(d5, 1.0d / x1mVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = x1mVar2.b;
                            double d14 = x1mVar2.c;
                            double d15 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d15 ? (Math.pow(d5 - x1mVar2.f, 1.0d / x1mVar2.a) - d14) / d13 : (d5 - x1mVar2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            ke7Var2 = new ke7() { // from class: c5i
                @Override // defpackage.ke7
                public final double d(double d5) {
                    byte b42 = b2;
                    x1m x1mVar2 = x1mVar;
                    switch (b42) {
                        case 0:
                            float[] fArr2 = xa5.a;
                            return xa5.a(x1mVar2, d5);
                        case 1:
                            float[] fArr3 = xa5.a;
                            return xa5.c(x1mVar2, d5);
                        case 2:
                            double d6 = x1mVar2.b;
                            return d5 >= x1mVar2.e ? Math.pow((d6 * d5) + x1mVar2.c, x1mVar2.a) : x1mVar2.d * d5;
                        case 3:
                            double d7 = x1mVar2.b;
                            double d8 = x1mVar2.c;
                            double d9 = x1mVar2.d;
                            return d5 >= x1mVar2.e ? Math.pow((d7 * d5) + d8, x1mVar2.a) + x1mVar2.f : (d9 * d5) + x1mVar2.g;
                        case 4:
                            float[] fArr4 = xa5.a;
                            return xa5.b(x1mVar2, d5);
                        case 5:
                            float[] fArr5 = xa5.a;
                            return xa5.d(x1mVar2, d5);
                        case 6:
                            double d10 = x1mVar2.b;
                            double d11 = x1mVar2.c;
                            double d12 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d12 ? (Math.pow(d5, 1.0d / x1mVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = x1mVar2.b;
                            double d14 = x1mVar2.c;
                            double d15 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d15 ? (Math.pow(d5 - x1mVar2.f, 1.0d / x1mVar2.a) - d14) / d13 : (d5 - x1mVar2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final byte b7 = 2;
            ke7Var2 = new ke7() { // from class: c5i
                @Override // defpackage.ke7
                public final double d(double d5) {
                    byte b42 = b7;
                    x1m x1mVar2 = x1mVar;
                    switch (b42) {
                        case 0:
                            float[] fArr2 = xa5.a;
                            return xa5.a(x1mVar2, d5);
                        case 1:
                            float[] fArr3 = xa5.a;
                            return xa5.c(x1mVar2, d5);
                        case 2:
                            double d6 = x1mVar2.b;
                            return d5 >= x1mVar2.e ? Math.pow((d6 * d5) + x1mVar2.c, x1mVar2.a) : x1mVar2.d * d5;
                        case 3:
                            double d7 = x1mVar2.b;
                            double d8 = x1mVar2.c;
                            double d9 = x1mVar2.d;
                            return d5 >= x1mVar2.e ? Math.pow((d7 * d5) + d8, x1mVar2.a) + x1mVar2.f : (d9 * d5) + x1mVar2.g;
                        case 4:
                            float[] fArr4 = xa5.a;
                            return xa5.b(x1mVar2, d5);
                        case 5:
                            float[] fArr5 = xa5.a;
                            return xa5.d(x1mVar2, d5);
                        case 6:
                            double d10 = x1mVar2.b;
                            double d11 = x1mVar2.c;
                            double d12 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d12 ? (Math.pow(d5, 1.0d / x1mVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = x1mVar2.b;
                            double d14 = x1mVar2.c;
                            double d15 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d15 ? (Math.pow(d5 - x1mVar2.f, 1.0d / x1mVar2.a) - d14) / d13 : (d5 - x1mVar2.g) / d15;
                    }
                }
            };
        } else {
            final byte b8 = 3;
            ke7Var2 = new ke7() { // from class: c5i
                @Override // defpackage.ke7
                public final double d(double d5) {
                    byte b42 = b8;
                    x1m x1mVar2 = x1mVar;
                    switch (b42) {
                        case 0:
                            float[] fArr2 = xa5.a;
                            return xa5.a(x1mVar2, d5);
                        case 1:
                            float[] fArr3 = xa5.a;
                            return xa5.c(x1mVar2, d5);
                        case 2:
                            double d6 = x1mVar2.b;
                            return d5 >= x1mVar2.e ? Math.pow((d6 * d5) + x1mVar2.c, x1mVar2.a) : x1mVar2.d * d5;
                        case 3:
                            double d7 = x1mVar2.b;
                            double d8 = x1mVar2.c;
                            double d9 = x1mVar2.d;
                            return d5 >= x1mVar2.e ? Math.pow((d7 * d5) + d8, x1mVar2.a) + x1mVar2.f : (d9 * d5) + x1mVar2.g;
                        case 4:
                            float[] fArr4 = xa5.a;
                            return xa5.b(x1mVar2, d5);
                        case 5:
                            float[] fArr5 = xa5.a;
                            return xa5.d(x1mVar2, d5);
                        case 6:
                            double d10 = x1mVar2.b;
                            double d11 = x1mVar2.c;
                            double d12 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d12 ? (Math.pow(d5, 1.0d / x1mVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = x1mVar2.b;
                            double d14 = x1mVar2.c;
                            double d15 = x1mVar2.d;
                            return d5 >= x1mVar2.e * d15 ? (Math.pow(d5 - x1mVar2.f, 1.0d / x1mVar2.a) - d14) / d13 : (d5 - x1mVar2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, r0oVar, null, ke7Var, ke7Var2, 0.0f, 1.0f, x1mVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e5i(java.lang.String r36, float[] r37, defpackage.r0o r38, float[] r39, defpackage.ke7 r40, defpackage.ke7 r41, float r42, float r43, defpackage.x1m r44, int r45) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e5i.<init>(java.lang.String, float[], r0o, float[], ke7, ke7, float, float, x1m, int):void");
    }

    @Override // defpackage.va5
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.va5
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.va5
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.va5
    public final long d(float f, float f2, float f3) {
        double d = f;
        a5i a5iVar = this.p;
        float fD = (float) a5iVar.d(d);
        float fD2 = (float) a5iVar.d(f2);
        float fD3 = (float) a5iVar.d(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fD3) + (fArr[3] * fD2) + (fArr[0] * fD);
        float f5 = (fArr[7] * fD3) + (fArr[4] * fD2) + (fArr[1] * fD);
        return (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
    }

    @Override // defpackage.va5
    public final float e(float f, float f2, float f3) {
        double d = f;
        a5i a5iVar = this.p;
        float fD = (float) a5iVar.d(d);
        float fD2 = (float) a5iVar.d(f2);
        float fD3 = (float) a5iVar.d(f3);
        float[] fArr = this.i;
        return (fArr[8] * fD3) + (fArr[5] * fD2) + (fArr[2] * fD);
    }

    @Override // defpackage.va5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e5i.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        e5i e5iVar = (e5i) obj;
        if (Float.compare(e5iVar.e, this.e) != 0 || Float.compare(e5iVar.f, this.f) != 0 || !Intrinsics.a(this.d, e5iVar.d) || !Arrays.equals(this.h, e5iVar.h)) {
            return false;
        }
        x1m x1mVar = e5iVar.g;
        x1m x1mVar2 = this.g;
        if (x1mVar2 != null) {
            return Intrinsics.a(x1mVar2, x1mVar);
        }
        if (x1mVar == null) {
            return true;
        }
        if (Intrinsics.a(this.k, e5iVar.k)) {
            return Intrinsics.a(this.n, e5iVar.n);
        }
        return false;
    }

    @Override // defpackage.va5
    public final long f(float f, float f2, float f3, float f4, va5 va5Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        a5i a5iVar = this.m;
        return cs5.b((float) a5iVar.d(f5), (float) a5iVar.d(f6), (float) a5iVar.d(f7), f4, va5Var);
    }

    @Override // defpackage.va5
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        x1m x1mVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (x1mVar != null ? x1mVar.hashCode() : 0);
        if (x1mVar != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }
}
