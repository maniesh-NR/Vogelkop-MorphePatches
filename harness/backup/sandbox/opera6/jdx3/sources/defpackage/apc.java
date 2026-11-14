package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class apc {
    public static final ix5 b;
    public static final apc c;
    public static final apc d;
    public static final /* synthetic */ apc[] e;
    public static final /* synthetic */ h58 f;
    public final boolean a;

    static {
        apc apcVar = new apc("FOOTBALL", 0, 0);
        c = apcVar;
        apc apcVar2 = new apc("BASKETBALL", 1, 1);
        d = apcVar2;
        apc[] apcVarArr = {apcVar, apcVar2};
        e = apcVarArr;
        f = new h58(apcVarArr);
        b = new ix5((byte) 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public apc(String str, int i, int i2) {
        this.a = i2;
    }

    public static apc valueOf(String str) {
        return (apc) Enum.valueOf(apc.class, str);
    }

    public static apc[] values() {
        return (apc[]) e.clone();
    }
}
