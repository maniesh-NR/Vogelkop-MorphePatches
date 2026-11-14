package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wf1 {
    public static final wf1 a;
    public static final wf1 b;
    public static final wf1 c;
    public static final wf1 d;
    public static final wf1 e;
    public static final wf1 f;
    public static final wf1 g;
    public static final /* synthetic */ wf1[] h;

    static {
        wf1 wf1Var = new wf1("Paragraph", 0);
        a = wf1Var;
        wf1 wf1Var2 = new wf1("Span", 1);
        b = wf1Var2;
        wf1 wf1Var3 = new wf1("VerbatimTts", 2);
        c = wf1Var3;
        wf1 wf1Var4 = new wf1("Url", 3);
        d = wf1Var4;
        wf1 wf1Var5 = new wf1("Link", 4);
        e = wf1Var5;
        wf1 wf1Var6 = new wf1("Clickable", 5);
        f = wf1Var6;
        wf1 wf1Var7 = new wf1("String", 6);
        g = wf1Var7;
        h = new wf1[]{wf1Var, wf1Var2, wf1Var3, wf1Var4, wf1Var5, wf1Var6, wf1Var7};
    }

    public static wf1 valueOf(String str) {
        return (wf1) Enum.valueOf(wf1.class, str);
    }

    public static wf1[] values() {
        return (wf1[]) h.clone();
    }
}
