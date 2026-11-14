package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qmg {
    public static final qmg a;
    public static final qmg b;
    public static final qmg c;
    public static final /* synthetic */ qmg[] d;

    static {
        qmg qmgVar = new qmg("Unknown", 0);
        a = qmgVar;
        qmg qmgVar2 = new qmg("Dispatching", 1);
        b = qmgVar2;
        qmg qmgVar3 = new qmg("NotDispatching", 2);
        c = qmgVar3;
        d = new qmg[]{qmgVar, qmgVar2, qmgVar3};
    }

    public static qmg valueOf(String str) {
        return (qmg) Enum.valueOf(qmg.class, str);
    }

    public static qmg[] values() {
        return (qmg[]) d.clone();
    }
}
