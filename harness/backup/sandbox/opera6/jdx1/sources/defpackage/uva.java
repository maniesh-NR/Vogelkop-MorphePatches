package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final /* synthetic */ class uva implements bk9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uva(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.bk9
    public final void a(ck9 ck9Var) {
        nbl nblVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wva wvaVar = (wva) ((WeakReference) ((vva) obj).e).get();
                if (wvaVar != null) {
                    wvaVar.v.execute(new ld9(wvaVar, (byte) 22));
                    return;
                }
                return;
            default:
                bl9 bl9Var = (bl9) obj;
                synchronized (bl9Var.c) {
                    int i = bl9Var.a - 1;
                    bl9Var.a = i;
                    if (bl9Var.b && i == 0) {
                        bl9Var.close();
                    }
                    nblVar = (nbl) bl9Var.f;
                }
                if (nblVar != null) {
                    nblVar.a(ck9Var);
                    return;
                }
                return;
        }
    }
}
