package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class sho {

    @NotNull
    public static final rho Companion = new rho();
    public static final KSerializer[] n;
    public final int a;
    public final String b;
    public final String c;
    public final aio d;
    public final iio e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final String j;
    public final String k;
    public final eio l;
    public final Integer m;

    static {
        xhk xhkVar = xhk.a;
        n = new KSerializer[]{null, null, null, null, null, new k72(xhkVar, (byte) 0), new k72(xhkVar, (byte) 0), new k72(xhkVar, (byte) 0), new k72(xhkVar, (byte) 0), null, null, null, null};
    }

    public sho(int i, int i2, String str, String str2, aio aioVar, iio iioVar, List list, List list2, List list3, List list4, String str3, String str4, eio eioVar, Integer num) {
        if (1 != (i & 1)) {
            x7d.I(i, 1, qho.b);
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = aioVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = iioVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
        if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            this.h = null;
        } else {
            this.h = list3;
        }
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = null;
        } else {
            this.i = list4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = eioVar;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sho)) {
            return false;
        }
        sho shoVar = (sho) obj;
        return this.a == shoVar.a && Intrinsics.a(this.b, shoVar.b) && Intrinsics.a(this.c, shoVar.c) && Intrinsics.a(this.d, shoVar.d) && Intrinsics.a(this.e, shoVar.e) && Intrinsics.a(this.f, shoVar.f) && Intrinsics.a(this.g, shoVar.g) && Intrinsics.a(this.h, shoVar.h) && Intrinsics.a(this.i, shoVar.i) && Intrinsics.a(this.j, shoVar.j) && Intrinsics.a(this.k, shoVar.k) && Intrinsics.a(this.l, shoVar.l) && Intrinsics.a(this.m, shoVar.m);
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        aio aioVar = this.d;
        int iHashCode = (iF + (aioVar == null ? 0 : aioVar.hashCode())) * 31;
        iio iioVar = this.e;
        int iHashCode2 = (iHashCode + (iioVar == null ? 0 : iioVar.hashCode())) * 31;
        List list = this.f;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.h;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.i;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.j;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        eio eioVar = this.l;
        int iHashCode9 = (iHashCode8 + (eioVar == null ? 0 : eioVar.hashCode())) * 31;
        Integer num = this.m;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "BidExt(adType=" + this.a + ", deepLink=" + this.b + ", fallbackUrl=" + this.c + ", omParams=" + this.d + ", templateConfig=" + this.e + ", adLoadTrackers=" + this.f + ", adVisibleTrackers=" + this.g + ", adViewableTrackers=" + this.h + ", clickTrackers=" + this.i + ", privacyUrl=" + this.j + ", adChoiceUrl=" + this.k + ", rewarded=" + this.l + ", refreshInterval=" + this.m + ')';
    }
}
