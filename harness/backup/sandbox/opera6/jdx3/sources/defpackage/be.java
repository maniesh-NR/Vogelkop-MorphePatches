package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class be extends fe {
    public final u3l a;
    public final List b;
    public final lxh c;
    public final rxh d;

    public be(u3l u3lVar) {
        l08 l08Var = l08.a;
        this.a = u3lVar;
        this.b = l08Var;
        this.c = new lxh(2131232235);
        this.d = new rxh(2132021028);
    }

    @Override // defpackage.fe
    public final b8h a() {
        return this.c;
    }

    @Override // defpackage.fe
    public final pxh b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return Intrinsics.a(this.a, beVar.a) && Intrinsics.a(this.b, beVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
