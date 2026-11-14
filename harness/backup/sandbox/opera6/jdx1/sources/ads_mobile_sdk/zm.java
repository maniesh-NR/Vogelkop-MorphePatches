package ads_mobile_sdk;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import defpackage.cwh;
import defpackage.fq;
import defpackage.gso;
import defpackage.llp;
import defpackage.prb;
import defpackage.rep;
import defpackage.tdp;
import defpackage.tpo;
import defpackage.yxo;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class zm implements gso {
    public final defpackage.r83 a;
    public final defpackage.v23 b;
    public final cu2 c;
    public final Context d;
    public final g0 e;
    public final rh0 f;
    public final ab0 g;
    public final llp h;

    public zm(defpackage.r83 r83Var, defpackage.v23 v23Var, cu2 cu2Var, Context context, g0 g0Var, rh0 rh0Var, ab0 ab0Var, llp llpVar) {
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
        View view = ((ly2) ejpVar).c;
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
        ly2 ly2Var = (ly2) ejpVar;
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
        ly2Var.getClass();
        RtbAdapter rtbAdapter = ly2Var.b;
        String str = a2Var.r;
        prb prbVar = a2Var.c;
        Bundle bundleB = tpo.b(prbVar);
        Bundle bundleA = tpo.a(this.a, ly2Var.a);
        boolean zA = cwhVarA.a(context);
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        String strD = tpo.d(prbVar, cwhVarA);
        int i = fqVarL.a;
        int i2 = fqVarL.b;
        rtbAdapter.loadRtbBannerAd(new MediationBannerAdConfiguration(context, str, bundleB, bundleA, zA, (Location) null, -1, -1, strD, new AdSize(i, i2, fqVarL.f, fqVarL.c, fqVarL.d, i2), ""), new ap1(this.f, osVar, new ey2(ly2Var, (byte) 1), (byte) 2));
    }

    @Override // defpackage.gso
    public final void a(rep repVar) {
        ((yxo) ((ve0) repVar).P.get()).getClass();
    }
}
