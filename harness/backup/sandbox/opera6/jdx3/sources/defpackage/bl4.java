package defpackage;

/* loaded from: classes.dex */
public final class bl4 {
    public final boolean a;
    public final na2 b;

    public bl4(boolean z, na2 na2Var) {
        this.a = z;
        this.b = na2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl4)) {
            return false;
        }
        bl4 bl4Var = (bl4) obj;
        return this.a == bl4Var.a && this.b.equals(bl4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
