package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class umk {
    public final b59 a;

    public umk(Context context, umi umiVar, byte b) {
        switch (b) {
            case 1:
                this.a = w1h.l(context, umiVar, "voice_input", new bg1[0]);
                break;
            default:
                this.a = w1h.l(context, umiVar, "SubscriptionResubscribePrefs", new bg1[0]);
                break;
        }
    }

    public final List a() {
        return Arrays.asList(TextUtils.split(((SharedPreferences) this.a.get()).getString("languages", ""), ","));
    }
}
