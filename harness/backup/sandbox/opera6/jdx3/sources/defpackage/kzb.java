package defpackage;

/* loaded from: classes.dex */
public final class kzb extends ja2 {
    public final int b;

    public kzb(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != kzb.class) {
            return false;
        }
        return this.b == ((kzb) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }
}
