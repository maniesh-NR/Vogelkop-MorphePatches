package ads_mobile_sdk;

import com.google.android.gms.ads.AdError;
import defpackage.fsg;
import defpackage.hkm;
import defpackage.zch;
import defpackage.zzo;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class rh0 {
    public static final /* synthetic */ xtb[] b = {zch.b(rh0.class, "thirdPartyEventEmitter", "getThirdPartyEventEmitter()Lcom/google/android/libraries/ads/mobile/sdk/internal/event/ThirdPartyEventEmitter;")};
    public final ji a;

    public rh0() {
        Object obj = null;
        this.a = new ji(obj, obj);
    }

    public final ae3 a() {
        xtb xtbVar = b[0];
        return (ae3) this.a.getValue(this);
    }

    public final void a(AdError adError) {
        ae3 ae3VarA = a();
        if (ae3VarA != null) {
            d3k d3kVar = ae3VarA.g;
            mt5 mt5Var = null;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new hkm(ae3VarA, adError, mt5Var, (byte) 20), mt5Var, (byte) 3), 2);
        }
    }

    public final void b() {
        ae3 ae3VarA = a();
        if (ae3VarA != null) {
            mt5 mt5Var = null;
            defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new id3(ae3VarA, mt5Var, (byte) 0), mt5Var, (byte) 3), 2);
        }
    }

    public final void c() {
        ae3 ae3VarA = a();
        if (ae3VarA != null) {
            nx5 nx5Var = ae3VarA.a;
            mt5 mt5Var = null;
            id3 id3Var = new id3(ae3VarA, mt5Var, (byte) 1);
            h hVar = h.a;
            byte b2 = 3;
            fsg fsgVar = new fsg(id3Var, mt5Var, b2);
            byte b3 = 2;
            defpackage.na2.B(nx5Var, hVar, null, fsgVar, 2);
            z1 z1Var = ae3VarA.b.p0;
            if (z1Var == z1.FORMAT_DEFAULT || z1Var == z1.ON_AD_OPENED) {
                defpackage.na2.B(nx5Var, hVar, null, new fsg(new id3(ae3VarA, mt5Var, b3), mt5Var, b2), 2);
            }
        }
    }

    public final void d() {
        ae3 ae3VarA = a();
        if (ae3VarA != null) {
            mt5 mt5Var = null;
            byte b2 = 3;
            defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new id3(ae3VarA, mt5Var, b2), mt5Var, b2), 2);
        }
    }

    public final void e() {
        ae3 ae3VarA = a();
        if (ae3VarA != null) {
            byte b2 = 3;
            mt5 mt5Var = null;
            if (ae3VarA.f.isPresent()) {
                if (((zzo) ae3VarA.f.get()).b() && ae3VarA.b.p0 == z1.THIRD_PARTY_SDK_CALLBACK) {
                    defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new id3(ae3VarA, mt5Var, (byte) 4), mt5Var, b2), 2);
                }
            } else if (ae3VarA.b.p0 != z1.ON_AD_SHOW || ae3VarA.g != null) {
                defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new id3(ae3VarA, mt5Var, (byte) 5), mt5Var, b2), 2);
            }
            d3k d3kVar = ae3VarA.g;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
        }
    }

    public final void f() {
        ae3 ae3VarA = a();
        if (ae3VarA != null) {
            mt5 mt5Var = null;
            defpackage.na2.B(ae3VarA.a, h.a, null, new fsg(new vd3(ae3VarA, mt5Var, (byte) 0), mt5Var, (byte) 3), 2);
        }
    }
}
