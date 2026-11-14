package defpackage;

/* loaded from: classes.dex */
public final class m8b {
    public final int a;
    public final int b;
    public final int c;

    public m8b(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8b)) {
            return false;
        }
        m8b m8bVar = (m8b) obj;
        return this.a == m8bVar.a && this.b == m8bVar.b && this.c == m8bVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputConfigData(width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", format=");
        return fki.s(sb, this.c, ')');
    }
}
