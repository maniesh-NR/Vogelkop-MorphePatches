package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class fve extends pue {
    public final List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public fve(oqe oqeVar, List list, String str) {
        super(oqeVar, str, false);
        this.g = "top_news_group".equals(oqeVar.c);
        String str2 = oqeVar.c;
        this.h = "roundups".equals(str2);
        this.i = "audios".equals(str2);
        this.j = oqeVar.a();
        this.k = "carousel".equals(str2);
        this.f = list;
    }
}
