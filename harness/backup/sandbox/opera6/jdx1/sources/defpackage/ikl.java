package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ikl {
    public static final ikl d = new ikl(0, 0, null, null, 0, 0, 0, null, null, null, 16777215);
    public final rwj a;
    public final yzf b;
    public final dhg c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ikl(long j, long j2, ki9 ki9Var, lh9 lh9Var, long j3, int i, long j4, wil wilVar, dhg dhgVar, rec recVar, int i2) {
        long j5 = (i2 & 1) != 0 ? u95.g : j;
        long j6 = (i2 & 2) != 0 ? rkl.c : j2;
        ki9 ki9Var2 = (i2 & 4) != 0 ? null : ki9Var;
        lh9 lh9Var2 = (i2 & 32) != 0 ? null : lh9Var;
        long j7 = (i2 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? rkl.c : j3;
        long j8 = u95.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j9 = (131072 & i2) != 0 ? rkl.c : j4;
        wil wilVar2 = (262144 & i2) != 0 ? null : wilVar;
        dhg dhgVar2 = (524288 & i2) != 0 ? null : dhgVar;
        rec recVar2 = (i2 & 1048576) != 0 ? null : recVar;
        dhg dhgVar3 = dhgVar2;
        this(new rwj(j5, j6, ki9Var2, (gi9) null, (hi9) null, lh9Var2, (String) null, j7, (ua3) null, (vil) null, (awc) null, j8, (bgl) null, (jaj) null, dhgVar2 != null ? dhgVar2.a : null), new yzf(i3, 0, j9, wilVar2, dhgVar3 != null ? dhgVar3.b : null, recVar2, 0, 0, null), dhgVar3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ikl(rwj rwjVar, yzf yzfVar) {
        ygg yggVar = rwjVar.o;
        pgg pggVar = yzfVar.e;
        this(rwjVar, yzfVar, (yggVar == null && pggVar == null) ? null : new dhg(yggVar, pggVar));
    }

    public ikl(rwj rwjVar, yzf yzfVar, dhg dhgVar) {
        this.a = rwjVar;
        this.b = yzfVar;
        this.c = dhgVar;
    }

    public static ikl a(ikl iklVar, long j, long j2, ki9 ki9Var, lh9 lh9Var, long j3, long j4, dhg dhgVar, rec recVar, int i) {
        long jA = (i & 1) != 0 ? iklVar.a.a.a() : j;
        long j5 = (i & 2) != 0 ? iklVar.a.b : j2;
        ki9 ki9Var2 = (i & 4) != 0 ? iklVar.a.c : ki9Var;
        rwj rwjVar = iklVar.a;
        gi9 gi9Var = rwjVar.d;
        hi9 hi9Var = rwjVar.e;
        lh9 lh9Var2 = (i & 32) != 0 ? rwjVar.f : lh9Var;
        String str = rwjVar.g;
        long j6 = (i & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? rwjVar.h : j3;
        ua3 ua3Var = rwjVar.i;
        vil vilVar = rwjVar.j;
        awc awcVar = rwjVar.k;
        long j7 = rwjVar.l;
        bgl bglVar = rwjVar.m;
        jaj jajVar = rwjVar.n;
        nk7 nk7Var = rwjVar.p;
        yzf yzfVar = iklVar.b;
        int i2 = yzfVar.a;
        int i3 = (i & 65536) != 0 ? yzfVar.b : 1;
        long j8 = (i & 131072) != 0 ? yzfVar.c : j4;
        wil wilVar = yzfVar.d;
        dhg dhgVar2 = (i & 524288) != 0 ? iklVar.c : dhgVar;
        rec recVar2 = (i & 1048576) != 0 ? yzfVar.f : recVar;
        int i4 = yzfVar.g;
        int i5 = yzfVar.h;
        vjl vjlVar = yzfVar.i;
        long jA2 = rwjVar.a.a();
        int i6 = u95.h;
        return new ikl(new rwj(jgm.a(jA, jA2) ? rwjVar.a : jA != 16 ? new za5(jA) : oil.a, j5, ki9Var2, gi9Var, hi9Var, lh9Var2, str, j6, ua3Var, vilVar, awcVar, j7, bglVar, jajVar, dhgVar2 != null ? dhgVar2.a : null, nk7Var), new yzf(i2, i3, j8, wilVar, dhgVar2 != null ? dhgVar2.b : null, recVar2, i4, i5, vjlVar), dhgVar2);
    }

    public static ikl e(ikl iklVar, long j, long j2, ki9 ki9Var, long j3, bgl bglVar, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? rkl.c : j2;
        ki9 ki9Var2 = (i2 & 4) != 0 ? null : ki9Var;
        long j6 = (i2 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? rkl.c : j3;
        long j7 = u95.g;
        bgl bglVar2 = (i2 & 4096) != 0 ? null : bglVar;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? rkl.c : j4;
        rwj rwjVarA = swj.a(iklVar.a, j, null, Float.NaN, j5, ki9Var2, null, null, null, null, j6, null, null, null, j7, bglVar2, null, null, null);
        yzf yzfVarA = zzf.a(iklVar.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (iklVar.a == rwjVarA && iklVar.b == yzfVarA) ? iklVar : new ikl(rwjVarA, yzfVarA);
    }

    public final long b() {
        return this.a.a.a();
    }

    public final boolean c(ikl iklVar) {
        if (this != iklVar) {
            return Intrinsics.a(this.b, iklVar.b) && this.a.b(iklVar.a);
        }
        return true;
    }

    public final ikl d(ikl iklVar) {
        return (iklVar == null || iklVar.equals(d)) ? this : new ikl(this.a.d(iklVar.a), this.b.a(iklVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikl)) {
            return false;
        }
        ikl iklVar = (ikl) obj;
        return Intrinsics.a(this.a, iklVar.a) && Intrinsics.a(this.b, iklVar.b) && Intrinsics.a(this.c, iklVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        dhg dhgVar = this.c;
        return iHashCode + (dhgVar != null ? dhgVar.hashCode() : 0);
    }

    public final String toString() {
        String strH = u95.h(b());
        rwj rwjVar = this.a;
        dz3 dz3VarC = rwjVar.a.c();
        float fB = rwjVar.a.b();
        String strD = rkl.d(rwjVar.b);
        ki9 ki9Var = rwjVar.c;
        gi9 gi9Var = rwjVar.d;
        hi9 hi9Var = rwjVar.e;
        lh9 lh9Var = rwjVar.f;
        String str = rwjVar.g;
        String strD2 = rkl.d(rwjVar.h);
        ua3 ua3Var = rwjVar.i;
        vil vilVar = rwjVar.j;
        awc awcVar = rwjVar.k;
        String strH2 = u95.h(rwjVar.l);
        bgl bglVar = rwjVar.m;
        jaj jajVar = rwjVar.n;
        nk7 nk7Var = rwjVar.p;
        yzf yzfVar = this.b;
        String strA = pel.a(yzfVar.a);
        String strA2 = jgl.a(yzfVar.b);
        String strD3 = rkl.d(yzfVar.c);
        wil wilVar = yzfVar.d;
        rec recVar = yzfVar.f;
        String strA3 = kec.a(yzfVar.g);
        String strA4 = pra.a(yzfVar.h);
        vjl vjlVar = yzfVar.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(dz3VarC);
        sb.append(", alpha=");
        sb.append(fB);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(ki9Var);
        sb.append(", fontStyle=");
        sb.append(gi9Var);
        sb.append(", fontSynthesis=");
        sb.append(hi9Var);
        sb.append(", fontFamily=");
        sb.append(lh9Var);
        sb.append(", fontFeatureSettings=");
        z1m.t(sb, str, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(ua3Var);
        sb.append(", textGeometricTransform=");
        sb.append(vilVar);
        sb.append(", localeList=");
        sb.append(awcVar);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(bglVar);
        sb.append(", shadow=");
        sb.append(jajVar);
        sb.append(", drawStyle=");
        sb.append(nk7Var);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        z1m.t(sb, strA2, ", lineHeight=", strD3, ", textIndent=");
        sb.append(wilVar);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(recVar);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(strA4);
        sb.append(", textMotion=");
        sb.append(vjlVar);
        sb.append(")");
        return sb.toString();
    }
}
