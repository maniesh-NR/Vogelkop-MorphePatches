package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v7h extends n1 {
    public final wo c;
    public final /* synthetic */ w7h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7h(w7h w7hVar, wo woVar) {
        super(w7hVar);
        Objects.requireNonNull(w7hVar);
        this.d = w7hVar;
        this.c = woVar;
    }

    @Override // defpackage.n1
    public final dz V(cz czVar) {
        w7h w7hVar = this.d;
        return new iu9(w7hVar.a, w7hVar.d, w7hVar.f, w7hVar.m, w7hVar.j, this.c, w7hVar.b(czVar), w7hVar.n, w7hVar.s);
    }

    @Override // defpackage.n1
    public final cz W() {
        wo woVar = this.c;
        return new cz(woVar.d, rm.NATIVE, woVar.i.concat(woVar.h));
    }
}
