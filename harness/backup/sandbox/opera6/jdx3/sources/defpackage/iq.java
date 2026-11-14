package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class iq {
    public static final iq a;
    public static final iq b;
    public static final iq c;
    public static final /* synthetic */ iq[] d;

    static {
        iq iqVar = new iq("FEED", 0);
        a = iqVar;
        iq iqVar2 = new iq("INTERSTITIAL", 1);
        b = iqVar2;
        iq iqVar3 = new iq("MASTHEAD", 2);
        c = iqVar3;
        d = new iq[]{iqVar, iqVar2, iqVar3};
    }

    public static iq valueOf(String str) {
        return (iq) Enum.valueOf(iq.class, str);
    }

    public static iq[] values() {
        return (iq[]) d.clone();
    }
}
