package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w0f {
    public static final w0f a;
    public static final w0f b;
    public static final w0f c;
    public static final /* synthetic */ w0f[] d;

    static {
        w0f w0fVar = new w0f("ALL", 0);
        a = w0fVar;
        w0f w0fVar2 = new w0f("NONE", 1);
        b = w0fVar2;
        w0f w0fVar3 = new w0f("SOME", 2);
        c = w0fVar3;
        d = new w0f[]{w0fVar, w0fVar2, w0fVar3};
    }

    public static w0f valueOf(String str) {
        return (w0f) Enum.valueOf(w0f.class, str);
    }

    public static w0f[] values() {
        return (w0f[]) d.clone();
    }
}
