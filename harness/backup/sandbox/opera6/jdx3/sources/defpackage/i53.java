package defpackage;

import J.N;
import com.opera.android.bookmarks.c;
import com.opera.android.bookmarks.h;
import java.util.AbstractList;

/* loaded from: classes.dex */
public abstract class i53 {
    public abstract void a(ql3 ql3Var);

    public abstract int b();

    public abstract al3 c(String str);

    public abstract boolean d();

    public abstract void e(AbstractList abstractList);

    public abstract void f(ql3 ql3Var);

    public final void g(al3 al3Var, ml3 ml3Var) {
        int iMc3pYXd5;
        h hVar = (h) this;
        if (hVar.m(al3Var.getId(), true).a(hVar.o()).equals(ml3Var)) {
            iMc3pYXd5 = -2;
        } else {
            iMc3pYXd5 = 0;
            if (ml3Var.h() && !al3Var.g()) {
                iMc3pYXd5 = (int) N.Mc3pYXd5(((c) ml3Var).b.a);
            }
        }
        h(al3Var, ml3Var, iMc3pYXd5);
    }

    public abstract void h(al3 al3Var, ml3 ml3Var, int i);
}
