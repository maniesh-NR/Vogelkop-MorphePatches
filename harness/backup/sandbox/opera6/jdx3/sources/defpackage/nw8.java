package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class nw8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xw8 b;

    public /* synthetic */ nw8(xw8 xw8Var, byte b) {
        this.a = b;
        this.b = xw8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object next;
        byte b = this.a;
        xw8 xw8Var = this.b;
        switch (b) {
            case 0:
                xw8Var.e(0, false);
                break;
            default:
                f92 f92Var = xw8Var.j;
                Object obj = xw8Var.l;
                if (!f92Var.d().k(obj)) {
                    Iterator it = nb6.R(xw8Var.h.a).iterator();
                    it.getClass();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((ja2) next) instanceof j82) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    j82 j82Var = (j82) next;
                    f92Var.e(obj, j82Var != null ? ((pue) j82Var).c : null, xw8Var.k);
                    break;
                }
                break;
        }
    }
}
