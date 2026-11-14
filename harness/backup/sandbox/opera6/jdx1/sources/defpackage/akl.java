package defpackage;

/* loaded from: classes.dex */
public final class akl {
    public final long a;
    public final long b;

    public akl(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akl)) {
            return false;
        }
        akl aklVar = (akl) obj;
        long j = aklVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, aklVar.b);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return sko.l("SelectionColors(selectionHandleColor=", u95.h(this.a), ", selectionBackgroundColor=", u95.h(this.b), ")");
    }
}
