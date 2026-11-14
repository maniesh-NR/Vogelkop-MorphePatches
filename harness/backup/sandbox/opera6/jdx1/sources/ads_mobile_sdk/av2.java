package ads_mobile_sdk;

import defpackage.avj;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class av2 {
    public static final avj b;
    public static final LinkedHashMap c;
    public static final av2 d;
    public static final av2 e;
    public static final av2 f;
    public static final av2 g;
    public static final av2 h;
    public static final av2 i;
    public static final av2 j;
    public static final av2 k;
    public static final av2 l;
    public static final /* synthetic */ av2[] m;
    public static final /* synthetic */ h58 n;
    public final String a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        av2 av2Var = new av2(0, "UNKNOWN", "");
        d = av2Var;
        av2 av2Var2 = new av2(1, "APP_OPEN", "app_open_ad");
        e = av2Var2;
        av2 av2Var3 = new av2(2, "BANNER", "banner");
        f = av2Var3;
        av2 av2Var4 = new av2(3, "ICON", "icon");
        g = av2Var4;
        av2 av2Var5 = new av2(4, "INTERSTITIAL", "interstitial");
        h = av2Var5;
        av2 av2Var6 = new av2(5, "NATIVE", "native");
        i = av2Var6;
        av2 av2Var7 = new av2(6, "REWARDED", "rewarded");
        j = av2Var7;
        av2 av2Var8 = new av2(7, "REWARDED_INTERSTITIAL", "rewarded_interstitial");
        k = av2Var8;
        av2 av2Var9 = new av2(8, "SWIPEABLE_INTERSTITIAL", "swipeable_interstitial");
        l = av2Var9;
        av2[] av2VarArr = {av2Var, av2Var2, av2Var3, av2Var4, av2Var5, av2Var6, av2Var7, av2Var8, av2Var9};
        m = av2VarArr;
        h58 h58Var = new h58(av2VarArr);
        n = h58Var;
        b = new avj((byte) 16);
        int iA = qbd.a(k95.o(h58Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : (byte) 16);
        w4 w4Var = new w4(h58Var, (byte) 0);
        while (w4Var.hasNext()) {
            Object next = w4Var.next();
            linkedHashMap.put(((av2) next).a, next);
        }
        c = linkedHashMap;
    }

    public av2(int i2, String str, String str2) {
        this.a = str2;
    }

    public static av2[] values() {
        return (av2[]) m.clone();
    }
}
