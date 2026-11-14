package defpackage;

import android.os.Process;
import android.os.StrictMode;

/* loaded from: classes.dex */
public final class uy9 extends Thread {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy9(okj okjVar) {
        super("ExoPlayer:SimpleDecoder");
        this.b = okjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy9(vy9 vy9Var, Runnable runnable, String str) {
        super(runnable, str);
        this.b = vy9Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Process.setThreadPriority(9);
                if (((vy9) obj).b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            default:
                do {
                    try {
                    } catch (InterruptedException e) {
                        h9o.o(e);
                    }
                } while (((okj) obj).f());
        }
    }
}
