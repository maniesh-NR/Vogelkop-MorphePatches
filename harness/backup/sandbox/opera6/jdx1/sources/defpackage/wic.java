package defpackage;

/* loaded from: classes.dex */
public final class wic extends zic {
    public final ib6 a = ib6.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wic.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((wic) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (wic.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
