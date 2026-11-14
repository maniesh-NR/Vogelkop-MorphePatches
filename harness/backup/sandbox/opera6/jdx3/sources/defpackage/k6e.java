package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class k6e extends v0g {
    public final cq5 a;
    public final plh b;

    public k6e(cq5 cq5Var, plh plhVar) {
        this.a = cq5Var;
        this.b = plhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k6e)) {
            return false;
        }
        k6e k6eVar = (k6e) obj;
        return this.a == k6eVar.a && this.b == k6eVar.b;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Objects.hashCode(this.a) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
        StringBuilder sb = new StringBuilder(k6e.class.getSimpleName());
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
