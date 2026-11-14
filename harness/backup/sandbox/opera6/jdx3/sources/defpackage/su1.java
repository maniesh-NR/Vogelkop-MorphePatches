package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class su1 {
    public static final ydp c;
    public static final /* synthetic */ su1[] d;
    public static final /* synthetic */ h58 e;
    public final String a;
    public final int b;

    static {
        su1[] su1VarArr = {new su1("THEME", 0, "theme", 2131364371), new su1("THEME_ACCENT", 1, "themeaccent", 2131364370), new su1("WALLPAPER", 2, "wallpaper", 2131364379), new su1("NIGHT_MODE", 3, "nightmode", 2131364318), new su1("DARK_WEBPAGES", 4, "darkwebpages", 2131364294), new su1("TAB_BAR", 5, "tabbar", 2131364343), new su1("ADDRESS_BAR", 6, "addressbar", 2131364255), new su1("SCROLLING_BEHAVIOR", 7, "scrollbehavior", 2131364373), new su1("EDIT_TOOLBAR", 8, "edittoolbar", 2131364266), new su1("ACCESSIBILITY", 9, "accessibility", 2131364246), new su1("GESTURES", 10, "gestures", 2131364296)};
        d = su1VarArr;
        e = new h58(su1VarArr);
        c = new ydp((byte) 21);
    }

    public su1(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static su1 valueOf(String str) {
        return (su1) Enum.valueOf(su1.class, str);
    }

    public static su1[] values() {
        return (su1[]) d.clone();
    }
}
