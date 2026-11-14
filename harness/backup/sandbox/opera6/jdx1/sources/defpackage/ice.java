package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ice extends a7f {
    public final see c = n6h.e();
    public final ArrayList d = new ArrayList();
    public final see e = new see();
    public final txi f;

    public ice() {
        a7b a7bVar = new a7b(this, (byte) 19);
        ytj.b(ytj.a);
        synchronized (ytj.c) {
            ytj.h = CollectionsKt.W(a7bVar, ytj.h);
        }
        this.f = new txi(a7bVar, (byte) 8);
    }

    public final void b(or4 or4Var) {
        this.d.add(new gce(or4Var));
    }

    public final void c() {
        synchronized (((a7f) this).b) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                hce hceVar = (hce) arrayList.get(i);
                if (hceVar instanceof fce) {
                    n6h.c(this.c, ((fce) hceVar).a, ((fce) hceVar).b);
                } else {
                    if (!(hceVar instanceof gce)) {
                        throw new oye();
                    }
                    n6h.n(this.c, ((gce) hceVar).a);
                }
            }
        }
        this.d.clear();
    }

    public final void d() {
        this.f.d();
        this.d.clear();
        this.e.a();
        synchronized (((a7f) this).b) {
            this.c.a();
        }
    }

    public final Function1 e(or4 or4Var) {
        see seeVar = this.e;
        jkc jkcVar = (Function1) seeVar.g(or4Var);
        if (jkcVar == null) {
            jkcVar = new jkc(this, or4Var, (byte) 17);
            int iF = seeVar.f(or4Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = seeVar.c;
            Object obj = objArr[iF];
            seeVar.b[iF] = or4Var;
            objArr[iF] = jkcVar;
        }
        return jkcVar;
    }

    public final void f(or4 or4Var) {
        this.e.k(or4Var);
        b(or4Var);
        c();
    }
}
