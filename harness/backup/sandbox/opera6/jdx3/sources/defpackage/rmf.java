package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rmf {
    public static final rmf a;
    public static final rmf b;
    public static final /* synthetic */ rmf[] c;

    static {
        rmf rmfVar = new rmf("Normal", 0);
        a = rmfVar;
        rmf rmfVar2 = new rmf("Compact", 1);
        rmf rmfVar3 = new rmf("Large", 2);
        b = rmfVar3;
        c = new rmf[]{rmfVar, rmfVar2, rmfVar3};
    }

    public static rmf valueOf(String str) {
        return (rmf) Enum.valueOf(rmf.class, str);
    }

    public static rmf[] values() {
        return (rmf[]) c.clone();
    }
}
