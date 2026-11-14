package defpackage;

/* loaded from: classes.dex */
public final class za5 implements pil {
    public final long a;

    public za5(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        b8b.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.pil
    public final long a() {
        return this.a;
    }

    @Override // defpackage.pil
    public final float b() {
        return u95.c(this.a);
    }

    @Override // defpackage.pil
    public final dz3 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za5)) {
            return false;
        }
        long j = ((za5) obj).a;
        int i = u95.h;
        return jgm.a(this.a, j);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return sko.k("ColorStyle(value=", u95.h(this.a), ")");
    }
}
