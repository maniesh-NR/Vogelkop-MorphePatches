package defpackage;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aue extends xte {
    public final uqe b;
    public final /* synthetic */ bue c;

    public aue(bue bueVar, uqe uqeVar) {
        this.c = bueVar;
        this.b = uqeVar;
        d();
    }

    @Override // defpackage.xte
    public final void b(Object obj) {
        l0c l0cVar;
        nre nreVar = (nre) obj;
        bue bueVar = this.c;
        ((LinkedHashSet) bueVar.f.d).remove(bueVar);
        if (Intrinsics.a(bueVar.a, nreVar.i) || (l0cVar = nreVar.c) == null) {
            bueVar.c(null, nreVar.d);
        } else {
            bueVar.b(l0cVar, false);
        }
    }

    @Override // defpackage.xte
    public final void d() {
        this.b.g(this);
    }
}
