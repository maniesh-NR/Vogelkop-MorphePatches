package defpackage;

/* loaded from: classes.dex */
public final class luh {
    public static final luh c = new luh(0, false);
    public final byte a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public luh(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || luh.class != obj.getClass()) {
            return false;
        }
        luh luhVar = (luh) obj;
        return this.a == luhVar.a && this.b == luhVar.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
