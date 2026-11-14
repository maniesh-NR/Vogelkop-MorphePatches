package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fzi {
    public static final fzi a;
    public static final fzi b;
    public static final fzi c;
    public static final /* synthetic */ fzi[] d;

    static {
        fzi fziVar = new fzi("Left", 0);
        a = fziVar;
        fzi fziVar2 = new fzi("Middle", 1);
        b = fziVar2;
        fzi fziVar3 = new fzi("Right", 2);
        c = fziVar3;
        d = new fzi[]{fziVar, fziVar2, fziVar3};
    }

    public static fzi valueOf(String str) {
        return (fzi) Enum.valueOf(fzi.class, str);
    }

    public static fzi[] values() {
        return (fzi[]) d.clone();
    }
}
