package defpackage;

/* loaded from: classes.dex */
public final class b3f {
    public final jwk a;
    public final jwk b;
    public final jwk c;
    public final jwk d;
    public final jwk e;
    public final jwk f;
    public final jwk g;
    public final w0f h;

    public b3f(jwk jwkVar, jwk jwkVar2, jwk jwkVar3, jwk jwkVar4, jwk jwkVar5, jwk jwkVar6, jwk jwkVar7, w0f w0fVar) {
        this.a = jwkVar;
        this.b = jwkVar2;
        this.c = jwkVar3;
        this.d = jwkVar4;
        this.e = jwkVar5;
        this.f = jwkVar6;
        this.g = jwkVar7;
        this.h = w0fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3f)) {
            return false;
        }
        b3f b3fVar = (b3f) obj;
        return this.a.equals(b3fVar.a) && this.b.equals(b3fVar.b) && this.c.equals(b3fVar.c) && this.d.equals(b3fVar.d) && this.e.equals(b3fVar.e) && this.f.equals(b3fVar.f) && this.g.equals(b3fVar.g) && this.h == b3fVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        w0f w0fVar = this.h;
        return iHashCode + (w0fVar == null ? 0 : w0fVar.hashCode());
    }

    public final String toString() {
        return "";
    }
}
