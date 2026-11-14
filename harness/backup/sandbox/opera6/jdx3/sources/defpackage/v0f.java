package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v0f {
    public static final v0f a;
    public static final v0f b;
    public static final v0f c;
    public static final /* synthetic */ v0f[] d;

    static {
        v0f v0fVar = new v0f("NOT_INITIALIZED", 0);
        a = v0fVar;
        v0f v0fVar2 = new v0f("DISABLED", 1);
        b = v0fVar2;
        v0f v0fVar3 = new v0f("ENABLED", 2);
        c = v0fVar3;
        d = new v0f[]{v0fVar, v0fVar2, v0fVar3};
    }

    public static v0f valueOf(String str) {
        return (v0f) Enum.valueOf(v0f.class, str);
    }

    public static v0f[] values() {
        return (v0f[]) d.clone();
    }
}
