package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class pq4 implements cum {
    public String a;
    public String b;

    public /* synthetic */ pq4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cum
    public final orb a() throws JSONException {
        orb orbVar = new orb();
        orbVar.p(this.a, "locationId");
        orbVar.p(this.b, "locationName");
        return orbVar;
    }
}
