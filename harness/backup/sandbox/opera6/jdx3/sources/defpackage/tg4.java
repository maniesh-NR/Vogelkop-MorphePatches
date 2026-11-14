package defpackage;

/* loaded from: classes.dex */
public final class tg4 {
    public final boolean a;
    public final boolean b;

    public tg4(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg4)) {
            return false;
        }
        tg4 tg4Var = (tg4) obj;
        return this.a == tg4Var.a && this.b == tg4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ValidationCriteria(checkBack=" + this.a + ", checkFront=" + this.b + ')';
    }
}
