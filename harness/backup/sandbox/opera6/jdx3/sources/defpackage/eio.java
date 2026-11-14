package defpackage;

import android.webkit.URLUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class eio {

    @NotNull
    public static final dio Companion = new dio();
    public final int a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;

    public eio(int i, int i2, String str, Integer num, String str2, String str3) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        String str4 = this.e;
        if (str4 != null) {
            URLUtil.isHttpsUrl(str4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eio)) {
            return false;
        }
        eio eioVar = (eio) obj;
        return this.a == eioVar.a && Intrinsics.a(this.b, eioVar.b) && Intrinsics.a(this.c, eioVar.c) && Intrinsics.a(this.d, eioVar.d) && Intrinsics.a(this.e, eioVar.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardedExt(orientation=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", amount=");
        sb.append(this.c);
        sb.append(", ssvSignKey=");
        sb.append(this.d);
        sb.append(", ssvTrackUrl=");
        return o18.p(sb, this.e, ')');
    }
}
