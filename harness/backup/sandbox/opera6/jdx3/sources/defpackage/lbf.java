package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lbf {
    public static final lbf a;
    public static final lbf b;
    public static final lbf c;
    public static final lbf d;
    public static final /* synthetic */ lbf[] e;

    static {
        lbf lbfVar = new lbf("Empty", 0);
        a = lbfVar;
        lbf lbfVar2 = new lbf("Url", 1);
        b = lbfVar2;
        lbf lbfVar3 = new lbf("Search", 2);
        c = lbfVar3;
        lbf lbfVar4 = new lbf("Yat", 3);
        d = lbfVar4;
        e = new lbf[]{lbfVar, lbfVar2, lbfVar3, lbfVar4};
    }

    public static lbf valueOf(String str) {
        return (lbf) Enum.valueOf(lbf.class, str);
    }

    public static lbf[] values() {
        return (lbf[]) e.clone();
    }
}
