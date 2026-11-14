package defpackage;

/* loaded from: classes.dex */
public final class dyh {
    public final vec a;
    public final long b;
    public final long c;
    public final long d;

    public dyh(vec vecVar, long j, long j2, long j3) {
        this.a = vecVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyh)) {
            return false;
        }
        dyh dyhVar = (dyh) obj;
        if (!this.a.equals(dyhVar.a)) {
            return false;
        }
        long j = dyhVar.b;
        int i = u95.h;
        return jgm.a(this.b, j) && jgm.a(this.c, dyhVar.c) && jgm.a(this.d, dyhVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.d) + z1m.e(z1m.e(iHashCode, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strH = u95.h(this.b);
        String strH2 = u95.h(this.c);
        String strH3 = u95.h(this.d);
        StringBuilder sb = new StringBuilder("ResolvedBannerColors(background=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(strH);
        sb.append(", buttonBg=");
        return sko.n(sb, strH2, ", buttonText=", strH3, ")");
    }
}
