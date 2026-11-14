package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class khd extends ResultReceiver {
    public final /* synthetic */ byte a = 2;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khd(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.b = taskCompletionSource;
    }

    public khd(lhd lhdVar) {
        super(null);
        this.b = new WeakReference(lhdVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public khd(xlo xloVar, Handler handler) {
        super(handler);
        this.b = xloVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        tsa tsaVar = null;
        switch (this.a) {
            case 0:
                lhd lhdVar = (lhd) ((WeakReference) this.b).get();
                if (lhdVar == null || bundle == null) {
                    return;
                }
                synchronized (lhdVar.b) {
                    apd apdVar = lhdVar.e;
                    IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i2 = wod.b;
                    if (binder != null) {
                        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof tsa)) {
                            qsa qsaVar = new qsa();
                            qsaVar.a = binder;
                            tsaVar = qsaVar;
                        } else {
                            tsaVar = (tsa) iInterfaceQueryLocalInterface;
                        }
                    }
                    synchronized (apdVar.a) {
                        try {
                            apdVar.c = tsaVar;
                        } finally {
                        }
                    }
                    apd apdVar2 = lhdVar.e;
                    g2n g2nVarZ = o0g.Z(bundle);
                    synchronized (apdVar2.a) {
                        apdVar2.d = g2nVarZ;
                    }
                    lhdVar.a();
                }
                return;
            case 1:
                xlo xloVar = (xlo) this.b;
                if (i == 1) {
                    xloVar.m.trySetResult(3);
                    return;
                } else if (i == 2) {
                    xloVar.m.trySetResult(2);
                    return;
                } else {
                    if (i == 3) {
                        xloVar.m.trySetResult(1);
                        return;
                    }
                    return;
                }
            default:
                ((TaskCompletionSource) this.b).trySetResult((Object) null);
                return;
        }
    }
}
