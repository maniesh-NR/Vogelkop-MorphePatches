package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jzb {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = tym.a;
        c = "0";
        d = "1";
    }

    public jzb(String str, String str2) {
        this.a = tym.O(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jzb.class == obj.getClass()) {
            jzb jzbVar = (jzb) obj;
            if (Objects.equals(this.a, jzbVar.a) && Objects.equals(this.b, jzbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
