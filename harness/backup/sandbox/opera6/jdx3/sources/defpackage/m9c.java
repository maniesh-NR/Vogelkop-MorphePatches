package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.leanplum.Leanplum;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m9c {
    public final Context a;
    public final b59 b;
    public final Object c;
    public final i7f d;
    public final wc9 e;

    public m9c(Context context) {
        b59 b59VarL = w1h.l(context, vml.d, "appboy-manager", new bg1[0]);
        this.c = new Object();
        this.d = new i7f();
        this.e = new wc9(this, (byte) 1);
        this.a = context.getApplicationContext();
        this.b = b59VarL;
        Leanplum.addStartResponseHandler(new l9c(this));
    }

    public final String a() {
        return ((SharedPreferences) this.b.get()).getString("ad_set", null);
    }

    public final String b() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.b.get();
        synchronized (this.c) {
            String string = sharedPreferences.getString("user_id", null);
            if (string != null) {
                return string;
            }
            String string2 = this.a.getSharedPreferences("com.appboy.offline.storagemap", 0).getString("last_user", null);
            if (string2 == null) {
                string2 = UUID.randomUUID().toString();
            }
            sharedPreferences.edit().putString("user_id", string2).apply();
            return string2;
        }
    }
}
