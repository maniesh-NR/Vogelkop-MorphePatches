package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l37 {
    public final String a;
    public final String b;
    public final String c;

    public l37(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l37.class == obj.getClass()) {
            l37 l37Var = (l37) obj;
            if (Objects.equals(this.a, l37Var.a) && Objects.equals(this.b, l37Var.b) && Objects.equals(this.c, l37Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
