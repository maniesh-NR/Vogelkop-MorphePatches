package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mtl {
    public static final mtl a;
    public static final mtl b;
    public static final mtl c;
    public static final /* synthetic */ mtl[] d;

    static {
        mtl mtlVar = new mtl("Uninitialized", 0);
        a = mtlVar;
        mtl mtlVar2 = new mtl("Detached", 1);
        b = mtlVar2;
        mtl mtlVar3 = new mtl("Attached", 2);
        c = mtlVar3;
        d = new mtl[]{mtlVar, mtlVar2, mtlVar3};
    }

    public static mtl valueOf(String str) {
        return (mtl) Enum.valueOf(mtl.class, str);
    }

    public static mtl[] values() {
        return (mtl[]) d.clone();
    }
}
