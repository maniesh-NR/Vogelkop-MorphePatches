package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class s38 implements hub {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final hub g;
    public final v74 h;
    public final trf i;
    public int j;

    public s38(Object obj, hub hubVar, int i, int i2, v74 v74Var, Class cls, Class cls2, trf trfVar) {
        qyn.l(obj, "Argument must not be null");
        this.b = obj;
        this.g = hubVar;
        this.c = i;
        this.d = i2;
        this.h = v74Var;
        this.e = cls;
        qyn.l(cls2, "Transcode class must not be null");
        this.f = cls2;
        this.i = trfVar;
    }

    @Override // defpackage.hub
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hub
    public final boolean equals(Object obj) {
        if (!(obj instanceof s38)) {
            return false;
        }
        s38 s38Var = (s38) obj;
        return this.b.equals(s38Var.b) && this.g.equals(s38Var.g) && this.d == s38Var.d && this.c == s38Var.c && this.h.equals(s38Var.h) && this.e.equals(s38Var.e) && this.f.equals(s38Var.f) && this.i.equals(s38Var.i);
    }

    @Override // defpackage.hub
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.j = iHashCode;
        int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
        this.j = iHashCode2;
        int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
        this.j = iHashCode3;
        int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
        this.j = iHashCode4;
        int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
        this.j = iHashCode5;
        int iHashCode6 = this.i.b.hashCode() + (iHashCode5 * 31);
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
