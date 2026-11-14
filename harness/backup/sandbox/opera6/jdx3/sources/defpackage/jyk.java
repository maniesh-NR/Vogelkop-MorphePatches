package defpackage;

import com.opera.android.oauth2.OAuth2Account;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class jyk extends zz2 {
    public final /* synthetic */ byte d = 1;
    public final /* synthetic */ myk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyk(myk mykVar, Callback callback) {
        super(mykVar, callback);
        this.e = mykVar;
        db dbVar = mykVar.b;
        zzh zzhVar = new zzh(this, (byte) 21);
        dbVar.getClass();
        eme emeVar = new eme(dbVar, zzhVar);
        OAuth2Account oAuth2Account = dbVar.c;
        if (oAuth2Account == null) {
            emeVar.b();
        } else {
            oAuth2Account.a(0, emeVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyk(myk mykVar, ixk ixkVar) {
        super(mykVar, ixkVar);
        this.e = mykVar;
        db dbVar = mykVar.b;
        zzh zzhVar = new zzh(this, (byte) 21);
        dbVar.getClass();
        eme emeVar = new eme(dbVar, zzhVar);
        OAuth2Account oAuth2Account = dbVar.c;
        if (oAuth2Account == null) {
            emeVar.b();
        } else {
            oAuth2Account.a(0, emeVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyk(myk mykVar, zzh zzhVar) {
        super(mykVar, zzhVar);
        this.e = mykVar;
        db dbVar = mykVar.b;
        zzh zzhVar2 = new zzh(this, (byte) 21);
        dbVar.getClass();
        eme emeVar = new eme(dbVar, zzhVar2);
        OAuth2Account oAuth2Account = dbVar.c;
        if (oAuth2Account == null) {
            emeVar.b();
        } else {
            oAuth2Account.a(0, emeVar);
        }
    }

    @Override // defpackage.zz2
    public final ih4 d(OperaAccessToken operaAccessToken) {
        byte b = this.d;
        myk mykVar = this.e;
        switch (b) {
            case 0:
                if (operaAccessToken == null) {
                    c(Boolean.FALSE);
                    return null;
                }
                di2 di2Var = mykVar.e;
                qlk qlkVar = new qlk(this, (byte) 18);
                zzh zzhVar = new zzh(this, (byte) 22);
                di2Var.getClass();
                return new ci2(di2Var, zzhVar, operaAccessToken, qlkVar, (byte) 0);
            case 1:
                if (operaAccessToken == null) {
                    c(Boolean.FALSE);
                    return null;
                }
                di2 di2Var2 = mykVar.e;
                kyk kykVar = new kyk(this, (byte) 0);
                kyk kykVar2 = new kyk(this, (byte) 1);
                di2Var2.getClass();
                return new ci2(di2Var2, kykVar2, operaAccessToken, kykVar);
            default:
                if (operaAccessToken == null) {
                    c(Boolean.FALSE);
                    return null;
                }
                di2 di2Var3 = mykVar.e;
                qlk qlkVar2 = new qlk(this, (byte) 21);
                zzh zzhVar2 = new zzh(this, (byte) 24);
                di2Var3.getClass();
                return new ci2(di2Var3, zzhVar2, operaAccessToken, qlkVar2);
        }
    }
}
