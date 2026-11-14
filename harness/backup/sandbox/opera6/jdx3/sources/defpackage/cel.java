package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cel {
    public static final cel a;
    public static final cel b;
    public static final /* synthetic */ cel[] c;

    static {
        cel celVar = new cel("CELSIUS", 0);
        a = celVar;
        cel celVar2 = new cel("FAHRENHEIT", 1);
        b = celVar2;
        c = new cel[]{celVar, celVar2};
    }

    public static cel valueOf(String str) {
        return (cel) Enum.valueOf(cel.class, str);
    }

    public static cel[] values() {
        return (cel[]) c.clone();
    }
}
