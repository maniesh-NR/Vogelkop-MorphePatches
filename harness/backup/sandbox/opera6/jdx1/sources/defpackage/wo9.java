package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wo9 {
    public static final wo9 a;
    public static final wo9 b;
    public static final wo9 c;
    public static final wo9 d;
    public static final wo9 e;
    public static final /* synthetic */ wo9[] f;

    static {
        wo9 wo9Var = new wo9("ON_CONFIGURE", 0);
        a = wo9Var;
        wo9 wo9Var2 = new wo9("ON_CREATE", 1);
        b = wo9Var2;
        wo9 wo9Var3 = new wo9("ON_UPGRADE", 2);
        c = wo9Var3;
        wo9 wo9Var4 = new wo9("ON_DOWNGRADE", 3);
        d = wo9Var4;
        wo9 wo9Var5 = new wo9("ON_OPEN", 4);
        e = wo9Var5;
        f = new wo9[]{wo9Var, wo9Var2, wo9Var3, wo9Var4, wo9Var5};
    }

    public static wo9 valueOf(String str) {
        return (wo9) Enum.valueOf(wo9.class, str);
    }

    public static wo9[] values() {
        return (wo9[]) f.clone();
    }
}
