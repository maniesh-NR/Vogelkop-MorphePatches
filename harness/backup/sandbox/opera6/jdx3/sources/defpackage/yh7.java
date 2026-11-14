package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yh7 {
    public static final yh7 a;
    public static final yh7 b;
    public static final /* synthetic */ yh7[] c;

    static {
        yh7 yh7Var = new yh7("AUDIO", 0);
        a = yh7Var;
        yh7 yh7Var2 = new yh7("GOOGLE_SIGN_IN", 1);
        b = yh7Var2;
        c = new yh7[]{yh7Var, yh7Var2};
    }

    public static yh7 valueOf(String str) {
        return (yh7) Enum.valueOf(yh7.class, str);
    }

    public static yh7[] values() {
        return (yh7[]) c.clone();
    }
}
