package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rwj implements of1 {
    public final pil a;
    public final long b;
    public final ki9 c;
    public final gi9 d;
    public final hi9 e;
    public final lh9 f;
    public final String g;
    public final long h;
    public final ua3 i;
    public final vil j;
    public final awc k;
    public final long l;
    public final bgl m;
    public final jaj n;
    public final ygg o;
    public final nk7 p;

    public rwj(long j, long j2, ki9 ki9Var, gi9 gi9Var, hi9 hi9Var, lh9 lh9Var, String str, long j3, ua3 ua3Var, vil vilVar, awc awcVar, long j4, bgl bglVar, jaj jajVar, int i) {
        this((i & 1) != 0 ? u95.g : j, (i & 2) != 0 ? rkl.c : j2, (i & 4) != 0 ? null : ki9Var, (i & 8) != 0 ? null : gi9Var, (i & 16) != 0 ? null : hi9Var, (i & 32) != 0 ? null : lh9Var, (i & 64) != 0 ? null : str, (i & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? rkl.c : j3, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : ua3Var, (i & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 ? null : vilVar, (i & 1024) != 0 ? null : awcVar, (i & 2048) != 0 ? u95.g : j4, (i & 4096) != 0 ? null : bglVar, (i & 8192) != 0 ? null : jajVar, (ygg) null);
    }

    public rwj(long j, long j2, ki9 ki9Var, gi9 gi9Var, hi9 hi9Var, lh9 lh9Var, String str, long j3, ua3 ua3Var, vil vilVar, awc awcVar, long j4, bgl bglVar, jaj jajVar, ygg yggVar) {
        this(j != 16 ? new za5(j) : oil.a, j2, ki9Var, gi9Var, hi9Var, lh9Var, str, j3, ua3Var, vilVar, awcVar, j4, bglVar, jajVar, yggVar, null);
    }

    public rwj(pil pilVar, long j, ki9 ki9Var, gi9 gi9Var, hi9 hi9Var, lh9 lh9Var, String str, long j2, ua3 ua3Var, vil vilVar, awc awcVar, long j3, bgl bglVar, jaj jajVar, ygg yggVar, nk7 nk7Var) {
        this.a = pilVar;
        this.b = j;
        this.c = ki9Var;
        this.d = gi9Var;
        this.e = hi9Var;
        this.f = lh9Var;
        this.g = str;
        this.h = j2;
        this.i = ua3Var;
        this.j = vilVar;
        this.k = awcVar;
        this.l = j3;
        this.m = bglVar;
        this.n = jajVar;
        this.o = yggVar;
        this.p = nk7Var;
    }

    public static rwj a(rwj rwjVar, long j, ki9 ki9Var, int i) {
        long jA = (i & 1) != 0 ? rwjVar.a.a() : j;
        long j2 = rwjVar.b;
        ki9 ki9Var2 = (i & 4) != 0 ? rwjVar.c : ki9Var;
        gi9 gi9Var = rwjVar.d;
        hi9 hi9Var = rwjVar.e;
        lh9 lh9Var = (i & 32) != 0 ? rwjVar.f : null;
        String str = rwjVar.g;
        long j3 = rwjVar.h;
        ua3 ua3Var = rwjVar.i;
        vil vilVar = rwjVar.j;
        awc awcVar = rwjVar.k;
        long j4 = rwjVar.l;
        bgl bglVar = rwjVar.m;
        jaj jajVar = rwjVar.n;
        ygg yggVar = rwjVar.o;
        nk7 nk7Var = rwjVar.p;
        pil za5Var = rwjVar.a;
        long jA2 = za5Var.a();
        int i2 = u95.h;
        if (!jgm.a(jA, jA2)) {
            za5Var = jA != 16 ? new za5(jA) : oil.a;
        }
        return new rwj(za5Var, j2, ki9Var2, gi9Var, hi9Var, lh9Var, str, j3, ua3Var, vilVar, awcVar, j4, bglVar, jajVar, yggVar, nk7Var);
    }

    public final boolean b(rwj rwjVar) {
        if (this == rwjVar) {
            return true;
        }
        if (!rkl.a(this.b, rwjVar.b) || !Intrinsics.a(this.c, rwjVar.c) || !Intrinsics.a(this.d, rwjVar.d) || !Intrinsics.a(this.e, rwjVar.e) || !Intrinsics.a(this.f, rwjVar.f) || !Intrinsics.a(this.g, rwjVar.g) || !rkl.a(this.h, rwjVar.h) || !Intrinsics.a(this.i, rwjVar.i) || !Intrinsics.a(this.j, rwjVar.j) || !Intrinsics.a(this.k, rwjVar.k)) {
            return false;
        }
        long j = rwjVar.l;
        int i = u95.h;
        return jgm.a(this.l, j) && Intrinsics.a(this.o, rwjVar.o);
    }

    public final boolean c(rwj rwjVar) {
        return Intrinsics.a(this.a, rwjVar.a) && Intrinsics.a(this.m, rwjVar.m) && Intrinsics.a(this.n, rwjVar.n) && Intrinsics.a(this.p, rwjVar.p);
    }

    public final rwj d(rwj rwjVar) {
        if (rwjVar == null) {
            return this;
        }
        pil pilVar = rwjVar.a;
        return swj.a(this, pilVar.a(), pilVar.c(), pilVar.b(), rwjVar.b, rwjVar.c, rwjVar.d, rwjVar.e, rwjVar.f, rwjVar.g, rwjVar.h, rwjVar.i, rwjVar.j, rwjVar.k, rwjVar.l, rwjVar.m, rwjVar.n, rwjVar.o, rwjVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwj)) {
            return false;
        }
        rwj rwjVar = (rwj) obj;
        return b(rwjVar) && c(rwjVar);
    }

    public final int hashCode() {
        pil pilVar = this.a;
        long jA = pilVar.a();
        int i = u95.h;
        igm igmVar = jgm.b;
        int iHashCode = Long.hashCode(jA) * 31;
        dz3 dz3VarC = pilVar.c();
        int iHashCode2 = (Float.hashCode(pilVar.b()) + ((iHashCode + (dz3VarC != null ? dz3VarC.hashCode() : 0)) * 31)) * 31;
        skl[] sklVarArr = rkl.b;
        int iE = z1m.e(iHashCode2, 31, this.b);
        ki9 ki9Var = this.c;
        int i2 = (iE + (ki9Var != null ? ki9Var.a : 0)) * 31;
        gi9 gi9Var = this.d;
        int iHashCode3 = (i2 + (gi9Var != null ? Integer.hashCode(gi9Var.a) : 0)) * 31;
        hi9 hi9Var = this.e;
        int iHashCode4 = (iHashCode3 + (hi9Var != null ? Integer.hashCode(hi9Var.a) : 0)) * 31;
        lh9 lh9Var = this.f;
        int iHashCode5 = (iHashCode4 + (lh9Var != null ? lh9Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iE2 = z1m.e((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.h);
        ua3 ua3Var = this.i;
        int iHashCode6 = (iE2 + (ua3Var != null ? Float.hashCode(ua3Var.a) : 0)) * 31;
        vil vilVar = this.j;
        int iHashCode7 = (iHashCode6 + (vilVar != null ? vilVar.hashCode() : 0)) * 31;
        awc awcVar = this.k;
        int iE3 = z1m.e((iHashCode7 + (awcVar != null ? awcVar.a.hashCode() : 0)) * 31, 31, this.l);
        bgl bglVar = this.m;
        int i3 = (iE3 + (bglVar != null ? bglVar.a : 0)) * 31;
        jaj jajVar = this.n;
        int iHashCode8 = (i3 + (jajVar != null ? jajVar.hashCode() : 0)) * 31;
        ygg yggVar = this.o;
        int iHashCode9 = (iHashCode8 + (yggVar != null ? yggVar.hashCode() : 0)) * 31;
        nk7 nk7Var = this.p;
        return iHashCode9 + (nk7Var != null ? nk7Var.hashCode() : 0);
    }

    public final String toString() {
        pil pilVar = this.a;
        String strH = u95.h(pilVar.a());
        dz3 dz3VarC = pilVar.c();
        float fB = pilVar.b();
        String strD = rkl.d(this.b);
        String strD2 = rkl.d(this.h);
        String strH2 = u95.h(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strH);
        sb.append(", brush=");
        sb.append(dz3VarC);
        sb.append(", alpha=");
        sb.append(fB);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        z1m.t(sb, this.g, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(strH2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
