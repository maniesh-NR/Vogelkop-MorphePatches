package defpackage;

/* loaded from: classes.dex */
public final class nnh {
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public nnh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof nnh) && this.a == ((nnh) obj).a;
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
