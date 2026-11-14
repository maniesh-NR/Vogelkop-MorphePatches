package ads_mobile_sdk;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class uu0 extends kotlin.coroutines.a implements ex5 {
    public final ah3 a;

    public uu0(ah3 ah3Var) {
        super(psp.b);
        this.a = ah3Var;
    }

    public final void handleException(Throwable th, CoroutineContext coroutineContext) {
        vr3 vr3Var = xu0.a;
        xu0.c("Uncaught exception on context " + coroutineContext + ": " + th, null);
        th.printStackTrace();
        try {
            this.a.b(th);
        } catch (Throwable th2) {
            vr3 vr3Var2 = xu0.a;
            xu0.c("Failed to report untrapped exception: " + th2, null);
        }
    }
}
