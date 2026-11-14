package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class je9 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public je9(orb orbVar) throws JSONException {
        this.a = orbVar.a.getLong("id");
        this.b = orbVar.e("created_by");
        this.c = orbVar.e("metadata");
        this.d = orbVar.e("content");
        this.e = orbVar.m("content_url", "");
        String strM = orbVar.m("iv_metadata", null);
        String strM2 = orbVar.m("iv_content", null);
        if (strM != null && strM2 != null) {
            this.f = strM;
            this.g = strM2;
        } else {
            String strE = orbVar.e("iv");
            this.g = strE;
            this.f = strE;
        }
    }
}
