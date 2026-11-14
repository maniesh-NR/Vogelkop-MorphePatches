package ads_mobile_sdk;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import defpackage.cwh;
import defpackage.gso;
import defpackage.prb;
import defpackage.tdp;
import defpackage.tpo;
import defpackage.uie;
import defpackage.xgh;
import defpackage.z1m;
import defpackage.zzo;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class oz1 implements gso {
    public final defpackage.r83 a;
    public final uie b;
    public final cu2 c;
    public final Context d;
    public final g0 e;
    public final rh0 f;
    public final ab0 g;

    public oz1(defpackage.r83 r83Var, uie uieVar, cu2 cu2Var, Context context, g0 g0Var, rh0 rh0Var, ab0 ab0Var) {
        this.a = r83Var;
        this.b = uieVar;
        this.c = cu2Var;
        this.d = context;
        this.e = g0Var;
        this.f = rh0Var;
        this.g = ab0Var;
    }

    @Override // defpackage.gso
    public final tdp a(ejp ejpVar) {
        z42 z42Var = (z42) ejpVar;
        ue0 ue0Var = (ue0) this.g.get();
        vk3 vk3Var = z42Var.c;
        if (vk3Var == null) {
            vk3Var = null;
        }
        vk3Var.getClass();
        ue0Var.p = vk3Var;
        zzo zzoVar = z42Var.c;
        ue0Var.q = xgh.a(zzoVar != null ? zzoVar : null, this.b.e());
        return ue0Var;
    }

    @Override // defpackage.gso
    public final void a(a2 a2Var, ejp ejpVar, os osVar) throws NoSuchAlgorithmException {
        z42 z42Var = (z42) ejpVar;
        Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        Context context = contextB;
        cwh cwhVarA = this.c.a();
        prb prbVar = a2Var.c;
        MediationAdapter mediationAdapter = z42Var.a;
        if (!(mediationAdapter instanceof MediationNativeAdapter)) {
            String canonicalName = mediationAdapter.getClass().getCanonicalName();
            String canonicalName2 = MediationNativeAdapter.class.getCanonicalName();
            osVar.a(new AdError(0, sko.n(z1m.n("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), mediationAdapter.getClass().getCanonicalName(), " implement ", MediationNativeAdapter.class.getCanonicalName(), "?"), AdError.GOOGLE_MOBILE_ADS_DOMAIN));
            return;
        }
        defpackage.r83 r83Var = this.a;
        HashSet hashSet = r83Var.e;
        boolean zA = cwhVarA.a(context);
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        nz1 nz1Var = new nz1(hashSet, zA, -1, -1, tpo.d(prbVar, cwhVarA), tpo.c(this.b));
        cno cnoVar = new cno(z42Var, (byte) 3);
        os osVar2 = new os();
        osVar2.a = cnoVar;
        osVar2.b = osVar;
        osVar2.c = this.f;
        ((MediationNativeAdapter) mediationAdapter).requestNativeAd(context, osVar2, tpo.b(prbVar), nz1Var, tpo.a(r83Var, mediationAdapter));
    }
}
