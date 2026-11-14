package ads_mobile_sdk;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class o01 implements jma, InitializationCompleteCallback {
    public final /* synthetic */ nh4 a;
    public final /* synthetic */ AtomicBoolean b;

    public /* synthetic */ o01(AtomicBoolean atomicBoolean, nh4 nh4Var) {
        this.a = nh4Var;
        this.b = atomicBoolean;
    }

    public final void onDismissed(Bundle bundle) {
        nh4 nh4Var = this.a;
        if ((nh4Var.r() instanceof c0f) && this.b.compareAndSet(false, true)) {
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith(Unit.a);
        }
    }

    public final void onError(Bundle bundle) {
        nh4 nh4Var = this.a;
        if ((nh4Var.r() instanceof c0f) && this.b.compareAndSet(false, true)) {
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith(new q0i(new Exception("HSDP open failed: " + bundle)));
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        if (this.b.getAndSet(true)) {
            return;
        }
        p0i p0iVar = t0i.b;
        this.a.resumeWith(new ev0(str, ae1.m));
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        if (this.b.getAndSet(true)) {
            return;
        }
        p0i p0iVar = t0i.b;
        this.a.resumeWith(new hv0(Unit.a));
    }

    public final void onShown(Bundle bundle) {
        nh4 nh4Var = this.a;
        if ((nh4Var.r() instanceof c0f) && this.b.compareAndSet(false, true)) {
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith(Unit.a);
        }
    }
}
