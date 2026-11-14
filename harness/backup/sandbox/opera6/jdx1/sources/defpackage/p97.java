package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p97 {
    public static final p97 a;
    public static final p97 b;
    public static final p97 c;
    public static final /* synthetic */ p97[] d;

    static {
        p97 p97Var = new p97("Vertical", 0);
        a = p97Var;
        p97 p97Var2 = new p97("Horizontal", 1);
        b = p97Var2;
        p97 p97Var3 = new p97("Both", 2);
        c = p97Var3;
        d = new p97[]{p97Var, p97Var2, p97Var3};
    }

    public static p97 valueOf(String str) {
        return (p97) Enum.valueOf(p97.class, str);
    }

    public static p97[] values() {
        return (p97[]) d.clone();
    }
}
