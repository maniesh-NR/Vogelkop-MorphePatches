package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vq6 {
    public final List a;
    public final cum b;
    public final wla c;
    public final ola d;

    public vq6(List list, cum cumVar, wla wlaVar, ola olaVar) {
        this.a = list;
        this.b = cumVar;
        this.c = wlaVar;
        this.d = olaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq6)) {
            return false;
        }
        vq6 vq6Var = (vq6) obj;
        return Intrinsics.a(this.a, vq6Var.a) && this.b.equals(vq6Var.b) && this.c == vq6Var.c && this.d == vq6Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 961;
        ola olaVar = this.d;
        return iHashCode + (olaVar == null ? 0 : olaVar.hashCode());
    }

    public final String toString() {
        return "";
    }
}
