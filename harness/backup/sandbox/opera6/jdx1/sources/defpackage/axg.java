package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class axg {
    public static final axg a;
    public static final axg b;
    public static final /* synthetic */ axg[] c;

    static {
        axg axgVar = new axg("IDLE", 0);
        a = axgVar;
        axg axgVar2 = new axg("STREAMING", 1);
        b = axgVar2;
        c = new axg[]{axgVar, axgVar2};
    }

    public static axg valueOf(String str) {
        return (axg) Enum.valueOf(axg.class, str);
    }

    public static axg[] values() {
        return (axg[]) c.clone();
    }
}
