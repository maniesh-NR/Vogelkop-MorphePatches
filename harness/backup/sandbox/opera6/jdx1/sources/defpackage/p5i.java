package defpackage;

/* loaded from: classes.dex */
public final class p5i implements g6b {
    public final boolean a;
    public final float b;
    public final long c;

    public p5i(long j, float f, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.g6b
    public final f17 a(lde ldeVar) {
        return new v17(ldeVar, this.a, this.b, new u17(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5i)) {
            return false;
        }
        p5i p5iVar = (p5i) obj;
        if (this.a != p5iVar.a || !gh7.b(this.b, p5iVar.b)) {
            return false;
        }
        long j = p5iVar.c;
        int i = u95.h;
        return jgm.a(this.c, j);
    }

    @Override // defpackage.g6b
    public final int hashCode() {
        int iD = sko.d(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.c) + iD;
    }
}
