package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bte {
    public final kze a;
    public final kze b;
    public final kze c;
    public final ArrayList d;

    public bte(kze kzeVar, kze kzeVar2, kze kzeVar3, ArrayList arrayList) {
        this.a = kzeVar;
        this.b = kzeVar2;
        this.c = kzeVar3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bte) {
            bte bteVar = (bte) obj;
            if (this.a == bteVar.a && this.b == bteVar.b && this.c == bteVar.c && this.d.equals(bteVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
