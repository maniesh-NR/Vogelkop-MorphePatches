package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n8g {
    public static final a36 c;
    public static final n8g d;
    public static final n8g e;
    public static final n8g f;
    public static final /* synthetic */ n8g[] g;
    public static final /* synthetic */ h58 h;
    public final int a;
    public final int b;

    static {
        n8g n8gVar = new n8g(0, 2131362368, 2131100287, "BLUE");
        n8g n8gVar2 = new n8g(1, 2131362372, 2131100301, "ORANGE");
        n8g n8gVar3 = new n8g(2, 2131362379, 2131100303, "PINK");
        d = n8gVar3;
        n8g n8gVar4 = new n8g(3, 2131362371, 2131100294, "GREEN");
        n8g n8gVar5 = new n8g(4, 2131362380, 2131100305, "PURPLE");
        n8g n8gVar6 = new n8g(5, 2131362381, 2131100310, "WHITE");
        e = n8gVar6;
        n8g n8gVar7 = new n8g(6, 2131362367, 2131100286, "BLACK");
        f = n8gVar7;
        n8g[] n8gVarArr = {n8gVar, n8gVar2, n8gVar3, n8gVar4, n8gVar5, n8gVar6, n8gVar7};
        g = n8gVarArr;
        h = new h58(n8gVarArr);
        c = new a36();
    }

    public n8g(int i, int i2, int i3, String str) {
        this.a = i2;
        this.b = i3;
    }

    public static n8g valueOf(String str) {
        return (n8g) Enum.valueOf(n8g.class, str);
    }

    public static n8g[] values() {
        return (n8g[]) g.clone();
    }
}
