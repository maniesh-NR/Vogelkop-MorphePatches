package defpackage;

import android.widget.TextSwitcher;

/* loaded from: classes.dex */
public final /* synthetic */ class f49 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g49 b;

    public /* synthetic */ f49(g49 g49Var, byte b) {
        this.a = b;
        this.b = g49Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bh0 bh0Var = null;
        g49 g49Var = this.b;
        switch (b) {
            case 0:
                g49Var.e = null;
                b7k b7kVar = g49Var.d;
                if (b7kVar != null) {
                    ((TextSwitcher) b7kVar.c).showNext();
                    break;
                }
                break;
            default:
                g49Var.requireActivity().W();
                int iOrdinal = g49Var.b.d.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        bh0Var = bh0.b;
                    } else if (iOrdinal == 2) {
                        bh0Var = bh0.c;
                    } else if (iOrdinal != 3) {
                        h9o.p();
                        break;
                    } else {
                        bh0Var = bh0.d;
                    }
                }
                if (bh0Var != null) {
                    g49Var.c.a(bh0Var);
                    break;
                }
                break;
        }
    }
}
