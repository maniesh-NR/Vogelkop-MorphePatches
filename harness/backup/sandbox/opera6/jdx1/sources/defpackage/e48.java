package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e48 {
    public static final e48 a;
    public static final e48 b;
    public static final e48 c;
    public static final /* synthetic */ e48[] d;

    static {
        e48 e48Var = new e48("PreEnter", 0);
        a = e48Var;
        e48 e48Var2 = new e48("Visible", 1);
        b = e48Var2;
        e48 e48Var3 = new e48("PostExit", 2);
        c = e48Var3;
        d = new e48[]{e48Var, e48Var2, e48Var3};
    }

    public static e48 valueOf(String str) {
        return (e48) Enum.valueOf(e48.class, str);
    }

    public static e48[] values() {
        return (e48[]) d.clone();
    }
}
