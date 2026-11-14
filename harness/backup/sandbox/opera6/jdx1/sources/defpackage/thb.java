package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class thb {
    public static final thb a;
    public static final thb b;
    public static final /* synthetic */ thb[] c;

    static {
        thb thbVar = new thb("Min", 0);
        a = thbVar;
        thb thbVar2 = new thb("Max", 1);
        b = thbVar2;
        c = new thb[]{thbVar, thbVar2};
    }

    public static thb valueOf(String str) {
        return (thb) Enum.valueOf(thb.class, str);
    }

    public static thb[] values() {
        return (thb[]) c.clone();
    }
}
