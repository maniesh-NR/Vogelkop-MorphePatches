package ads_mobile_sdk;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import defpackage.cwh;
import defpackage.gso;
import defpackage.prb;
import defpackage.ruo;
import defpackage.tdp;
import defpackage.tpo;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class di1 implements gso {
    public final defpackage.r83 a;
    public final cu2 b;
    public final Context c;
    public final g0 d;
    public final rh0 e;
    public final ab0 f;

    public di1(defpackage.r83 r83Var, cu2 cu2Var, Context context, g0 g0Var, rh0 rh0Var, ab0 ab0Var) {
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
        af0Var.p = new ruo((ko1) ejpVar, this, (byte) 0);
        return af0Var;
    }

    @Override // defpackage.gso
    public final void a(a2 a2Var, ejp ejpVar, os osVar) throws NoSuchAlgorithmException {
        ko1 ko1Var = (ko1) ejpVar;
        Context contextB = this.d.b();
        if (contextB == null) {
            contextB = this.c;
        }
        Context context = contextB;
        cwh cwhVarA = this.b.a();
        prb prbVar = a2Var.c;
        ko1Var.getClass();
        Adapter adapter = ko1Var.a;
        Bundle bundleB = tpo.b(prbVar);
        Bundle bundleA = tpo.a(this.a, adapter);
        boolean zA = cwhVarA.a(context);
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        adapter.loadInterstitialAd(new MediationInterstitialAdConfiguration(context, "", bundleB, bundleA, zA, (Location) null, -1, -1, tpo.d(prbVar, cwhVarA), ""), new ap1(this.e, osVar, new do1(ko1Var, (byte) 2), (byte) 3));
    }
}
