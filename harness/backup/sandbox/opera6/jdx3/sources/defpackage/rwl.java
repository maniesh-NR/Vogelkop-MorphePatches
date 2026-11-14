package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class rwl {
    public final String a;
    public final String b;
    public final String c;

    public rwl(orb orbVar) throws JSONException {
        this.a = orbVar.e("encrypted_by");
        this.b = orbVar.e("content");
        this.c = orbVar.e("signature");
        orbVar.e("created_at");
    }
}
