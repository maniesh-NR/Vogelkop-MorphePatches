package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ae extends fe {
    public final u3l a;
    public final lxh b = new lxh(2131232235);
    public final rxh c = new rxh(2132021029);

    public ae(u3l u3lVar) {
        this.a = u3lVar;
    }

    @Override // defpackage.fe
    public final b8h a() {
        return this.b;
    }

    @Override // defpackage.fe
    public final pxh b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae) && Intrinsics.a(this.a, ((ae) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
