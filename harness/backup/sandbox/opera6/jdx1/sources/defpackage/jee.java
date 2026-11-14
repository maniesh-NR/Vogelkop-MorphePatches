package defpackage;

/* loaded from: classes.dex */
public final class jee {
    public final /* synthetic */ byte a = 0;
    public String b;
    public String c;

    public /* synthetic */ jee() {
    }

    public jee(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof lyf)) {
                    return false;
                }
                lyf lyfVar = (lyf) obj;
                Object obj2 = lyfVar.a;
                String str = this.b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = lyfVar.b;
                String str2 = this.c;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                String str = this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Pair{" + ((Object) this.b) + " " + ((Object) this.c) + "}";
            default:
                return super.toString();
        }
    }
}
