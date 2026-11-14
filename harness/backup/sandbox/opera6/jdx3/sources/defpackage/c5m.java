package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c5m {
    public static final c5m a;
    public static final c5m b;
    public static final /* synthetic */ c5m[] c;

    static {
        c5m c5mVar = new c5m("ERROR", 0);
        a = c5mVar;
        c5m c5mVar2 = new c5m("STATUS", 1);
        b = c5mVar2;
        c = new c5m[]{c5mVar, c5mVar2};
    }

    public static c5m valueOf(String str) {
        return (c5m) Enum.valueOf(c5m.class, str);
    }

    public static c5m[] values() {
        return (c5m[]) c.clone();
    }
}
