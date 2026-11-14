package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ujh {
    public static final ujh a;
    public static final ujh b;
    public static final ujh c;
    public static final /* synthetic */ ujh[] d;

    static {
        ujh ujhVar = new ujh("OPEN_FEEDBACK", 0);
        a = ujhVar;
        ujh ujhVar2 = new ujh("OPEN_SYSTEM_RATE", 1);
        b = ujhVar2;
        ujh ujhVar3 = new ujh("DISMISSED", 2);
        c = ujhVar3;
        d = new ujh[]{ujhVar, ujhVar2, ujhVar3};
    }

    public static ujh valueOf(String str) {
        return (ujh) Enum.valueOf(ujh.class, str);
    }

    public static ujh[] values() {
        return (ujh[]) d.clone();
    }
}
