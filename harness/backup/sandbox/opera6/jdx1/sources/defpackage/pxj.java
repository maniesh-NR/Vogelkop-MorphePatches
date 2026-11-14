package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pxj {
    public final int a;
    public final y7h b;
    public final fxh c;
    public final fxh d;
    public final y7h e;
    public final int f;

    public pxj(int i, ixh ixhVar, kxh kxhVar, int i2) {
        this((i2 & 1) != 0 ? 4 : i, (i2 & 2) != 0 ? new ixh(4.0f) : ixhVar, new fxh(2131103810), new fxh(2131103811), (i2 & 16) != 0 ? new ixh(12.0f) : kxhVar, (i2 & 32) == 0 ? 3 : 4);
    }

    public pxj(int i, y7h y7hVar, fxh fxhVar, fxh fxhVar2, y7h y7hVar2, int i2) {
        this.a = i;
        this.b = y7hVar;
        this.c = fxhVar;
        this.d = fxhVar2;
        this.e = y7hVar2;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxj)) {
            return false;
        }
        pxj pxjVar = (pxj) obj;
        return this.a == pxjVar.a && Intrinsics.a(this.b, pxjVar.b) && Intrinsics.a(this.c, pxjVar.c) && Intrinsics.a(this.d, pxjVar.d) && Intrinsics.a(this.e, pxjVar.e) && this.f == pxjVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
