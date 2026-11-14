package defpackage;

/* loaded from: classes.dex */
public final class vm2 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public vm2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof vm2) && this.a == ((vm2) obj).a;
    }

    public final int hashCode() {
        return (this.a ^ 1000003) * 1000003;
    }

    public final String toString() {
        return p3p.k(this.a, ", cause=null}", new StringBuilder("StateError{code="));
    }
}
