package defpackage;

/* loaded from: classes.dex */
public final class ixh extends y7h {
    public final float d;

    public ixh(float f) {
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixh) && Float.compare(this.d, ((ixh) obj).d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d);
    }

    public final String toString() {
        return "";
    }
}
