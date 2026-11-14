package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wba {
    public static final wba a;
    public static final wba b;
    public static final wba c;
    public static final /* synthetic */ wba[] d;
    public static final /* synthetic */ h58 e;

    static {
        wba wbaVar = new wba("ADDED", 0);
        a = wbaVar;
        wba wbaVar2 = new wba("REMOVED", 1);
        b = wbaVar2;
        wba wbaVar3 = new wba("CHANGED", 2);
        c = wbaVar3;
        wba[] wbaVarArr = {wbaVar, wbaVar2, wbaVar3};
        d = wbaVarArr;
        e = new h58(wbaVarArr);
    }

    public static wba valueOf(String str) {
        return (wba) Enum.valueOf(wba.class, str);
    }

    public static wba[] values() {
        return (wba[]) d.clone();
    }
}
