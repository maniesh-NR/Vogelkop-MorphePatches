package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class hde {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public /* synthetic */ hde() {
        this(6);
    }

    public hde(int i) {
        this.a = imi.a;
        int[] iArr = fcb.a;
        this.b = iArr;
        this.c = iArr;
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
        this.f = imi.a(this.d) - this.e;
    }

    public final int b(int i) {
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

    public final int c(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (jArr[i7] >>> i8) | ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63));
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (j2 - 72340172838076673L) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int d(int i) {
        int iC = c(i);
        if (iC >= 0) {
            return this.c[iC];
        }
        return -1;
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
        this.b = new int[iMax];
        this.c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
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
            boolean r3 = r1 instanceof defpackage.hde
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            hde r1 = (defpackage.hde) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.b
            int[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L67
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
            if (r10 == 0) goto L62
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L60
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            int r14 = r1.c(r14)
            if (r14 < 0) goto L5b
            int[] r15 = r1.c
            r14 = r15[r14]
            if (r13 == r14) goto L5c
        L5b:
            return r4
        L5c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L60:
            if (r10 != r11) goto L67
        L62:
            if (r7 == r6) goto L67
            int r7 = r7 + 1
            goto L23
        L67:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hde.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0079, code lost:
    
        if (((r12 & ((~r12) << 6)) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007b, code lost:
    
        r2 = b(r4);
        r10 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        if (r37.f != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        if (((r37.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) == 254) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r2 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        if (r2 <= 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009d, code lost:
    
        r19 = 128;
        r5 = r37.e;
        r3 = jgm.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if (java.lang.Long.compareUnsigned(r5 << 5, r2 * 25) > 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
    
        r2 = r37.a;
        r3 = r37.d;
        r5 = r37.b;
        r6 = r37.c;
        r13 = (r3 + 7) >> 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
    
        if (r9 >= r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        r27 = r10;
        r10 = r2[r9] & (-9187201950435737472L);
        r2[r9] = ((~r10) + (r10 >>> 7)) & (-72340172838076674L);
        r9 = r9 + 1;
        r13 = r13;
        r10 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00df, code lost:
    
        r27 = r10;
        r9 = r2.length;
        r10 = r9 - 1;
        r9 = r9 - 2;
        r2[r9] = (r2[r9] & 72057594037927935L) | (-72057594037927936L);
        r2[r10] = r2[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fc, code lost:
    
        if (r9 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fe, code lost:
    
        r10 = r9 >> 3;
        r13 = (r9 & 7) << 3;
        r11 = (r2[r10] >> r13) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010b, code lost:
    
        if (r11 == 128) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010f, code lost:
    
        if (r11 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0111, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0114, code lost:
    
        r11 = java.lang.Integer.hashCode(r5[r9]) * r21;
        r12 = (r11 ^ (r11 << 16)) >>> 7;
        r25 = b(r12);
        r12 = r12 & r3;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0135, code lost:
    
        if ((((r25 - r12) & r3) / 8) != (((r9 - r12) & r3) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0137, code lost:
    
        r14 = r5;
        r32 = r6;
        r2[r10] = (r2[r10] & (~(r27 << r13))) | ((r11 & 127) << r13);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0154, code lost:
    
        r9 = r9 + 1;
        r5 = r14;
        r14 = r29;
        r6 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015c, code lost:
    
        r14 = r5;
        r32 = r6;
        r5 = r25 >> 3;
        r33 = r2[r5];
        r6 = (r25 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016d, code lost:
    
        if (((r33 >> r6) & r27) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016f, code lost:
    
        r2[r5] = (r33 & (~(r27 << r6))) | ((r11 & 127) << r6);
        r2[r10] = (r2[r10] & (~(r27 << r13))) | (128 << r13);
        r14[r25] = r14[r9];
        r14[r9] = 0;
        r32[r25] = r32[r9];
        r32[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0199, code lost:
    
        r2[r5] = (r33 & (~(r27 << r6))) | ((r11 & 127) << r6);
        r5 = r14[r25];
        r14[r25] = r14[r9];
        r14[r9] = r5;
        r5 = r32[r25];
        r32[r25] = r32[r9];
        r32[r9] = r5;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01bd, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c9, code lost:
    
        r29 = r14;
        r37.f = defpackage.imi.a(r37.d) - r37.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d8, code lost:
    
        r27 = 255;
        r29 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01df, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e2, code lost:
    
        r2 = defpackage.imi.b(r37.d);
        r3 = r37.a;
        r5 = r37.b;
        r6 = r37.c;
        r9 = r37.d;
        e(r2);
        r2 = r37.a;
        r10 = r37.b;
        r11 = r37.c;
        r12 = r37.d;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01fc, code lost:
    
        if (r13 >= r9) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x020c, code lost:
    
        if (((r3[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= r19) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x020e, code lost:
    
        r14 = r5[r13];
        r17 = java.lang.Integer.hashCode(r14) * r21;
        r17 = r17 ^ (r17 << 16);
        r15 = b(r17 >>> 7);
        r1 = r17 & 127;
        r17 = r2;
        r22 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r24 = (r17[r22] & (~(255 << r23))) | (r1 << r23);
        r17[r22] = r24;
        r17[(((r15 - 7) & r12) + (r12 & 7)) >> 3] = r24;
        r10[r15] = r14;
        r11[r15] = r6[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x024b, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x024d, code lost:
    
        r13 = r13 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0252, code lost:
    
        r2 = b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0257, code lost:
    
        r27 = 255;
        r29 = 1;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x025f, code lost:
    
        r37.e++;
        r1 = r37.f;
        r3 = r37.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r9 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0277, code lost:
    
        if (((r5 >> r9) & r27) == r19) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0279, code lost:
    
        r29 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027b, code lost:
    
        r37.f = r1 - r29;
        r1 = r37.d;
        r5 = (r5 & (~(r27 << r9))) | (r7 << r9);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r11 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        r21 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hde.f(int, int):void");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        iHashCode += Integer.hashCode(iArr[i4]) ^ Integer.hashCode(iArr2[i4]);
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.e
            if (r1 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.b
            int[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hde.toString():java.lang.String");
    }
}
