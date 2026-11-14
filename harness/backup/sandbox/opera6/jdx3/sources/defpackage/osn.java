package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class osn {
    public static final osn a;
    public static final osn b;
    public static final osn c;
    public static final /* synthetic */ osn[] d;

    static {
        osn osnVar = new osn("HIDDEN", 0);
        a = osnVar;
        osn osnVar2 = new osn("DISABLED", 1);
        b = osnVar2;
        osn osnVar3 = new osn("ENABLED", 2);
        c = osnVar3;
        d = new osn[]{osnVar, osnVar2, osnVar3};
    }

    public static osn valueOf(String str) {
        return (osn) Enum.valueOf(osn.class, str);
    }

    public static osn[] values() {
        return (osn[]) d.clone();
    }
}
