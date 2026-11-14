package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a4c {
    public static final a4c a;
    public static final /* synthetic */ a4c[] b;

    static {
        a4c a4cVar = new a4c("Horizontal", 0);
        a = a4cVar;
        b = new a4c[]{a4cVar, new a4c("Vertical", 1)};
    }

    public static a4c valueOf(String str) {
        return (a4c) Enum.valueOf(a4c.class, str);
    }

    public static a4c[] values() {
        return (a4c[]) b.clone();
    }
}
