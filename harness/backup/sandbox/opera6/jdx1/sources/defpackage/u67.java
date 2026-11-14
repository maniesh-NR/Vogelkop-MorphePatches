package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class u67 {
    public static final u67 e = new r05(0).t();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        String str = tym.a;
        f = "0";
        g = "1";
        h = "2";
        i = "3";
    }

    public u67(r05 r05Var) {
        this.a = r05Var.b;
        this.b = r05Var.c;
        this.c = r05Var.d;
        this.d = (String) r05Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u67)) {
            return false;
        }
        u67 u67Var = (u67) obj;
        return this.a == u67Var.a && this.b == u67Var.b && this.c == u67Var.c && Objects.equals(this.d, u67Var.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
