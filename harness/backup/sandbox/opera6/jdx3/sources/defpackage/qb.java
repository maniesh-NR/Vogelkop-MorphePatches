package defpackage;

import android.content.SharedPreferences;
import com.leanplum.internal.Constants;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qb {
    public final ji a;
    public final yv3 b;
    public final ob c;
    public final kze d;
    public ipf e;
    public s62 f;
    public esk g;
    public rn9 h;

    public qb(ji jiVar, xb xbVar, ndc ndcVar, yv3 yv3Var) {
        this.a = jiVar;
        this.b = yv3Var;
        byte b = 0;
        this.c = new ob(this, b);
        kze kzeVar = xbVar.d;
        this.d = kzeVar;
        this.e = epf.a;
        kzeVar.j(ndcVar, new pb(new z3(this, (byte) 3), b));
    }

    public final void a() {
        nv6 nv6VarB = ru9.c(this.a.b).b();
        ((SharedPreferences.Editor) nv6VarB.a).remove("aria.sandbox.merge");
        nv6VarB.w();
    }

    public final void b(String str) throws JSONException {
        s62 s62Var;
        kze kzeVar;
        ehf ehfVar = (ehf) this.b.get();
        if (ehfVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Constants.Params.USER_ID, orb.t(str));
                nv6 nv6VarB = ru9.c(this.a.b).b();
                ((SharedPreferences.Editor) nv6VarB.a).putString("aria.sandbox.merge", jSONObject.toString());
                nv6VarB.w();
                if (this.h != null || (s62Var = this.f) == null || (kzeVar = s62Var.t) == null || !((Boolean) kzeVar.g()).booleanValue()) {
                    return;
                }
                rn9 rn9Var = new rn9(this, (Function0) new lb((byte) 0));
                this.h = rn9Var;
                rn9Var.O(ehfVar);
            } catch (JSONException e) {
                t3p.n(e);
            }
        }
    }
}
