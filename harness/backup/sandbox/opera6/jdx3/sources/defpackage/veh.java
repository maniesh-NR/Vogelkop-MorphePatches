package defpackage;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class veh implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lfh b;

    public /* synthetic */ veh(lfh lfhVar, byte b) {
        this.a = b;
        this.b = lfhVar;
    }

    public final Object invoke(Object obj) {
        Object hfhVar;
        byte b = this.a;
        byte b2 = 2;
        boolean z = false;
        z = false;
        byte b3 = 1;
        lfh lfhVar = this.b;
        switch (b) {
            case 0:
                pde pdeVar = lfhVar.j;
                Context context = lfhVar.d;
                t33 t33Var = (t33) lfhVar.b.invoke();
                Preconditions.checkNotNull(t33Var, "You must provide a valid BarcodeScannerOptions.");
                qsp qspVar = (qsp) k3e.c().a(qsp.class);
                mtp mtpVar = (mtp) qspVar.a.get(t33Var);
                mg8 mg8Var = qspVar.b;
                t33Var.getClass();
                lfhVar.e = new ysp(t33Var, mtpVar, (Executor) mg8Var.a.get(), zzxa.zzb(true != zpp.c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning"));
                String[] strArr = lfh.l;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        String[] strArr2 = lfh.l;
                        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                            pdeVar.r(efh.a);
                            ModuleInstallClient client = ModuleInstall.getClient(context);
                            ud4 ud4Var = lfhVar.e;
                            client.areModulesAvailable(new OptionalModuleApi[]{ud4Var != null ? ud4Var : null}).addOnSuccessListener(new r9g((Object) new veh(lfhVar, b2), (byte) 13)).addOnFailureListener(new weh(lfhVar, z ? (byte) 1 : (byte) 0)).addOnCanceledListener(new weh(lfhVar, b3));
                        } else {
                            pdeVar.r(new cfh(yeh.a));
                        }
                    } else if (nb6.h(context, strArr[i]) == 0) {
                        i++;
                    } else {
                        pdeVar.r(new cfh(zeh.a));
                    }
                }
                return Unit.a;
            case 1:
                ysp yspVar = lfhVar.e;
                if (yspVar == null) {
                    yspVar = null;
                }
                yspVar.close();
                ycc yccVar = lfhVar.f;
                yccVar.getClass();
                xug.i();
                yccVar.G = null;
                yccVar.m = null;
                g1h g1hVar = yccVar.n;
                if (g1hVar != null) {
                    g1hVar.a.a.A();
                }
                ycc yccVar2 = lfhVar.f;
                yccVar2.getClass();
                xug.i();
                j3e j3eVar = yccVar2.f;
                yccVar2.e = null;
                yccVar2.f = null;
                qva qvaVar = yccVar2.g;
                synchronized (qvaVar.s) {
                    rva rvaVar = qvaVar.t;
                    if (rvaVar != null) {
                        rvaVar.h((Executor) null, (lva) null);
                    }
                    if (qvaVar.v != null) {
                        ((qrm) qvaVar).d = 2;
                        qvaVar.s();
                    }
                    qvaVar.u = null;
                    qvaVar.v = null;
                }
                yccVar2.l(j3eVar, (j3e) null);
                lfhVar.g.a();
                lfhVar.j.r(dfh.a);
                return Unit.a;
            case 2:
                if (((ModuleAvailabilityResponse) obj).areModulesAvailable()) {
                    lfhVar.b();
                } else {
                    ModuleInstallClient client2 = ModuleInstall.getClient(lfhVar.d);
                    ModuleInstallRequest.Builder builder = new ModuleInstallRequest.Builder();
                    ud4 ud4Var2 = lfhVar.e;
                    client2.installModules(builder.addApi(ud4Var2 != null ? ud4Var2 : null).setListener(new kfh(lfhVar, client2)).build()).addOnFailureListener(new weh(lfhVar, b2)).addOnCanceledListener(new weh(lfhVar, (byte) 3));
                }
                return Unit.a;
            default:
                Integer num = (Integer) obj;
                pde pdeVar2 = lfhVar.k;
                ycc yccVar3 = lfhVar.f;
                yccVar3.getClass();
                xug.i();
                xcc xccVar = yccVar3.m;
                ud4 ud4VarA = xccVar != null ? xccVar.a() : null;
                if (ud4VarA == null || !((mr) ud4VarA).b.q()) {
                    hfhVar = ifh.a;
                } else {
                    if (num != null && num.intValue() == 1) {
                        z = true;
                    }
                    hfhVar = new hfh(z);
                }
                xf8.F0(pdeVar2, hfhVar);
                return Unit.a;
        }
    }
}
