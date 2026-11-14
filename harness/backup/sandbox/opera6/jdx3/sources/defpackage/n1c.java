package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class n1c {
    public final LinkedHashSet a;
    public final l0c b;
    public final boolean c;

    public n1c(LinkedHashSet linkedHashSet, l0c l0cVar, boolean z) {
        this.a = linkedHashSet;
        this.b = l0cVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1c)) {
            return false;
        }
        n1c n1cVar = (n1c) obj;
        l0c l0cVar = n1cVar.b;
        if (!this.a.equals(n1cVar.a)) {
            return false;
        }
        l0c l0cVar2 = this.b;
        if (l0cVar2 == null) {
            if (l0cVar != null) {
                return false;
            }
        } else if (!l0cVar2.equals(l0cVar)) {
            return false;
        }
        return this.c == n1cVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        l0c l0cVar = this.b;
        return iHashCode + (l0cVar != null ? l0cVar.hashCode() : 0) + (this.c ? 1 : 0);
    }
}
