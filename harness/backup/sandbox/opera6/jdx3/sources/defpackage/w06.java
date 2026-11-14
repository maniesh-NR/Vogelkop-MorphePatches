package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public class w06 {
    public static final w06 b;
    public static final w06 c;
    public static final l06 d;
    public static final m06 e;
    public static final w06 f;
    public static final n06 g;
    public static final w06 h;
    public static final w06 i;
    public static final w06 j;
    public static final w06 k;
    public static final o06 l;
    public static final p06 m;
    public static final q06 n;
    public static final w06 o;
    public static final w06 p;
    public static final w06 q;
    public static final r06 r;
    public static final s06 s;
    public static final t06 t;
    public static final w06 u;
    public static final w06 v;
    public static final /* synthetic */ w06[] w;
    public final String a;

    /* JADX INFO: Fake field, exist only in values array */
    w06 EF3;

    static {
        w06 w06Var = new w06("BIG_CARD", 0, "BIG_CARD");
        b = w06Var;
        w06 w06Var2 = new w06("BIG_CARD_800x700", 1, "BIG_CARD_800x700");
        c = w06Var2;
        w06 w06Var3 = new w06("CARD_GROUP", 2, "CARD_GROUP");
        l06 l06Var = new l06("DISPLAY_HTML_300x250", 3, "DISPLAY_HTML_300x250");
        d = l06Var;
        m06 m06Var = new m06("DISPLAY_HTML_320x480", 4, "DISPLAY_HTML_320x480");
        e = m06Var;
        w06 w06Var4 = new w06("DISPLAY_300x250", 5, "DISPLAY_300x250");
        w06 w06Var5 = new w06("DISPLAY_320x480", 6, "DISPLAY_320x480");
        w06 w06Var6 = new w06("DISPLAY_320x50", 7, "DISPLAY_320x50");
        w06 w06Var7 = new w06("LEADS", 8, "LEADS");
        f = w06Var7;
        w06 w06Var8 = new w06("NATIVE_320x50", 9, "NATIVE_320x50");
        w06 w06Var9 = new w06("NATIVE_172x120", 10, "NATIVE_172x120");
        n06 n06Var = new n06("NATIVE_EXPANDABLE_CARD", 11, "NATIVE_EXPANDABLE_CARD");
        g = n06Var;
        w06 w06Var10 = new w06("NATIVE_INTERSTITIAL", 12, "NATIVE_INTERSTITIAL");
        h = w06Var10;
        w06 w06Var11 = new w06("NATIVE_NEWSFLOW_1_IMAGE", 13, "NATIVE_NEWSFLOW_1_IMAGE");
        i = w06Var11;
        w06 w06Var12 = new w06("NATIVE_NEWSFLOW_3_IMAGES", 14, "NATIVE_NEWSFLOW_3_IMAGES");
        j = w06Var12;
        w06 w06Var13 = new w06("POLL", 15, "POLL");
        k = w06Var13;
        o06 o06Var = new o06("PREBID_BANNER", 16, "PREBID_BANNER");
        l = o06Var;
        p06 p06Var = new p06("PREBID_INTERSTITIAL", 17, "PREBID_INTERSTITIAL");
        m = p06Var;
        q06 q06Var = new q06("PREBID_NATIVE", 18, "PREBID_NATIVE");
        n = q06Var;
        w06 w06Var14 = new w06("SURVEY_SINGLE_CHOICE", 19, "SURVEY_SINGLE_CHOICE");
        o = w06Var14;
        w06 w06Var15 = new w06("SURVEY_MULTIPLE_CHOICE", 20, "SURVEY_MULTIPLE_CHOICE");
        p = w06Var15;
        w06 w06Var16 = new w06("SURVEY_FEW_QUESTIONS", 21, "SURVEY_FEW_QUESTIONS");
        q = w06Var16;
        r06 r06Var = new r06("VAST_3_URL", 22, "VAST_3_URL");
        r = r06Var;
        s06 s06Var = new s06("VAST_3_XML", 23, "VAST_3_XML");
        s = s06Var;
        t06 t06Var = new t06("NATIVE_VAST", 24, "NATIVE_VAST");
        t = t06Var;
        w06 w06Var17 = new w06("VIDEO_16x9", 25, "VIDEO_16x9");
        u = w06Var17;
        w06 w06Var18 = new w06("VIDEO_9x16", 26, "VIDEO_9x16");
        w06 w06Var19 = new w06("ILLEGAL", 27, "ILLEGAL");
        v = w06Var19;
        w = new w06[]{w06Var, w06Var2, w06Var3, l06Var, m06Var, w06Var4, w06Var5, w06Var6, w06Var7, w06Var8, w06Var9, n06Var, w06Var10, w06Var11, w06Var12, w06Var13, o06Var, p06Var, q06Var, w06Var14, w06Var15, w06Var16, r06Var, s06Var, t06Var, w06Var17, w06Var18, w06Var19};
    }

    public w06(String str, int i2, String str2) {
        this.a = str2;
    }

    public static w06 valueOf(String str) {
        return (w06) Enum.valueOf(w06.class, str);
    }

    public static w06[] values() {
        return (w06[]) w.clone();
    }

    public boolean d() {
        return this instanceof o06;
    }

    public boolean g() {
        return this instanceof r06;
    }
}
