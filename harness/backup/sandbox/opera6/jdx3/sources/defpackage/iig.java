package defpackage;

/* loaded from: classes.dex */
public final class iig extends v0g {
    public final int a;

    public iig(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof iig) && this.a == ((iig) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.a)};
        String[] strArrSplit = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder(iig.class.getSimpleName());
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
