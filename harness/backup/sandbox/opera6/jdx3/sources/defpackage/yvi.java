package defpackage;

import com.opera.android.custom_views.OperaRadioGroup;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class yvi implements vlf {
    public final /* synthetic */ awi a;

    public /* synthetic */ yvi(awi awiVar) {
        this.a = awiVar;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        awi awiVar = this.a;
        ((wc7) awiVar.r.b).a.V(z ? 1 : 0, "dns_over_https_enabled");
        ((OperaRadioGroup) awiVar.u.f).setVisibility(z ? 0 : 8);
    }
}
