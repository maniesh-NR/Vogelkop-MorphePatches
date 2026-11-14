package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o15 {
    public static final o15 a;
    public static final o15 b;
    public static final o15 c;
    public static final /* synthetic */ o15[] d;

    static {
        o15 o15Var = new o15("NONE", 0);
        a = o15Var;
        o15 o15Var2 = new o15("ALL_JSON_OBJECTS", 1);
        b = o15Var2;
        o15 o15Var3 = new o15("POLYMORPHIC", 2);
        c = o15Var3;
        d = new o15[]{o15Var, o15Var2, o15Var3};
    }

    public static o15 valueOf(String str) {
        return (o15) Enum.valueOf(o15.class, str);
    }

    public static o15[] values() {
        return (o15[]) d.clone();
    }
}
