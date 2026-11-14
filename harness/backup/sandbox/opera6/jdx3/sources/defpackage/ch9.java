package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ch9 {
    public static final ch9 a;
    public static final ch9 b;
    public static final ch9 c;
    public static final /* synthetic */ ch9[] d;

    static {
        ch9 ch9Var = new ch9("WEB", 0);
        a = ch9Var;
        ch9 ch9Var2 = new ch9("START_PAGE", 1);
        b = ch9Var2;
        ch9 ch9Var3 = new ch9("DEEP_LINK", 2);
        c = ch9Var3;
        d = new ch9[]{ch9Var, ch9Var2, ch9Var3};
    }

    public static ch9 valueOf(String str) {
        return (ch9) Enum.valueOf(ch9.class, str);
    }

    public static ch9[] values() {
        return (ch9[]) d.clone();
    }
}
