package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dyj {
    public static final dyj a;
    public static final dyj b;
    public static final dyj c;
    public static final /* synthetic */ dyj[] d;

    static {
        dyj dyjVar = new dyj("DEFAULT", 0);
        a = dyjVar;
        dyj dyjVar2 = new dyj("HEIGHT_COMPACT", 1);
        b = dyjVar2;
        dyj dyjVar3 = new dyj("GOOGLE_AI_MODE", 2);
        c = dyjVar3;
        d = new dyj[]{dyjVar, dyjVar2, dyjVar3};
    }

    public static dyj valueOf(String str) {
        return (dyj) Enum.valueOf(dyj.class, str);
    }

    public static dyj[] values() {
        return (dyj[]) d.clone();
    }
}
