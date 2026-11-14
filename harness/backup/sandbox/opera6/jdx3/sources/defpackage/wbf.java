package defpackage;

import J.N;
import android.view.ViewGroup;
import com.opera.android.browser.UrlMangler;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wbf {
    public final j7h a;
    public final int b;
    public final lqm c;
    public final lbf d;
    public final String e;
    public final eri f;
    public final boolean g;
    public final boolean h;
    public final /* synthetic */ xbf i;

    public wbf(xbf xbfVar, j7h j7hVar, int i, lqm lqmVar) {
        yl2 yl2Var;
        this.i = xbfVar;
        this.a = j7hVar;
        this.b = i;
        this.c = lqmVar;
        this.f = (eri) ((esk) xbfVar.b).get();
        String strH = (String) ((esk) xbfVar.c).get();
        String strP = wqm.p(strH);
        this.g = strP == null;
        this.h = Intrinsics.a(strP, "http");
        boolean zE = UrlMangler.e(strH);
        if (!zE && (yl2Var = (yl2) ((esk) xbfVar.d).get()) != null) {
            strH = yl2Var.j(strH) ? yl2Var.h() : strH;
            yl2Var.c();
        }
        String strH2 = mdb.h(aik.t(strH).toString());
        this.d = (i != 0 || zE) ? lbf.c : (lbf) ((Function1) xbfVar.f).invoke(strH2);
        this.e = strH2;
    }

    public final String a() {
        lbf lbfVar = this.d;
        lbf lbfVar2 = lbf.d;
        String str = this.e;
        if (lbfVar != lbfVar2) {
            return str;
        }
        String[] strArr = wqm.a;
        return (String) N.MFm_rV1m(str);
    }

    public final void b() {
        cl0 cl0Var;
        dbf dbfVar = (dbf) this.i.g;
        String strA = a();
        ay ayVar = dbfVar.q.s;
        boolean zD = ((zqi) ayVar.get()).b.d();
        lqm lqmVar = this.c;
        if (zD) {
            mrk mrkVar = ((zqi) ayVar.get()).b;
            iv7 iv7Var = mrkVar.h;
            ViewGroup viewGroup = mrkVar.b;
            if ((z5i.a0(strA) || iv7Var.b()) && z5i.r0(viewGroup.getContext())) {
                z5i.v0(viewGroup.getContext());
                return;
            }
            pvb pvbVar = mrkVar.Q;
            if (pvbVar != null && lqmVar == lqm.a && (pvbVar.a() || !((Boolean) iv7Var.k.g()).booleanValue())) {
                mrkVar.U = pvbVar.a();
                pvbVar.f();
                return;
            }
        }
        gbf gbfVar = dbfVar.q;
        yz9 yz9Var = gbfVar.g;
        ay ayVar2 = gbfVar.s;
        boolean zD2 = ((zqi) ayVar2.get()).b.d();
        lbf lbfVar = this.d;
        if (zD2) {
            mrk mrkVar2 = ((zqi) ayVar2.get()).b;
            mrkVar2.U = lbfVar == lbf.c;
            mrkVar2.G.b(lbfVar, mrkVar2.S);
            oqk oqkVar = (oqk) mrkVar2.N.getValue();
            oqkVar.getClass();
            qkk qkkVar = qkk.b;
            j7h j7hVar = this.a;
            if (j7hVar.equals(qkkVar)) {
                int iOrdinal = lbfVar.ordinal();
                if (iOrdinal == 0) {
                    cl0Var = cl0.b;
                } else if (iOrdinal == 1) {
                    cl0Var = cl0.c;
                } else if (iOrdinal == 2) {
                    cl0Var = cl0.d;
                } else {
                    if (iOrdinal != 3) {
                        h9o.p();
                        return;
                    }
                    cl0Var = cl0.g;
                }
                oqkVar.d = cl0Var;
            } else if (j7hVar instanceof pkk) {
                int iOrdinal2 = ((pkk) j7hVar).b.ordinal();
                if (iOrdinal2 == 1) {
                    oqkVar.d = cl0.f;
                } else if (iOrdinal2 == 2) {
                    oqkVar.d = cl0.e;
                }
            } else if (!j7hVar.equals(rkk.b) && !j7hVar.equals(skk.b) && !j7hVar.equals(tkk.b)) {
                h9o.p();
                return;
            }
        }
        gbfVar.m(false);
        int iOrdinal3 = lbfVar.ordinal();
        if (iOrdinal3 != 1) {
            if (iOrdinal3 == 2) {
                int i = this.b;
                if (i == 0) {
                    i = gbfVar.y;
                }
                int i2 = i;
                if (i2 == 0) {
                    yz9Var.a.K(a(), 6, gbfVar.x, 1, false, this.f);
                    return;
                } else {
                    yz9Var.a.K(a(), i2, gbfVar.x, 1, false, this.f);
                    return;
                }
            }
            if (iOrdinal3 != 3) {
                return;
            }
        }
        String strA2 = a();
        yz9Var.getClass();
        vx3 vx3VarA = ay3.a(strA2, lqmVar, false);
        vx3VarA.o = (byte) 1;
        vx3VarA.m = this.g;
        vx3VarA.n = this.h;
        am2.v(vx3VarA);
    }
}
