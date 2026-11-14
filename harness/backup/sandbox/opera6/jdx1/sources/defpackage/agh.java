package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class agh implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cg8 b;

    public /* synthetic */ agh(cg8 cg8Var, byte b) {
        this.a = b;
        this.b = cg8Var;
    }

    public final Object invoke(Object obj) {
        t41 t41Var = (t41) obj;
        switch (this.a) {
            case 0:
                hgh hghVarC = t41Var.c();
                ArrayList arrayList = new ArrayList();
                cg8 cg8Var = this.b;
                if (!((Boolean) hghVarC.b).booleanValue()) {
                    return new hgh(arrayList);
                }
                arrayList.add(cg8Var.b.invoke(t41Var));
                while (((Boolean) t41Var.c().b).booleanValue()) {
                    arrayList.add(cg8Var.b.invoke(t41Var));
                }
                return new hgh(arrayList);
            default:
                hgh hghVarC2 = t41Var.c();
                cg8 cg8Var2 = this.b;
                if (!((Boolean) hghVarC2.b).booleanValue()) {
                    return new hgh((Object) null);
                }
                Object objInvoke = cg8Var2.b.invoke(t41Var);
                if (!((Boolean) t41Var.c().b).booleanValue()) {
                    return new hgh(objInvoke);
                }
                rqd.e(cg8Var2, "ResultSet returned more than 1 row for ");
                return null;
        }
    }
}
