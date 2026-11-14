package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ev {
    public static final ev a;
    public static final ev b;
    public static final ev c;
    public static final /* synthetic */ ev[] d;

    static {
        ev evVar = new ev("BACK_BUTTON", 0);
        a = evVar;
        ev evVar2 = new ev("CLOSE_BUTTON", 1);
        b = evVar2;
        ev evVar3 = new ev("CUSTOM", 2);
        c = evVar3;
        d = new ev[]{evVar, evVar2, evVar3, new ev("OTHER", 3), new ev("SWIPE_AWAY", 4)};
    }

    public static ev[] values() {
        return (ev[]) d.clone();
    }
}
