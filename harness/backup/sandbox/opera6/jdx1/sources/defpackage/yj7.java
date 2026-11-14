package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lyj7;", "T", "Lh8e;", "Lzj7;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class yj7<T> extends h8e {
    public final a21 b;
    public final Function2 c;

    public yj7(a21 a21Var, Function2 function2) {
        fsf fsfVar = fsf.a;
        this.b = a21Var;
        this.c = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj7)) {
            return false;
        }
        yj7 yj7Var = (yj7) obj;
        if (!Intrinsics.a(this.b, yj7Var.b) || this.c != yj7Var.c) {
            return false;
        }
        fsf fsfVar = fsf.a;
        return true;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        fsf fsfVar = fsf.a;
        zj7 zj7Var = new zj7();
        zj7Var.o = this.b;
        zj7Var.p = this.c;
        zj7Var.q = fsfVar;
        return zj7Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        zj7 zj7Var = (zj7) b8eVar;
        zj7Var.o = this.b;
        zj7Var.p = this.c;
        zj7Var.q = fsf.a;
    }

    public final int hashCode() {
        return fsf.a.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
