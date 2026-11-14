package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v6 g7j, still in use, count: 1, list:
  (r6v6 g7j) from 0x00c0: SPUT (r6v6 g7j) g7j.h g7j
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class g7j {
    /* JADX INFO: Fake field, exist only in values array */
    BLUE(2130968684, 2130968675, 2130968666, "blue", 5),
    /* JADX INFO: Fake field, exist only in values array */
    RED(2130968691, 2130968682, 2130968673, "red", 6),
    /* JADX INFO: Fake field, exist only in values array */
    GREY(2130968686, 2130968677, 2130968668, "grey", 8),
    /* JADX INFO: Fake field, exist only in values array */
    GREEN(2130968685, 2130968676, 2130968667, "green", 7),
    /* JADX INFO: Fake field, exist only in values array */
    PURPLE(2130968690, 2130968681, 2130968672, "purple", 3),
    /* JADX INFO: Fake field, exist only in values array */
    ORANGE(2130968689, 2130968680, 2130968671, "orange", 2),
    /* JADX INFO: Fake field, exist only in values array */
    ONE(2130968688, 2130968679, 2130968670, "one", 1),
    TEAL(2130968692, 2130968683, 2130968674, "teal", 4),
    KHAKI(2130968687, 2130968678, 2130968669, "khaki", -1);

    public static final g7j h;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;

    static {
        h = g7jVar;
    }

    public g7j(int i2, int i3, int i4, String str, int i5) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = str;
        this.e = i5;
    }

    public static g7j d(String str) {
        for (g7j g7jVar : values()) {
            if (g7jVar.d.equals(str)) {
                return g7jVar;
            }
        }
        return null;
    }

    public static g7j valueOf(String str) {
        return (g7j) Enum.valueOf(g7j.class, str);
    }

    public static g7j[] values() {
        return (g7j[]) i.clone();
    }
}
