package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class ze4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cf4 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ ze4(cf4 cf4Var, List list, int i, byte b) {
        this.a = b;
        this.b = cf4Var;
        this.c = list;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                cf4 cf4Var = this.b;
                cf4Var.a.execute(new ze4(cf4Var, this.c, this.d, b));
                break;
            default:
                cf4 cf4Var2 = this.b;
                List list = this.c;
                int i = this.d;
                if (cf4Var2.l.get() && Intrinsics.a(cf4Var2.k, list)) {
                    xf2 xf2Var = cf4Var2.h;
                    if (xf2Var != null) {
                        xf2Var.b();
                    }
                    cf4Var2.d(i - 1, list);
                    break;
                }
                break;
        }
    }
}
