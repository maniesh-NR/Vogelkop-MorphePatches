package defpackage;

/* loaded from: classes.dex */
public final class mtf extends w7d {
    public final voh k;

    public mtf(voh vohVar) {
        this.k = vohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mtf) {
            return this.k.equals(((mtf) obj).k);
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    @Override // defpackage.w7d
    public final voh w() {
        return this.k;
    }
}
