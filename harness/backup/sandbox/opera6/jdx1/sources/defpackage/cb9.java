package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cb9 {
    public static final cb9 a;
    public static final /* synthetic */ cb9[] b;

    /* JADX INFO: Fake field, exist only in values array */
    cb9 EF0;

    static {
        cb9 cb9Var = new cb9("Visible", 0);
        cb9 cb9Var2 = new cb9("Clip", 1);
        a = cb9Var2;
        b = new cb9[]{cb9Var, cb9Var2, new cb9("ExpandIndicator", 2), new cb9("ExpandOrCollapseIndicator", 3)};
    }

    public static cb9 valueOf(String str) {
        return (cb9) Enum.valueOf(cb9.class, str);
    }

    public static cb9[] values() {
        return (cb9[]) b.clone();
    }
}
