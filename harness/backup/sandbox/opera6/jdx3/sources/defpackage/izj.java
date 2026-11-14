package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class izj implements w6f {
    public final ArrayList a = new ArrayList();
    public final Context b;
    public final ikc c;
    public final pde d;

    public izj(Context context, ndc ndcVar, ikc ikcVar, ikc ikcVar2) {
        this.b = context;
        this.c = ikcVar;
        pde pdeVar = new pde(j14.B(context, ((Boolean) ikcVar.g()).booleanValue()));
        this.d = pdeVar;
        final byte b = 0;
        ikcVar.j(ndcVar, new f7f(this) { // from class: gzj
            public final /* synthetic */ izj b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                int i = 0;
                izj izjVar = this.b;
                switch (b2) {
                    case 0:
                        boolean zF0 = xf8.F0(izjVar.d, j14.B(izjVar.b, ((Boolean) izjVar.c.g()).booleanValue()));
                        ArrayList arrayList = izjVar.a;
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            ((hzj) obj2).a(zF0);
                        }
                        break;
                    default:
                        boolean zF02 = xf8.F0(izjVar.d, j14.B(izjVar.b, ((Boolean) izjVar.c.g()).booleanValue()));
                        ArrayList arrayList2 = izjVar.a;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            ((hzj) obj3).a(zF02);
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        ikcVar2.j(ndcVar, new f7f(this) { // from class: gzj
            public final /* synthetic */ izj b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                int i = 0;
                izj izjVar = this.b;
                switch (b22) {
                    case 0:
                        boolean zF0 = xf8.F0(izjVar.d, j14.B(izjVar.b, ((Boolean) izjVar.c.g()).booleanValue()));
                        ArrayList arrayList = izjVar.a;
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            ((hzj) obj2).a(zF0);
                        }
                        break;
                    default:
                        boolean zF02 = xf8.F0(izjVar.d, j14.B(izjVar.b, ((Boolean) izjVar.c.g()).booleanValue()));
                        ArrayList arrayList2 = izjVar.a;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            ((hzj) obj3).a(zF02);
                        }
                        break;
                }
            }
        });
        xf8.F0(pdeVar, j14.B(context, ((Boolean) ikcVar.g()).booleanValue()));
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.a.add((hzj) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.a.remove((hzj) obj);
    }
}
