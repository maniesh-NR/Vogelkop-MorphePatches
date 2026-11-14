package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class x43 extends v0g {
    public final yul a;

    public x43(yul yulVar) {
        this.a = yulVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x43) && Objects.equals(this.a, ((x43) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] strArrSplit = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder(x43.class.getSimpleName());
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
