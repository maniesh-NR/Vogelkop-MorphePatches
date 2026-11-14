package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class aj6 {
    public static final aj6 a;
    public static final aj6 b;
    public static final aj6 c;
    public static final /* synthetic */ aj6[] d;

    static {
        aj6 aj6Var = new aj6("PREFER_ARGB_8888", 0);
        a = aj6Var;
        aj6 aj6Var2 = new aj6("PREFER_RGB_565", 1);
        b = aj6Var2;
        d = new aj6[]{aj6Var, aj6Var2};
        c = aj6Var;
    }

    public static aj6 valueOf(String str) {
        return (aj6) Enum.valueOf(aj6.class, str);
    }

    public static aj6[] values() {
        return (aj6[]) d.clone();
    }
}
