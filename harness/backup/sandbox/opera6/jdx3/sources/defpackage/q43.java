package defpackage;

import com.leanplum.internal.Constants;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q43 {
    public final int a;
    public final String b;

    public q43(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public q43(pzh pzhVar) throws JSONException {
        int i = pzhVar.d;
        this.a = i;
        String strValueOf = pzhVar.c;
        if (i / 100 == 4) {
            try {
                Object objU = orb.u(new JSONObject(pzhVar.g.string()).get(Constants.Params.MESSAGE));
                if (objU == null) {
                    throw new JSONException(Constants.Params.MESSAGE + " is null");
                }
                strValueOf = String.valueOf(objU);
            } catch (IOException | JSONException unused) {
            }
        }
        this.b = strValueOf;
    }

    public final String toString() {
        return "";
    }
}
