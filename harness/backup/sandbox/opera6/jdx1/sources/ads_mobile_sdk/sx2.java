package ads_mobile_sdk;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import defpackage.cwh;
import defpackage.gso;
import defpackage.prb;
import defpackage.ruo;
import defpackage.tdp;
import defpackage.tpo;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class sx2 implements gso {
    public final av2 a;
    public final defpackage.r83 b;
    public final cu2 c;
    public final Context d;
    public final g0 e;
    public final rh0 f;
    public final ab0 g;

    public sx2(av2 av2Var, defpackage.r83 r83Var, cu2 cu2Var, Context context, g0 g0Var, rh0 rh0Var, ab0 ab0Var) {
        this.a = av2Var;
        this.b = r83Var;
        this.c = cu2Var;
        this.d = context;
        this.e = g0Var;
        this.f = rh0Var;
        this.g = ab0Var;
    }

    @Override // defpackage.gso
    public final tdp a(ejp ejpVar) {
        af0 af0Var = (af0) this.g.get();
        af0Var.p = new ruo((ly2) ejpVar, this, (byte) 3);
        return af0Var;
    }

    @Override // defpackage.gso
    public final void a(a2 a2Var, ejp ejpVar, os osVar) throws NoSuchAlgorithmException {
        ly2 ly2Var = (ly2) ejpVar;
        av2 av2Var = this.a;
        av2 av2Var2 = av2.k;
        rh0 rh0Var = this.f;
        cu2 cu2Var = this.c;
        defpackage.r83 r83Var = this.b;
        if (av2Var == av2Var2) {
            cwh cwhVarA = cu2Var.a();
            ly2Var.getClass();
            RtbAdapter rtbAdapter = ly2Var.b;
            String str = a2Var.r;
            prb prbVar = a2Var.c;
            Bundle bundleB = tpo.b(prbVar);
            Bundle bundleA = tpo.a(r83Var, ly2Var.a);
            Context context = this.d;
            boolean zA = cwhVarA.a(context);
            awh awhVar = awh.a;
            bwh bwhVar = bwh.a;
            rtbAdapter.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration(context, str, bundleB, bundleA, zA, (Location) null, -1, -1, tpo.d(prbVar, cwhVarA), ""), new ap1(rh0Var, osVar, new ey2(ly2Var, (byte) 5), (byte) 5));
            return;
        }
        Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        Context context2 = contextB;
        cwh cwhVarA2 = cu2Var.a();
        ly2Var.getClass();
        RtbAdapter rtbAdapter2 = ly2Var.b;
        String str2 = a2Var.r;
        prb prbVar2 = a2Var.c;
        Bundle bundleB2 = tpo.b(prbVar2);
        Bundle bundleA2 = tpo.a(r83Var, ly2Var.a);
        boolean zA2 = cwhVarA2.a(context2);
        awh awhVar2 = awh.a;
        bwh bwhVar2 = bwh.a;
        rtbAdapter2.loadRtbRewardedAd(new MediationRewardedAdConfiguration(context2, str2, bundleB2, bundleA2, zA2, (Location) null, -1, -1, tpo.d(prbVar2, cwhVarA2), ""), new ap1(rh0Var, osVar, new ey2(ly2Var, (byte) 6), (byte) 5));
    }
}
