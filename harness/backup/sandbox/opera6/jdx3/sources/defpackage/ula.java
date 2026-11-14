package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ula {
    public static final ula a;
    public static final /* synthetic */ ula[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ula EF0;

    static {
        ula ulaVar = new ula("UNDEFINED", 0);
        ula ulaVar2 = new ula("STOPPED", 1);
        ula ulaVar3 = new ula("PAUSED", 2);
        ula ulaVar4 = new ula("PLAYING", 3);
        a = ulaVar4;
        b = new ula[]{ulaVar, ulaVar2, ulaVar3, ulaVar4};
    }

    public static ula valueOf(String str) {
        return (ula) Enum.valueOf(ula.class, str);
    }

    public static ula[] values() {
        return (ula[]) b.clone();
    }
}
