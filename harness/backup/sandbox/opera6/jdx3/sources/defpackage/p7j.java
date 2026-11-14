package defpackage;

import android.content.res.Resources;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 p7j, still in use, count: 1, list:
  (r0v0 p7j) from 0x002a: SPUT (r0v0 p7j) p7j.d p7j
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
public final class p7j implements lrf {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(0, "SQUIRCLE"),
    c(1, "CIRCLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33(3, "ROUNDED_SQUARE");

    public static final p7j d;
    public final int a;
    public final byte b;

    static {
        d = p7jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p7j(int i, String str) {
        this.a = i;
        this.b = i;
    }

    public static p7j valueOf(String str) {
        return (p7j) Enum.valueOf(p7j.class, str);
    }

    public static p7j[] values() {
        return (p7j[]) e.clone();
    }

    @Override // defpackage.lrf
    public final String d(Resources resources) {
        return resources.getString(this.a);
    }

    @Override // defpackage.lrf
    public final int getDescription() {
        return 0;
    }

    @Override // defpackage.lrf
    public final int getIcon() {
        return 0;
    }

    @Override // defpackage.lrf
    public final int getValue() {
        return ordinal();
    }
}
