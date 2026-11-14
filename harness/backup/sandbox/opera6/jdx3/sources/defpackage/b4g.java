package defpackage;

import J.N;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ListPopupWindow;
import com.opera.android.browser.passwordmanager.PasswordGenerationPopupView;

/* loaded from: classes.dex */
public final class b4g extends o73 {
    public Rect j;
    public final lq2 k;
    public final ab l = new ab(this, 25);
    public final /* synthetic */ PasswordGenerationPopupView m;

    public b4g(PasswordGenerationPopupView passwordGenerationPopupView) {
        this.m = passwordGenerationPopupView;
        this.k = new lq2(passwordGenerationPopupView, new q02(this, (byte) 22));
    }

    @Override // defpackage.o73
    public final int d(View view) {
        return 8388611;
    }

    @Override // defpackage.o73
    public final int e(View view) throws Resources.NotFoundException {
        int iE = super.e(view);
        if (this.j == null) {
            this.j = new Rect();
            Drawable drawableX = f03.x(2130970552, this.a);
            if (drawableX != null) {
                drawableX.getPadding(this.j);
            }
        }
        return iE - this.j.left;
    }

    @Override // defpackage.o73
    public final int g() {
        return 2130970511;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        q(r9iVar);
        o66 o66Var = (o66) r9iVar.d;
        o66Var.u = Integer.MAX_VALUE;
        o66Var.B = true;
        o66Var.y = false;
        r9iVar.S(true);
        o66Var.C = true;
        o66Var.z = true;
        l56 l56Var = o66Var.f;
        if (l56Var != null) {
            ((ListPopupWindow) l56Var).l = true;
        }
        o66Var.x = this;
        this.m.a.c().m.b(this.l);
        lq2 lq2Var = this.k;
        huh huhVar = lq2Var.e.b;
        lq2Var.a = huhVar.a(huhVar.a);
        lq2Var.b = huhVar.a(huhVar.b);
        huhVar.l.b(lq2Var.c);
        if (N.MphJ2uhp()) {
            return;
        }
        o66Var.A = true;
        if (o66Var.j()) {
            o66Var.a(true);
        }
    }

    @Override // defpackage.o73, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        super.onDismiss();
        lq2 lq2Var = this.k;
        huh huhVar = lq2Var.e.b;
        huhVar.l.c(lq2Var.c);
        PasswordGenerationPopupView passwordGenerationPopupView = this.m;
        passwordGenerationPopupView.a.c().m.c(this.l);
        if (passwordGenerationPopupView.e != null) {
            N.MyFetNYO(passwordGenerationPopupView.f);
        }
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        PasswordGenerationPopupView passwordGenerationPopupView = this.m;
        if (itemId != 0) {
            passwordGenerationPopupView.getClass();
            return false;
        }
        N.MBk$J_UY(passwordGenerationPopupView.f);
        return true;
    }

    public final void q(r9i r9iVar) {
        m66 m66Var = (m66) r9iVar.c;
        m66Var.clear();
        dkf dkfVar = this.a;
        String str = this.m.g;
        if (str != null) {
            ptd ptdVarA = m66Var.a(0, 0, 0, str);
            ptdVarA.setIcon(2131232168);
            ptdVarA.setActionView(2131558533);
        }
        m66Var.a(0, 1, 0, dkfVar.getResources().getString(2132017862, dkfVar.getString(2132017591))).setActionView(2131558532);
    }
}
