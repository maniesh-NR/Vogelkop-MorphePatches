package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class my8 extends dy8 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public my8(orb orbVar, String str) {
        super(orbVar, str);
        this.c = orbVar.m("request_id", "");
        this.d = orbVar.e("publisher_id");
        this.e = orbVar.e("origin");
        this.f = orbVar.m("news_entry_id", "");
        this.g = orbVar.m("infra_feedback", "");
    }

    @Override // defpackage.dy8
    public void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        String str = this.c;
        if (str != null) {
            orbVar.p(str, "request_id");
        }
        orbVar.p(this.d, "publisher_id");
        orbVar.p(this.e, "origin");
        String str2 = this.f;
        if (str2 != null) {
            orbVar.p(str2, "news_entry_id");
        }
        String str3 = this.g;
        if (str3 != null) {
            orbVar.p(str3, "infra_feedback");
        }
    }
}
