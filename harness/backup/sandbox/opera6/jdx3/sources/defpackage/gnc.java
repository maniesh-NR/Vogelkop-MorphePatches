package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class gnc implements v9i {
    public final /* synthetic */ hnc a;

    public gnc(hnc hncVar) {
        this.a = hncVar;
    }

    public final void a(Object obj, HashMap map) {
        hnc hncVar = this.a;
        hncVar.q.S();
        if (hncVar.r) {
            hncVar.p.B0(hncVar.b, 20L, TimeUnit.SECONDS);
        }
    }

    public final void b(r72 r72Var, Map map) {
        this.a.a(true);
    }

    public final void c(HashMap map) {
    }
}
