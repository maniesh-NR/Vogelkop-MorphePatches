package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ux1 {
    public static final ux1 a;
    public static final ux1 b;
    public static final ux1 c;
    public static final /* synthetic */ ux1[] d;

    static {
        ux1 ux1Var = new ux1("USER_PICKED", 0);
        a = ux1Var;
        ux1 ux1Var2 = new ux1("ASK_ARIA", 1);
        b = ux1Var2;
        ux1 ux1Var3 = new ux1("CONVERSATION_CHIP", 2);
        c = ux1Var3;
        d = new ux1[]{ux1Var, ux1Var2, ux1Var3};
    }

    public static ux1 valueOf(String str) {
        return (ux1) Enum.valueOf(ux1.class, str);
    }

    public static ux1[] values() {
        return (ux1[]) d.clone();
    }
}
