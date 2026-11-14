package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zj4 {
    public static final zj4 a;
    public static final zj4 b;
    public static final zj4 c;
    public static final zj4 d;
    public static final zj4 e;
    public static final /* synthetic */ zj4[] f;

    static {
        zj4 zj4Var = new zj4("PENDING", 0);
        a = zj4Var;
        zj4 zj4Var2 = new zj4("CREATING", 1);
        b = zj4Var2;
        zj4 zj4Var3 = new zj4("CREATED", 2);
        c = zj4Var3;
        zj4 zj4Var4 = new zj4("CLOSING", 3);
        d = zj4Var4;
        zj4 zj4Var5 = new zj4("CLOSED", 4);
        e = zj4Var5;
        f = new zj4[]{zj4Var, zj4Var2, zj4Var3, zj4Var4, zj4Var5};
    }

    public static zj4 valueOf(String str) {
        return (zj4) Enum.valueOf(zj4.class, str);
    }

    public static zj4[] values() {
        return (zj4[]) f.clone();
    }
}
