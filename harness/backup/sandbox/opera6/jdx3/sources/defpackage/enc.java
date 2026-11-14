package defpackage;

import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class enc {
    public orb a;
    public final /* synthetic */ hnc b;
    public final /* synthetic */ z1h c;

    public enc(long j, hnc hncVar, z1h z1hVar) {
        this.b = hncVar;
        this.c = z1hVar;
    }

    public final void a(orb orbVar) {
        try {
            z1h z1hVar = this.c;
            ome omeVar = zme.Companion;
            omeVar.getClass();
            crb crbVar = zme.j;
            String string = orbVar.a.toString();
            crbVar.getClass();
            z1hVar.b((zme) crbVar.a(string, omeVar.serializer()));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void b(RuntimeException runtimeException, orb orbVar) {
        if (hnc.s) {
            return;
        }
        hnc.s = true;
        this.b.getClass();
        Map mapC = rbd.c(new Pair[]{new Pair("o", String.valueOf(this.a)), new Pair("p", orbVar.a.toString())});
        if (mapC != null) {
            ks3.E(runtimeException, mapC);
        } else {
            ks3.D(runtimeException);
        }
    }
}
