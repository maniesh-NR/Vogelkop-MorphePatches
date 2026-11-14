package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class elg {
    public static final i06 a;
    public static final elg b;
    public static final elg c;
    public static final elg d;
    public static final elg e;
    public static final elg f;
    public static final elg g;
    public static final /* synthetic */ elg[] h;
    public static final /* synthetic */ h58 i;

    static {
        elg elgVar = new elg("ZERO", 0);
        b = elgVar;
        elg elgVar2 = new elg("ONE", 1);
        c = elgVar2;
        elg elgVar3 = new elg("TWO", 2);
        d = elgVar3;
        elg elgVar4 = new elg("FEW", 3);
        e = elgVar4;
        elg elgVar5 = new elg("MANY", 4);
        f = elgVar5;
        elg elgVar6 = new elg("OTHER", 5);
        g = elgVar6;
        elg[] elgVarArr = {elgVar, elgVar2, elgVar3, elgVar4, elgVar5, elgVar6};
        h = elgVarArr;
        i = new h58(elgVarArr);
        a = new i06((byte) 24);
    }

    public static elg valueOf(String str) {
        return (elg) Enum.valueOf(elg.class, str);
    }

    public static elg[] values() {
        return (elg[]) h.clone();
    }
}
