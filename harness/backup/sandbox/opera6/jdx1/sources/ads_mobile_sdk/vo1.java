package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import defpackage.fsg;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class vo1 implements MediationNativeAdCallback {
    public final /* synthetic */ rh0 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ vo1(rh0 rh0Var, byte b) {
        this.b = b;
        this.a = rh0Var;
    }

    public final void onAdClosed() {
        switch (this.b) {
            case 0:
                this.a.b();
                break;
            default:
                this.a.b();
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        switch (this.b) {
            case 0:
                this.a.a();
                break;
            default:
                this.a.a();
                break;
        }
    }

    public final void onAdOpened() {
        switch (this.b) {
            case 0:
                this.a.c();
                break;
            default:
                this.a.c();
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        switch (this.b) {
            case 0:
                this.a.f();
                break;
            default:
                this.a.f();
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
        byte b = this.b;
        byte b2 = 3;
        byte b3 = 1;
        rh0 rh0Var = this.a;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                ae3 ae3VarA = rh0Var.a();
                if (ae3VarA != null) {
                    defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new vd3(ae3VarA, mt5Var, b3), mt5Var, b2), 2);
                    break;
                }
                break;
            default:
                ae3 ae3VarA2 = rh0Var.a();
                if (ae3VarA2 != null) {
                    defpackage.na2.B(ae3VarA2.a, h.a, null, new fsg(new vd3(ae3VarA2, mt5Var, b3), mt5Var, b2), 2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        byte b = this.b;
        byte b2 = 3;
        rh0 rh0Var = this.a;
        mt5 mt5Var = null;
        byte b3 = 2;
        switch (b) {
            case 0:
                ae3 ae3VarA = rh0Var.a();
                if (ae3VarA != null) {
                    defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new vd3(ae3VarA, mt5Var, b3), mt5Var, b2), 2);
                    break;
                }
                break;
            default:
                ae3 ae3VarA2 = rh0Var.a();
                if (ae3VarA2 != null) {
                    defpackage.na2.B(ae3VarA2.a, h.a, null, new fsg(new vd3(ae3VarA2, mt5Var, b3), mt5Var, b2), 2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        byte b = this.b;
        rh0 rh0Var = this.a;
        mt5 mt5Var = null;
        byte b2 = 3;
        switch (b) {
            case 0:
                ae3 ae3VarA = rh0Var.a();
                if (ae3VarA != null) {
                    defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new vd3(ae3VarA, mt5Var, b2), mt5Var, b2), 2);
                    break;
                }
                break;
            default:
                ae3 ae3VarA2 = rh0Var.a();
                if (ae3VarA2 != null) {
                    defpackage.na2.B(ae3VarA2.a, h.a, null, new fsg(new vd3(ae3VarA2, mt5Var, b2), mt5Var, b2), 2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
        byte b = this.b;
        byte b2 = 3;
        byte b3 = 4;
        rh0 rh0Var = this.a;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                ae3 ae3VarA = rh0Var.a();
                if (ae3VarA != null) {
                    defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new vd3(ae3VarA, mt5Var, b3), mt5Var, b2), 2);
                    break;
                }
                break;
            default:
                ae3 ae3VarA2 = rh0Var.a();
                if (ae3VarA2 != null) {
                    defpackage.na2.B(ae3VarA2.a, h.a, null, new fsg(new vd3(ae3VarA2, mt5Var, b3), mt5Var, b2), 2);
                    break;
                }
                break;
        }
    }

    public final void reportAdClicked() {
        switch (this.b) {
            case 0:
                this.a.d();
                break;
            default:
                this.a.d();
                break;
        }
    }

    public final void reportAdImpression() {
        switch (this.b) {
            case 0:
                this.a.e();
                break;
            default:
                this.a.e();
                break;
        }
    }
}
