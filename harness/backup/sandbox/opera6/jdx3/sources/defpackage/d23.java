package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.OperaApplication;
import com.opera.android.oauth2.LoginResult;
import com.opera.android.oauth2.OAuth2Account;
import java.util.Objects;
import org.chromium.base.Callback;

/* loaded from: classes.dex */
public final class d23 implements Callback {
    public final /* synthetic */ byte a;
    public Object b;

    public d23(OAuth2Account oAuth2Account) {
        this.a = (byte) 1;
        Objects.requireNonNull(oAuth2Account);
        this.b = oAuth2Account;
    }

    public /* synthetic */ d23(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                if (((Integer) obj).intValue() > 0) {
                    e23 e23Var = (e23) this.b;
                    e23Var.b = true;
                    vml.a(e23Var);
                    break;
                }
                break;
            case 1:
                LoginResult loginResult = (LoginResult) obj;
                OAuth2Account oAuth2Account = (OAuth2Account) this.b;
                int i = loginResult.a;
                qs7 qs7Var = qs7.i;
                if (i == 0) {
                    qs7Var = null;
                } else if (i != 1) {
                    if (i == 2) {
                        qs7Var = qs7.h;
                    } else if (i == 3) {
                        qs7Var = qs7.j;
                    }
                }
                oAuth2Account.getClass();
                yqa yqaVar = oAuth2Account.b;
                if (qs7Var == null) {
                    oAuth2Account.d(loginResult.b);
                    oAuth2Account.e(true);
                    db dbVar = (db) yqaVar.c;
                    if (dbVar.d != null) {
                        Context context = (Context) yqaVar.b;
                        String[] strArr = OperaApplication.K;
                        ((OperaApplication) context.getApplicationContext()).L().c.b0(dbVar.d);
                        ((SharedPreferences) dbVar.b.get()).edit().putInt("account_type", dbVar.d.a).apply();
                    }
                    h7f h7fVar = dbVar.e;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((cb) g7fVarH.next()).c();
                    }
                    dbVar.d = null;
                    n1 n1Var = dbVar.f;
                    if (n1Var != null) {
                        wjh wjhVar = (wjh) n1Var.b;
                        ((db) wjhVar.f).f = null;
                        ab abVar = (ab) wjhVar.c;
                        if (abVar != null) {
                            abVar.run(Boolean.TRUE);
                        }
                    }
                    dbVar.g = null;
                    break;
                } else {
                    yqaVar.m();
                    break;
                }
            default:
                ((Callback) this.b).c(obj);
                this.b = null;
                break;
        }
    }
}
