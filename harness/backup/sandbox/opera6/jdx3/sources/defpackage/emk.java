package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class emk {
    public static final emk a;
    public static final emk b;
    public static final emk c;
    public static final /* synthetic */ emk[] d;

    static {
        emk emkVar = new emk("LOADING", 0);
        a = emkVar;
        emk emkVar2 = new emk("LIST", 1);
        b = emkVar2;
        emk emkVar3 = new emk("FAILURE", 2);
        c = emkVar3;
        d = new emk[]{emkVar, emkVar2, emkVar3};
    }

    public static emk valueOf(String str) {
        return (emk) Enum.valueOf(emk.class, str);
    }

    public static emk[] values() {
        return (emk[]) d.clone();
    }
}
