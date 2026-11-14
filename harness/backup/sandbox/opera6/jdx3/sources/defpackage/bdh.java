package defpackage;

/* loaded from: classes.dex */
public final class bdh extends hdh {
    public final boolean a;

    public bdh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdh) && this.a == ((bdh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
