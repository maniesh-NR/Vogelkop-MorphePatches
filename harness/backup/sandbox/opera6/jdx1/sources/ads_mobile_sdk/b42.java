package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b42 {
    public static final b42 a;
    public static final /* synthetic */ b42[] b;

    /* JADX INFO: Fake field, exist only in values array */
    b42 EF0;

    static {
        b42 b42Var = new b42("PENDING", 0);
        b42 b42Var2 = new b42("READY_TO_PING", 1);
        a = b42Var2;
        b = new b42[]{b42Var, b42Var2};
    }

    public static b42[] values() {
        return (b42[]) b.clone();
    }
}
