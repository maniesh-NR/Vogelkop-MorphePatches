package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class zx8 extends dy8 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public zx8(msh mshVar, String str, String str2) {
        super(str);
        p12 p12Var = mshVar.v;
        this.c = (String) p12Var.a;
        if (mshVar instanceof dre) {
            log logVar = ((dre) mshVar).D;
            this.d = logVar.b;
            this.g = "clip";
            this.k = ((ou9) logVar).a;
            str2 = null;
            this.e = null;
            this.f = null;
            this.h = null;
            this.i = null;
            this.j = null;
        } else {
            this.d = (String) p12Var.b;
            this.e = (String) p12Var.f;
            this.f = (String) p12Var.e;
            this.g = mshVar.c;
            this.h = (String) p12Var.d;
            this.i = (String) p12Var.c;
            this.j = (String) p12Var.h;
            this.k = (String) p12Var.g;
        }
        this.l = str2;
    }

    public zx8(orb orbVar, String str) {
        super(orbVar, str);
        this.c = orbVar.e("request_id");
        this.d = orbVar.e("news_entry_id");
        this.e = orbVar.m("recommend_type", null);
        this.f = orbVar.m("category", null);
        this.g = orbVar.e("news_type");
        this.h = orbVar.m("hot_topic_id", null);
        this.i = orbVar.m("more_id", null);
        this.j = orbVar.m("related_original_news_entry_id", null);
        this.k = orbVar.m("infra_feedback", null);
        this.l = orbVar.m("origin", null);
    }

    @Override // defpackage.dy8
    public void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        orbVar.p(this.c, "request_id");
        orbVar.p(this.d, "news_entry_id");
        String str = this.e;
        if (str != null) {
            orbVar.p(str, "recommend_type");
        }
        String str2 = this.f;
        if (str2 != null) {
            orbVar.p(str2, "category");
        }
        orbVar.p(this.g, "news_type");
        String str3 = this.h;
        if (str3 != null) {
            orbVar.p(str3, "hot_topic_id");
        }
        String str4 = this.i;
        if (str4 != null) {
            orbVar.p(str4, "more_id");
        }
        String str5 = this.j;
        if (str5 != null) {
            orbVar.p(str5, "related_original_news_entry_id");
        }
        String str6 = this.k;
        if (str6 != null) {
            orbVar.p(str6, "infra_feedback");
        }
        String str7 = this.l;
        if (str7 != null) {
            orbVar.p(str7, "origin");
        }
    }
}
