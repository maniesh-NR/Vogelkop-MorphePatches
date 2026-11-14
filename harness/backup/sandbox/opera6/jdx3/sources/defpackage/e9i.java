package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e9i {
    public static final wu5 f;
    public static final /* synthetic */ e9i[] g;
    public static final /* synthetic */ h58 h;
    public final String a;
    public final dxh b;
    public final dxh c;
    public final dxh d;
    public final dxh e;

    static {
        e9i[] e9iVarArr = {new e9i("ORANGE", 0, "orange", new dxh(2130969163), new dxh(2130969185), new dxh(2130969184), new dxh(2130969162)), new e9i("BLUE", 1, "blue", new dxh(2130969148), new dxh(2130969128), new dxh(2130969127), new dxh(2130969147)), new e9i("GREEN", 2, "green", new dxh(2130969179), new dxh(2130969201), new dxh(2130969200), new dxh(2130969178)), new e9i("PURPLE", 3, "purple", new dxh(2130969171), new dxh(2130969193), new dxh(2130969192), new dxh(2130969170)), new e9i("NAVY", 4, "navy", new dxh(2130969142), new dxh(2130969122), new dxh(2130969121), new dxh(2130969141)), new e9i("TURQUOISE", 5, "turquoise", new dxh(2130969175), new dxh(2130969197), new dxh(2130969196), new dxh(2130969174)), new e9i("BRONZE", 6, "bronze", new dxh(2130969173), new dxh(2130969195), new dxh(2130969194), new dxh(2130969172))};
        g = e9iVarArr;
        h = new h58(e9iVarArr);
        f = new wu5();
    }

    public e9i(String str, int i, String str2, dxh dxhVar, dxh dxhVar2, dxh dxhVar3, dxh dxhVar4) {
        this.a = str2;
        this.b = dxhVar;
        this.c = dxhVar2;
        this.d = dxhVar3;
        this.e = dxhVar4;
    }

    public static e9i valueOf(String str) {
        return (e9i) Enum.valueOf(e9i.class, str);
    }

    public static e9i[] values() {
        return (e9i[]) g.clone();
    }
}
