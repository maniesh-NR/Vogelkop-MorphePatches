package androidx.media3.exoplayer.dash;

import defpackage.bd6;
import defpackage.d5o;
import defpackage.fb6;
import defpackage.ird;
import defpackage.qjd;
import defpackage.r16;
import defpackage.rq6;
import defpackage.ya6;
import defpackage.z8b;
import java.util.List;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements ird {
    public final k5o a;
    public final bd6 b;
    public final d5o c;
    public final ir5 d;
    public final i06 e;
    public final short f;
    public final int g;

    public DashMediaSource$Factory(bd6 bd6Var) {
        k5o k5oVar = new k5o(bd6Var);
        this.a = k5oVar;
        this.b = bd6Var;
        this.c = new d5o((byte) 27);
        this.e = new i06((byte) 2);
        this.f = (short) 30000;
        this.g = 5000000;
        this.d = new ir5();
        ((rq6) k5oVar.c).b = true;
    }

    @Override // defpackage.ird
    public final void b() {
        ((rq6) this.a.c).b = true;
    }

    @Override // defpackage.ird
    public final void c() {
        Object obj = this.a.c;
    }

    @Override // defpackage.ird
    public final void d(r16 r16Var) {
        ((rq6) this.a.c).a = r16Var;
    }

    @Override // defpackage.ird
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final fb6 a(qjd qjdVar) {
        qjdVar.b.getClass();
        f94 ya6Var = new ya6();
        List list = qjdVar.b.e;
        return new fb6(qjdVar, this.b, !list.isEmpty() ? new z8b(ya6Var, list) : ya6Var, this.a, this.d, this.c.x(qjdVar), this.e, this.f, this.g);
    }
}
