package defpackage;

/* loaded from: classes.dex */
public final class fxh extends cxh {
    public final int a;

    public fxh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fxh) && this.a == ((fxh) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
