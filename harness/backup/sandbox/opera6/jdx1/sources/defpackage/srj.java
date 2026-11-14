package defpackage;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class srj implements paj {
    public final ax5 a;
    public final ax5 b;
    public final ax5 c;
    public final ax5 d;

    public srj(ax5 ax5Var, ax5 ax5Var2, ax5 ax5Var3, ax5 ax5Var4) {
        this.a = ax5Var;
        this.b = ax5Var2;
        this.c = ax5Var3;
        this.d = ax5Var4;
    }

    @Override // defpackage.paj
    public final w7d a(long j, d2c d2cVar, n27 n27Var) {
        float fA;
        float fA2;
        float fA3;
        float fA4;
        Path path;
        float f;
        float f2;
        float f3;
        float f4;
        rrj rrjVar;
        String str;
        float f5;
        rrj rrjVar2;
        String strL;
        String str2;
        String str3;
        String strL2;
        String strL3;
        String strL4;
        boolean z = d2cVar == d2c.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        ax5 ax5Var = this.c;
        ax5 ax5Var2 = this.d;
        ax5 ax5Var3 = this.a;
        ax5 ax5Var4 = this.b;
        if (z) {
            fA3 = ax5Var4.a(j, n27Var);
            fA2 = ax5Var3.a(j, n27Var);
            fA4 = ax5Var2.a(j, n27Var);
            fA = ax5Var.a(j, n27Var);
        } else {
            float fA5 = ax5Var3.a(j, n27Var);
            float fA6 = ax5Var4.a(j, n27Var);
            float fA7 = ax5Var.a(j, n27Var);
            fA = ax5Var2.a(j, n27Var);
            fA2 = fA6;
            fA3 = fA5;
            fA4 = fA7;
        }
        if (fIntBitsToFloat <= 0.0f || fIntBitsToFloat2 <= 0.0f) {
            path = new Path();
        } else {
            float fB = djh.b(1.0f, 0.0f, 1.0f);
            if (fA3 < 0.0f) {
                fA3 = 0.0f;
            }
            if (fA2 < 0.0f) {
                fA2 = 0.0f;
            }
            if (fA4 < 0.0f) {
                fA4 = 0.0f;
            }
            if (fA < 0.0f) {
                fA = 0.0f;
            }
            rrj rrjVarH = rih.h(fA2, rih.f(fA2, fA3, fA4, fIntBitsToFloat, fIntBitsToFloat2), fB);
            float f6 = rrjVarH.e;
            rrj rrjVarH2 = rih.h(fA4, rih.f(fA4, fA, fA2, fIntBitsToFloat, fIntBitsToFloat2), fB);
            float f7 = rrjVarH2.e;
            rrj rrjVarH3 = rih.h(fA, rih.f(fA, fA4, fA3, fIntBitsToFloat, fIntBitsToFloat2), fB);
            float f8 = rrjVarH3.e;
            rrj rrjVarH4 = rih.h(fA3, rih.f(fA3, fA2, fA, fIntBitsToFloat, fIntBitsToFloat2), fB);
            float f9 = rrjVarH4.e;
            StringBuilder sb = new StringBuilder("M ");
            sb.append(rih.n(fIntBitsToFloat - f6));
            sb.append(" 0 ");
            boolean z2 = rrjVarH.g <= 0.0f;
            float f10 = rrjVarH.d;
            float f11 = rrjVarH.c;
            float f12 = rrjVarH.b;
            float f13 = rrjVarH.a;
            if (z2) {
                strL = sko.k("l ", rih.n(f6), " 0 ");
                rrjVar = rrjVarH4;
                f4 = f9;
                f5 = f8;
                str = "l ";
                f = fIntBitsToFloat;
                f2 = fIntBitsToFloat2;
                rrjVar2 = rrjVarH3;
                f3 = f7;
            } else {
                String strN = rih.n(f13);
                float f14 = f13 + f12;
                String strN2 = rih.n(f14);
                float f15 = f14 + f11;
                f = fIntBitsToFloat;
                String strN3 = rih.n(f15);
                f2 = fIntBitsToFloat2;
                String strN4 = rih.n(f10);
                f3 = f7;
                String strE = rih.e(rrjVarH, 1.0f, 1.0f);
                String strN5 = rih.n(f10);
                f4 = f9;
                String strN6 = rih.n(f11);
                rrjVar = rrjVarH4;
                String strN7 = rih.n(f10);
                str = "l ";
                String strN8 = rih.n(f12 + f11);
                f5 = f8;
                String strN9 = rih.n(f10);
                rrjVar2 = rrjVarH3;
                String strN10 = rih.n(f15);
                StringBuilder sbN = z1m.n("c ", strN, " 0 ", strN2, " 0 ");
                z1m.t(sbN, strN3, " ", strN4, " ");
                z1m.t(sbN, strE, "c ", strN5, " ");
                z1m.t(sbN, strN6, " ", strN7, " ");
                z1m.t(sbN, strN8, " ", strN9, " ");
                strL = z1m.l(sbN, strN10, " ");
            }
            sb.append(strL);
            sb.append("L ");
            sb.append(rih.n(f));
            sb.append(' ');
            sb.append(rih.n(f2 - f3));
            sb.append(' ');
            boolean z3 = rrjVarH2.g <= 0.0f;
            float f16 = rrjVarH2.c;
            float f17 = rrjVarH2.d;
            float f18 = rrjVarH2.b;
            float f19 = rrjVarH2.a;
            if (z3) {
                strL2 = sko.k("l 0 ", rih.n(f3), " ");
                str3 = "L ";
                str2 = "l 0 ";
            } else {
                String strN11 = rih.n(f19);
                float f20 = f19 + f18;
                String strN12 = rih.n(f20);
                String strN13 = rih.n(-f17);
                float f21 = f20 + f16;
                String strN14 = rih.n(f21);
                String strE2 = rih.e(rrjVarH2, -1.0f, 1.0f);
                String strN15 = rih.n(-f16);
                String strN16 = rih.n(f17);
                String strN17 = rih.n(-(f18 + f16));
                str2 = "l 0 ";
                String strN18 = rih.n(f17);
                String strN19 = rih.n(-f21);
                str3 = "L ";
                String strN20 = rih.n(f17);
                StringBuilder sbN2 = z1m.n("c 0 ", strN11, " 0 ", strN12, " ");
                z1m.t(sbN2, strN13, " ", strN14, " ");
                z1m.t(sbN2, strE2, "c ", strN15, " ");
                z1m.t(sbN2, strN16, " ", strN17, " ");
                z1m.t(sbN2, strN18, " ", strN19, " ");
                strL2 = z1m.l(sbN2, strN20, " ");
            }
            sb.append(strL2);
            sb.append(str3);
            sb.append(rih.n(f5));
            sb.append(' ');
            sb.append(rih.n(f2));
            sb.append(' ');
            rrj rrjVar3 = rrjVar2;
            boolean z4 = rrjVar3.g <= 0.0f;
            float f22 = rrjVar3.d;
            float f23 = rrjVar3.c;
            float f24 = rrjVar3.b;
            float f25 = rrjVar3.a;
            if (z4) {
                strL3 = sko.k(str, rih.n(-f5), " 0 ");
            } else {
                String strN21 = rih.n(-f25);
                float f26 = f25 + f24;
                String strN22 = rih.n(-f26);
                float f27 = -(f26 + f23);
                String strN23 = rih.n(f27);
                float f28 = -f22;
                String strN24 = rih.n(f28);
                String strE3 = rih.e(rrjVar3, -1.0f, -1.0f);
                String strN25 = rih.n(f28);
                String strN26 = rih.n(-f23);
                String strN27 = rih.n(f28);
                String strN28 = rih.n(-(f24 + f23));
                String strN29 = rih.n(f28);
                String strN30 = rih.n(f27);
                StringBuilder sbN3 = z1m.n("c ", strN21, " 0 ", strN22, " 0 ");
                z1m.t(sbN3, strN23, " ", strN24, " ");
                z1m.t(sbN3, strE3, "c ", strN25, " ");
                z1m.t(sbN3, strN26, " ", strN27, " ");
                z1m.t(sbN3, strN28, " ", strN29, " ");
                strL3 = z1m.l(sbN3, strN30, " ");
            }
            sb.append(strL3);
            sb.append("L 0 ");
            sb.append(rih.n(f4));
            sb.append(' ');
            rrj rrjVar4 = rrjVar;
            boolean z5 = rrjVar4.g <= 0.0f;
            float f29 = rrjVar4.c;
            float f30 = rrjVar4.d;
            float f31 = rrjVar4.b;
            float f32 = rrjVar4.a;
            if (z5) {
                strL4 = sko.k(str2, rih.n(-f4), " ");
            } else {
                String strN31 = rih.n(-f32);
                float f33 = f32 + f31;
                String strN32 = rih.n(-f33);
                String strN33 = rih.n(f30);
                float f34 = f33 + f29;
                String strN34 = rih.n(-f34);
                String strE4 = rih.e(rrjVar4, 1.0f, -1.0f);
                String strN35 = rih.n(f29);
                float f35 = -f30;
                String strN36 = rih.n(f35);
                String strN37 = rih.n(f31 + f29);
                String strN38 = rih.n(f35);
                String strN39 = rih.n(f34);
                String strN40 = rih.n(f35);
                StringBuilder sbN4 = z1m.n("c 0 ", strN31, " 0 ", strN32, " ");
                z1m.t(sbN4, strN33, " ", strN34, " ");
                z1m.t(sbN4, strE4, "c ", strN35, " ");
                z1m.t(sbN4, strN36, " ", strN37, " ");
                z1m.t(sbN4, strN38, " ", strN39, " ");
                strL4 = z1m.l(sbN4, strN40, " ");
            }
            sb.append(strL4);
            sb.append('Z');
            path = oup.S(sb.toString());
        }
        return new ltf(new d91(path));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srj)) {
            return false;
        }
        srj srjVar = (srj) obj;
        return this.a.equals(srjVar.a) && this.b.equals(srjVar.b) && this.c.equals(srjVar.c) && this.d.equals(srjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 1602262289) * 31)) * 31)) * 31);
    }
}
