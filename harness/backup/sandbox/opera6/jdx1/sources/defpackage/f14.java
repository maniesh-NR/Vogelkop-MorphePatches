package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f14 {
    public static final f14 a;
    public static final f14 b;
    public static final /* synthetic */ f14[] c;

    static {
        f14 f14Var = new f14("DEBUG", 0);
        a = f14Var;
        f14 f14Var2 = new f14("RELEASE", 1);
        b = f14Var2;
        c = new f14[]{f14Var, f14Var2};
    }

    public static f14 valueOf(String str) {
        return (f14) Enum.valueOf(f14.class, str);
    }

    public static f14[] values() {
        return (f14[]) c.clone();
    }
}
