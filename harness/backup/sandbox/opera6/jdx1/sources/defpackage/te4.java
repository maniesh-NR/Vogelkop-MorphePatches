package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class te4 {
    public static final te4 a;
    public static final te4 b;
    public static final te4 c;
    public static final /* synthetic */ te4[] d;

    static {
        te4 te4Var = new te4("CAMERA", 0);
        a = te4Var;
        te4 te4Var2 = new te4("SCOPE", 1);
        b = te4Var2;
        te4 te4Var3 = new te4("THREAD", 2);
        c = te4Var3;
        d = new te4[]{te4Var, te4Var2, te4Var3};
    }

    public static te4 valueOf(String str) {
        return (te4) Enum.valueOf(te4.class, str);
    }

    public static te4[] values() {
        return (te4[]) d.clone();
    }
}
