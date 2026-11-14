package defpackage;

import com.leanplum.internal.Constants;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class nhe implements itm {
    public final String a;
    public final String b;

    public nhe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.itm
    public final orb a() throws JSONException {
        orb orbVarP = vep.p(Constants.Params.TYPE, "named");
        orbVarP.p(this.a, "id");
        orbVarP.p(this.b, Constants.Params.EMAIL);
        return orbVarP;
    }
}
