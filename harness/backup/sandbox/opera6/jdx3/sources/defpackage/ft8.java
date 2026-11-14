package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ft8 {
    public static final i06 a;
    public static final ft8 b;
    public static final /* synthetic */ ft8[] c;
    public static final /* synthetic */ h58 d;

    static {
        ft8 ft8Var = new ft8("Production", 0);
        ft8[] ft8VarArr = {ft8Var, new ft8("Staging", 1)};
        c = ft8VarArr;
        d = new h58(ft8VarArr);
        a = new i06((byte) 8);
        b = ft8Var;
    }

    public static ft8 valueOf(String str) {
        return (ft8) Enum.valueOf(ft8.class, str);
    }

    public static ft8[] values() {
        return (ft8[]) c.clone();
    }
}
