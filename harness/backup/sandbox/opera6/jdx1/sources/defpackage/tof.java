package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tof {
    public static final tof a;
    public static final tof b;
    public static final /* synthetic */ tof[] c;

    static {
        tof tofVar = new tof("SMALL", 0);
        a = tofVar;
        tof tofVar2 = new tof("MEDIUM", 1);
        b = tofVar2;
        c = new tof[]{tofVar, tofVar2, new tof("LARGE", 2)};
    }

    public static tof valueOf(String str) {
        return (tof) Enum.valueOf(tof.class, str);
    }

    public static tof[] values() {
        return (tof[]) c.clone();
    }
}
