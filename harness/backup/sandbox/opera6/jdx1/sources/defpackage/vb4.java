package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vb4 {
    public static final vb4 a;
    public static final vb4 b;
    public static final vb4 c;
    public static final vb4 d;
    public static final vb4 e;
    public static final vb4 f;
    public static final vb4 g;
    public static final /* synthetic */ vb4[] h;

    static {
        vb4 vb4Var = new vb4("UNKNOWN", 0);
        a = vb4Var;
        vb4 vb4Var2 = new vb4("INACTIVE", 1);
        b = vb4Var2;
        vb4 vb4Var3 = new vb4("SCANNING", 2);
        c = vb4Var3;
        vb4 vb4Var4 = new vb4("PASSIVE_FOCUSED", 3);
        d = vb4Var4;
        vb4 vb4Var5 = new vb4("PASSIVE_NOT_FOCUSED", 4);
        e = vb4Var5;
        vb4 vb4Var6 = new vb4("LOCKED_FOCUSED", 5);
        f = vb4Var6;
        vb4 vb4Var7 = new vb4("LOCKED_NOT_FOCUSED", 6);
        g = vb4Var7;
        h = new vb4[]{vb4Var, vb4Var2, vb4Var3, vb4Var4, vb4Var5, vb4Var6, vb4Var7};
    }

    public static vb4 valueOf(String str) {
        return (vb4) Enum.valueOf(vb4.class, str);
    }

    public static vb4[] values() {
        return (vb4[]) h.clone();
    }
}
