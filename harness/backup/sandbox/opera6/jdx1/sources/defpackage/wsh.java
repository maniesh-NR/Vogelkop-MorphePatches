package defpackage;

/* loaded from: classes.dex */
public final class wsh extends t0h {
    public final t0h a;
    public final int b;

    public wsh(t0h t0hVar, int i) {
        this.a = t0hVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wsh)) {
            return false;
        }
        wsh wshVar = (wsh) obj;
        return wshVar.a.equals(this.a) && wshVar.b == this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
