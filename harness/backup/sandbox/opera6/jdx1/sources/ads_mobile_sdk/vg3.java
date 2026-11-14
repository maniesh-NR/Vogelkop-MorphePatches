package ads_mobile_sdk;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class vg3 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ ah3 a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;

    public vg3(ah3 ah3Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = ah3Var;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        try {
            this.a.a(th);
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable unused) {
            if (uncaughtExceptionHandler == null) {
                return;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
