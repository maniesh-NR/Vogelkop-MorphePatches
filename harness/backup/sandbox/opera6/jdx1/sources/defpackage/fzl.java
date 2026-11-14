package defpackage;

/* loaded from: classes.dex */
public final class fzl {
    public static final fzl b;
    public static final String c;
    public final h1b a;

    static {
        a1b a1bVar = h1b.b;
        b = new fzl(csh.e);
        String str = tym.a;
        c = "0";
    }

    public fzl(csh cshVar) {
        this.a = h1b.s(cshVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            h1b h1bVar = this.a;
            if (i2 >= h1bVar.size()) {
                return false;
            }
            ezl ezlVar = (ezl) h1bVar.get(i2);
            boolean[] zArr = ezlVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (ezlVar.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fzl.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((fzl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
