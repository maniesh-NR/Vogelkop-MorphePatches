package defpackage;

/* loaded from: classes.dex */
public final class ikn extends v0g {
    public final int a;
    public final float b;
    public final float c;

    public ikn(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ikn)) {
            return false;
        }
        ikn iknVar = (ikn) obj;
        return this.a == iknVar.a && Float.compare(this.b, iknVar.b) == 0 && Float.compare(this.c, iknVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + sko.d(this.b, this.a * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
