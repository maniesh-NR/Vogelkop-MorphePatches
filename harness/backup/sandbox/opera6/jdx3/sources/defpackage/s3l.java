package defpackage;

/* loaded from: classes.dex */
public final class s3l implements u3l {
    public final p6l d;

    public s3l(p6l p6lVar) {
        this.d = p6lVar;
    }

    @Override // defpackage.u3l
    public final boolean a(b2l b2lVar) {
        return b2lVar.T() == this.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof s3l) && this.d == ((s3l) obj).d;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "";
    }
}
