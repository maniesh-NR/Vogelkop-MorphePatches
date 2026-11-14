package defpackage;

/* loaded from: classes.dex */
public final class xz6 {
    public final x5f a;
    public boolean b;
    public boolean c;

    public /* synthetic */ xz6(x5f x5fVar) {
        this.a = x5fVar;
    }

    public static String a(sk4 sk4Var) {
        if (sk4Var != null) {
            if (sk4Var instanceof qk4) {
                return "follow_national_team";
            }
            if (sk4Var instanceof pk4) {
                return "follow_national_team_gb";
            }
            if (sk4Var instanceof rk4) {
                return "pick_favorite_team";
            }
        }
        h9o.p();
        return null;
    }
}
