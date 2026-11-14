package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class adn implements tdn {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ndc b;

    public /* synthetic */ adn(ndc ndcVar, byte b) {
        this.a = b;
        this.b = ndcVar;
    }

    private final void a() {
    }

    @Override // defpackage.tdn
    public final void C() {
        switch (this.a) {
            case 0:
                bdn bdnVar = (bdn) this.b;
                bdnVar.c();
                ((OperaListItem) bdnVar.d.b).E(new rxh(bdnVar.c.c.isEnabled() ? 2132022254 : 2132022280));
                break;
        }
    }

    @Override // defpackage.tdn
    public final void N() {
        byte b = this.a;
        ndc ndcVar = this.b;
        switch (b) {
            case 0:
                ((bdn) ndcVar).c();
                break;
            default:
                ((cgn) ndcVar).O0();
                break;
        }
    }

    @Override // defpackage.tdn
    public final void s() {
        byte b = this.a;
        ndc ndcVar = this.b;
        switch (b) {
            case 0:
                ((bdn) ndcVar).b();
                break;
            default:
                cgn cgnVar = (cgn) ndcVar;
                cgnVar.M0();
                OperaListItem operaListItem = cgnVar.N;
                if (operaListItem != null) {
                    int protocol = cgnVar.v.c.getProtocol();
                    u35.k(protocol != 0 ? protocol != 1 ? protocol != 2 ? 0 : 2132022269 : 2132022268 : 2132022267, operaListItem);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tdn
    public final void t() {
        byte b = this.a;
        ndc ndcVar = this.b;
        switch (b) {
            case 0:
                ((bdn) ndcVar).c();
                break;
            default:
                ((cgn) ndcVar).M0();
                break;
        }
    }
}
