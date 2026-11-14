package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t29 {
    public static final t29 a;
    public static final /* synthetic */ t29[] b;

    static {
        t29 t29Var = new t29("APPEND", 0);
        a = t29Var;
        b = new t29[]{t29Var};
    }

    public static t29 valueOf(String str) {
        return (t29) Enum.valueOf(t29.class, str);
    }

    public static t29[] values() {
        return (t29[]) b.clone();
    }
}
