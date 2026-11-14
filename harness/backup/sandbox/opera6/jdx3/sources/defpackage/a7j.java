package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a7j {
    public static final a7j a;
    public static final a7j b;
    public static final a7j c;
    public static final /* synthetic */ a7j[] d;

    static {
        a7j a7jVar = new a7j("BALANCED", 0);
        a = a7jVar;
        a7j a7jVar2 = new a7j("ENHANCED", 1);
        b = a7jVar2;
        a7j a7jVar3 = new a7j("CUSTOM", 2);
        c = a7jVar3;
        d = new a7j[]{a7jVar, a7jVar2, a7jVar3};
    }

    public static a7j valueOf(String str) {
        return (a7j) Enum.valueOf(a7j.class, str);
    }

    public static a7j[] values() {
        return (a7j[]) d.clone();
    }
}
