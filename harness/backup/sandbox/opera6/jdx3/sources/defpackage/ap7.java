package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ap7 {
    public static final ap7 a;
    public static final ap7 b;
    public static final ap7 c;
    public static final /* synthetic */ ap7[] d;

    static {
        ap7 ap7Var = new ap7("INACTIVE", 0);
        a = ap7Var;
        ap7 ap7Var2 = new ap7("INSTALLING", 1);
        b = ap7Var2;
        ap7 ap7Var3 = new ap7("INSTALLED", 2);
        c = ap7Var3;
        d = new ap7[]{ap7Var, ap7Var2, ap7Var3};
    }

    public static ap7 valueOf(String str) {
        return (ap7) Enum.valueOf(ap7.class, str);
    }

    public static ap7[] values() {
        return (ap7[]) d.clone();
    }
}
