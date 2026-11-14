package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m7l {
    public final int a;
    public final l7l b;
    public final l7l c;

    public m7l(int i, l7l l7lVar, l7l l7lVar2) {
        this.a = i;
        this.b = l7lVar;
        this.c = l7lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7l)) {
            return false;
        }
        m7l m7lVar = (m7l) obj;
        return this.a == m7lVar.a && Intrinsics.a(this.b, m7lVar.b) && Intrinsics.a(this.c, m7lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
