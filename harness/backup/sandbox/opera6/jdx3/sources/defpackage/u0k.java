package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u0k implements Iterator {
    public String b;
    public final CharSequence c;
    public final ot4 d;
    public final boolean e;
    public int g;
    public int a = 2;
    public int f = 0;

    public u0k(vr3 vr3Var, CharSequence charSequence) {
        this.d = (ot4) vr3Var.c;
        this.e = vr3Var.b;
        this.g = vr3Var.a;
        this.c = charSequence;
    }

    public int a(int i) {
        return i;
    }

    public int b(int i) {
        int i2 = i + 4000;
        if (i2 < this.c.length()) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iB;
        CharSequence charSequence;
        int iA;
        ot4 ot4Var;
        z4o.H(this.a != 4);
        int iA2 = vep.A(this.a);
        if (iA2 == 0) {
            return true;
        }
        if (iA2 != 2) {
            this.a = 4;
            int i = this.f;
            while (true) {
                int i2 = this.f;
                if (i2 == -1) {
                    this.a = 3;
                    string = null;
                    break;
                }
                iB = b(i2);
                charSequence = this.c;
                if (iB == -1) {
                    iB = charSequence.length();
                    this.f = -1;
                    iA = -1;
                } else {
                    iA = a(iB);
                    this.f = iA;
                }
                if (iA == i) {
                    int i3 = iA + 1;
                    this.f = i3;
                    if (i3 > charSequence.length()) {
                        this.f = -1;
                    }
                } else {
                    ot4Var = this.d;
                    if (i < iB) {
                        charSequence.charAt(i);
                        ot4Var.getClass();
                        charSequence.charAt(iB - 1);
                        ot4Var.getClass();
                    }
                    if (!this.e || i != iB) {
                        break;
                    }
                    i = this.f;
                }
            }
            int i4 = this.g;
            if (i4 == 1) {
                iB = charSequence.length();
                this.f = -1;
                if (iB > i) {
                    charSequence.charAt(iB - 1);
                    ot4Var.getClass();
                }
            } else {
                this.g = i4 - 1;
            }
            string = charSequence.subSequence(i, iB).toString();
            this.b = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            t3p.y();
            return null;
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
