package defpackage;

/* loaded from: classes.dex */
public final class ep5 extends fp5 {
    public final int a;

    public ep5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep5) && this.a == ((ep5) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fki.s(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
    }
}
