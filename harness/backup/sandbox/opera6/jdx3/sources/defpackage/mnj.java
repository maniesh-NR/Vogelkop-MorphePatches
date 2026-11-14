package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mnj {
    public static final mnj a;
    public static final mnj b;
    public static final mnj c;
    public static final /* synthetic */ mnj[] d;
    public static final /* synthetic */ h58 e;

    static {
        mnj mnjVar = new mnj("BOOKMARK", 0);
        a = mnjVar;
        mnj mnjVar2 = new mnj("PASSWORD", 1);
        b = mnjVar2;
        mnj mnjVar3 = new mnj("SPEED_DIAL", 2);
        c = mnjVar3;
        mnj[] mnjVarArr = {mnjVar, mnjVar2, mnjVar3};
        d = mnjVarArr;
        e = new h58(mnjVarArr);
    }

    public static mnj valueOf(String str) {
        return (mnj) Enum.valueOf(mnj.class, str);
    }

    public static mnj[] values() {
        return (mnj[]) d.clone();
    }
}
