package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d02 {
    public static final d02 a;
    public static final d02 b;
    public static final d02 c;
    public static final /* synthetic */ d02[] d;

    static {
        d02 d02Var = new d02("WITHOUT_FILES", 0);
        a = d02Var;
        d02 d02Var2 = new d02("ONLY_USER_FILES", 1);
        b = d02Var2;
        d02 d02Var3 = new d02("ONLY_ASK_ARIA_IMAGES", 2);
        c = d02Var3;
        d = new d02[]{d02Var, d02Var2, d02Var3};
    }

    public static d02 valueOf(String str) {
        return (d02) Enum.valueOf(d02.class, str);
    }

    public static d02[] values() {
        return (d02[]) d.clone();
    }
}
