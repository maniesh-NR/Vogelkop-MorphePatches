package ads_mobile_sdk;

import android.os.SystemClock;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import defpackage.cs5;
import defpackage.mip;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class xy2 implements SignalCallbacks {
    public final long a;
    public final mip b;
    public final nh4 c;
    public final dy2 d;
    public final AtomicBoolean e;

    public xy2(String str, ly2 ly2Var, long j, mip mipVar, nh4 nh4Var) {
        this.a = j;
        this.b = mipVar;
        this.c = nh4Var;
        Adapter adapter = ly2Var.a;
        this.d = new dy2(str, adapter.getVersionInfo().toString(), adapter.getSDKVersionInfo().toString(), null, null, 120);
        this.e = new AtomicBoolean(false);
    }

    public final void a(String str) {
        if (this.e.getAndSet(true)) {
            return;
        }
        dy2 dy2Var = this.d;
        dy2Var.signalErrorCode = 2;
        on7 on7Var = pn7.b;
        this.b.getClass();
        dy2Var.latency = Long.valueOf(pn7.f(pn7.l(cs5.y0(SystemClock.elapsedRealtime(), un7.d), this.a)));
        dy2Var.signalErrorMessage = str;
        p0i p0iVar = t0i.b;
        this.c.resumeWith(dy2Var);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        a(adError.getMessage());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        a(str);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        if (this.e.getAndSet(true)) {
            return;
        }
        dy2 dy2Var = this.d;
        dy2Var.signals = str;
        dy2Var.signalErrorCode = 0;
        on7 on7Var = pn7.b;
        this.b.getClass();
        dy2Var.latency = Long.valueOf(pn7.f(pn7.l(cs5.y0(SystemClock.elapsedRealtime(), un7.d), this.a)));
        p0i p0iVar = t0i.b;
        this.c.resumeWith(dy2Var);
    }
}
