package defpackage;

/* loaded from: classes.dex */
public final class u3d implements sng {
    public final v3d a;
    public int b;
    public Class c;

    public u3d(v3d v3dVar) {
        this.a = v3dVar;
    }

    @Override // defpackage.sng
    public final void a() {
        this.a.w0(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u3d) {
            u3d u3dVar = (u3d) obj;
            if (this.b == u3dVar.b && this.c == u3dVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
