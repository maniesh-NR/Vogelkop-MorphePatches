package defpackage;

/* loaded from: classes.dex */
public final class uzf {
    public final c91 a;
    public final int b;
    public final int c;

    public uzf(c91 c91Var, int i, int i2) {
        this.a = c91Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uzf) {
            uzf uzfVar = (uzf) obj;
            if (this.a == uzfVar.a && this.b == uzfVar.b && this.c == uzfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rfp.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return p3p.k(this.c, ")", sb);
    }
}
