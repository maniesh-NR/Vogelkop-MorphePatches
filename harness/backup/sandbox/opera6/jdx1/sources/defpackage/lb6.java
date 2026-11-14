package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class lb6 implements hub {
    public final hub b;
    public final hub c;

    public lb6(hub hubVar, hub hubVar2) {
        this.b = hubVar;
        this.c = hubVar2;
    }

    @Override // defpackage.hub
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.hub
    public final boolean equals(Object obj) {
        if (obj instanceof lb6) {
            lb6 lb6Var = (lb6) obj;
            if (this.b.equals(lb6Var.b) && this.c.equals(lb6Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hub
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
