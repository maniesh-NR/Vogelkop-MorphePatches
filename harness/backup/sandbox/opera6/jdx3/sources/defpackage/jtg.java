package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.Lazy;

/* loaded from: classes.dex */
public final class jtg {
    public final Context a;
    public final tvg b;
    public final ufn c;
    public final ay d;
    public final j4c e;
    public final ii f;

    public jtg(Context context, umi umiVar, tvg tvgVar, ufn ufnVar, j4c j4cVar) {
        ay ayVar = new ay((Object) this, (byte) 11);
        this.d = ayVar;
        this.f = new ii((byte) 21);
        this.a = context.getApplicationContext();
        this.b = tvgVar;
        this.c = ufnVar;
        Lazy.e(ayVar, umiVar);
        this.e = j4cVar;
    }

    public final boolean a() {
        return b() && ((Boolean) this.d.get()).booleanValue() && ((svg) this.b.i()).a(1) && (((tfn) this.c.i()).a & 1) != 0;
    }

    public final boolean b() {
        return !i0l.g() && ((Boolean) this.f.get()).booleanValue();
    }

    public final boolean c() {
        if (b()) {
            Context context = this.a;
            if (!ru9.c(context).a.getBoolean("vpn_pro.kill_switch.on", false) && ((Boolean) this.d.get()).booleanValue() && ((Boolean) this.e.get()).booleanValue()) {
                SharedPreferences sharedPreferences = ru9.c(context).a;
                if ((sharedPreferences.getBoolean("internal.disable_premium_giveaway_subscription_check", false) || (!sharedPreferences.getBoolean("premium.has_owned_subscription", false) && !sharedPreferences.getBoolean("premium.has_owned_giveaway", false))) && ((svg) this.b.i()).a(512) && (((tfn) this.c.i()).a & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d() {
        if (ru9.c(this.a).a.getBoolean("vpn_pro.kill_switch.on", false)) {
            return false;
        }
        return a();
    }
}
