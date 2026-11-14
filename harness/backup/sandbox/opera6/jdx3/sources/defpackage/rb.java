package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class rb implements djn {
    public final b59 a;

    public rb(Context context) {
        this.a = w1h.l(context, vml.d, "feature_usage", new bg1[0]);
    }

    public rb(Context context, b94 b94Var) {
        this.a = w1h.l(context, vml.d, "accounts", new bg1[]{b94Var});
    }

    public rb(Context context, umi umiVar, byte b) {
        switch (b) {
            case 3:
                this.a = w1h.l(context, umiVar, "wallet2-sprefs", new bg1[0]);
                break;
            default:
                this.a = w1h.l(context, umiVar, "FavoriteCatalogPrefs", new bg1[0]);
                ru9.c(context);
                break;
        }
    }

    @Override // defpackage.djn
    public final void a(Callback callback, Callback callback2) {
        j.a((SharedPreferences) this.a.get(), "wallet-secrets");
        callback.run(Boolean.TRUE);
    }

    @Override // defpackage.djn
    public final void b(Callback callback, Callback callback2) {
        callback.run(((SharedPreferences) this.a.get()).getString("wallet-secrets", null));
    }

    public final void c(String str, String str2) {
        b59 b59Var = this.a;
        if (str2 != null) {
            j.c((SharedPreferences) b59Var.get(), str, str2);
        } else {
            j.a((SharedPreferences) b59Var.get(), str);
        }
    }
}
