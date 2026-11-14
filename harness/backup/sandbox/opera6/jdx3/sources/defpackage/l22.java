package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l22 {
    public final ArrayList a;
    public final o52 b;
    public final String c;

    public l22(ArrayList arrayList, o52 o52Var, String str) {
        this.a = arrayList;
        this.b = o52Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l22)) {
            return false;
        }
        l22 l22Var = (l22) obj;
        return this.a.equals(l22Var.a) && Intrinsics.a(this.b, l22Var.b) && this.c.equals(l22Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
