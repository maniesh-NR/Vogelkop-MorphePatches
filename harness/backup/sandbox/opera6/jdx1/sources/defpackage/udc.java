package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class udc extends Service implements ndc {
    public final p8f a = new p8f(this);

    @Override // defpackage.ndc
    public final tcc getLifecycle() {
        return (qdc) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        p8f p8fVar = this.a;
        p8fVar.getClass();
        p8fVar.z(occ.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        p8f p8fVar = this.a;
        p8fVar.getClass();
        p8fVar.z(occ.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        p8f p8fVar = this.a;
        p8fVar.getClass();
        p8fVar.z(occ.ON_STOP);
        p8fVar.z(occ.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        p8f p8fVar = this.a;
        p8fVar.getClass();
        p8fVar.z(occ.ON_START);
        super.onStart(intent, i);
    }
}
