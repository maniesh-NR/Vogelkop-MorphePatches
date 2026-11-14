package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jm6 extends v0g {
    public final km6 a;
    public final String b;

    public jm6(km6 km6Var, String str) {
        this.a = km6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jm6)) {
            return false;
        }
        jm6 jm6Var = (jm6) obj;
        return Objects.equals(this.a, jm6Var.a) && Objects.equals(this.b, jm6Var.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Objects.hashCode(this.a) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
        StringBuilder sb = new StringBuilder(jm6.class.getSimpleName());
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
