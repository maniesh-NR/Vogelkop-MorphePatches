package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* loaded from: classes.dex */
public final class eth extends a implements ex5 {
    public final /* synthetic */ di5 b;
    public final /* synthetic */ fth c;

    /* JADX WARN: Illegal instructions before constructor call */
    public eth(di5 di5Var, fth fthVar) {
        psp pspVar = psp.b;
        this.b = di5Var;
        this.c = fthVar;
        super(pspVar);
    }

    public final void handleException(Throwable th, CoroutineContext coroutineContext) throws Throwable {
        di5 di5Var = this.b;
        fth fthVar = this.c;
        phj.A0(th, new gb3(di5Var, fthVar, (byte) 17));
        ex5 ex5Var = fthVar.a.get(psp.b);
        if (ex5Var == null) {
            throw th;
        }
        ex5Var.handleException(th, coroutineContext);
    }
}
