package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.CancellationSignal;
import android.text.TextUtils;
import com.opera.android.oauth2.OAuth2Account;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class db {
    public final bb a;
    public final b59 b;
    public OAuth2Account c;
    public jh0 d;
    public final h7f e = new h7f();
    public n1 f;
    public String g;

    public db(Context context, umi umiVar, zwk zwkVar) {
        bb bbVar = new bb(this, context, umiVar, zwkVar);
        this.a = bbVar;
        this.b = w1h.l(context, umiVar, "account_manager", new bg1[]{new b94(umiVar, new ya(bbVar, (byte) 0), (byte) 0)});
        avj avjVar = cak.d;
        avj.g(1, bbVar);
    }

    public final void a(cb cbVar) {
        this.e.b(cbVar);
    }

    public final jh0 b() {
        switch (((SharedPreferences) this.b.get()).getInt("account_type", 1)) {
            case 0:
                return jh0.b;
            case 1:
                return jh0.c;
            case 2:
                return jh0.d;
            case 3:
                return jh0.e;
            case 4:
                return jh0.f;
            case 5:
                return jh0.g;
            case 6:
                return jh0.h;
            default:
                hai.d();
                return null;
        }
    }

    public final String c() {
        OAuth2Account oAuth2Account = this.c;
        if (oAuth2Account == null) {
            return null;
        }
        return ((SharedPreferences) oAuth2Account.a.a.get()).getString("pun_1", null);
    }

    public final boolean d() {
        OAuth2Account oAuth2Account = this.c;
        return oAuth2Account != null && oAuth2Account.b() && ((SharedPreferences) oAuth2Account.a.a.get()).getString("pun_1", null) == null;
    }

    public final boolean e() {
        OAuth2Account oAuth2Account = this.c;
        if (oAuth2Account == null) {
            return false;
        }
        return ((SharedPreferences) oAuth2Account.a.a.get()).getBoolean("pending", false);
    }

    public final boolean f() {
        OAuth2Account oAuth2Account = this.c;
        if (oAuth2Account == null) {
            return false;
        }
        return oAuth2Account.b();
    }

    public final CancellationSignal g(boolean z, Runnable runnable, Callback callback) {
        CancellationSignal cancellationSignal = new CancellationSignal();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!z && jCurrentTimeMillis - ((SharedPreferences) this.b.get()).getLong("last_account_update_timestamp", 0L) <= 21600000) {
            return cancellationSignal;
        }
        OAuth2Account oAuth2Account = this.c;
        if (oAuth2Account == null) {
            callback.run("No account");
            return cancellationSignal;
        }
        oAuth2Account.a(0, new i4d(oAuth2Account, new za(this, cancellationSignal, callback, jCurrentTimeMillis, runnable, (byte) 0)));
        return cancellationSignal;
    }

    public final void h(cb cbVar) {
        this.e.c(cbVar);
    }

    public final void i(String str, byte[] bArr, String str2, String str3, String str4) {
        if (this.c == null) {
            return;
        }
        jh0 jh0Var = jh0.c;
        if (str4 == null) {
            if (TextUtils.isEmpty(str3) && bArr == null) {
                str4 = this.g;
                this.g = null;
                this.d = jh0Var;
            } else {
                this.d = jh0.d;
            }
        }
        if (str4 != null) {
            switch (str4) {
                case "google":
                    this.d = jh0.f;
                    break;
                case "twitter":
                    this.d = jh0.g;
                    break;
                case "vk":
                    this.d = jh0.h;
                    break;
                case "facebook":
                    this.d = jh0.e;
                    break;
                default:
                    this.d = jh0Var;
                    break;
            }
        }
        String str5 = (str3 == null || !str3.isEmpty()) ? str3 : null;
        OAuth2Account oAuth2Account = this.c;
        long j = oAuth2Account.g;
        if (j != 0) {
            N.METaRzWC(j, str2, str5, bArr, str, new d23(oAuth2Account));
        } else {
            oAuth2Account.b.m();
        }
    }

    public final void j(boolean z) {
        OAuth2Account oAuth2Account = this.c;
        if (oAuth2Account == null) {
            return;
        }
        oAuth2Account.f(true, z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean k(Activity activity, String str, Callback callback, ab abVar) {
        n1 q0aVar;
        this.g = null;
        wjh wjhVar = new wjh(this, activity, abVar, str, callback);
        char c = 65535;
        switch (str.hashCode()) {
            case -1240244679:
                if (str.equals("google")) {
                    c = 0;
                    break;
                }
                break;
            case -916346253:
                if (str.equals("twitter")) {
                    c = 1;
                    break;
                }
                break;
            case 3765:
                if (str.equals("vk")) {
                    c = 2;
                    break;
                }
                break;
            case 497130182:
                if (str.equals("facebook")) {
                    c = 3;
                    break;
                }
                break;
        }
        byte b = 17;
        switch (c) {
            case 0:
                q0aVar = new q0a(wjhVar);
                break;
            case 1:
                q0aVar = new cvj(wjhVar, b);
                break;
            case 2:
                q0aVar = new cvj(wjhVar, b);
                break;
            case 3:
                q0aVar = new cvj(wjhVar, b);
                break;
            default:
                q0aVar = new cvj(wjhVar, b);
                break;
        }
        this.f = q0aVar;
        if (!q0aVar.t0()) {
            return false;
        }
        q0aVar.D0();
        return true;
    }
}
