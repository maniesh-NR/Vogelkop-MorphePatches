package ads_mobile_sdk;

import defpackage.tip;

/* loaded from: classes.dex */
public final class w01 extends ku0 {
    private static final w01 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int action_;
    private String message_ = "";

    static {
        w01 w01Var = new w01();
        DEFAULT_INSTANCE = w01Var;
        ku0.a(w01.class, w01Var);
    }

    public static tip o() {
        return (tip) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"action_", "message_"});
        }
        if (iA == 3) {
            return new w01();
        }
        if (iA == 4) {
            return new tip(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(w01.class);
        }
        throw null;
    }

    public final void b(String str) {
        this.message_ = str;
    }
}
