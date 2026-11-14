package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vcd {
    public static final vcd a;
    public static final vcd b;
    public static final /* synthetic */ vcd[] c;

    static {
        vcd vcdVar = new vcd("AUTOCOMPLETE", 0);
        a = vcdVar;
        vcd vcdVar2 = new vcd("RECOMMEND", 1);
        b = vcdVar2;
        c = new vcd[]{vcdVar, vcdVar2};
    }

    public static vcd valueOf(String str) {
        return (vcd) Enum.valueOf(vcd.class, str);
    }

    public static vcd[] values() {
        return (vcd[]) c.clone();
    }
}
