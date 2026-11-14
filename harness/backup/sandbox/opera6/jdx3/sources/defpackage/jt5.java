package defpackage;

import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class jt5 {
    public final Regex a;
    public final String b;
    public final String c;

    public jt5(Regex regex, String str, String str2) {
        this.a = regex;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jt5) {
            jt5 jt5Var = (jt5) obj;
            if (this.a == jt5Var.a && this.b.equals(jt5Var.b) && this.c.equals(jt5Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
