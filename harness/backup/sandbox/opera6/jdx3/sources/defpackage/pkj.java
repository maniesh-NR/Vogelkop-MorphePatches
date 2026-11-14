package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pkj {
    public static final pkj a;
    public static final pkj b;
    public static final pkj c;
    public static final /* synthetic */ pkj[] d;

    static {
        pkj pkjVar = new pkj("POSITIVE_BTN_CLICKED", 0);
        a = pkjVar;
        pkj pkjVar2 = new pkj("NEGATIVE_BTN_CLICKED", 1);
        b = pkjVar2;
        pkj pkjVar3 = new pkj("DISMISSED", 2);
        c = pkjVar3;
        d = new pkj[]{pkjVar, pkjVar2, pkjVar3};
    }

    public static pkj valueOf(String str) {
        return (pkj) Enum.valueOf(pkj.class, str);
    }

    public static pkj[] values() {
        return (pkj[]) d.clone();
    }
}
