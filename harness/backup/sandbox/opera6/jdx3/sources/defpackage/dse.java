package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class dse {
    public static final bse b = new bse();
    public final wnm a;

    public dse(SettingsManager settingsManager, hte hteVar) {
        this.a = xf8.Y(cse.c, uyg.e(settingsManager, "enable_newsfeed", new zbe((byte) 7)), new po7(hteVar), new s2(2, b, bse.class, "calculateEnabled", "calculateEnabled(ZLcom/opera/android/news/NewsSettingsData;)Lcom/opera/android/news/push/NewsPushNotificationController$Enabled;", 0, (byte) 17));
    }
}
