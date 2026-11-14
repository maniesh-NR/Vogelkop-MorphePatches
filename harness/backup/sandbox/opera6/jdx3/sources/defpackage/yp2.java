package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yp2 {
    public static final yp2 a;
    public static final yp2 b;
    public static final yp2 c;
    public static final yp2 d;
    public static final /* synthetic */ yp2[] e;

    static {
        yp2 yp2Var = new yp2("ADDRESS", 0);
        a = yp2Var;
        yp2 yp2Var2 = new yp2("EMAIL", 1);
        b = yp2Var2;
        yp2 yp2Var3 = new yp2("NAME", 2);
        c = yp2Var3;
        yp2 yp2Var4 = new yp2("PHONE", 3);
        d = yp2Var4;
        e = new yp2[]{yp2Var, yp2Var2, yp2Var3, yp2Var4};
    }

    public static yp2 valueOf(String str) {
        return (yp2) Enum.valueOf(yp2.class, str);
    }

    public static yp2[] values() {
        return (yp2[]) e.clone();
    }
}
