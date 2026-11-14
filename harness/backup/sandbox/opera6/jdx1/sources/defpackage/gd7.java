package defpackage;

/* loaded from: classes.dex */
public final class gd7 {
    public final /* synthetic */ byte a;
    public String b;

    public gd7(String str) {
        this.a = (byte) 1;
        this.b = p3p.h(1, 0, str);
    }

    public /* synthetic */ gd7(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public static gd7 a(String str) {
        zch.e("Opera", "Name is null or empty");
        zch.e(str, "Version is null or empty");
        return new gd7(str, (byte) 2);
    }

    public static gd7 b(g1g g1gVar) {
        String str;
        g1gVar.O(2);
        int iA = g1gVar.A();
        int i = iA >> 1;
        int iA2 = ((iA & 1) << 5) | ((g1gVar.A() >> 3) & 31);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        return new gd7(rfp.n(iA2, iA2 < 10 ? ".0" : ".", sb), (byte) 0);
    }

    public final String toString() {
        switch (this.a) {
            case 4:
                return o18.p(new StringBuilder("<"), this.b, '>');
            default:
                return super.toString();
        }
    }
}
