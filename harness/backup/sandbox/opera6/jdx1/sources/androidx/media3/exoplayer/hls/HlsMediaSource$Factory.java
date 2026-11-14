package androidx.media3.exoplayer.hls;

import defpackage.bd6;
import defpackage.cl6;
import defpackage.d5o;
import defpackage.em7;
import defpackage.ffa;
import defpackage.hv5;
import defpackage.ird;
import defpackage.qjd;
import defpackage.r16;
import defpackage.rq6;
import defpackage.uq6;
import java.util.List;

/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements ird {
    public final qq6 a;
    public rq6 b;
    public r16 c;
    public final d5o h = new d5o((byte) 27);
    public final hv5 e = new hv5();
    public final cl6 f = uq6.o;
    public final i06 i = new i06((byte) 2);
    public final ir5 g = new ir5();
    public final boolean k = true;
    public final long l = -9223372036854775807L;
    public final boolean j = true;
    public boolean d = true;

    public HlsMediaSource$Factory(bd6 bd6Var) {
        this.a = new qq6(bd6Var, (byte) 0);
    }

    @Override // defpackage.ird
    public final void b() {
        this.d = true;
    }

    @Override // defpackage.ird
    public final void c() {
    }

    @Override // defpackage.ird
    public final void d(r16 r16Var) {
        this.c = r16Var;
    }

    @Override // defpackage.ird
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ffa a(qjd qjdVar) {
        qjdVar.b.getClass();
        rq6 rq6Var = this.b;
        if (rq6Var == null) {
            rq6Var = new rq6();
            rq6Var.a = new r16();
            this.b = rq6Var;
        }
        rq6 rq6Var2 = rq6Var;
        r16 r16Var = this.c;
        if (r16Var != null) {
            rq6Var2.a = r16Var;
        }
        rq6Var2.b = this.d;
        List list = qjdVar.b.e;
        boolean zIsEmpty = list.isEmpty();
        hv5 yqaVar = this.e;
        if (!zIsEmpty) {
            yqaVar = new yqa(yqaVar, list, (byte) 16);
        }
        em7 em7VarX = this.h.x(qjdVar);
        this.f.getClass();
        qq6 qq6Var = this.a;
        i06 i06Var = this.i;
        return new ffa(qjdVar, qq6Var, rq6Var2, this.g, em7VarX, i06Var, new uq6(qq6Var, i06Var, yqaVar), this.l, this.j, this.k ? 1 : 0);
    }
}
