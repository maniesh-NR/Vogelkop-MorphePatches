package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pcc {
    public static final pcc a;
    public static final pcc b;
    public static final pcc c;
    public static final pcc d;
    public static final pcc e;
    public static final /* synthetic */ pcc[] f;

    static {
        pcc pccVar = new pcc("DESTROYED", 0);
        a = pccVar;
        pcc pccVar2 = new pcc("INITIALIZED", 1);
        b = pccVar2;
        pcc pccVar3 = new pcc("CREATED", 2);
        c = pccVar3;
        pcc pccVar4 = new pcc("STARTED", 3);
        d = pccVar4;
        pcc pccVar5 = new pcc("RESUMED", 4);
        e = pccVar5;
        f = new pcc[]{pccVar, pccVar2, pccVar3, pccVar4, pccVar5};
    }

    public static pcc valueOf(String str) {
        return (pcc) Enum.valueOf(pcc.class, str);
    }

    public static pcc[] values() {
        return (pcc[]) f.clone();
    }
}
