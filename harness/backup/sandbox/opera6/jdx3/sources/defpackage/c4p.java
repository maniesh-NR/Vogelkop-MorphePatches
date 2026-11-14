package defpackage;

import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class c4p {

    @NotNull
    public static final a4p Companion = new a4p();
    public static final KSerializer[] u = {null, null, new k72(g4p.c, (byte) 0), new k72(v4p.a, (byte) 0), new k72(xhk.a, (byte) 0)};
    public final a5p a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final zyk f;
    public final zyk g;
    public final zyk h;
    public final zyk i;
    public final zyk j;
    public final zyk k;
    public final zyk l;
    public final zyk m;
    public final zyk n;
    public final zyk o;
    public final zyk p;
    public final zyk q;
    public final zyk r;
    public final zyk s;
    public final zyk t;

    public c4p(int i, a5p a5pVar, String str, List list, List list2, List list3) {
        byte b = 1;
        if (1 != (i & 1)) {
            x7d.I(i, 1, z3p.b);
            throw null;
        }
        this.a = a5pVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list3;
        }
        this.f = z4c.b(new e7p(this, (byte) 5));
        this.g = z4c.b(new e7p(this, (byte) 6));
        this.h = z4c.b(new e7p(this, (byte) 7));
        this.i = z4c.b(new e7p(this, (byte) 8));
        this.j = z4c.b(new e7p(this, (byte) 9));
        this.k = z4c.b(new e7p(this, (byte) 10));
        this.l = z4c.b(new e7p(this, (byte) 11));
        this.m = z4c.b(new e7p(this, (byte) 12));
        this.n = z4c.b(new e7p(this, (byte) 13));
        this.o = z4c.b(new e7p(this, (byte) 0));
        this.p = z4c.b(new e7p(this, b));
        this.q = z4c.b(new e7p(this, (byte) 2));
        this.r = z4c.b(new e7p(this, (byte) 3));
        this.s = z4c.b(new pw3(a5pVar, a5p.class, "landingUrl", "getLandingUrl()Ljava/lang/String;", 0, (byte) 19));
        this.t = z4c.b(new e7p(this, (byte) 4));
    }

    public static List a(List list, u4p u4pVar) {
        if (list == null) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            x4p x4pVar = (x4p) obj;
            if (URLUtil.isNetworkUrl(x4pVar.c) && x4pVar.a == u4pVar.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((x4p) obj2).c);
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4p)) {
            return false;
        }
        c4p c4pVar = (c4p) obj;
        return Intrinsics.a(this.a, c4pVar.a) && Intrinsics.a(this.b, c4pVar.b) && Intrinsics.a(this.c, c4pVar.c) && Intrinsics.a(this.d, c4pVar.d) && Intrinsics.a(this.e, c4pVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.e;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "AdMarkup(link=" + this.a + ", ver=" + this.b + ", assets=" + this.c + ", impressionTrackers=" + this.d + ", legacyImpressionTrackers=" + this.e + ')';
    }
}
