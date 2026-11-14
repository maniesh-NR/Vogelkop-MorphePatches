package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ypj {
    public final Function1 a;
    public final h49 b;

    public ypj(h49 h49Var, Function1 function1) {
        this.a = function1;
        this.b = h49Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypj)) {
            return false;
        }
        ypj ypjVar = (ypj) obj;
        return Intrinsics.a(this.a, ypjVar.a) && this.b.equals(ypjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
