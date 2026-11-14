package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cw4 implements dw4 {
    public final Object a;
    public final String b;
    public final k2j c;

    public cw4(Object obj, String str, k2j k2jVar) {
        this.a = obj;
        this.b = str;
        this.c = k2jVar;
    }

    @Override // defpackage.dw4
    public final Object a() {
        return null;
    }

    @Override // defpackage.dw4
    public final nrl b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw4)) {
            return false;
        }
        cw4 cw4Var = (cw4) obj;
        return Intrinsics.a(this.a, cw4Var.a) && Intrinsics.a(this.b, cw4Var.b) && Intrinsics.a(this.c, cw4Var.c);
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
        int iF = z1m.f(this.a.hashCode() * 31, 31, this.b);
        k2j k2jVar = this.c;
        return iF + (k2jVar == null ? 0 : k2jVar.hashCode());
    }

    public final String toString() {
        return "Destroyed(configuration=" + this.a + ", key=" + this.b + ", savedState=" + this.c + ')';
    }
}
