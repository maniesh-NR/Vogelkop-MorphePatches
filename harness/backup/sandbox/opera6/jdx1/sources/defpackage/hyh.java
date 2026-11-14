package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hyh {
    public static final hyh a;
    public static final hyh b;
    public static final /* synthetic */ hyh[] c;

    static {
        hyh hyhVar = new hyh("Ltr", 0);
        a = hyhVar;
        hyh hyhVar2 = new hyh("Rtl", 1);
        b = hyhVar2;
        c = new hyh[]{hyhVar, hyhVar2};
    }

    public static hyh valueOf(String str) {
        return (hyh) Enum.valueOf(hyh.class, str);
    }

    public static hyh[] values() {
        return (hyh[]) c.clone();
    }
}
