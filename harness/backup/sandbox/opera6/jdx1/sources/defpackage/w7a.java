package defpackage;

/* loaded from: classes.dex */
public final class w7a extends y7a {
    public final char a;

    public w7a(char c) {
        this.a = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7a) && this.a == ((w7a) obj).a;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
