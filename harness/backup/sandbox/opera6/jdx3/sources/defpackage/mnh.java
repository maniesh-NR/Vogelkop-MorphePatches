package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mnh {
    public static final mnh a;
    public static final mnh b;
    public static final /* synthetic */ mnh[] c;

    static {
        mnh mnhVar = new mnh("CONTENT", 0);
        a = mnhVar;
        mnh mnhVar2 = new mnh("EMPTY", 1);
        b = mnhVar2;
        c = new mnh[]{mnhVar, mnhVar2};
    }

    public static mnh valueOf(String str) {
        return (mnh) Enum.valueOf(mnh.class, str);
    }

    public static mnh[] values() {
        return (mnh[]) c.clone();
    }
}
