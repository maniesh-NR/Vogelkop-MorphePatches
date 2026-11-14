package defpackage;

/* loaded from: classes.dex */
public final class n1n extends v0g {
    public final int a;
    public final int b;
    public final float c;

    public n1n(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1n)) {
            return false;
        }
        n1n n1nVar = (n1n) obj;
        return this.a == n1nVar.a && this.b == n1nVar.b && Float.compare(this.c, n1nVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.a), Integer.valueOf(this.b), Float.valueOf(this.c)};
        String[] strArrSplit = "a;b;c".length() == 0 ? new String[0] : "a;b;c".split(";");
        StringBuilder sb = new StringBuilder(n1n.class.getSimpleName());
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
