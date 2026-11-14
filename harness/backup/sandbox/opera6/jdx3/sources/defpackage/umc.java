package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class umc {
    public static final umc a;
    public static final umc b;
    public static final /* synthetic */ umc[] c;

    static {
        umc umcVar = new umc("UP", 0);
        a = umcVar;
        umc umcVar2 = new umc("DOWN", 1);
        b = umcVar2;
        c = new umc[]{umcVar, umcVar2};
    }

    public static umc valueOf(String str) {
        return (umc) Enum.valueOf(umc.class, str);
    }

    public static umc[] values() {
        return (umc[]) c.clone();
    }
}
