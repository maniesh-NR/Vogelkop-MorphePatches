package defpackage;

import ads_mobile_sdk.av2;
import ads_mobile_sdk.ko1;
import ads_mobile_sdk.ly2;
import ads_mobile_sdk.z42;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes.dex */
public final class nap {
    public static ejp a(nap napVar, String str, boolean z, av2 av2Var, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) == 0;
        if ((i & 8) != 0) {
            av2Var = av2.d;
        }
        napVar.getClass();
        try {
            Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            if (!z) {
                if (objNewInstance instanceof MediationAdapter) {
                    MediationAdapter mediationAdapter = (MediationAdapter) objNewInstance;
                    if (((av2Var == av2.f && (mediationAdapter instanceof MediationBannerAdapter)) || ((av2Var == av2.h && (mediationAdapter instanceof MediationInterstitialAdapter)) || (av2Var == av2.i && (mediationAdapter instanceof MediationNativeAdapter)))) && !z2) {
                        return new z42((MediationAdapter) objNewInstance);
                    }
                }
                if (objNewInstance instanceof Adapter) {
                    return new ko1((Adapter) objNewInstance);
                }
            } else if (objNewInstance instanceof RtbAdapter) {
                return new ly2((RtbAdapter) objNewInstance);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
