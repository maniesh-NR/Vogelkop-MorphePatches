package defpackage;

import android.content.Context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class hs3 {
    public static final n9a a;
    public static final fs3 b;
    public static final es3 c;
    public static final gs3 d;
    public static final /* synthetic */ hs3[] e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fs3] */
    /* JADX WARN: Type inference failed for: r1v0, types: [es3] */
    /* JADX WARN: Type inference failed for: r2v0, types: [gs3] */
    static {
        ?? r0 = new hs3() { // from class: fs3
            @Override // defpackage.hs3
            public final String d(Context context) {
                return "opera";
            }
        };
        b = r0;
        ?? r1 = new hs3() { // from class: es3
        };
        c = r1;
        ?? r2 = new hs3() { // from class: gs3
            @Override // defpackage.hs3
            public final String d(Context context) {
                vq8 vq8Var = s6e.b(context).b;
                return vq8Var != null ? (String) vq8Var.g : "";
            }
        };
        d = r2;
        e = new hs3[]{r0, r1, r2};
        a = new n9a((byte) 25);
    }

    public static hs3 valueOf(String str) {
        return (hs3) Enum.valueOf(hs3.class, str);
    }

    public static hs3[] values() {
        return (hs3[]) e.clone();
    }

    public String d(Context context) {
        return "beta";
    }
}
