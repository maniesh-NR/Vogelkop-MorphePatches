package defpackage;

/* loaded from: classes.dex */
public final class v4c {
    public final String a;

    public v4c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v4c) {
            return this.a.equals(((v4c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return z1m.l(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
