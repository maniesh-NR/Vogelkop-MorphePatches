package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o41 implements as6, View.OnAttachStateChangeListener {
    public final v31 a;
    public final q2 b;
    public esg c;
    public final ArrayList d = new ArrayList();
    public k41 e = k41.a;
    public boolean f = true;
    public final p04 g = xf8.h(1, null, null, 6);
    public jde h;
    public long i;
    public final jde j;
    public l0j k;
    public boolean l;
    public final c4 m;

    public o41(v31 v31Var, q2 q2Var) {
        this.a = v31Var;
        this.b = q2Var;
        new Handler(Looper.getMainLooper());
        jde jdeVar = xbb.a;
        this.h = jdeVar;
        this.j = new jde();
        this.k = new l0j(v31Var.u.A(), jdeVar);
        this.m = new c4(this, (byte) 21);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (defpackage.nb6.p(100, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0082 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.n41
            if (r0 == 0) goto L13
            r0 = r9
            n41 r0 = (defpackage.n41) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            n41 r0 = new n41
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            k04 r2 = r0.t
            defpackage.ybh.y(r9)
        L2b:
            r9 = r2
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            r8 = 0
            return r8
        L34:
            k04 r2 = r0.t
            defpackage.ybh.y(r9)
            goto L51
        L3a:
            defpackage.ybh.y(r9)
            k04 r9 = new k04
            p04 r2 = r8.g
            r9.<init>(r2)
        L44:
            r0.t = r9
            r0.w = r4
            java.lang.Object r2 = r9.b(r0)
            if (r2 == r1) goto L84
            r7 = r2
            r2 = r9
            r9 = r7
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L85
            r2.c()
            boolean r9 = r8.d()
            if (r9 == 0) goto L65
            r8.e()
        L65:
            v31 r9 = r8.a
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.l
            if (r5 != 0) goto L78
            if (r9 == 0) goto L78
            r8.l = r4
            c4 r5 = r8.m
            r9.post(r5)
        L78:
            r0.t = r2
            r0.w = r3
            r5 = 100
            java.lang.Object r9 = defpackage.nb6.p(r5, r0)
            if (r9 != r1) goto L2b
        L84:
            return r1
        L85:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o41.a(nt5):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final void b(jde jdeVar) throws pxb {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long[] jArr3;
        l0j l0jVar;
        int i3;
        long[] jArr4;
        l0j l0jVar2;
        String str;
        long j3;
        String str2;
        int i4;
        jde jdeVar2 = jdeVar;
        int[] iArr3 = jdeVar2.b;
        long[] jArr5 = jdeVar2.a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j4 = jArr5[i5];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j4 & 255) < 128) {
                        int i9 = iArr3[(i5 << 3) + i8];
                        c = c2;
                        l0j l0jVar3 = (l0j) this.j.e(i9);
                        m0j m0jVar = (m0j) jdeVar2.e(i9);
                        k0j k0jVar = m0jVar != null ? m0jVar.a : null;
                        if (k0jVar == null) {
                            throw vep.q("no value for specified key");
                        }
                        j2 = j5;
                        int i10 = k0jVar.f;
                        see seeVar = k0jVar.d.a;
                        String str3 = "Invalid content capture ID";
                        if (l0jVar3 == null) {
                            Object[] objArr = seeVar.b;
                            long[] jArr6 = seeVar.a;
                            int i11 = i6;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j6 = jArr6[i12];
                                    j = j4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j6 & 255) < 128) {
                                                j3 = j6;
                                                p0j p0jVar = (p0j) objArr[(i12 << 3) + i14];
                                                p0j p0jVar2 = n0j.C;
                                                if (Intrinsics.a(p0jVar, p0jVar2)) {
                                                    Object objG = seeVar.g(p0jVar2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    String strValueOf = String.valueOf(list != null ? (sf1) CollectionsKt.firstOrNull(list) : null);
                                                    esg esgVar = this.c;
                                                    if (esgVar != null) {
                                                        str2 = str3;
                                                        i4 = i8;
                                                        AutofillId autofillIdY = esgVar.y(i10);
                                                        if (autofillIdY == null) {
                                                            throw vep.q(str2);
                                                        }
                                                        ((ContentCaptureSession) esgVar.b).notifyViewTextChanged(autofillIdY, strValueOf);
                                                    }
                                                }
                                                j6 = j3 >> i11;
                                                i14++;
                                                i8 = i4;
                                                str3 = str2;
                                            } else {
                                                j3 = j6;
                                            }
                                            str2 = str3;
                                            i4 = i8;
                                            j6 = j3 >> i11;
                                            i14++;
                                            i8 = i4;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        i = i8;
                                        if (i13 != i11) {
                                            break;
                                        }
                                    } else {
                                        str = str3;
                                        i = i8;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    j4 = j;
                                    i8 = i;
                                    str3 = str;
                                    i11 = 8;
                                }
                            } else {
                                j = j4;
                                i = i8;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            j = j4;
                            i = i8;
                            Object[] objArr2 = seeVar.b;
                            long[] jArr7 = seeVar.a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j7 = jArr7[i15];
                                    Object[] objArr3 = objArr2;
                                    long[] jArr8 = jArr7;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j7 & 255) < 128) {
                                                p0j p0jVar3 = (p0j) objArr3[(i15 << 3) + i17];
                                                i3 = i17;
                                                p0j p0jVar4 = n0j.C;
                                                if (Intrinsics.a(p0jVar3, p0jVar4)) {
                                                    Object objG2 = l0jVar3.a.a.g(p0jVar4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    sf1 sf1Var = list2 != null ? (sf1) CollectionsKt.firstOrNull(list2) : null;
                                                    Object objG3 = seeVar.g(p0jVar4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    sf1 sf1Var2 = list3 != null ? (sf1) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.a(sf1Var, sf1Var2)) {
                                                        String strValueOf2 = String.valueOf(sf1Var2);
                                                        esg esgVar2 = this.c;
                                                        if (esgVar2 != null) {
                                                            jArr4 = jArr8;
                                                            l0jVar2 = l0jVar3;
                                                            AutofillId autofillIdY2 = esgVar2.y(i10);
                                                            if (autofillIdY2 == null) {
                                                                throw vep.q("Invalid content capture ID");
                                                            }
                                                            ((ContentCaptureSession) esgVar2.b).notifyViewTextChanged(autofillIdY2, strValueOf2);
                                                        }
                                                    }
                                                }
                                                j7 >>= 8;
                                                i17 = i3 + 1;
                                                l0jVar3 = l0jVar2;
                                                jArr8 = jArr4;
                                            } else {
                                                i3 = i17;
                                            }
                                            jArr4 = jArr8;
                                            l0jVar2 = l0jVar3;
                                            j7 >>= 8;
                                            i17 = i3 + 1;
                                            l0jVar3 = l0jVar2;
                                            jArr8 = jArr4;
                                        }
                                        jArr3 = jArr8;
                                        l0jVar = l0jVar3;
                                        if (i16 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr8;
                                        l0jVar = l0jVar3;
                                    }
                                    if (i15 == length3) {
                                        break;
                                    }
                                    i15++;
                                    objArr2 = objArr3;
                                    l0jVar3 = l0jVar;
                                    jArr7 = jArr3;
                                }
                            }
                        }
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i8;
                        i2 = i6;
                    }
                    j4 = j >> i2;
                    i8 = i + 1;
                    jdeVar2 = jdeVar;
                    i6 = i2;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr5;
                if (i7 != i6) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            jdeVar2 = jdeVar;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }

    public final jde c() {
        if (this.f) {
            this.f = false;
            this.h = x7d.h(this.a.u, new y2((byte) 29));
            this.i = System.currentTimeMillis();
        }
        return this.h;
    }

    public final boolean d() {
        return this.c != null;
    }

    public final void e() {
        esg esgVar = this.c;
        if (esgVar != null) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) esgVar.b;
            ArrayList arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                xp5 xp5Var = (xp5) arrayList.get(i);
                int iOrdinal = xp5Var.c.ordinal();
                if (iOrdinal == 0) {
                    bxk bxkVar = xp5Var.d;
                    if (bxkVar != null) {
                        contentCaptureSession.notifyViewAppeared((ViewStructure) bxkVar.b);
                    }
                } else if (iOrdinal != 1) {
                    h9o.p();
                    return;
                } else {
                    AutofillId autofillIdY = esgVar.y(xp5Var.a);
                    if (autofillIdY != null) {
                        contentCaptureSession.notifyViewDisappeared(autofillIdY);
                    }
                }
            }
            contentCaptureSession.notifyViewsDisappeared(((View) esgVar.c).getAutofillId(), new long[]{Long.MIN_VALUE});
            arrayList.clear();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final void f(k0j k0jVar, l0j l0jVar) throws pxb {
        fx0 fx0Var = new fx0(l0jVar, this, (byte) 2);
        k0jVar.getClass();
        List listJ = k0j.j(4, k0jVar);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (c().b(((k0j) obj).f)) {
                fx0Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listJ2 = k0j.j(4, k0jVar);
        int size2 = listJ2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            k0j k0jVar2 = (k0j) listJ2.get(i3);
            jde jdeVarC = c();
            int i4 = k0jVar2.f;
            if (jdeVarC.b(i4)) {
                jde jdeVar = this.j;
                if (jdeVar.b(i4)) {
                    Object objE = jdeVar.e(i4);
                    if (objE == null) {
                        throw vep.q("node not present in pruned tree before this change");
                    }
                    f(k0jVar2, (l0j) objE);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r19, defpackage.k0j r20) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o41.g(int, k0j):void");
    }

    public final void h(k0j k0jVar) {
        if (d()) {
            this.d.add(new xp5(k0jVar.f, this.i, yp5.b, null));
            List listJ = k0j.j(4, k0jVar);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                h((k0j) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r17 = this;
            r0 = r17
            jde r1 = r0.j
            r1.a()
            jde r2 = r0.c()
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            m0j r13 = (defpackage.m0j) r13
            l0j r15 = new l0j
            k0j r13 = r13.a
            jde r6 = r0.c()
            r15.<init>(r13, r6)
            r1.i(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            l0j r1 = new l0j
            v31 r2 = r0.a
            i3j r2 = r2.u
            k0j r2 = r2.A()
            jde r3 = r0.c()
            r1.<init>(r2, r3)
            r0.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o41.i():void");
    }

    public final void onStart(ndc ndcVar) {
        this.c = (esg) this.b.invoke();
        g(-1, this.a.u.A());
        e();
    }

    public final void onStop(ndc ndcVar) {
        h(this.a.u.A());
        e();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.getHandler().removeCallbacks(this.m);
        this.c = null;
    }
}
