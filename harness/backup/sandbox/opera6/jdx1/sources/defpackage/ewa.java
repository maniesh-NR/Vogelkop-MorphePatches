package defpackage;

import android.util.Pair;
import android.util.Rational;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ewa extends qrm {
    public static final bwa D = new bwa();
    public nbl A;
    public r3j B;
    public final eq6 C;
    public final int s;
    public final AtomicReference t;
    public final int u;
    public int v;
    public Rational w;
    public pni x;
    public q3j y;
    public r9i z;

    public ewa(fwa fwaVar) {
        super(fwaVar);
        this.t = new AtomicReference(null);
        this.v = -1;
        this.w = null;
        this.C = new eq6(this);
        fwa fwaVar2 = (fwa) this.h;
        an2 an2Var = fwa.b;
        if (fwaVar2.g(an2Var)) {
            this.s = ((Integer) fwaVar2.i(an2Var)).intValue();
        } else {
            this.s = 1;
        }
        this.u = ((Integer) fwaVar2.b(fwa.i, 0)).intValue();
        this.x = new pni((cwa) fwaVar2.b(fwa.j, null));
    }

    public static boolean L(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qrm
    public final to2 A(to2 to2Var, to2 to2Var2) {
        Objects.toString(to2Var);
        Objects.toString(to2Var2);
        q3j q3jVarJ = J(g(), (fwa) this.h, to2Var);
        this.y = q3jVarJ;
        Object[] objArr = {q3jVarJ.b()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        this.d = 1;
        s();
        return to2Var;
    }

    @Override // defpackage.qrm
    public final void B() {
        pni pniVar = this.x;
        pniVar.c();
        pniVar.b();
        nbl nblVar = this.A;
        if (nblVar != null) {
            nblVar.b();
        }
        I(false);
        f().h(null);
    }

    public final void I(boolean z) {
        nbl nblVar;
        xug.i();
        r3j r3jVar = this.B;
        if (r3jVar != null) {
            r3jVar.b();
            this.B = null;
        }
        r9i r9iVar = this.z;
        if (r9iVar != null) {
            r9iVar.E();
            this.z = null;
        }
        if (!z && (nblVar = this.A) != null) {
            nblVar.b();
            this.A = null;
        }
        f().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q3j J(java.lang.String r13, defpackage.fwa r14, defpackage.to2 r15) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewa.J(java.lang.String, fwa, to2):q3j");
    }

    public final int K() {
        int iIntValue;
        synchronized (this.t) {
            iIntValue = this.v;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((fwa) this.h).b(fwa.c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void M(int i) {
        int iU = ((hya) this.h).u(0);
        if (!D(i) || this.w == null) {
            return;
        }
        this.w = sfe.e0(Math.abs(kfo.f0(i) - kfo.f0(iU)), this.w);
    }

    public final void N() {
        synchronized (this.t) {
            if (this.t.get() != null) {
                return;
            }
            f().g(K());
        }
    }

    @Override // defpackage.qrm
    public final qsm h(boolean z, tsm tsmVar) {
        D.getClass();
        fwa fwaVar = bwa.a;
        tj5 tj5VarA = tsmVar.a(fwaVar.C(), this.s);
        if (z) {
            tj5VarA = tj5.A(tj5VarA, fwaVar);
        }
        if (tj5VarA == null) {
            return null;
        }
        return new fwa(wrf.f(((nva) n(tj5VarA)).b));
    }

    @Override // defpackage.qrm
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.qrm
    public final psm n(tj5 tj5Var) {
        return new nva(fee.l(tj5Var), (byte) 1);
    }

    @Override // defpackage.qrm
    public final boolean o() {
        return true;
    }

    @Override // defpackage.qrm
    public final void t() {
        jpo.m(e(), "Attached camera cannot be null");
        if (K() == 3) {
            zd4 zd4VarE = e();
            if ((zd4VarE != null ? zd4VarE.a().j() : -1) != 0) {
                qp2.o("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(i());
    }

    @Override // defpackage.qrm
    public final void u() {
        N();
        f().h(this.x);
    }

    @Override // defpackage.qrm
    public final qsm v(xd4 xd4Var, psm psmVar) {
        Integer numValueOf = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
        HashSet hashSet = this.g;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            boolean z = false;
            while (it.hasNext()) {
                h5a h5aVar = (h5a) it.next();
                if (h5aVar instanceof pxa) {
                    z = ((pxa) h5aVar).a;
                }
            }
            psmVar.i().s(fwa.f, Integer.valueOf(z ? 1 : 0));
        }
        if (xd4Var.s().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            fee feeVarI = psmVar.i();
            an2 an2Var = fwa.h;
            Boolean bool2 = Boolean.TRUE;
            if (!bool.equals(feeVarI.b(an2Var, bool2))) {
                psmVar.i().s(an2Var, bool2);
            }
        }
        fee feeVarI2 = psmVar.i();
        Boolean bool3 = Boolean.TRUE;
        an2 an2Var2 = fwa.h;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(feeVarI2.b(an2Var2, bool4))) {
            if (e() != null) {
                e().e().p();
            }
            Integer num = (Integer) feeVarI2.b(fwa.e, null);
            z = num == null || num.intValue() == 256;
            if (!z) {
                feeVarI2.s(an2Var2, bool4);
            }
        }
        Integer num2 = (Integer) psmVar.i().b(fwa.e, null);
        if (num2 != null) {
            if (e() != null) {
                e().e().p();
            }
            psmVar.i().s(txa.gp, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            fee feeVarI3 = psmVar.i();
            an2 an2Var3 = fwa.f;
            if (Objects.equals(feeVarI3.b(an2Var3, null), 2)) {
                psmVar.i().s(txa.gp, 32);
            } else if (Objects.equals(psmVar.i().b(an2Var3, null), 3)) {
                psmVar.i().s(txa.gp, 32);
                psmVar.i().s(txa.hp, numValueOf);
            } else if (Objects.equals(psmVar.i().b(an2Var3, null), 1)) {
                psmVar.i().s(txa.gp, 4101);
                psmVar.i().s(txa.ip, ip7.c);
            } else if (z) {
                psmVar.i().s(txa.gp, 35);
            } else {
                List list = (List) psmVar.i().b(hya.tp, null);
                if (list == null || L(NotificationCompat.FLAG_LOCAL_ONLY, list)) {
                    psmVar.i().s(txa.gp, numValueOf);
                } else if (L(35, list)) {
                    psmVar.i().s(txa.gp, 35);
                }
            }
        }
        return psmVar.v();
    }

    @Override // defpackage.qrm
    public final void w(int i) {
        M(i);
    }

    @Override // defpackage.qrm
    public final void y() {
        pni pniVar = this.x;
        pniVar.c();
        pniVar.b();
        nbl nblVar = this.A;
        if (nblVar != null) {
            nblVar.b();
        }
    }

    @Override // defpackage.qrm
    public final to2 z(eb4 eb4Var) {
        this.y.b.f(eb4Var);
        Object[] objArr = {this.y.b()};
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
