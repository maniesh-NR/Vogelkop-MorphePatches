package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final /* synthetic */ class we9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bf9 b;

    public /* synthetic */ we9(bf9 bf9Var, byte b) {
        this.a = b;
        this.b = bf9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        bf9 bf9Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = bf9Var.u;
                if (!arrayList.isEmpty()) {
                    bf9Var.O(true);
                    if (!arrayList.isEmpty()) {
                        vml.d(new we9(bf9Var, b2), 10000L);
                        break;
                    } else {
                        bf9Var.v = false;
                        break;
                    }
                } else {
                    bf9Var.v = false;
                    break;
                }
            case 1:
                bf9Var.n = null;
                bf9Var.k();
                if (!bf9Var.g.isEmpty()) {
                    bf9Var.C();
                    break;
                }
                break;
            case 2:
                bf9Var.J(Collections.EMPTY_LIST);
                bf9Var.z();
                break;
            case 3:
                bf9Var.O(true);
                h7f h7fVar = bf9Var.i;
                g7f g7fVarH = am2.h(h7fVar, h7fVar);
                while (g7fVarH.hasNext()) {
                    ((hxl) g7fVarH.next()).i();
                }
                break;
            case 4:
                bf9Var.O(false);
                break;
            default:
                bf9Var.B();
                break;
        }
    }
}
