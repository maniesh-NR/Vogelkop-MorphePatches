package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.BrowserActivity;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class jp3 implements as6 {
    public final /* synthetic */ byte a = 2;
    public final Object b;
    public Object c;
    public Object d;

    public jp3(Function0 function0) {
        this.b = function0;
    }

    public jp3(r22 r22Var, wth wthVar, eq6 eq6Var, dw dwVar, c37 c37Var, c37 c37Var2, c37 c37Var3, b49 b49Var, dw dwVar2, b49 b49Var2, xm5 xm5Var, qo3 qo3Var, nv6 nv6Var, qo3 qo3Var2, qo3 qo3Var3) {
        this.b = r22Var;
        csk cskVarA = zch.a();
        cv6 cv6Var = bb7.a;
        a64 a64VarB = sgb.b(e.a(cskVarA, s6d.a.e));
        this.c = a64VarB;
        f99 f99Var = (rlh) wthVar.b;
        f99 f99Var2 = (rlh) eq6Var.a;
        f99 f99Var3 = dwVar.b;
        f99 f99Var4 = (nak) c37Var.b;
        f99 f99Var5 = (nak) c37Var2.b;
        f99 f99Var6 = (nak) c37Var3.b;
        f99 f99Var7 = b49Var.b;
        f99 f99Var8 = dwVar2.b;
        f99 f99Var9 = b49Var2.b;
        f99 f99Var10 = (rlh) xm5Var.a;
        f99 f99VarM = qo3Var.m();
        f99 f99Var11 = (rlh) nv6Var.a;
        this.d = a26.o0(new ip3(new f99[]{f99Var, f99Var2, f99Var3, f99Var4, f99Var5, f99Var6, f99Var7, f99Var8, f99Var9, f99Var10, f99VarM, f99Var11, qo3Var2.m(), qo3Var3.m()}, this, wthVar, b49Var2, eq6Var, dwVar, c37Var, c37Var2, c37Var3, b49Var, dwVar2, xm5Var, qo3Var, nv6Var, qo3Var2, qo3Var3), a64VarB, new f9k(0L), fsp.l(r22Var.d(new rsg(((q8l) ((rlh) f99Var).a.getValue()).a, ((Boolean) ((rlh) f99Var9).a.getValue()).booleanValue(), ((Boolean) ((rlh) f99Var2).a.getValue()).booleanValue())), ((Boolean) ((rlh) f99Var2).a.getValue()).booleanValue(), ((Boolean) dwVar.b.a.getValue()).booleanValue(), ((Boolean) f99Var4.getValue()).booleanValue(), ((Boolean) f99Var5.getValue()).booleanValue(), ((Boolean) f99Var6.getValue()).booleanValue(), ((Boolean) ((rlh) f99Var7).a.getValue()).booleanValue(), ((Boolean) ((rlh) f99Var8).a.getValue()).booleanValue(), ((Boolean) ((rlh) f99Var9).a.getValue()).booleanValue(), ((Boolean) ((rlh) f99Var10).a.getValue()).booleanValue(), ((Boolean) qo3Var.m().getValue()).booleanValue(), ((Boolean) ((rlh) f99Var11).a.getValue()).booleanValue(), ((Boolean) qo3Var2.m().getValue()).booleanValue(), ((Boolean) qo3Var3.m().getValue()).booleanValue()));
    }

    public jp3(yqa yqaVar, tcc tccVar, dl5 dl5Var) {
        this.b = tccVar;
        this.c = dl5Var;
        this.d = yqaVar;
    }

    public final Object a(Fragment fragment, xtb xtbVar) {
        Object obj = this.c;
        if (obj != null) {
            return obj;
        }
        qdc lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
        if (lifecycle.i != qcc.a) {
            if (((Fragment) this.d) == null) {
                this.d = fragment;
                lifecycle.a(this);
            }
            if (lifecycle.i.d(qcc.b)) {
                Object objInvoke = ((Function0) this.b).invoke();
                this.c = objInvoke;
                return objInvoke;
            }
        }
        throw new IllegalStateException((xtbVar.getName() + " is only available during the Fragment view's lifecycle.").toString());
    }

    public final void b(BrowserActivity browserActivity, rt3 rt3Var) {
        browserActivity.getLifecycle().a(this);
        xf8.u((rlh) this.d).j(browserActivity, new pb(new bo3(rt3Var, (byte) 3), (byte) 24));
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        switch (this.a) {
            case 0:
                sgb.k((a64) this.c, (CancellationException) null);
                ndcVar.getLifecycle().b(this);
                break;
            case 1:
                ((tcc) this.b).b(this);
                ((i7f) ((yqa) this.d).b).c((dl5) this.c);
                break;
            default:
                this.c = null;
                Fragment fragment = (Fragment) this.d;
                if (fragment != null) {
                    fragment.getViewLifecycleOwner().getLifecycle().b(this);
                }
                this.d = null;
                break;
        }
    }
}
