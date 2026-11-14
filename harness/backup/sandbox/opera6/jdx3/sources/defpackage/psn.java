package defpackage;

/* loaded from: classes.dex */
public final class psn {
    public final osn a;
    public final osn b;
    public final osn c;

    public psn(osn osnVar, osn osnVar2, osn osnVar3) {
        this.a = osnVar;
        this.b = osnVar2;
        this.c = osnVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psn)) {
            return false;
        }
        psn psnVar = (psn) obj;
        return this.a == psnVar.a && this.b == psnVar.b && this.c == psnVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
