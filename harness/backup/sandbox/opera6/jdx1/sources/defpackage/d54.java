package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class d54 implements Iterable, Serializable {
    public static final d54 c = new d54(jfb.b);
    public static final a54 d;
    public int a = 0;
    public final byte[] b;

    static {
        d = n21.a() ? new rbe((byte) 27) : new n9a((byte) 27);
    }

    public d54(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int g(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            h9o.u(p3p.i(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            h9o.u(sko.h(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        h9o.u(sko.h(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static d54 h(int i, int i2, byte[] bArr) {
        g(i, i + i2, bArr.length);
        return new d54(d.copyFrom(bArr, i, i2));
    }

    public byte d(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof d54) && size() == ((d54) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof d54)) {
                return obj.equals(this);
            }
            d54 d54Var = (d54) obj;
            int i = this.a;
            int i2 = d54Var.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > d54Var.size()) {
                    h9o.f(size, size());
                    return false;
                }
                if (size > d54Var.size()) {
                    h9o.q(d54Var.size(), p3p.o(size, "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = d54Var.b;
                int iJ = j() + size;
                int iJ2 = j();
                int iJ3 = d54Var.j();
                while (iJ2 < iJ) {
                    if (this.b[iJ2] == bArr[iJ3]) {
                        iJ2++;
                        iJ3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iJ = j();
        int i2 = size;
        for (int i3 = iJ; i3 < iJ + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public void i(int i, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u44(this);
    }

    public int j() {
        return 0;
    }

    public byte m(int i) {
        return this.b[i];
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = jym.i(this);
        } else {
            int iG = g(0, 47, size());
            strConcat = jym.i(iG == 0 ? c : new x44(this.b, j(), iG)).concat("...");
        }
        return z1m.l(sko.p(size, "<ByteString@", hexString, " size=", " contents=\""), strConcat, "\">");
    }
}
