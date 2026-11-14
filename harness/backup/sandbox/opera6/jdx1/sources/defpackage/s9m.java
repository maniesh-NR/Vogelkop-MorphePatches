package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s9m {
    public final String a;
    public final List b;
    public final x9m c;
    public final boolean d;

    public s9m(String str, List list, x9m x9mVar) {
        cam camVar = x9mVar.b;
        boolean zD = camVar != null ? camVar.d() : false;
        this.a = str;
        this.b = list;
        this.c = x9mVar;
        this.d = zD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9m)) {
            return false;
        }
        s9m s9mVar = (s9m) obj;
        return Intrinsics.a(this.a, s9mVar.a) && Intrinsics.a(this.b, s9mVar.b) && Intrinsics.a(this.c, s9mVar.c) && this.d == s9mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + rfp.f(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "TypeData(qualifiedName=" + this.a + ", typeArgs=" + this.b + ", typeInfo=" + this.c + ", isNullable=" + this.d + ')';
    }
}
