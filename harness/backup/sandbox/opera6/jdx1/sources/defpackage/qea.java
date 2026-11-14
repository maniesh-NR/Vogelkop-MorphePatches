package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class qea extends j73 {
    public final List d;
    public final long e;

    public qea(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // defpackage.ggd
    public final long e() {
        a();
        return this.e + ((cfa) this.d.get((int) this.c)).e;
    }

    @Override // defpackage.ggd
    public final long f() {
        a();
        cfa cfaVar = (cfa) this.d.get((int) this.c);
        return this.e + cfaVar.e + cfaVar.c;
    }
}
