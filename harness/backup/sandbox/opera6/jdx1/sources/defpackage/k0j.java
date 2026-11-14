package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class k0j {
    public final b8e a;
    public final boolean b;
    public final m3c c;
    public final f0j d;
    public k0j e;
    public final int f;

    public k0j(b8e b8eVar, boolean z, m3c m3cVar, f0j f0jVar) {
        this.a = b8eVar;
        this.b = z;
        this.c = m3cVar;
        this.d = f0jVar;
        this.f = m3cVar.b;
    }

    public static /* synthetic */ List j(int i, k0j k0jVar) {
        return k0jVar.i((i & 1) != 0 ? !k0jVar.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [b8e] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [b8e] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [dfe] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final voh a(wye wyeVar) {
        i17 i17VarU;
        k0j k0jVarL = l();
        if (k0jVarL == null) {
            return voh.e;
        }
        b8e b8eVar = (b8e) k0jVarL.c.F.g;
        if ((b8eVar.d & 8) != 0) {
            loop0: while (b8eVar != null) {
                if ((b8eVar.c & 8) != 0) {
                    i17VarU = b8eVar;
                    ?? dfeVar = 0;
                    while (i17VarU != 0) {
                        if (i17VarU instanceof i0j) {
                            if (i17VarU.g()) {
                                break loop0;
                            }
                        } else if ((i17VarU.c & 8) != 0 && (i17VarU instanceof i17)) {
                            b8e b8eVar2 = i17VarU.p;
                            int i = 0;
                            i17VarU = i17VarU;
                            dfeVar = dfeVar;
                            while (b8eVar2 != null) {
                                if ((b8eVar2.c & 8) != 0) {
                                    i++;
                                    dfeVar = dfeVar;
                                    if (i == 1) {
                                        i17VarU = b8eVar2;
                                    } else {
                                        if (dfeVar == 0) {
                                            dfeVar = new dfe(new b8e[16]);
                                        }
                                        if (i17VarU != 0) {
                                            dfeVar.c(i17VarU);
                                            i17VarU = 0;
                                        }
                                        dfeVar.c(b8eVar2);
                                    }
                                }
                                b8eVar2 = b8eVar2.f;
                                i17VarU = i17VarU;
                                dfeVar = dfeVar;
                            }
                            if (i != 1) {
                            }
                        }
                        i17VarU = ui6.U(dfeVar);
                    }
                }
                if ((b8eVar.d & 8) == 0) {
                    break;
                }
                b8eVar = b8eVar.f;
            }
            i17VarU = 0;
        } else {
            i17VarU = 0;
        }
        i0j i0jVar = (i0j) i17VarU;
        wye wyeVarC0 = i0jVar != null ? ui6.c0(i0jVar, 8) : null;
        return wyeVarC0 == null ? k0jVarL.a(wyeVar) : wyeVarC0.y(wyeVar, true);
    }

    public final k0j b(q5i q5iVar, Function1 function1) {
        f0j f0jVar = new f0j();
        f0jVar.c = false;
        f0jVar.d = false;
        function1.invoke(f0jVar);
        k0j k0jVar = new k0j(new j0j(function1), false, new m3c(true, this.f + (q5iVar != null ? 1000000000 : 2000000000)), f0jVar);
        k0jVar.e = this;
        return k0jVar;
    }

    public final void c(m3c m3cVar, ArrayList arrayList) {
        dfe dfeVarY = m3cVar.y();
        Object[] objArr = dfeVarY.a;
        int i = dfeVarY.c;
        for (int i2 = 0; i2 < i; i2++) {
            m3c m3cVar2 = (m3c) objArr[i2];
            if (m3cVar2.H() && !m3cVar2.Q) {
                if (m3cVar2.F.w(8)) {
                    arrayList.add(coh.b(m3cVar2, this.b));
                } else {
                    c(m3cVar2, arrayList);
                }
            }
        }
    }

    public final wye d() {
        wye wyeVarC0;
        if (!o()) {
            i0j i0jVarF = f();
            return (i0jVarF == null || (wyeVarC0 = ui6.c0(i0jVarF, 8)) == null) ? (j8b) this.c.F.b : wyeVarC0;
        }
        k0j k0jVarL = l();
        if (k0jVarL != null) {
            return k0jVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            k0j k0jVar = (k0j) arrayList.get(size2);
            if (k0jVar.p()) {
                arrayList2.add(k0jVar);
            } else if (!k0jVar.d.d) {
                k0jVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i0j f() {
        b8e b8eVarU;
        boolean z;
        boolean z2 = this.d.c;
        Object obj = null;
        m3c m3cVar = this.c;
        if (z2) {
            b8e b8eVar = (b8e) m3cVar.F.g;
            if ((b8eVar.d & 8) != 0) {
                b8eVarU = null;
                while (b8eVar != null) {
                    if ((b8eVar.c & 8) != 0) {
                        b8e b8eVarU2 = b8eVar;
                        dfe dfeVar = null;
                        while (b8eVarU2 != null) {
                            if (b8eVarU2 instanceof i0j) {
                                i0j i0jVar = (i0j) b8eVarU2;
                                if (i0jVar.g()) {
                                    if (i0jVar.D0()) {
                                        return i0jVar;
                                    }
                                    if (b8eVarU == null) {
                                        b8eVarU = i0jVar;
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z && (b8eVarU2.c & 8) != 0 && (b8eVarU2 instanceof i17)) {
                                int i = 0;
                                for (b8e b8eVar2 = ((i17) b8eVarU2).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                    if ((b8eVar2.c & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            b8eVarU2 = b8eVar2;
                                        } else {
                                            if (dfeVar == null) {
                                                dfeVar = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU2 != null) {
                                                dfeVar.c(b8eVarU2);
                                                b8eVarU2 = null;
                                            }
                                            dfeVar.c(b8eVar2);
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            b8eVarU2 = ui6.U(dfeVar);
                        }
                    }
                    if ((b8eVar.d & 8) == 0) {
                        break;
                    }
                    b8eVar = b8eVar.f;
                }
                obj = b8eVarU;
            }
        } else {
            b8e b8eVar3 = (b8e) m3cVar.F.g;
            if ((b8eVar3.d & 8) != 0) {
                loop3: while (b8eVar3 != null) {
                    if ((b8eVar3.c & 8) != 0) {
                        b8eVarU = b8eVar3;
                        dfe dfeVar2 = null;
                        while (b8eVarU != null) {
                            if (b8eVarU instanceof i0j) {
                                if (((i0j) b8eVarU).g()) {
                                    obj = b8eVarU;
                                }
                            } else if ((b8eVarU.c & 8) != 0 && (b8eVarU instanceof i17)) {
                                int i2 = 0;
                                for (b8e b8eVar4 = ((i17) b8eVarU).p; b8eVar4 != null; b8eVar4 = b8eVar4.f) {
                                    if ((b8eVar4.c & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            b8eVarU = b8eVar4;
                                        } else {
                                            if (dfeVar2 == null) {
                                                dfeVar2 = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar2.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar2.c(b8eVar4);
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar2);
                        }
                    }
                    if ((b8eVar3.d & 8) == 0) {
                        break;
                    }
                    b8eVar3 = b8eVar3.f;
                }
            }
        }
        return (i0j) obj;
    }

    public final voh g() {
        wye wyeVarD = d();
        if (wyeVarD != null) {
            if (!wyeVarD.Z0().n) {
                wyeVarD = null;
            }
            if (wyeVarD != null) {
                return rm5.v(wyeVarD).y(wyeVarD, true);
            }
        }
        return voh.e;
    }

    public final voh h() {
        wye wyeVarD = d();
        if (wyeVarD != null) {
            if (!wyeVarD.Z0().n) {
                wyeVarD = null;
            }
            if (wyeVarD != null) {
                return rm5.j(wyeVarD, true);
            }
        }
        return voh.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return r(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final f0j k() {
        boolean zP = p();
        f0j f0jVar = this.d;
        if (!zP) {
            return f0jVar;
        }
        f0j f0jVarC = f0jVar.c();
        q(new ArrayList(), f0jVarC);
        return f0jVarC;
    }

    public final k0j l() {
        m3c m3cVarU;
        k0j k0jVar = this.e;
        if (k0jVar != null) {
            return k0jVar;
        }
        m3c m3cVar = this.c;
        boolean z = this.b;
        if (z) {
            m3cVarU = m3cVar.u();
            while (m3cVarU != null) {
                f0j f0jVarW = m3cVarU.w();
                if (f0jVarW != null && f0jVarW.c) {
                    break;
                }
                m3cVarU = m3cVarU.u();
            }
            m3cVarU = null;
        } else {
            m3cVarU = null;
        }
        if (m3cVarU == null) {
            m3c m3cVarU2 = m3cVar.u();
            while (true) {
                if (m3cVarU2 == null) {
                    m3cVarU = null;
                    break;
                }
                if (m3cVarU2.F.w(8)) {
                    m3cVarU = m3cVarU2;
                    break;
                }
                m3cVarU2 = m3cVarU2.u();
            }
        }
        if (m3cVarU == null) {
            return null;
        }
        return coh.b(m3cVarU, z);
    }

    public final List m() {
        return j(4, this);
    }

    public final voh n() {
        Object objF = f();
        if (objF == null) {
            return ((j8b) this.c.F.b).w1();
        }
        b8e b8eVar = ((b8e) objF).a;
        Object objG = this.d.a.g(e0j.b);
        if (objG == null) {
            objG = null;
        }
        boolean z = objG != null;
        if (!b8eVar.a.n) {
            return voh.e;
        }
        if (z) {
            return ui6.c0(b8eVar, 8).w1();
        }
        wye wyeVarC0 = ui6.c0(b8eVar, 8);
        return rm5.v(wyeVarC0).y(wyeVarC0, true);
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.c;
    }

    public final void q(ArrayList arrayList, f0j f0jVar) {
        if (this.d.d) {
            return;
        }
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            k0j k0jVar = (k0j) arrayList.get(size2);
            if (!k0jVar.p()) {
                f0jVar.e(k0jVar.d);
                k0jVar.q(arrayList, f0jVar);
            }
        }
    }

    public final List r(ArrayList arrayList, boolean z) {
        if (o()) {
            return l08.a;
        }
        c(this.c, arrayList);
        if (z) {
            f0j f0jVar = this.d;
            see seeVar = f0jVar.a;
            Object objG = seeVar.g(n0j.z);
            if (objG == null) {
                objG = null;
            }
            q5i q5iVar = (q5i) objG;
            if (q5iVar != null && f0jVar.c && !arrayList.isEmpty()) {
                arrayList.add(b(q5iVar, new tji(q5iVar, (byte) 10)));
            }
            p0j p0jVar = n0j.a;
            if (seeVar.c(p0jVar) && !arrayList.isEmpty() && f0jVar.c) {
                Object objG2 = seeVar.g(p0jVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new u5f(str, (byte) 10)));
                }
            }
        }
        return arrayList;
    }
}
