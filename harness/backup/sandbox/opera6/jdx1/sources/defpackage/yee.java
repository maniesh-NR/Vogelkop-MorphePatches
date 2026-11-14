package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public class yee extends ttj {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public tee h;
    public ArrayList i;
    public xtj j;
    public int[] k;
    public int l;
    public boolean m;

    public yee(long j, xtj xtjVar, Function1 function1, Function1 function12) {
        super(j, xtjVar);
        this.e = function1;
        this.f = function12;
        this.j = xtj.e;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (ytj.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(tee teeVar) {
        this.h = teeVar;
    }

    public yee C(Function1 function1, Function1 function12) {
        zke zkeVar;
        if (this.c) {
            bpg.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            bpg.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = ytj.c;
        synchronized (obj) {
            long j = ytj.e;
            ytj.e = j + 1;
            ytj.d = ytj.d.f(j);
            xtj xtjVarD = d();
            r(xtjVarD.f(j));
            zkeVar = new zke(j, ytj.a(xtjVarD, g() + 1, j), ytj.i(function1, e(), true), ytj.j(function12, i()), this);
        }
        if (this.m || this.c) {
            return zkeVar;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = ytj.e;
            ytj.e = j2 + 1;
            s(j2);
            ytj.d = ytj.d.f(g());
        }
        r(ytj.a(d(), jG + 1, g()));
        return zkeVar;
    }

    @Override // defpackage.ttj
    public final void b() {
        ytj.d = ytj.d.c(g()).b(this.j);
    }

    @Override // defpackage.ttj
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (ytj.c) {
            o();
        }
        l();
    }

    @Override // defpackage.ttj
    public int h() {
        return this.g;
    }

    @Override // defpackage.ttj
    public Function1 i() {
        return this.f;
    }

    @Override // defpackage.ttj
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    @Override // defpackage.ttj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 > 0) goto Lb
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.bpg.a(r1)
        Lb:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L93
            boolean r1 = r0.m
            if (r1 != 0) goto L93
            tee r1 = r0.x()
            if (r1 == 0) goto L90
            boolean r2 = r0.m
            if (r2 == 0) goto L26
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.bpg.b(r2)
        L26:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L90
            r7 = 0
        L38:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8b
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L52:
            if (r12 >= r10) goto L89
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L85
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            vak r13 = (defpackage.vak) r13
            yak r13 = r13.c()
        L68:
            if (r13 == 0) goto L85
            long r14 = r13.a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7c
            xtj r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = kotlin.collections.CollectionsKt.E(r6, r14)
            if (r6 == 0) goto L82
        L7c:
            bli r6 = defpackage.ytj.a
            r14 = 0
            r13.a = r14
        L82:
            yak r13 = r13.b
            goto L68
        L85:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L52
        L89:
            if (r10 != r11) goto L90
        L8b:
            if (r7 == r5) goto L90
            int r7 = r7 + 1
            goto L38
        L90:
            r0.a()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yee.l():void");
    }

    @Override // defpackage.ttj
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.ttj
    public void n(vak vakVar) {
        tee teeVarX = x();
        if (teeVarX == null) {
            tee teeVar = jmi.a;
            teeVarX = new tee();
            B(teeVarX);
        }
        teeVarX.a(vakVar);
    }

    @Override // defpackage.ttj
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            ytj.t(this.k[i]);
        }
        o();
    }

    @Override // defpackage.ttj
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.ttj
    public ttj u(Function1 function1) {
        ale aleVar;
        if (this.c) {
            bpg.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            bpg.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = ytj.c;
        synchronized (obj) {
            long j = ytj.e;
            ytj.e = j + 1;
            ytj.d = ytj.d.f(j);
            aleVar = new ale(j, ytj.a(d(), jG + 1, j), ytj.i(function1, e(), true), this);
        }
        if (this.m || this.c) {
            return aleVar;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = ytj.e;
            ytj.e = j2 + 1;
            s(j2);
            ytj.d = ytj.d.f(g());
        }
        r(ytj.a(d(), jG2 + 1, g()));
        return aleVar;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (ytj.c) {
            long j = ytj.e;
            ytj.e = j + 1;
            s(j);
            ytj.d = ytj.d.f(g());
        }
        r(ytj.a(d(), jG + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zwg w() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yee.w():zwg");
    }

    public tee x() {
        return this.h;
    }

    @Override // defpackage.ttj
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.e;
    }

    public final zwg z(long j, tee teeVar, HashMap map, xtj xtjVar) {
        ArrayList arrayList;
        ArrayList arrayListV;
        ArrayList arrayList2;
        xtj xtjVar2;
        Object[] objArr;
        long[] jArr;
        xtj xtjVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        yak yakVarR;
        yak yakVarD;
        xtj xtjVarE = d().f(g()).e(this.j);
        Object[] objArr3 = teeVar.b;
        long[] jArr3 = teeVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListV = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            vak vakVar = (vak) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            yak yakVarC = vakVar.c();
                            i = i4;
                            ArrayList arrayList3 = arrayList2;
                            yak yakVarR2 = ytj.r(yakVarC, j, xtjVar);
                            ArrayList arrayList4 = arrayListV;
                            j2 = j3;
                            if (yakVarR2 == null || (yakVarR = ytj.r(yakVarC, g(), xtjVarE)) == null || yakVarR.a == 1 || yakVarR2.equals(yakVarR)) {
                                xtjVar3 = xtjVarE;
                            } else {
                                xtjVar3 = xtjVarE;
                                yak yakVarR3 = ytj.r(yakVarC, g(), d());
                                if (yakVarR3 == null) {
                                    ytj.q();
                                    throw null;
                                }
                                if (map == null || (yakVarD = (yak) map.get(yakVarR2)) == null) {
                                    yakVarD = vakVar.d(yakVarR, yakVarR2, yakVarR3);
                                }
                                if (yakVarD == null) {
                                    return new utj(this);
                                }
                                if (!yakVarD.equals(yakVarR3)) {
                                    if (yakVarD.equals(yakVarR2)) {
                                        ArrayList arrayList5 = arrayList3 == null ? new ArrayList() : arrayList3;
                                        arrayList5.add(new Pair(vakVar, yakVarR2.b(g())));
                                        arrayListV = arrayList4 == null ? new ArrayList() : arrayList4;
                                        arrayListV.add(vakVar);
                                        arrayList2 = arrayList5;
                                    } else {
                                        arrayList2 = arrayList3 == null ? new ArrayList() : arrayList3;
                                        arrayList2.add(!yakVarD.equals(yakVarR) ? new Pair(vakVar, yakVarD) : new Pair(vakVar, yakVarR.b(g())));
                                    }
                                }
                                arrayListV = arrayList4;
                            }
                            arrayList2 = arrayList3;
                            arrayListV = arrayList4;
                        } else {
                            xtjVar3 = xtjVarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        xtjVarE = xtjVar3;
                    }
                    xtjVar2 = xtjVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    arrayList2 = arrayList2;
                    arrayListV = arrayListV;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    xtjVar2 = xtjVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                xtjVarE = xtjVar2;
            }
        } else {
            arrayList = null;
            arrayListV = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList2.get(i5);
                vak vakVar2 = (vak) pair.a;
                yak yakVar = (yak) pair.b;
                yakVar.a = j;
                synchronized (ytj.c) {
                    yakVar.b = vakVar2.c();
                    vakVar2.b(yakVar);
                }
            }
        }
        if (arrayListV != null) {
            int size2 = arrayListV.size();
            for (int i6 = 0; i6 < size2; i6++) {
                teeVar.l((vak) arrayListV.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListV = CollectionsKt.V(arrayListV, arrayList6);
            }
            this.i = arrayListV;
        }
        return vtj.a;
    }
}
