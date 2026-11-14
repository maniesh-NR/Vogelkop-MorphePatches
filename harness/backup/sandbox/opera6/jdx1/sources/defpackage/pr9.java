package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public interface pr9 extends f99 {
    static /* synthetic */ f99 a(pr9 pr9Var, dx5 dx5Var, int i, h04 h04Var, int i2) {
        if ((i2 & 1) != 0) {
            dx5Var = h.a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            h04Var = h04.a;
        }
        return pr9Var.b(dx5Var, i, h04Var);
    }

    f99 b(CoroutineContext coroutineContext, int i, h04 h04Var);
}
