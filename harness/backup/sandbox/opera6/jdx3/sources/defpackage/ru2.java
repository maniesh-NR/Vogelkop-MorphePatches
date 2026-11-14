package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ru2 extends v0g {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final String g;

    public ru2(int i, boolean z, String str, int i2, String str2, int i3, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = z;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru2)) {
            return false;
        }
        ru2 ru2Var = (ru2) obj;
        return this.f == ru2Var.f && this.a == ru2Var.a && this.d == ru2Var.d && this.e == ru2Var.e && Objects.equals(this.b, ru2Var.b) && Objects.equals(this.c, ru2Var.c) && Objects.equals(this.g, ru2Var.g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.g) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.b) + (((((((Boolean.hashCode(this.f) * 31) + this.a) * 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.a), this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f), this.g};
        String[] strArrSplit = "a;b;c;d;e;f;g".length() == 0 ? new String[0] : "a;b;c;d;e;f;g".split(";");
        StringBuilder sb = new StringBuilder(ru2.class.getSimpleName());
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
