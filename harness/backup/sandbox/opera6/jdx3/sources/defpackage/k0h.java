package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class k0h implements kz3 {
    public final lz3 a;
    public final j0h b = new j0h(this);
    public boolean c;
    public final /* synthetic */ l0h d;

    public k0h(l0h l0hVar, lz3 lz3Var) {
        this.d = l0hVar;
        this.a = lz3Var;
    }

    @Override // defpackage.kz3
    public final void b(hjm hjmVar) {
        this.a.c.c(this);
        l0h l0hVar = this.d;
        gbf gbfVar = l0hVar.e;
        gbfVar.p.c(this.b);
        if (hjmVar != hjm.a || this.c) {
            return;
        }
        l0hVar.e.m.B();
    }

    @Override // defpackage.kz3
    public final void d() {
        this.c = true;
    }

    @Override // defpackage.kz3
    public final void g(lz3 lz3Var) {
        l0h l0hVar = this.d;
        l0hVar.b.getLifecycle().b(l0hVar);
        l0hVar.f.v(l0hVar.g);
        gbf gbfVar = l0hVar.e;
        gbfVar.p.b(this.b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        nv6 nv6VarB = ru9.c(l0hVar.a).b();
        ((SharedPreferences.Editor) nv6VarB.a).putLong("privacy_monitor.promotion.shown.timestamp", jCurrentTimeMillis);
        nv6VarB.w();
    }
}
