package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nyg {
    public static final nyg a;
    public static final nyg b;
    public static final /* synthetic */ nyg[] c;

    /* JADX INFO: Fake field, exist only in values array */
    nyg EF0;

    static {
        nyg nygVar = new nyg("IMMEDIATE", 0);
        nyg nygVar2 = new nyg("HIGH", 1);
        nyg nygVar3 = new nyg("NORMAL", 2);
        a = nygVar3;
        nyg nygVar4 = new nyg("LOW", 3);
        b = nygVar4;
        c = new nyg[]{nygVar, nygVar2, nygVar3, nygVar4};
    }

    public static nyg valueOf(String str) {
        return (nyg) Enum.valueOf(nyg.class, str);
    }

    public static nyg[] values() {
        return (nyg[]) c.clone();
    }
}
