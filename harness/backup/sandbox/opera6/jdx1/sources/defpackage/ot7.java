package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ot7 {
    public static final ot7 a;
    public static final ot7 b;
    public static final ot7 c;
    public static final ot7 d;
    public static final ot7 e;
    public static final ot7 f;
    public static final ot7 g;
    public static final /* synthetic */ ot7[] h;

    static {
        ot7 ot7Var = new ot7("CLEAR", 0);
        a = ot7Var;
        ot7 ot7Var2 = new ot7("MICROPHONE", 1);
        b = ot7Var2;
        ot7 ot7Var3 = new ot7("MICROPHONE_ACTIVE", 2);
        c = ot7Var3;
        ot7 ot7Var4 = new ot7("SEARCH", 3);
        d = ot7Var4;
        ot7 ot7Var5 = new ot7("SEARCH_AI_MODE", 4);
        e = ot7Var5;
        ot7 ot7Var6 = new ot7("GO", 5);
        f = ot7Var6;
        ot7 ot7Var7 = new ot7("NONE", 6);
        g = ot7Var7;
        h = new ot7[]{ot7Var, ot7Var2, ot7Var3, ot7Var4, ot7Var5, ot7Var6, ot7Var7};
    }

    public static ot7 valueOf(String str) {
        return (ot7) Enum.valueOf(ot7.class, str);
    }

    public static ot7[] values() {
        return (ot7[]) h.clone();
    }
}
