package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wq {
    public static final wq a;
    public static final wq b;
    public static final wq c;
    public static final wq d;
    public static final /* synthetic */ wq[] e;

    static {
        wq wqVar = new wq("PRODUCTION", 0);
        a = wqVar;
        wq wqVar2 = new wq("DEVELOPMENT", 1);
        b = wqVar2;
        wq wqVar3 = new wq("INTEGRATION_TEST", 2);
        c = wqVar3;
        wq wqVar4 = new wq("ROBOLECTRIC_TEST", 3);
        d = wqVar4;
        e = new wq[]{wqVar, wqVar2, wqVar3, wqVar4};
    }

    public static wq[] values() {
        return (wq[]) e.clone();
    }
}
