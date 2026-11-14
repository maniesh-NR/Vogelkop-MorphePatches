package defpackage;

/* loaded from: classes.dex */
public final class mu4 {
    public final ou4 a;
    public final String b;

    public mu4(ou4 ou4Var, String str) {
        this.a = ou4Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu4)) {
            return false;
        }
        mu4 mu4Var = (mu4) obj;
        return this.a == mu4Var.a && this.b.equals(mu4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatMessage(author=" + this.a + ", msg=" + this.b + ")";
    }
}
