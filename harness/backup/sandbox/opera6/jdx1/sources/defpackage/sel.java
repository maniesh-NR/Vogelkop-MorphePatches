package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsel;", "Lh8e;", "Lvel;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class sel extends h8e {
    public final sf1 b;
    public final ikl c;
    public final mh9 d;
    public final Function1 e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List j;
    public final Function1 k;
    public final Function1 l;

    public sel(sf1 sf1Var, ikl iklVar, mh9 mh9Var, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, Function1 function13) {
        this.b = sf1Var;
        this.c = iklVar;
        this.d = mh9Var;
        this.e = function1;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = function12;
        this.l = function13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sel)) {
            return false;
        }
        sel selVar = (sel) obj;
        return Intrinsics.a(this.b, selVar.b) && Intrinsics.a(this.c, selVar.c) && Intrinsics.a(this.j, selVar.j) && Intrinsics.a(this.d, selVar.d) && this.e == selVar.e && this.l == selVar.l && this.f == selVar.f && this.g == selVar.g && this.h == selVar.h && this.i == selVar.i && this.k == selVar.k;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        vel velVar = new vel();
        velVar.o = this.b;
        velVar.p = this.c;
        velVar.q = this.d;
        velVar.r = this.e;
        velVar.s = this.f;
        velVar.t = this.g;
        velVar.u = this.h;
        velVar.v = this.i;
        velVar.w = this.j;
        velVar.x = this.k;
        velVar.y = this.l;
        return velVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h8e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.b8e r17) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sel.h(b8e):void");
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + fki.l(this.c, this.b.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.e;
        int iK = (((fki.k(rfp.c(this.f, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.g) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int iHashCode2 = (iK + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.k;
        int iHashCode3 = (iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 29791;
        Function1 function13 = this.l;
        return iHashCode3 + (function13 != null ? function13.hashCode() : 0);
    }
}
