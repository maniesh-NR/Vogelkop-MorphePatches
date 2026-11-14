package defpackage;

import com.leanplum.internal.Constants;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class y0p {

    @NotNull
    public static final x0p Companion = new x0p();
    public static final KSerializer[] n;
    public final List a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final List h;
    public final int i;
    public final List j;
    public final Integer k;
    public final List l;
    public final List m;

    static {
        KSerializer k72Var = new k72(xhk.a, (byte) 0);
        ecb ecbVar = ecb.a;
        n = new KSerializer[]{k72Var, new k72(ecbVar, (byte) 0), null, null, null, null, null, new k72(ecbVar, (byte) 0), null, new k72(ecbVar, (byte) 0), null, new k72(ecbVar, (byte) 0), new k72(ecbVar, (byte) 0)};
    }

    public y0p(int i, List list, List list2, int i2, int i3, int i4, int i5, int i6, List list3, int i7, List list4, Integer num, List list5, List list6) {
        if (7391 != (i & 7391)) {
            x7d.I(i, 7391, w0p.b);
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        if ((i & 32) == 0) {
            this.f = 1;
        } else {
            this.f = i5;
        }
        this.g = i6;
        this.h = list3;
        if ((i & Constants.Crypt.KEY_LENGTH) == 0) {
            this.i = 1;
        } else {
            this.i = i7;
        }
        if ((i & 512) == 0) {
            this.j = Collections.singletonList(2);
        } else {
            this.j = list4;
        }
        this.k = num;
        this.l = list5;
        this.m = list6;
    }

    public y0p(List list, List list2, int i, int i2, int i3, int i4, List list3, Integer num, List list4, List list5) {
        List listSingletonList = Collections.singletonList(2);
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = 1;
        this.g = i4;
        this.h = list3;
        this.i = 1;
        this.j = listSingletonList;
        this.k = num;
        this.l = list4;
        this.m = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0p)) {
            return false;
        }
        y0p y0pVar = (y0p) obj;
        return Intrinsics.a(this.a, y0pVar.a) && Intrinsics.a(this.b, y0pVar.b) && this.c == y0pVar.c && this.d == y0pVar.d && this.e == y0pVar.e && this.f == y0pVar.f && this.g == y0pVar.g && Intrinsics.a(this.h, y0pVar.h) && this.i == y0pVar.i && Intrinsics.a(this.j, y0pVar.j) && Intrinsics.a(this.k, y0pVar.k) && Intrinsics.a(this.l, y0pVar.l) && Intrinsics.a(this.m, y0pVar.m);
    }

    public final int hashCode() {
        int iF = rfp.f(rfp.c(this.i, rfp.f(rfp.c(this.g, rfp.c(this.f, rfp.c(this.e, rfp.c(this.d, rfp.c(this.c, rfp.f(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31), 31), 31, this.h), 31), 31, this.j);
        Integer num = this.k;
        int iF2 = rfp.f((iF + (num == null ? 0 : num.hashCode())) * 31, 31, this.l);
        List list = this.m;
        return iF2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Video(mimes=" + this.a + ", protocols=" + this.b + ", w=" + this.c + ", h=" + this.d + ", placement=" + this.e + ", linearity=" + this.f + ", skip=" + this.g + ", playbackmethod=" + this.h + ", playbackend=" + this.i + ", delivery=" + this.j + ", pos=" + this.k + ", api=" + this.l + ", companiontype=" + this.m + ')';
    }
}
