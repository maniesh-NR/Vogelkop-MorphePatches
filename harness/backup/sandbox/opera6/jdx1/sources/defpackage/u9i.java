package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u9i implements v9i {
    public final /* synthetic */ long a;
    public final /* synthetic */ pr b;

    public u9i(pr prVar, long j) {
        this.a = j;
        this.b = prVar;
    }

    @Override // defpackage.v9i
    public final void a(Object obj, HashMap map) {
        this.b.B(this.a, true, map, obj, true);
    }

    @Override // defpackage.v9i
    public final void b(r72 r72Var, Map map) {
        orb orbVar = new orb();
        byte b = r72Var.a;
        orbVar.p(b != 1 ? b != 2 ? b != 3 ? "unknown" : "local-rpc" : "remote-rpc" : "method", "layer");
        orbVar.p((String) r72Var.b, "message");
        String str = (String) r72Var.c;
        if (str != null) {
            orbVar.p(str, "domain");
        }
        String str2 = (String) r72Var.d;
        if (str2 != null) {
            orbVar.p(str2, "code");
        }
        this.b.B(this.a, false, map, orbVar, true);
    }

    @Override // defpackage.v9i
    public final void c(HashMap map) {
        this.b.B(this.a, true, map, null, false);
    }
}
