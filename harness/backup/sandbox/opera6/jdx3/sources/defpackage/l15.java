package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l15 {
    public static final l15 a;
    public static final l15 b;
    public static final /* synthetic */ l15[] c;

    static {
        l15 l15Var = new l15("PURCHASED", 0);
        a = l15Var;
        l15 l15Var2 = new l15("AVAILABLE_FOR_PURCHASE", 1);
        b = l15Var2;
        c = new l15[]{l15Var, l15Var2};
    }

    public static l15 valueOf(String str) {
        return (l15) Enum.valueOf(l15.class, str);
    }

    public static l15[] values() {
        return (l15[]) c.clone();
    }
}
