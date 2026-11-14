package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class r7k implements vlf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v7k b;

    public /* synthetic */ r7k(v7k v7kVar, byte b) {
        this.a = b;
        this.b = v7kVar;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        v7k v7kVar = this.b;
        switch (b) {
            case 0:
                c8k c8kVarI0 = v7kVar.I0();
                x5f x5fVar = (x5f) c8kVarI0.h;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    am2.g(zpaVar, x56VarF).b.r(72, 1, z);
                    x5fVar.U0(x56VarF);
                }
                c8kVarI0.b.V(z ? 1 : 0, "enable_start_page_customize_button");
                break;
            default:
                v7kVar.I0().b.V(z ? 1 : 0, "enable_search_shortcuts");
                break;
        }
    }
}
