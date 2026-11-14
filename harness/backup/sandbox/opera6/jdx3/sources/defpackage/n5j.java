package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n5j extends dyg {
    public final m5j b;
    public final Function1 c;
    public final Function1 d;

    public /* synthetic */ n5j(Function1 function1, Function1 function12) {
        this(m5j.a, function1, function12);
    }

    public n5j(m5j m5jVar, Function1 function1, Function1 function12) {
        this.b = m5jVar;
        this.c = function1;
        this.d = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5j)) {
            return false;
        }
        n5j n5jVar = (n5j) obj;
        return this.b == n5jVar.b && Intrinsics.a(this.c, n5jVar.c) && Intrinsics.a(this.d, n5jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TextField(keyboardType=" + this.b + ", validate=" + this.c + ", parse=" + this.d + ")";
    }
}
