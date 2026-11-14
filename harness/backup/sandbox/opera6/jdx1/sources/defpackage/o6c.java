package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class o6c implements toi {
    public final /* synthetic */ byte a;
    public final /* synthetic */ toi b;
    public final /* synthetic */ kpi c;

    public /* synthetic */ o6c(toi toiVar, kpi kpiVar, byte b) {
        this.a = b;
        this.c = kpiVar;
        this.b = toiVar;
    }

    @Override // defpackage.toi
    public final float a(float f) {
        switch (this.a) {
        }
        return this.b.a(f);
    }

    public final int b(int i) {
        Object obj;
        byte b = this.a;
        kpi kpiVar = this.c;
        switch (b) {
            case 0:
                u6c u6cVar = (u6c) kpiVar;
                m6c m6cVarJ = u6cVar.j();
                if (m6cVarJ.l.isEmpty()) {
                    return 0;
                }
                int iH = u6cVar.h();
                if (i > e() || iH > i) {
                    return ((i - u6cVar.h()) * gyg.Z(m6cVarJ)) - u6cVar.i();
                }
                List list = m6cVarJ.l;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = list.get(i2);
                        if (((n6c) obj).a != i) {
                            i2++;
                        }
                    } else {
                        obj = null;
                    }
                }
                n6c n6cVar = (n6c) obj;
                if (n6cVar != null) {
                    return n6cVar.l;
                }
                return 0;
            default:
                sxf sxfVar = (sxf) kpiVar;
                return (int) (djh.d(mkh.p(sxfVar) + zed.b(((sxfVar.p() * (i - sxfVar.k())) - (sxfVar.l() * sxfVar.p())) + 0.0f), sxfVar.h, sxfVar.g) - mkh.p(sxfVar));
        }
    }

    public final int c() {
        byte b = this.a;
        kpi kpiVar = this.c;
        switch (b) {
            case 0:
                return ((u6c) kpiVar).h();
            default:
                return ((sxf) kpiVar).e;
        }
    }

    public final int d() {
        byte b = this.a;
        kpi kpiVar = this.c;
        switch (b) {
            case 0:
                return ((u6c) kpiVar).i();
            default:
                return ((sxf) kpiVar).f;
        }
    }

    public final int e() {
        byte b = this.a;
        kpi kpiVar = this.c;
        switch (b) {
            case 0:
                n6c n6cVar = (n6c) CollectionsKt.R(((u6c) kpiVar).j().l);
                if (n6cVar != null) {
                    return n6cVar.a;
                }
                return 0;
            default:
                return ((wfd) CollectionsKt.Q(((sxf) kpiVar).m().a)).a;
        }
    }

    public final void f(int i) {
        byte b = this.a;
        kpi kpiVar = this.c;
        switch (b) {
            case 0:
                ((u6c) kpiVar).m(i);
                break;
            default:
                sxf sxfVar = (sxf) kpiVar;
                float fP = sxfVar.p();
                sxfVar.t(i, fP != 0.0f ? 0.0f / fP : 0.0f, true);
                break;
        }
    }
}
