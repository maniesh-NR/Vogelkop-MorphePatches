package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hw0 {
    public static final hw0 a;
    public static final hw0 b;
    public static final /* synthetic */ hw0[] c;

    static {
        hw0 hw0Var = new hw0("PAGE_MENU", 0);
        a = hw0Var;
        hw0 hw0Var2 = new hw0("OMNIBAR", 1);
        b = hw0Var2;
        c = new hw0[]{hw0Var, hw0Var2};
    }

    public static hw0 valueOf(String str) {
        return (hw0) Enum.valueOf(hw0.class, str);
    }

    public static hw0[] values() {
        return (hw0[]) c.clone();
    }
}
