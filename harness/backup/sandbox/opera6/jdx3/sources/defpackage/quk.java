package defpackage;

import android.widget.ImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class quk {
    public static final ArrayList a = new ArrayList();

    public static Object a(dwh dwhVar, deg degVar, nt5 nt5Var) {
        nh4 nh4Var = new nh4(1, hib.b(nt5Var));
        nh4Var.s();
        nwa nwaVar = new nwa(nh4Var, (byte) 3);
        a.add(nwaVar);
        dwhVar.f(nwaVar);
        nh4Var.u(new m91(nwaVar, degVar, (byte) 12));
        Object objQ = nh4Var.q();
        px5 px5Var = px5.a;
        return objQ;
    }

    public static Object b(dwh dwhVar, deg degVar, ImageView imageView, nt5 nt5Var) {
        nh4 nh4Var = new nh4(1, hib.b(nt5Var));
        nh4Var.s();
        dwhVar.g(imageView, new shf(nh4Var, degVar, imageView));
        nh4Var.u(new m91(degVar, imageView, (byte) 13));
        Object objQ = nh4Var.q();
        px5 px5Var = px5.a;
        return objQ;
    }
}
