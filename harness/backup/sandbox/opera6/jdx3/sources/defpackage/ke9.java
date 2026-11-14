package defpackage;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ke9 {
    public final String a;
    public final long b;

    public ke9(orb orbVar) throws JSONException {
        this.a = orbVar.e("token");
        String strE = orbVar.e("created_at");
        int i = le9.g;
        try {
            yjb.a(strE);
            orbVar.e("created_by");
            this.b = TimeUnit.SECONDS.toMillis(orbVar.a.getInt("ttl"));
        } catch (ParseException e) {
            throw new JSONException("Bad date: " + e.getMessage());
        }
    }
}
