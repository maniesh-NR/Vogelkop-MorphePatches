package defpackage;

import com.opera.android.bookmarks.b;
import com.opera.android.bookmarks.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class hn3 implements ql3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hn3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(b bVar, c cVar) {
    }

    private final void c(b bVar, c cVar) {
    }

    private final void f(b bVar, c cVar, c cVar2) {
    }

    private final void g(Collection collection, ml3 ml3Var, ml3 ml3Var2) {
    }

    @Override // defpackage.ql3
    public final void A(al3 al3Var, ml3 ml3Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ne5 ne5Var = (ne5) obj;
                ((ArrayList) ne5Var.b).add(al3Var);
                if (ne5Var.t(al3Var, (String) ne5Var.c)) {
                    ((ArrayList) ne5Var.d).add(al3Var);
                    break;
                }
                break;
            default:
                ((in3) obj).a();
                break;
        }
    }

    @Override // defpackage.ql3
    public final void D(Collection collection, ml3 ml3Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ne5 ne5Var = (ne5) obj;
                ((ArrayList) ne5Var.b).removeAll(collection);
                ((ArrayList) ne5Var.d).removeAll(collection);
                break;
            default:
                in3 in3Var = (in3) obj;
                in3Var.b.removeAll(collection);
                in3Var.a();
                break;
        }
    }

    @Override // defpackage.ql3
    public final void a(b bVar, c cVar, c cVar2) {
        switch (this.a) {
            case 0:
                ((ne5) this.b).U(bVar, false);
                break;
        }
    }

    @Override // defpackage.ql3
    public final void d(Collection collection, ml3 ml3Var, ml3 ml3Var2) {
        switch (this.a) {
            case 0:
                ne5 ne5Var = (ne5) this.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ne5Var.U((al3) it.next(), false);
                }
                break;
        }
    }

    @Override // defpackage.ql3
    public final void e(b bVar, c cVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ne5) obj).U(bVar, true);
                break;
            default:
                ((in3) obj).a();
                break;
        }
    }

    @Override // defpackage.ql3
    public final void m() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ne5 ne5Var = (ne5) obj;
                ((ArrayList) ne5Var.b).clear();
                ((ArrayList) ne5Var.d).clear();
                break;
            default:
                in3 in3Var = (in3) obj;
                in3Var.b.clear();
                in3Var.a();
                break;
        }
    }

    @Override // defpackage.ql3
    public final void s(b bVar, c cVar) {
        byte b = this.a;
    }

    @Override // defpackage.ql3
    public final void y(b bVar, c cVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ne5 ne5Var = (ne5) obj;
                ((ArrayList) ne5Var.b).remove(bVar);
                ((ArrayList) ne5Var.d).remove(bVar);
                break;
            default:
                in3 in3Var = (in3) obj;
                in3Var.b.remove(bVar);
                in3Var.a();
                break;
        }
    }
}
