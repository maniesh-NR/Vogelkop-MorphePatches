package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class xlg {

    @NotNull
    public static final wlg Companion = new wlg();
    public static final l4c[] n = {null, null, z4c.a(f7c.b, new kof((byte) 22)), null, null, null, null, null, null, null, null, null, null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final String i;
    public final String j;
    public final Long k;
    public final String l;
    public final String m;

    public /* synthetic */ xlg(int i, String str, String str2, List list, String str3, String str4, String str5, String str6, long j, String str7, String str8, Long l, String str9, String str10) {
        if (495 != (i & 495)) {
            x7d.I(i, 495, vlg.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        this.f = str5;
        this.g = str6;
        this.h = j;
        this.i = str7;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str9;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str10;
        }
    }

    public xlg(String str, String str2, List list, String str3, String str4, String str5, String str6, long j, String str7, String str8, Long l, String str9, String str10) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = j;
        this.i = str7;
        this.j = str8;
        this.k = l;
        this.l = str9;
        this.m = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlg)) {
            return false;
        }
        xlg xlgVar = (xlg) obj;
        return Intrinsics.a(this.a, xlgVar.a) && Intrinsics.a(this.b, xlgVar.b) && Intrinsics.a(this.c, xlgVar.c) && Intrinsics.a(this.d, xlgVar.d) && Intrinsics.a(this.e, xlgVar.e) && Intrinsics.a(this.f, xlgVar.f) && Intrinsics.a(this.g, xlgVar.g) && this.h == xlgVar.h && Intrinsics.a(this.i, xlgVar.i) && Intrinsics.a(this.j, xlgVar.j) && Intrinsics.a(this.k, xlgVar.k) && Intrinsics.a(this.l, xlgVar.l) && Intrinsics.a(this.m, xlgVar.m);
    }

    public final int hashCode() {
        int iF = z1m.f(rfp.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iF2 = z1m.f(z1m.e(z1m.f(z1m.f((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str2 = this.j;
        int iHashCode = (iF2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.k;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
