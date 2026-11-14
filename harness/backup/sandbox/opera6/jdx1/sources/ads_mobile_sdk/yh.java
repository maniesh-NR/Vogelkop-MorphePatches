package ads_mobile_sdk;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import defpackage.cwh;
import defpackage.gso;
import defpackage.prb;
import defpackage.ruo;
import defpackage.tdp;
import defpackage.tpo;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class yh implements gso {
    public final defpackage.r83 a;
    public final cu2 b;
    public final Context c;
    public final g0 d;
    public final rh0 e;
    public final ab0 f;

    public yh(defpackage.r83 r83Var, cu2 cu2Var, Context context, g0 g0Var, rh0 rh0Var, ab0 ab0Var) {
        this.a = r83Var;
        this.b = cu2Var;
        this.c = context;
        this.d = g0Var;
        this.e = rh0Var;
        this.f = ab0Var;
    }

    @Override // defpackage.gso
    public final tdp a(ejp ejpVar) {
        af0 af0Var = (af0) this.f.get();
        af0Var.p = new ruo((ly2) ejpVar, this, (byte) 5);
        return af0Var;
    }

    @Override // defpackage.gso
    public final void a(a2 a2Var, ejp ejpVar, os osVar) throws NoSuchAlgorithmException {
        ly2 ly2Var = (ly2) ejpVar;
        Context contextB = this.d.b();
        if (contextB == null) {
            contextB = this.c;
        }
        Context context = contextB;
        cwh cwhVarA = this.b.a();
        ly2Var.getClass();
        RtbAdapter rtbAdapter = ly2Var.b;
        String str = a2Var.r;
        prb prbVar = a2Var.c;
        Bundle bundleB = tpo.b(prbVar);
        Bundle bundleA = tpo.a(this.a, ly2Var.a);
        boolean zA = cwhVarA.a(context);
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        rtbAdapter.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration(context, str, bundleB, bundleA, zA, (Location) null, -1, -1, tpo.d(prbVar, cwhVarA), ""), new ap1(this.e, osVar, new ey2(ly2Var, (byte) 0), (byte) 1));
    }
}
