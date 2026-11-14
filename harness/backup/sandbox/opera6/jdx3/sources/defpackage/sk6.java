package defpackage;

import android.net.Uri;
import com.opera.android.settings.SettingsManager;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class sk6 {
    public static final Set c = e82.E(new String[]{"ww55.affinity.net", "ww8.affinity.net", "ww9.affinity.net", "ww10.affinity.net"});
    public final cq5 a;
    public final SettingsManager b;

    public sk6(cq5 cq5Var, SettingsManager settingsManager) {
        this.a = cq5Var;
        this.b = settingsManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) {
        if (!((f8f) this.a.getValue()).b()) {
            return null;
        }
        Uri uri = Uri.parse(str);
        if (!CollectionsKt.E(c, uri.getHost())) {
            return null;
        }
        SettingsManager settingsManager = this.b;
        boolean zI = settingsManager.i("ad_blocking");
        boolean z = zI;
        if (settingsManager.i("tracker_blocker")) {
            z = (zI ? 1 : 0) | 2;
        }
        int i = z;
        if (settingsManager.i("compression")) {
            i = (z ? 1 : 0) | 4;
        }
        return wqm.E(uri, "subid", String.valueOf(i)).toString();
    }
}
