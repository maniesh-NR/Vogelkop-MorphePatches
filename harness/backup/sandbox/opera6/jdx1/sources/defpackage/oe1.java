package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oe1 {
    public static final oe1 a;
    public static final oe1 b;
    public static final /* synthetic */ oe1[] c;

    static {
        oe1 oe1Var = new oe1("BoundReached", 0);
        a = oe1Var;
        oe1 oe1Var2 = new oe1("Finished", 1);
        b = oe1Var2;
        c = new oe1[]{oe1Var, oe1Var2};
    }

    public static oe1 valueOf(String str) {
        return (oe1) Enum.valueOf(oe1.class, str);
    }

    public static oe1[] values() {
        return (oe1[]) c.clone();
    }
}
