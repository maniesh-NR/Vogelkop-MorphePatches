package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gtk {
    public static final gtk a;
    public static final gtk b;
    public static final /* synthetic */ gtk[] c;

    static {
        gtk gtkVar = new gtk("FEATURE_COMBINATION_TABLE", 0);
        a = gtkVar;
        gtk gtkVar2 = new gtk("CAPTURE_SESSION_TABLES", 1);
        b = gtkVar2;
        c = new gtk[]{gtkVar, gtkVar2};
    }

    public static gtk valueOf(String str) {
        return (gtk) Enum.valueOf(gtk.class, str);
    }

    public static gtk[] values() {
        return (gtk[]) c.clone();
    }
}
