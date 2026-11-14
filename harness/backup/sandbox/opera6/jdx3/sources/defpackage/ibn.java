package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ibn {
    public static final ibn a;
    public static final ibn b;
    public static final /* synthetic */ ibn[] c;

    static {
        ibn ibnVar = new ibn("WEB_SEARCH", 0);
        a = ibnVar;
        ibn ibnVar2 = new ibn("OTHER", 1);
        b = ibnVar2;
        c = new ibn[]{ibnVar, ibnVar2};
    }

    public static ibn valueOf(String str) {
        return (ibn) Enum.valueOf(ibn.class, str);
    }

    public static ibn[] values() {
        return (ibn[]) c.clone();
    }
}
