package com.opera.android.oauth2;

import J.N;
import androidx.annotation.NonNull;
import defpackage.a55;
import defpackage.bhf;
import defpackage.chf;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.j42;
import defpackage.kw4;

/* loaded from: classes.dex */
public final class OperaAccessTokenProvider {
    public final OperaAccessSandbox a;
    public final long b;
    public OperaAccessToken c;
    public final h7f d;
    public boolean e;

    public OperaAccessTokenProvider(String str, String[] strArr, String str2, String str3, OperaAccessSandbox operaAccessSandbox) {
        long j;
        bhf bhfVar = new bhf(this);
        this.d = new h7f();
        if (operaAccessSandbox == null) {
            j = 0;
        } else {
            this.a = operaAccessSandbox;
            operaAccessSandbox.a.b(bhfVar);
            byte b = operaAccessSandbox.e;
            if (b == 0 || b == 5 || b == 6) {
                if (N.MXGc3ngP(operaAccessSandbox.d)) {
                    operaAccessSandbox.b();
                } else {
                    operaAccessSandbox.e = (byte) 1;
                    a55 a55Var = operaAccessSandbox.b;
                    int i = 2;
                    a55Var.c.d(new kw4((Object) a55Var, i, (Object) new j42(operaAccessSandbox), (byte) 1));
                }
            }
            j = operaAccessSandbox.d;
        }
        this.b = N.MeY2CSfq(this, str, strArr, str2, str3, j);
    }

    public static String[] a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new String[0] : new String[]{"shodan:aria", "user:read"} : new String[]{"shodan:aria"} : new String[]{"user:read", "subscriptions"} : new String[]{"https://news.opera-api.com/", "user:read", "user", "social_accounts:read"};
    }

    public final void b(chf chfVar) {
        h7f h7fVar = this.d;
        if (chfVar != null) {
            h7fVar.b(chfVar);
        }
        OperaAccessSandbox operaAccessSandbox = this.a;
        if (operaAccessSandbox != null) {
            byte b = operaAccessSandbox.e;
            if (b != 4 && b != 5) {
                this.e = true;
                return;
            }
            int i = operaAccessSandbox.f;
            if (i != 0) {
                int iA = vep.A(i);
                if (iA == 0) {
                    onTokenLost();
                    return;
                } else if (iA == 1) {
                    onTokenDenied();
                    return;
                }
            }
        }
        OperaAccessToken operaAccessToken = this.c;
        if (operaAccessToken == null || operaAccessToken.a()) {
            N.MhBclenx(this.b);
            return;
        }
        OperaAccessToken operaAccessToken2 = this.c;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((chf) g7fVarH.next()).a(operaAccessToken2);
        }
        h7fVar.clear();
    }

    public final void onToken(@NonNull OperaAccessToken operaAccessToken) {
        if (operaAccessToken.a()) {
            b(null);
            return;
        }
        this.c = operaAccessToken;
        h7f h7fVar = this.d;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((chf) g7fVarH.next()).a(operaAccessToken);
        }
        h7fVar.clear();
    }

    public final void onTokenDenied() {
        OperaAccessSandbox operaAccessSandbox = this.a;
        if (operaAccessSandbox != null) {
            byte b = operaAccessSandbox.e;
            if (b == 1 || b == 2 || b == 3) {
                operaAccessSandbox.e = (byte) 6;
            } else if (b == 4) {
                N.MiD6gAXx(operaAccessSandbox.d);
                operaAccessSandbox.e = (byte) 6;
            }
        }
        h7f h7fVar = this.d;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((chf) g7fVarH.next()).c();
        }
        h7fVar.clear();
    }

    public final void onTokenLost() {
        this.c = null;
        h7f h7fVar = this.d;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((chf) g7fVarH.next()).b();
        }
        h7fVar.clear();
    }
}
