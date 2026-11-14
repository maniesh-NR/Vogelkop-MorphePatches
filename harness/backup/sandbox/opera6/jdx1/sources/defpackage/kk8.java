package defpackage;

/* loaded from: classes.dex */
public final class kk8 {
    public final mk8 a;
    public final mk8 b;
    public final mk8 c;
    public final mk8 d;
    public final mk8 e;
    public final mk8 f;
    public final mk8 g;
    public final mk8 h;
    public final long i;
    public final long j;

    public kk8(mk8 mk8Var, mk8 mk8Var2, mk8 mk8Var3, mk8 mk8Var4, mk8 mk8Var5, mk8 mk8Var6, mk8 mk8Var7, mk8 mk8Var8, long j, long j2) {
        this.a = mk8Var;
        this.b = mk8Var2;
        this.c = mk8Var3;
        this.d = mk8Var4;
        this.e = mk8Var5;
        this.f = mk8Var6;
        this.g = mk8Var7;
        this.h = mk8Var8;
        this.i = j;
        this.j = j2;
    }

    public final mk8 a(jk8 jk8Var) {
        switch (jk8Var.ordinal()) {
            case 0:
                return this.a;
            case 1:
                return this.b;
            case 2:
                return this.c;
            case 3:
                return this.d;
            case 4:
                return this.e;
            case 5:
                return this.f;
            case 6:
                return this.g;
            case 7:
                return this.h;
            default:
                h9o.p();
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk8)) {
            return false;
        }
        kk8 kk8Var = (kk8) obj;
        if (!this.a.equals(kk8Var.a) || !this.b.equals(kk8Var.b) || !this.c.equals(kk8Var.c) || !this.d.equals(kk8Var.d) || !this.e.equals(kk8Var.e) || !this.f.equals(kk8Var.f) || !this.g.equals(kk8Var.g) || !this.h.equals(kk8Var.h)) {
            return false;
        }
        long j = kk8Var.i;
        int i = u95.h;
        return jgm.a(this.i, j) && jgm.a(this.j, kk8Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.j) + z1m.e(iHashCode, 31, this.i);
    }

    public final String toString() {
        String strH = u95.h(this.i);
        String strH2 = u95.h(this.j);
        StringBuilder sb = new StringBuilder("ExtendedColorScheme(forrest=");
        sb.append(this.a);
        sb.append(", purple=");
        sb.append(this.b);
        sb.append(", crystal=");
        sb.append(this.c);
        sb.append(", bean=");
        sb.append(this.d);
        sb.append(", persian=");
        sb.append(this.e);
        sb.append(", pink=");
        sb.append(this.f);
        sb.append(", cobaltBlue=");
        sb.append(this.g);
        sb.append(", cheese=");
        sb.append(this.h);
        sb.append(", neutralDisabled=");
        return sko.n(sb, strH, ", neutralOnDisabled=", strH2, ")");
    }
}
