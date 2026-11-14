package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o75 extends s75 {
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public o75(byte[] bArr, int i, int i2, boolean z) {
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }

    @Override // defpackage.s75
    public final String A() throws cjb {
        int iJ = J();
        if (iJ > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iJ <= i - i2) {
                String str = new String(this.d, i2, iJ, jfb.a);
                this.g += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw cjb.i();
        }
        throw cjb.j();
    }

    @Override // defpackage.s75
    public final String B() throws cjb {
        int iJ = J();
        if (iJ > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iJ <= i - i2) {
                String strG = oym.a.g(this.d, i2, iJ);
                this.g += iJ;
                return strG;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw cjb.i();
        }
        throw cjb.j();
    }

    @Override // defpackage.s75
    public final int C() throws cjb {
        if (g()) {
            this.i = 0;
            return 0;
        }
        int iJ = J();
        this.i = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new cjb("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.s75
    public final int D() {
        return J();
    }

    @Override // defpackage.s75
    public final long E() {
        return K();
    }

    @Override // defpackage.s75
    public final boolean F(int i) throws cjb {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                N(8);
                return true;
            }
            if (i2 == 2) {
                N(J());
                return true;
            }
            if (i2 == 3) {
                G();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw cjb.g();
            }
            N(4);
            return true;
        }
        int i4 = this.e - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw cjb.h();
        }
        while (i3 < 10) {
            int i6 = this.g;
            if (i6 == this.e) {
                throw cjb.j();
            }
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw cjb.h();
        return true;
    }

    public final int H() throws cjb {
        int i = this.g;
        if (this.e - i < 4) {
            throw cjb.j();
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final long I() throws cjb {
        int i = this.g;
        if (this.e - i < 8) {
            throw cjb.j();
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r3[r2] < 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int J() {
        /*
            r6 = this;
            int r0 = r6.g
            int r1 = r6.e
            if (r1 == r0) goto L68
            int r2 = r0 + 1
            byte[] r3 = r6.d
            r4 = r3[r0]
            if (r4 < 0) goto L11
            r6.g = r2
            return r4
        L11:
            int r1 = r1 - r2
            r5 = 9
            if (r1 < r5) goto L68
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r4 = r4 ^ r2
            if (r4 >= 0) goto L22
            r4 = r4 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6e
        L22:
            int r2 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            r4 = r4 ^ r1
            if (r4 < 0) goto L2f
            r4 = r4 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r2
            goto L6e
        L2f:
            int r1 = r0 + 4
            r2 = r3[r2]
            int r2 = r2 << 21
            r4 = r4 ^ r2
            if (r4 >= 0) goto L3d
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r4 = r4 ^ r0
            goto L6e
        L3d:
            int r2 = r0 + 5
            r1 = r3[r1]
            int r5 = r1 << 28
            r4 = r4 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r4 = r4 ^ r5
            if (r1 >= 0) goto L2d
            int r1 = r0 + 6
            r2 = r3[r2]
            if (r2 >= 0) goto L6e
            int r2 = r0 + 7
            r1 = r3[r1]
            if (r1 >= 0) goto L2d
            int r1 = r0 + 8
            r2 = r3[r2]
            if (r2 >= 0) goto L6e
            int r2 = r0 + 9
            r1 = r3[r1]
            if (r1 >= 0) goto L2d
            int r1 = r0 + 10
            r0 = r3[r2]
            if (r0 >= 0) goto L6e
        L68:
            long r0 = r6.L()
            int r6 = (int) r0
            return r6
        L6e:
            r6.g = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o75.J():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long K() {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o75.K():long");
    }

    public final long L() throws cjb {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                throw cjb.j();
            }
            this.g = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.d[i2] & 128) == 0) {
                return j;
            }
        }
        throw cjb.h();
    }

    public final void M() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = i - this.h;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void N(int i) throws cjb {
        if (i < 0) {
            throw cjb.i();
        }
        int i2 = this.e;
        int i3 = this.g;
        if (i > i2 - i3) {
            throw cjb.j();
        }
        this.g = i3 + i;
    }

    @Override // defpackage.s75
    public final void a(int i) throws cjb {
        if (this.i != i) {
            throw new cjb("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.s75
    public final int f() {
        return this.g - this.h;
    }

    @Override // defpackage.s75
    public final boolean g() {
        return this.g == this.e;
    }

    @Override // defpackage.s75
    public final void l(int i) {
        this.j = i;
        M();
    }

    @Override // defpackage.s75
    public final int m(int i) {
        if (i < 0) {
            throw cjb.i();
        }
        int iF = f() + i;
        if (iF < 0) {
            throw new cjb("Failed to parse the message.");
        }
        int i2 = this.j;
        if (iF > i2) {
            throw cjb.j();
        }
        this.j = iF;
        M();
        return i2;
    }

    @Override // defpackage.s75
    public final boolean n() {
        return K() != 0;
    }

    @Override // defpackage.s75
    public final d54 o() throws cjb {
        byte[] bArrCopyOfRange;
        int iJ = J();
        byte[] bArr = this.d;
        if (iJ > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iJ <= i - i2) {
                d54 d54VarH = d54.h(i2, iJ, bArr);
                this.g += iJ;
                return d54VarH;
            }
        }
        if (iJ == 0) {
            return d54.c;
        }
        if (iJ > 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (iJ > i3 - i4) {
                throw cjb.j();
            }
            int i5 = iJ + i4;
            this.g = i5;
            bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        } else {
            if (iJ != 0) {
                throw cjb.i();
            }
            bArrCopyOfRange = jfb.b;
        }
        d54 d54Var = d54.c;
        return new d54(bArrCopyOfRange);
    }

    @Override // defpackage.s75
    public final double p() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.s75
    public final int q() {
        return J();
    }

    @Override // defpackage.s75
    public final int r() {
        return H();
    }

    @Override // defpackage.s75
    public final long s() {
        return I();
    }

    @Override // defpackage.s75
    public final float t() {
        return Float.intBitsToFloat(H());
    }

    @Override // defpackage.s75
    public final int u() {
        return J();
    }

    @Override // defpackage.s75
    public final long v() {
        return K();
    }

    @Override // defpackage.s75
    public final int w() {
        return H();
    }

    @Override // defpackage.s75
    public final long x() {
        return I();
    }

    @Override // defpackage.s75
    public final int y() {
        int iJ = J();
        return (iJ >>> 1) ^ (-(iJ & 1));
    }

    @Override // defpackage.s75
    public final long z() {
        long jK = K();
        return (jK >>> 1) ^ (-(jK & 1));
    }
}
