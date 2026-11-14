package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.mip;
import defpackage.pgp;
import defpackage.qgp;
import defpackage.u6k;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class qf2 implements clp {
    public final a2 a;
    public final mip b;
    public final xv c;
    public final nx5 d;
    public final ux2 e;
    public final Object f = new Object();
    public final qgp g = tf2.o();
    public boolean h;
    public boolean i;
    public d3k j;

    public qf2(a2 a2Var, mip mipVar, xv xvVar, nx5 nx5Var, ux2 ux2Var) {
        this.a = a2Var;
        this.b = mipVar;
        this.c = xvVar;
        this.d = nx5Var;
        this.e = ux2Var;
    }

    public static final void a(qf2 qf2Var) {
        synchronized (qf2Var.f) {
            if (qf2Var.i) {
                return;
            }
            ux2 ux2Var = qf2Var.e;
            fw0 fw0Var = fw0.CUI_NAME_POST_CLICK_LIFECYCLE_MONITORING;
            l08 l08Var = l08.a;
            kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
            if (hh3.b().a == null) {
                wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
                try {
                    qf2Var.i = true;
                    hh3.a().e().H = (tf2) qf2Var.g.a();
                    hh3.a().a.b.b = qf2Var.c.h;
                    wk2VarA.close();
                } catch (Throwable th) {
                    try {
                        wk2VarA.b(th);
                        if (th instanceof iyo) {
                            throw th;
                        }
                        wk2VarA.a(th);
                        if (th instanceof kql) {
                            throw new uw0((kql) th);
                        }
                        if (th instanceof CancellationException) {
                            throw new ou0(th);
                        }
                        if (!(th instanceof mv0)) {
                            throw new tu0(th);
                        }
                        throw th;
                    } finally {
                    }
                }
            } else {
                rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
                try {
                    qf2Var.i = true;
                    hh3.a().e().H = (tf2) qf2Var.g.a();
                    hh3.a().a.b.b = qf2Var.c.h;
                    rg3VarA.close();
                } catch (Throwable th2) {
                    try {
                        rg3VarA.b(th2);
                        if (th2 instanceof iyo) {
                            throw th2;
                        }
                        rg3VarA.a(th2);
                        if (th2 instanceof kql) {
                            throw new uw0((kql) th2);
                        }
                        if (th2 instanceof CancellationException) {
                            throw new ou0(th2);
                        }
                        if (!(th2 instanceof mv0)) {
                            throw new tu0(th2);
                        }
                        throw th2;
                    } finally {
                    }
                }
            }
        }
    }

    public final void a$1() {
        a$1(4);
    }

    public final void a$1(int i) {
        synchronized (this.f) {
            if (this.i || !this.h) {
                return;
            }
            qgp qgpVar = this.g;
            pgp pgpVarO = ue.o();
            pgpVarO.b$1();
            ue ueVar = (ue) pgpVarO.b;
            ueVar.getClass();
            int i2 = 0;
            byte b = 3;
            mt5 mt5Var = null;
            if (i != 10) {
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        i2 = 1;
                        break;
                    case 3:
                        i2 = 2;
                        break;
                    case 4:
                        i2 = 3;
                        break;
                    case 5:
                        i2 = 4;
                        break;
                    case 6:
                        i2 = 5;
                        break;
                    case 7:
                        i2 = 6;
                        break;
                    case 8:
                        i2 = 7;
                        break;
                    case 9:
                        i2 = 8;
                        break;
                    case 10:
                        i2 = -1;
                        break;
                    default:
                        throw null;
                }
            } else {
                byte[] bArr = yb1.a;
                qp2.o("Can't get the number of an unknown enum value.");
            }
            ueVar.eventType_ = i2;
            this.b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            pgpVarO.b$1();
            ((ue) pgpVarO.b).timestampMs_ = jCurrentTimeMillis;
            ue ueVar2 = (ue) pgpVarO.a();
            qgpVar.b$1();
            ((tf2) qgpVar.b).a(ueVar2);
            if (i == 9) {
                d3k d3kVar = this.j;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                defpackage.na2.B(this.d, h.a, null, new fsg(new u6k((byte) 23, mt5Var, this), mt5Var, b), 2);
            }
        }
    }

    public final void b() {
        a$1(6);
    }

    public final void c() {
        a$1(3);
    }

    public final void d() {
        a$1(2);
    }

    public final void onDestroy() {
        a$1(9);
    }

    public final void onPause() {
        a$1(7);
    }

    public final void onResume() {
        a$1(5);
    }

    public final void onStop() {
        a$1(8);
    }
}
