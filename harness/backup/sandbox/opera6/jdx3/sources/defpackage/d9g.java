package defpackage;

import com.opera.android.browser.BrowserDataManager$CookiesAndLocalStorageUsageCallback;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class d9g implements BrowserDataManager$CookiesAndLocalStorageUsageCallback, vlf {
    public final /* synthetic */ g9g a;

    @Override // com.opera.android.browser.BrowserDataManager$CookiesAndLocalStorageUsageCallback
    public final void run(String[] strArr, long j, boolean z) {
        g9g g9gVar = this.a;
        if (g9gVar.y == null) {
            return;
        }
        g9gVar.H0(strArr.length, j, z);
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        kag kagVar = z ? kag.GRANTED : kag.DENIED;
        s9g s9gVar = s9g.h;
        g9g g9gVar = this.a;
        s9gVar.o(false, g9gVar.w, lag.g, kagVar, true);
        g9gVar.J0(z);
    }
}
