package defpackage;

/* loaded from: classes.dex */
public final class dff implements fff {
    public final yg3 a;
    public final long b;
    public final boolean c;

    public dff(yg3 yg3Var, long j, boolean z) {
        this.a = yg3Var;
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.fff
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dff)) {
            return false;
        }
        dff dffVar = (dff) obj;
        if (!this.a.equals(dffVar.a)) {
            return false;
        }
        long j = dffVar.b;
        int i = u95.h;
        return jgm.a(this.b, j) && this.c == dffVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u95.h;
        igm igmVar = jgm.b;
        return Boolean.hashCode(this.c) + z1m.e(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
