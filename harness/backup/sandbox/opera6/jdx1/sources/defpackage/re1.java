package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class re1 implements Choreographer.FrameCallback {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((c4) obj).run();
                break;
            default:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new pn((Context) obj, (byte) 5), new Random().nextInt(1000) + 5000);
                break;
        }
    }
}
