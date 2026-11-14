package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class trc {
    public static final trc a;
    public static final trc b;
    public static final trc c;
    public static final /* synthetic */ trc[] d;

    static {
        trc trcVar = new trc("WAITING", 0);
        a = trcVar;
        trc trcVar2 = new trc("LOADED", 1);
        b = trcVar2;
        trc trcVar3 = new trc("ERROR", 2);
        c = trcVar3;
        d = new trc[]{trcVar, trcVar2, trcVar3};
    }

    public static trc valueOf(String str) {
        return (trc) Enum.valueOf(trc.class, str);
    }

    public static trc[] values() {
        return (trc[]) d.clone();
    }
}
