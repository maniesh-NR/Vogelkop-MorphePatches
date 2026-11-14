package defpackage;

/* loaded from: classes.dex */
public final class js1 {
    public final c7j a;
    public final int b;
    public final boolean c;

    public js1(c7j c7jVar, int i, boolean z) {
        this.a = c7jVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js1)) {
            return false;
        }
        js1 js1Var = (js1) obj;
        return this.a == js1Var.a && this.b == js1Var.b && this.c == js1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rfp.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
