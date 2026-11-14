package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i04 {
    public static final i04 a;
    public static final i04 b;
    public static final /* synthetic */ i04[] c;

    static {
        i04 i04Var = new i04("ACTIVE", 0);
        a = i04Var;
        i04 i04Var2 = new i04("INACTIVE", 1);
        b = i04Var2;
        c = new i04[]{i04Var, i04Var2};
    }

    public static i04 valueOf(String str) {
        return (i04) Enum.valueOf(i04.class, str);
    }

    public static i04[] values() {
        return (i04[]) c.clone();
    }
}
