package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n4i {
    public final String a;
    public final Function1 b;

    public n4i(String str, Function1 function1) {
        this.a = str;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4i)) {
            return false;
        }
        n4i n4iVar = (n4i) obj;
        return this.a.equals(n4iVar.a) && this.b.equals(n4iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
