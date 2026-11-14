package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pp9 {
    public static final pp9 a;
    public static final pp9 b;
    public static final /* synthetic */ pp9[] c;

    static {
        pp9 pp9Var = new pp9("VIDEO_CONTROLS", 0);
        a = pp9Var;
        pp9 pp9Var2 = new pp9("CLOSE_AD", 1);
        pp9 pp9Var3 = new pp9("NOT_VISIBLE", 2);
        pp9 pp9Var4 = new pp9("OTHER", 3);
        b = pp9Var4;
        c = new pp9[]{pp9Var, pp9Var2, pp9Var3, pp9Var4};
    }

    public static pp9 valueOf(String str) {
        return (pp9) Enum.valueOf(pp9.class, str);
    }

    public static pp9[] values() {
        return (pp9[]) c.clone();
    }
}
