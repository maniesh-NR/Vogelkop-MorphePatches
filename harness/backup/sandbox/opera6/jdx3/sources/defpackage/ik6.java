package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ik6 {
    public static final ik6 a;
    public static final ik6 b;
    public static final /* synthetic */ ik6[] c;

    static {
        ik6 ik6Var = new ik6("EXECUTE", 0);
        a = ik6Var;
        ik6 ik6Var2 = new ik6("VALIDATE", 1);
        b = ik6Var2;
        c = new ik6[]{ik6Var, ik6Var2};
    }

    public static ik6 valueOf(String str) {
        return (ik6) Enum.valueOf(ik6.class, str);
    }

    public static ik6[] values() {
        return (ik6[]) c.clone();
    }
}
