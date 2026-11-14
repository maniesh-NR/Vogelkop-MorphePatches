package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zh7 implements w6f {
    public final HashSet a = new HashSet();
    public final i7f b = new i7f();

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.b.b((a1a) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.b.c((a1a) obj);
    }

    public final void a(yh7 yh7Var, boolean z) {
        HashSet hashSet = this.a;
        if (hashSet.contains(yh7Var) != z) {
            if (z) {
                hashSet.add(yh7Var);
            } else {
                hashSet.remove(yh7Var);
            }
            g7f g7fVar = new g7f(this.b);
            while (g7fVar.hasNext()) {
                b1a b1aVar = ((a1a) g7fVar.next()).a;
                if (yh7Var != yh7.b) {
                    if (!z) {
                        am2.x(((SharedPreferences) ((b59) b1aVar.b.c).get()).edit(), "other_close_time");
                    }
                    b1aVar.X(false);
                }
            }
        }
    }
}
