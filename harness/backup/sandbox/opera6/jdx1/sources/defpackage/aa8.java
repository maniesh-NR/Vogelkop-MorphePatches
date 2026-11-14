package defpackage;

/* loaded from: classes.dex */
public final class aa8 {
    public final boolean a;

    public aa8(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa8) && this.a == ((aa8) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "EsimStateUserData(hasPlans=" + this.a + ")";
    }
}
