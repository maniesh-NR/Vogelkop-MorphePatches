package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rzl {
    public final wv a;
    public final w8e b;

    public rzl(wv wvVar, w8e w8eVar) {
        this.a = wvVar;
        this.b = w8eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzl)) {
            return false;
        }
        rzl rzlVar = (rzl) obj;
        return Intrinsics.a(this.a, rzlVar.a) && this.b.equals(rzlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Transfer(to=" + this.a + ", money=" + this.b + ")";
    }
}
