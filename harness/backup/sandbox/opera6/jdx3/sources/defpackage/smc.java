package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class smc {
    public static final smc a;
    public static final smc b;
    public static final smc c;
    public static final /* synthetic */ smc[] d;

    static {
        smc smcVar = new smc("ENABLED", 0);
        a = smcVar;
        smc smcVar2 = new smc("DISABLED", 1);
        b = smcVar2;
        smc smcVar3 = new smc("LOADING", 2);
        c = smcVar3;
        d = new smc[]{smcVar, smcVar2, smcVar3};
    }

    public static smc valueOf(String str) {
        return (smc) Enum.valueOf(smc.class, str);
    }

    public static smc[] values() {
        return (smc[]) d.clone();
    }
}
