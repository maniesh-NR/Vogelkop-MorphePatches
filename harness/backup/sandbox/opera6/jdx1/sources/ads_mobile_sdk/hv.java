package ads_mobile_sdk;

import defpackage.ocp;
import defpackage.t3p;
import defpackage.v9g;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hv extends v9g {
    public final byte[] d;
    public final int e;
    public int f;
    public int i;
    public int j = Integer.MAX_VALUE;
    public int g = 0;

    public hv(byte[] bArr, int i) {
        this.d = bArr;
        this.e = i;
        this.f = i;
    }

    public final int A() throws bj1 {
        int i = this.g;
        int i2 = i + 1;
        byte[] bArr = this.d;
        int i3 = bArr[i];
        if (i3 < 0) {
            int i4 = i + 2;
            int i5 = i3 ^ (bArr[i2] << 7);
            if (i5 < 0) {
                i3 = i5 ^ (-128);
            } else {
                i2 = i + 3;
                int i6 = i5 ^ (bArr[i4] << 14);
                if (i6 >= 0) {
                    i3 = i6 ^ 16256;
                } else {
                    i4 = i + 4;
                    int i7 = i6 ^ (bArr[i2] << 21);
                    if (i7 < 0) {
                        i3 = i7 ^ (-2080896);
                    } else {
                        i2 = i + 5;
                        int i8 = bArr[i4];
                        i3 = (i7 ^ (i8 << 28)) ^ 266354560;
                        if (i8 < 0) {
                            i4 = i + 6;
                            if (bArr[i2] < 0) {
                                i2 = i + 7;
                                if (bArr[i4] < 0) {
                                    i4 = i + 8;
                                    if (bArr[i2] < 0) {
                                        i2 = i + 9;
                                        if (bArr[i4] < 0) {
                                            int i9 = i + 10;
                                            if (bArr[i2] < 0) {
                                                t3p.j("CodedInputStream encountered a malformed varint.");
                                                return 0;
                                            }
                                            i2 = i9;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i2 = i4;
        }
        this.g = i2;
        return i3;
    }

    public final long B() throws bj1 {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.g;
        int i3 = this.f;
        byte[] bArr = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i2 + 3;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j3 = i8 ^ 16256;
                        i5 = i7;
                    } else {
                        i5 = i2 + 4;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            int i10 = i2 + 5;
                            long j4 = i9 ^ (bArr[i5] << 28);
                            if (j4 >= 0) {
                                j2 = 266354560;
                            } else {
                                i5 = i2 + 6;
                                long j5 = j4 ^ (bArr[i10] << 35);
                                if (j5 < 0) {
                                    j = -34093383808L;
                                } else {
                                    i10 = i2 + 7;
                                    j4 = j5 ^ (bArr[i5] << 42);
                                    if (j4 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j5 = j4 ^ (bArr[i10] << 49);
                                        if (j5 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            i10 = i2 + 9;
                                            j4 = j5 ^ (bArr[i5] << 56);
                                            if (j4 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i5 = i2 + 10;
                                                j5 = j4 ^ (bArr[i10] << 63);
                                                if (j5 >= 0) {
                                                    j = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j ^ j5;
                            }
                            j3 = j4 ^ j2;
                            i5 = i10;
                        }
                    }
                    this.g = i5;
                    return j3;
                }
                i = i6 ^ (-128);
                j3 = i;
                this.g = i5;
                return j3;
            }
        }
        long j6 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            int i12 = this.g;
            if (i12 == this.f) {
                t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.g = i12 + 1;
            j6 |= (r1 & Byte.MAX_VALUE) << i11;
            if ((bArr[i12] & 128) == 0) {
                return j6;
            }
        }
        t3p.j("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // defpackage.v9g
    public final int a() {
        return this.g;
    }

    @Override // defpackage.v9g
    public final void a(int i) throws bj1 {
        if (this.i == i) {
            return;
        }
        t3p.j("Protocol message end-group tag did not match expected tag.");
    }

    @Override // defpackage.v9g
    public final boolean b() {
        return this.g == this.f;
    }

    @Override // defpackage.v9g
    public final void c(int i) {
        this.j = i;
        int i2 = this.e;
        if (i <= i2) {
            this.f = i;
        } else {
            this.f = i2;
        }
    }

    @Override // defpackage.v9g
    public final boolean c() {
        return B() != 0;
    }

    @Override // defpackage.v9g
    public final int d(int i) throws bj1 {
        if (i < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.g;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - i2) {
                t3p.j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                return 0;
            }
        }
        int i4 = this.j;
        if (i3 > i4) {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.j = i3;
        int i5 = this.e;
        if (i3 <= i5) {
            this.f = i3;
            return i4;
        }
        this.f = i5;
        return i4;
    }

    @Override // defpackage.v9g
    public final fr d() throws bj1 {
        byte[] bArrCopyOfRange;
        int iZ = z();
        byte[] bArr = this.d;
        if (iZ > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iZ <= i - i2) {
                fr frVarB = hr.b(i2, iZ, bArr);
                this.g += iZ;
                return frVarB;
            }
        }
        if (iZ == 0) {
            return hr.b;
        }
        if (iZ > 0) {
            int i3 = this.f;
            int i4 = this.g;
            if (iZ > i3 - i4) {
                t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
            int i5 = iZ + i4;
            this.g = i5;
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        } else {
            if (iZ != 0) {
                t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            bArrCopyOfRange = yb1.a;
        }
        fr frVar = hr.b;
        return bArrCopyOfRange.length == 0 ? hr.b : new fr(bArrCopyOfRange);
    }

    @Override // defpackage.v9g
    public final double e() {
        return Double.longBitsToDouble(w());
    }

    @Override // defpackage.v9g
    public final boolean e(int i) throws bj1 {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                f(8);
                return true;
            }
            if (i2 == 2) {
                f(z());
                return true;
            }
            if (i2 == 3) {
                u();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (i2 == 5) {
                f(4);
                return true;
            }
            t3p.c();
            return false;
        }
        int i3 = this.f - this.g;
        byte[] bArr = this.d;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            t3p.j("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = this.g;
            if (i7 == this.f) {
                t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.g = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        t3p.j("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // defpackage.v9g
    public final int f() {
        return z();
    }

    public final void f(int i) throws bj1 {
        if (i < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i2 = this.f;
        int i3 = this.g;
        if (i <= i2 - i3) {
            this.g = i3 + i;
        } else {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.v9g
    public final int g() {
        return v();
    }

    @Override // defpackage.v9g
    public final long h() {
        return w();
    }

    @Override // defpackage.v9g
    public final float i() {
        return Float.intBitsToFloat(v());
    }

    @Override // defpackage.v9g
    public final int j() {
        return z();
    }

    @Override // defpackage.v9g
    public final long k() {
        return B();
    }

    @Override // defpackage.v9g
    public final int l() {
        return v();
    }

    @Override // defpackage.v9g
    public final long m() {
        return w();
    }

    @Override // defpackage.v9g
    public final int n() {
        return v9g.b(z());
    }

    @Override // defpackage.v9g
    public final long o() {
        return v9g.a(B());
    }

    @Override // defpackage.v9g
    public final String p() throws bj1 {
        int iZ = z();
        if (iZ > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iZ <= i - i2) {
                String str = new String(this.d, i2, iZ, StandardCharsets.UTF_8);
                this.g += iZ;
                return str;
            }
        }
        if (iZ == 0) {
            return "";
        }
        if (iZ < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.v9g
    public final String q() throws bj1 {
        int iZ = z();
        String strA = "";
        if (iZ > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iZ <= i - i2) {
                if (iZ == 0) {
                    ocp ocpVar = sm3.a;
                } else {
                    strA = sm3.a.a(this.d, i2, iZ);
                }
                this.g += iZ;
                return strA;
            }
        }
        if (iZ == 0) {
            return "";
        }
        if (iZ <= 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // defpackage.v9g
    public final int r() throws bj1 {
        if (b()) {
            this.i = 0;
            return 0;
        }
        int iZ = z();
        this.i = iZ;
        if ((iZ >>> 3) != 0) {
            return iZ;
        }
        t3p.j("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.v9g
    public final int s() {
        return z();
    }

    @Override // defpackage.v9g
    public final long t() {
        return B();
    }

    public final int v() throws bj1 {
        int i = this.g;
        if (this.f - i < 4) {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final long w() throws bj1 {
        int i = this.g;
        if (this.f - i < 8) {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int z() throws bj1 {
        try {
            int iA = A();
            if (this.g <= this.f) {
                return iA;
            }
            throw new bj1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (bj1 e) {
            if (this.g <= this.f) {
                throw e;
            }
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        } catch (IndexOutOfBoundsException unused) {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
    }
}
