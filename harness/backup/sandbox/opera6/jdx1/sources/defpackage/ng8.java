package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* loaded from: classes.dex */
public final class ng8 implements Executor {
    public final /* synthetic */ byte a;
    public final Object b;

    public ng8() {
        this.a = (byte) 0;
        this.b = new Handler(Looper.getMainLooper());
    }

    public ng8(Executor executor) {
        this.a = (byte) 1;
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Handler) obj).post(runnable);
                return;
            default:
                iv ivVar = new iv((Object) runnable, (Runnable) Thread.currentThread(), (byte) 8);
                ((Executor) obj).execute(ivVar);
                InlineExecutionProhibitedException inlineExecutionProhibitedException = (InlineExecutionProhibitedException) ivVar.d;
                if (inlineExecutionProhibitedException != null) {
                    throw inlineExecutionProhibitedException;
                }
                ivVar.c = null;
                return;
        }
    }
}
