package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v2m implements u2m {
    public final Object a;
    public final Object b;

    public v2m(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.u2m
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.u2m
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u2m)) {
            return false;
        }
        u2m u2mVar = (u2m) obj;
        return Intrinsics.a(this.a, u2mVar.b()) && Intrinsics.a(this.b, u2mVar.a());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
