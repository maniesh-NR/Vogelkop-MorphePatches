package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bw4 implements dw4 {
    public final Object a;
    public final String b;
    public final Object c;
    public final rdc d;
    public final kw6 e;
    public final nrl f;
    public final zm6 g;

    public bw4(Object obj, String str, Object obj2, rdc rdcVar, kw6 kw6Var, nrl nrlVar, zm6 zm6Var) {
        this.a = obj;
        this.b = str;
        this.c = obj2;
        this.d = rdcVar;
        this.e = kw6Var;
        this.f = nrlVar;
        this.g = zm6Var;
    }

    @Override // defpackage.dw4
    public final Object a() {
        return this.c;
    }

    @Override // defpackage.dw4
    public final nrl b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bw4) {
            bw4 bw4Var = (bw4) obj;
            return Intrinsics.a(this.a, bw4Var.a) && Intrinsics.a(this.b, bw4Var.b) && Intrinsics.a(this.c, bw4Var.c) && this.d == bw4Var.d && this.e == bw4Var.e && Intrinsics.a(this.f, bw4Var.f) && this.g == bw4Var.g;
        }
        return false;
    }

    @Override // defpackage.dw4
    public final Object getConfiguration() {
        return this.a;
    }

    @Override // defpackage.dw4
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Created(configuration=" + this.a + ", key=" + this.b + ", instance=" + this.c + ", lifecycleRegistry=" + this.d + ", stateKeeperDispatcher=" + this.e + ", instanceKeeperDispatcher=" + this.f + ", backHandler=" + this.g + ')';
    }
}
