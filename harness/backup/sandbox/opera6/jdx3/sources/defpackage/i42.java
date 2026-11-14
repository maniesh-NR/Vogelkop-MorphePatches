package defpackage;

import android.content.SharedPreferences;
import com.opera.android.oauth2.OperaAccessToken;

/* loaded from: classes.dex */
public final class i42 extends yi2 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    public i42(OperaAccessToken operaAccessToken) {
        super(operaAccessToken, "me");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i42(OperaAccessToken operaAccessToken, k42 k42Var) {
        this(operaAccessToken);
        this.g = (byte) 0;
        this.h = k42Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i42(i4d i4dVar, OperaAccessToken operaAccessToken, za zaVar) {
        this(operaAccessToken);
        this.g = (byte) 1;
        this.h = zaVar;
    }

    @Override // defpackage.yi2
    public final void d(String str) {
        switch (this.g) {
            case 0:
                q(str);
                nv6 nv6VarB = ru9.c(((k42) this.h).a.b).b();
                ((SharedPreferences.Editor) nv6VarB.a).putString("aria.sandbox.userinfo", str);
                nv6VarB.w();
                break;
            default:
                q(str);
                break;
        }
    }

    @Override // defpackage.yi2
    public final void i(String str) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                k42 k42Var = (k42) obj;
                k42Var.f = false;
                h42 h42Var = k42Var.d;
                p0i p0iVar = t0i.b;
                h42Var.r(new t0i(new q0i(new f42(str))));
                break;
            default:
                ((za) obj).run(null);
                break;
        }
    }

    public final void q(String str) {
        vml.c(new xa(this, yi4.J(str), (byte) 0));
    }
}
