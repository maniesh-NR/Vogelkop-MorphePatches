package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class fgk extends qrm {
    public ntk A;
    public ntk B;
    public q3j C;
    public q3j D;
    public r3j E;
    public final ggk s;
    public final jan t;
    public final pad u;
    public final pad v;
    public ghf w;
    public wjh x;
    public ntk y;
    public ntk z;

    public fgk(zd4 zd4Var, zd4 zd4Var2, HashSet hashSet, rg4 rg4Var) {
        super(M(hashSet));
        this.s = M(hashSet);
        pad padVar = pad.d;
        this.u = padVar;
        this.v = padVar;
        this.t = new jan(zd4Var, zd4Var2, hashSet, rg4Var, new txi(this, (byte) 18));
        HashSet hashSet2 = ((qrm) hashSet.iterator().next()).g;
        this.g = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static ggk M(HashSet hashSet) {
        fee feeVarK = fee.k();
        new u7k(feeVarK);
        feeVarK.s(txa.gp, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            qrm qrmVar = (qrm) it.next();
            if (qrmVar.h.g(qsm.Sp)) {
                arrayList.add(qrmVar.h.C());
            }
        }
        feeVarK.s(ggk.b, arrayList);
        feeVarK.s(hya.op, 2);
        feeVarK.s(qsm.Xp, igk.PREVIEW_VIDEO_STILL);
        return new ggk(wrf.f(feeVarK));
    }

    @Override // defpackage.qrm
    public final to2 A(to2 to2Var, to2 to2Var2) {
        Objects.toString(to2Var);
        Objects.toString(to2Var2);
        G(J(g(), k() == null ? null : k().g().e(), this.h, to2Var, to2Var2));
        this.d = 1;
        s();
        return to2Var;
    }

    @Override // defpackage.qrm
    public final void B() {
        I();
        jan janVar = this.t;
        Iterator it = janVar.a.iterator();
        while (it.hasNext()) {
            qrm qrmVar = (qrm) it.next();
            ian ianVar = (ian) janVar.c.get(qrmVar);
            Objects.requireNonNull(ianVar);
            qrmVar.F(ianVar);
        }
    }

    public final void I() {
        r3j r3jVar = this.E;
        if (r3jVar != null) {
            r3jVar.b();
            this.E = null;
        }
        ntk ntkVar = this.y;
        if (ntkVar != null) {
            ntkVar.c();
            this.y = null;
        }
        ntk ntkVar2 = this.z;
        if (ntkVar2 != null) {
            ntkVar2.c();
            this.z = null;
        }
        ntk ntkVar3 = this.A;
        if (ntkVar3 != null) {
            ntkVar3.c();
            this.A = null;
        }
        ntk ntkVar4 = this.B;
        if (ntkVar4 != null) {
            ntkVar4.c();
            this.B = null;
        }
        ghf ghfVar = this.w;
        if (ghfVar != null) {
            ghfVar.K();
            this.w = null;
        }
        wjh wjhVar = this.x;
        if (wjhVar != null) {
            ((wtk) wjhVar.b).release();
            xug.q(new bn7(wjhVar, (byte) 1));
            this.x = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List J(String str, String str2, qsm qsmVar, to2 to2Var, to2 to2Var2) {
        ip7 ip7Var = to2Var.c;
        xug.i();
        jan janVar = this.t;
        if (to2Var2 == null) {
            ntk ntkVarK = K(str, str2, qsmVar, to2Var, null);
            zd4 zd4VarE = e();
            Objects.requireNonNull(zd4VarE);
            ghf ghfVar = new ghf(zd4VarE, new ow6(ip7Var), "StreamSharing");
            this.w = ghfVar;
            boolean z = this.k != null;
            int iU = ((hya) this.h).u(0);
            janVar.getClass();
            HashMap map = new HashMap();
            Iterator it = janVar.a.iterator();
            while (it.hasNext()) {
                qrm qrmVar = (qrm) it.next();
                ne5 ne5Var = janVar.k;
                zd4 zd4Var = janVar.f;
                jan janVar2 = janVar;
                boolean z2 = z;
                co2 co2VarS = janVar2.s(qrmVar, ne5Var, zd4Var, ntkVarK, iU, z2);
                int iC = janVar2.f.a().C(((hya) qrmVar.h).u(0));
                ian ianVar = (ian) janVar2.c.get(qrmVar);
                Objects.requireNonNull(ianVar);
                ianVar.c.c = iC;
                map.put(qrmVar, co2VarS);
                z = z2;
                janVar = janVar2;
            }
            jan janVar3 = janVar;
            boolean z3 = z;
            fn7 fn7VarM = ghfVar.M(new wo2(ntkVarK, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((qrm) entry.getKey(), (ntk) fn7VarM.get(entry.getValue()));
            }
            janVar3.y(map2, janVar3.v(ntkVarK, z3));
            Object[] objArr = {this.C.b()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        jan janVar4 = janVar;
        ntk ntkVarK2 = K(str, str2, qsmVar, to2Var, to2Var2);
        Matrix matrix = this.l;
        zd4 zd4VarK = k();
        Objects.requireNonNull(zd4VarK);
        boolean zP = zd4VarK.p();
        Size size = to2Var2.a;
        Rect rect = this.k;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        zd4 zd4VarK2 = k();
        Objects.requireNonNull(zd4VarK2);
        int iJ = j(zd4VarK2, false);
        zd4 zd4VarK3 = k();
        Objects.requireNonNull(zd4VarK3);
        ntk ntkVar = new ntk(3, 34, to2Var2, matrix, zP, rect2, iJ, -1, p(zd4VarK3));
        this.z = ntkVar;
        Objects.requireNonNull(k());
        this.B = ntkVar;
        q3j q3jVarL = L(this.z, qsmVar, to2Var2);
        this.D = q3jVarL;
        r3j r3jVar = this.E;
        if (r3jVar != null) {
            r3jVar.b();
        }
        r3j r3jVar2 = new r3j(new egk(this, str, str2, qsmVar, to2Var, to2Var2));
        this.E = r3jVar2;
        q3jVarL.f = r3jVar2;
        ntk ntkVar2 = this.B;
        this.x = new wjh(e(), k(), new en7(ip7Var, this.u, this.v));
        boolean z4 = this.k != null;
        int iU2 = ((hya) this.h).u(0);
        janVar4.getClass();
        HashMap map3 = new HashMap();
        Iterator it2 = janVar4.a.iterator();
        while (it2.hasNext()) {
            qrm qrmVar2 = (qrm) it2.next();
            jan janVar5 = janVar4;
            ntk ntkVar3 = ntkVarK2;
            co2 co2VarS2 = janVar5.s(qrmVar2, janVar4.k, janVar4.f, ntkVar3, iU2, z4);
            ne5 ne5Var2 = janVar5.l;
            Objects.requireNonNull(ne5Var2);
            zd4 zd4Var2 = janVar5.g;
            Objects.requireNonNull(zd4Var2);
            ntk ntkVar4 = ntkVar2;
            co2 co2VarS3 = janVar5.s(qrmVar2, ne5Var2, zd4Var2, ntkVar4, iU2, z4);
            int iC2 = janVar5.f.a().C(((hya) qrmVar2.h).u(0));
            ian ianVar2 = (ian) janVar5.c.get(qrmVar2);
            Objects.requireNonNull(ianVar2);
            ianVar2.c.c = iC2;
            map3.put(qrmVar2, new dn2(co2VarS2, co2VarS3));
            ntkVar2 = ntkVar4;
            ntkVarK2 = ntkVar3;
            janVar4 = janVar5;
        }
        ntk ntkVar5 = ntkVar2;
        jan janVar6 = janVar4;
        ntk ntkVar6 = ntkVarK2;
        wjh wjhVar = this.x;
        ArrayList arrayList2 = new ArrayList(map3.values());
        en2 en2Var = new en2(ntkVar6, ntkVar5, arrayList2);
        wjhVar.getClass();
        xug.i();
        wtk wtkVar = (wtk) wjhVar.b;
        Objects.toString(wtkVar);
        Objects.toString(ntkVar6);
        Objects.toString(ntkVar5);
        int size2 = arrayList2.size();
        int i = 0;
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            Objects.toString((dn2) obj2);
        }
        wjhVar.f = en2Var;
        wjhVar.e = new fn7();
        en2 en2Var2 = (en2) wjhVar.f;
        ntk ntkVar7 = en2Var2.a;
        ntk ntkVar8 = en2Var2.b;
        ArrayList arrayList3 = en2Var2.c;
        int size3 = arrayList3.size();
        int i2 = 0;
        while (i2 < size3) {
            Object obj3 = arrayList3.get(i2);
            int i3 = i2 + 1;
            dn2 dn2Var = (dn2) obj3;
            fn7 fn7Var = (fn7) wjhVar.e;
            co2 co2Var = dn2Var.a;
            Rect rect3 = co2Var.d;
            ArrayList arrayList4 = arrayList3;
            int i4 = co2Var.f;
            int i5 = size3;
            boolean z5 = co2Var.g;
            HashMap map4 = map3;
            Matrix matrix2 = new Matrix(ntkVar7.b);
            RectF rectF = new RectF(rect3);
            Size size4 = co2Var.e;
            matrix2.postConcat(d2m.a(rectF, d2m.i(size4), i4, z5));
            jpo.j(d2m.d(d2m.h(i4, d2m.f(rect3)), false, size4));
            Rect rect4 = new Rect(0, 0, size4.getWidth(), size4.getHeight());
            ne5 ne5VarB = ntkVar7.g.b();
            ne5VarB.a = size4;
            fn7Var.put(dn2Var, new ntk(co2Var.b, co2Var.c, ne5VarB.p(), matrix2, false, rect4, ntkVar7.i - i4, -1, ntkVar7.e != z5));
            size3 = i5;
            i2 = i3;
            map3 = map4;
            arrayList3 = arrayList4;
        }
        HashMap map5 = map3;
        wtkVar.c(ntkVar7.d((zd4) wjhVar.c, true));
        wtkVar.c(ntkVar8.d((zd4) wjhVar.d, false));
        zd4 zd4Var3 = (zd4) wjhVar.c;
        zd4 zd4Var4 = (zd4) wjhVar.d;
        for (Map.Entry entry2 : ((fn7) wjhVar.e).entrySet()) {
            ntk ntkVar9 = ntkVar7;
            ntk ntkVar10 = ntkVar8;
            wjhVar.g(zd4Var3, zd4Var4, ntkVar9, ntkVar10, entry2);
            ntk ntkVar11 = (ntk) entry2.getValue();
            zd4 zd4Var5 = zd4Var4;
            zd4 zd4Var6 = zd4Var3;
            wjh wjhVar2 = wjhVar;
            fs2 fs2Var = new fs2(wjhVar2, zd4Var6, zd4Var5, ntkVar9, ntkVar10, entry2, (byte) 1);
            wjhVar = wjhVar2;
            zd4Var3 = zd4Var6;
            zd4Var4 = zd4Var5;
            ntkVar11.a(fs2Var);
            ntkVar7 = ntkVar9;
            ntkVar8 = ntkVar10;
        }
        fn7 fn7Var2 = (fn7) wjhVar.e;
        HashMap map6 = new HashMap();
        for (Map.Entry entry3 : map5.entrySet()) {
            map6.put((qrm) entry3.getKey(), (ntk) fn7Var2.get(entry3.getValue()));
        }
        janVar6.y(map6, janVar6.v(ntkVar6, z4));
        Object[] objArr2 = {this.C.b(), this.D.b()};
        ArrayList arrayList5 = new ArrayList(2);
        for (int i6 = 0; i6 < 2; i6++) {
            Object obj4 = objArr2[i6];
            Objects.requireNonNull(obj4);
            arrayList5.add(obj4);
        }
        return Collections.unmodifiableList(arrayList5);
    }

    public final ntk K(String str, String str2, qsm qsmVar, to2 to2Var, to2 to2Var2) {
        Matrix matrix = this.l;
        zd4 zd4VarE = e();
        Objects.requireNonNull(zd4VarE);
        boolean zP = zd4VarE.p();
        Size size = to2Var.a;
        Rect rect = this.k;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        zd4 zd4VarE2 = e();
        Objects.requireNonNull(zd4VarE2);
        int iJ = j(zd4VarE2, false);
        zd4 zd4VarE3 = e();
        Objects.requireNonNull(zd4VarE3);
        ntk ntkVar = new ntk(3, 34, to2Var, matrix, zP, rect, iJ, -1, p(zd4VarE3));
        this.y = ntkVar;
        Objects.requireNonNull(e());
        this.A = ntkVar;
        q3j q3jVarL = L(this.y, qsmVar, to2Var);
        this.C = q3jVarL;
        r3j r3jVar = this.E;
        if (r3jVar != null) {
            r3jVar.b();
        }
        r3j r3jVar2 = new r3j(new egk(this, str, str2, qsmVar, to2Var, to2Var2));
        this.E = r3jVar2;
        q3jVarL.f = r3jVar2;
        return this.A;
    }

    public final q3j L(ntk ntkVar, qsm qsmVar, to2 to2Var) {
        q3j q3jVarC = q3j.c(qsmVar, to2Var.a);
        pyl pylVar = q3jVarC.b;
        jan janVar = this.t;
        Iterator it = janVar.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((u3j) ((qrm) it.next()).h.i(qsm.Hp)).g.c;
            List list = u3j.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            pylVar.b = i;
        }
        Size size = to2Var.a;
        Iterator it2 = janVar.a.iterator();
        while (it2.hasNext()) {
            u3j u3jVarB = q3j.c(((qrm) it2.next()).h, size).b();
            ai4 ai4Var = u3jVarB.g;
            pylVar.c(ai4Var.d);
            List<rb4> list2 = u3jVarB.e;
            ArrayList arrayList = q3jVarC.e;
            for (rb4 rb4Var : list2) {
                pylVar.d(rb4Var);
                if (!arrayList.contains(rb4Var)) {
                    arrayList.add(rb4Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : u3jVarB.d) {
                ArrayList arrayList2 = q3jVarC.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : u3jVarB.c) {
                ArrayList arrayList3 = q3jVarC.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            pylVar.f(ai4Var.b);
        }
        ntkVar.getClass();
        xug.i();
        ntkVar.b();
        jpo.n("Consumer can only be linked once.", !ntkVar.j);
        ntkVar.j = true;
        q3jVarC.a(ntkVar.l, to2Var.c, -1);
        pylVar.d(janVar.h);
        eb4 eb4Var = to2Var.f;
        if (eb4Var != null) {
            pylVar.f(eb4Var);
        }
        q3jVarC.h = to2Var.d;
        a(q3jVarC, to2Var);
        return q3jVarC;
    }

    @Override // defpackage.qrm
    public final qsm h(boolean z, tsm tsmVar) {
        ggk ggkVar = this.s;
        tj5 tj5VarA = tsmVar.a(ggkVar.C(), 1);
        if (z) {
            tj5VarA = tj5.A(tj5VarA, ggkVar.a);
        }
        if (tj5VarA == null) {
            return null;
        }
        return n(tj5VarA).v();
    }

    @Override // defpackage.qrm
    public final Set l(xd4 xd4Var) {
        HashSet hashSet = this.t.a;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set setL = ((qrm) it.next()).l(xd4Var);
            if (setL != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setL);
                } else {
                    hashSet2.retainAll(setL);
                }
            }
        }
        return hashSet2;
    }

    @Override // defpackage.qrm
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.qrm
    public final psm n(tj5 tj5Var) {
        return new u7k(fee.l(tj5Var));
    }

    @Override // defpackage.qrm
    public final void t() {
        jan janVar = this.t;
        Iterator it = janVar.a.iterator();
        while (it.hasNext()) {
            qrm qrmVar = (qrm) it.next();
            ian ianVar = (ian) janVar.c.get(qrmVar);
            Objects.requireNonNull(ianVar);
            qrmVar.b(ianVar, null, null, qrmVar.h(true, janVar.e));
        }
    }

    @Override // defpackage.qrm
    public final void u() {
        Iterator it = this.t.a.iterator();
        while (it.hasNext()) {
            ((qrm) it.next()).u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x011c, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011e, code lost:
    
        if (r14 == false) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ee  */
    @Override // defpackage.qrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qsm v(defpackage.xd4 r18, defpackage.psm r19) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgk.v(xd4, psm):qsm");
    }

    @Override // defpackage.qrm
    public final void x() {
        Iterator it = this.t.a.iterator();
        while (it.hasNext()) {
            ((qrm) it.next()).x();
        }
    }

    @Override // defpackage.qrm
    public final void y() {
        Iterator it = this.t.a.iterator();
        while (it.hasNext()) {
            ((qrm) it.next()).y();
        }
    }

    @Override // defpackage.qrm
    public final to2 z(eb4 eb4Var) {
        this.C.b.f(eb4Var);
        Object[] objArr = {this.C.b()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        ne5 ne5VarB = this.i.b();
        ne5VarB.f = eb4Var;
        return ne5VarB.p();
    }
}
