package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class enh {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;

    public enh(String str, String str2, int i, int i2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && enh.class == obj.getClass()) {
            enh enhVar = (enh) obj;
            if (this.c == enhVar.c && this.d == enhVar.d && this.e == enhVar.e && Objects.equals(this.a, enhVar.a) && this.b.equals(enhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((((z1m.f(Objects.hashCode(this.a) * 31, 31, this.b) + this.c) * 31) + this.d) * 31);
    }
}
