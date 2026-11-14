package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ez1 {
    public static final ez1 a;
    public static final ez1 b;
    public static final ez1 c;
    public static final /* synthetic */ ez1[] d;

    static {
        ez1 ez1Var = new ez1("SUMMARIZE", 0);
        a = ez1Var;
        ez1 ez1Var2 = new ez1("TELL_ME_MORE", 1);
        b = ez1Var2;
        ez1 ez1Var3 = new ez1("CUSTOM", 2);
        c = ez1Var3;
        d = new ez1[]{ez1Var, ez1Var2, ez1Var3};
    }

    public static ez1 valueOf(String str) {
        return (ez1) Enum.valueOf(ez1.class, str);
    }

    public static ez1[] values() {
        return (ez1[]) d.clone();
    }
}
