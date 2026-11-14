package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class us4 {
    public final ekc a;
    public final SettingsManager b;
    public final tsd c;
    public final wnm d;

    public us4(ekc ekcVar, SettingsManager settingsManager, lic licVar) {
        this.a = ekcVar;
        this.b = settingsManager;
        tsd tsdVarE = uyg.e(settingsManager, "ad_blocking_mode", new mr3((byte) 15));
        tsd tsdVarE2 = uyg.e(settingsManager, "ad_blocking", new mr3((byte) 16));
        tsd tsdVarE3 = uyg.e(settingsManager, "tracker_blocker", new mr3((byte) 17));
        tsd tsdVarE4 = uyg.e(settingsManager, "banner_blocker", new mr3((byte) 18));
        tsd tsdVarE5 = uyg.e(settingsManager, "ad_blocking_mode.selected_custom_lists", new mr3((byte) 19));
        this.c = tsdVarE5;
        this.d = new wnm(null, Arrays.asList(ekcVar, tsdVarE, tsdVarE5, tsdVarE2, tsdVarE3, tsdVarE4), new kkc(ekcVar, tsdVarE, tsdVarE5, tsdVarE2, tsdVarE3, tsdVarE4, (byte) 0), new lkc(new qs4(), ekcVar, tsdVarE, tsdVarE5, tsdVarE2, tsdVarE3, tsdVarE4, (byte) 0));
    }
}
