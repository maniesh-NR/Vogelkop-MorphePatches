package defpackage;

import android.os.Handler;
import androidx.fragment.app.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gjm implements w6f {
    public static final String g = "ui-dest-".concat(u7i.class.getName());
    public final w a;
    public final Function1 b;
    public final shf c;
    public final ArrayList d = new ArrayList();
    public final ejm e;
    public final LinkedHashMap f;

    public gjm(w wVar, tcc tccVar, Function1 function1) {
        this.a = wVar;
        this.b = function1;
        this.c = new shf(wVar, new lrk(1, this, gjm.class, "allowNavigationBack", "allowNavigationBack(Landroidx/fragment/app/FragmentManager$BackStackEntry;)Z", 0, (byte) 15), new p7l((Object) this, (byte) 24));
        ejm ejmVar = new ejm(tccVar, function1);
        this.e = ejmVar;
        this.f = new LinkedHashMap();
        wVar.b0(ejmVar, true);
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        nim nimVar = (nim) obj;
        ejm ejmVar = this.e;
        ejmVar.t.b(nimVar);
        evl evlVar = ejmVar.u;
        qim qimVar = nimVar.a;
        boolean z = evlVar.a;
        qimVar.q = z;
        if (z) {
            qimVar.e(qimVar.d());
        } else {
            qimVar.a();
        }
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.e.t.c((nim) obj);
    }

    public final oje a(Class cls) {
        String strH = u0h.h(cls);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            oje ojeVar = (oje) it.next();
            if (Intrinsics.a(ojeVar.a, strH)) {
                return ojeVar;
            }
        }
        qp2.o("No entry: ".concat(strH));
        return null;
    }

    public final boolean b(n37 n37Var) {
        Integer numValueOf;
        String strConcat = "ui-dest-".concat(n37Var.getId().getName());
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (Intrinsics.a(((oje) it.next()).a, strConcat)) {
                String strConcat2 = "ui-dest-".concat(n37Var.getId().getName());
                String str = g;
                if (!strConcat2.equals(str)) {
                    if (this.a.F("ui-dest-".concat(n37Var.getId().getName())) == null) {
                        g(n37Var.getId(), true);
                        return true;
                    }
                }
                shf shfVar = this.c;
                shfVar.getClass();
                if ("ui-dest-".concat(n37Var.getId().getName()).equals(str)) {
                    return shfVar.C(0);
                }
                w wVar = (w) shfVar.a;
                int iJ = wVar.J();
                String strConcat3 = "ui-dest-".concat(n37Var.getId().getName());
                int i = iJ - 1;
                while (true) {
                    if (i < 0) {
                        numValueOf = null;
                        break;
                    }
                    if (Intrinsics.a(((ym9) wVar.I(i)).k, strConcat3)) {
                        numValueOf = Integer.valueOf(i);
                        break;
                    }
                    i--;
                }
                if (numValueOf != null) {
                    return shfVar.C(Integer.valueOf(numValueOf.intValue()));
                }
            }
        }
        return false;
    }

    public final void c(r37 r37Var, ndc ndcVar, f7f f7fVar) {
        String strConcat = "ui-dest-".concat(r37Var.getClass().getName());
        ode odeVar = new ode();
        odeVar.j(ndcVar, f7fVar);
        this.f.put(strConcat, odeVar);
        f(r37Var, false);
    }

    public final void e(n37 n37Var, boolean z) {
        this.f.remove("ui-dest-".concat(n37Var.getId().getName()));
        f(n37Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0535  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.n37 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjm.f(n37, boolean):void");
    }

    public final void g(Class cls, boolean z) {
        String strH = u0h.h(cls);
        boolean zEquals = strH.equals(g);
        w wVar = this.a;
        if (zEquals) {
            wVar.V(1, (String) null);
        } else {
            wVar.V(z ? 1 : 0, strH);
        }
        ejm ejmVar = this.e;
        Handler handler = ejmVar.s;
        handler.removeCallbacks(ejmVar);
        handler.post(ejmVar);
    }

    public final void h(Class cls, Object obj) {
        ode odeVar = (ode) this.f.get(u0h.h(cls));
        if (odeVar != null) {
            odeVar.r(obj);
        }
    }
}
