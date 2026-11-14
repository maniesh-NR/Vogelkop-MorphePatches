package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h46 implements i46 {
    public static final h46 k;
    public static final h46 l;
    public static final h46 m;
    public static final h46 n;
    public static final /* synthetic */ h46[] o;
    public final g46 a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final eme f;
    public final eme g;
    public final eme h;
    public final boolean i;
    public final BigDecimal j;

    static {
        g46 g46Var = g46.USD;
        h46 h46Var = new h46("USDM", 0, g46Var, "USDm", new eme((Function1) new hf5((byte) 18)), null, new eme((Function1) new hf5((byte) 23)), 700);
        k = h46Var;
        h46 h46Var2 = new h46("USDC", 1, g46Var, "USDC", new eme((Function1) new hf5((byte) 24)), new eme((Function1) new hf5((byte) 25)), null, 820);
        l = h46Var2;
        h46 h46Var3 = new h46("USDT", 2, g46Var, "USDT", new eme((Function1) new hf5((byte) 26)), new eme((Function1) new hf5((byte) 27)), null, 820);
        m = h46Var3;
        h46 h46Var4 = new h46("USAT", 3, g46Var, "USAT", new eme((Function1) new hf5((byte) 28)), new eme((Function1) new hf5((byte) 29)), null, 820);
        h46 h46Var5 = new h46("CELO", 4, g46.CELO, "CELO", new eme((Function1) new hf5((byte) 19)), new eme((Function1) new hf5((byte) 20)), null, 316);
        n = h46Var5;
        h46[] h46VarArr = {h46Var, h46Var2, h46Var3, h46Var4, h46Var5, new h46("XAUT0", 5, g46.XAU, "XAUt0", new eme((Function1) new hf5((byte) 21)), new eme((Function1) new hf5((byte) 22)), null, 308)};
        o = h46VarArr;
        h58 h58Var = new h58(h46VarArr);
        ArrayList arrayList = new ArrayList();
        w4 w4Var = new w4(h58Var, (byte) 0);
        while (w4Var.hasNext()) {
            Object next = w4Var.next();
            if (((h46) next).i) {
                arrayList.add(next);
            }
        }
    }

    public h46(String str, int i, g46 g46Var, String str2, eme emeVar, eme emeVar2, eme emeVar3, int i2) {
        int i3 = (i2 & 8) != 0 ? 18 : 6;
        int i4 = g46Var.c;
        emeVar2 = (i2 & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0 ? emeVar : emeVar2;
        emeVar3 = (i2 & Constants.Crypt.KEY_LENGTH) != 0 ? null : emeVar3;
        boolean z = (i2 & 512) != 0;
        this.a = g46Var;
        this.b = str2;
        this.c = str2;
        this.d = i3;
        this.e = i4;
        this.f = emeVar;
        this.g = emeVar2;
        this.h = emeVar3;
        this.i = z;
        this.j = he3.b.scaleByPowerOfTen(-4);
    }

    public static h46 valueOf(String str) {
        return (h46) Enum.valueOf(h46.class, str);
    }

    public static h46[] values() {
        return (h46[]) o.clone();
    }

    @Override // defpackage.i46
    public final int d() {
        return this.d;
    }

    @Override // defpackage.i46
    public final String g() {
        return this.b;
    }

    @Override // defpackage.i46
    public final int h() {
        return this.e;
    }

    @Override // defpackage.i46
    public final String i() {
        return this.c;
    }

    public final BigInteger j(BigInteger bigInteger) {
        BigInteger bigInteger2 = pe3.a;
        return bigInteger.divide(pe3.d.pow(18 - this.d));
    }
}
