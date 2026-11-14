package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class va7 implements Executor {
    public final dx5 a;

    public va7(dx5 dx5Var) {
        this.a = dx5Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws ha7 {
        h hVar = h.a;
        dx5 dx5Var = this.a;
        if (c26.M(dx5Var, hVar)) {
            c26.L(dx5Var, hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
