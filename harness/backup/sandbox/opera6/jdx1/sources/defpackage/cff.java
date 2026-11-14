package defpackage;

/* loaded from: classes.dex */
public final class cff implements fff {
    public final long a;

    public cff(long j) {
        this.a = j;
    }

    @Override // defpackage.fff
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cff)) {
            return false;
        }
        long j = ((cff) obj).a;
        int i = u95.h;
        return jgm.a(this.a, j);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
