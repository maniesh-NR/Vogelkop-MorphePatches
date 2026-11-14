package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qej {
    public static final qej a;
    public static final qej b;
    public static final qej c;
    public static final /* synthetic */ qej[] d;

    static {
        qej qejVar = new qej("Hidden", 0);
        a = qejVar;
        qej qejVar2 = new qej("Expanded", 1);
        b = qejVar2;
        qej qejVar3 = new qej("PartiallyExpanded", 2);
        c = qejVar3;
        d = new qej[]{qejVar, qejVar2, qejVar3};
    }

    public static qej valueOf(String str) {
        return (qej) Enum.valueOf(qej.class, str);
    }

    public static qej[] values() {
        return (qej[]) d.clone();
    }
}
