package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b52 {
    public static final qii b;
    public static final b52 c;
    public static final b52 d;
    public static final b52 e;
    public static final /* synthetic */ b52[] f;
    public static final /* synthetic */ h58 g;
    public final byte a;

    static {
        b52 b52Var = new b52("FILE", 0, 0);
        c = b52Var;
        b52 b52Var2 = new b52("HIGHLIGHTED_TEXT", 1, 1);
        d = b52Var2;
        b52 b52Var3 = new b52("DEEP_THINK_STATE", 2, 2);
        e = b52Var3;
        b52[] b52VarArr = {b52Var, b52Var2, b52Var3};
        f = b52VarArr;
        g = new h58(b52VarArr);
        b = new qii();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b52(String str, int i, int i2) {
        this.a = i2;
    }

    public static b52 valueOf(String str) {
        return (b52) Enum.valueOf(b52.class, str);
    }

    public static b52[] values() {
        return (b52[]) f.clone();
    }
}
