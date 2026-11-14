package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class srk {
    public static final srk a;
    public static final srk b;
    public static final /* synthetic */ srk[] c;

    static {
        srk srkVar = new srk("CONFIRMED", 0);
        a = srkVar;
        srk srkVar2 = new srk("DISMISSED", 1);
        b = srkVar2;
        c = new srk[]{srkVar, srkVar2};
    }

    public static srk valueOf(String str) {
        return (srk) Enum.valueOf(srk.class, str);
    }

    public static srk[] values() {
        return (srk[]) c.clone();
    }
}
