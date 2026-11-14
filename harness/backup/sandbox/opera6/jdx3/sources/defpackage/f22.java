package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f22 {
    public static final f22 a;
    public static final f22 b;
    public static final /* synthetic */ f22[] c;

    static {
        f22 f22Var = new f22("PARTIAL", 0);
        a = f22Var;
        f22 f22Var2 = new f22("END", 1);
        b = f22Var2;
        c = new f22[]{f22Var, f22Var2};
    }

    public static f22 valueOf(String str) {
        return (f22) Enum.valueOf(f22.class, str);
    }

    public static f22[] values() {
        return (f22[]) c.clone();
    }
}
