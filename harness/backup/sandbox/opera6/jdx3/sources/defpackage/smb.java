package defpackage;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class smb implements Thread.UncaughtExceptionHandler {
    public final ks3 a;
    public final Thread.UncaughtExceptionHandler b;

    public smb(ks3 ks3Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = ks3Var;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        try {
            this.a.F(th);
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable unused) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
