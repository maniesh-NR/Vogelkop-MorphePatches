package defpackage;

import android.view.View;
import com.opera.android.custom_views.OperaActionMenuItemView;

/* loaded from: classes.dex */
public final class ke extends ek9 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke(View view, View view2, byte b) {
        super(view2);
        this.j = b;
        this.k = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(OperaActionMenuItemView operaActionMenuItemView) {
        super(operaActionMenuItemView);
        this.j = (byte) 0;
        this.k = operaActionMenuItemView;
    }

    @Override // defpackage.ek9
    public final gij b() {
        le leVar;
        byte b = this.j;
        View view = this.k;
        switch (b) {
            case 0:
                u59 u59Var = ((OperaActionMenuItemView) view).m;
                if (u59Var == null || (leVar = ((ne) u59Var.b).p) == null) {
                    return null;
                }
                return leVar.a();
            case 1:
                le leVar2 = ((me) view).a.o;
                if (leVar2 != null) {
                    return leVar2.a();
                }
                return null;
            default:
                return ((hh) view).b();
        }
    }

    @Override // defpackage.ek9
    public final boolean c() {
        gij gijVarB;
        byte b = this.j;
        View view = this.k;
        switch (b) {
            case 0:
                OperaActionMenuItemView operaActionMenuItemView = (OperaActionMenuItemView) view;
                qe qeVar = operaActionMenuItemView.k;
                if (qeVar != null) {
                    if (qeVar.p.q(operaActionMenuItemView.h, null, 0) && (gijVarB = b()) != null && gijVarB.a()) {
                        break;
                    }
                }
                break;
            case 1:
                ((me) view).a.l();
                break;
            default:
                hh hhVar = (hh) view;
                if (!hhVar.c() && hhVar.o) {
                    hhVar.m = false;
                    hhVar.d(hhVar.n);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.ek9
    public final boolean d() {
        byte b = this.j;
        View view = this.k;
        switch (b) {
            case 1:
                ne neVar = ((me) view).a;
                if (neVar.q != null) {
                    return false;
                }
                neVar.j();
                return true;
            case 2:
                ((hh) view).a();
                return true;
            default:
                return super.d();
        }
    }
}
