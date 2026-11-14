package defpackage;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class o6f implements hub {
    public final Object b;

    public o6f(Object obj) {
        qyn.l(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.hub
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(hub.a));
    }

    @Override // defpackage.hub
    public final boolean equals(Object obj) {
        if (obj instanceof o6f) {
            return this.b.equals(((o6f) obj).b);
        }
        return false;
    }

    @Override // defpackage.hub
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
