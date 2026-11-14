package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ob5 implements c8e {
    public final c8e b;
    public final c8e c;

    public ob5(c8e c8eVar, c8e c8eVar2) {
        this.b = c8eVar;
        this.c = c8eVar2;
    }

    @Override // defpackage.c8e
    public final Object a(Object obj, Function2 function2) {
        return this.c.a(this.b.a(obj, function2), function2);
    }

    @Override // defpackage.c8e
    public final boolean b(Function1 function1) {
        return this.b.b(function1) && this.c.b(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ob5)) {
            return false;
        }
        ob5 ob5Var = (ob5) obj;
        return this.b.equals(ob5Var.b) && Intrinsics.a(this.c, ob5Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) a(new StringBuilder("["), new q92((byte) 13));
        sb.append("]");
        return sb.toString();
    }
}
