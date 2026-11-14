package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class t7k implements vlf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v7k b;

    public /* synthetic */ t7k(v7k v7kVar, byte b) {
        this.a = b;
        this.b = v7kVar;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        v7k v7kVar = this.b;
        switch (b) {
            case 0:
                v7kVar.I0().b.V(z ? 1 : 0, "enable_weather");
                break;
            default:
                v7kVar.I0().b.V(z ? 1 : 0, "enable_continue_booking");
                break;
        }
    }
}
