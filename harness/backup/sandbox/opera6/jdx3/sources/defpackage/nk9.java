package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nk9 {
    public static final nk9 a;
    public static final /* synthetic */ nk9[] b;

    /* JADX INFO: Fake field, exist only in values array */
    nk9 EF0;

    static {
        nk9 nk9Var = new nk9("PRETTY", 0);
        nk9 nk9Var2 = new nk9("EXACT", 1);
        a = nk9Var2;
        b = new nk9[]{nk9Var, nk9Var2};
    }

    public static nk9 valueOf(String str) {
        return (nk9) Enum.valueOf(nk9.class, str);
    }

    public static nk9[] values() {
        return (nk9[]) b.clone();
    }
}
