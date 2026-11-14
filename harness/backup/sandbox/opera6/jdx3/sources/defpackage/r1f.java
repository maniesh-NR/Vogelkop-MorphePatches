package defpackage;

import android.content.SharedPreferences;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r1f extends p1f {
    public final /* synthetic */ byte e = 0;
    public final Object f;

    public r1f(ndc ndcVar, jnm jnmVar, yqd yqdVar) {
        super(yqdVar);
        this.f = jnmVar;
        jnmVar.c.d(new yqd(this, (byte) 21));
        aib.B(jnmVar, ndcVar, new q1f(this), new vme((byte) 19));
    }

    public r1f(ndc ndcVar, xc9 xc9Var, yqd yqdVar) {
        super(yqdVar);
        this.f = xc9Var;
        xc9Var.b.d(new hpd(this, ndcVar, (byte) 17));
    }

    public r1f(ojn ojnVar) {
        super(new rl((byte) 4));
        this.f = ojnVar;
        this.b.K();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1f(v1f v1fVar, rl rlVar) {
        super(rlVar);
        this.f = v1fVar;
    }

    @Override // defpackage.p1f
    public final boolean a() {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                jnm jnmVar = (jnm) obj;
                jnmVar.a.get();
                return jnmVar.e;
            case 1:
                b59 b59Var = ((xc9) obj).c;
                return ((SharedPreferences) b59Var.get()).getBoolean("unread_message", false) && !((SharedPreferences) b59Var.get()).getBoolean("opened_my_flow_fragment", false);
            case 2:
                v1f v1fVar = (v1f) obj;
                SparseArray sparseArray = v1fVar.b;
                int iB = v1fVar.b();
                if (v1fVar.b() == 0) {
                    return false;
                }
                for (int i = 0; i < sparseArray.size(); i++) {
                    if ((sparseArray.keyAt(i) & iB) != 0) {
                        g7f g7fVar = new g7f(((p1f) sparseArray.valueAt(i)).a);
                        while (g7fVar.hasNext()) {
                            if (((t1f) g7fVar.next()) instanceof f3f) {
                                break;
                            }
                        }
                        return true;
                    }
                }
                return false;
            default:
                return ((ojn) obj).c.a();
        }
    }
}
