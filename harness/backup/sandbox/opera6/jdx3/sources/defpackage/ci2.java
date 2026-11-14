package defpackage;

import com.leanplum.internal.RequestBuilder;
import com.opera.android.oauth2.OperaAccessToken;
import java.util.List;
import java.util.Objects;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class ci2 extends p43 {
    public final /* synthetic */ byte i = 2;
    public final /* synthetic */ Object j;
    public final /* synthetic */ s43 k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci2(di2 di2Var, kyk kykVar, OperaAccessToken operaAccessToken, kyk kykVar2) {
        super(di2Var, kykVar);
        this.j = operaAccessToken;
        this.l = kykVar2;
        Objects.requireNonNull(di2Var);
        this.k = di2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci2(di2 di2Var, zzh zzhVar, OperaAccessToken operaAccessToken, qlk qlkVar) {
        super(di2Var, zzhVar);
        this.j = operaAccessToken;
        this.l = qlkVar;
        Objects.requireNonNull(di2Var);
        this.k = di2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci2(di2 di2Var, zzh zzhVar, OperaAccessToken operaAccessToken, qlk qlkVar, byte b) {
        super(di2Var, zzhVar);
        this.j = operaAccessToken;
        this.l = qlkVar;
        Objects.requireNonNull(di2Var);
        this.k = di2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci2(le9 le9Var, j12 j12Var, String str, cn7 cn7Var) {
        super(le9Var, j12Var);
        this.j = str;
        this.l = cn7Var;
        Objects.requireNonNull(le9Var);
        this.k = le9Var;
    }

    @Override // defpackage.p43
    public final RealCall b() {
        byte b = this.i;
        Object obj = this.j;
        s43 s43Var = this.k;
        switch (b) {
            case 0:
                di2 di2Var = (di2) s43Var;
                t9f t9fVar = (t9f) di2Var.a.get();
                fvh fvhVarA = di2Var.a("resend-email-verification", di2.c((OperaAccessToken) obj), new String[0]);
                fvhVarA.e(RequestBuilder.POST, rvh.create(new byte[0]));
                return t9fVar.c(new kvh(fvhVarA));
            case 1:
                di2 di2Var2 = (di2) s43Var;
                t9f t9fVar2 = (t9f) di2Var2.a.get();
                fvh fvhVarA2 = di2Var2.a("delete", di2.c((OperaAccessToken) obj), new String[0]);
                fvhVarA2.e(RequestBuilder.POST, rvh.create(new byte[0]));
                return t9fVar2.c(new kvh(fvhVarA2));
            case 2:
                di2 di2Var3 = (di2) s43Var;
                t9f t9fVar3 = (t9f) di2Var3.a.get();
                fvh fvhVarA3 = di2Var3.a("flow/profile-login", di2.c((OperaAccessToken) obj), new String[0]);
                fvhVarA3.e(RequestBuilder.POST, rvh.create(new byte[0]));
                return t9fVar3.c(new kvh(fvhVarA3));
            default:
                le9 le9Var = (le9) s43Var;
                t9f t9fVar4 = (t9f) le9Var.a.get();
                fvh fvhVarA4 = le9Var.a("all-messages", (String) obj, new String[0]);
                fvhVarA4.e("DELETE", rvh.EMPTY);
                return t9fVar4.c(new kvh(fvhVarA4));
        }
    }

    @Override // defpackage.p43
    public final boolean d(pzh pzhVar) {
        switch (this.i) {
            case 0:
                if (pzhVar.d == 204) {
                    break;
                }
                break;
            case 1:
                if (pzhVar.d == 204) {
                    break;
                }
                break;
            case 2:
                if (pzhVar.d == 204) {
                    break;
                }
                break;
            default:
                if (pzhVar.d == 202) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.p43
    public final void f(pzh pzhVar) {
        byte b = this.i;
        Object obj = this.l;
        switch (b) {
            case 0:
                e((qlk) obj);
                break;
            case 1:
                e((qlk) obj);
                break;
            case 2:
                e9a e9aVar = pzhVar.f;
                e9aVar.getClass();
                List listCommonValues = _HeadersCommonKt.commonValues(e9aVar, "Set-Cookie");
                e(new bi2((kyk) obj, listCommonValues.isEmpty() ? null : new lv5(pzhVar.a.a, listCommonValues), (byte) 1));
                break;
            default:
                e((cn7) obj);
                break;
        }
    }
}
