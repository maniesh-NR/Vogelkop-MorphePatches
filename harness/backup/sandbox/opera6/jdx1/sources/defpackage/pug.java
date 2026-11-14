package defpackage;

/* loaded from: classes.dex */
public final class pug implements sug {
    public final dbh a;
    public final sug b;

    public pug(dbh dbhVar, sug sugVar) {
        this.a = dbhVar;
        this.b = sugVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pug)) {
            return false;
        }
        pug pugVar = (pug) obj;
        return this.a.equals(pugVar.a) && this.b.equals(pugVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
