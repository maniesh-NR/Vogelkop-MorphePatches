package defpackage;

import J.N;
import com.opera.android.oauth2.OAuth2Account;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.android.oauth2.OperaAccessTokenProvider;
import com.opera.api.Callback;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ghj {
    public final db a;
    public final yv3 b;
    public final yv3 c;
    public final ArrayList d;
    public fhj e;

    public ghj(db dbVar, yv3 yv3Var, yv3 yv3Var2) {
        this.a = dbVar;
        this.b = yv3Var;
        this.c = yv3Var2;
        nj2 nj2Var = new nj2(this, (byte) 2);
        this.d = new ArrayList();
        dbVar.a(nj2Var);
    }

    public final void a(Callback callback) {
        fhj fhjVar = this.e;
        if (fhjVar != null) {
            OperaAccessToken operaAccessToken = fhjVar.a;
            if (!operaAccessToken.a()) {
                callback.run(new jsl(operaAccessToken.a));
                return;
            }
            this.e = null;
        }
        db dbVar = this.a;
        if (!dbVar.a.f) {
            this.d.add(callback);
            return;
        }
        if (!dbVar.f()) {
            if (((Boolean) this.b.get()).booleanValue()) {
                ((OperaAccessTokenProvider) this.c.get()).b(new mb(this, callback, (byte) 1));
                return;
            } else {
                callback.run(hsl.a);
                return;
            }
        }
        ahf mghVar = new mgh(this, callback, (byte) 2);
        OAuth2Account oAuth2Account = dbVar.c;
        if (oAuth2Account == null) {
            mghVar.b();
        } else {
            oAuth2Account.a(2, mghVar);
        }
    }

    public final void b(String str) {
        OperaAccessToken operaAccessToken;
        fhj fhjVar = this.e;
        if (Intrinsics.a((fhjVar == null || (operaAccessToken = fhjVar.a) == null) ? null : operaAccessToken.a, str)) {
            this.e = null;
        }
        db dbVar = this.a;
        if (dbVar.a.f) {
            if (!dbVar.f()) {
                if (((Boolean) this.b.get()).booleanValue()) {
                    OperaAccessTokenProvider operaAccessTokenProvider = (OperaAccessTokenProvider) this.c.get();
                    OperaAccessToken operaAccessToken2 = operaAccessTokenProvider.c;
                    if (operaAccessToken2 != null && operaAccessToken2.a.equals(str)) {
                        operaAccessTokenProvider.c = null;
                    }
                    N.MKrLKVPe(operaAccessTokenProvider.b, str);
                    return;
                }
                return;
            }
            OAuth2Account oAuth2Account = dbVar.c;
            if (oAuth2Account == null || !oAuth2Account.b()) {
                return;
            }
            OperaAccessTokenProvider operaAccessTokenProvider2 = oAuth2Account.e;
            OperaAccessToken operaAccessToken3 = operaAccessTokenProvider2.c;
            if (operaAccessToken3 != null && operaAccessToken3.a.equals(str)) {
                operaAccessTokenProvider2.c = null;
            }
            N.MKrLKVPe(operaAccessTokenProvider2.b, str);
        }
    }
}
