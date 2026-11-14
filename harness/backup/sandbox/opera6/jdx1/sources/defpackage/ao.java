package defpackage;

import ads_mobile_sdk.ru0;
import ads_mobile_sdk.sb0;
import ads_mobile_sdk.yi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.admob.AdMobAdapter;
import com.opera.android.browser.obml.Platform;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class ao extends bqi {
    public static int s = 1;
    public static final nrl t = new nrl((byte) 26);
    public static int u;
    public final boolean p;
    public final esk q;
    public final esk r;

    public ao(Activity activity, umi umiVar, rm rmVar, String str, pyl pylVar, uwh uwhVar, qfb qfbVar, r68 r68Var, i3j i3jVar, ap apVar, r9g r9gVar, boolean z, esk eskVar, esk eskVar2, esk eskVar3) {
        super("ao", activity, yo.b, rmVar, str, pylVar, uwhVar, qfbVar, r68Var, i3jVar, apVar, r9gVar);
        this.p = z;
        this.q = eskVar2;
        this.r = eskVar3;
        if (s != 1) {
            return;
        }
        s = 3;
        hn9.g(activity);
        umiVar.a(new k3(activity, eskVar, activity.getApplicationContext(), (byte) 1)).a((Object) null);
    }

    public static ap p(qq qqVar) {
        if (qqVar.a.ordinal() == 0 || !qqVar.c.equals("USD")) {
            return null;
        }
        return ap.a(qqVar.b / 1000000.0d);
    }

    public static void q(boolean z) {
        int i;
        if (z) {
            xgp.a.getClass();
            ((yi) ((sb0) ru0.a()).H0.get()).c = 0.01f;
            i = 4;
        } else {
            i = 2;
        }
        s = i;
        t.K();
    }

    public static void r(Activity activity) {
        t0e t0eVar = (t0e) ep7.b.get();
        boolean zA0 = t0eVar.a0();
        String str = (String) ((k8) t0eVar).a;
        Class cls = Boolean.TYPE;
        if (zA0) {
            Context applicationContext = activity.getApplicationContext();
            mzg.k(str, "initSDK", new Class[]{Context.class}, new Object[]{applicationContext});
            mzg.k(str, "configureUserPrivacy", new Class[]{Context.class, cls}, new Object[]{applicationContext, Boolean.valueOf(yi4.m(applicationContext))});
        }
        zdc zdcVar = (zdc) ep7.c.get();
        if (zdcVar.a0()) {
            mzg.k((String) ((k8) zdcVar).a, "setUserConsent", new Class[]{cls}, new Object[]{Boolean.valueOf(yi4.m(activity))});
        }
    }

    public final boolean a() {
        if (s == 2) {
            return false;
        }
        return super.a();
    }

    public final int c() {
        return this.p ? 4 : 0;
    }

    public final k43 l(zy zyVar, az azVar) {
        Activity activityM = m();
        String str = ((bqi) this).g;
        if (activityM == null || s == 2) {
            zyVar.onFailed(bqi.n("ads provider not available", str));
            return null;
        }
        if (azVar.b()) {
            zyVar.onFailed(bqi.n("ad provider does not support offline requests", str));
            return null;
        }
        List list = (List) azVar.c().stream().map(new mn((byte) 0)).distinct().filter(new nn((byte) 0)).collect(Collectors.toList());
        if (this.p && list.isEmpty()) {
            zyVar.onFailed(bqi.n("ad format not supported", str));
            return null;
        }
        dl dlVarA = azVar.a();
        if (azVar.f()) {
            return new yn(this, activityM, zyVar, dlVarA, list, (byte) 0);
        }
        rm rmVar = ((bqi) this).f;
        switch (rmVar.ordinal()) {
            case 0:
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                zyVar.onFailed(bqi.n("ad format not supported", str));
                break;
            case 6:
                break;
            default:
                bxl.l(rmVar, "Unsupported format: ");
                break;
        }
        return null;
    }

    public final void s(l43 l43Var, List list) {
        ii iiVar = ep7.b;
        if (((t0e) iiVar.get()).a0()) {
            mzg.k((String) ((k8) ((t0e) iiVar.get())).a, "addMuteFlagToRequest", new Class[]{s83.class}, new Object[]{l43Var});
        }
        l43Var.i = f8a.f.a("Google-DFP-" + Platform.c());
        l43Var.f.add("news");
        if (!yi4.m(((bqi) this).j)) {
            Bundle bundle = new Bundle();
            bundle.putString("npa", "1");
            l43Var.a(AdMobAdapter.class, bundle);
        } else {
            if (list.isEmpty()) {
                return;
            }
            l43Var.d(new HashSet(list));
            l43Var.c((String) list.get(0));
        }
    }
}
