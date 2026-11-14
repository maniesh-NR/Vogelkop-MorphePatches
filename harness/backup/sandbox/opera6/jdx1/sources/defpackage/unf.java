package defpackage;

/* loaded from: classes.dex */
public final class unf {
    public final u8i a;
    public final u8i b;
    public final u8i c;
    public final u8i d;
    public final u8i e;
    public final u8i f;
    public final u8i g;
    public final u8i h;
    public final u8i i;
    public final srj j;

    public unf(u8i u8iVar, u8i u8iVar2, u8i u8iVar3, u8i u8iVar4, u8i u8iVar5, u8i u8iVar6, u8i u8iVar7, u8i u8iVar8, u8i u8iVar9, srj srjVar) {
        this.a = u8iVar;
        this.b = u8iVar2;
        this.c = u8iVar3;
        this.d = u8iVar4;
        this.e = u8iVar5;
        this.f = u8iVar6;
        this.g = u8iVar7;
        this.h = u8iVar8;
        this.i = u8iVar9;
        this.j = srjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unf)) {
            return false;
        }
        unf unfVar = (unf) obj;
        return this.a.equals(unfVar.a) && this.b.equals(unfVar.b) && this.c.equals(unfVar.c) && this.d.equals(unfVar.d) && this.e.equals(unfVar.e) && this.f.equals(unfVar.f) && this.g.equals(unfVar.g) && this.h.equals(unfVar.h) && this.i.equals(unfVar.i) && this.j.equals(unfVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
