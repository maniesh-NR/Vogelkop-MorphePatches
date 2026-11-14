package defpackage;

/* loaded from: classes.dex */
public final class iwg {
    public static final iwg c = new iwg(hwg.a, 0);
    public static final iwg d = new iwg(hwg.f, 1);
    public final hwg a;
    public final int b;

    public iwg(hwg hwgVar, int i) {
        this.a = hwgVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iwg.class != obj.getClass()) {
            return false;
        }
        iwg iwgVar = (iwg) obj;
        return this.a == iwgVar.a && this.b == iwgVar.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "slice" : "meet");
        return sb.toString();
    }
}
