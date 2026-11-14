package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vc9 {
    public static final vc9 a;
    public static final /* synthetic */ vc9[] b;

    static {
        vc9 vc9Var = new vc9("NO_FAILURE", 0);
        a = vc9Var;
        b = new vc9[]{vc9Var, new vc9("PASSIVE", 1)};
    }

    public static vc9 valueOf(String str) {
        return (vc9) Enum.valueOf(vc9.class, str);
    }

    public static vc9[] values() {
        return (vc9[]) b.clone();
    }
}
