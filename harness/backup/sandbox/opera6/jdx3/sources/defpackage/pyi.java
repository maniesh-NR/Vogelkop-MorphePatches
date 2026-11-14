package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pyi extends qyi {
    public final int a;
    public final u3l b;
    public final boolean c;

    public pyi(int i, u3l u3lVar, boolean z) {
        this.a = i;
        this.b = u3lVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyi)) {
            return false;
        }
        pyi pyiVar = (pyi) obj;
        return this.a == pyiVar.a && Intrinsics.a(this.b, pyiVar.b) && this.c == pyiVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
