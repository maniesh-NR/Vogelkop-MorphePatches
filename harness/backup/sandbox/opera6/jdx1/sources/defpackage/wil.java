package defpackage;

/* loaded from: classes.dex */
public final class wil {
    public static final wil c = new wil(0L, 3);
    public final long a;
    public final long b;

    public /* synthetic */ wil(long j, int i) {
        this((i & 1) != 0 ? rih.p(0) : j, rih.p(0));
    }

    public wil(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wil)) {
            return false;
        }
        wil wilVar = (wil) obj;
        return rkl.a(this.a, wilVar.a) && rkl.a(this.b, wilVar.b);
    }

    public final int hashCode() {
        skl[] sklVarArr = rkl.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return sko.l("TextIndent(firstLine=", rkl.d(this.a), ", restLine=", rkl.d(this.b), ")");
    }
}
