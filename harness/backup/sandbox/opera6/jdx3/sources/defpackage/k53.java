package defpackage;

import android.content.res.Resources;
import java.text.Collator;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k53 extends yvj {
    public final int b;
    public final /* synthetic */ xm3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k53(xm3 xm3Var, xm3 xm3Var2, int i) {
        super(xm3Var2);
        this.c = xm3Var;
        this.b = i;
    }

    public static int e(qhc qhcVar, boolean z) {
        int i = qhcVar.b;
        if (i == 7 || i == 8 || i == 9) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (z && qhcVar.a.g()) {
            return 4;
        }
        return qhcVar.b == 6 ? 5 : 6;
    }

    @Override // defpackage.qw4, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qhc qhcVar = (qhc) obj;
        qhc qhcVar2 = (qhc) obj2;
        xm3 xm3Var = this.c;
        gn3 gn3Var = xm3Var.l;
        boolean zEquals = qhcVar.equals(qhcVar2);
        al3 al3Var = qhcVar.a;
        if (!zEquals) {
            ml3 ml3Var = xm3Var.c;
            boolean z = (ml3Var != null && ml3Var.h()) || xm3Var.i != 3 || gn3Var.e();
            int iE = e(qhcVar, z);
            int iE2 = e(qhcVar2, z);
            al3 al3Var2 = qhcVar2.a;
            int i = iE - iE2;
            if (i != 0) {
                return i;
            }
            Resources resources = gn3Var.r.getResources();
            int iA = vep.A(this.b);
            if (iA == 1) {
                return Collator.getInstance().compare(qhcVar.d(resources), qhcVar2.d(resources));
            }
            if (iA == 2) {
                xm3Var.a.o();
                c5o c5oVar = xm3Var.d;
                List listI = (List) c5oVar.a;
                if (listI == null) {
                    ml3 ml3Var2 = ((xm3) c5oVar.b).c;
                    listI = ml3Var2 == null ? Collections.EMPTY_LIST : ml3Var2.i();
                    c5oVar.a = listI;
                }
                int iIndexOf = listI.indexOf(al3Var);
                int iIndexOf2 = listI.indexOf(al3Var2);
                if (iIndexOf < iIndexOf2) {
                    return -1;
                }
                return iIndexOf == iIndexOf2 ? 0 : 1;
            }
            if (iA == 3) {
                return Collator.getInstance().compare(qhcVar.d(resources), qhcVar2.d(resources)) * (-1);
            }
            if (iA == 4) {
                return Long.compare(al3Var.d(), al3Var2.d()) * (-1);
            }
            if (iA == 5) {
                return Long.compare(al3Var.d(), al3Var2.d());
            }
        }
        return 0;
    }
}
