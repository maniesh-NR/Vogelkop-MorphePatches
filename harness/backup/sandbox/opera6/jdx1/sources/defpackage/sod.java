package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class sod extends Handler {
    public final /* synthetic */ uod a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sod(uod uodVar, Looper looper) {
        super(looper);
        this.a = uodVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        vod vodVar;
        uod uodVar;
        sod sodVar;
        uod uodVar2;
        if (message.what == 1) {
            synchronized (this.a.mLock) {
                vodVar = this.a.mSessionImpl.get();
                uodVar = this.a;
                sodVar = uodVar.mCallbackHandler;
            }
            if (vodVar != null) {
                yod yodVar = (yod) vodVar;
                synchronized (yodVar.d) {
                    uodVar2 = yodVar.i;
                }
                if (uodVar != uodVar2 || sodVar == null) {
                    return;
                }
                this.a.handleMediaPlayPauseIfPendingOnHandler(vodVar, sodVar);
            }
        }
    }
}
