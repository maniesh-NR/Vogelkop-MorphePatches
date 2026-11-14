package defpackage;

import J.N;
import com.opera.android.OperaApplication;
import com.opera.api.Callback;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class v25 extends r25 {
    public long f;
    public int g;

    public v25() {
        super("FileCache", new rxh(2132021326), new rxh(2132021327), 2131232010, a35.j);
    }

    @Override // defpackage.r25
    public final int b() {
        return 2132018239;
    }

    @Override // defpackage.r25
    public final void c(s25 s25Var, Callback callback) {
        iu2 iu2Var = (iu2) callback;
        su suVar = new su(this, s25Var, iu2Var, (byte) 12);
        umi umiVar = vml.d;
        nml nmlVarE = umiVar.e(new rqd((byte) 15));
        nmlVarE.b(umiVar.f(new lw0(suVar, (byte) 1)));
        nmlVarE.a(null);
        u25 u25Var = new u25(this, s25Var, iu2Var, (byte) 0);
        i7f i7fVar = lx3.a;
        N.MG3rn5iA(u25Var);
        N.M6cFqzr$(new u25(this, s25Var, iu2Var, (byte) 1));
        fp1 fp1Var = s25Var.a;
        String[] strArr = OperaApplication.K;
        eoj eojVar = (eoj) ((OperaApplication) fp1Var.getApplicationContext()).r.S0.get();
        f9 f9Var = new f9((Object) this, (Object) s25Var, (Object) iu2Var, (byte) 20);
        ivg ivgVar = eojVar.c;
        new rml(Unit.a, (umi) ivgVar.b).b(new joj(ivgVar, (byte) 2)).t(new tji(f9Var, (byte) 22)).l();
    }

    public final void e(s25 s25Var, iu2 iu2Var) {
        int i = this.g + 1;
        this.g = i;
        if (i < 4) {
            return;
        }
        long j = this.f;
        iu2Var.run(j == 0 ? s25Var.a.getString(2132021328) : aik.h(j, s25Var.a));
    }
}
