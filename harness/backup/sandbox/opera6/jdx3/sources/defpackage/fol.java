package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fol {
    public final String a;
    public final p6l b;
    public final int c;

    public fol(int i, p6l p6lVar, String str) {
        this.a = str;
        this.b = p6lVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fol)) {
            return false;
        }
        fol folVar = (fol) obj;
        return Intrinsics.a(this.a, folVar.a) && this.b == folVar.b && this.c == folVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
