package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c14 {
    public static final c14 a;
    public static final c14 b;
    public static final /* synthetic */ c14[] c;

    static {
        c14 c14Var = new c14("Real", 0);
        a = c14Var;
        c14 c14Var2 = new c14("Virtual", 1);
        b = c14Var2;
        c = new c14[]{c14Var, c14Var2};
    }

    public static c14 valueOf(String str) {
        return (c14) Enum.valueOf(c14.class, str);
    }

    public static c14[] values() {
        return (c14[]) c.clone();
    }
}
