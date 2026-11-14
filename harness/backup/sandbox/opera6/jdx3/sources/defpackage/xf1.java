package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.api.Callback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.internal.connection.RealCall;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xf1 extends r43 {
    public final /* synthetic */ byte i = 1;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf1(di2 di2Var, iyk iykVar, OperaAccessToken operaAccessToken, orb orbVar, fi2 fi2Var) {
        super(di2Var, iykVar);
        this.j = operaAccessToken;
        this.k = orbVar;
        this.l = fi2Var;
        Objects.requireNonNull(di2Var);
        this.m = di2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf1(le9 le9Var, Callback callback, String str, String str2, Callback callback2) {
        super(le9Var, callback);
        this.l = str;
        this.j = str2;
        this.k = callback2;
        this.m = le9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf1(le9 le9Var, j12 j12Var, String str, orb orbVar, qe9 qe9Var) {
        super(le9Var, j12Var);
        this.l = str;
        this.k = orbVar;
        this.j = qe9Var;
        Objects.requireNonNull(le9Var);
        this.m = le9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf1(le9 le9Var, ve9 ve9Var, String str, orb orbVar, su suVar) {
        super(le9Var, ve9Var);
        this.l = str;
        this.k = orbVar;
        this.j = suVar;
        Objects.requireNonNull(le9Var);
        this.m = le9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf1(yf1 yf1Var, ygf ygfVar, OperaAccessToken operaAccessToken, orb orbVar, ygf ygfVar2) {
        super(yf1Var, ygfVar);
        this.l = yf1Var;
        this.j = operaAccessToken;
        this.k = orbVar;
        this.m = ygfVar2;
    }

    @Override // defpackage.p43
    public final RealCall b() {
        byte b = this.i;
        Object obj = this.j;
        Object obj2 = this.k;
        Object obj3 = this.l;
        Object obj4 = this.m;
        switch (b) {
            case 0:
                yf1 yf1Var = (yf1) obj3;
                t9f t9fVar = (t9f) yf1Var.a.get();
                int i = yf1.e;
                fvh fvhVarA = yf1Var.a("anonymous/signup", sko.j("Bearer ", ((OperaAccessToken) obj).a), new String[0]);
                qvh qvhVar = rvh.Companion;
                String string = ((orb) obj2).a.toString();
                esd esdVar = s43.c;
                qvhVar.getClass();
                fvhVarA.e(RequestBuilder.POST, qvh.b(string, esdVar));
                return j7c.q(fvhVarA, t9fVar);
            case 1:
                di2 di2Var = (di2) obj4;
                t9f t9fVar2 = (t9f) di2Var.a.get();
                fvh fvhVarA2 = di2Var.a("flow/login", di2.c((OperaAccessToken) obj), new String[0]);
                orb orbVar = (orb) obj2;
                fvhVarA2.e(RequestBuilder.POST, rvh.create(orbVar == null ? "" : orbVar.a.toString(), s43.c));
                return t9fVar2.c(new kvh(fvhVarA2));
            case 2:
                le9 le9Var = (le9) obj4;
                t9f t9fVar3 = (t9f) le9Var.a.get();
                fvh fvhVarA3 = le9Var.a("pairing-tokens", (String) obj3, new String[0]);
                fvhVarA3.e(RequestBuilder.POST, rvh.create(((orb) obj2).a.toString(), s43.c));
                return t9fVar3.c(new kvh(fvhVarA3));
            case 3:
                le9 le9Var2 = (le9) obj4;
                t9f t9fVar4 = (t9f) le9Var2.a.get();
                fvh fvhVarA4 = le9Var2.a(Constants.Keys.MESSAGES, (String) obj3, new String[0]);
                fvhVarA4.e(RequestBuilder.POST, rvh.create(((orb) obj2).a.toString(), s43.c));
                return t9fVar4.c(new kvh(fvhVarA4));
            default:
                le9 le9Var3 = (le9) obj4;
                ArrayList arrayList = new ArrayList();
                String str = (String) obj3;
                if (str != null) {
                    arrayList.add(Constants.Params.TYPE);
                    arrayList.add(str);
                }
                return j7c.q(le9Var3.a("encryption-keys", (String) obj, (String[]) arrayList.toArray(new String[0])), (t9f) le9Var3.a.get());
        }
    }

    @Override // defpackage.p43
    public final q43 c(pzh pzhVar) throws JSONException {
        switch (this.i) {
            case 1:
                if (pzhVar.d != 412) {
                    return new q43(pzhVar);
                }
                try {
                    JSONObject jSONObject = new JSONObject(pzhVar.g.string());
                    Object objU = orb.u(jSONObject.get("error"));
                    if (objU != null) {
                        String.valueOf(objU);
                        return new q43(412, jSONObject.toString());
                    }
                    throw new JSONException("error is null");
                } catch (IOException e) {
                    return new q43(-2, e.getMessage());
                } catch (JSONException unused) {
                    return new q43(-1, "Bad JSON");
                }
            default:
                return super.c(pzhVar);
        }
    }

    @Override // defpackage.p43
    public final boolean d(pzh pzhVar) {
        switch (this.i) {
            case 2:
                return pzhVar.d == 201;
            case 3:
                return pzhVar.d == 201;
            default:
                return super.d(pzhVar);
        }
    }

    @Override // defpackage.r43
    public final void g(orb orbVar) throws JSONException {
        byte b = this.i;
        Object obj = this.j;
        byte b2 = 4;
        switch (b) {
            case 0:
                e(new xa((ygf) this.m, orbVar.e("token"), (byte) 16));
                break;
            case 1:
                e(new bi2((fi2) this.l, orbVar.e("token"), (byte) 0));
                break;
            case 2:
                e(new cn7((su) obj, new ke9(orbVar), (byte) 23));
                break;
            case 3:
                e(new oi2((qe9) obj, orbVar.a.getLong("id"), b2));
                break;
            default:
                e(new npl((Callback) this.k, new rwl(orbVar), (byte) 4));
                break;
        }
    }
}
