package defpackage;

import J.N;
import android.os.Trace;
import com.opera.android.browser.chromium.ChromiumContent;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.ui.base.ViewAndroidDelegate;

/* loaded from: classes.dex */
public final class d37 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public static void C(ChromiumContent chromiumContent, boolean z) {
        GestureListenerManagerImpl gestureListenerManagerImplE = GestureListenerManagerImpl.e(chromiumContent.e());
        long j = gestureListenerManagerImplE.j;
        if (j != 0) {
            N.M6a5zchR(j, z);
        }
        long j2 = gestureListenerManagerImplE.j;
        if (j2 == 0) {
            return;
        }
        N.MrZmTSS9(j2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(defpackage.m3c r5, defpackage.yo5 r6) {
        /*
            m3c r0 = r5.h
            q3c r1 = r5.G
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L15
            if (r0 == 0) goto L28
            u1d r0 = r1.q
            long r3 = r6.a
            boolean r6 = r0.D0(r3)
            goto L29
        L15:
            u1d r6 = r1.q
            if (r6 == 0) goto L1c
            yo5 r1 = r6.n
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 == 0) goto L28
            if (r0 == 0) goto L28
            long r0 = r1.a
            boolean r6 = r6.D0(r0)
            goto L29
        L28:
            r6 = r2
        L29:
            m3c r0 = r5.u()
            if (r6 == 0) goto L51
            if (r0 == 0) goto L51
            m3c r1 = r0.h
            r3 = 3
            if (r1 != 0) goto L3a
            defpackage.m3c.V(r0, r2, r3)
            return r6
        L3a:
            k3c r1 = r5.s()
            k3c r4 = defpackage.k3c.a
            if (r1 != r4) goto L46
            defpackage.m3c.T(r0, r2, r3)
            return r6
        L46:
            k3c r5 = r5.s()
            k3c r1 = defpackage.k3c.b
            if (r5 != r1) goto L51
            r0.S(r2)
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d37.f(m3c, yo5):boolean");
    }

    public static boolean g(m3c m3cVar, yo5 yo5Var) throws Throwable {
        boolean zB0;
        if (yo5Var != null) {
            if (m3cVar.C == k3c.c) {
                m3cVar.e();
            }
            zB0 = m3cVar.G.p.B0(yo5Var.a);
        } else {
            sfd sfdVar = m3cVar.G.p;
            yo5 yo5Var2 = sfdVar.j ? new yo5(sfdVar.d) : null;
            if (yo5Var2 != null) {
                if (m3cVar.C == k3c.c) {
                    m3cVar.e();
                }
                zB0 = m3cVar.G.p.B0(yo5Var2.a);
            } else {
                m3cVar.getClass();
                zB0 = false;
            }
        }
        m3c m3cVarU = m3cVar.u();
        if (zB0 && m3cVarU != null) {
            if (m3cVar.r() == k3c.a) {
                m3c.V(m3cVarU, false, 3);
                return zB0;
            }
            if (m3cVar.r() == k3c.b) {
                m3cVarU.U(false);
            }
        }
        return zB0;
    }

    public static boolean n(m3c m3cVar) {
        u1d u1dVar;
        n3c n3cVar;
        if (m3cVar.G.e) {
            return (m3cVar.s() == k3c.c && ((u1dVar = m3cVar.G.q) == null || (n3cVar = u1dVar.r) == null || !n3cVar.e())) ? false : true;
        }
        return false;
    }

    public static boolean o(m3c m3cVar) {
        if (!m3cVar.q()) {
            return false;
        }
        do {
            if (m3cVar.r() == k3c.c && !m3cVar.G.p.x.e()) {
                m3c m3cVarU = m3cVar.u();
                if ((m3cVarU != null ? m3cVarU.G.d : null) != i3c.a) {
                    return false;
                }
            }
            m3cVar = m3cVar.u();
            if (m3cVar == null) {
                return false;
            }
        } while (!m3cVar.I());
        return true;
    }

    public static boolean q(m3c m3cVar) {
        u1d u1dVar;
        n3c n3cVar;
        q3c q3cVar = m3cVar.G;
        return m3cVar.I() || q3cVar.p.t || o(m3cVar) || Intrinsics.a(m3cVar.J(), Boolean.TRUE) || n(m3cVar) || q3cVar.p.x.e() || !((u1dVar = q3cVar.q) == null || (n3cVar = u1dVar.r) == null || !n3cVar.e());
    }

    public final boolean A(m3c m3cVar, boolean z) {
        int iOrdinal = m3cVar.G.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                ((dfe) this.g).c(new qfd(m3cVar, false, z));
            } else {
                if (iOrdinal != 4) {
                    h9o.p();
                    return false;
                }
                if (!m3cVar.q() || z) {
                    m3cVar.G.p.u = true;
                    if (!m3cVar.Q && (m3cVar.I() || o(m3cVar))) {
                        m3c m3cVarU = m3cVar.u();
                        if (m3cVarU == null || !m3cVarU.q()) {
                            ((d5o) this.d).n(m3cVar, kjb.c);
                        }
                        if (!this.b) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final ehc B() {
        ehc ehcVarB = a.b();
        int iOrdinal = ((lom) this.c).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ehcVarB.add(wol.c);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    h9o.p();
                    return null;
                }
                ehcVarB.add(wol.d);
            }
        }
        int iOrdinal2 = ((pv0) ((kze) this.d).g()).ordinal();
        if (iOrdinal2 == 0) {
            ehcVarB.add(wol.e);
        } else if (iOrdinal2 != 1) {
            h9o.p();
            return null;
        }
        ehcVarB.add(wol.f);
        ehcVarB.add(wol.g);
        ehcVarB.add(wol.h);
        ehcVarB.add(wol.i);
        if (this.a) {
            ehcVarB.add(wol.j);
        }
        if (((ekc) this.f).g() == m18.b) {
            ehcVarB.add(wol.m);
        }
        if (Intrinsics.a(((ekc) this.g).g(), Boolean.TRUE)) {
            ehcVarB.add(wol.n);
        }
        if (this.b) {
            ehcVarB.add(wol.k);
        }
        if (((Boolean) ((pde) this.e).g()).booleanValue()) {
            ehcVarB.add(wol.l);
        }
        return a.a(ehcVarB);
    }

    public final void D(long j) {
        m3c m3cVar = (m3c) this.c;
        q3c q3cVar = m3cVar.G;
        yo5 yo5Var = (yo5) this.h;
        if (yo5Var == null ? false : yo5.b(yo5Var.a, j)) {
            return;
        }
        if (this.a) {
            a8b.a("updateRootConstraints called while measuring");
        }
        this.h = new yo5(j);
        if (m3cVar.H()) {
            m3c m3cVar2 = m3cVar.h;
            if (m3cVar2 != null) {
                q3cVar.e = true;
            }
            q3cVar.p.u = true;
            ((d5o) this.d).n(m3cVar, m3cVar2 != null ? kjb.a : kjb.c);
        }
    }

    public final void a(e37 e37Var, int i, ArrayList arrayList, ubi ubiVar) {
        f1o f1oVar = e37Var.d;
        ubi ubiVar2 = f1oVar.c;
        e37 e37Var2 = f1oVar.i;
        e37 e37Var3 = f1oVar.h;
        if (ubiVar2 == null) {
            vo5 vo5Var = (vo5) this.c;
            if (f1oVar == vo5Var.d || f1oVar == vo5Var.e) {
                return;
            }
            if (ubiVar == null) {
                ubiVar = new ubi();
                ubiVar.a = null;
                ubiVar.b = new ArrayList();
                ubiVar.a = f1oVar;
                arrayList.add(ubiVar);
            }
            f1oVar.c = ubiVar;
            ubiVar.b.add(f1oVar);
            ArrayList arrayList2 = e37Var3.k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                z27 z27Var = (z27) obj;
                if (z27Var instanceof e37) {
                    a((e37) z27Var, i, arrayList, ubiVar);
                }
            }
            ArrayList arrayList3 = e37Var2.k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                z27 z27Var2 = (z27) obj2;
                if (z27Var2 instanceof e37) {
                    a((e37) z27Var2, i, arrayList, ubiVar);
                }
            }
            if (i == 1 && (f1oVar instanceof k2n)) {
                ArrayList arrayList4 = ((k2n) f1oVar).k.k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    z27 z27Var3 = (z27) obj3;
                    if (z27Var3 instanceof e37) {
                        a((e37) z27Var3, i, arrayList, ubiVar);
                    }
                }
            }
            ArrayList arrayList5 = e37Var3.l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                a((e37) obj4, i, arrayList, ubiVar);
            }
            ArrayList arrayList6 = e37Var2.l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                a((e37) obj5, i, arrayList, ubiVar);
            }
            if (i == 1 && (f1oVar instanceof k2n)) {
                ArrayList arrayList7 = ((k2n) f1oVar).k.l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    a((e37) obj6, i, arrayList, ubiVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c7, code lost:
    
        if (r6 != 2) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0285 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.vo5 r25) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d37.b(vo5):void");
    }

    public final void c() {
        vo5 vo5Var = (vo5) this.c;
        ArrayList arrayList = (ArrayList) this.f;
        ArrayList arrayList2 = (ArrayList) this.e;
        arrayList2.clear();
        vo5 vo5Var2 = (vo5) this.d;
        vo5Var2.d.f();
        vo5Var2.e.f();
        arrayList2.add(vo5Var2.d);
        arrayList2.add(vo5Var2.e);
        ArrayList arrayList3 = vo5Var2.p0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            uo5 uo5Var = (uo5) obj;
            if (uo5Var instanceof r5a) {
                s5a s5aVar = new s5a(uo5Var);
                uo5Var.d.f();
                uo5Var.e.f();
                s5aVar.f = ((r5a) uo5Var).t0;
                arrayList2.add(s5aVar);
            } else {
                if (uo5Var.u()) {
                    if (uo5Var.b == null) {
                        uo5Var.b = new er4(uo5Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(uo5Var.b);
                } else {
                    arrayList2.add(uo5Var.d);
                }
                if (uo5Var.v()) {
                    if (uo5Var.c == null) {
                        uo5Var.c = new er4(uo5Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(uo5Var.c);
                } else {
                    arrayList2.add(uo5Var.e);
                }
                if (uo5Var instanceof gaa) {
                    arrayList2.add(new faa(uo5Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((f1o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            f1o f1oVar = (f1o) obj3;
            if (f1oVar.b != vo5Var2) {
                f1oVar.d();
            }
        }
        arrayList.clear();
        k(vo5Var.d, 0, arrayList);
        k(vo5Var.e, 1, arrayList);
        this.a = false;
    }

    public final int d(vo5 vo5Var, int i) {
        ArrayList arrayList;
        long jMax;
        int i2;
        float f;
        vo5 vo5Var2 = vo5Var;
        ArrayList arrayList2 = (ArrayList) this.f;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            f1o f1oVar = ((ubi) arrayList2.get(i3)).a;
            if (!(f1oVar instanceof er4) ? !(i != 0 ? (f1oVar instanceof k2n) : (f1oVar instanceof tga)) : ((er4) f1oVar).f != i) {
                f1o f1oVar2 = i == 0 ? vo5Var2.d : vo5Var2.e;
                e37 e37Var = f1oVar2.h;
                e37 e37Var2 = f1oVar2.i;
                e37 e37Var3 = f1oVar.h;
                e37 e37Var4 = f1oVar.i;
                boolean zContains = e37Var3.l.contains(e37Var);
                boolean zContains2 = e37Var4.l.contains(e37Var2);
                long j2 = f1oVar.j();
                if (!zContains) {
                    arrayList = arrayList2;
                    i2 = i3;
                    jMax = zContains2 ? Math.max(-ubi.a(e37Var4, e37Var4.f), (-e37Var4.f) + j2) : (f1oVar.j() + e37Var3.f) - e37Var4.f;
                } else if (zContains2) {
                    long jB = ubi.b(e37Var3, j);
                    arrayList = arrayList2;
                    long jA = ubi.a(e37Var4, j);
                    long j3 = jB - j2;
                    int i4 = e37Var4.f;
                    i2 = i3;
                    if (j3 >= (-i4)) {
                        j3 += i4;
                    }
                    long j4 = e37Var3.f;
                    long j5 = ((-jA) - j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    uo5 uo5Var = f1oVar.b;
                    if (i == 0) {
                        f = uo5Var.c0;
                    } else if (i == 1) {
                        f = uo5Var.d0;
                    } else {
                        uo5Var.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (e37Var3.f + ((((long) ((f2 * f) + 0.5f)) + j2) + ((long) v0g.g(1.0f, f, f2, 0.5f)))) - e37Var4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    jMax = Math.max(ubi.b(e37Var3, e37Var3.f), e37Var3.f + j2);
                }
            } else {
                arrayList = arrayList2;
                jMax = j;
                i2 = i3;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            vo5Var2 = vo5Var;
            j = 0;
        }
        return (int) jMax2;
    }

    public final void e(boolean z) {
        s6h s6hVar = (s6h) this.e;
        dfe dfeVar = (dfe) s6hVar.a;
        if (z) {
            m3c m3cVar = (m3c) this.c;
            if (m3cVar.P > 0) {
                dfeVar.h();
                dfeVar.c(m3cVar);
                m3cVar.O = true;
            }
        }
        if (dfeVar.c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                s6hVar.G();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void h() {
        dfe dfeVar = (dfe) this.g;
        int i = dfeVar.c;
        if (i != 0) {
            Object[] objArr = dfeVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                qfd qfdVar = (qfd) objArr[i2];
                if (qfdVar.a.H()) {
                    boolean z = qfdVar.b;
                    m3c m3cVar = qfdVar.a;
                    boolean z2 = qfdVar.c;
                    if (z) {
                        m3c.T(m3cVar, z2, 2);
                    } else {
                        m3c.V(m3cVar, z2, 2);
                    }
                }
            }
            dfeVar.h();
        }
    }

    public final void i(m3c m3cVar) {
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar2 = (m3c) objArr[i2];
            if (Intrinsics.a(m3cVar2.J(), Boolean.TRUE) && !m3cVar2.Q) {
                if (((d5o) this.d).t(m3cVar2)) {
                    m3cVar2.K();
                }
                i(m3cVar2);
            }
        }
    }

    public final void j(ChromiumContent chromiumContent, boolean z) {
        ChromiumContent chromiumContent2;
        hq9 hq9Var = (hq9) this.h;
        if (hq9Var != null) {
            xy0 xy0Var = hq9Var.i;
            xy0Var.removeMessages(1);
            xy0Var.removeMessages(2);
            xy0Var.removeMessages(3);
            xy0Var.sendEmptyMessage(2);
            this.h = null;
        }
        ViewAndroidDelegate viewAndroidDelegateJ0 = chromiumContent.e().J0();
        if (viewAndroidDelegateJ0 != null) {
            chromiumContent2 = chromiumContent;
            this.h = new hq9(viewAndroidDelegateJ0.b, chromiumContent2, (umi) this.c, (x5f) this.d, (hd) this.e, (ki) this.f, this.b, z);
        } else {
            chromiumContent2 = chromiumContent;
        }
        this.a = chromiumContent2.o.j();
    }

    public final void k(f1o f1oVar, int i, ArrayList arrayList) {
        e37 e37Var = f1oVar.h;
        e37 e37Var2 = f1oVar.i;
        ArrayList arrayList2 = e37Var.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            z27 z27Var = (z27) obj;
            if (z27Var instanceof e37) {
                a((e37) z27Var, i, arrayList, null);
            } else if (z27Var instanceof f1o) {
                a(((f1o) z27Var).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = e37Var2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            z27 z27Var2 = (z27) obj2;
            if (z27Var2 instanceof e37) {
                a((e37) z27Var2, i, arrayList, null);
            } else if (z27Var2 instanceof f1o) {
                a(((f1o) z27Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((k2n) f1oVar).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                z27 z27Var3 = (z27) obj3;
                if (z27Var3 instanceof e37) {
                    a((e37) z27Var3, i, arrayList, null);
                }
            }
        }
    }

    public final void l(m3c m3cVar, boolean z) {
        if (!this.a) {
            a8b.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? m3cVar.G.e : m3cVar.q()) {
            a8b.a("node not yet measured");
        }
        m(m3cVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.m3c r8, boolean r9) throws java.lang.Throwable {
        /*
            r7 = this;
            dfe r0 = r8.z()
            java.lang.Object[] r1 = r0.a
            int r0 = r0.c
            r2 = 0
        L9:
            if (r2 >= r0) goto L7d
            r3 = r1[r2]
            m3c r3 = (defpackage.m3c) r3
            r4 = 1
            if (r9 != 0) goto L27
            k3c r5 = r3.r()
            k3c r6 = defpackage.k3c.a
            if (r5 == r6) goto L3f
            q3c r5 = r3.G
            sfd r5 = r5.p
            n3c r5 = r5.x
            boolean r5 = r5.e()
            if (r5 == 0) goto L7a
            goto L3f
        L27:
            k3c r5 = r3.s()
            k3c r6 = defpackage.k3c.a
            if (r5 == r6) goto L3f
            q3c r5 = r3.G
            u1d r5 = r5.q
            if (r5 == 0) goto L7a
            n3c r5 = r5.r
            if (r5 == 0) goto L7a
            boolean r5 = r5.e()
            if (r5 != r4) goto L7a
        L3f:
            boolean r5 = defpackage.ui6.M(r3)
            q3c r6 = r3.G
            if (r5 == 0) goto L5e
            if (r9 != 0) goto L5e
            boolean r5 = r6.e
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r7.d
            d5o r5 = (defpackage.d5o) r5
            boolean r5 = r5.t(r3)
            if (r5 == 0) goto L5b
            r7.x(r3, r4)
            goto L5e
        L5b:
            r7.l(r3, r4)
        L5e:
            if (r9 == 0) goto L63
            boolean r4 = r6.e
            goto L67
        L63:
            boolean r4 = r3.q()
        L67:
            if (r4 == 0) goto L6c
            r7.x(r3, r9)
        L6c:
            if (r9 == 0) goto L71
            boolean r4 = r6.e
            goto L75
        L71:
            boolean r4 = r3.q()
        L75:
            if (r4 != 0) goto L7a
            r7.m(r3, r9)
        L7a:
            int r2 = r2 + 1
            goto L9
        L7d:
            if (r9 == 0) goto L84
            q3c r0 = r8.G
            boolean r0 = r0.e
            goto L88
        L84:
            boolean r0 = r8.q()
        L88:
            if (r0 == 0) goto L8d
            r7.x(r8, r9)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d37.m(m3c, boolean):void");
    }

    public final boolean p() {
        return ((hq9) this.h) != null;
    }

    public final void r(int i, int i2, int i3, int i4, uo5 uo5Var) {
        cb3 cb3Var = (cb3) this.h;
        cb3Var.a = i;
        cb3Var.b = i3;
        cb3Var.c = i2;
        cb3Var.d = i4;
        ((n5h) this.g).d(uo5Var, cb3Var);
        uo5Var.J(cb3Var.e);
        uo5Var.G(cb3Var.f);
        uo5Var.D = cb3Var.h;
        uo5Var.D(cb3Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [b8e] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean s(Function0 function0) {
        boolean z;
        b8e b8eVarU;
        boolean z2;
        m3c m3cVar;
        boolean z3;
        boolean zX;
        d5o d5oVar = (d5o) this.d;
        qq6 qq6Var = (qq6) d5oVar.a;
        m3c m3cVar2 = (m3c) this.c;
        if (!m3cVar2.H()) {
            a8b.a("performMeasureAndLayout called with unattached root");
        }
        if (!m3cVar2.I()) {
            a8b.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.a) {
            a8b.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (((yo5) this.h) != null) {
            this.a = true;
            this.b = true;
            try {
                if (d5oVar.E()) {
                    z = false;
                    while (true) {
                        qq6 qq6Var2 = (qq6) d5oVar.c;
                        awj awjVar = (awj) qq6Var2.b;
                        qq6 qq6Var3 = (qq6) d5oVar.b;
                        awj awjVar2 = (awj) qq6Var3.b;
                        if (!((awj) qq6Var.b).isEmpty()) {
                            m3cVar = (m3c) ((awj) qq6Var.b).first();
                            qq6Var.j(m3cVar);
                            z3 = m3cVar.h != null;
                            z2 = false;
                        } else if (!awjVar2.isEmpty()) {
                            m3cVar = (m3c) awjVar2.first();
                            qq6Var3.j(m3cVar);
                            z3 = m3cVar.h != null;
                            z2 = true;
                        } else {
                            if (awjVar.isEmpty()) {
                                break;
                            }
                            m3c m3cVar3 = (m3c) awjVar.first();
                            qq6Var2.j(m3cVar3);
                            z2 = true;
                            m3cVar = m3cVar3;
                            z3 = false;
                        }
                        if (z2) {
                            zX = w(m3cVar, z3);
                        } else {
                            zX = x(m3cVar, z3);
                            if (m3cVar.G.f) {
                                d5oVar.n(m3cVar, kjb.b);
                            }
                            if (m3cVar.p()) {
                                d5oVar.n(m3cVar, kjb.d);
                            }
                        }
                        if (m3cVar == m3cVar2 && zX) {
                            z = true;
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        dfe dfeVar = (dfe) this.f;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        int i2 = 0;
        while (i2 < i) {
            tah tahVar = ((m3c) objArr[i2]).F;
            j8b j8bVar = (j8b) tahVar.b;
            boolean zG = xye.g(4194304);
            b8e b8eVar = j8bVar.b0;
            if (zG || (b8eVar = b8eVar.e) != null) {
                zbe zbeVar = wye.U;
                b8e b8eVarC1 = j8bVar.c1(zG);
                while (b8eVarC1 != null && (b8eVarC1.d & 4194304) != 0) {
                    if ((b8eVarC1.c & 4194304) != 0) {
                        i17 i17Var = b8eVarC1;
                        dfe dfeVar2 = null;
                        while (i17Var != 0) {
                            if (i17Var instanceof z1c) {
                                ((z1c) i17Var).X((j8b) tahVar.b);
                            } else {
                                if ((i17Var.c & 4194304) != 0 && (i17Var instanceof i17)) {
                                    b8e b8eVar2 = i17Var.p;
                                    ?? r15 = z4;
                                    b8eVarU = i17Var;
                                    dfeVar2 = dfeVar2;
                                    while (b8eVar2 != null) {
                                        if ((b8eVar2.c & 4194304) != 0) {
                                            r15++;
                                            dfeVar2 = dfeVar2;
                                            if (r15 == 1) {
                                                b8eVarU = b8eVar2;
                                            } else {
                                                if (dfeVar2 == null) {
                                                    dfeVar2 = new dfe(new b8e[16]);
                                                }
                                                if (b8eVarU != null) {
                                                    dfeVar2.c(b8eVarU);
                                                    b8eVarU = null;
                                                }
                                                dfeVar2.c(b8eVar2);
                                            }
                                        }
                                        b8eVar2 = b8eVar2.f;
                                        b8eVarU = b8eVarU;
                                        dfeVar2 = dfeVar2;
                                        r15 = r15;
                                    }
                                    if (r15 == 1) {
                                    }
                                }
                                z4 = false;
                                i17Var = b8eVarU;
                                dfeVar2 = dfeVar2;
                            }
                            b8eVarU = ui6.U(dfeVar2);
                            z4 = false;
                            i17Var = b8eVarU;
                            dfeVar2 = dfeVar2;
                        }
                    }
                    if (b8eVarC1 != b8eVar) {
                        b8eVarC1 = b8eVarC1.f;
                        z4 = false;
                    }
                }
            }
            i2++;
            z4 = false;
        }
        dfeVar.h();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [b8e] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void t(m3c m3cVar, long j) {
        m3c m3cVar2 = (m3c) this.c;
        boolean z = m3cVar.Q;
        q3c q3cVar = m3cVar.G;
        if (z) {
            return;
        }
        if (m3cVar == m3cVar2) {
            a8b.a("measureAndLayout called on root");
        }
        if (!m3cVar2.H()) {
            a8b.a("performMeasureAndLayout called with unattached root");
        }
        if (!m3cVar2.I()) {
            a8b.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.a) {
            a8b.a("performMeasureAndLayout called during measure layout");
        }
        if (((yo5) this.h) != null) {
            this.a = true;
            this.b = false;
            try {
                d5o d5oVar = (d5o) this.d;
                ((qq6) d5oVar.a).j(m3cVar);
                ((qq6) d5oVar.b).j(m3cVar);
                ((qq6) d5oVar.c).j(m3cVar);
                if ((f(m3cVar, new yo5(j)) || q3cVar.f) && Intrinsics.a(m3cVar.J(), Boolean.TRUE)) {
                    m3cVar.K();
                }
                i(m3cVar);
                if (m3cVar.C == k3c.c) {
                    m3cVar.e();
                }
                boolean zB0 = q3cVar.p.B0(j);
                m3c m3cVarU = m3cVar.u();
                if (zB0 && m3cVarU != null) {
                    if (m3cVar.r() == k3c.a) {
                        m3c.V(m3cVarU, false, 3);
                    } else if (m3cVar.r() == k3c.b) {
                        m3cVarU.U(false);
                    }
                }
                if (m3cVar.p() && m3cVar.I()) {
                    m3cVar.R();
                    s6h s6hVar = (s6h) this.e;
                    if (m3cVar.P > 0) {
                        ((dfe) s6hVar.a).c(m3cVar);
                        m3cVar.O = true;
                    }
                }
                h();
            } finally {
            }
        }
        dfe dfeVar = (dfe) this.f;
        Object[] objArr = dfeVar.a;
        int i = dfeVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            tah tahVar = ((m3c) objArr[i2]).F;
            j8b j8bVar = (j8b) tahVar.b;
            boolean zG = xye.g(4194304);
            b8e b8eVar = j8bVar.b0;
            if (zG || (b8eVar = b8eVar.e) != null) {
                zbe zbeVar = wye.U;
                for (b8e b8eVarC1 = j8bVar.c1(zG); b8eVarC1 != null && (b8eVarC1.d & 4194304) != 0; b8eVarC1 = b8eVarC1.f) {
                    if ((b8eVarC1.c & 4194304) != 0) {
                        i17 i17VarU = b8eVarC1;
                        ?? dfeVar2 = 0;
                        while (i17VarU != 0) {
                            if (i17VarU instanceof z1c) {
                                ((z1c) i17VarU).X((j8b) tahVar.b);
                            } else if ((i17VarU.c & 4194304) != 0 && (i17VarU instanceof i17)) {
                                b8e b8eVar2 = i17VarU.p;
                                int i3 = 0;
                                i17VarU = i17VarU;
                                dfeVar2 = dfeVar2;
                                while (b8eVar2 != null) {
                                    if ((b8eVar2.c & 4194304) != 0) {
                                        i3++;
                                        dfeVar2 = dfeVar2;
                                        if (i3 == 1) {
                                            i17VarU = b8eVar2;
                                        } else {
                                            if (dfeVar2 == 0) {
                                                dfeVar2 = new dfe(new b8e[16]);
                                            }
                                            if (i17VarU != 0) {
                                                dfeVar2.c(i17VarU);
                                                i17VarU = 0;
                                            }
                                            dfeVar2.c(b8eVar2);
                                        }
                                    }
                                    b8eVar2 = b8eVar2.f;
                                    i17VarU = i17VarU;
                                    dfeVar2 = dfeVar2;
                                }
                                if (i3 != 1) {
                                }
                            }
                            i17VarU = ui6.U(dfeVar2);
                        }
                    }
                    if (b8eVarC1 != b8eVar) {
                    }
                }
            }
        }
        dfeVar.h();
    }

    public final void u() {
        m3c m3cVar = (m3c) this.c;
        d5o d5oVar = (d5o) this.d;
        if (d5oVar.E()) {
            if (!m3cVar.H()) {
                a8b.a("performMeasureAndLayout called with unattached root");
            }
            if (!m3cVar.I()) {
                a8b.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.a) {
                a8b.a("performMeasureAndLayout called during measure layout");
            }
            if (((yo5) this.h) != null) {
                this.a = true;
                this.b = false;
                try {
                    if ((((awj) ((qq6) d5oVar.c).b).isEmpty() || ((awj) ((qq6) d5oVar.a).b).isEmpty()) ? false : true) {
                        if (m3cVar.h != null) {
                            z(m3cVar, true);
                        } else {
                            y(m3cVar);
                        }
                    }
                    z(m3cVar, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.a = false;
                        this.b = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.c
            vo5 r1 = (defpackage.vo5) r1
            java.util.ArrayList r6 = r1.p0
            int r7 = r6.size()
            r8 = 0
            r1 = r8
        Le:
            if (r1 >= r7) goto Lbe
            java.lang.Object r2 = r6.get(r1)
            int r9 = r1 + 1
            r5 = r2
            uo5 r5 = (defpackage.uo5) r5
            boolean r1 = r5.a
            if (r1 == 0) goto L1f
        L1d:
            r1 = r9
            goto Le
        L1f:
            int[] r1 = r5.o0
            r10 = r1[r8]
            r11 = 1
            r12 = r1[r11]
            int r1 = r5.q
            int r2 = r5.r
            r13 = 3
            r3 = 2
            if (r10 == r3) goto L34
            if (r10 != r13) goto L32
            if (r1 == r11) goto L34
        L32:
            r1 = r8
            goto L35
        L34:
            r1 = r11
        L35:
            if (r12 == r3) goto L3d
            if (r12 != r13) goto L3b
            if (r2 == r11) goto L3d
        L3b:
            r2 = r8
            goto L3e
        L3d:
            r2 = r11
        L3e:
            tga r4 = r5.d
            h97 r4 = r4.e
            boolean r14 = r4.j
            k2n r15 = r5.e
            h97 r15 = r15.e
            boolean r3 = r15.j
            r17 = r1
            r1 = 1
            if (r14 == 0) goto L81
            if (r3 == 0) goto L5c
            int r2 = r4.g
            int r4 = r15.g
            r3 = r1
            r0.r(r1, r2, r3, r4, r5)
            r5.a = r11
            goto Lab
        L5c:
            if (r2 == 0) goto L81
            int r2 = r4.g
            int r4 = r15.g
            r3 = 2
            r0 = r18
            r0.r(r1, r2, r3, r4, r5)
            k2n r0 = r5.e
            if (r12 != r13) goto L75
            h97 r0 = r0.e
            int r1 = r5.k()
            r0.m = r1
            goto Lab
        L75:
            h97 r0 = r0.e
            int r1 = r5.k()
            r0.d(r1)
            r5.a = r11
            goto Lab
        L81:
            r16 = 2
            if (r3 == 0) goto Lab
            if (r17 == 0) goto Lab
            int r2 = r4.g
            int r4 = r15.g
            r0 = r18
            r3 = r1
            r1 = r16
            r0.r(r1, r2, r3, r4, r5)
            tga r0 = r5.d
            if (r10 != r13) goto La0
            h97 r0 = r0.e
            int r1 = r5.n()
            r0.m = r1
            goto Lab
        La0:
            h97 r0 = r0.e
            int r1 = r5.n()
            r0.d(r1)
            r5.a = r11
        Lab:
            boolean r0 = r5.a
            if (r0 == 0) goto Lba
            k2n r0 = r5.e
            ta3 r0 = r0.l
            if (r0 == 0) goto Lba
            int r1 = r5.Z
            r0.d(r1)
        Lba:
            r0 = r18
            goto L1d
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d37.v():void");
    }

    public final boolean w(m3c m3cVar, boolean z) {
        p1d p1dVar;
        m3c m3cVar2 = (m3c) this.c;
        boolean z2 = m3cVar.Q;
        q3c q3cVar = m3cVar.G;
        if (!z2 && q(m3cVar)) {
            yo5 yo5Var = m3cVar == m3cVar2 ? (yo5) this.h : null;
            if (z) {
                zF = q3cVar.e ? f(m3cVar, yo5Var) : false;
                if ((zF || q3cVar.f) && Intrinsics.a(m3cVar.J(), Boolean.TRUE)) {
                    m3cVar.K();
                }
            } else {
                boolean zG = m3cVar.q() ? g(m3cVar, yo5Var) : false;
                if (m3cVar.p()) {
                    if (m3cVar != m3cVar2) {
                        m3c m3cVarU = m3cVar.u();
                        if (m3cVarU != null && m3cVarU.I() && q3cVar.p.t) {
                            m3cVar.R();
                        }
                    } else {
                        if (m3cVar.C == k3c.c) {
                            m3cVar.f();
                        }
                        m3c m3cVarU2 = m3cVar.u();
                        if (m3cVarU2 != null) {
                            p1dVar = ((j8b) m3cVarU2.F.b).p;
                        } else {
                            v31 v31VarA = p3c.a(m3cVar);
                            m3g m3gVar = jfg.a;
                            p1dVar = new p1d(v31VarA, (byte) 1);
                        }
                        p1d.h(p1dVar, q3cVar.p, 0, 0);
                    }
                    s6h s6hVar = (s6h) this.e;
                    if (m3cVar.P > 0) {
                        ((dfe) s6hVar.a).c(m3cVar);
                        m3cVar.O = true;
                    }
                }
                zF = zG;
            }
            h();
        }
        return zF;
    }

    public final boolean x(m3c m3cVar, boolean z) throws Throwable {
        boolean zG = false;
        if (!m3cVar.Q && q(m3cVar)) {
            yo5 yo5Var = m3cVar == ((m3c) this.c) ? (yo5) this.h : null;
            if (z) {
                if (m3cVar.G.e) {
                    zG = f(m3cVar, yo5Var);
                }
            } else if (m3cVar.q()) {
                zG = g(m3cVar, yo5Var);
            }
            h();
        }
        return zG;
    }

    public final void y(m3c m3cVar) throws Throwable {
        dfe dfeVarZ = m3cVar.z();
        Object[] objArr = dfeVarZ.a;
        int i = dfeVarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar2 = (m3c) objArr[i2];
            if (m3cVar2.r() == k3c.a || m3cVar2.G.p.x.e()) {
                if (ui6.M(m3cVar2)) {
                    z(m3cVar2, true);
                } else {
                    y(m3cVar2);
                }
            }
        }
    }

    public final void z(m3c m3cVar, boolean z) throws Throwable {
        if (m3cVar.Q) {
            return;
        }
        yo5 yo5Var = m3cVar == ((m3c) this.c) ? (yo5) this.h : null;
        if (z) {
            f(m3cVar, yo5Var);
        } else {
            g(m3cVar, yo5Var);
        }
    }
}
