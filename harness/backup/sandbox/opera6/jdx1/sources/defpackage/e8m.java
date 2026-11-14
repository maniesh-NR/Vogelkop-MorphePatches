package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e8m implements qn7 {
    public final int a;
    public final int b;
    public final vq7 c;

    public e8m(int i, int i2, vq7 vq7Var) {
        this.a = i;
        this.b = i2;
        this.c = vq7Var;
    }

    @Override // defpackage.qn7, defpackage.we1
    public final a1n a(j8m j8mVar) {
        return new m9f(this.a, this.b, this.c);
    }

    @Override // defpackage.we1
    public final y0n a(j8m j8mVar) {
        return new m9f(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e8m) {
            e8m e8mVar = (e8m) obj;
            if (e8mVar.a == this.a && e8mVar.b == this.b && Intrinsics.a(e8mVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }
}
