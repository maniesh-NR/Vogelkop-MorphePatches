package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ie9 {
    public final String a;
    public final Map b;
    public final long c;
    public final long d;

    public ie9(orb orbVar) throws JSONException {
        String strE = orbVar.e(ImagesContract.URL);
        JSONObject jSONObject = orbVar.a;
        this.a = strE;
        orb orbVarC = orbVar.c("fields");
        JSONObject jSONObject2 = orbVarC.a;
        HashMap map = new HashMap(jSONObject2.length());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, orbVarC.e(next));
        }
        this.b = Collections.unmodifiableMap(map);
        this.c = jSONObject.getLong("expires_at");
        this.d = jSONObject.getLong("max_content_size");
    }
}
