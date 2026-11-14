package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kde {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ kde() {
        this(6);
    }

    public kde(int i) {
        this.a = imi.a;
        this.b = fcb.a;
        if (i >= 0) {
            e(imi.d(i));
        } else {
            zwg.t("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        r22 = r4;
        r10 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        if (((r13 & ((~r13) << 6)) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0083, code lost:
    
        r3 = d(r5);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        if (r36.e != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (((r36.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) == 254) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        r3 = r36.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (r3 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        r20 = 128;
        r6 = r36.d;
        r4 = jgm.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        if (java.lang.Long.compareUnsigned(r6 << 5, r3 * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r3 = r36.a;
        r4 = r36.c;
        r6 = r36.b;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c5, code lost:
    
        if (r14 >= r7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c7, code lost:
    
        r27 = r10;
        r10 = r3[r14] & (-9187201950435737472L);
        r17 = r14;
        r3[r17] = ((~r10) + (r10 >>> 7)) & (-72340172838076674L);
        r14 = r17 + 1;
        r10 = r27;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e4, code lost:
    
        r28 = r11;
        r12 = 7;
        r7 = r3.length;
        r10 = r7 - 1;
        r7 = r7 - 2;
        r3[r7] = (r3[r7] & 72057594037927935L) | (-72057594037927936L);
        r3[r10] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0103, code lost:
    
        if (r7 == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
    
        r10 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r13 = (r3[r10] >> r11) & r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0112, code lost:
    
        if (r13 == 128) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0116, code lost:
    
        if (r13 == 254) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0118, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011b, code lost:
    
        r13 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r19 = d(r14);
        r14 = r14 & r4;
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013c, code lost:
    
        if ((((r19 - r14) & r4) / 8) != (((r7 - r14) & r4) / 8)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013e, code lost:
    
        r14 = r6;
        r3[r10] = (r3[r10] & (~(r28 << r11))) | ((r13 & 127) << r11);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015c, code lost:
    
        r6 = r14;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0160, code lost:
    
        r14 = r6;
        r25 = r7;
        r6 = r19 >> 3;
        r32 = r3[r6];
        r7 = (r19 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0171, code lost:
    
        if (((r32 >> r7) & r28) != 128) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0173, code lost:
    
        r3[r6] = (r32 & (~(r28 << r7))) | ((r13 & 127) << r7);
        r3[r10] = (r3[r10] & (~(r28 << r11))) | (128 << r11);
        r14[r19] = r14[r25];
        r14[r25] = 0;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0199, code lost:
    
        r3[r6] = (r32 & (~(r28 << r7))) | ((r13 & 127) << r7);
        r6 = r14[r19];
        r14[r19] = r14[r25];
        r14[r25] = r6;
        r7 = r25 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b5, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c1, code lost:
    
        r36.e = defpackage.imi.a(r36.c) - r36.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ce, code lost:
    
        r18 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d2, code lost:
    
        r28 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d7, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01da, code lost:
    
        r3 = defpackage.imi.b(r36.c);
        r4 = r36.a;
        r6 = r36.b;
        r7 = r36.c;
        e(r3);
        r3 = r36.a;
        r10 = r36.b;
        r11 = r36.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f1, code lost:
    
        if (r12 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0201, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0203, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r18 = r15;
        r15 = d(r14 >>> 7);
        r19 = r3;
        r17 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r24 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r24;
        r19[(((r15 - 7) & r11) + (r11 & 7)) >> 3] = r24;
        r10[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0240, code lost:
    
        r19 = r3;
        r17 = r4;
        r18 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0246, code lost:
    
        r12 = r12 + 1;
        r4 = r17;
        r15 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024f, code lost:
    
        r3 = d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0253, code lost:
    
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0255, code lost:
    
        r28 = 255;
        r18 = true;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x025e, code lost:
    
        r36.d++;
        r3 = r36.e;
        r4 = r36.a;
        r5 = r12 >> 3;
        r6 = r4[r5];
        r10 = (r12 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
    
        if (((r6 >> r10) & r28) != r20) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0278, code lost:
    
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027b, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027d, code lost:
    
        r36.e = r3 - r11;
        r3 = r36.c;
        r6 = (r6 & (~(r28 << r10))) | (r8 << r10);
        r4[r5] = r6;
        r4[(((r12 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r37) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kde.a(int):boolean");
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != imi.a) {
            b82.j(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.e = imi.a(this.c) - this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        r8 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.c
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
            if (r8 == 0) goto L5e
            int r8 = java.lang.Long.numberOfTrailingZeros(r12)
            int r8 = r8 >> 3
            int r8 = r8 + r1
            r8 = r8 & r3
            int[] r14 = r0.b
            r14 = r14[r8]
            r15 = r19
            if (r14 == r15) goto L68
            r16 = 1
            long r16 = r12 - r16
            long r12 = r12 & r16
            goto L41
        L5e:
            long r12 = ~r9
            r8 = 6
            long r12 = r12 << r8
            long r9 = r9 & r12
            long r9 = r9 & r6
            int r6 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r6 == 0) goto L6c
            r8 = -1
        L68:
            if (r8 < 0) goto L6b
            return r11
        L6b:
            return r4
        L6c:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kde.c(int):boolean");
    }

    public final int d(int i) {
        int i2 = this.c;
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

    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, imi.c(i)) : 0;
        this.c = iMax;
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
        this.e = imi.a(this.c) - this.d;
        this.b = new int[iMax];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1
            if (r15 != r14) goto L4
            return r0
        L4:
            boolean r1 = r15 instanceof defpackage.kde
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kde r15 = (defpackage.kde) r15
            int r1 = r15.d
            int r3 = r14.d
            if (r1 == r3) goto L13
            return r2
        L13:
            int[] r1 = r14.b
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L59
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r10 = r15.c(r10)
            if (r10 != 0) goto L4e
            return r2
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L52:
            if (r7 != r8) goto L59
        L54:
            if (r4 == r3) goto L59
            int r4 = r4 + 1
            goto L1d
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kde.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        r8 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.c
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
            if (r8 == 0) goto L5e
            int r8 = java.lang.Long.numberOfTrailingZeros(r12)
            int r8 = r8 >> 3
            int r8 = r8 + r1
            r8 = r8 & r3
            int[] r14 = r0.b
            r14 = r14[r8]
            r15 = r19
            if (r14 == r15) goto L68
            r16 = 1
            long r16 = r12 - r16
            long r12 = r12 & r16
            goto L41
        L5e:
            long r12 = ~r9
            r8 = 6
            long r12 = r12 << r8
            long r9 = r9 & r12
            long r9 = r9 & r6
            int r6 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r6 == 0) goto L71
            r8 = -1
        L68:
            if (r8 < 0) goto L6b
            r4 = r11
        L6b:
            if (r4 == 0) goto L70
            r0.g(r8)
        L70:
            return r4
        L71:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kde.f(int):boolean");
    }

    public final void g(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.b;
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
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i3]) + iHashCode;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[PHI: r5
      0x0058: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0021, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r15 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            int[] r1 = r15.b
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5d
            r3 = 0
            r4 = r3
            r5 = r4
        L13:
            r6 = r15[r4]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L58
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L2d:
            if (r10 >= r8) goto L56
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L52
            int r11 = r4 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            r12 = -1
            if (r5 != r12) goto L46
            java.lang.String r15 = "..."
            r0.append(r15)
            goto L62
        L46:
            if (r5 == 0) goto L4d
            java.lang.String r12 = ", "
            r0.append(r12)
        L4d:
            r0.append(r11)
            int r5 = r5 + 1
        L52:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L56:
            if (r8 != r9) goto L5d
        L58:
            if (r4 == r2) goto L5d
            int r4 = r4 + 1
            goto L13
        L5d:
            java.lang.String r15 = "]"
            r0.append(r15)
        L62:
            java.lang.String r15 = r0.toString()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kde.toString():java.lang.String");
    }
}
