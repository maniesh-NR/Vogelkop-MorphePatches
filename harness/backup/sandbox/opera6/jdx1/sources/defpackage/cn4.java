package defpackage;

/* loaded from: classes.dex */
public final class cn4 implements hn4 {
    public final String a;

    public cn4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof cn4) && this.a.equals(((cn4) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("AmountInput(formattedPhone=", this.a, ")");
    }
}
