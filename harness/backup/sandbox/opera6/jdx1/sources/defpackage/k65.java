package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k65 {
    public static final k65 a;
    public static final k65 b;
    public static final k65 c;
    public static final k65 d;
    public static final k65 e;
    public static final k65 f;
    public static final /* synthetic */ k65[] g;

    static {
        k65 k65Var = new k65("APP_CLOSED", 0);
        a = k65Var;
        k65 k65Var2 = new k65("APP_DISCONNECTED", 1);
        b = k65Var2;
        k65 k65Var3 = new k65("CAMERA2_CLOSED", 2);
        c = k65Var3;
        k65 k65Var4 = new k65("CAMERA2_DISCONNECTED", 3);
        d = k65Var4;
        k65 k65Var5 = new k65("CAMERA2_ERROR", 4);
        e = k65Var5;
        k65 k65Var6 = new k65("CAMERA2_EXCEPTION", 5);
        f = k65Var6;
        g = new k65[]{k65Var, k65Var2, k65Var3, k65Var4, k65Var5, k65Var6};
    }

    public static k65 valueOf(String str) {
        return (k65) Enum.valueOf(k65.class, str);
    }

    public static k65[] values() {
        return (k65[]) g.clone();
    }
}
