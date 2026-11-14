package defpackage;

/* loaded from: classes.dex */
public final class sp7 implements h0n {
    public final t0g a;

    public sp7(t0g t0gVar) {
        this.a = t0gVar;
    }

    public final Object a(oag oagVar) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp7) && this.a == ((sp7) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ")";
    }
}
