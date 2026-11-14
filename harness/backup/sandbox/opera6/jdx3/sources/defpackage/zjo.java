package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class zjo {

    @NotNull
    public static final who Companion = new who();
    public static final KSerializer[] f = {null, null, new k72(bho.a, (byte) 0), null, null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final Integer e;

    public zjo(int i, String str, String str2, List list, String str3, Integer num) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, ngo.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if (Intrinsics.a(str, "00000000-0000-0000-0000-000000000000")) {
            qp2.n("id can't be zero out UUID in bid response");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjo)) {
            return false;
        }
        zjo zjoVar = (zjo) obj;
        return Intrinsics.a(this.a, zjoVar.a) && Intrinsics.a(this.b, zjoVar.b) && Intrinsics.a(this.c, zjoVar.c) && Intrinsics.a(this.d, zjoVar.d) && Intrinsics.a(this.e, zjoVar.e);
    }

    public final int hashCode() {
        int iF = rfp.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "AdData(requestId=" + this.a + ", bidId=" + this.b + ", seatBid=" + this.c + ", currency=" + this.d + ", notBidReason=" + this.e + ')';
    }
}
