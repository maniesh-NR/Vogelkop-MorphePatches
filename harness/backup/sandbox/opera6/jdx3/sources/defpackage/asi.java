package defpackage;

import android.view.Menu;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class asi extends ie {
    public final /* synthetic */ byte k = 1;
    public final u3l l;

    public asi(ge geVar, k6l k6lVar, u4l u4lVar, s9i s9iVar, p9l p9lVar) {
        u3l u3lVar;
        super(geVar, k6lVar, u4lVar, s9iVar, p9lVar, (LinkedHashSet) ((pde) s9iVar.c).g());
        qyi qyiVar = (qyi) ((pde) s9iVar.d).g();
        if (Intrinsics.a(qyiVar, oyi.a)) {
            u3lVar = u3l.c;
        } else {
            if (!(qyiVar instanceof pyi)) {
                h9o.p();
                throw null;
            }
            u3lVar = ((pyi) qyiVar).b;
        }
        this.l = u3lVar;
    }

    public asi(ge geVar, k6l k6lVar, u4l u4lVar, s9i s9iVar, p9l p9lVar, u3l u3lVar) {
        LinkedHashSet linkedHashSet;
        qyi qyiVar = (qyi) ((pde) s9iVar.d).g();
        if (Intrinsics.a(qyiVar, oyi.a)) {
            ArrayList arrayListP = exg.p(k6lVar, u3lVar, y6l.a);
            linkedHashSet = new LinkedHashSet();
            o95.t(arrayListP, linkedHashSet);
        } else {
            if (!(qyiVar instanceof pyi)) {
                h9o.p();
                throw null;
            }
            linkedHashSet = (LinkedHashSet) ((pde) s9iVar.c).g();
        }
        super(geVar, k6lVar, u4lVar, s9iVar, p9lVar, linkedHashSet);
        this.l = u3lVar;
    }

    @Override // defpackage.ie
    public final void e(Menu menu) {
        byte b = this.k;
        LinkedHashSet linkedHashSet = this.f;
        u3l u3lVar = this.l;
        xd xdVar = xd.a;
        ee eeVar = ee.a;
        switch (b) {
            case 0:
                super.e(menu);
                a(menu, new be(u3lVar));
                if (exg.g(linkedHashSet)) {
                    a(menu, xdVar);
                }
                if (exg.i(linkedHashSet)) {
                    a(menu, eeVar);
                }
                ie.c(menu);
                a(menu, new md(true, vr0.f));
                break;
            default:
                super.e(menu);
                Set linkedHashSet2 = new LinkedHashSet();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    linkedHashSet2.add(Integer.valueOf(((d7l) ((b2l) it.next())).j.a().d));
                }
                boolean z = linkedHashSet2.size() == 1 && linkedHashSet2.contains(0);
                boolean z2 = linkedHashSet2.size() == 1 && !linkedHashSet2.contains(0);
                Set set = z2 ? linkedHashSet2 : v08.a;
                if (!linkedHashSet.isEmpty()) {
                    boolean zW = this.d.W();
                    ld ldVar = ld.a;
                    kd kdVar = kd.a;
                    qd qdVar = qd.a;
                    td tdVar = td.a;
                    jd jdVar = jd.a;
                    ud udVar = ud.a;
                    boolean z3 = z2;
                    zd zdVar = zd.a;
                    ce ceVar = ce.a;
                    if (!zW) {
                        boolean z4 = z;
                        if (linkedHashSet.size() != 1) {
                            if (z4) {
                                a(menu, tdVar);
                            } else if (z3 && !g(((Number) CollectionsKt.J(linkedHashSet2)).intValue()) && f(((Number) CollectionsKt.J(linkedHashSet2)).intValue())) {
                                a(menu, new rd(((Number) CollectionsKt.J(linkedHashSet2)).intValue(), false));
                                a(menu, ceVar);
                            } else if (z3) {
                                a(menu, zdVar);
                            }
                            b(d(menu, udVar), u3lVar, set);
                            SubMenu subMenuD = d(menu, jdVar);
                            a(subMenuD, kdVar);
                            a(subMenuD, ldVar);
                            ie.c(menu);
                            a(menu, new pd(u3lVar));
                            a(menu, new ae(u3lVar));
                            if (exg.g(linkedHashSet)) {
                                a(menu, xdVar);
                            }
                            if (exg.i(linkedHashSet)) {
                                a(menu, eeVar);
                            }
                            a(menu, new od());
                            break;
                        } else {
                            if (z3 && !g(((Number) CollectionsKt.J(linkedHashSet2)).intValue()) && f(((Number) CollectionsKt.J(linkedHashSet2)).intValue())) {
                                a(menu, new rd(((Number) CollectionsKt.J(linkedHashSet2)).intValue(), false));
                                a(menu, ceVar);
                            } else if (z3) {
                                a(menu, zdVar);
                            }
                            b(d(menu, udVar), u3lVar, set);
                            SubMenu subMenuD2 = d(menu, jdVar);
                            a(subMenuD2, kdVar);
                            a(subMenuD2, ldVar);
                            if (!z5i.a0(((d7l) ((b2l) CollectionsKt.J(linkedHashSet))).j.getUrl())) {
                                a(menu, qdVar);
                            }
                            ie.c(menu);
                            a(menu, new pd(u3lVar));
                            a(menu, new ae(u3lVar));
                            if (exg.g(linkedHashSet)) {
                                a(menu, wd.a);
                            }
                            if (exg.i(linkedHashSet)) {
                                a(menu, de.a);
                            }
                            a(menu, new nd());
                            break;
                        }
                    } else {
                        if (z) {
                            a(menu, tdVar);
                        } else if (z3 && !g(((Number) CollectionsKt.J(linkedHashSet2)).intValue()) && f(((Number) CollectionsKt.J(linkedHashSet2)).intValue())) {
                            a(menu, new rd(((Number) CollectionsKt.J(linkedHashSet2)).intValue(), false));
                            a(menu, ceVar);
                        } else if (z3) {
                            a(menu, zdVar);
                        }
                        b(d(menu, udVar), u3lVar, set);
                        SubMenu subMenuD3 = d(menu, jdVar);
                        a(subMenuD3, kdVar);
                        a(subMenuD3, ldVar);
                        if (linkedHashSet.size() == 1 && !z5i.a0(((d7l) ((b2l) CollectionsKt.J(linkedHashSet))).j.getUrl())) {
                            a(menu, qdVar);
                        }
                        ie.c(menu);
                        a(menu, new pd(u3lVar));
                        if (exg.g(linkedHashSet)) {
                            a(menu, xdVar);
                        }
                        if (exg.i(linkedHashSet)) {
                            a(menu, eeVar);
                        }
                        a(menu, new md(true, vr0.k));
                        break;
                    }
                } else {
                    a(menu, new ae(u3lVar));
                    break;
                }
                break;
        }
    }

    public final boolean f(int i) {
        s3l s3lVar = u3l.a;
        return this.d.X(exg.p(this.b, new r3l(i), y6l.a));
    }

    public final boolean g(int i) {
        return ((Set) this.e.C().g()).contains(Integer.valueOf(i));
    }
}
