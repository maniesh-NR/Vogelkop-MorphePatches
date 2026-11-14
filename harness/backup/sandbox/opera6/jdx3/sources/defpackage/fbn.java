package defpackage;

/* loaded from: classes.dex */
public final class fbn extends hbn {
    public final zan a;

    public fbn(zan zanVar) {
        this.a = zanVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fbn) && this.a == ((fbn) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
