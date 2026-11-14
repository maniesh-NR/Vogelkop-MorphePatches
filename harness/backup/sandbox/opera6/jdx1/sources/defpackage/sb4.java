package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class sb4 extends rb4 {
    public final /* synthetic */ byte a;
    public final Object b;

    public sb4(jan janVar) {
        this.a = (byte) 3;
        this.b = new WeakReference(janVar);
    }

    public /* synthetic */ sb4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public sb4(List list) {
        this.a = (byte) 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rb4 rb4Var = (rb4) it.next();
            if (!(rb4Var instanceof tb4)) {
                ((ArrayList) this.b).add(rb4Var);
            }
        }
    }

    @Override // defpackage.rb4
    public final void a(int i) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((rb4) obj).a(i);
                }
                break;
        }
    }

    @Override // defpackage.rb4
    public final void b(int i, yb4 yb4Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((rb4) obj).b(i, yb4Var);
                }
                return;
            case 1:
            default:
                return;
            case 2:
                txd txdVar = (txd) this.b;
                synchronized (txdVar.a) {
                    if (txdVar.e) {
                        return;
                    }
                    txdVar.i.put(yb4Var.e(), new zb4(yb4Var));
                    txdVar.f();
                    return;
                }
            case 3:
                jan janVar = (jan) ((WeakReference) this.b).get();
                if (janVar != null) {
                    Iterator it = janVar.a.iterator();
                    while (it.hasNext()) {
                        u3j u3jVar = ((qrm) it.next()).q;
                        Iterator it2 = u3jVar.g.d.iterator();
                        while (it2.hasNext()) {
                            ((rb4) it2.next()).b(i, new qq8(-1L, yb4Var, u3jVar.g.e));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.rb4
    public final void c(int i, ujp ujpVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((rb4) obj).c(i, ujpVar);
                }
                break;
        }
    }

    @Override // defpackage.rb4
    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((rb4) obj).d(i, i2);
                }
                break;
            case 1:
                ((g7a) x7d.l()).execute(new br(this, i2, (byte) 7));
                break;
        }
    }

    @Override // defpackage.rb4
    public final void e(int i) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((rb4) obj).e(i);
                }
                break;
            case 1:
                ((g7a) x7d.l()).execute(new lb4(this, (byte) 2));
                break;
        }
    }
}
