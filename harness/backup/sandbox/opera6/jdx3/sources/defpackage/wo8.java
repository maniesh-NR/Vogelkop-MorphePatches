package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wo8 {
    public static final wo8 a;
    public static final wo8 b;
    public static final /* synthetic */ wo8[] c;

    static {
        wo8 wo8Var = new wo8("LARGE", 0);
        a = wo8Var;
        wo8 wo8Var2 = new wo8("TOOLBAR_ICON", 1);
        b = wo8Var2;
        c = new wo8[]{wo8Var, wo8Var2};
    }

    public static wo8 valueOf(String str) {
        return (wo8) Enum.valueOf(wo8.class, str);
    }

    public static wo8[] values() {
        return (wo8[]) c.clone();
    }
}
