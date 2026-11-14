package defpackage;

/* loaded from: classes.dex */
public final class t9j {
    public final int a;
    public final g52 b;
    public final jgn c;
    public final yc6 d;
    public final tj e;
    public final uyl f;
    public final rxe g;
    public final a8d h;

    public t9j(int i, g52 g52Var, jgn jgnVar, yc6 yc6Var, tj tjVar, uyl uylVar, rxe rxeVar, a8d a8dVar) {
        this.a = i;
        this.b = g52Var;
        this.c = jgnVar;
        this.d = yc6Var;
        this.e = tjVar;
        this.f = uylVar;
        this.g = rxeVar;
        this.h = a8dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9j)) {
            return false;
        }
        t9j t9jVar = (t9j) obj;
        return this.a == t9jVar.a && this.b.equals(t9jVar.b) && this.c.equals(t9jVar.c) && this.d.equals(t9jVar.d) && this.e.equals(t9jVar.e) && this.f.equals(t9jVar.f) && this.g.equals(t9jVar.g) && this.h.equals(t9jVar.h);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h.a) + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
