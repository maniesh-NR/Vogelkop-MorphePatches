package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vkb {
    public final Object a;
    public final int b;

    public vkb(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkb)) {
            return false;
        }
        vkb vkbVar = (vkb) obj;
        return Intrinsics.a(this.a, vkbVar.a) && this.b == vkbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemKey(value=");
        sb.append(this.a);
        sb.append(", index=");
        return fki.s(sb, this.b, ')');
    }
}
