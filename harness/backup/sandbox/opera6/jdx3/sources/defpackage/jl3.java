package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.opera.android.bookmarks.h;
import java.util.Iterator;

/* loaded from: classes.dex */
public class jl3 extends ll3 {
    public final i53 b;
    public final boolean c;
    public final qm3 d;

    public jl3(ml3 ml3Var, i53 i53Var, boolean z) {
        super(ml3Var);
        this.b = i53Var;
        this.c = z;
        this.d = qm3.a(ml3Var, ((h) i53Var).o());
    }

    @Override // defpackage.ll3
    public String a(Resources resources) {
        ml3 ml3Var = (ml3) this.a;
        sa2 sa2Var = new sa2((byte) 4, false);
        ml3Var.c(sa2Var);
        int i = sa2Var.b;
        return resources.getQuantityString(2131886094, i, Integer.valueOf(i));
    }

    @Override // defpackage.ll3
    public final Drawable b(Context context) {
        String strB = ((ml3) this.a).b();
        return strB == null ? alo.A(e(), context) : alo.z(context, strB);
    }

    @Override // defpackage.ll3
    public String c(Resources resources) {
        return alo.J((ml3) this.a, resources);
    }

    @Override // defpackage.ll3
    public final int d() {
        return 2;
    }

    public int e() {
        return 2131232090;
    }

    public final jl3 f() {
        i53 i53Var = this.b;
        h hVar = (h) i53Var;
        ml3 ml3VarA = this.a.a(hVar.o());
        if (ml3VarA == null) {
            Iterator it = this.d.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ml3VarA = hVar.o();
                    break;
                }
                al3 al3VarM = hVar.m(((kkj) it.next()).a, true);
                if (al3VarM instanceof ml3) {
                    ml3VarA = (ml3) al3VarM;
                    break;
                }
            }
        }
        return new jl3(ml3VarA, i53Var, true);
    }
}
