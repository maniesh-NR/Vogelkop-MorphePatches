package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class q7k implements vlf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v7k b;

    public /* synthetic */ q7k(v7k v7kVar, byte b) {
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
                c8j c8jVar = (c8j) v7kVar.w.getValue();
                if (!z) {
                    skm skmVar = c8kVarI0.i;
                    int iOrdinal = c8jVar.ordinal();
                    fc0 fc0Var = fc0.b;
                    if (iOrdinal != 0 && iOrdinal != 1) {
                        fc0 fc0Var2 = fc0.d;
                        if (iOrdinal != 2 && iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                h9o.p();
                                break;
                            }
                        } else {
                            fc0Var = fc0Var2;
                        }
                    }
                    ((x5f) skmVar).h0(fc0Var);
                }
                c8kVarI0.b.V(z ? 1 : 0, "enable_newsfeed");
                break;
            default:
                v7kVar.I0().b.V(z ? 1 : 0, "live_scores_enabled");
                break;
        }
    }
}
