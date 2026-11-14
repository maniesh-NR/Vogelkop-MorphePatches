package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class ph9 {
    public static final vx5 c = new vx5(psp.b, (byte) 1);
    public final d5o a;
    public final a64 b;

    public ph9(d5o d5oVar) {
        h hVar = h.a;
        this.a = d5oVar;
        d7a d7aVar = wa7.a;
        vx5 vx5Var = c;
        vx5Var.getClass();
        CoroutineContext coroutineContextPlus = e.a(vx5Var, d7aVar).plus(hVar);
        hVar.getClass();
        this.b = sgb.b(coroutineContextPlus.plus(new csk((unb) null)));
    }
}
