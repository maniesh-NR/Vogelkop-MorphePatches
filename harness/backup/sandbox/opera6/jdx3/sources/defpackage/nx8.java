package defpackage;

/* loaded from: classes.dex */
public final class nx8 {
    public final qx8 a;
    public final String b;
    public final String c;

    public nx8(qx8 qx8Var, String str, String str2) {
        this.a = qx8Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx8)) {
            return false;
        }
        nx8 nx8Var = (nx8) obj;
        return this.a == nx8Var.a && this.b.equals(nx8Var.b) && this.c.equals(nx8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Feedback(feedbackType=");
        sb.append(this.a);
        sb.append(", conversationId=");
        sb.append(this.b);
        sb.append(", messageId=");
        return z1m.l(sb, this.c, ")");
    }
}
