package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rgo {
    public static final rgo a;
    public static final rgo b;
    public static final rgo c;
    public static final /* synthetic */ rgo[] d;

    static {
        rgo rgoVar = new rgo("INTACT", 0);
        a = rgoVar;
        rgo rgoVar2 = new rgo("REMOVED", 1);
        b = rgoVar2;
        rgo rgoVar3 = new rgo("REPLACED", 2);
        c = rgoVar3;
        d = new rgo[]{rgoVar, rgoVar2, rgoVar3};
    }

    public static rgo valueOf(String str) {
        return (rgo) Enum.valueOf(rgo.class, str);
    }

    public static rgo[] values() {
        return (rgo[]) d.clone();
    }
}
