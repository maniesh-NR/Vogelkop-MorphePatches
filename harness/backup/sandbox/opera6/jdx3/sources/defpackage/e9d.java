package defpackage;

/* loaded from: classes.dex */
public final class e9d extends oup {
    public final String f;

    public e9d(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e9d) && this.f.equals(((e9d) obj).f);
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "";
    }
}
