package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t97 {
    public static final r16 a;
    public static final t97 b;
    public static final /* synthetic */ t97[] c;
    public static final /* synthetic */ h58 d;

    static {
        t97 t97Var = new t97("Production", 0);
        t97[] t97VarArr = {t97Var, new t97("Staging", 1), new t97("Development", 2)};
        c = t97VarArr;
        d = new h58(t97VarArr);
        a = new r16();
        b = t97Var;
    }

    public static t97 valueOf(String str) {
        return (t97) Enum.valueOf(t97.class, str);
    }

    public static t97[] values() {
        return (t97[]) c.clone();
    }
}
