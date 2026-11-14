package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0n {
    public static final e0n a;
    public static final e0n b;
    public static final e0n c;
    public static final /* synthetic */ e0n[] d;
    public static final /* synthetic */ h58 e;

    static {
        e0n e0nVar = new e0n("FIRST", 0);
        a = e0nVar;
        e0n e0nVar2 = new e0n("SECOND", 1);
        b = e0nVar2;
        e0n e0nVar3 = new e0n("THIRD", 2);
        c = e0nVar3;
        e0n[] e0nVarArr = {e0nVar, e0nVar2, e0nVar3};
        d = e0nVarArr;
        e = new h58(e0nVarArr);
    }

    public static e0n valueOf(String str) {
        return (e0n) Enum.valueOf(e0n.class, str);
    }

    public static e0n[] values() {
        return (e0n[]) d.clone();
    }
}
