package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q75 extends s75 {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public q75(InputStream inputStream) {
        jfb.a(inputStream, "input");
        this.d = inputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // defpackage.s75
    public final String A() throws cjb {
        int iM = M();
        byte[] bArr = this.e;
        if (iM > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iM <= i - i2) {
                String str = new String(bArr, i2, iM, jfb.a);
                this.h += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw cjb.i();
        }
        if (iM > this.f) {
            return new String(H(iM), jfb.a);
        }
        Q(iM);
        String str2 = new String(bArr, this.h, iM, jfb.a);
        this.h += iM;
        return str2;
    }

    @Override // defpackage.s75
    public final String B() throws IOException {
        int iM = M();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrH = this.e;
        if (iM <= i3 && iM > 0) {
            this.h = i + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            if (iM < 0) {
                throw cjb.i();
            }
            i = 0;
            if (iM <= i2) {
                Q(iM);
                this.h = iM;
            } else {
                bArrH = H(iM);
            }
        }
        return oym.a.g(bArrH, i, iM);
    }

    @Override // defpackage.s75
    public final int C() throws cjb {
        if (g()) {
            this.i = 0;
            return 0;
        }
        int iM = M();
        this.i = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new cjb("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.s75
    public final int D() {
        return M();
    }

    @Override // defpackage.s75
    public final long E() {
        return N();
    }

    @Override // defpackage.s75
    public final boolean F(int i) throws cjb {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                R(8);
                return true;
            }
            if (i2 == 2) {
                R(M());
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
            R(4);
            return true;
        }
        int i4 = this.f - this.h;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw cjb.h();
        }
        while (i3 < 10) {
            if (this.h == this.f) {
                Q(1);
            }
            int i6 = this.h;
            this.h = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw cjb.h();
        return true;
    }

    public final byte[] H(int i) throws IOException {
        byte[] bArrI = I(i);
        if (bArrI != null) {
            return bArrI;
        }
        int i2 = this.h;
        int i3 = this.f;
        int length = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList arrayListJ = J(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        int size = arrayListJ.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListJ.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] I(int i) throws IOException {
        if (i == 0) {
            return jfb.b;
        }
        if (i < 0) {
            throw cjb.i();
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new cjb("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.k;
        if (i4 > i5) {
            R((i5 - i2) - i3);
            throw cjb.j();
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        InputStream inputStream = this.d;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (cjb e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw cjb.j();
                }
                this.j += i8;
                i6 += i8;
            } catch (cjb e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList J(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.d.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw cjb.j();
                }
                this.j += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int K() throws cjb {
        int i = this.h;
        if (this.f - i < 4) {
            Q(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final long L() throws cjb {
        int i = this.h;
        if (this.f - i < 8) {
            Q(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r3[r2] < 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int M() {
        /*
            r6 = this;
            int r0 = r6.h
            int r1 = r6.f
            if (r1 == r0) goto L68
            int r2 = r0 + 1
            byte[] r3 = r6.e
            r4 = r3[r0]
            if (r4 < 0) goto L11
            r6.h = r2
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
            long r0 = r6.O()
            int r6 = (int) r0
            return r6
        L6e:
            r6.h = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q75.M():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long N() {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q75.N():long");
    }

    public final long O() throws cjb {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.h == this.f) {
                Q(1);
            }
            int i2 = this.h;
            this.h = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.e[i2] & 128) == 0) {
                return j;
            }
        }
        throw cjb.h();
    }

    public final void P() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final void Q(int i) throws cjb {
        if (S(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
            throw cjb.j();
        }
        throw new cjb("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void R(int i) throws cjb {
        int i2 = this.f;
        int i3 = this.h;
        if (i <= i2 - i3 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        InputStream inputStream = this.d;
        if (i < 0) {
            throw cjb.i();
        }
        int i4 = this.j;
        int i5 = i4 + i3;
        int i6 = i5 + i;
        int i7 = this.k;
        if (i6 > i7) {
            R((i7 - i4) - i3);
            throw cjb.j();
        }
        this.j = i5;
        int i8 = i2 - i3;
        this.f = 0;
        this.h = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i8 += (int) jSkip;
                        }
                    } else {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (cjb e) {
                    e.a = true;
                    throw e;
                }
            } finally {
                this.j += i8;
                P();
            }
        }
        if (i8 >= i) {
            return;
        }
        int i9 = this.f;
        int i10 = i9 - this.h;
        this.h = i9;
        Q(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f;
            if (i11 <= i12) {
                this.h = i11;
                return;
            } else {
                i10 += i12;
                this.h = i12;
                Q(1);
            }
        }
    }

    public final boolean S(int i) throws IOException {
        InputStream inputStream = this.d;
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            qp2.n(p3p.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.j;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.j + i2;
                this.j = i5;
                i4 = this.f - i2;
                this.f = i4;
                this.h = 0;
            }
            try {
                int i6 = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                }
                if (i6 > 0) {
                    this.f += i6;
                    P();
                    if (this.f >= i) {
                        return true;
                    }
                    return S(i);
                }
            } catch (cjb e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.s75
    public final void a(int i) throws cjb {
        if (this.i != i) {
            throw new cjb("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.s75
    public final int f() {
        return this.j + this.h;
    }

    @Override // defpackage.s75
    public final boolean g() {
        return this.h == this.f && !S(1);
    }

    @Override // defpackage.s75
    public final void l(int i) {
        this.k = i;
        P();
    }

    @Override // defpackage.s75
    public final int m(int i) throws cjb {
        if (i < 0) {
            throw cjb.i();
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            throw new cjb("Failed to parse the message.");
        }
        int i3 = this.k;
        if (i2 > i3) {
            throw cjb.j();
        }
        this.k = i2;
        P();
        return i3;
    }

    @Override // defpackage.s75
    public final boolean n() {
        return N() != 0;
    }

    @Override // defpackage.s75
    public final d54 o() throws IOException {
        int iM = M();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iM <= i3 && iM > 0) {
            d54 d54VarH = d54.h(i2, iM, bArr);
            this.h += iM;
            return d54VarH;
        }
        if (iM == 0) {
            return d54.c;
        }
        if (iM < 0) {
            throw cjb.i();
        }
        byte[] bArrI = I(iM);
        if (bArrI != null) {
            return d54.h(0, bArrI.length, bArrI);
        }
        int i4 = this.h;
        int i5 = this.f;
        int length = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList arrayListJ = J(iM - length);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListJ.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListJ.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        d54 d54Var = d54.c;
        return new d54(bArr2);
    }

    @Override // defpackage.s75
    public final double p() {
        return Double.longBitsToDouble(L());
    }

    @Override // defpackage.s75
    public final int q() {
        return M();
    }

    @Override // defpackage.s75
    public final int r() {
        return K();
    }

    @Override // defpackage.s75
    public final long s() {
        return L();
    }

    @Override // defpackage.s75
    public final float t() {
        return Float.intBitsToFloat(K());
    }

    @Override // defpackage.s75
    public final int u() {
        return M();
    }

    @Override // defpackage.s75
    public final long v() {
        return N();
    }

    @Override // defpackage.s75
    public final int w() {
        return K();
    }

    @Override // defpackage.s75
    public final long x() {
        return L();
    }

    @Override // defpackage.s75
    public final int y() {
        int iM = M();
        return (iM >>> 1) ^ (-(iM & 1));
    }

    @Override // defpackage.s75
    public final long z() {
        long jN = N();
        return (jN >>> 1) ^ (-(jN & 1));
    }
}
