package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class bsj {
    public final rxh a;
    public final Function0 b;

    public bsj(rxh rxhVar, Function0 function0) {
        this.a = rxhVar;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsj)) {
            return false;
        }
        bsj bsjVar = (bsj) obj;
        return this.a.equals(bsjVar.a) && this.b.equals(bsjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
