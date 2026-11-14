package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xsk {
    public static final dpj c;
    public static final String d;
    public static final ArrayList e;
    public static final /* synthetic */ xsk[] f;
    public static final /* synthetic */ h58 g;
    public final String a;
    public final String b;

    static {
        xsk[] xskVarArr = {new xsk("VPN_PRO", 0, "VPN Pro", "vpn_pro_in_app_notification"), new xsk("WALLPAPER", 1, "Wallpaper", "wallpaper_in_app_notification"), new xsk("FEEDBACK_AND_RATINGS", 2, "Feedback and Ratings", "feedback_in_app_notification"), new xsk("PRODUCT_AND_SERVICE_NEWS", 3, "Product and service news", "product_and_service_in_app_notification"), new xsk("FEATURE_TIPS", 4, "Feature tips", "feature_tips_notification"), new xsk("REWARDS", 5, "Rewards", "rewards_notifications"), new xsk("ESIM", 6, "eSIM", "esim_notifications")};
        f = xskVarArr;
        h58 h58Var = new h58(xskVarArr);
        g = h58Var;
        c = new dpj((byte) 3);
        d = CollectionsKt.P(h58Var, ",", (CharSequence) null, (String) null, 0, new r4k((byte) 24), 30);
        ArrayList arrayList = new ArrayList(k95.o(h58Var, 10));
        w4 w4Var = new w4(h58Var, (byte) 0);
        while (w4Var.hasNext()) {
            arrayList.add(((xsk) w4Var.next()).b);
        }
        e = arrayList;
    }

    public xsk(String str, int i, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static xsk valueOf(String str) {
        return (xsk) Enum.valueOf(xsk.class, str);
    }

    public static xsk[] values() {
        return (xsk[]) f.clone();
    }
}
