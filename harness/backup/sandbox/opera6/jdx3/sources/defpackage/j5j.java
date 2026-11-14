package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j5j {
    public final String a;
    public final String b;
    public final i5j c;
    public final dyg d;
    public final Object e;
    public final c67 f;

    public j5j(String str, String str2, i5j i5jVar, dyg dygVar, Object obj, c67 c67Var) {
        this.a = str;
        this.b = str2;
        this.c = i5jVar;
        this.d = dygVar;
        this.e = obj;
        this.f = c67Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j5j) {
            j5j j5jVar = (j5j) obj;
            return this.a.equals(j5jVar.a) && this.b.equals(j5jVar.b) && this.c.equals(j5jVar.c) && this.d.equals(j5jVar.d) && Intrinsics.a(this.e, j5jVar.e) && this.f == j5jVar.f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("Spec(name=", this.a, ", description=", this.b, ", availability=");
        sbN.append(this.c);
        sbN.append(", ui=");
        sbN.append(this.d);
        sbN.append(", default=");
        sbN.append(this.e);
        sbN.append(", serializer=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
