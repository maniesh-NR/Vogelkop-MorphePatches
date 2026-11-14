package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ukc {
    public static final ukc a;
    public static final ukc b;
    public static final ukc c;
    public static final /* synthetic */ ukc[] d;

    static {
        ukc ukcVar = new ukc("HIDDEN", 0);
        a = ukcVar;
        ukc ukcVar2 = new ukc("AVAILABLE", 1);
        b = ukcVar2;
        ukc ukcVar3 = new ukc("PLAYING", 2);
        c = ukcVar3;
        d = new ukc[]{ukcVar, ukcVar2, ukcVar3};
    }

    public static ukc valueOf(String str) {
        return (ukc) Enum.valueOf(ukc.class, str);
    }

    public static ukc[] values() {
        return (ukc[]) d.clone();
    }
}
