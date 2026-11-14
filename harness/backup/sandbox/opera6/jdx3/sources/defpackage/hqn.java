package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class hqn implements kz3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lqn b;

    public /* synthetic */ hqn(lqn lqnVar, byte b) {
        this.a = b;
        this.b = lqnVar;
    }

    @Override // defpackage.kz3
    public final void g(lz3 lz3Var) {
        byte b = this.a;
        lqn lqnVar = this.b;
        switch (b) {
            case 0:
                nv6 nv6VarB = lqnVar.r.b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("ai.chats_sign_in_bubble_shown", true);
                nv6VarB.w();
                break;
            default:
                nv6 nv6VarB2 = lqnVar.r.b();
                ((SharedPreferences.Editor) nv6VarB2.a).putBoolean("ai.chats_bubble_shown", true);
                nv6VarB2.w();
                break;
        }
    }
}
