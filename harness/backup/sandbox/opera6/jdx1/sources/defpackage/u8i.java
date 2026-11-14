package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u8i implements paj {
    public final ax5 a;
    public final ax5 b;
    public final ax5 c;
    public final ax5 d;

    public u8i(ax5 ax5Var, ax5 ax5Var2, ax5 ax5Var3, ax5 ax5Var4) {
        this.a = ax5Var;
        this.b = ax5Var2;
        this.c = ax5Var3;
        this.d = ax5Var4;
    }

    public static u8i b(u8i u8iVar, ax5 ax5Var, ax5 ax5Var2, ax5 ax5Var3, ax5 ax5Var4, int i) {
        if ((i & 1) != 0) {
            ax5Var = u8iVar.a;
        }
        if ((i & 2) != 0) {
            ax5Var2 = u8iVar.b;
        }
        if ((i & 4) != 0) {
            ax5Var3 = u8iVar.c;
        }
        if ((i & 8) != 0) {
            ax5Var4 = u8iVar.d;
        }
        u8iVar.getClass();
        return new u8i(ax5Var, ax5Var2, ax5Var3, ax5Var4);
    }

    @Override // defpackage.paj
    public final w7d a(long j, d2c d2cVar, n27 n27Var) {
        float fA = this.a.a(j, n27Var);
        float fA2 = this.b.a(j, n27Var);
        float fA3 = this.c.a(j, n27Var);
        float fA4 = this.d.a(j, n27Var);
        float fC = bpj.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbP = am2.p("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbP.append(fA3);
            sbP.append(", bottomStart = ");
            sbP.append(fA4);
            sbP.append(")!");
            d8b.a(sbP.toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new mtf(bwg.a(0L, j));
        }
        voh vohVarA = bwg.a(0L, j);
        d2c d2cVar2 = d2c.a;
        float f5 = d2cVar == d2cVar2 ? fA : fA2;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
        if (d2cVar == d2cVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
        float f6 = d2cVar == d2cVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (d2cVar != d2cVar2) {
            fA4 = fA3;
        }
        return new ntf(new h8i(vohVarA.a, vohVarA.b, vohVarA.c, vohVarA.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (Float.floatToRawIntBits(fA4) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8i)) {
            return false;
        }
        u8i u8iVar = (u8i) obj;
        return Intrinsics.a(this.a, u8iVar.a) && Intrinsics.a(this.b, u8iVar.b) && Intrinsics.a(this.c, u8iVar.c) && Intrinsics.a(this.d, u8iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
