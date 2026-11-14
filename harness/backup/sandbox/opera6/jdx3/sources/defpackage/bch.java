package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;
import java.util.List;

/* loaded from: classes.dex */
public final class bch {
    public final s9i a;

    @NonNull
    @WeakOwner
    private final ach b;
    public msh c;
    public final pre d;

    public bch(stm stmVar, s9i s9iVar, pre preVar) {
        this.d = preVar;
        this.a = s9iVar;
        ach achVar = new ach(stmVar);
        this.b = achVar;
        stmVar.b(achVar);
    }

    public final void a(uqe uqeVar, String str) {
        qtm qtmVar = this.b.b;
        if (qtmVar != null) {
            msh mshVar = this.c;
            if (mshVar == null || !((String) mshVar.v.b).equals(str)) {
                s9i s9iVar = this.a;
                uy8 uy8Var = (uy8) s9iVar.e;
                if (uy8Var != null) {
                    new h82((Context) s9iVar.b, (vr9) s9iVar.d, this.d, qtmVar, uy8Var, str).U(new f1p(this, uqeVar, false));
                } else {
                    h9o.e();
                }
            }
        }
    }

    public final void b(msh mshVar, uqe uqeVar) {
        mshVar.d(uqeVar, new zbh(this, new vr9(new d50(this, this.b.c, mshVar, (byte) 9), 2)), true);
    }

    public final void c(int i, msh mshVar) {
        List list;
        if (this.b.c != i || (list = (List) mshVar.A.c) == null || list.isEmpty()) {
            return;
        }
        this.c = mshVar;
    }
}
