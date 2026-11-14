package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zye {
    public static final zye a;
    public static final zye b;
    public static final /* synthetic */ zye[] c;

    static {
        zye zyeVar = new zye("Min", 0);
        a = zyeVar;
        zye zyeVar2 = new zye("Max", 1);
        b = zyeVar2;
        c = new zye[]{zyeVar, zyeVar2};
    }

    public static zye valueOf(String str) {
        return (zye) Enum.valueOf(zye.class, str);
    }

    public static zye[] values() {
        return (zye[]) c.clone();
    }
}
