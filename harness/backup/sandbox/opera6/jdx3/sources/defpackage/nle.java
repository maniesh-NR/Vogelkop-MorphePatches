package defpackage;

/* loaded from: classes.dex */
public enum nle {
    MAIN(42220, "https://celo-rpc-mainnet-2.satoshi.opera-api.com", "https://crypto-gateway.satoshi.opera-api.com/celo-phone-validator/", new yqj(uv.b("0xefB84935239dAcdecF7c5bA76d8dE40b077B7b33"), uv.b("0x0aD5b1d0C25ecF6266Dd951403723B2687d6aff2"))),
    /* JADX INFO: Fake field, exist only in values array */
    TEST(11142220, "https://forno.celo-sepolia.celo-testnet.org", "https://crypto-gateway-staging.satoshi.opera-api.com/celo-phone-validator/", new yqj(uv.b("0xAb077999e5fA13bCda1599926F8927dDEADe533C"), uv.b("0xb0Fe4466f288A3BbE5C2736B081B2021080DF703")));

    public final int a;
    public final String b;
    public final String c;
    public final yqj d;

    static {
        wv.Companion.getClass();
    }

    nle(long j, String str, String str2, yqj yqjVar) {
        this.a = (int) j;
        this.b = str;
        this.c = str2;
        this.d = yqjVar;
    }
}
