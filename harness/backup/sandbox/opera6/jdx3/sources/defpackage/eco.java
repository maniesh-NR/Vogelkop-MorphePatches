package defpackage;

import android.content.SharedPreferences;
import com.opera.android.search.YandexPromotionTabHelper;

/* loaded from: classes.dex */
public final class eco implements kx3 {
    public final /* synthetic */ YandexPromotionTabHelper a;

    public eco(YandexPromotionTabHelper yandexPromotionTabHelper) {
        this.a = yandexPromotionTabHelper;
    }

    @Override // defpackage.kx3
    public final void b(String str) {
        if (str == null) {
            ((SharedPreferences) ((b59) this.a.a.a).get()).edit().clear().apply();
        }
    }
}
