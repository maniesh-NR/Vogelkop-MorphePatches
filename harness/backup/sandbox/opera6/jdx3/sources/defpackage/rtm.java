package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.internal.j;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rtm implements k7j, q8j {
    public final isd a;
    public final b59 b;
    public d93 c;
    public boolean d;
    public wtm e;
    public final /* synthetic */ stm f;

    public rtm(stm stmVar, isd isdVar) {
        this.f = stmVar;
        this.a = isdVar;
        this.b = w1h.l(stmVar.m, vml.d, "id_pref", new bg1[0]);
        stmVar.l.b(this);
    }

    @Override // defpackage.q8j
    public final void a() {
        this.f.c();
    }

    @Override // defpackage.k7j
    public final void b() {
        this.d = true;
    }

    @Override // defpackage.q8j
    public final void c(Object obj) throws JSONException {
        String string;
        String string2;
        d93 d93Var = (d93) obj;
        boolean z = this.d;
        if (z) {
            return;
        }
        isd isdVar = this.a;
        if (d93Var == null) {
            if (z) {
                return;
            }
            isdVar.E(null, false);
            return;
        }
        stm stmVar = this.f;
        Context context = stmVar.m;
        ta7 ta7Var = stmVar.j;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.get();
        String string3 = sharedPreferences.getString("ndid", null);
        if (string3 != null && (string2 = context.getSharedPreferences("dashboard", 0).getString("news_feed_host", null)) != null) {
            try {
                URL url = new URL(string2);
                String string4 = ta7Var.s().getString("user_host", null);
                if (string4 == null ? true : string4.equals(ta7.q(url))) {
                    ta7Var.s().edit().putString("user_host", ta7.q(url)).apply();
                    ta7Var.s().edit().putString("user_id", string3).apply();
                }
            } catch (MalformedURLException unused) {
            }
            j.a(sharedPreferences, "ndid");
        }
        this.c = d93Var;
        String string5 = ta7Var.s().getString("user_id", null);
        if (string5 != null) {
            URL url2 = d93Var.a.a;
            String string6 = ta7Var.s().getString("user_host", null);
            if (string6 == null ? true : string6.equals(ta7.q(url2))) {
                this.e = null;
                qtm qtmVar = new qtm(d93Var.a, d93Var.b, d93Var.c, string5);
                e(qtmVar, string5, false);
                if (this.d) {
                    return;
                }
                isdVar.E(qtmVar, true);
                return;
            }
        }
        d93 d93Var2 = this.c;
        URL url3 = d93Var2.a.a;
        String string7 = ta7Var.s().getString("known_user_id_" + ta7.q(url3), null);
        if (!TextUtils.isEmpty(string7)) {
            this.e = null;
            d(d93Var2, string7);
            return;
        }
        s9i s9iVar = stmVar.k;
        Context context2 = (Context) s9iVar.b;
        ga6 ga6Var = (ga6) s9iVar.c;
        wtm wtmVar = new wtm();
        String[] strArr = OperaApplication.K;
        wtmVar.a = ((OperaApplication) context2.getApplicationContext()).J();
        wtmVar.b = v1.u(context2);
        wtmVar.c = ((OperaApplication) context2.getApplicationContext()).d();
        this.e = wtmVar;
        oam oamVar = new oam(this, wtmVar, d93Var2);
        e00 e00Var = (e00) wtmVar.c;
        if (!((SettingsManager) wtmVar.a).u("personalized_ads") || e00Var.b().b) {
            string = ta7Var.s().getString("user_uuid", null);
            if (string == null) {
                string = UUID.randomUUID().toString();
                ta7Var.s().edit().putString("user_uuid", string).apply();
            }
        } else {
            string = e00Var.b().a;
            String[] strArr2 = aik.a;
            if (string == null) {
                string = "";
            }
        }
        URL url4 = d93Var2.a.a;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url4.getProtocol()).encodedAuthority(url4.getAuthority()).encodedPath(url4.getPath()).appendEncodedPath("device_id").appendQueryParameter("abgroup", ((v1) wtmVar.b).x());
        String str = d93Var2.c;
        if (str != null) {
            builder.appendQueryParameter("config_bundle", str);
        }
        String string8 = builder.build().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("advertising_id", orb.t(string));
            ga6Var.a(new z7(string8, jSONObject.toString(), (byte) 1), new kp4(wtmVar, oamVar, (byte) 2));
        } catch (JSONException e) {
            t3p.n(e);
        }
    }

    public final void d(d93 d93Var, String str) {
        String string;
        stm stmVar = this.f;
        stmVar.j.s().edit().putString("user_id", str).apply();
        stmVar.j.s().edit().putString("user_host", ta7.q(d93Var.a.a)).apply();
        qtm qtmVar = new qtm(d93Var.a, d93Var.b, d93Var.c, str);
        if (!this.d) {
            this.a.E(qtmVar, true);
        }
        SharedPreferences sharedPreferences = stmVar.m.getSharedPreferences("newsfeed", 0);
        sre sreVar = null;
        String string2 = sharedPreferences.getString("user_host", null);
        if (string2 != null && (string = sharedPreferences.getString("user_id", null)) != null) {
            sreVar = new sre(string2, string, (byte) 0);
        }
        x5f x5fVar = stmVar.n;
        String str2 = sreVar.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF);
            x56VarF.V(34, str2);
            x5fVar.U0(x56VarF);
        }
        x5f x5fVar2 = stmVar.o;
        String str3 = sreVar.b;
        x5fVar2.getClass();
        zpa zpaVar2 = x5fVar2.d;
        x56 x56VarF2 = zpa.F();
        ((xf0) new ck0(zpaVar2, x56VarF2).c.getValue()).a.x(4, str3);
        x5fVar2.U0(x56VarF2);
        ac8.a(new tre());
    }

    public final void e(d93 d93Var, String str, boolean z) {
        URL url = d93Var.a.a;
        stm stmVar = this.f;
        if (stmVar.j.s().getString("known_user_id_" + ta7.q(url), null) == null || z) {
            stmVar.j.s().edit().putString("known_user_id_" + ta7.q(url), str).apply();
        }
    }
}
