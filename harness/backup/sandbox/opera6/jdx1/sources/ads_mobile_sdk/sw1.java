package ads_mobile_sdk;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import defpackage.cwh;
import defpackage.gso;
import defpackage.prb;
import defpackage.tdp;
import defpackage.tpo;
import defpackage.uie;
import defpackage.xgh;
import defpackage.zzo;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class sw1 implements gso {
    public final defpackage.r83 a;
    public final uie b;
    public final cu2 c;
    public final Context d;
    public final g0 e;
    public final rh0 f;
    public final ab0 g;

    public sw1(defpackage.r83 r83Var, uie uieVar, cu2 cu2Var, Context context, g0 g0Var, rh0 rh0Var, ab0 ab0Var) {
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
        ko1 ko1Var = (ko1) ejpVar;
        ue0 ue0Var = (ue0) this.g.get();
        zzo zzoVar = ko1Var.c;
        if (zzoVar == null) {
            zzoVar = null;
        }
        zzoVar.getClass();
        ue0Var.p = zzoVar;
        zzo zzoVar2 = ko1Var.c;
        ue0Var.q = xgh.a(zzoVar2 != null ? zzoVar2 : null, this.b.e());
        return ue0Var;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    @Override // defpackage.gso
    public final void a(a2 a2Var, ejp ejpVar, os osVar) throws NoSuchAlgorithmException {
        defpackage.r83 r83Var;
        cwh cwhVar;
        prb prbVar;
        rh0 rh0Var;
        Adapter adapter;
        byte b;
        uie uieVar;
        ko1 ko1Var = (ko1) ejpVar;
        Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        Context context = contextB;
        defpackage.r83 r83Var2 = this.a;
        uie uieVar2 = this.b;
        cwh cwhVarA = this.c.a();
        prb prbVar2 = a2Var.c;
        rh0 rh0Var2 = this.f;
        ko1Var.getClass();
        Adapter adapter2 = ko1Var.a;
        try {
            Bundle bundleB = tpo.b(prbVar2);
            try {
                Bundle bundleA = tpo.a(r83Var2, adapter2);
                try {
                    boolean zA = cwhVarA.a(context);
                    awh awhVar = awh.a;
                    bwh bwhVar = bwh.a;
                    try {
                        try {
                            uieVar = uieVar2;
                            prbVar = prbVar2;
                            cwhVar = cwhVarA;
                            r83Var = r83Var2;
                            rh0Var = rh0Var2;
                            try {
                                MediationNativeAdConfiguration mediationNativeAdConfiguration = new MediationNativeAdConfiguration(context, "", bundleB, bundleA, zA, (Location) null, -1, -1, tpo.d(prbVar2, cwhVarA), "", tpo.c(uieVar2));
                                b = 4;
                                try {
                                    adapter = adapter2;
                                    try {
                                        adapter.loadNativeAdMapper(mediationNativeAdConfiguration, new ap1(rh0Var, osVar, new do1(ko1Var, (byte) 3), (byte) 4));
                                    } catch (IllegalStateException e) {
                                        e = e;
                                        if (!kotlin.text.c.m(e.getMessage(), Adapter.ERROR_MESSAGE_METHOD_NOT_FOUND, false)) {
                                            throw e;
                                        }
                                        byte b2 = b;
                                        Bundle bundleB2 = tpo.b(prbVar);
                                        Bundle bundleA2 = tpo.a(r83Var, adapter);
                                        cwh cwhVar2 = cwhVar;
                                        boolean zA2 = cwhVar2.a(context);
                                        awh awhVar2 = awh.a;
                                        bwh bwhVar2 = bwh.a;
                                        adapter.loadNativeAd(new MediationNativeAdConfiguration(context, "", bundleB2, bundleA2, zA2, (Location) null, -1, -1, tpo.d(prbVar, cwhVar2), "", tpo.c(uieVar)), new ap1(rh0Var, osVar, new do1(ko1Var, b2), (byte) 0));
                                    }
                                } catch (IllegalStateException e2) {
                                    e = e2;
                                    adapter = adapter2;
                                }
                            } catch (IllegalStateException e3) {
                                e = e3;
                                adapter = adapter2;
                                b = 4;
                            }
                        } catch (IllegalStateException e4) {
                            e = e4;
                            cwhVar = cwhVarA;
                            prbVar = prbVar2;
                            b = 4;
                            uieVar = uieVar2;
                            adapter = adapter2;
                            r83Var = r83Var2;
                            rh0Var = rh0Var2;
                        }
                    } catch (IllegalStateException e5) {
                        e = e5;
                        r83Var = r83Var2;
                        cwhVar = cwhVarA;
                        prbVar = prbVar2;
                        b = 4;
                        uieVar = uieVar2;
                        adapter = adapter2;
                        rh0Var = rh0Var2;
                    }
                } catch (IllegalStateException e6) {
                    e = e6;
                    r83Var = r83Var2;
                    cwhVar = cwhVarA;
                    prbVar = prbVar2;
                    b = 4;
                    uieVar = uieVar2;
                    rh0Var = rh0Var2;
                    adapter = adapter2;
                }
            } catch (IllegalStateException e7) {
                e = e7;
                r83Var = r83Var2;
                cwhVar = cwhVarA;
                prbVar = prbVar2;
                adapter = adapter2;
                b = 4;
                uieVar = uieVar2;
                rh0Var = rh0Var2;
            }
        } catch (IllegalStateException e8) {
            e = e8;
            r83Var = r83Var2;
            cwhVar = cwhVarA;
            prbVar = prbVar2;
            rh0Var = rh0Var2;
            adapter = adapter2;
            b = 4;
            uieVar = uieVar2;
        }
    }
}
