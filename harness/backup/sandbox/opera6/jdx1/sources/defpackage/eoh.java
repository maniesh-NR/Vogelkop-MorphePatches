package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eoh {
    public static final eoh a;
    public static final eoh b;
    public static final eoh c;
    public static final eoh d;
    public static final eoh e;
    public static final eoh f;
    public static final /* synthetic */ eoh[] g;

    static {
        eoh eohVar = new eoh("ShutDown", 0);
        a = eohVar;
        eoh eohVar2 = new eoh("ShuttingDown", 1);
        b = eohVar2;
        eoh eohVar3 = new eoh("Inactive", 2);
        c = eohVar3;
        eoh eohVar4 = new eoh("InactivePendingWork", 3);
        d = eohVar4;
        eoh eohVar5 = new eoh("Idle", 4);
        e = eohVar5;
        eoh eohVar6 = new eoh("PendingWork", 5);
        f = eohVar6;
        g = new eoh[]{eohVar, eohVar2, eohVar3, eohVar4, eohVar5, eohVar6};
    }

    public static eoh valueOf(String str) {
        return (eoh) Enum.valueOf(eoh.class, str);
    }

    public static eoh[] values() {
        return (eoh[]) g.clone();
    }
}
