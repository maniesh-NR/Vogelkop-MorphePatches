package defpackage;

import android.content.SharedPreferences;
import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final class kw8 extends k8 {
    public final void s0(boolean z) {
        String str = (String) this.a;
        SharedPreferences sharedPreferences = (SharedPreferences) ((b59) this.b).get();
        if (z) {
            sharedPreferences.edit().putBoolean(str, true).putLong("news_personalized_news_shown_timestamp", System.currentTimeMillis()).putInt("news_personalized_news_card_shown_count", sharedPreferences.getInt("news_personalized_news_card_shown_count", 0) + 1).apply();
        } else {
            j.d(sharedPreferences, str, false);
        }
    }
}
