package defpackage;

/* loaded from: classes.dex */
public final class yic extends zic {
    public final ib6 a = ib6.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yic.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((yic) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (yic.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
