package defpackage;

import J.N;
import com.opera.android.PushedContentHandler;
import com.opera.android.oauth2.OAuth2Account;

/* loaded from: classes.dex */
public final class och implements w1n {
    public final /* synthetic */ byte a;
    public final wv1 b;

    public /* synthetic */ och(wv1 wv1Var, byte b) {
        this.a = b;
        this.b = wv1Var;
    }

    @Override // defpackage.w1n
    public final void apply(int i) {
        OAuth2Account oAuth2Account;
        byte b = this.a;
        wv1 wv1Var = this.b;
        switch (b) {
            case 0:
                if (i != 0) {
                    N.M$R3b7KP();
                    ((PushedContentHandler) wv1Var.b.get()).b(true, null);
                    break;
                }
                break;
            case 1:
                if (i > 0 && i < 1905701000) {
                    glh glhVar = (glh) wv1Var.b.get();
                    glhVar.d.n(new oml(glhVar.c.c(new pjg(glhVar, (byte) 15))), null);
                    break;
                }
                break;
            case 2:
                b6h b6hVar = wv1Var.b;
                if (i > 0 && i < 1906007000 && ((db) b6hVar.get()).f() && !((db) b6hVar.get()).d() && (oAuth2Account = ((db) b6hVar.get()).c) != null) {
                    oAuth2Account.e(true);
                    break;
                }
                break;
            default:
                if (i > 0 && i < 1907513000) {
                    ((PushedContentHandler) wv1Var.b.get()).g(io7.s);
                    break;
                }
                break;
        }
    }
}
