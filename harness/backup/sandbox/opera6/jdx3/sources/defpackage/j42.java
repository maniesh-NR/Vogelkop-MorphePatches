package defpackage;

import J.N;
import com.opera.android.oauth2.OAuth2Account;
import com.opera.android.oauth2.OperaAccessSandbox;
import com.opera.android.oauth2.OperaAccessToken;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j42 implements chf {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;

    public j42(OAuth2Account oAuth2Account, ahf ahfVar) {
        this.b = ahfVar;
    }

    public j42(OperaAccessSandbox operaAccessSandbox) {
        Objects.requireNonNull(operaAccessSandbox);
        this.b = operaAccessSandbox;
    }

    public j42(k42 k42Var) {
        this.b = k42Var;
    }

    @Override // defpackage.chf
    public final void a(OperaAccessToken operaAccessToken) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                new i42(operaAccessToken, (k42) obj).k();
                break;
            case 1:
                OperaAccessSandbox operaAccessSandbox = (OperaAccessSandbox) obj;
                if (operaAccessSandbox.e == 1) {
                    operaAccessSandbox.e = (byte) 2;
                    yf1 yf1Var = operaAccessSandbox.c;
                    String str = (String) N.MsWGZerj();
                    new xf1(yf1Var, new ygf(operaAccessSandbox, (byte) 1), operaAccessToken, o18.j("client_id", str, "service", "aria"), new ygf(operaAccessSandbox, (byte) 0));
                    break;
                }
                break;
            default:
                ((ahf) obj).V(operaAccessToken);
                break;
        }
    }

    @Override // defpackage.chf
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                k42 k42Var = (k42) obj;
                k42Var.f = false;
                h42 h42Var = k42Var.d;
                p0i p0iVar = t0i.b;
                h42Var.r(new t0i(new q0i(new f42("Token lost"))));
                break;
            case 1:
                OperaAccessSandbox operaAccessSandbox = (OperaAccessSandbox) obj;
                if (operaAccessSandbox.e == 1) {
                    operaAccessSandbox.a(3);
                    break;
                }
                break;
            default:
                ((ahf) obj).b();
                break;
        }
    }

    @Override // defpackage.chf
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                k42 k42Var = (k42) obj;
                k42Var.f = false;
                h42 h42Var = k42Var.d;
                p0i p0iVar = t0i.b;
                h42Var.r(new t0i(new q0i(e42.a)));
                break;
            case 1:
                OperaAccessSandbox operaAccessSandbox = (OperaAccessSandbox) obj;
                if (operaAccessSandbox.e == 1) {
                    operaAccessSandbox.a(2);
                    break;
                }
                break;
            default:
                ((ahf) obj).b();
                break;
        }
    }
}
