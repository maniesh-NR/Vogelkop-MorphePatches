package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class jnm implements w6f {
    public final b59 a;
    public final i7f b = new i7f();
    public final nrl c = new nrl((byte) 26);
    public final ag d = new ag(this, 8);
    public boolean e;

    public jnm(Context context, umi umiVar) {
        this.a = w1h.l(context, umiVar, "unseen_downloads_tracker", new bg1[]{new b94(umiVar, new ilm(this, (byte) 1), (byte) 0)});
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.b.b((q1f) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.b.c((q1f) obj);
    }

    public final void a(re7 re7Var) {
        HashSet hashSetM = w1h.m((SharedPreferences) this.a.get(), "unseen_download_ids");
        if (hashSetM.remove(Long.toString(re7Var.o))) {
            b(hashSetM);
            c(!hashSetM.isEmpty());
        }
    }

    public final void b(HashSet hashSet) {
        ((SharedPreferences) this.a.get()).edit().putStringSet("unseen_download_ids", hashSet).apply();
    }

    public final void c(boolean z) {
        if (z != this.e) {
            this.e = z;
            i7f i7fVar = this.b;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((q1f) g7fVarC.next()).a.b();
            }
        }
    }
}
