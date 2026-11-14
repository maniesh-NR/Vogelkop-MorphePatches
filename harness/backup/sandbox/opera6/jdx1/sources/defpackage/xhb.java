package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xhb {
    public static final xhb a;
    public static final xhb b;
    public static final /* synthetic */ xhb[] c;

    static {
        xhb xhbVar = new xhb("Width", 0);
        a = xhbVar;
        xhb xhbVar2 = new xhb("Height", 1);
        b = xhbVar2;
        c = new xhb[]{xhbVar, xhbVar2};
    }

    public static xhb valueOf(String str) {
        return (xhb) Enum.valueOf(xhb.class, str);
    }

    public static xhb[] values() {
        return (xhb[]) c.clone();
    }
}
