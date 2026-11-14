package defpackage;

/* loaded from: classes.dex */
public final class qmf extends ja2 {
    public final fdn b;

    public qmf(fdn fdnVar) {
        this.b = fdnVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == qmf.class) {
            return this.b.equals(((qmf) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
