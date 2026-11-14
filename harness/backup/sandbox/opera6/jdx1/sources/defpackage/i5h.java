package defpackage;

/* loaded from: classes.dex */
public final class i5h implements ird {
    public final bd6 a;
    public final r9g b;
    public final d5o c;
    public final i06 d;

    public i5h(bd6 bd6Var, mp6 mp6Var) {
        r9g r9gVar = new r9g(mp6Var, (byte) 11);
        d5o d5oVar = new d5o((byte) 27);
        i06 i06Var = new i06((byte) 2);
        this.a = bd6Var;
        this.b = r9gVar;
        this.c = d5oVar;
        this.d = i06Var;
    }

    @Override // defpackage.ird
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final j5h a(qjd qjdVar) {
        qjdVar.b.getClass();
        return new j5h(qjdVar, this.a, this.b, this.c.x(qjdVar), this.d, null);
    }
}
