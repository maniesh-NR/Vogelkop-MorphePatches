package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final /* synthetic */ class re2 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bhd b;

    public /* synthetic */ re2(jgd jgdVar, bhd bhdVar, byte b) {
        this.a = b;
        this.b = bhdVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        byte b = this.a;
        bhd bhdVar = this.b;
        switch (b) {
            case 0:
                Handler handler = bhdVar.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    bhdVar.a(j);
                    break;
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                Handler handler2 = bhdVar.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    bhdVar.a(j);
                    break;
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }
}
