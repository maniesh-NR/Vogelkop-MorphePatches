package defpackage;

/* loaded from: classes.dex */
public final class zf8 {
    public final String a;

    public zf8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zf8) {
            return this.a.equals(((zf8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
