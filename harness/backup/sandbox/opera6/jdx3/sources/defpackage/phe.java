package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class phe {
    public static final s16 a;
    public static final phe b;
    public static final /* synthetic */ phe[] c;

    /* JADX INFO: Fake field, exist only in values array */
    phe EF0;

    static {
        phe pheVar = new phe("TOP_LEFT", 0);
        phe pheVar2 = new phe("TOP_RIGHT", 1);
        c = new phe[]{pheVar, pheVar2, new phe("BOTTOM_LEFT", 2), new phe("BOTTOM_RIGHT", 3)};
        a = new s16();
        b = pheVar2;
    }

    public static phe valueOf(String str) {
        return (phe) Enum.valueOf(phe.class, str);
    }

    public static phe[] values() {
        return (phe[]) c.clone();
    }
}
