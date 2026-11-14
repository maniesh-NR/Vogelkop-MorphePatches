package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class e6k {
    public static final e6k b;
    public static final e6k c;
    public static final e6k d;
    public static final e6k e;
    public static final e6k f;
    public static final e6k g;
    public static final e6k h;
    public static final e6k i;
    public static final e6k j;
    public static final e6k k;
    public static final e6k l;
    public static final e6k m;
    public static final e6k n;
    public static final e6k o;
    public static final e6k p;
    public static final e6k q;
    public static final e6k r;
    public static final e6k s;
    public static final e6k t;
    public static final e6k u;
    public static final /* synthetic */ e6k[] v;
    public final i6k a;

    static {
        i6k i6kVar = i6k.a;
        e6k e6kVar = new e6k("WIDGET", 0, i6kVar);
        b = e6kVar;
        e6k e6kVar2 = new e6k("LOGO", 1, i6kVar);
        c = e6kVar2;
        e6k e6kVar3 = new e6k("TOP_STICKY_OMNIBAR_PLACEHOLDER", 2, i6kVar);
        d = e6kVar3;
        e6k e6kVar4 = new e6k("TOP_STICKY_OMNIBAR_EXTRA_ROW", 3, i6kVar);
        e = e6kVar4;
        e6k e6kVar5 = new e6k("NON_STICKY_OMNIBAR", 4, i6kVar);
        f = e6kVar5;
        e6k e6kVar6 = new e6k("MASTHEAD_AD", 5, i6kVar);
        g = e6kVar6;
        e6k e6kVar7 = new e6k("PUSHED_SPEED_DIALS", 6, i6kVar);
        h = e6kVar7;
        e6k e6kVar8 = new e6k("FAVORITES", 7, i6kVar);
        i = e6kVar8;
        e6k e6kVar9 = new e6k("FAVORITES_SPACER", 8, i6kVar);
        j = e6kVar9;
        e6k e6kVar10 = new e6k("INCOGNITO_MODE_PRIVACY_NOTE_LEADING", 9, i6kVar);
        k = e6kVar10;
        e6k e6kVar11 = new e6k("INCOGNITO_MODE_PRIVACY_NOTE_TRAILING", 10, i6kVar);
        l = e6kVar11;
        e6k e6kVar12 = new e6k("SYNC_HINT", 11, i6kVar);
        m = e6kVar12;
        e6k e6kVar13 = new e6k("LIVE_SCORE_PROMO_CARD", 12, i6kVar);
        n = e6kVar13;
        e6k e6kVar14 = new e6k("LIVE_SCORE", 13, i6kVar);
        o = e6kVar14;
        e6k e6kVar15 = new e6k("FIRST_PAGE_BOTTOM_SPACER", 14, i6kVar);
        p = e6kVar15;
        i6k i6kVar2 = i6k.b;
        e6k e6kVar16 = new e6k("SUGGESTED_FAVORITES", 15, i6kVar2);
        q = e6kVar16;
        e6k e6kVar17 = new e6k("COB", 16, i6kVar2);
        r = e6kVar17;
        e6k e6kVar18 = new e6k("COS", 17, i6kVar2);
        s = e6kVar18;
        e6k e6kVar19 = new e6k("INCOGNITO_MODE", 18, i6kVar2);
        t = e6kVar19;
        e6k e6kVar20 = new e6k("BOTTOM_SPACER", 19, i6k.c);
        u = e6kVar20;
        v = new e6k[]{e6kVar, e6kVar2, e6kVar3, e6kVar4, e6kVar5, e6kVar6, e6kVar7, e6kVar8, e6kVar9, e6kVar10, e6kVar11, e6kVar12, e6kVar13, e6kVar14, e6kVar15, e6kVar16, e6kVar17, e6kVar18, e6kVar19, e6kVar20};
    }

    public e6k(String str, int i2, i6k i6kVar) {
        this.a = i6kVar;
    }

    public static e6k valueOf(String str) {
        return (e6k) Enum.valueOf(e6k.class, str);
    }

    public static e6k[] values() {
        return (e6k[]) v.clone();
    }
}
