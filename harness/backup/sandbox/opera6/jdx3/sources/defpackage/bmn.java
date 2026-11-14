package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public abstract class bmn {
    public final byte a;
    public final qln b;
    public final orm c;
    public final String d;
    public String e;
    public vkn f;
    public int g;
    public final eej h;
    public final gjm i;

    /* JADX WARN: Multi-variable type inference failed */
    public bmn(int i, qln qlnVar, orm ormVar, eej eejVar, gjm gjmVar) {
        this.a = i;
        this.b = qlnVar;
        this.c = ormVar;
        this.h = eejVar;
        this.i = gjmVar;
        this.d = qlnVar.i();
    }

    public final void a(RecyclerView recyclerView, jvg jvgVar) {
        this.f = new vkn(this.b, recyclerView, c(recyclerView.getContext()), fan.a(24.0f, recyclerView.getResources()), fan.a(12.0f, recyclerView.getResources()), new yln(this, jvgVar));
        svk svkVar = new svk(this, (byte) 28);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(recyclerView.getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, recyclerView, svkVar);
        }
        vkn vknVar = this.f;
        vknVar.a.T(d());
        vknVar.b.x0(0);
    }

    public abstract FrameLayout b(Context context, qf qfVar, jvg jvgVar);

    public vjn c(Context context) {
        return new vjn(context, false, true);
    }

    public abstract List d();

    public void e(String str) {
        vkn vknVar;
        qln qlnVar = this.b;
        String strI = qlnVar.i();
        if (str.equals(strI) || (vknVar = this.f) == null) {
            return;
        }
        if (vknVar != null) {
            vknVar.f.r(null);
        }
        vkn vknVar2 = this.f;
        if (vknVar2 != null) {
            this.e = str;
            vknVar2.e.r(str);
        }
        qlnVar.l(str, 0, new s2g((byte) 13, (Object) this, (Object) str, strI));
    }

    public final void f(ru0 ru0Var, String str) {
        String strI = this.b.i();
        if (this.d.equals(strI)) {
            strI = null;
        }
        byte b = this.a;
        tu0 tu0Var = b != 0 ? b != 1 ? b != 2 ? b != 3 ? tu0.b : tu0.f : tu0.e : tu0.d : tu0.c;
        x5f x5fVar = (x5f) this.c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            su0 su0Var = new su0(2443, -1, 4);
            su0Var.q(2, 1, tu0Var);
            su0Var.q(0, 1, ru0Var);
            su0Var.q(1, strI != null ? 1 : 0, strI);
            if (str != null) {
                su0Var.q(3, 1, str);
            }
            x56 x56VarF = zpa.F();
            xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
            List list = (List) xb0VarX.n(36);
            ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 36, am2.q(xb0VarX, 36, 1)) : new hf0(xb0VarX, 36, list)).add(su0Var);
            x5fVar.U0(x56VarF);
        }
    }

    public void g(View view, qf qfVar) {
        f(ru0.d, null);
        qfVar.b();
        h();
    }

    public final void h() {
        byte b = this.a;
        this.i.e(new rkn(b != 0 ? b != 1 ? b != 2 ? vln.c : vln.f : vln.e : vln.d, null), false);
    }
}
