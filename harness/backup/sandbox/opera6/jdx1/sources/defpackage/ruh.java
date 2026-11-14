package defpackage;

/* loaded from: classes.dex */
public final class ruh implements h49 {
    public final byte a;
    public final e8m b;
    public final long c;

    /* JADX WARN: Multi-variable type inference failed */
    public ruh(int i, e8m e8mVar, long j) {
        puh puhVar = puh.a;
        this.a = i;
        this.b = e8mVar;
        this.c = j;
    }

    @Override // defpackage.we1
    public final y0n a(j8m j8mVar) {
        a1n a1nVarA = this.b.a(j8mVar);
        puh puhVar = puh.a;
        return new e1n(this.a, a1nVarA, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ruh) {
            ruh ruhVar = (ruh) obj;
            if (ruhVar.a == this.a && ruhVar.b.equals(this.b)) {
                puh puhVar = puh.a;
                if (ruhVar.c == this.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((puh.a.hashCode() + ((this.b.hashCode() + (this.a * 31)) * 31)) * 31);
    }
}
