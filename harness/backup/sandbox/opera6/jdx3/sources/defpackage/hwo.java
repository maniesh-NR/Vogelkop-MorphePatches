package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class hwo {

    @NotNull
    public static final fwo Companion = new fwo();
    public final Integer a;
    public final Integer b;
    public final String c;

    public hwo(int i, Integer num, Integer num2, String str) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, ewo.b);
            throw null;
        }
        this.a = num;
        this.b = num2;
        this.c = str;
    }

    public hwo(Integer num, Integer num2, String str) {
        this.a = num;
        this.b = num2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwo)) {
            return false;
        }
        hwo hwoVar = (hwo) obj;
        return Intrinsics.a(this.a, hwoVar.a) && Intrinsics.a(this.b, hwoVar.b) && Intrinsics.a(this.c, hwoVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Regs(coppa=");
        sb.append(this.a);
        sb.append(", gdpr=");
        sb.append(this.b);
        sb.append(", usPrivacy=");
        return o18.p(sb, this.c, ')');
    }
}
