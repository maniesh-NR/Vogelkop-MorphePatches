package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zan {
    public static final zan a;
    public static final zan b;
    public static final zan c;
    public static final zan d;
    public static final zan e;
    public static final zan f;
    public static final zan g;
    public static final /* synthetic */ zan[] h;

    static {
        zan zanVar = new zan("DID_NOT_GET_THAT", 0);
        a = zanVar;
        zan zanVar2 = new zan("NOT_AVAILABLE", 1);
        b = zanVar2;
        zan zanVar3 = new zan("LANGUAGE_NOT_SUPPORTED", 2);
        c = zanVar3;
        zan zanVar4 = new zan("INSUFFICIENT_PERMISSIONS", 3);
        d = zanVar4;
        zan zanVar5 = new zan("NETWORK", 4);
        e = zanVar5;
        zan zanVar6 = new zan("SERVER", 5);
        f = zanVar6;
        zan zanVar7 = new zan("UNKNOWN", 6);
        g = zanVar7;
        h = new zan[]{zanVar, zanVar2, zanVar3, zanVar4, zanVar5, zanVar6, zanVar7};
    }

    public static zan valueOf(String str) {
        return (zan) Enum.valueOf(zan.class, str);
    }

    public static zan[] values() {
        return (zan[]) h.clone();
    }
}
