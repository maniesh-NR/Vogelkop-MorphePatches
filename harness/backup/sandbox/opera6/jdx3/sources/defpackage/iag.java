package defpackage;

/* loaded from: classes.dex */
public final class iag {
    public final kag a;
    public final boolean b;

    public iag(kag kagVar, boolean z) {
        this.a = kagVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iag.class == obj.getClass()) {
            iag iagVar = (iag) obj;
            if (this.b == iagVar.b && this.a == iagVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        kag kagVar = this.a;
        return ((kagVar != null ? kagVar.hashCode() : 0) * 31) + (this.b ? 1 : 0);
    }
}
