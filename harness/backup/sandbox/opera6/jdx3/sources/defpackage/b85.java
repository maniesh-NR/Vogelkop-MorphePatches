package defpackage;

import java.math.BigInteger;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class b85 {
    public static final b85 c;
    public static final /* synthetic */ b85[] d;
    public final int a;
    public final int b;

    static {
        yv yvVar = yv.b;
        b85 b85Var = new b85("ETH", 0, 60, new m01(yvVar, "Ether", "ETH", 18), 1);
        c = b85Var;
        b85 b85Var2 = new b85("BTC", 1, 0, new m01(yvVar, "Bitcoin", "BTC", 8), 2);
        b85 b85Var3 = new b85("BTC_TEST", 2, 1, new m01(yvVar, "Bitcoin", "BTC", 8), 2);
        b85 b85Var4 = new b85("CELO", 3, 52752, new m01(yvVar, "Celo", "CELO", 18), 1);
        d = new b85[]{b85Var, b85Var2, b85Var3, b85Var4, new b85("SOLANA", 4, 501, new m01(yvVar, "Solana", "SOL", 9), 2), new b85("TRON", 5, 195, new m01(yvVar, "Tron", "TRX", 6), 2), new b85("FIO", 6, 235, new m01(yvVar, "Fio", "FIO", 9), 2), new b85("DAI", 7, -1, new m01(yv.c("0x6b175474e89094c44da98b954eedeac495271d0f", b85Var), "Dai", "DAI", 18), 1), new b85("CUSD", 8, -2, new m01(yv.c("0x765de816845861e75a25fca122bb6898b8b1282a", b85Var4), "Celo Dollar", "cUSD", 18), 1), new b85("CEUR", 9, -3, new m01(yv.c("0xD8763CBa276a3738E6DE85b4b3bF5FDed6D6cA73", b85Var4), "Celo Euro", "cEUR", 18), 1), new b85("CKB", 10, 309, new m01(yvVar, "Nervos CKB", "CKB", 8), 2), new b85("MATIC", 11, 966, new m01(yvVar, "Matic", "MATIC", 18), 1), new b85("STARKWARE", 12, -4, new m01(yvVar, "Ether", "ETH", 18, BigInteger.valueOf(10L).pow(10).longValue()), 1), new b85("STARKWARE_TEST", 13, -5, new m01(yvVar, "Ether", "ETH", 18, BigInteger.valueOf(10L).pow(10).longValue()), 1), new b85("IXO", 14, 118, new m01(yvVar, "Ixo", "IXO", 6), 2), new b85("RONIN", 15, -6, new m01(yvVar, "Ronin", "RON", 18), 1), new b85("BNB", 16, 714, new m01(yvVar, "BNB", "BNB", 18), 1), new b85("NEAR", 17, 397, new m01(yvVar, "Near", "NEAR", 24), 2)};
    }

    public b85(String str, int i, int i2, m01 m01Var, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static b85 valueOf(String str) {
        return (b85) Enum.valueOf(b85.class, str);
    }

    public static b85[] values() {
        return (b85[]) d.clone();
    }
}
