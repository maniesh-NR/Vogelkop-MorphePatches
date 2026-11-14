package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qo7 {
    public final String a;
    public final p4j b;
    public final nd7 c;
    public final LinkedHashMap d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public qo7(String str, p4j p4jVar, nd7 nd7Var, LinkedHashMap linkedHashMap, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = p4jVar;
        this.c = nd7Var;
        this.d = linkedHashMap;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qo7) {
            qo7 qo7Var = (qo7) obj;
            if (this.a.equals(qo7Var.a) && Intrinsics.a(this.b, qo7Var.b) && this.c == qo7Var.c && this.d.equals(qo7Var.d) && this.e == qo7Var.e && this.f == qo7Var.f && this.g == qo7Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + fki.k(fki.k((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "";
    }
}
