package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kv0 {
    public final Set a;
    public final bw0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Set j;

    public kv0(Set set, bw0 bw0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Set set2) {
        this.a = set;
        this.b = bw0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv0)) {
            return false;
        }
        kv0 kv0Var = (kv0) obj;
        return Intrinsics.a(this.a, kv0Var.a) && this.b.equals(kv0Var.b) && this.c == kv0Var.c && this.d == kv0Var.d && this.e == kv0Var.e && this.f == kv0Var.f && this.g == kv0Var.g && this.h == kv0Var.h && this.i == kv0Var.i && Intrinsics.a(this.j, kv0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + fki.k(fki.k(fki.k(fki.k(fki.k(fki.k(fki.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "";
    }
}
