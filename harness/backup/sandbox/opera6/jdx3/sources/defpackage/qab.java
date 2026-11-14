package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qab {
    public static final qab a;
    public static final qab b;
    public static final qab c;
    public static final /* synthetic */ qab[] d;

    static {
        qab qabVar = new qab("BASE64", 0);
        a = qabVar;
        qab qabVar2 = new qab("FINGERPRINT", 1);
        b = qabVar2;
        qab qabVar3 = new qab("HASH", 2);
        c = qabVar3;
        d = new qab[]{qabVar, qabVar2, qabVar3};
    }

    public static qab valueOf(String str) {
        return (qab) Enum.valueOf(qab.class, str);
    }

    public static qab[] values() {
        return (qab[]) d.clone();
    }
}
