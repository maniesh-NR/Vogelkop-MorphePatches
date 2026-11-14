package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yzf implements of1 {
    public final int a;
    public final int b;
    public final long c;
    public final wil d;
    public final pgg e;
    public final rec f;
    public final int g;
    public final int h;
    public final vjl i;

    public yzf(int i, int i2, long j, wil wilVar, pgg pggVar, rec recVar, int i3, int i4, vjl vjlVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = wilVar;
        this.e = pggVar;
        this.f = recVar;
        this.g = i3;
        this.h = i4;
        this.i = vjlVar;
        skl[] sklVarArr = rkl.b;
        if (rkl.a(j, rkl.c)) {
            return;
        }
        if (rkl.c(j) >= 0.0f) {
            return;
        }
        b8b.b("lineHeight can't be negative (" + rkl.c(j) + ")");
    }

    public final yzf a(yzf yzfVar) {
        return yzfVar == null ? this : zzf.a(this, yzfVar.a, yzfVar.b, yzfVar.c, yzfVar.d, yzfVar.e, yzfVar.f, yzfVar.g, yzfVar.h, yzfVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzf)) {
            return false;
        }
        yzf yzfVar = (yzf) obj;
        return this.a == yzfVar.a && this.b == yzfVar.b && rkl.a(this.c, yzfVar.c) && Intrinsics.a(this.d, yzfVar.d) && Intrinsics.a(this.e, yzfVar.e) && Intrinsics.a(this.f, yzfVar.f) && this.g == yzfVar.g && this.h == yzfVar.h && Intrinsics.a(this.i, yzfVar.i);
    }

    public final int hashCode() {
        int iC = rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
        skl[] sklVarArr = rkl.b;
        int iE = z1m.e(iC, 31, this.c);
        wil wilVar = this.d;
        int iHashCode = (iE + (wilVar != null ? wilVar.hashCode() : 0)) * 31;
        pgg pggVar = this.e;
        int iHashCode2 = (iHashCode + (pggVar != null ? pggVar.hashCode() : 0)) * 31;
        rec recVar = this.f;
        int iC2 = rfp.c(this.h, rfp.c(this.g, (iHashCode2 + (recVar != null ? recVar.hashCode() : 0)) * 31, 31), 31);
        vjl vjlVar = this.i;
        return iC2 + (vjlVar != null ? vjlVar.hashCode() : 0);
    }

    public final String toString() {
        String strA = pel.a(this.a);
        String strA2 = jgl.a(this.b);
        String strD = rkl.d(this.c);
        String strA3 = kec.a(this.g);
        String strA4 = pra.a(this.h);
        StringBuilder sbN = z1m.n("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbN.append(strD);
        sbN.append(", textIndent=");
        sbN.append(this.d);
        sbN.append(", platformStyle=");
        sbN.append(this.e);
        sbN.append(", lineHeightStyle=");
        sbN.append(this.f);
        sbN.append(", lineBreak=");
        z1m.t(sbN, strA3, ", hyphens=", strA4, ", textMotion=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }
}
