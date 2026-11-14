package defpackage;

import android.content.SharedPreferences;
import com.opera.api.Callback;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class b94 implements bg1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b94(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((tcl) this.b).d(new c94((Callback) this.c, obj, (byte) 0)).a(null);
                return;
            case 1:
                g92 g92Var = (g92) this.b;
                bg1 bg1Var = (bg1) this.c;
                synchronized (g92Var.f) {
                }
                bg1Var.run(g92Var.get());
                return;
            case 2:
                x5f x5fVar = (x5f) this.b;
                wsf wsfVar = (wsf) this.c;
                if (((SharedPreferences) obj).getBoolean("need", false)) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    x56VarF.I(zpaVar).r(53, 1, true);
                    x5fVar.U0(x56VarF);
                    qs7 qs7Var = wsfVar.b;
                    v56 v56VarU = qs7.u();
                    ((jn0) new ak0(qs7Var, v56VarU).e.getValue()).a.r(6, 1, true);
                    if (wsfVar.e.c(v56VarU)) {
                        return;
                    }
                    new rml(Unit.a, wsfVar.a).a(new o5f((Object) wsfVar, (byte) 17)).m(wsfVar.d);
                    return;
                }
                return;
            case 3:
                lag lagVar = (lag) this.b;
                b94 b94Var = (b94) this.c;
                kag[] kagVarArr = (kag[]) obj;
                cag[] cagVarArr = new cag[kagVarArr.length];
                for (int i = 0; i < kagVarArr.length; i++) {
                    cagVarArr[i] = f03.l(lagVar, kagVarArr[i]);
                }
                b94Var.run(cagVarArr);
                return;
            default:
                swk swkVar = (swk) this.b;
                swkVar.b.d(new jri((n6k) this.c, swkVar, (byte) 20)).a(null);
                return;
        }
    }
}
