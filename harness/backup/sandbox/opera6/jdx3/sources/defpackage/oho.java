package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class oho {

    @NotNull
    public static final nho Companion = new nho();
    public static final KSerializer[] q;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    public final Integer i;
    public final List j;
    public final List k;
    public final sho l;
    public final String m;
    public final String n;
    public final String o;
    public final Double p;

    static {
        xhk xhkVar = xhk.a;
        q = new KSerializer[]{null, null, null, null, null, null, null, null, null, new k72(xhkVar, (byte) 0), new k72(xhkVar, (byte) 0), null, null, null, null, null};
    }

    public oho(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, Integer num, Integer num2, List list, List list2, sho shoVar, String str7, String str8, String str9, Double d) {
        if (2079 != (i & 2079)) {
            x7d.I(i, 2079, mho.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.h = 0;
        } else {
            this.h = num;
        }
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = 0;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list2;
        }
        this.l = shoVar;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str8;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str9;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oho)) {
            return false;
        }
        oho ohoVar = (oho) obj;
        return Intrinsics.a(this.a, ohoVar.a) && Intrinsics.a(this.b, ohoVar.b) && Intrinsics.a(this.c, ohoVar.c) && this.d == ohoVar.d && Intrinsics.a(this.e, ohoVar.e) && Intrinsics.a(this.f, ohoVar.f) && Intrinsics.a(this.g, ohoVar.g) && Intrinsics.a(this.h, ohoVar.h) && Intrinsics.a(this.i, ohoVar.i) && Intrinsics.a(this.j, ohoVar.j) && Intrinsics.a(this.k, ohoVar.k) && Intrinsics.a(this.l, ohoVar.l) && Intrinsics.a(this.m, ohoVar.m) && Intrinsics.a(this.n, ohoVar.n) && Intrinsics.a(this.o, ohoVar.o) && Intrinsics.a(this.p, ohoVar.p);
    }

    public final int hashCode() {
        int iF = z1m.f(rfp.c(this.d, z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        String str = this.f;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.j;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        int iHashCode6 = (this.l.hashCode() + ((iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str3 = this.m;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.p;
        return iHashCode9 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "BidData(bidderId=" + this.a + ", impId=" + this.b + ", adMarkup=" + this.c + ", expiration=" + this.d + ", campaignId=" + this.e + ", adId=" + this.f + ", creativeId=" + this.g + ", width=" + this.h + ", height=" + this.i + ", adDomain=" + this.j + ", categories=" + this.k + ", bidExt=" + this.l + ", winUrl=" + this.m + ", lossUrl=" + this.n + ", bundle=" + this.o + ", price=" + this.p + ')';
    }
}
