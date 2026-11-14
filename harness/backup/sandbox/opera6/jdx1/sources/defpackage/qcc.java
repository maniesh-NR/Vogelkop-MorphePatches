package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qcc {
    public static final qcc a;
    public static final qcc b;
    public static final qcc c;
    public static final qcc d;
    public static final qcc e;
    public static final /* synthetic */ qcc[] f;
    public static final /* synthetic */ h58 g;

    static {
        qcc qccVar = new qcc("DESTROYED", 0);
        a = qccVar;
        qcc qccVar2 = new qcc("INITIALIZED", 1);
        b = qccVar2;
        qcc qccVar3 = new qcc("CREATED", 2);
        c = qccVar3;
        qcc qccVar4 = new qcc("STARTED", 3);
        d = qccVar4;
        qcc qccVar5 = new qcc("RESUMED", 4);
        e = qccVar5;
        qcc[] qccVarArr = {qccVar, qccVar2, qccVar3, qccVar4, qccVar5};
        f = qccVarArr;
        g = new h58(qccVarArr);
    }

    public static qcc valueOf(String str) {
        return (qcc) Enum.valueOf(qcc.class, str);
    }

    public static qcc[] values() {
        return (qcc[]) f.clone();
    }

    public final boolean d(qcc qccVar) {
        return compareTo(qccVar) >= 0;
    }
}
