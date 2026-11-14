package defpackage;

import android.view.View;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class noo extends sc {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noo(View view, String str, oam oamVar, byte b) {
        super(view, str, oamVar);
        this.d = b;
    }

    private final void o() {
    }

    private final void p() {
    }

    @Override // defpackage.sc
    public final void e(View view, String str, oam oamVar) {
        switch (this.d) {
            case 0:
                WebView webView = (WebView) view;
                oamVar.getClass();
                uio uioVarB = uio.b(s9i.E(u06.b, w3b.c, gvf.c, gvf.d), ne5.v(gd7.a("1.13.7"), webView, str));
                uioVarB.d(webView);
                this.a = uioVarB;
                uioVarB.e();
                break;
            default:
                uio uioVarD = coh.d(u06.d, str, oamVar);
                this.a = uioVarD;
                if (uioVarD != null) {
                    uioVarD.d(view);
                    this.c = qe6.K((uio) this.a);
                    ((uio) this.a).e();
                    zy9 zy9VarJ = zy9.J((uio) this.a);
                    this.b = zy9VarJ;
                    uio uioVar = (uio) zy9VarJ.a;
                    zch.c(uioVar);
                    zch.j(uioVar);
                    if (!uioVar.j) {
                        yp ypVar = uioVar.e;
                        qii.p.m(ypVar.g(), "publishLoadedEvent", new Object[]{null, ypVar.a});
                        uioVar.j = true;
                        break;
                    } else {
                        qp2.n("Loaded event can only be sent once");
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.sc
    public final void g() {
        switch (this.d) {
            case 0:
                break;
            default:
                super.g();
                break;
        }
    }

    @Override // defpackage.sc
    public final void h() {
        switch (this.d) {
            case 0:
                break;
            default:
                super.h();
                break;
        }
    }
}
