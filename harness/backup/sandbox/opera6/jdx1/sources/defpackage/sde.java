package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class sde {
    public long[] a = imi.a;
    public long[] b = i1d.a;
    public Object[] c = x1p.d;
    public int d;
    public int e;
    public int f;

    public sde(int i) {
        if (i >= 0) {
            e(imi.d(i));
        } else {
            zwg.t("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != imi.a) {
            b82.j(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.c, 0, this.d, (Object) null);
        this.f = imi.a(this.d) - this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        r8 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Long.hashCode(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r9 = r9 | r6
            long r6 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r12
            long r6 = r6 ^ r9
            long r12 = r6 - r12
            long r6 = ~r6
            long r12 = r12 & r6
            r6 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r6
        L41:
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 == 0) goto L5d
            int r8 = java.lang.Long.numberOfTrailingZeros(r12)
            int r8 = r8 >> 3
            int r8 = r8 + r1
            r8 = r8 & r3
            long[] r14 = r0.b
            r14 = r14[r8]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 == 0) goto L67
            r14 = 1
            long r14 = r12 - r14
            long r12 = r12 & r14
            goto L41
        L5d:
            long r12 = ~r9
            r8 = 6
            long r12 = r12 << r8
            long r9 = r9 & r12
            long r9 = r9 & r6
            int r6 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r6 == 0) goto L6b
            r8 = -1
        L67:
            if (r8 < 0) goto L6a
            return r11
        L6a:
            return r4
        L6b:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sde.b(long):boolean");
    }

    public final int c(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = (jArr[i5] >>> i6) | ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63));
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        r6 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r7 = r7 | r4
            long r4 = (long) r1
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r9
            long r4 = r4 ^ r7
            long r9 = r4 - r9
            long r4 = ~r4
            long r9 = r9 & r4
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r4
        L3e:
            r11 = 0
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 == 0) goto L5a
            int r6 = java.lang.Long.numberOfTrailingZeros(r9)
            int r6 = r6 >> 3
            int r6 = r6 + r0
            r6 = r6 & r2
            long[] r11 = r13.b
            r11 = r11[r6]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 == 0) goto L64
            r11 = 1
            long r11 = r9 - r11
            long r9 = r9 & r11
            goto L3e
        L5a:
            long r9 = ~r7
            r6 = 6
            long r9 = r9 << r6
            long r7 = r7 & r9
            long r7 = r7 & r4
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 == 0) goto L6d
            r6 = -1
        L64:
            if (r6 < 0) goto L6b
            java.lang.Object[] r13 = r13.c
            r13 = r13[r6]
            return r13
        L6b:
            r13 = 0
            return r13
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sde.d(long):java.lang.Object");
    }

    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, imi.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = imi.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = imi.a(this.d) - this.e;
        this.b = new long[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.sde
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            sde r1 = (defpackage.sde) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L74
            r7 = r4
        L23:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6f
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L6d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L69
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            if (r13 != 0) goto L5e
            java.lang.Object r13 = r1.d(r14)
            if (r13 != 0) goto L5d
            boolean r13 = r1.b(r14)
            if (r13 != 0) goto L69
        L5d:
            return r4
        L5e:
            java.lang.Object r14 = r1.d(r14)
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L69
            return r4
        L69:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L6d:
            if (r10 != r11) goto L74
        L6f:
            if (r7 == r6) goto L74
            int r7 = r7 + 1
            goto L23
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sde.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        r6 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r7 = r7 | r4
            long r4 = (long) r1
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r9
            long r4 = r4 ^ r7
            long r9 = r4 - r9
            long r4 = ~r4
            long r9 = r9 & r4
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r4
        L3e:
            r11 = 0
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 == 0) goto L5a
            int r6 = java.lang.Long.numberOfTrailingZeros(r9)
            int r6 = r6 >> 3
            int r6 = r6 + r0
            r6 = r6 & r2
            long[] r11 = r13.b
            r11 = r11[r6]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 == 0) goto L64
            r11 = 1
            long r11 = r9 - r11
            long r9 = r9 & r11
            goto L3e
        L5a:
            long r9 = ~r7
            r6 = 6
            long r9 = r9 << r6
            long r7 = r7 & r9
            long r7 = r7 & r4
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 == 0) goto L96
            r6 = -1
        L64:
            r14 = 0
            if (r6 < 0) goto L95
            int r15 = r13.e
            int r15 = r15 + (-1)
            r13.e = r15
            long[] r15 = r13.a
            int r0 = r13.d
            int r1 = r6 >> 3
            r2 = r6 & 7
            int r2 = r2 << 3
            r3 = r15[r1]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r2
            long r7 = ~r7
            long r3 = r3 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r2
            long r3 = r3 | r7
            r15[r1] = r3
            int r1 = r6 + (-7)
            r1 = r1 & r0
            r0 = r0 & 7
            int r1 = r1 + r0
            int r1 = r1 >> 3
            r15[r1] = r3
            java.lang.Object[] r13 = r13.c
            r15 = r13[r6]
            r13[r6] = r14
            return r15
        L95:
            return r14
        L96:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sde.f(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0074, code lost:
    
        if (r11 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        r1 = c(r3);
        r14 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
    
        if (r38.f != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        if (((r38.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) == 254) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        r1 = r38.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        if (r1 <= 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        r20 = 128;
        r4 = r38.e;
        r2 = jgm.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (java.lang.Long.compareUnsigned(r4 << 5, r1 * 25) > 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r1 = r38.a;
        r2 = r38.d;
        r4 = r38.b;
        r5 = r38.c;
        r6 = (r2 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (r7 >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        r28 = r10;
        r10 = r1[r7] & (-9187201950435737472L);
        r1[r7] = ((~r10) + (r10 >>> 7)) & (-72340172838076674L);
        r7 = r7 + 1;
        r13 = r13;
        r10 = r28;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00de, code lost:
    
        r28 = r10;
        r26 = r13;
        r6 = r1.length;
        r7 = r6 - 1;
        r6 = r6 - 2;
        r12 = 72057594037927935L;
        r1[r6] = (r1[r6] & 72057594037927935L) | (-72057594037927936L);
        r1[r7] = r1[r28];
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ff, code lost:
    
        if (r6 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0101, code lost:
    
        r7 = r6 >> 3;
        r24 = (r6 & 7) << 3;
        r10 = (r1[r7] >> r24) & r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010e, code lost:
    
        if (r10 == 128) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0112, code lost:
    
        if (r10 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0114, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        r10 = java.lang.Long.hashCode(r4[r6]) * r19;
        r11 = (r10 ^ (r10 << 16)) >>> 7;
        r25 = c(r11);
        r11 = r11 & r2;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0138, code lost:
    
        if ((((r25 - r11) & r2) / 8) != (((r6 - r11) & r2) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013a, code lost:
    
        r34 = r14;
        r1[r7] = (r1[r7] & (~(r34 << r24))) | ((r10 & 127) << r24);
        r1[r1.length - 1] = (r1[r28] & r30) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0157, code lost:
    
        r12 = r30;
        r14 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015c, code lost:
    
        r34 = r14;
        r11 = r25 >> 3;
        r12 = r1[r11];
        r14 = (r25 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016c, code lost:
    
        if (((r12 >> r14) & r34) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016e, code lost:
    
        r15 = r4;
        r27 = r5;
        r1[r11] = (r12 & (~(r34 << r14))) | ((r10 & 127) << r14);
        r1[r7] = (r1[r7] & (~(r34 << r24))) | (128 << r24);
        r15[r25] = r15[r6];
        r15[r6] = 0;
        r27[r25] = r27[r6];
        r27[r6] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0198, code lost:
    
        r15 = r4;
        r27 = r5;
        r1[r11] = (r12 & (~(r34 << r14))) | ((r10 & 127) << r14);
        r4 = r15[r25];
        r15[r25] = r15[r6];
        r15[r6] = r4;
        r4 = r27[r25];
        r27[r25] = r27[r6];
        r27[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01bb, code lost:
    
        r1[r1.length - 1] = (r1[r28] & r30) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r15;
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01cc, code lost:
    
        r34 = r14;
        r38.f = defpackage.imi.a(r38.d) - r38.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01db, code lost:
    
        r28 = 0;
        r26 = 1;
        r34 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e4, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e7, code lost:
    
        r1 = defpackage.imi.b(r38.d);
        r2 = r38.a;
        r4 = r38.b;
        r5 = r38.c;
        r6 = r38.d;
        e(r1);
        r1 = r38.a;
        r7 = r38.b;
        r10 = r38.c;
        r11 = r38.d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0202, code lost:
    
        if (r12 >= r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0211, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0213, code lost:
    
        r13 = r4[r12];
        r15 = java.lang.Long.hashCode(r13) * r19;
        r15 = r15 ^ (r15 << 16);
        r16 = r1;
        r1 = c(r15 >>> 7);
        r17 = r2;
        r1 = r15 & 127;
        r15 = r1 >> 3;
        r23 = (r1 & 7) << 3;
        r24 = (r16[r15] & (~(255 << r23))) | (r1 << r23);
        r16[r15] = r24;
        r16[(((r1 - 7) & r11) + (r11 & 7)) >> 3] = r24;
        r7[r1] = r13;
        r10[r1] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0254, code lost:
    
        r16 = r1;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0258, code lost:
    
        r12 = r12 + 1;
        r1 = r16;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x025f, code lost:
    
        r1 = c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0263, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0266, code lost:
    
        r28 = 0;
        r26 = 1;
        r34 = 255;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0271, code lost:
    
        r38.e++;
        r1 = r38.f;
        r2 = r38.a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0289, code lost:
    
        if (((r4 >> r6) & r34) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028b, code lost:
    
        r28 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x028d, code lost:
    
        r38.f = r1 - r28;
        r1 = r38.d;
        r4 = (r4 & (~(r34 << r6))) | (r8 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        r19 = r2;
        r11 = (r11 & ((~r11) << 6)) & (-9187201950435737472L);
        r11 = '\b';
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r39, java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sde.g(long, java.lang.Object):void");
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        Object obj = objArr[i4];
                        iHashCode += Long.hashCode(j2) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        int i;
        int i2;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
