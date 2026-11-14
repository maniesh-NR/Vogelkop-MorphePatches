package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j46 {
    public static final j46 a;
    public static final j46 b;
    public static final j46 c;
    public static final /* synthetic */ j46[] d;

    static {
        j46 j46Var = new j46("NONE", 0);
        a = j46Var;
        j46 j46Var2 = new j46("LOCAL", 1);
        b = j46Var2;
        j46 j46Var3 = new j46("CODE_SUFFIX", 2);
        c = j46Var3;
        d = new j46[]{j46Var, j46Var2, j46Var3};
    }

    public static j46 valueOf(String str) {
        return (j46) Enum.valueOf(j46.class, str);
    }

    public static j46[] values() {
        return (j46[]) d.clone();
    }
}
