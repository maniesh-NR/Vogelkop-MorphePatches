package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ryj {
    public static final ryj a;
    public static final ryj b;
    public static final ryj c;
    public static final ryj d;
    public static final /* synthetic */ ryj[] e;

    static {
        ryj ryjVar = new ryj("LANGUAGE_MISSING_DATA", 0);
        a = ryjVar;
        ryj ryjVar2 = new ryj("LANGUAGE_NOT_SUPPORTED", 1);
        b = ryjVar2;
        ryj ryjVar3 = new ryj("NETWORK", 2);
        c = ryjVar3;
        ryj ryjVar4 = new ryj("UNKNOWN", 3);
        d = ryjVar4;
        e = new ryj[]{ryjVar, ryjVar2, ryjVar3, ryjVar4};
    }

    public static ryj valueOf(String str) {
        return (ryj) Enum.valueOf(ryj.class, str);
    }

    public static ryj[] values() {
        return (ryj[]) e.clone();
    }
}
