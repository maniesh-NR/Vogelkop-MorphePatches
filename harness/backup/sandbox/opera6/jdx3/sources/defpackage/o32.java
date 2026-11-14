package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
public final /* synthetic */ class o32 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ o32(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(-3);
                runnable.run();
                break;
        }
    }
}
