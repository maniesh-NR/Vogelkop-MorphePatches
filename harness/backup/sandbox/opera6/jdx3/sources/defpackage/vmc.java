package defpackage;

/* loaded from: classes.dex */
public final class vmc {
    public final ymc a;
    public final ymc b;

    public vmc(ymc ymcVar, ymc ymcVar2) {
        this.a = ymcVar;
        this.b = ymcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmc)) {
            return false;
        }
        vmc vmcVar = (vmc) obj;
        return this.a.equals(vmcVar.a) && this.b.equals(vmcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
