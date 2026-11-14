package defpackage;

import com.leanplum.internal.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class c42 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t40 b;

    public /* synthetic */ c42(t40 t40Var, byte b) {
        this.a = b;
        this.b = t40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) throws JSONException {
        a42 a42Var;
        xnm xnmVar;
        byte b = this.a;
        int i = 0;
        Object[] objArr = 0;
        t40 t40Var = this.b;
        orb orbVar = (orb) obj;
        switch (b) {
            case 0:
                orb orbVarI = orbVar.i("result");
                if (orbVarI != null) {
                    orb orbVarC = orbVarI.c("error");
                    long j = orbVarC.a.getLong("code");
                    String strE = orbVarC.e(Constants.Params.MESSAGE);
                    xnm[] xnmVarArrValues = xnm.values();
                    int length = xnmVarArrValues.length;
                    while (true) {
                        if (i >= length) {
                            xnmVar = xnm.UNDEFINED;
                        } else {
                            xnmVar = xnmVarArrValues[i];
                            if (xnmVar == xnm.UNDEFINED || j != xnmVar.a || !strE.equals(xnmVar.b)) {
                                i++;
                            }
                        }
                    }
                    a42Var = new a42(xnmVar);
                } else {
                    a42Var = null;
                }
                t40Var.n(new sw7(a42Var));
                break;
            default:
                c42 c42Var = new c42(t40Var, objArr == true ? 1 : 0);
                if (orbVar.a.has("error")) {
                    orb orbVarC2 = orbVar.c("error");
                    t40Var.n(new rw7(new cqb(orbVarC2.a.getInt("code"), orbVarC2.e(Constants.Params.MESSAGE))));
                } else {
                    c42Var.invoke(orbVar);
                }
                break;
        }
        return Unit.a;
    }
}
