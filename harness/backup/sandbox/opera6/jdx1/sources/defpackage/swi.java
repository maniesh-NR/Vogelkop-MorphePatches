package defpackage;

/* loaded from: classes.dex */
public final class swi {
    public final vwi a;
    public final vwi b;

    public swi(vwi vwiVar, vwi vwiVar2) {
        this.a = vwiVar;
        this.b = vwiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || swi.class != obj.getClass()) {
            return false;
        }
        swi swiVar = (swi) obj;
        return this.a.equals(swiVar.a) && this.b.equals(swiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        vwi vwiVar = this.a;
        sb.append(vwiVar);
        vwi vwiVar2 = this.b;
        if (vwiVar.equals(vwiVar2)) {
            str = "";
        } else {
            str = ", " + vwiVar2;
        }
        return z1m.l(sb, str, "]");
    }
}
