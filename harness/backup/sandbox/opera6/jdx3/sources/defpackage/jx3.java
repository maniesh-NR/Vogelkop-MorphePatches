package defpackage;

import android.os.Trace;

/* loaded from: classes.dex */
public final /* synthetic */ class jx3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ jx3(String str, Runnable runnable, byte b) {
        this.a = b;
        this.b = str;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                i7f i7fVar = lx3.a;
                g7f g7fVarC = u35.c(i7fVar, i7fVar);
                while (g7fVarC.hasNext()) {
                    ((kx3) g7fVarC.next()).b(str);
                }
                runnable.run();
                return;
            case 1:
                lni.h("Cronet JavaUrlRequest#executeOnExecutor " + str + " running callback");
                try {
                    runnable.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                lni.h("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + str + " running callback");
                try {
                    runnable.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
