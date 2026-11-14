package defpackage;

/* loaded from: classes.dex */
public final class ssn {
    public final osn a;
    public final osn b;
    public final osn c;
    public final osn d;
    public final osn e;
    public final osn f;
    public final osn g;

    public ssn(osn osnVar, osn osnVar2, osn osnVar3, osn osnVar4, osn osnVar5, osn osnVar6, osn osnVar7) {
        this.a = osnVar;
        this.b = osnVar2;
        this.c = osnVar3;
        this.d = osnVar4;
        this.e = osnVar5;
        this.f = osnVar6;
        this.g = osnVar7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssn)) {
            return false;
        }
        ssn ssnVar = (ssn) obj;
        return this.a == ssnVar.a && this.b == ssnVar.b && this.c == ssnVar.c && this.d == ssnVar.d && this.e == ssnVar.e && this.f == ssnVar.f && this.g == ssnVar.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
