package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cxa {
    public static final cxa a;
    public static final cxa b;
    public static final cxa c;
    public static final /* synthetic */ cxa[] d;

    static {
        cxa cxaVar = new cxa("ENABLED", 0);
        a = cxaVar;
        cxa cxaVar2 = new cxa("DISABLED", 1);
        b = cxaVar2;
        cxa cxaVar3 = new cxa("PROGRESS", 2);
        c = cxaVar3;
        d = new cxa[]{cxaVar, cxaVar2, cxaVar3};
    }

    public static cxa valueOf(String str) {
        return (cxa) Enum.valueOf(cxa.class, str);
    }

    public static cxa[] values() {
        return (cxa[]) d.clone();
    }
}
