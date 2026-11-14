package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oj {
    public static final ujp c;
    public static final /* synthetic */ oj[] d;
    public static final /* synthetic */ h58 e;
    public final String a;
    public final int b;

    static {
        oj[] ojVarArr = {new oj("AD_BLOCKING_MODE", 0, "adblockingmode", 2131361907), new oj("BLOCK_COOKIE_DIALOGS", 1, "blockcookiedialogs", 2131362139), new oj("EXCLUDED_SITES", 2, "excludedsites", 2131361925)};
        d = ojVarArr;
        e = new h58(ojVarArr);
        c = new ujp((byte) 14);
    }

    public oj(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static oj valueOf(String str) {
        return (oj) Enum.valueOf(oj.class, str);
    }

    public static oj[] values() {
        return (oj[]) d.clone();
    }
}
