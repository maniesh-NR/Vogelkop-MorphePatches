package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class hzc {
    public static final gzc c;
    public final etb a;
    public final String b;

    static {
        List listSingletonList = Collections.singletonList(new fzc());
        etb etbVar = new etb();
        etbVar.a = g73.a;
        etbVar.b = listSingletonList;
        c = new gzc(etbVar, "");
    }

    public hzc(etb etbVar, String str) {
        this.a = etbVar;
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public final void b(eaj eajVar, String str, String str2, Throwable th) {
        for (czc czcVar : this.a.b) {
            czcVar.getClass();
            czcVar.a(eajVar, str2, str, th);
        }
    }

    public final hzc c(String str) {
        return new hzc(this.a, str);
    }
}
