package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l68 implements jza {
    public final jva a;
    public final bza b;
    public final Throwable c;

    public l68(jva jvaVar, bza bzaVar, Throwable th) {
        this.a = jvaVar;
        this.b = bzaVar;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l68)) {
            return false;
        }
        l68 l68Var = (l68) obj;
        return Intrinsics.a(this.a, l68Var.a) && Intrinsics.a(this.b, l68Var.b) && this.c.equals(l68Var.c);
    }

    @Override // defpackage.jza
    public final bza getRequest() {
        return this.b;
    }

    public final int hashCode() {
        jva jvaVar = this.a;
        int iHashCode = jvaVar == null ? 0 : jvaVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }

    @Override // defpackage.jza
    public final jva y() {
        return this.a;
    }
}
