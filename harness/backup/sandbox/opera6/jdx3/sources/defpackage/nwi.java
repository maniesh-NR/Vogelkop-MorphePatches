package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nwi {
    public static final nwi a;
    public static final nwi b;
    public static final nwi c;
    public static final nwi d;
    public static final /* synthetic */ nwi[] e;

    static {
        nwi nwiVar = new nwi("UNKNOWN", 0);
        a = nwiVar;
        nwi nwiVar2 = new nwi("SECURE", 1);
        b = nwiVar2;
        nwi nwiVar3 = new nwi("INSECURE", 2);
        c = nwiVar3;
        nwi nwiVar4 = new nwi("INSECURE_WARN", 3);
        d = nwiVar4;
        e = new nwi[]{nwiVar, nwiVar2, nwiVar3, nwiVar4};
    }

    public static nwi valueOf(String str) {
        return (nwi) Enum.valueOf(nwi.class, str);
    }

    public static nwi[] values() {
        return (nwi[]) e.clone();
    }
}
