package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gee {
    public long[] a = imi.a;
    public Object[] b = x1p.d;
    public long[] c = o0g.d;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    public int h;

    public gee(int i) {
        if (i >= 0) {
            f(imi.d(i));
        } else {
            zwg.t("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.g;
        int iD = d(obj);
        this.b[iD] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[iD] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = (jArr[i2] & (-4611686016279904257L)) | ((iD & 2147483647L) << 31);
        }
        this.d = iD;
        if (this.e == Integer.MAX_VALUE) {
            this.e = iD;
        }
        return this.g != i;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.a;
        if (jArr != imi.a) {
            b82.j(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.b, 0, this.f, (Object) null);
        b82.j(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.h = imi.a(this.f) - this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r10 = r10 | r7
            long r7 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r13
            long r7 = r7 ^ r10
            long r13 = r7 - r13
            long r7 = ~r7
            long r13 = r13 & r7
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r7
        L47:
            r15 = 0
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 == 0) goto L65
            int r9 = java.lang.Long.numberOfTrailingZeros(r13)
            int r9 = r9 >> 3
            int r9 = r9 + r3
            r9 = r9 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r9]
            boolean r15 = kotlin.jvm.internal.Intrinsics.a(r15, r1)
            if (r15 != 0) goto L6f
            r15 = 1
            long r15 = r13 - r15
            long r13 = r13 & r15
            goto L47
        L65:
            long r13 = ~r10
            r9 = 6
            long r13 = r13 << r9
            long r10 = r10 & r13
            long r10 = r10 & r7
            int r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r7 == 0) goto L73
            r9 = -1
        L6f:
            if (r9 < 0) goto L72
            return r12
        L72:
            return r2
        L73:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gee.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        int i2;
        long j4;
        long[] jArr3;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr4 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j5 = (jArr4[i10] >>> i11) | ((jArr4[i10 + 1] << (64 - i11)) & ((-i11) >> 63));
            long j6 = i6;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i8) & i7;
                int i12 = i3;
                if (Intrinsics.a(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i3 = i12;
            }
            int i13 = i3;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i5);
                if (this.h != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i14 = this.f;
                    if (i14 > 8) {
                        c = 31;
                        j3 = 128;
                        long j9 = this.g;
                        igm igmVar = jgm.b;
                        j2 = 255;
                        if (Long.compareUnsigned(j9 << 5, i14 * 25) <= 0) {
                            long[] jArr5 = this.a;
                            if (jArr5 == null) {
                                i = 0;
                                j = j6;
                            } else {
                                int i15 = this.f;
                                Object[] objArr = this.b;
                                long[] jArr6 = this.c;
                                long[] jArr7 = new long[i15];
                                long j10 = 9223372034707292159L;
                                Arrays.fill(jArr7, 0, i15, 9223372034707292159L);
                                i = 0;
                                int i16 = (i15 + 7) >> 3;
                                int i17 = 0;
                                while (i17 < i16) {
                                    long j11 = j10;
                                    long j12 = jArr5[i17] & (-9187201950435737472L);
                                    jArr5[i17] = ((~j12) + (j12 >>> 7)) & (-72340172838076674L);
                                    i17++;
                                    j10 = j11;
                                }
                                long j13 = j10;
                                int length = jArr5.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr5[i19] = (jArr5[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr5[i18] = jArr5[0];
                                int i20 = 0;
                                while (i20 != i15) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j14 = (jArr5[i21] >> i22) & 255;
                                    if (j14 == 128 || j14 != 254) {
                                        i20++;
                                    } else {
                                        Object obj2 = objArr[i20];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                        int i23 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                        int iE2 = e(i23);
                                        int i24 = i23 & i15;
                                        if (((iE2 - i24) & i15) / 8 == ((i20 - i24) & i15) / 8) {
                                            j4 = j6;
                                            jArr5[i21] = (jArr5[i21] & (~(255 << i22))) | ((r14 & 127) << i22);
                                            if (jArr7[i20] == j13) {
                                                long j15 = i20;
                                                jArr7[i20] = (j15 << 32) | j15;
                                            }
                                            jArr5[jArr5.length - 1] = jArr5[0];
                                            i20++;
                                        } else {
                                            j4 = j6;
                                            int i25 = iE2 >> 3;
                                            long j16 = jArr5[i25];
                                            int i26 = (iE2 & 7) << 3;
                                            if (((j16 >> i26) & 255) == 128) {
                                                jArr3 = jArr7;
                                                jArr5[i25] = (j16 & (~(255 << i26))) | ((r14 & 127) << i26);
                                                jArr5[i21] = (jArr5[i21] & (~(255 << i22))) | (128 << i22);
                                                objArr[iE2] = objArr[i20];
                                                objArr[i20] = null;
                                                jArr6[iE2] = jArr6[i20];
                                                jArr6[i20] = 4611686018427387903L;
                                                int i27 = (int) ((jArr3[i20] >> 32) & 4294967295L);
                                                if (i27 != Integer.MAX_VALUE) {
                                                    jArr3[i27] = (jArr3[i27] & (-4294967296L)) | iE2;
                                                    jArr3[i20] = (jArr3[i20] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr3[i20] = 9223372032559808512L | iE2;
                                                }
                                                jArr3[iE2] = (i20 << 32) | 2147483647L;
                                            } else {
                                                jArr3 = jArr7;
                                                jArr5[i25] = (j16 & (~(255 << i26))) | ((r14 & 127) << i26);
                                                Object obj3 = objArr[iE2];
                                                objArr[iE2] = objArr[i20];
                                                objArr[i20] = obj3;
                                                long j17 = jArr6[iE2];
                                                jArr6[iE2] = jArr6[i20];
                                                jArr6[i20] = j17;
                                                int i28 = (int) ((jArr3[i20] >> 32) & 4294967295L);
                                                if (i28 != Integer.MAX_VALUE) {
                                                    long j18 = iE2;
                                                    jArr3[i28] = (jArr3[i28] & (-4294967296L)) | j18;
                                                    jArr3[i20] = (j18 << 32) | (jArr3[i20] & 4294967295L);
                                                } else {
                                                    long j19 = iE2;
                                                    jArr3[i20] = (j19 << 32) | j19;
                                                    i28 = i20;
                                                }
                                                jArr3[iE2] = (i28 << 32) | i20;
                                                i20--;
                                            }
                                            jArr5[jArr5.length - 1] = jArr5[0];
                                            i20++;
                                            jArr7 = jArr3;
                                        }
                                        j6 = j4;
                                    }
                                }
                                j = j6;
                                long[] jArr8 = jArr7;
                                this.h = imi.a(this.f) - this.g;
                                long[] jArr9 = this.c;
                                int length2 = jArr9.length;
                                for (int i29 = 0; i29 < length2; i29++) {
                                    long j20 = jArr9[i29];
                                    jArr9[i29] = (((j20 & (-4611686018427387904L)) | (((int) ((j20 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr8[r4] & 4294967295L))) << 31) | (((int) (j20 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr8[r8] & 4294967295L));
                                }
                                int i30 = this.d;
                                if (i30 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr8[i30] & 4294967295L);
                                }
                                int i31 = this.e;
                                if (i31 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr8[i31] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i5);
                    } else {
                        j2 = 255;
                        c = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    int iB = imi.b(this.f);
                    long[] jArr10 = this.a;
                    Object[] objArr2 = this.b;
                    long[] jArr11 = this.c;
                    int i32 = this.f;
                    int[] iArr = new int[i32];
                    f(iB);
                    long[] jArr12 = this.a;
                    Object[] objArr3 = this.b;
                    long[] jArr13 = this.c;
                    int i33 = this.f;
                    int i34 = 0;
                    while (i34 < i32) {
                        if (((jArr10[i34 >> 3] >> ((i34 & 7) << 3)) & j2) < j3) {
                            Object obj4 = objArr2[i34];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i35 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i35 >>> 7);
                            i2 = i33;
                            long j21 = i35 & 127;
                            int i36 = iE3 >> 3;
                            int i37 = (iE3 & 7) << 3;
                            jArr = jArr12;
                            jArr2 = jArr10;
                            long j22 = (jArr12[i36] & (~(j2 << i37))) | (j21 << i37);
                            jArr[i36] = j22;
                            jArr[(((iE3 - 7) & i2) + (i2 & 7)) >> 3] = j22;
                            objArr3[iE3] = obj4;
                            jArr13[iE3] = jArr11[i34];
                            iArr[i34] = iE3;
                        } else {
                            jArr = jArr12;
                            jArr2 = jArr10;
                            i2 = i33;
                        }
                        i34++;
                        i33 = i2;
                        jArr10 = jArr2;
                        jArr12 = jArr;
                    }
                    long[] jArr14 = this.c;
                    int length3 = jArr14.length;
                    for (int i38 = 0; i38 < length3; i38++) {
                        long j23 = jArr14[i38];
                        jArr14[i38] = (((j23 & (-4611686018427387904L)) | (((int) ((j23 >> c) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c) | (((int) (j23 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i39 = this.d;
                    if (i39 != Integer.MAX_VALUE) {
                        this.d = iArr[i39];
                    }
                    int i40 = this.e;
                    if (i40 != Integer.MAX_VALUE) {
                        this.e = iArr[i40];
                    }
                    iE = e(i5);
                }
                this.g++;
                int i41 = this.h;
                long[] jArr15 = this.a;
                int i42 = iE >> 3;
                long j24 = jArr15[i42];
                int i43 = (iE & 7) << 3;
                if (((j24 >> i43) & j2) == j3) {
                    i = 1;
                }
                this.h = i41 - i;
                int i44 = this.f;
                long j25 = (j24 & (~(j2 << i43))) | (j << i43);
                jArr15[i42] = j25;
                jArr15[(((iE - 7) & i44) + (i44 & 7)) >> 3] = j25;
                return iE;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i3 = i13;
        }
    }

    public final int e(int i) {
        int i2 = this.f;
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
            boolean r1 = r15 instanceof defpackage.gee
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gee r15 = (defpackage.gee) r15
            int r1 = r15.g
            int r3 = r14.g
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Object[] r1 = r14.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gee.equals(java.lang.Object):boolean");
    }

    public final void f(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, imi.c(i)) : 0;
        this.f = iMax;
        if (iMax == 0) {
            jArr = imi.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.h = imi.a(this.f) - this.g;
        this.b = iMax == 0 ? x1p.d : new Object[iMax];
        if (iMax == 0) {
            jArr2 = o0g.d;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r10 = r10 | r7
            long r7 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r13
            long r7 = r7 ^ r10
            long r13 = r7 - r13
            long r7 = ~r7
            long r13 = r13 & r7
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r7
        L47:
            r15 = 0
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 == 0) goto L65
            int r9 = java.lang.Long.numberOfTrailingZeros(r13)
            int r9 = r9 >> 3
            int r9 = r9 + r3
            r9 = r9 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r9]
            boolean r15 = kotlin.jvm.internal.Intrinsics.a(r15, r1)
            if (r15 != 0) goto L6f
            r15 = 1
            long r15 = r13 - r15
            long r13 = r13 & r15
            goto L47
        L65:
            long r13 = ~r10
            r9 = 6
            long r13 = r13 << r9
            long r10 = r10 & r13
            long r10 = r10 & r7
            int r7 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r7 == 0) goto L78
            r9 = -1
        L6f:
            if (r9 < 0) goto L72
            r2 = r12
        L72:
            if (r2 == 0) goto L77
            r0.h(r9)
        L77:
            return r2
        L78:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gee.g(java.lang.Object):boolean");
    }

    public final void h(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = this.f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (i6 & 2147483647L);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (jArr2[i6] & (-4611686016279904257L)) | ((i5 & 2147483647L) << 31);
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!Intrinsics.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.util.Collection r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object[] r1 = r0.b
            int r2 = r0.g
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L51
            r6 = r5
        Lf:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L4c
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L29:
            if (r11 >= r9) goto L4a
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L46
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = kotlin.collections.CollectionsKt.E(r13, r14)
            if (r13 != 0) goto L46
            r0.h(r12)
        L46:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L29
        L4a:
            if (r9 != r10) goto L51
        L4c:
            if (r6 == r4) goto L51
            int r6 = r6 + 1
            goto Lf
        L51:
            int r0 = r0.g
            if (r2 == r0) goto L57
            r0 = 1
            return r0
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gee.i(java.util.Collection):boolean");
    }

    public final String toString() {
        b11 b11Var = new b11((Object) this, (byte) 16);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) b11Var.invoke(obj));
            i2++;
            i = i3;
        }
        return sb.toString();
    }
}
