package ads_mobile_sdk;

import defpackage.drj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u8 {
    public static final drj a;
    public static final u8 b;
    public static final u8 c;
    public static final u8 d;
    public static final /* synthetic */ u8[] e;

    static {
        u8 u8Var = new u8("UNKNOWN", 0);
        b = u8Var;
        u8 u8Var2 = new u8("BANNER", 1);
        u8 u8Var3 = new u8("INTERSTITIAL", 2);
        u8 u8Var4 = new u8("NATIVE", 3);
        c = u8Var4;
        u8 u8Var5 = new u8("REWARDED", 4);
        u8 u8Var6 = new u8("APP_OPEN", 5);
        d = u8Var6;
        e = new u8[]{u8Var, u8Var2, u8Var3, u8Var4, u8Var5, u8Var6, new u8("REWARDED_INTERSTITIAL", 6), new u8("SWIPEABLE_INTERSTITIAL", 7)};
        a = new drj((byte) 15);
    }

    public static u8[] values() {
        return (u8[]) e.clone();
    }
}
