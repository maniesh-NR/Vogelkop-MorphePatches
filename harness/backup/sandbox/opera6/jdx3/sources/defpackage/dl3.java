package defpackage;

import com.opera.android.bookmarks.b;
import com.opera.android.bookmarks.c;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class dl3 implements ql3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ql3
    public final void A(al3 al3Var, ml3 ml3Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                n(ml3Var);
                break;
            case 1:
                if (!al3Var.g()) {
                    ((vnj) ((eme) obj).a).f(eme.q0((pl3) al3Var), null);
                    break;
                }
                break;
            case 2:
                ((gn3) obj).t.N0();
                break;
            case 4:
                b();
                break;
            case 5:
                if (!al3Var.g()) {
                    som somVar = (som) obj;
                    somVar.k = true;
                    somVar.c.f(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ql3
    public final void D(Collection collection, ml3 ml3Var) {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                fl3 fl3Var = (fl3) obj;
                jl3 jl3Var = fl3Var.s;
                if (jl3Var != null) {
                    if (((ArrayList) collection).contains((ml3) jl3Var.a)) {
                        fl3Var.H0();
                    }
                }
                n(ml3Var);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) collection;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    al3 al3Var = (al3) obj2;
                    if (al3Var.g()) {
                        break;
                    } else {
                        ((vnj) ((eme) obj).a).j(eme.q0((pl3) al3Var));
                    }
                }
                break;
            case 2:
                ArrayList arrayList2 = (ArrayList) collection;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    l((al3) obj3);
                }
                ((gn3) obj).t.N0();
                break;
            case 3:
                ss7 ss7Var = (ss7) obj;
                ml3 ml3Var2 = ss7Var.B;
                if (ml3Var2 != null && ((ArrayList) collection).contains(ml3Var2)) {
                    ss7Var.B = null;
                }
                al3 al3Var2 = ss7Var.v;
                if (al3Var2 != null && ((ArrayList) collection).contains(al3Var2)) {
                    ss7Var.v = null;
                    break;
                }
                break;
            case 4:
                b();
                break;
        }
    }

    @Override // defpackage.ql3
    public final void a(b bVar, c cVar, c cVar2) {
        switch (this.a) {
            case 0:
                n(cVar);
                break;
        }
    }

    public final void b() {
        tr8 tr8Var = (tr8) this.b;
        if (tr8Var.e.h()) {
            return;
        }
        tr8Var.a();
    }

    public final void c() {
    }

    @Override // defpackage.ql3
    public final void d(Collection collection, ml3 ml3Var, ml3 ml3Var2) {
        switch (this.a) {
            case 0:
                n(ml3Var);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ql3
    public final void e(b bVar, c cVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (!bVar.g()) {
                    ((vnj) ((eme) obj).a).m(eme.q0((pl3) bVar));
                    break;
                }
                break;
            case 2:
                if (bVar.g()) {
                    ((gn3) obj).g();
                    break;
                }
                break;
            case 4:
                b();
                break;
        }
    }

    public final void f(al3 al3Var, ml3 ml3Var) {
    }

    public final void g(b bVar, c cVar, c cVar2) {
    }

    public final void h(b bVar, c cVar) {
    }

    public final void i(b bVar, c cVar) {
    }

    public final void j(Collection collection, ml3 ml3Var, ml3 ml3Var2) {
    }

    public final void k(Collection collection, ml3 ml3Var) {
    }

    public final void l(al3 al3Var) {
        gn3 gn3Var = (gn3) this.b;
        ArrayList arrayList = gn3Var.a;
        if (!al3Var.g() || arrayList.isEmpty()) {
            return;
        }
        int iIndexOf = arrayList.indexOf(new ym3((ml3) al3Var));
        if (iIndexOf == arrayList.size() - 1) {
            gn3Var.d();
        } else if (iIndexOf > 0) {
            arrayList.remove(iIndexOf);
        }
    }

    @Override // defpackage.ql3
    public final void m() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fl3 fl3Var = (fl3) obj;
                if (fl3Var.s != null) {
                    fl3Var.H0();
                    break;
                }
                break;
            case 1:
                vnj vnjVar = (vnj) ((eme) obj).a;
                mnj mnjVar = mnj.a;
                vnjVar.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = vnjVar.e;
                o95.v(arrayList2, new l51(arrayList));
                if (vnjVar.g != null) {
                    vnjVar.c();
                } else {
                    arrayList2.add(new rnj());
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((Function1) obj2).invoke(nnj.a);
                }
                break;
            case 2:
                gn3 gn3Var = (gn3) obj;
                ArrayList arrayList3 = gn3Var.a;
                while (arrayList3.size() > 2) {
                    arrayList3.remove(1);
                }
                if (arrayList3.size() == 2) {
                    gn3Var.d();
                }
                gn3Var.t.N0();
                break;
            case 3:
                ss7 ss7Var = (ss7) obj;
                if (ss7Var.B != null) {
                    ss7Var.B = null;
                }
                if (ss7Var.v != null) {
                    ss7Var.v = null;
                    break;
                }
                break;
        }
    }

    public final void n(ml3 ml3Var) {
        fl3 fl3Var = (fl3) this.b;
        jl3 jl3Var = fl3Var.s;
        if (jl3Var == null || !((ml3) jl3Var.a).equals(ml3Var)) {
            return;
        }
        fl3Var.J0();
    }

    @Override // defpackage.ql3
    public final void s(b bVar, c cVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ql3
    public final void y(b bVar, c cVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fl3 fl3Var = (fl3) obj;
                jl3 jl3Var = fl3Var.s;
                if (jl3Var != null && bVar.equals((ml3) jl3Var.a)) {
                    fl3Var.H0();
                }
                n(cVar);
                break;
            case 1:
                if (!bVar.g()) {
                    ((vnj) ((eme) obj).a).j(eme.q0((pl3) bVar));
                    break;
                }
                break;
            case 2:
                l(bVar);
                ((gn3) obj).t.N0();
                break;
            case 3:
                ss7 ss7Var = (ss7) obj;
                ml3 ml3Var = ss7Var.B;
                if (ml3Var != null && bVar.equals(ml3Var)) {
                    ss7Var.B = null;
                }
                al3 al3Var = ss7Var.v;
                if (al3Var != null && bVar.equals(al3Var)) {
                    ss7Var.v = null;
                    break;
                }
                break;
            case 4:
                b();
                break;
        }
    }
}
