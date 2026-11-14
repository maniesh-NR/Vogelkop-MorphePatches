package defpackage;

/* loaded from: classes.dex */
public final class zuf {
    public final long a;
    public final zvf b;

    public zuf() {
        long jD = cs5.d(4284900966L);
        zvf zvfVarC = a26.c(3, 0.0f, 0.0f);
        this.a = jD;
        this.b = zvfVarC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zuf.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        zuf zufVar = (zuf) obj;
        long j = zufVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && this.b.equals(zufVar.b);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + u95.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
