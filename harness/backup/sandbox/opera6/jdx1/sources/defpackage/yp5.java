package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yp5 {
    public static final yp5 a;
    public static final yp5 b;
    public static final /* synthetic */ yp5[] c;

    static {
        yp5 yp5Var = new yp5("VIEW_APPEAR", 0);
        a = yp5Var;
        yp5 yp5Var2 = new yp5("VIEW_DISAPPEAR", 1);
        b = yp5Var2;
        c = new yp5[]{yp5Var, yp5Var2};
    }

    public static yp5 valueOf(String str) {
        return (yp5) Enum.valueOf(yp5.class, str);
    }

    public static yp5[] values() {
        return (yp5[]) c.clone();
    }
}
