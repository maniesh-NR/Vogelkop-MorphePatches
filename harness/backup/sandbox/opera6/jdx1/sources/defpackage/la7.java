package defpackage;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class la7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Message b;

    public /* synthetic */ la7(Handler handler, Message message, byte b) {
        this.a = b;
        this.b = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Message message = this.b;
        switch (b) {
            case 0:
                throw new AssertionError("Unknown handler message received: " + message.what);
            default:
                throw new AssertionError("Unhandled stats message." + message.what);
        }
    }
}
