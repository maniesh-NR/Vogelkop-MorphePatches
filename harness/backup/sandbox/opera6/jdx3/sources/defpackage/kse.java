package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.OperaApplication;
import com.opera.android.news.newsfeed.internal.NewsPushTokenUploaderWorker;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class kse implements b6j, f7f {
    public final wnm a;
    public final v1 b;
    public final String c;
    public final fqe d;
    public boolean e;
    public nre f;
    public String g;
    public final /* synthetic */ hd h;

    public kse(hd hdVar, Context context, String str) {
        this.h = hdVar;
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        wnm wnmVar = ((dse) operaApplication.r.j0.get()).a;
        this.a = wnmVar;
        v1 v1VarU = v1.u(context);
        this.b = v1VarU;
        this.c = str;
        this.d = operaApplication.y();
        wnmVar.k(this);
        v1VarU.b(new yqd(this, (byte) 12));
    }

    public final void a() {
        String str;
        nre nreVar = this.f;
        if (nreVar == null || (str = this.g) == null) {
            return;
        }
        hd hdVar = this.h;
        fse fseVar = (fse) hdVar.c;
        Context context = (Context) hdVar.f;
        if (nreVar.a != null) {
            String str2 = this.c;
            if (!str2.isEmpty()) {
                SharedPreferences sharedPreferencesJ = hd.j(context);
                Integer numValueOf = sharedPreferencesJ.contains("npt_push_level") ? Integer.valueOf(sharedPreferencesJ.getInt("npt_push_level", -1)) : null;
                String string = sharedPreferencesJ.getString("npt_facebook_campaign", null);
                String string2 = sharedPreferencesJ.getString("npt_appsflyer_campaign", null);
                String string3 = sharedPreferencesJ.getString("npt_appsflyer_source", null);
                String string4 = sharedPreferencesJ.getString("npt_appsflyer_adgroup_id", null);
                String string5 = sharedPreferencesJ.getString("npt_appsflyer_af_adset_id", null);
                String string6 = sharedPreferencesJ.getString("npt_install_referrer", null);
                String string7 = sharedPreferencesJ.getString("npt_user_mode", "classic");
                sharedPreferencesJ.edit().remove("npt_unsent_fcm_token").apply();
                ((mse) fseVar.get()).e(new jse(numValueOf, nreVar.a, nreVar.b.toString(), str2, string, string2, string3, string4, string5, string6, str, string7));
                ((mse) fseVar.get()).g();
                NewsPushTokenUploaderWorker.d(context);
            }
        }
        hdVar.b = false;
    }

    @Override // defpackage.b6j
    public final void b() {
        c();
    }

    public final void c() {
        c6j c6jVarH = this.d.c().h();
        HashSet hashSet = c6jVarH.c;
        nre nreVar = (nre) c6jVarH.b;
        this.f = nreVar;
        boolean z = this.e;
        if (nreVar != null) {
            if (z) {
                this.e = false;
                hashSet.remove(this);
            }
            a();
            return;
        }
        if (z) {
            return;
        }
        this.e = true;
        hashSet.add(this);
    }

    public final void d0(Object obj) {
        if (((cse) obj).ordinal() != 0) {
            return;
        }
        this.a.p(this);
        c();
    }
}
