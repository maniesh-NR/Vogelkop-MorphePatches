package ads_mobile_sdk;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import defpackage.ajp;
import defpackage.nsd;
import defpackage.vzo;
import defpackage.w5p;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class os implements MediationNativeListener {
    public Object a;
    public Object b;
    public Object c;

    public os(cd3 cd3Var, AtomicBoolean atomicBoolean, nh4 nh4Var) {
        this.a = atomicBoolean;
        this.b = nh4Var;
        this.c = cd3Var;
    }

    public /* synthetic */ os(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final void a() {
        if (((AtomicBoolean) this.a).getAndSet(true)) {
            return;
        }
        nh4 nh4Var = (nh4) this.b;
        p0i p0iVar = t0i.b;
        nh4Var.resumeWith(new hv0(Unit.a));
    }

    public final void a(v52 v52Var) {
        v52Var.a = this;
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        arrayDeque.add(v52Var);
        if (((v52) this.c) == null) {
            v52 v52Var2 = (v52) arrayDeque.poll();
            this.c = v52Var2;
            if (v52Var2 != null) {
                v52Var2.executeOnExecutor((ThreadPoolExecutor) this.a, new Object[0]);
            }
        }
    }

    public final void a(View view) {
        if (((ajp) this.b) == null) {
            this.b = new ajp();
            view.getViewTreeObserver().addOnWindowFocusChangeListener((ajp) this.b);
            if (view.hasWindowFocus()) {
                w5p.a();
                m6 m6Var = m6.d;
                boolean zA = m6Var.a();
                if (m6Var.c != zA) {
                    m6Var.c = zA;
                    if (m6Var.b) {
                        m6Var.a(zA);
                        vzo vzoVar = (vzo) m6Var.e;
                        if (vzoVar != null) {
                            vzoVar.a(zA);
                        }
                    }
                }
            }
        }
    }

    public final void a(AdError adError) {
        if (((AtomicBoolean) this.a).getAndSet(true)) {
            return;
        }
        nh4 nh4Var = (nh4) this.b;
        p0i p0iVar = t0i.b;
        nh4Var.resumeWith(new dv0(new nsd(adError.getCode(), adError.getMessage(), adError.getDomain())));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        ((rh0) this.c).d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        ((rh0) this.c).b();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        os osVar = (os) this.b;
        osVar.a(new AdError(i, ((cd3) osVar.c).a(i), AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        ((os) this.b).a(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        ((rh0) this.c).e();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        ((rh0) this.c).a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        ((cno) this.a).invoke(unifiedNativeAdMapper);
        ((os) this.b).a();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        ((rh0) this.c).c();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        ((rh0) this.c).a();
    }
}
