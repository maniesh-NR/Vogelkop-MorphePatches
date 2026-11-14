package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class qg4 implements jb4 {
    public final nr a;
    public final nr b;
    public final rg4 c;
    public final td4 d;
    public final tc4 g;
    public k8n h;
    public final ec4 l;
    public qrm p;
    public fgk q;
    public final ivg s;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public List i = Collections.EMPTY_LIST;
    public int j = 0;
    public Range k = to2.h;
    public final Object m = new Object();
    public boolean n = true;
    public tj5 o = null;
    public final iuh r = new iuh((byte) 5);

    public qg4(zd4 zd4Var, zd4 zd4Var2, mr mrVar, mr mrVar2, tc4 tc4Var, ivg ivgVar, rg4 rg4Var) {
        ec4 ec4Var = mrVar.c;
        this.l = ec4Var;
        this.a = new nr(zd4Var, mrVar);
        if (zd4Var2 == null || mrVar2 == null) {
            this.b = null;
        } else {
            this.b = new nr(zd4Var2, mrVar2);
        }
        this.g = tc4Var;
        this.c = rg4Var;
        this.d = y9m.v(mrVar.a.e(), mrVar2 != null ? mrVar2.a.e() : null, ec4Var.a);
        this.s = ivgVar;
    }

    public static void B(HashMap map) {
        HashSet hashSet;
        for (Map.Entry entry : map.entrySet()) {
            qrm qrmVar = (qrm) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                qrmVar.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            qrmVar.g = hashSet;
        }
    }

    public static ArrayList C(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qrm) obj).getClass();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw p3p.g(it);
            }
        }
        return arrayList2;
    }

    public static HashMap k(LinkedHashSet linkedHashSet, wth wthVar) {
        HashMap map = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            qrm qrmVar = (qrm) it.next();
            map.put(qrmVar, qrmVar.g);
            HashSet hashSet = null;
            LinkedHashSet linkedHashSet2 = wthVar != null ? (LinkedHashSet) wthVar.b : null;
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            qrmVar.g = hashSet;
        }
        return map;
    }

    public static Matrix t(Rect rect, Size size) {
        jpo.i("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static HashMap w(ArrayList arrayList, tsm tsmVar, rg4 rg4Var, int i, Range range) {
        qsm qsmVarH;
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            qrm qrmVar = (qrm) obj;
            if (qrmVar instanceof fgk) {
                fgk fgkVar = (fgk) qrmVar;
                twg twgVar = new twg(wrf.f(new nva((byte) 2).b));
                hya.t(twgVar);
                swg swgVar = new swg(twgVar);
                swgVar.t = swg.A;
                qsm qsmVarH2 = swgVar.h(false, tsmVar);
                if (qsmVarH2 == null) {
                    qsmVarH = null;
                } else {
                    fee feeVarL = fee.l(qsmVarH2);
                    feeVarL.w(fcl.Dp);
                    qsmVarH = ((u7k) fgkVar.n(feeVarL)).v();
                }
            } else {
                qsmVarH = qrmVar.h(false, tsmVar);
            }
            qsm qsmVarH3 = qrmVar.h(true, rg4Var);
            fee feeVarL2 = qsmVarH3 != null ? fee.l(qsmVarH3) : fee.k();
            feeVarL2.s(qsm.Mp, Integer.valueOf(i));
            if (!to2.h.equals(range)) {
                feeVarL2.q(qsm.Np, sj5.b, range);
                feeVarL2.s(qsm.Op, Boolean.TRUE);
            }
            qsm qsmVarV = qrmVar.n(feeVarL2).v();
            mg4 mg4Var = new mg4();
            mg4Var.a = qsmVarH;
            mg4Var.b = qsmVarV;
            map.put(qrmVar, mg4Var);
        }
        return map;
    }

    public final void A(ArrayList arrayList) {
        synchronized (this.m) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((qrm) obj).g = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
            linkedHashSet.removeAll(arrayList);
            j(s(linkedHashSet, this.b != null));
        }
    }

    @Override // defpackage.jb4
    public final ud4 a() {
        return this.a.b;
    }

    public final void c(Collection collection, wth wthVar) {
        Objects.toString(collection);
        Objects.toString(wthVar);
        synchronized (this.m) {
            nr nrVar = this.a;
            ec4 ec4Var = this.l;
            nrVar.i(ec4Var);
            nr nrVar2 = this.b;
            if (nrVar2 != null) {
                nrVar2.i(ec4Var);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.e);
            linkedHashSet.addAll(collection);
            HashMap mapK = k(linkedHashSet, wthVar);
            try {
                j(s(linkedHashSet, this.b != null));
            } catch (IllegalArgumentException e) {
                B(mapK);
                throw new kg4(e);
            }
        }
    }

    public final void j(r84 r84Var) {
        int i;
        Map map = r84Var.i.a;
        ArrayList arrayList = r84Var.b;
        synchronized (this.m) {
            i = 0;
            if (this.h != null && !arrayList.isEmpty()) {
                boolean z = this.a.b.a.j() == 0;
                Rect rectG = this.a.b.a.g();
                k8n k8nVar = this.h;
                Rational rational = (Rational) k8nVar.d;
                int iC = this.a.b.a.C(k8nVar.a);
                k8n k8nVar2 = this.h;
                HashMap mapC = j7h.c(rectG, z, rational, iC, k8nVar2.b, k8nVar2.c, map);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    qrm qrmVar = (qrm) obj;
                    Rect rect = (Rect) mapC.get(qrmVar);
                    rect.getClass();
                    qrmVar.E(rect);
                }
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                qrm qrmVar2 = (qrm) obj2;
                Rect rectG2 = this.a.b.a.g();
                to2 to2Var = (to2) map.get(qrmVar2);
                to2Var.getClass();
                qrmVar2.C(t(rectG2, to2Var.a));
            }
        }
        List list = this.i;
        ArrayList arrayList2 = r84Var.b;
        LinkedHashSet linkedHashSet = r84Var.a;
        ArrayList arrayListC = C(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList arrayListC2 = C(arrayList3, arrayListC);
        if (!arrayListC2.isEmpty()) {
            arrayListC2.toString();
        }
        ArrayList arrayList4 = r84Var.e;
        int size3 = arrayList4.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList4.get(i4);
            i4++;
            ((qrm) obj3).F(this.a);
        }
        this.a.m(r84Var.e);
        if (this.b != null) {
            ArrayList arrayList5 = r84Var.e;
            int size4 = arrayList5.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj4 = arrayList5.get(i5);
                i5++;
                nr nrVar = this.b;
                Objects.requireNonNull(nrVar);
                ((qrm) obj4).F(nrVar);
            }
            nr nrVar2 = this.b;
            Objects.requireNonNull(nrVar2);
            nrVar2.m(r84Var.e);
        }
        if (r84Var.e.isEmpty()) {
            ArrayList arrayList6 = r84Var.d;
            int size5 = arrayList6.size();
            int i6 = 0;
            while (i6 < size5) {
                Object obj5 = arrayList6.get(i6);
                i6++;
                qrm qrmVar3 = (qrm) obj5;
                Map map2 = r84Var.i.a;
                if (map2.containsKey(qrmVar3)) {
                    to2 to2Var2 = (to2) map2.get(qrmVar3);
                    Objects.requireNonNull(to2Var2);
                    eb4 eb4Var = to2Var2.f;
                    if (eb4Var != null) {
                        u3j u3jVar = qrmVar3.q;
                        wrf wrfVar = u3jVar.g.b;
                        Objects.requireNonNull(eb4Var);
                        if (eb4Var.d().size() == u3jVar.g.b.d().size()) {
                            for (an2 an2Var : eb4Var.d()) {
                                if (!wrfVar.a.containsKey(an2Var) || !Objects.equals(wrfVar.i(an2Var), eb4Var.i(an2Var))) {
                                }
                            }
                        }
                        qrmVar3.i = qrmVar3.z(eb4Var);
                        if (this.n) {
                            this.a.k(qrmVar3);
                            nr nrVar3 = this.b;
                            if (nrVar3 != null) {
                                nrVar3.k(qrmVar3);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList7 = r84Var.c;
        int size6 = arrayList7.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj6 = arrayList7.get(i7);
            i7++;
            qrm qrmVar4 = (qrm) obj6;
            mg4 mg4Var = (mg4) r84Var.h.get(qrmVar4);
            Objects.requireNonNull(mg4Var);
            nr nrVar4 = this.b;
            nr nrVar5 = this.a;
            qsm qsmVar = mg4Var.a;
            if (nrVar4 != null) {
                qrmVar4.b(nrVar5, nrVar4, qsmVar, mg4Var.b);
                to2 to2Var3 = (to2) r84Var.i.a.get(qrmVar4);
                to2Var3.getClass();
                hgk hgkVar = r84Var.j;
                hgkVar.getClass();
                qrmVar4.H(to2Var3, (to2) hgkVar.a.get(qrmVar4));
            } else {
                qrmVar4.b(nrVar5, null, qsmVar, mg4Var.b);
                to2 to2Var4 = (to2) r84Var.i.a.get(qrmVar4);
                to2Var4.getClass();
                qrmVar4.H(to2Var4, null);
            }
        }
        if (this.n) {
            this.a.n(r84Var.c);
            nr nrVar6 = this.b;
            if (nrVar6 != null) {
                nrVar6.n(r84Var.c);
            }
        }
        ArrayList arrayList8 = r84Var.c;
        int size7 = arrayList8.size();
        while (i < size7) {
            Object obj7 = arrayList8.get(i);
            i++;
            ((qrm) obj7).s();
        }
        this.e.clear();
        this.e.addAll(r84Var.a);
        this.f.clear();
        this.f.addAll(r84Var.b);
        this.p = r84Var.g;
        this.q = r84Var.f;
    }

    public final void r() {
        synchronized (this.m) {
            if (!this.n) {
                if (!this.f.isEmpty()) {
                    this.a.i(this.l);
                    nr nrVar = this.b;
                    if (nrVar != null) {
                        nrVar.i(this.l);
                    }
                }
                this.a.n(this.f);
                nr nrVar2 = this.b;
                if (nrVar2 != null) {
                    nrVar2.n(this.f);
                }
                synchronized (this.m) {
                    try {
                        tj5 tj5Var = this.o;
                        if (tj5Var != null) {
                            this.a.c.e(tj5Var);
                        }
                    } finally {
                    }
                }
                ArrayList arrayList = this.f;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((qrm) obj).s();
                }
                this.n = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r0 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0152, code lost:
    
        if (r3 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0158, code lost:
    
        return s(r27, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.r84 s(java.util.LinkedHashSet r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg4.s(java.util.LinkedHashSet, boolean):r84");
    }

    public final void u() {
        synchronized (this.m) {
            if (this.n) {
                this.a.m(new ArrayList(this.f));
                nr nrVar = this.b;
                if (nrVar != null) {
                    nrVar.m(new ArrayList(this.f));
                }
                synchronized (this.m) {
                    try {
                        lr lrVar = this.a.c;
                        this.o = lrVar.b.k();
                        lrVar.n();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.n = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int v() {
        boolean z;
        synchronized (this.m) {
            tc4 tc4Var = this.g;
            synchronized (tc4Var.b) {
                z = tc4Var.f;
            }
            return z == 2 ? 1 : 0;
        }
    }

    public final HashSet x(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.m) {
            Iterator it = this.i.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            qrm qrmVar = (qrm) it2.next();
            jpo.i("Only support one level of sharing for now.", !(qrmVar instanceof fgk));
            Iterator it3 = qrmVar.m().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int iIntValue = ((Integer) it3.next()).intValue();
                    if ((i & iIntValue) == iIntValue) {
                        hashSet.add(qrmVar);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List y() {
        ArrayList arrayList;
        synchronized (this.m) {
            arrayList = new ArrayList(this.e);
        }
        return arrayList;
    }

    public final void z() {
        synchronized (this.m) {
            this.l.p();
        }
    }
}
