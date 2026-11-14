package defpackage;

import android.view.View;
import com.usercentrics.sdk.ui.components.UCImageView;
import com.usercentrics.sdk.ui.components.UCTextView;

/* loaded from: classes.dex */
public final /* synthetic */ class tig implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tig(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                nig nigVar = (nig) obj4;
                gig gigVar = (gig) obj3;
                eyl eylVar = (eyl) obj2;
                sig sigVar = (sig) obj;
                if (gigVar.C(29)) {
                    gigVar.m(gigVar.L().a().h(new kyl(eylVar, h1b.v(Integer.valueOf(sigVar.b)))).l(sigVar.a.b.c, false).b());
                    String str = sigVar.c;
                    switch (nigVar.c) {
                        case 0:
                            nigVar.d.l.b[1] = str;
                            break;
                    }
                    nigVar.b.q.dismiss();
                    break;
                }
                break;
            case 1:
                UCImageView uCImageView = (UCImageView) obj4;
                oqg oqgVar = (oqg) obj2;
                h0c h0cVar = new h0c(uCImageView.getContext(), (ufm) obj3);
                h0cVar.d = new ucm((zdm) obj, (byte) 0);
                h0cVar.b(uCImageView, oqgVar.a, oqgVar.b.a);
                break;
            default:
                zdm zdmVar = (zdm) obj4;
                UCTextView uCTextView = (UCTextView) obj;
                zdmVar.y = true;
                ((afc) obj3).removeView((UCTextView) obj2);
                uCTextView.s(zdmVar.b().a, zdmVar.b().g, new lrk(1, zdmVar, zdm.class, "onHtmlLinkClick", "onHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V", 0, (byte) 7));
                xvg.t(zdmVar, uCTextView);
                break;
        }
    }
}
