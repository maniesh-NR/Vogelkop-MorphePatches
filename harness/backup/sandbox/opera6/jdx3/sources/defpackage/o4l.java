package defpackage;

import android.view.Menu;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o4l extends ie {
    public final u3l k;
    public final int l;
    public final u3l m;

    public o4l(ge geVar, k6l k6lVar, u4l u4lVar, s9i s9iVar, x9l x9lVar, u3l u3lVar, int i) {
        LinkedHashSet linkedHashSet;
        u3l p3lVar;
        pde pdeVar = (pde) s9iVar.d;
        qyi qyiVar = (qyi) pdeVar.g();
        oyi oyiVar = oyi.a;
        if (Intrinsics.a(qyiVar, oyiVar)) {
            s3l s3lVar = u3l.a;
            ArrayList arrayListP = exg.p(k6lVar, new r3l(i), y6l.a);
            linkedHashSet = new LinkedHashSet();
            o95.t(arrayListP, linkedHashSet);
        } else {
            if (!(qyiVar instanceof pyi)) {
                h9o.p();
                throw null;
            }
            linkedHashSet = (LinkedHashSet) ((pde) s9iVar.c).g();
        }
        super(geVar, k6lVar, u4lVar, s9iVar, x9lVar, linkedHashSet);
        this.k = u3lVar;
        this.l = i;
        qyi qyiVar2 = (qyi) pdeVar.g();
        if (Intrinsics.a(qyiVar2, oyiVar)) {
            s3l s3lVar2 = u3l.a;
            p3lVar = new r3l(i);
        } else {
            if (!(qyiVar2 instanceof pyi)) {
                h9o.p();
                throw null;
            }
            u3l u3lVar2 = ((pyi) qyiVar2).b;
            s3l s3lVar3 = u3l.a;
            r3l r3lVar = new r3l(i);
            u3lVar2.getClass();
            p3lVar = new p3l(u3lVar2, r3lVar);
        }
        this.m = p3lVar;
    }

    @Override // defpackage.ie
    public final void e(Menu menu) {
        u3l u3lVar;
        super.e(menu);
        s9i s9iVar = this.d;
        qyi qyiVar = (qyi) ((pde) s9iVar.d).g();
        boolean zA = Intrinsics.a(qyiVar, oyi.a);
        y6l y6lVar = y6l.a;
        int i = 0;
        k6l k6lVar = this.b;
        if (!zA) {
            if (!(qyiVar instanceof pyi)) {
                h9o.p();
                return;
            }
            u3l u3lVar2 = this.m;
            ArrayList arrayListP = exg.p(k6lVar, u3lVar2, y6lVar);
            if (!s9iVar.X(arrayListP)) {
                a(menu, new ae(u3lVar2));
            }
            if (arrayListP.isEmpty()) {
                return;
            }
            int size = arrayListP.size();
            while (i < size) {
                Object obj = arrayListP.get(i);
                i++;
                if (((LinkedHashSet) ((pde) s9iVar.c).g()).contains((b2l) obj)) {
                    a(menu, new pd(u3lVar2));
                    return;
                }
            }
            return;
        }
        s3l s3lVar = u3l.a;
        int i2 = this.l;
        ArrayList arrayListP2 = exg.p(k6lVar, new r3l(i2), y6lVar);
        ArrayList arrayList = new ArrayList();
        int size2 = arrayListP2.size();
        int i3 = 0;
        while (true) {
            u3lVar = this.k;
            if (i3 >= size2) {
                break;
            }
            Object obj2 = arrayListP2.get(i3);
            i3++;
            if (u3lVar.a((b2l) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() < arrayListP2.size()) {
            a(menu, new sd(i2));
        } else {
            a(menu, ce.a);
        }
        ie.c(menu);
        a(menu, new rd(i2, true));
        a(menu, new be(u3lVar));
        LinkedHashSet linkedHashSet = this.f;
        if (exg.g(linkedHashSet)) {
            a(menu, xd.a);
        }
        if (exg.i(linkedHashSet)) {
            a(menu, ee.a);
        }
        a(menu, new md(false, vr0.j));
    }
}
