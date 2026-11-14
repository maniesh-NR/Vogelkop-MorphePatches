package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class swg extends qrm {
    public rwg s;
    public ScheduledExecutorService t;
    public q3j u;
    public s0b v;
    public ntk w;
    public buk x;
    public r3j y;
    public static final qwg z = new qwg();
    public static final ScheduledExecutorService A = x7d.l();

    @Override // defpackage.qrm
    public final to2 A(to2 to2Var, to2 to2Var2) {
        Objects.toString(to2Var);
        Objects.toString(to2Var2);
        J((twg) this.h, to2Var);
        return to2Var;
    }

    @Override // defpackage.qrm
    public final void B() {
        I();
    }

    @Override // defpackage.qrm
    public final void E(Rect rect) {
        this.k = rect;
        zd4 zd4VarE = e();
        ntk ntkVar = this.w;
        if (zd4VarE == null || ntkVar == null) {
            return;
        }
        xug.q(new py4(ntkVar, j(zd4VarE, p(zd4VarE)), c(), (byte) 2));
    }

    public final void I() {
        r3j r3jVar = this.y;
        if (r3jVar != null) {
            r3jVar.b();
            this.y = null;
        }
        s0b s0bVar = this.v;
        if (s0bVar != null) {
            s0bVar.a();
            this.v = null;
        }
        ntk ntkVar = this.w;
        if (ntkVar != null) {
            ntkVar.c();
            this.w = null;
        }
        buk bukVar = this.x;
        if (bukVar != null) {
            synchronized (bukVar.a) {
                bukVar.o = null;
                bukVar.p = null;
            }
        }
        this.x = null;
    }

    public final void J(twg twgVar, to2 to2Var) {
        xug.i();
        zd4 zd4VarE = e();
        Objects.requireNonNull(zd4VarE);
        I();
        byte b = 1;
        jpo.n((String) null, this.w == null);
        Matrix matrix = this.l;
        boolean zP = zd4VarE.p();
        Size size = to2Var.a;
        Rect rect = this.k;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        ntk ntkVar = new ntk(1, 34, to2Var, matrix, zP, rect, j(zd4VarE, p(zd4VarE)), c(), zd4VarE.p() && p(zd4VarE));
        this.w = ntkVar;
        ntkVar.a(new pjg(this, (byte) 8));
        buk bukVarD = this.w.d(zd4VarE, true);
        this.x = bukVarD;
        this.v = bukVarD.m;
        if (this.s != null) {
            zd4 zd4VarE2 = e();
            ntk ntkVar2 = this.w;
            if (zd4VarE2 != null && ntkVar2 != null) {
                xug.q(new py4(ntkVar2, j(zd4VarE2, p(zd4VarE2)), c(), (byte) 2));
            }
            rwg rwgVar = this.s;
            rwgVar.getClass();
            buk bukVar = this.x;
            bukVar.getClass();
            this.t.execute(new q2g(rwgVar, bukVar, (byte) 7));
        }
        q3j q3jVarC = q3j.c(twgVar, to2Var.a);
        pyl pylVar = q3jVarC.b;
        q3jVarC.h = to2Var.d;
        a(q3jVarC, to2Var);
        int iR = twgVar.r();
        if (iR != 0 && iR != 0) {
            ((fee) pylVar.d).s(qsm.Tp, Integer.valueOf(iR));
        }
        eb4 eb4Var = to2Var.f;
        if (eb4Var != null) {
            pylVar.f(eb4Var);
        }
        if (this.s != null) {
            q3jVarC.a(this.v, to2Var.c, ((Integer) ((hya) this.h).b(hya.op, -1)).intValue());
        }
        r3j r3jVar = this.y;
        if (r3jVar != null) {
            r3jVar.b();
        }
        r3j r3jVar2 = new r3j(new awa(this, b));
        this.y = r3jVar2;
        q3jVarC.f = r3jVar2;
        this.u = q3jVarC;
        Object[] objArr = {q3jVarC.b()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.qrm
    public final qsm h(boolean z2, tsm tsmVar) {
        z.getClass();
        twg twgVar = qwg.a;
        tj5 tj5VarA = tsmVar.a(twgVar.C(), 1);
        if (z2) {
            tj5VarA = tj5.A(tj5VarA, twgVar);
        }
        if (tj5VarA == null) {
            return null;
        }
        return new twg(wrf.f(((nva) n(tj5VarA)).b));
    }

    @Override // defpackage.qrm
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.qrm
    public final psm n(tj5 tj5Var) {
        return new nva(fee.l(tj5Var), (byte) 2);
    }

    public final String toString() {
        return "Preview:".concat(i());
    }

    @Override // defpackage.qrm
    public final qsm v(xd4 xd4Var, psm psmVar) {
        psmVar.i().s(txa.gp, 34);
        return psmVar.v();
    }

    @Override // defpackage.qrm
    public final to2 z(eb4 eb4Var) {
        this.u.b.f(eb4Var);
        Object[] objArr = {this.u.b()};
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
