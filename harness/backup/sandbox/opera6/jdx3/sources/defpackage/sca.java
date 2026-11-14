package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sca {
    public static final sca a;
    public static final sca b;
    public static final /* synthetic */ sca[] c;

    static {
        sca scaVar = new sca("WEB", 0);
        a = scaVar;
        sca scaVar2 = new sca("AI", 1);
        b = scaVar2;
        c = new sca[]{scaVar, scaVar2};
    }

    public static sca valueOf(String str) {
        return (sca) Enum.valueOf(sca.class, str);
    }

    public static sca[] values() {
        return (sca[]) c.clone();
    }
}
