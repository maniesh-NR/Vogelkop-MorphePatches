package defpackage;

/* loaded from: classes.dex */
public final class n75 {
    public int a;
    public r05 c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public final byte b = 100;
    public int j = Integer.MAX_VALUE;

    public n75(byte[] bArr, int i, int i2, boolean z) {
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }

    public static int a(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long b(long j) {
        return (j >>> 1) ^ (-(j & 1));
    }

    public final int c() {
        return this.g - this.h;
    }

    public final boolean d() {
        return this.g == this.e;
    }

    public final int e(int i) {
        if (i < 0) {
            throw ajb.h();
        }
        int iC = c() + i;
        if (iC < 0) {
            throw new ajb("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.j;
        if (iC > i2) {
            throw ajb.j();
        }
        this.j = iC;
        m();
        return i2;
    }

    public final boolean f() {
        return j() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public final int g() throws ajb {
        int i = this.g;
        if (this.e - i < 4) {
            throw ajb.j();
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public final long h() throws ajb {
        int i = this.g;
        if (this.e - i < 8) {
            throw ajb.j();
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
    public final int i() {
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
            long r0 = r6.k()
            int r6 = (int) r0
            return r6
        L6e:
            r6.g = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n75.i():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j() {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n75.j():long");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajb */
    public final long k() throws ajb {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.g;
            if (i2 == this.e) {
                throw ajb.j();
            }
            this.g = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.d[i2] & 128) == 0) {
                return j;
            }
        }
        throw new ajb("CodedInputStream encountered a malformed varint.");
    }

    public final int l() {
        if (d()) {
            this.i = 0;
            return 0;
        }
        int i = i();
        this.i = i;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw new ajb("Protocol message contained an invalid tag (zero).");
    }

    public final void m() {
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
}
