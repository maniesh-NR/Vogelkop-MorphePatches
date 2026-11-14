package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ctj {
    public static final ctj a;
    public static final ctj b;
    public static final /* synthetic */ ctj[] c;

    static {
        ctj ctjVar = new ctj("Dismissed", 0);
        a = ctjVar;
        ctj ctjVar2 = new ctj("ActionPerformed", 1);
        b = ctjVar2;
        c = new ctj[]{ctjVar, ctjVar2};
    }

    public static ctj valueOf(String str) {
        return (ctj) Enum.valueOf(ctj.class, str);
    }

    public static ctj[] values() {
        return (ctj[]) c.clone();
    }
}
