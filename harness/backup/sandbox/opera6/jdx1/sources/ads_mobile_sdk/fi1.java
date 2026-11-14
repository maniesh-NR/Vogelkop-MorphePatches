package ads_mobile_sdk;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import defpackage.cwh;
import defpackage.gso;
import defpackage.l3p;
import defpackage.n9f;
import defpackage.prb;
import defpackage.tdp;
import defpackage.tpo;
import defpackage.z1m;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class fi1 implements gso {
    public final defpackage.r83 a;
    public final cu2 b;
    public final Context c;
    public final g0 d;
    public final rh0 e;
    public final ab0 f;

    public fi1(defpackage.r83 r83Var, cu2 cu2Var, Context context, g0 g0Var, rh0 rh0Var, ab0 ab0Var) {
        this.a = r83Var;
        this.b = cu2Var;
        this.c = context;
        this.d = g0Var;
        this.e = rh0Var;
        this.f = ab0Var;
    }

    @Override // defpackage.gso
    public final tdp a(ejp ejpVar) {
        final z42 z42Var = (z42) ejpVar;
        af0 af0Var = (af0) this.f.get();
        af0Var.p = new l3p() { // from class: uzo
            @Override // defpackage.l3p
            public final void a() {
                MediationInterstitialAdapter mediationInterstitialAdapter = z42Var.d;
                if (mediationInterstitialAdapter == null) {
                    mediationInterstitialAdapter = null;
                }
                mediationInterstitialAdapter.showInterstitial();
            }
        };
        return af0Var;
    }

    @Override // defpackage.gso
    public final void a(a2 a2Var, ejp ejpVar, os osVar) throws NoSuchAlgorithmException {
        z42 z42Var = (z42) ejpVar;
        Context contextB = this.d.b();
        if (contextB == null) {
            contextB = this.c;
        }
        Context context = contextB;
        cwh cwhVarA = this.b.a();
        prb prbVar = a2Var.c;
        MediationAdapter mediationAdapter = z42Var.a;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String canonicalName = mediationAdapter.getClass().getCanonicalName();
            String canonicalName2 = MediationInterstitialAdapter.class.getCanonicalName();
            osVar.a(new AdError(0, sko.n(z1m.n("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), mediationAdapter.getClass().getCanonicalName(), " implement ", MediationInterstitialAdapter.class.getCanonicalName(), "?"), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
            return;
        }
        defpackage.r83 r83Var = this.a;
        HashSet hashSet = r83Var.e;
        boolean zA = cwhVarA.a(context);
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        ((MediationInterstitialAdapter) mediationAdapter).requestInterstitialAd(context, new v42(this.e, osVar, z42Var), tpo.b(prbVar), new n9f(hashSet, zA, -1, -1, tpo.d(prbVar, cwhVarA)), tpo.a(r83Var, mediationAdapter));
    }
}
