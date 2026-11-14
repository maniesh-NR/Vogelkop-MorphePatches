package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class qrm {
    public qsm e;
    public qsm f;
    public HashSet g;
    public qsm h;
    public to2 i;
    public qsm j;
    public Rect k;
    public zd4 m;
    public zd4 n;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public final Object c = new Object();
    public int d = 2;
    public Matrix l = new Matrix();
    public f8i o = null;
    public final crk p = new crk(this, (byte) 28);
    public u3j q = u3j.a();
    public u3j r = u3j.a();

    public qrm(qsm qsmVar) {
        this.f = qsmVar;
        this.h = qsmVar;
    }

    public abstract to2 A(to2 to2Var, to2 to2Var2);

    public void B() {
    }

    public void C(Matrix matrix) {
        this.l = new Matrix(matrix);
    }

    public final boolean D(int i) {
        Size size;
        int iU = ((hya) this.h).u(-1);
        if (iU != -1 && iU == i) {
            return false;
        }
        psm psmVarN = n(this.f);
        hya hyaVar = (hya) psmVarN.v();
        int iU2 = hyaVar.u(-1);
        if (iU2 == -1 || iU2 != i) {
            nva nvaVar = (nva) psmVarN;
            switch (nvaVar.a) {
                case 0:
                    nvaVar.b.s(hya.lp, Integer.valueOf(i));
                    break;
                case 1:
                    nvaVar.b.s(hya.lp, Integer.valueOf(i));
                    break;
                case 2:
                    fee feeVar = nvaVar.b;
                    feeVar.s(hya.lp, Integer.valueOf(i));
                    feeVar.s(hya.np, Integer.valueOf(i));
                    break;
                default:
                    nvaVar.b.s(hya.lp, Integer.valueOf(i));
                    break;
            }
        }
        if (iU2 != -1 && i != -1 && iU2 != i) {
            if (Math.abs(kfo.f0(i) - kfo.f0(iU2)) % 180 == 90 && (size = (Size) hyaVar.b(hya.pp, null)) != null) {
                nva nvaVar2 = (nva) psmVarN;
                Size size2 = new Size(size.getHeight(), size.getWidth());
                switch (nvaVar2.a) {
                    case 0:
                        nvaVar2.b.s(hya.pp, size2);
                        break;
                    case 1:
                        nvaVar2.b.s(hya.pp, size2);
                        break;
                    case 2:
                        nvaVar2.b.s(hya.pp, size2);
                        break;
                    default:
                        throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
            }
        }
        this.f = psmVarN.v();
        zd4 zd4VarE = e();
        if (zd4VarE == null) {
            this.h = this.f;
            return true;
        }
        this.h = q(zd4VarE.g(), this.e, this.j);
        return true;
    }

    public void E(Rect rect) {
        this.k = rect;
    }

    public final void F(zd4 zd4Var) {
        B();
        synchronized (this.b) {
            zd4 zd4Var2 = this.m;
            if (zd4Var == zd4Var2) {
                this.a.remove(zd4Var2);
                this.m = null;
            }
            zd4 zd4Var3 = this.n;
            if (zd4Var == zd4Var3) {
                this.a.remove(zd4Var3);
                this.n = null;
            }
        }
        synchronized (this.c) {
            f8i f8iVar = this.o;
            if (f8iVar != null) {
                f8iVar.b(this.p);
            }
        }
        this.i = null;
        this.k = null;
        this.h = this.f;
        this.e = null;
        this.j = null;
    }

    public final void G(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.q = (u3j) list.get(0);
        if (list.size() > 1) {
            this.r = (u3j) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (g07 g07Var : ((u3j) it.next()).b()) {
                if (g07Var.j == null) {
                    g07Var.j = getClass();
                }
            }
        }
    }

    public final void H(to2 to2Var, to2 to2Var2) {
        this.i = A(to2Var, to2Var2);
    }

    public final void a(q3j q3jVar, to2 to2Var) {
        Range range = to2.h;
        if (!range.equals(to2Var.e)) {
            ((fee) q3jVar.b.d).s(ai4.h, to2Var.e);
            return;
        }
        synchronized (this.b) {
            zd4 zd4Var = this.m;
            zd4Var.getClass();
            ArrayList arrayListC = zd4Var.g().s().c(AeFpsRangeQuirk.class);
            jpo.i("There should not have more than one AeFpsRangeQuirk.", arrayListC.size() <= 1);
            if (!arrayListC.isEmpty()) {
                Range range2 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListC.get(0))).a.getValue();
                if (range2 != null) {
                    range = range2;
                }
                ((fee) q3jVar.b.d).s(ai4.h, range);
            }
        }
    }

    public final void b(zd4 zd4Var, zd4 zd4Var2, qsm qsmVar, qsm qsmVar2) {
        synchronized (this.b) {
            this.m = zd4Var;
            this.n = zd4Var2;
            this.a.add(zd4Var);
            if (zd4Var2 != null) {
                this.a.add(zd4Var2);
            }
        }
        this.e = qsmVar;
        this.j = qsmVar2;
        this.h = q(zd4Var.g(), this.e, this.j);
        synchronized (this.c) {
            f8i f8iVar = this.o;
            if (f8iVar != null) {
                f8iVar.a(this.p, x7d.l());
            }
        }
        t();
    }

    public final int c() {
        return ((Integer) ((hya) this.h).b(hya.np, -1)).intValue();
    }

    public final Size d() {
        to2 to2Var = this.i;
        if (to2Var != null) {
            return to2Var.a;
        }
        return null;
    }

    public final zd4 e() {
        zd4 zd4Var;
        synchronized (this.b) {
            zd4Var = this.m;
        }
        return zd4Var;
    }

    public final mc4 f() {
        synchronized (this.b) {
            zd4 zd4Var = this.m;
            if (zd4Var == null) {
                return mc4.a;
            }
            return zd4Var.d();
        }
    }

    public final String g() {
        zd4 zd4VarE = e();
        jpo.m(zd4VarE, "No camera attached to use case: " + this);
        return zd4VarE.g().e();
    }

    public qsm h(boolean z, tsm tsmVar) {
        return new iyd();
    }

    public final String i() {
        String str = (String) this.h.b(fcl.Cp, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int j(zd4 zd4Var, boolean z) {
        int iC = zd4Var.g().C(((hya) this.h).u(0));
        return (zd4Var.p() || !z) ? iC : d2m.j(-iC);
    }

    public final zd4 k() {
        zd4 zd4Var;
        synchronized (this.b) {
            zd4Var = this.n;
        }
        return zd4Var;
    }

    public Set l(xd4 xd4Var) {
        return null;
    }

    public Set m() {
        return Collections.EMPTY_SET;
    }

    public psm n(tj5 tj5Var) {
        return new nva(fee.l(tj5Var), (byte) 0);
    }

    public boolean o() {
        return this instanceof qva;
    }

    public final boolean p(zd4 zd4Var) {
        int iIntValue = ((Integer) ((hya) this.h).b(hya.op, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return zd4Var.h();
        }
        qp2.g(sko.i(iIntValue, "Unknown mirrorMode: "));
        return false;
    }

    public final qsm q(xd4 xd4Var, qsm qsmVar, qsm qsmVar2) {
        fee feeVarK;
        if (qsmVar2 != null) {
            feeVarK = fee.l(qsmVar2);
            feeVarK.w(fcl.Cp);
        } else {
            feeVarK = fee.k();
        }
        TreeMap treeMap = feeVarK.a;
        if (this.f.g(hya.kp) || this.f.g(hya.pp)) {
            an2 an2Var = hya.up;
            if (treeMap.containsKey(an2Var)) {
                feeVarK.w(an2Var);
            }
        }
        qsm qsmVar3 = this.f;
        an2 an2Var2 = hya.up;
        if (qsmVar3.g(an2Var2)) {
            an2 an2Var3 = hya.rp;
            if (treeMap.containsKey(an2Var3) && ((zxh) this.f.i(an2Var2)).b != null) {
                feeVarK.w(an2Var3);
            }
        }
        Iterator it = this.f.d().iterator();
        while (it.hasNext()) {
            tj5.n(feeVarK, feeVarK, this.f, (an2) it.next());
        }
        if (qsmVar != null) {
            for (an2 an2Var4 : qsmVar.d()) {
                if (!an2Var4.a.equals(fcl.Cp.a)) {
                    tj5.n(feeVarK, feeVarK, qsmVar, an2Var4);
                }
            }
        }
        if (treeMap.containsKey(hya.pp)) {
            an2 an2Var5 = hya.kp;
            if (treeMap.containsKey(an2Var5)) {
                feeVarK.w(an2Var5);
            }
        }
        an2 an2Var6 = hya.up;
        if (treeMap.containsKey(an2Var6)) {
            ((zxh) feeVarK.i(an2Var6)).getClass();
        }
        Objects.toString(this.g);
        toString();
        HashSet hashSet = this.g;
        if (hashSet != null) {
            int i = kp7.c;
            Range range = to2.h;
            t4n t4nVar = u4n.c;
            Iterator it2 = hashSet.iterator();
            ip7 ip7Var = ip7.d;
            while (it2.hasNext()) {
                h5a h5aVar = (h5a) it2.next();
                if (h5aVar instanceof kp7) {
                    ip7Var = ((kp7) h5aVar).a;
                } else if (h5aVar instanceof mk9) {
                    mk9 mk9Var = (mk9) h5aVar;
                    range = new Range(Integer.valueOf(mk9Var.a), Integer.valueOf(mk9Var.b));
                } else if (h5aVar instanceof u4n) {
                    t4nVar = ((u4n) h5aVar).a;
                }
            }
            if ((this instanceof swg) || z7h.t(this)) {
                feeVarK.s(txa.ip, ip7Var);
            }
            feeVarK.s(qsm.Np, range);
            int iOrdinal = t4nVar.ordinal();
            if (iOrdinal == 0) {
                feeVarK.s(qsm.Tp, 0);
                feeVarK.s(qsm.Up, 0);
            } else if (iOrdinal == 1) {
                feeVarK.s(qsm.Tp, 1);
                feeVarK.s(qsm.Up, 1);
            } else if (iOrdinal == 2) {
                feeVarK.s(qsm.Tp, 0);
                feeVarK.s(qsm.Up, 2);
            } else if (iOrdinal == 3) {
                feeVarK.s(qsm.Tp, 2);
                feeVarK.s(qsm.Up, 0);
            }
        }
        return v(xd4Var, n(feeVarK));
    }

    public final void r() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((prm) it.next()).c(this);
        }
    }

    public final void s() {
        int iA = vep.A(this.d);
        HashSet hashSet = this.a;
        if (iA == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((prm) it.next()).j(this);
            }
        } else if (iA == 1) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((prm) it2.next()).r(this);
            }
        }
    }

    public void t() {
    }

    public void u() {
    }

    public qsm v(xd4 xd4Var, psm psmVar) {
        return psmVar.v();
    }

    public void w(int i) {
        D(i);
    }

    public void x() {
    }

    public void y() {
    }

    public to2 z(eb4 eb4Var) {
        to2 to2Var = this.i;
        if (to2Var == null) {
            yt7.k("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        ne5 ne5VarB = to2Var.b();
        ne5VarB.f = eb4Var;
        return ne5VarB.p();
    }
}
