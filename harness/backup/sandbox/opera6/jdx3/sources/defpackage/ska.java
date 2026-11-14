package defpackage;

/* loaded from: classes.dex */
public final class ska {
    public final String a;

    public ska(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ska) && this.a.equals(((ska) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("StorageV1GetItemData(value=", this.a, ")");
    }
}
