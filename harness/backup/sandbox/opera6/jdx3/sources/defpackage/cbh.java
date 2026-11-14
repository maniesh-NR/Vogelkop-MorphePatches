package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cbh {
    public static final cbh a;
    public static final cbh b;
    public static final /* synthetic */ cbh[] c;

    static {
        cbh cbhVar = new cbh("SUCCESS", 0);
        a = cbhVar;
        cbh cbhVar2 = new cbh("FAILURE", 1);
        b = cbhVar2;
        c = new cbh[]{cbhVar, cbhVar2};
    }

    public static cbh valueOf(String str) {
        return (cbh) Enum.valueOf(cbh.class, str);
    }

    public static cbh[] values() {
        return (cbh[]) c.clone();
    }
}
