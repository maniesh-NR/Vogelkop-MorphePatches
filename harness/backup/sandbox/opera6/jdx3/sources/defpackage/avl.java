package defpackage;

/* loaded from: classes.dex */
public final class avl {
    public final yul a;
    public final boolean b;
    public final int c;
    public final int d;
    public final byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public avl(yul yulVar, boolean z, int i, int i2, int i3) {
        this.a = yulVar;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public static avl a(avl avlVar, yul yulVar) {
        boolean z = avlVar.b;
        int i = avlVar.c;
        int i2 = avlVar.d;
        byte b = avlVar.e;
        avlVar.getClass();
        return new avl(yulVar, z, i, i2, b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avl)) {
            return false;
        }
        avl avlVar = (avl) obj;
        return this.a == avlVar.a && this.b == avlVar.b && this.c == avlVar.c && this.d == avlVar.d && this.e == avlVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + rfp.c(this.d, rfp.c(this.c, fki.k(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
