package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x46 {
    public static final x46 a;
    public static final x46 b;
    public static final x46 c;
    public static final /* synthetic */ x46[] d;

    static {
        x46 x46Var = new x46("DRAG_HOVER", 0);
        a = x46Var;
        x46 x46Var2 = new x46("ENTER_GALLERY", 1);
        b = x46Var2;
        x46 x46Var3 = new x46("EXIT_GALLERY", 2);
        c = x46Var3;
        d = new x46[]{x46Var, x46Var2, x46Var3};
    }

    public static x46 valueOf(String str) {
        return (x46) Enum.valueOf(x46.class, str);
    }

    public static x46[] values() {
        return (x46[]) d.clone();
    }
}
