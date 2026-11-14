package defpackage;

import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class zf {
    public final z21 a;
    public final Set b;
    public man c;
    public final m59 d;

    public zf(z21 z21Var, Set set, nx5 nx5Var, rmg rmgVar) {
        this.a = z21Var;
        this.b = set;
        this.d = new m59(nx5Var, new x2(rmgVar, this, (byte) 2));
        na2.B(nx5Var, null, null, new yf((byte) 0, null, this), 3);
    }

    public final qfe a() {
        m59 m59Var = this.d;
        synchronized (m59Var.f) {
            if (m59Var.c) {
                return null;
            }
            int i = m59Var.b + 1;
            m59Var.b = i;
            if (i == 1) {
                d3k d3kVar = (d3k) m59Var.g;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                m59Var.g = null;
            }
            return new qfe(m59Var);
        }
    }

    public final Object b(nt5 nt5Var) throws m2 {
        Object objF = cs5.F(this.a.t, new xf(2, (mt5) null, (byte) 1), nt5Var);
        px5 px5Var = px5.a;
        if (objF != px5Var) {
            objF = Unit.a;
        }
        return objF == px5Var ? objF : Unit.a;
    }

    public final void c() {
        this.d.k();
        this.a.a();
    }

    public final Unit d(man manVar, qfe qfeVar) {
        Unit unit;
        man manVar2 = this.c;
        this.c = manVar;
        mt5 mt5Var = null;
        if (manVar2 != null) {
            manVar2.a(null);
        }
        nak nakVar = this.a.t;
        synchronized (manVar.e) {
            if (manVar.f) {
                qfeVar.b();
                unit = Unit.a;
            } else {
                manVar.k = na2.B(manVar.c, null, null, new hkm(nakVar, manVar, mt5Var, (byte) 3), 3);
                manVar.l = qfeVar;
                unit = Unit.a;
            }
        }
        return unit == px5.a ? unit : unit;
    }

    public final String toString() {
        return "ActiveCamera(cameraId=" + ((Object) sd4.b(this.a.a)) + ")@" + Integer.toString(hashCode(), CharsKt.checkRadix(16));
    }
}
