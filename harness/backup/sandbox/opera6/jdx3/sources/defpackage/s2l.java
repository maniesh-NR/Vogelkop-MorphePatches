package defpackage;

import androidx.recyclerview.widget.i;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s2l {
    public final u3l a;
    public final b3c b;
    public final boolean c;
    public final Set d;
    public final p6l e;
    public final i f;

    public s2l(u3l u3lVar, b3c b3cVar, boolean z, Set set, p6l p6lVar, i iVar) {
        this.a = u3lVar;
        this.b = b3cVar;
        this.c = z;
        this.d = set;
        this.e = p6lVar;
        this.f = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2l)) {
            return false;
        }
        s2l s2lVar = (s2l) obj;
        return Intrinsics.a(this.a, s2lVar.a) && this.b == s2lVar.b && this.c == s2lVar.c && Intrinsics.a(this.d, s2lVar.d) && this.e == s2lVar.e && Intrinsics.a(this.f, s2lVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + fki.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31)) * 31;
        i iVar = this.f;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "";
    }
}
