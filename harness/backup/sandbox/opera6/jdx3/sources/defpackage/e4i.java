package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e4i {
    public final k3i a;
    public final f4i b;
    public final gjm c;

    public e4i(k3i k3iVar, f4i f4iVar, gjm gjmVar) {
        this.a = k3iVar;
        this.b = f4iVar;
        this.c = gjmVar;
    }

    public final void a(ndc ndcVar, o3i o3iVar, String str) {
        n3i n3iVar = new n3i(new p4i(o3iVar, str, true));
        f4i f4iVar = this.b;
        boolean z = ru9.c(f4iVar.a.b).a.getBoolean("rewards.onboarding_seen", false);
        yhe yheVar = f4iVar.b;
        gjm gjmVar = (gjm) yheVar.b;
        if (z) {
            gjmVar.e(n3iVar, false);
            return;
        }
        e6g e6gVar = new e6g(0, f4iVar, f4i.class, "onOnboardingSeen", "onOnboardingSeen()V", 0, (byte) 17);
        s4f s4fVar = new s4f(yheVar, n3iVar, (byte) 17);
        g4i g4iVar = new g4i(o3iVar);
        gjmVar.c(g4iVar, ndcVar, new iwa(new wtd((Function0) e6gVar, false, yheVar, g4iVar, (Function0) s4fVar), (byte) 28));
    }

    public final void b(ndc ndcVar, o3i o3iVar, k15 k15Var, q4i q4iVar, Function1 function1) {
        t4i t4iVar = new t4i(k15Var, q4iVar);
        t7d t7dVar = new t7d(function1, (byte) 8);
        f4i f4iVar = this.b;
        boolean z = ru9.c(f4iVar.a.b).a.getBoolean("rewards.onboarding_seen", false);
        yhe yheVar = f4iVar.b;
        gjm gjmVar = (gjm) yheVar.b;
        if (z) {
            gjmVar.c(t4iVar, ndcVar, t7dVar);
            return;
        }
        e6g e6gVar = new e6g(0, f4iVar, f4i.class, "onOnboardingSeen", "onOnboardingSeen()V", 0, (byte) 18);
        i51 i51Var = new i51(yheVar, t4iVar, ndcVar, t7dVar, (byte) 18);
        g4i g4iVar = new g4i(o3iVar);
        gjmVar.c(g4iVar, ndcVar, new iwa(new wtd((Function0) e6gVar, true, yheVar, g4iVar, (Function0) i51Var), (byte) 28));
    }
}
