package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x52 {
    public static final x52 a;
    public static final x52 b;
    public static final x52 c;
    public static final /* synthetic */ x52[] d;

    static {
        x52 x52Var = new x52("WAITING", 0);
        a = x52Var;
        x52 x52Var2 = new x52("LOADED", 1);
        b = x52Var2;
        x52 x52Var3 = new x52("ERROR", 2);
        c = x52Var3;
        d = new x52[]{x52Var, x52Var2, x52Var3};
    }

    public static x52 valueOf(String str) {
        return (x52) Enum.valueOf(x52.class, str);
    }

    public static x52[] values() {
        return (x52[]) d.clone();
    }
}
