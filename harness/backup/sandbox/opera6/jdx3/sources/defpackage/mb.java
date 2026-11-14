package defpackage;

import com.leanplum.internal.Constants;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.api.Callback;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class mb implements chf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.chf
    public final void a(OperaAccessToken operaAccessToken) throws JSONException {
        p62 p62VarC;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rn9 rn9Var = (rn9) obj2;
                if (!rn9Var.b) {
                    String str = ((ehf) obj).a;
                    String str2 = operaAccessToken.a;
                    qb qbVar = (qb) rn9Var.d;
                    s62 s62Var = qbVar.f;
                    if (s62Var != null && (p62VarC = s62Var.c()) != null) {
                        q3 q3Var = new q3(rn9Var, qbVar, (byte) 2);
                        ole oleVar = p62VarC.a;
                        bi biVar = new bi(q3Var, (byte) 25);
                        oleVar.getClass();
                        vpb vpbVar = new vpb();
                        orb orbVar = new orb();
                        vpbVar.a(orbVar);
                        orbVar.p(o18.j("id", str, "token", str2), "userToMerge");
                        qq8 qq8Var = (qq8) oleVar.a;
                        String strH = qq8Var.h();
                        orb orbVarJ = o18.j("jsonrpc", "2.0", "method", "actions.v1.mergeUser");
                        orbVarJ.p(vpbVar, Constants.Params.PARAMS);
                        orbVarJ.p(strH, "id");
                        qq8Var.l(orbVarJ, new t02(biVar, (byte) 9));
                        break;
                    }
                }
                break;
            case 1:
                ((ghj) obj2).e = new fhj(operaAccessToken, true);
                ((Callback) obj).run(new jsl(operaAccessToken.a));
                break;
            default:
                ((xbf) obj2).g = operaAccessToken;
                ((Callback) obj).run(operaAccessToken.a);
                break;
        }
    }

    @Override // defpackage.chf
    public final void b() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rn9 rn9Var = (rn9) obj2;
                if (!rn9Var.b) {
                    rn9Var.k();
                    break;
                }
                break;
            case 1:
                ghj ghjVar = (ghj) obj2;
                fhj fhjVar = ghjVar.e;
                if (fhjVar != null && fhjVar.b) {
                    ghjVar.e = null;
                }
                ((Callback) obj).run(hsl.a);
                break;
            default:
                ((xbf) obj2).g = null;
                ((Callback) obj).run(null);
                break;
        }
    }

    @Override // defpackage.chf
    public final void c() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rn9 rn9Var = (rn9) obj2;
                if (!rn9Var.b) {
                    ((qb) rn9Var.d).a();
                    rn9Var.k();
                    break;
                }
                break;
            case 1:
                ghj ghjVar = (ghj) obj2;
                fhj fhjVar = ghjVar.e;
                if (fhjVar != null && fhjVar.b) {
                    ghjVar.e = null;
                }
                ((Callback) obj).run(hsl.a);
                break;
            default:
                ((xbf) obj2).g = null;
                ((Callback) obj).run(null);
                break;
        }
    }
}
