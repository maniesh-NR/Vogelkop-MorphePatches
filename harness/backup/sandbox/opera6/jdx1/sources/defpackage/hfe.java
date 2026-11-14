package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hfe {
    public static final hfe a;
    public static final /* synthetic */ hfe[] b;

    static {
        hfe hfeVar = new hfe("Default", 0);
        a = hfeVar;
        b = new hfe[]{hfeVar, new hfe("UserInput", 1), new hfe("PreventUserInput", 2)};
    }

    public static hfe valueOf(String str) {
        return (hfe) Enum.valueOf(hfe.class, str);
    }

    public static hfe[] values() {
        return (hfe[]) b.clone();
    }
}
