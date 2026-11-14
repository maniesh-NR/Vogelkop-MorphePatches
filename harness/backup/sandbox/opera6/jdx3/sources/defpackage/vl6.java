package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.widget.NestedScrollView;
import com.opera.android.Lazy;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vl6 extends lim {
    public static vl6 f;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public vl6(NestedScrollView nestedScrollView, int i, nj8 nj8Var) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        this.a = (byte) 1;
        OperaBottomSheetBehavior operaBottomSheetBehaviorC = OperaBottomSheetBehavior.C(nestedScrollView);
        this.b = operaBottomSheetBehaviorC;
        operaBottomSheetBehaviorC.I(i);
        this.c = nj8Var;
        mj8 mj8Var = new mj8(nj8Var, new dg7(this, (byte) 10));
        this.d = mj8Var;
        this.e = nestedScrollView;
        operaBottomSheetBehaviorC.x(mj8Var);
        mj8Var.d(operaBottomSheetBehaviorC.q);
    }

    public vl6(fp1 fp1Var, u85 u85Var, String str) {
        this.a = (byte) 3;
        this.b = fp1Var.getApplicationContext();
        this.c = fp1Var;
        this.d = str;
        u85 u85Var2 = new u85(u85Var.d, (r0k) u85Var.e, u85Var.b, null, null, 0, new vdf(this, (byte) 18), new o8f(this, (byte) 15));
        u85Var.c();
        this.e = u85Var2;
        fp1Var.getLifecycle().a(this);
        f = this;
    }

    public vl6(Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
        this.a = (byte) 2;
        this.b = function1;
        this.c = function12;
        this.d = function13;
        this.e = function14;
    }

    public vl6(umi umiVar, ru9 ru9Var, Lazy lazy) {
        this.a = (byte) 0;
        this.b = umiVar;
        this.c = ru9Var;
        this.d = lazy;
    }

    public vl6(wv1 wv1Var, k3i k3iVar, j4c j4cVar) {
        this.a = (byte) 4;
        this.b = wv1Var;
        this.c = k3iVar;
        this.d = j4cVar;
        this.e = new q3i(this, (byte) 0);
    }

    public final void R() {
        ((fp1) this.c).getLifecycle().b(this);
        if (f == this) {
            f = null;
        }
    }

    public final boolean S() {
        OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) this.b;
        int i = operaBottomSheetBehavior.n ? 6 : 4;
        if (operaBottomSheetBehavior.q == i) {
            return false;
        }
        operaBottomSheetBehavior.I(i);
        return true;
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        switch (this.a) {
            case 2:
                ((Function1) this.b).invoke(ndcVar);
                break;
            case 4:
                ((k3i) this.c).a().j(ndcVar, new iwa(new rmg(this, (byte) 21), (byte) 27));
                break;
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ndcVar.getLifecycle().b(this);
                oml omlVar = (oml) this.e;
                if (omlVar != null) {
                    omlVar.cancel(false);
                }
                this.e = null;
                break;
            case 1:
                ndcVar.getLifecycle().b(this);
                ((OperaBottomSheetBehavior) obj2).A.remove((mj8) obj);
                break;
            case 2:
                ndcVar.getLifecycle().b(this);
                ((Function1) this.c).invoke(ndcVar);
                break;
            case 3:
                ndcVar.getLifecycle().b(this);
                u85 u85Var = (u85) this.e;
                if (u85Var != null) {
                    u85Var.c();
                    this.e = null;
                }
                if (f == this) {
                    f = null;
                }
                wwc.i((Context) obj2, (String) obj);
                break;
            default:
                super.onDestroy(ndcVar);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        switch (this.a) {
            case 2:
                ((Function1) this.d).invoke(ndcVar);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        switch (this.a) {
            case 0:
                if (!((ru9) this.c).a.contains("default_browser.first_set.timestamp")) {
                    umi umiVar = (umi) this.b;
                    if (((oml) this.e) == null) {
                        final byte b = 0;
                        nml nmlVarE = umiVar.e(new n5o(this) { // from class: ul6
                            public final /* synthetic */ vl6 b;

                            {
                                this.b = this;
                            }

                            public final Object g(Object obj) {
                                byte b2 = b;
                                vl6 vl6Var = this.b;
                                switch (b2) {
                                    case 0:
                                        return Boolean.valueOf(((yl6) ((Lazy) vl6Var.d).get()).d().b());
                                    default:
                                        if (((Boolean) obj).booleanValue()) {
                                            ru9 ru9Var = (ru9) vl6Var.c;
                                            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                            if (!ru9Var.a.contains("default_browser.first_set.timestamp")) {
                                                nv6 nv6VarB = ru9Var.b();
                                                ((SharedPreferences.Editor) nv6VarB.a).putLong("default_browser.first_set.timestamp", jCurrentTimeMillis);
                                                nv6VarB.w();
                                            }
                                        }
                                        vl6Var.e = null;
                                        return Unit.a;
                                }
                            }
                        });
                        final byte b2 = 1;
                        nmlVarE.b(umiVar.f(new n5o(this) { // from class: ul6
                            public final /* synthetic */ vl6 b;

                            {
                                this.b = this;
                            }

                            public final Object g(Object obj) {
                                byte b22 = b2;
                                vl6 vl6Var = this.b;
                                switch (b22) {
                                    case 0:
                                        return Boolean.valueOf(((yl6) ((Lazy) vl6Var.d).get()).d().b());
                                    default:
                                        if (((Boolean) obj).booleanValue()) {
                                            ru9 ru9Var = (ru9) vl6Var.c;
                                            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                                            if (!ru9Var.a.contains("default_browser.first_set.timestamp")) {
                                                nv6 nv6VarB = ru9Var.b();
                                                ((SharedPreferences.Editor) nv6VarB.a).putLong("default_browser.first_set.timestamp", jCurrentTimeMillis);
                                                nv6VarB.w();
                                            }
                                        }
                                        vl6Var.e = null;
                                        return Unit.a;
                                }
                            }
                        }));
                        oml omlVar = new oml(nmlVarE);
                        this.e = omlVar;
                        omlVar.a(Unit.a, null);
                        break;
                    }
                } else {
                    ndcVar.getLifecycle().b(this);
                    break;
                }
                break;
            case 2:
                ((Function1) this.e).invoke(ndcVar);
                break;
        }
    }
}
