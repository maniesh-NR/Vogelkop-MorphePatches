package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ey0 {
    public static final ey0 a;
    public static final ey0 b;
    public static final /* synthetic */ ey0[] c;

    static {
        ey0 ey0Var = new ey0("SECTION", 0);
        a = ey0Var;
        ey0 ey0Var2 = new ey0("ITEM", 1);
        b = ey0Var2;
        c = new ey0[]{ey0Var, ey0Var2};
    }

    public static ey0 valueOf(String str) {
        return (ey0) Enum.valueOf(ey0.class, str);
    }

    public static ey0[] values() {
        return (ey0[]) c.clone();
    }
}
