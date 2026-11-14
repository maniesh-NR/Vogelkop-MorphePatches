package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xrn {
    public static final xrn a;
    public static final /* synthetic */ xrn[] b;

    static {
        xrn xrnVar = new xrn("NO_PERMISSION", 0);
        a = xrnVar;
        b = new xrn[]{xrnVar};
    }

    public static xrn valueOf(String str) {
        return (xrn) Enum.valueOf(xrn.class, str);
    }

    public static xrn[] values() {
        return (xrn[]) b.clone();
    }
}
