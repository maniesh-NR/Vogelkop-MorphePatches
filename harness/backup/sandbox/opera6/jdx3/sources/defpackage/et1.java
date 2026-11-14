package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class et1 {
    public static final et1 a;
    public static final et1 b;
    public static final et1 c;
    public static final /* synthetic */ et1[] d;

    static {
        et1 et1Var = new et1("POSITIVE_BTN_CLICKED", 0);
        a = et1Var;
        et1 et1Var2 = new et1("NEGATIVE_BTN_CLICKED", 1);
        b = et1Var2;
        et1 et1Var3 = new et1("DISMISSED", 2);
        c = et1Var3;
        d = new et1[]{et1Var, et1Var2, et1Var3};
    }

    public static et1 valueOf(String str) {
        return (et1) Enum.valueOf(et1.class, str);
    }

    public static et1[] values() {
        return (et1[]) d.clone();
    }
}
