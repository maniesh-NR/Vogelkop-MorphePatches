package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oi7 {
    public static final oi7 a;
    public static final oi7 b;
    public static final oi7 c;
    public static final /* synthetic */ oi7[] d;

    static {
        oi7 oi7Var = new oi7("Yes", 0);
        a = oi7Var;
        oi7 oi7Var2 = new oi7("No", 1);
        b = oi7Var2;
        oi7 oi7Var3 = new oi7("NotInitialized", 2);
        c = oi7Var3;
        d = new oi7[]{oi7Var, oi7Var2, oi7Var3};
    }

    public static oi7 valueOf(String str) {
        return (oi7) Enum.valueOf(oi7.class, str);
    }

    public static oi7[] values() {
        return (oi7[]) d.clone();
    }
}
