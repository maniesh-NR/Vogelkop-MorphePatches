package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i6k {
    public static final i6k a;
    public static final i6k b;
    public static final i6k c;
    public static final /* synthetic */ i6k[] d;

    static {
        i6k i6kVar = new i6k("FIRST", 0);
        a = i6kVar;
        i6k i6kVar2 = new i6k("FIRST_OR_SECOND", 1);
        i6k i6kVar3 = new i6k("SECOND", 2);
        b = i6kVar3;
        i6k i6kVar4 = new i6k("LAST", 3);
        c = i6kVar4;
        d = new i6k[]{i6kVar, i6kVar2, i6kVar3, i6kVar4};
    }

    public static i6k valueOf(String str) {
        return (i6k) Enum.valueOf(i6k.class, str);
    }

    public static i6k[] values() {
        return (i6k[]) d.clone();
    }
}
