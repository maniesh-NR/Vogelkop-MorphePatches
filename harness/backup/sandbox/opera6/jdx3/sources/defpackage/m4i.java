package defpackage;

/* loaded from: classes.dex */
public final class m4i {
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public m4i(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m4i) && this.a == ((m4i) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        return "";
    }
}
