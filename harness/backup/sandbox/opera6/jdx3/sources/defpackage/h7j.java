package defpackage;

/* loaded from: classes.dex */
public final class h7j extends v0g {
    public final boolean a;
    public final op0 b;

    public h7j(boolean z, op0 op0Var) {
        this.a = z;
        this.b = op0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h7j)) {
            return false;
        }
        h7j h7jVar = (h7j) obj;
        return this.a == h7jVar.a && this.b == h7jVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.a), this.b};
        String[] strArrSplit = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
        StringBuilder sb = new StringBuilder(h7j.class.getSimpleName());
        sb.append("[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
