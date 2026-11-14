package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
public final class gwh extends Thread {
    public final byte a;

    public gwh(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = (byte) 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
