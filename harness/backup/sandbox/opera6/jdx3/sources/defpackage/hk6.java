package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hk6 {
    public static final a36 e;
    public static final zyk f;
    public static final hk6 g;
    public static final /* synthetic */ hk6[] h;
    public static final /* synthetic */ h58 i;
    public final int a;
    public final int b;
    public final Integer c;
    public final String d;

    static {
        hk6 hk6Var = new hk6("ARIA", 0, 2132017628, 2131231724, 2130969284, "ofa://ui/aria?source=sd_plus");
        hk6 hk6Var2 = new hk6("BOOKMARKS", 1, 2132018055, 2131232005, 2130969127, "ofa://ui/bookmarks?source=sd_plus");
        hk6 hk6Var3 = new hk6("HISTORY", 2, 2132020572, 2131232106, 2130969184, "ofa://ui/history?source=sd_plus");
        hk6 hk6Var4 = new hk6("PASSWORDS", 3, 2132020339, 2131232172, 2130969125, "ofa://ui/passwords?source=sd_plus");
        hk6 hk6Var5 = new hk6("OFFLINE_PAGES", 4, 2132020573, 2131232164, 2130969196, "ofa://ui/offline_pages?source=sd_plus");
        hk6 hk6Var6 = new hk6("FLOW", 5, 2132019117, 2131232088, 2130969188, "ofa://ui/flow?source=sd_plus");
        hk6 hk6Var7 = new hk6("LIVE_SCORES", 6, 2132019526, 2131232125, 2130969194, "ofa://ui/live_scores?source=sd_plus");
        hk6 hk6Var8 = new hk6("SD_SYNC", 7, 2132021794, 2131232268, 2130969133, "ofa://ui/synced_speeddials?source=sd_plus");
        g = hk6Var8;
        hk6[] hk6VarArr = {hk6Var, hk6Var2, hk6Var3, hk6Var4, hk6Var5, hk6Var6, hk6Var7, hk6Var8, new hk6("DOWNLOADS", 8, 2132018731, 2131232067, 2130969192, "ofa://ui/downloads?source=sd_plus"), new hk6("REWARDS", 9, 2132019769, 2131232223, 2130969190, "ofa://ui/rewards?source=sd_plus"), new hk6("JUMP", 10, 2132019793, 2131232120, 2130969135, btb.c(13, "sd_plus", null))};
        h = hk6VarArr;
        i = new h58(hk6VarArr);
        e = new a36();
        f = z4c.b(new ki5((byte) 13));
    }

    public hk6(String str, int i2, int i3, int i4, Integer num, String str2) {
        this.a = i3;
        this.b = i4;
        this.c = num;
        this.d = str2;
    }

    public static hk6 valueOf(String str) {
        return (hk6) Enum.valueOf(hk6.class, str);
    }

    public static hk6[] values() {
        return (hk6[]) h.clone();
    }
}
