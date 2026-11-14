package defpackage;

import com.leanplum.internal.Constants;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class whi implements itm {
    public final String a;

    public whi(String str) {
        this.a = str;
    }

    @Override // defpackage.itm
    public final orb a() throws JSONException {
        orb orbVarP = vep.p(Constants.Params.TYPE, "sandboxed");
        orbVarP.p(this.a, "id");
        return orbVarP;
    }
}
