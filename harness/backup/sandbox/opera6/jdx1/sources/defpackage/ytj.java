package defpackage;

import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ytj {
    public static final bli a = new bli(26);
    public static final p8f b = new p8f((byte) 20);
    public static final Object c = new Object();
    public static xtj d;
    public static long e;
    public static final ac1 f;
    public static final uuj g;
    public static List h;
    public static List i;
    public static final lz9 j;
    public static final cf2 k;

    static {
        xtj xtjVar = xtj.e;
        d = xtjVar;
        e = 2L;
        ac1 ac1Var = new ac1();
        ac1Var.c = new long[16];
        ac1Var.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        ac1Var.e = iArr;
        f = ac1Var;
        uuj uujVar = new uuj();
        uujVar.b = new int[16];
        uujVar.c = new b2b[16];
        g = uujVar;
        l08 l08Var = l08.a;
        h = l08Var;
        i = l08Var;
        long j2 = e;
        e = 1 + j2;
        lz9 lz9Var = new lz9(j2, xtjVar, null, new d58((byte) 27));
        d = d.f(lz9Var.b);
        j = lz9Var;
        k = new cf2(0);
    }

    public static final xtj a(xtj xtjVar, long j2, long j3) {
        while (Intrinsics.c(j2, j3) < 0) {
            xtjVar = xtjVar.f(j2);
            j2++;
        }
        return xtjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(kotlin.jvm.functions.Function1 r15) {
        /*
            lz9 r0 = defpackage.ytj.j
            java.lang.Object r1 = defpackage.ytj.c
            monitor-enter(r1)
            tee r2 = r0.h     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto Lf
            cf2 r3 = defpackage.ytj.k     // Catch: java.lang.Throwable -> L93
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L93
        Lf:
            java.lang.Object r15 = u(r0, r15)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L42
            r3 = -1
            java.util.List r4 = defpackage.ytj.h     // Catch: java.lang.Throwable -> L3b
            kmi r5 = new kmi     // Catch: java.lang.Throwable -> L3b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L3b
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L3b
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L3b
            r7 = r1
        L27:
            if (r7 >= r6) goto L35
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L3b
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8     // Catch: java.lang.Throwable -> L3b
            r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L3b
            int r7 = r7 + 1
            goto L27
        L35:
            cf2 r0 = defpackage.ytj.k
            r0.addAndGet(r3)
            goto L42
        L3b:
            r15 = move-exception
            cf2 r0 = defpackage.ytj.k
            r0.addAndGet(r3)
            throw r15
        L42:
            java.lang.Object r0 = defpackage.ytj.c
            monitor-enter(r0)
            d()     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto L8e
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L90
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L90
            int r4 = r2.length     // Catch: java.lang.Throwable -> L90
            int r4 = r4 + (-2)
            if (r4 < 0) goto L8e
            r5 = r1
        L54:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L90
            long r8 = ~r6     // Catch: java.lang.Throwable -> L90
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L89
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L90
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L6e:
            if (r10 >= r8) goto L87
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L83
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L90
            vak r11 = (defpackage.vak) r11     // Catch: java.lang.Throwable -> L90
            p(r11)     // Catch: java.lang.Throwable -> L90
        L83:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L6e
        L87:
            if (r8 != r9) goto L8e
        L89:
            if (r5 == r4) goto L8e
            int r5 = r5 + 1
            goto L54
        L8e:
            monitor-exit(r0)
            return r15
        L90:
            r15 = move-exception
            monitor-exit(r0)
            throw r15
        L93:
            r15 = move-exception
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytj.b(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        uuj uujVar = g;
        int i2 = uujVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            b2b b2bVar = ((b2b[]) uujVar.c)[i3];
            Object obj = b2bVar != null ? b2bVar.get() : null;
            if (obj != null && o((vak) obj)) {
                if (i4 != i3) {
                    ((b2b[]) uujVar.c)[i4] = b2bVar;
                    int[] iArr = (int[]) uujVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((b2b[]) uujVar.c)[i5] = null;
            ((int[]) uujVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            uujVar.a = i4;
        }
    }

    public static final ttj e(ttj ttjVar, Function1 function1, boolean z) {
        boolean z2 = ttjVar instanceof yee;
        if (z2 || ttjVar == null) {
            return new k5m(z2 ? (yee) ttjVar : null, function1, null, false, z);
        }
        return new l5m(ttjVar, function1, false, z);
    }

    public static final yak f(yak yakVar) {
        yak yakVarR;
        ttj ttjVarH = h();
        yak yakVarR2 = r(yakVar, ttjVarH.g(), ttjVarH.d());
        if (yakVarR2 != null) {
            return yakVarR2;
        }
        synchronized (c) {
            ttj ttjVarH2 = h();
            yakVarR = r(yakVar, ttjVarH2.g(), ttjVarH2.d());
        }
        if (yakVarR != null) {
            return yakVarR;
        }
        q();
        throw null;
    }

    public static final yak g(yak yakVar, ttj ttjVar) {
        yak yakVarR;
        yak yakVarR2 = r(yakVar, ttjVar.g(), ttjVar.d());
        if (yakVarR2 != null) {
            return yakVarR2;
        }
        synchronized (c) {
            yakVarR = r(yakVar, ttjVar.g(), ttjVar.d());
        }
        if (yakVarR != null) {
            return yakVarR;
        }
        q();
        throw null;
    }

    public static final ttj h() {
        ttj ttjVar = (ttj) b.get();
        return ttjVar == null ? j : ttjVar;
    }

    public static final Function1 i(Function1 function1, Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new una(function1, function12, (byte) 2);
    }

    public static final Function1 j(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new una(function1, function12, (byte) 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.yak k(defpackage.yak r10, defpackage.vak r11) {
        /*
            yak r0 = r11.c()
            long r1 = defpackage.ytj.e
            ac1 r3 = defpackage.ytj.f
            int r4 = r3.a
            if (r4 <= 0) goto L13
            java.lang.Object r1 = r3.c
            long[] r1 = (long[]) r1
            r2 = 0
            r1 = r1[r2]
        L13:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L18:
            if (r0 == 0) goto L49
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L42
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L46
            int r7 = kotlin.jvm.internal.Intrinsics.c(r5, r1)
            if (r7 > 0) goto L46
            xtj r7 = defpackage.xtj.e
            boolean r5 = r7.d(r5)
            if (r5 != 0) goto L46
            if (r4 != 0) goto L38
            r4 = r0
            goto L46
        L38:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = kotlin.jvm.internal.Intrinsics.c(r1, r5)
            if (r1 >= 0) goto L44
        L42:
            r3 = r0
            goto L49
        L44:
            r3 = r4
            goto L49
        L46:
            yak r0 = r0.b
            goto L18
        L49:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L53
            r3.a = r0
            return r3
        L53:
            yak r10 = r10.b(r0)
            yak r0 = r11.c()
            r10.b = r0
            r11.b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ytj.k(yak, vak):yak");
    }

    public static final void l(ttj ttjVar, vak vakVar) {
        ttjVar.t(ttjVar.h() + 1);
        Function1 function1I = ttjVar.i();
        if (function1I != null) {
            function1I.invoke(vakVar);
        }
    }

    public static final HashMap m(long j2, yee yeeVar, xtj xtjVar) {
        long[] jArr;
        xtj xtjVar2;
        long[] jArr2;
        xtj xtjVar3;
        int i2;
        int i3;
        yak yakVarR;
        tee teeVarX = yeeVar.x();
        if (teeVarX != null) {
            long jG = yeeVar.g();
            xtj xtjVarE = yeeVar.d().f(jG).e(yeeVar.j);
            Object[] objArr = teeVarX.b;
            long[] jArr3 = teeVarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                vak vakVar = (vak) objArr[(i4 << 3) + i7];
                                yak yakVarC = vakVar.c();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                yak yakVarR2 = r(yakVarC, j2, xtjVar);
                                if (yakVarR2 == null || (yakVarR = r(yakVarC, jG, xtjVarE)) == null || yakVarR2.equals(yakVarR)) {
                                    xtjVar3 = xtjVarE;
                                } else {
                                    xtjVar3 = xtjVarE;
                                    yak yakVarR3 = r(yakVarC, jG, yeeVar.d());
                                    if (yakVarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    yak yakVarD = vakVar.d(yakVarR, yakVarR2, yakVarR3);
                                    if (yakVarD == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(yakVarR2, yakVarD);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                xtjVar3 = xtjVarE;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            xtjVarE = xtjVar3;
                        }
                        jArr = jArr3;
                        xtjVar2 = xtjVarE;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        xtjVar2 = xtjVarE;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    xtjVarE = xtjVar2;
                }
            }
        }
        return null;
    }

    public static final yak n(yak yakVar, wak wakVar, ttj ttjVar, yak yakVar2) {
        yak yakVarK;
        if (ttjVar.f()) {
            ttjVar.n(wakVar);
        }
        long jG = ttjVar.g();
        if (yakVar2.a == jG) {
            return yakVar2;
        }
        synchronized (c) {
            yakVarK = k(yakVar, wakVar);
        }
        yakVarK.a = jG;
        ttjVar.n(wakVar);
        return yakVarK;
    }

    public static final boolean o(vak vakVar) {
        yak yakVar;
        long j2 = e;
        ac1 ac1Var = f;
        if (ac1Var.a > 0) {
            j2 = ((long[]) ac1Var.c)[0];
        }
        yak yakVar2 = null;
        yak yakVarC = null;
        int i2 = 0;
        for (yak yakVarC2 = vakVar.c(); yakVarC2 != null; yakVarC2 = yakVarC2.b) {
            long j3 = yakVarC2.a;
            if (j3 != 0) {
                if (Intrinsics.c(j3, j2) >= 0) {
                    i2++;
                } else if (yakVar2 == null) {
                    i2++;
                    yakVar2 = yakVarC2;
                } else {
                    if (Intrinsics.c(yakVarC2.a, yakVar2.a) < 0) {
                        yakVar = yakVar2;
                        yakVar2 = yakVarC2;
                    } else {
                        yakVar = yakVarC2;
                    }
                    if (yakVarC == null) {
                        yakVarC = vakVar.c();
                        yak yakVar3 = yakVarC;
                        while (true) {
                            if (yakVarC == null) {
                                yakVarC = yakVar3;
                                break;
                            }
                            if (Intrinsics.c(yakVarC.a, j2) >= 0) {
                                break;
                            }
                            if (Intrinsics.c(yakVar3.a, yakVarC.a) < 0) {
                                yakVar3 = yakVarC;
                            }
                            yakVarC = yakVarC.b;
                        }
                    }
                    yakVar2.a = 0L;
                    yakVar2.a(yakVarC);
                    yakVar2 = yakVar;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(vak vakVar) {
        if (o(vakVar)) {
            uuj uujVar = g;
            int i2 = uujVar.a;
            int iIdentityHashCode = System.identityHashCode(vakVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = uujVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) uujVar.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        Reference reference = ((b2b[]) uujVar.c)[i6];
                        if (vakVar != (reference != null ? reference.get() : null)) {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) uujVar.b)[i8] == iIdentityHashCode; i8--) {
                                Reference reference2 = ((b2b[]) uujVar.c)[i8];
                                if ((reference2 != null ? reference2.get() : null) == vakVar) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = uujVar.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(uujVar.a + 1);
                                    break;
                                } else {
                                    if (((int[]) uujVar.b)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    Reference reference3 = ((b2b[]) uujVar.c)[i6];
                                    if ((reference3 != null ? reference3.get() : null) == vakVar) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                        } else {
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            b2b[] b2bVarArr = (b2b[]) uujVar.c;
            int length = b2bVarArr.length;
            if (i2 == length) {
                int i11 = length << 1;
                b2b[] b2bVarArr2 = new b2b[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                int i13 = i2 - i10;
                System.arraycopy(b2bVarArr, i10, b2bVarArr2, i12, i13);
                System.arraycopy((b2b[]) uujVar.c, 0, b2bVarArr2, 0, i10);
                System.arraycopy((int[]) uujVar.b, i10, iArr, i12, i13);
                b82.e(0, i10, 6, (int[]) uujVar.b, iArr);
                uujVar.c = b2bVarArr2;
                uujVar.b = iArr;
            } else {
                int i14 = i10 + 1;
                System.arraycopy(b2bVarArr, i10, b2bVarArr, i14, i2 - i10);
                int[] iArr2 = (int[]) uujVar.b;
                b82.c(i14, i10, i2, iArr2, iArr2);
            }
            ((b2b[]) uujVar.c)[i10] = new b2b(vakVar, (byte) 1);
            ((int[]) uujVar.b)[i10] = iIdentityHashCode;
            uujVar.a++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final yak r(yak yakVar, long j2, xtj xtjVar) {
        yak yakVar2 = null;
        while (yakVar != null) {
            long j3 = yakVar.a;
            if (j3 != 0 && Intrinsics.c(j3, j2) <= 0 && !xtjVar.d(j3) && (yakVar2 == null || Intrinsics.c(yakVar2.a, yakVar.a) < 0)) {
                yakVar2 = yakVar;
            }
            yakVar = yakVar.b;
        }
        if (yakVar2 != null) {
            return yakVar2;
        }
        return null;
    }

    public static final yak s(yak yakVar, vak vakVar) {
        yak yakVarR;
        ttj ttjVarH = h();
        Function1 function1E = ttjVarH.e();
        if (function1E != null) {
            function1E.invoke(vakVar);
        }
        yak yakVarR2 = r(yakVar, ttjVarH.g(), ttjVarH.d());
        if (yakVarR2 != null) {
            return yakVarR2;
        }
        synchronized (c) {
            ttj ttjVarH2 = h();
            yakVarR = r(vakVar.c(), ttjVarH2.g(), ttjVarH2.d());
            if (yakVarR == null) {
                q();
                throw null;
            }
        }
        return yakVarR;
    }

    public static final void t(int i2) {
        ac1 ac1Var = f;
        int i3 = ((int[]) ac1Var.e)[i2];
        ac1Var.i(i3, ac1Var.a - 1);
        ac1Var.a--;
        long[] jArr = (long[]) ac1Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (Intrinsics.c(jArr[i5], j2) <= 0) {
                break;
            }
            ac1Var.i(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) ac1Var.c;
        int i6 = ac1Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < ac1Var.a && Intrinsics.c(jArr2[i7], jArr2[i8]) < 0) {
                if (Intrinsics.c(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                ac1Var.i(i7, i3);
                i3 = i7;
            } else {
                if (Intrinsics.c(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                ac1Var.i(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) ac1Var.e)[i2] = ac1Var.b;
        ac1Var.b = i2;
    }

    public static final Object u(lz9 lz9Var, Function1 function1) {
        long j2 = lz9Var.b;
        Object objInvoke = function1.invoke(d.c(j2));
        long j3 = e;
        e = 1 + j3;
        xtj xtjVarC = d.c(j2);
        d = xtjVarC;
        lz9Var.b = j3;
        lz9Var.a = xtjVarC;
        lz9Var.g = 0;
        lz9Var.h = null;
        lz9Var.o();
        d = d.f(j3);
        return objInvoke;
    }

    public static final void v(ttj ttjVar) {
        Long lValueOf;
        if (d.d(ttjVar.g())) {
            return;
        }
        long jG = ttjVar.g();
        boolean z = ttjVar.c;
        yee yeeVar = ttjVar instanceof yee ? (yee) ttjVar : null;
        String strValueOf = yeeVar != null ? Boolean.valueOf(yeeVar.m) : "read-only";
        synchronized (c) {
            ac1 ac1Var = f;
            lValueOf = Long.valueOf(ac1Var.a > 0 ? ((long[]) ac1Var.c)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jG + ", disposed=" + z + ", applied=" + strValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final yak w(yak yakVar, vak vakVar, ttj ttjVar) {
        yak yakVarR;
        yak yakVarR2;
        if (ttjVar.f()) {
            ttjVar.n(vakVar);
        }
        long jG = ttjVar.g();
        yak yakVarR3 = r(yakVar, jG, ttjVar.d());
        if (yakVarR3 == null) {
            synchronized (c) {
                ttj ttjVarH = h();
                yakVarR2 = r(vakVar.c(), ttjVarH.g(), ttjVarH.d());
                if (yakVarR2 == null) {
                    q();
                    throw null;
                }
            }
            yakVarR3 = yakVarR2;
        }
        if (yakVarR3.a == ttjVar.g()) {
            return yakVarR3;
        }
        synchronized (c) {
            yakVarR = r(vakVar.c(), jG, ttjVar.d());
            if (yakVarR == null) {
                q();
                throw null;
            }
            if (yakVarR.a != jG) {
                yak yakVarK = k(yakVarR, vakVar);
                yakVarK.a(yakVarR);
                yakVarK.a = ttjVar.g();
                yakVarR = yakVarK;
            }
        }
        ttjVar.n(vakVar);
        return yakVarR;
    }
}
