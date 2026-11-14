package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lekl;", "Lh8e;", "Lhkl;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ekl extends h8e {
    public final String b;
    public final ikl c;
    public final mh9 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;

    public ekl(String str, ikl iklVar, mh9 mh9Var, int i, boolean z, int i2, int i3) {
        this.b = str;
        this.c = iklVar;
        this.d = mh9Var;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekl)) {
            return false;
        }
        ekl eklVar = (ekl) obj;
        return Intrinsics.a(this.b, eklVar.b) && Intrinsics.a(this.c, eklVar.c) && Intrinsics.a(this.d, eklVar.d) && this.e == eklVar.e && this.f == eklVar.f && this.g == eklVar.g && this.h == eklVar.h;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        hkl hklVar = new hkl();
        hklVar.o = this.b;
        hklVar.p = this.c;
        hklVar.q = this.d;
        hklVar.r = this.e;
        hklVar.s = this.f;
        hklVar.t = this.g;
        hklVar.u = this.h;
        return hklVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h8e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.b8e r13) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekl.h(b8e):void");
    }

    public final int hashCode() {
        return (((fki.k(rfp.c(this.e, (this.d.hashCode() + fki.l(this.c, this.b.hashCode() * 31, 31)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
    }
}
