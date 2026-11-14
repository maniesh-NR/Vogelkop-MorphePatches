package defpackage;

/* loaded from: classes.dex */
public final class q8f {
    public final ook a;
    public final zzh b;

    public q8f(ook ookVar, zzh zzhVar) {
        this.a = ookVar;
        this.b = zzhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q8f) {
            q8f q8fVar = (q8f) obj;
            return this.a.equals(q8fVar.a) && this.b == q8fVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
