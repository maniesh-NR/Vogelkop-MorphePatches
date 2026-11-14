package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class uhb {
    public static final uhb a;
    public static final uhb b;
    public static final /* synthetic */ uhb[] c;

    static {
        uhb uhbVar = new uhb("Min", 0);
        a = uhbVar;
        uhb uhbVar2 = new uhb("Max", 1);
        b = uhbVar2;
        c = new uhb[]{uhbVar, uhbVar2};
    }

    public static uhb valueOf(String str) {
        return (uhb) Enum.valueOf(uhb.class, str);
    }

    public static uhb[] values() {
        return (uhb[]) c.clone();
    }
}
