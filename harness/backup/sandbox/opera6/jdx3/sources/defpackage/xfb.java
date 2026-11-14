package defpackage;

/* loaded from: classes.dex */
public final class xfb {
    public final String a;

    public xfb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof xfb) && this.a.equals(((xfb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("InternalChatWebpageContextData(id=", this.a, ")");
    }
}
