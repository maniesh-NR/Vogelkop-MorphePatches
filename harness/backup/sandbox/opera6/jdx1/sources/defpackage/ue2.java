package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class ue2 extends Handler {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue2(Looper looper, Object obj, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue2(fmd fmdVar) {
        super(Looper.getMainLooper());
        this.a = (byte) 6;
        this.b = fmdVar;
    }

    public /* synthetic */ ue2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue2(Object obj, Looper looper, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue2(yqa yqaVar, Looper looper, LinkedBlockingQueue linkedBlockingQueue) {
        super(looper);
        this.a = (byte) 5;
        this.b = linkedBlockingQueue;
    }

    private final void a(Message message) {
        xod xodVar;
        r22 r22Var;
        ue2 ue2Var;
        r22 r22Var2;
        if (message.what == 1) {
            synchronized (((r22) this.b).a) {
                xodVar = (xod) ((WeakReference) ((r22) this.b).c).get();
                r22Var = (r22) this.b;
                ue2Var = (ue2) r22Var.d;
            }
            if (xodVar != null) {
                synchronized (xodVar.d) {
                    r22Var2 = xodVar.l;
                }
                if (r22Var != r22Var2 || ue2Var == null) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x05da  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r19) throws org.json.JSONException, android.media.MediaCodec.CryptoException {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue2.handleMessage(android.os.Message):void");
    }
}
