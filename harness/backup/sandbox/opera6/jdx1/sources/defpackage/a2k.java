package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a2k implements h49 {
    public final float a;
    public final float b;
    public final Object c;

    public a2k(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public /* synthetic */ a2k(Object obj) {
        this(1.0f, 1500.0f, obj);
    }

    @Override // defpackage.we1
    public final y0n a(j8m j8mVar) {
        Object obj = this.c;
        return new dcl(this.a, this.b, obj == null ? null : (if1) j8mVar.a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a2k) {
            a2k a2kVar = (a2k) obj;
            if (a2kVar.a == this.a && a2kVar.b == this.b && Intrinsics.a(a2kVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + sko.d(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
