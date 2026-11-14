package defpackage;

/* loaded from: classes.dex */
public final class sre {
    public final String a;
    public String b;

    public sre(String str, String str2, byte b) {
        switch (b) {
            case 1:
                this.b = str;
                this.a = str2;
                break;
            default:
                this.a = str;
                this.b = str2;
                break;
        }
    }

    public final String a() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String strB = a26.B(this.a);
        this.b = strB;
        return strB;
    }
}
