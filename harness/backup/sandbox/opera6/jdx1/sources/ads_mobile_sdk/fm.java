package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import defpackage.cwh;
import defpackage.fq;
import defpackage.gso;
import defpackage.llp;
import defpackage.n9f;
import defpackage.prb;
import defpackage.rep;
import defpackage.tdp;
import defpackage.tpo;
import defpackage.yxo;
import defpackage.z1m;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class fm implements gso {
    public final defpackage.r83 a;
    public final defpackage.v23 b;
    public final cu2 c;
    public final Context d;
    public final g0 e;
    public final rh0 f;
    public final ab0 g;
    public final llp h;

    public fm(defpackage.r83 r83Var, defpackage.v23 v23Var, cu2 cu2Var, Context context, g0 g0Var, rh0 rh0Var, ab0 ab0Var, llp llpVar) {
        this.a = r83Var;
        this.b = v23Var;
        this.c = cu2Var;
        this.d = context;
        this.e = g0Var;
        this.f = rh0Var;
        this.g = ab0Var;
        this.h = llpVar;
    }

    @Override // defpackage.gso
    public final tdp a(ejp ejpVar) {
        ue0 ue0Var = (ue0) this.g.get();
        View view = ((z42) ejpVar).b;
        if (view == null) {
            view = null;
        }
        view.getClass();
        ue0Var.q = view;
        llp llpVar = this.h;
        llpVar.getClass();
        ue0Var.p = llpVar;
        return ue0Var;
    }

    @Override // defpackage.gso
    public final void a(a2 a2Var, ejp ejpVar, os osVar) throws NoSuchAlgorithmException {
        z42 z42Var = (z42) ejpVar;
        fq fqVarL = this.b.l();
        if (fqVarL == null) {
            osVar.a(new AdError(0, "No AdSize available for banner mediation. This may happen when a server-to-server ad response triggers mediation but no AdSize was provided in the signal request.", AdError.GOOGLE_MOBILE_ADS_DOMAIN));
            return;
        }
        Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        Context context = contextB;
        cwh cwhVarA = this.c.a();
        prb prbVar = a2Var.c;
        MediationAdapter mediationAdapter = z42Var.a;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String canonicalName = mediationAdapter.getClass().getCanonicalName();
            String canonicalName2 = MediationBannerAdapter.class.getCanonicalName();
            osVar.a(new AdError(0, sko.n(z1m.n("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), mediationAdapter.getClass().getCanonicalName(), " implement ", MediationBannerAdapter.class.getCanonicalName(), "?"), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
            return;
        }
        defpackage.r83 r83Var = this.a;
        HashSet hashSet = r83Var.e;
        boolean zA = cwhVarA.a(context);
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        n9f n9fVar = new n9f(hashSet, zA, -1, -1, tpo.d(prbVar, cwhVarA));
        v42 v42Var = new v42(this.f, osVar, z42Var);
        Bundle bundleB = tpo.b(prbVar);
        int i = fqVarL.a;
        int i2 = fqVarL.b;
        ((MediationBannerAdapter) mediationAdapter).requestBannerAd(context, v42Var, bundleB, new AdSize(i, i2, fqVarL.f, fqVarL.c, fqVarL.d, i2), n9fVar, tpo.a(r83Var, mediationAdapter));
    }

    @Override // defpackage.gso
    public final void a(rep repVar) {
        ((yxo) ((ve0) repVar).P.get()).getClass();
    }
}
