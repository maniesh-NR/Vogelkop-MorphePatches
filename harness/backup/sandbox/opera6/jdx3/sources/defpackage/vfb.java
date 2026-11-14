package defpackage;

/* loaded from: classes.dex */
public final class vfb {
    public final String a;

    public vfb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof vfb) && this.a.equals(((vfb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("InternalChatModifiersWebpageContextData(id=", this.a, ")");
    }
}
