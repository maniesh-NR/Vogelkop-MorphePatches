package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final class bw8 extends k8 {
    public final String o;
    public final String p;

    public bw8(Context context, String str, String str2, String str3, String str4) {
        super(context, str, str2);
        this.o = str3;
        this.p = str4;
    }

    public final void s0() {
        ((SharedPreferences) ((b59) this.b).get()).edit().putBoolean(this.o, true).apply();
    }

    public final void t0(boolean z) {
        String str = (String) this.a;
        b59 b59Var = (b59) this.b;
        if (z) {
            am2.x(((SharedPreferences) b59Var.get()).edit().putBoolean(str, true), "news_notifications_suggestion_card_shown_timestamp");
        } else {
            j.d((SharedPreferences) b59Var.get(), str, false);
        }
    }

    public final int u0() {
        SharedPreferences sharedPreferences = (SharedPreferences) ((b59) this.b).get();
        String str = this.p;
        int i = sharedPreferences.getInt(str, 1);
        if (!X()) {
            return i;
        }
        int i2 = i + 1;
        sharedPreferences.edit().putInt(str, i2).apply();
        return i2;
    }
}
