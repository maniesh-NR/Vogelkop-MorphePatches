package defpackage;

import android.view.MenuItem;
import android.view.View;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ge extends o73 {
    public ie j;
    public dkf k;
    public final /* synthetic */ Function1 l;

    public ge(Function1 function1) {
        this.l = function1;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        this.k = (dkf) r9iVar.b;
        ie ieVar = (ie) this.l.invoke(this);
        this.j = ieVar;
        if (ieVar == null) {
            ieVar = null;
        }
        ieVar.e((m66) r9iVar.c);
    }

    @Override // defpackage.o73, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        super.onDismiss();
        ie ieVar = this.j;
        if (ieVar == null) {
            ieVar = null;
        }
        zi4.y(ieVar.h).c(ieVar.g);
        ieVar.e.k0();
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ie ieVar = this.j;
        if (ieVar == null) {
            ieVar = null;
        }
        int itemId = menuItem.getItemId();
        k6l k6lVar = ieVar.b;
        LinkedHashSet linkedHashSet = ieVar.f;
        x9l x9lVar = ieVar.e;
        s9i s9iVar = ieVar.d;
        fe feVar = (fe) ieVar.j.get(Integer.valueOf(itemId));
        if (feVar == null) {
            return false;
        }
        boolean z = feVar instanceof ae;
        y6l y6lVar = y6l.a;
        if (z) {
            s9iVar.d0(exg.p(k6lVar, ((ae) feVar).a, y6lVar));
            return true;
        }
        if (feVar instanceof pd) {
            s9iVar.J(exg.p(k6lVar, ((pd) feVar).a, y6lVar));
            return true;
        }
        boolean z2 = feVar instanceof nd;
        vr0 vr0Var = vr0.k;
        if (z2) {
            s9iVar.h0();
            x9lVar.g0(linkedHashSet, pdb.c, vr0Var, false);
            return true;
        }
        if (feVar instanceof od) {
            s9iVar.h0();
            x9lVar.g0(linkedHashSet, pdb.c, vr0Var, false);
            return true;
        }
        if (feVar instanceof md) {
            s9iVar.h0();
            md mdVar = (md) feVar;
            x9lVar.g0(linkedHashSet, pdb.c, mdVar.b, mdVar.a);
            return true;
        }
        if (feVar.equals(td.a) || feVar.equals(yd.a)) {
            s9iVar.h0();
            x9lVar.N(new z3(ieVar, (byte) 5));
            return true;
        }
        if (feVar.equals(zd.a)) {
            s9iVar.h0();
            x9lVar.P(0, linkedHashSet, vr0.p);
            return true;
        }
        if (feVar.equals(ce.a)) {
            s9iVar.h0();
            x9lVar.P(0, linkedHashSet, vr0.h);
            return true;
        }
        if (!feVar.equals(jd.a) && !feVar.equals(ud.a)) {
            if (feVar.equals(kd.a)) {
                s9iVar.h0();
                x9lVar.m0(linkedHashSet);
                return true;
            }
            if (feVar.equals(ld.a)) {
                s9iVar.h0();
                x9lVar.w(linkedHashSet);
                return true;
            }
            if (feVar.equals(qd.a)) {
                s9iVar.h0();
                b2l b2lVar = (b2l) CollectionsKt.L(linkedHashSet);
                if (b2lVar != null) {
                    x9lVar.d0(b2lVar);
                    return true;
                }
            } else {
                if (feVar instanceof vd) {
                    s9iVar.h0();
                    x9lVar.P(Integer.valueOf(((vd) feVar).a.a), linkedHashSet, vr0.q);
                    return true;
                }
                if (feVar instanceof rd) {
                    s9iVar.h0();
                    x9lVar.p0(((rd) feVar).a);
                    return true;
                }
                if (feVar instanceof sd) {
                    s9iVar.h0();
                    x9lVar.D(((sd) feVar).a);
                    return true;
                }
                if (feVar instanceof be) {
                    be beVar = (be) feVar;
                    u3l u3lVar = beVar.a;
                    if (!s9iVar.Y()) {
                        s9iVar.e = u3lVar;
                        ((pde) s9iVar.c).r(new LinkedHashSet());
                        ((pde) s9iVar.d).r(new pyi(exg.p((k6l) s9iVar.b, (u3l) s9iVar.e, y6lVar).size(), (u3l) s9iVar.e, false));
                    }
                    s9iVar.d0(beVar.b);
                    return true;
                }
                if (!feVar.equals(wd.a) && !feVar.equals(xd.a)) {
                    if (!feVar.equals(de.a) && !feVar.equals(ee.a)) {
                        h9o.p();
                        return false;
                    }
                    s9iVar.h0();
                    x9lVar.O(linkedHashSet, false, true);
                    return true;
                }
                s9iVar.h0();
                x9lVar.o0(linkedHashSet, false, true);
            }
        }
        return true;
    }
}
