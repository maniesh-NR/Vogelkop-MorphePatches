package defpackage;

import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class s7k implements vlf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v7k b;

    public /* synthetic */ s7k(v7k v7kVar, byte b) {
        this.a = b;
        this.b = v7kVar;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        v7k v7kVar = this.b;
        switch (b) {
            case 0:
                SettingsManager settingsManager = (SettingsManager) v7kVar.I0().j.b;
                if (!settingsManager.a.contains("enable_start_page_opera_logo")) {
                    settingsManager.V(!z ? 1 : 0, "enable_start_page_opera_logo");
                }
                settingsManager.V(z ? 1 : 0, "enable_start_page_opera_logo");
                break;
            default:
                v7kVar.I0().b.V(z ? 1 : 0, "enable_search_shortcuts_tablet");
                break;
        }
    }
}
