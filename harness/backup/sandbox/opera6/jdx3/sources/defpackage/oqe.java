package defpackage;

/* loaded from: classes.dex */
public abstract class oqe {
    public String a;
    public final String b;
    public final String c;
    public final qre d;

    public oqe(String str, String str2, qre qreVar) {
        this.b = str;
        this.c = str2;
        this.d = qreVar;
    }

    public boolean a() {
        String str = this.c;
        return ("top_news_group".equals(str) || "roundups".equals(str)) ? false : true;
    }
}
