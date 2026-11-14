package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class def {
    public static final def a;
    public static final def b;
    public static final def c;
    public static final def d;
    public static final /* synthetic */ def[] e;

    static {
        def defVar = new def("NONE", 0);
        a = defVar;
        def defVar2 = new def("UNKNOWN", 1);
        b = defVar2;
        def defVar3 = new def("FREE", 2);
        c = defVar3;
        def defVar4 = new def("PAID", 3);
        d = defVar4;
        e = new def[]{defVar, defVar2, defVar3, defVar4};
    }

    public static def valueOf(String str) {
        return (def) Enum.valueOf(def.class, str);
    }

    public static def[] values() {
        return (def[]) e.clone();
    }
}
