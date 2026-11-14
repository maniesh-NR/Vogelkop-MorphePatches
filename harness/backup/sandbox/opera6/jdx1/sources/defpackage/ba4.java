package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ba4 implements l99 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fa4 b;

    public /* synthetic */ ba4(fa4 fa4Var, byte b) {
        this.a = b;
        this.b = fa4Var;
    }

    public final Object emit(Object obj, mt5 mt5Var) {
        byte b = this.a;
        fa4 fa4Var = this.b;
        switch (b) {
            case 0:
                ag4 ag4Var = (ag4) obj;
                fd4 fd4Var = fa4Var.c;
                if (!(ag4Var instanceof wf4)) {
                    if (ag4Var instanceof yf4) {
                        if (!Intrinsics.a(((yf4) ag4Var).a, fd4Var.a)) {
                            qp2.n("Check failed.");
                            break;
                        } else {
                            fa4Var.d(ag4Var);
                        }
                    }
                } else if (!Intrinsics.a(((wf4) ag4Var).a, fd4Var.a)) {
                    qp2.n("Check failed.");
                    break;
                } else {
                    fa4Var.d(ag4Var);
                }
                break;
            default:
                fa4Var.d(xf4.a);
                break;
        }
        return Unit.a;
    }
}
