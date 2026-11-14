package defpackage;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.Collections;

/* loaded from: classes.dex */
public final class mri extends o73 implements kri {
    public final lg j;
    public final q6e k;
    public final z0a l;
    public final cbf m;
    public boolean n;

    public mri(lg lgVar, q6e q6eVar, z0a z0aVar, cbf cbfVar) {
        this.j = lgVar;
        this.k = q6eVar;
        this.l = z0aVar;
        this.m = cbfVar;
    }

    @Override // defpackage.kri
    public final void a(q6e q6eVar) {
        r9i r9iVarF;
        if (this.n || (r9iVarF = f()) == null) {
            return;
        }
        itd itdVar = (m66) r9iVarF.c;
        itdVar.clear();
        q(itdVar);
    }

    @Override // defpackage.o73
    public final int d(View view) {
        return 8388611;
    }

    @Override // defpackage.o73
    public final int e(View view) throws Resources.NotFoundException {
        int iA = fan.a(4.0f, view.getResources());
        int iE = super.e(view);
        if ((Gravity.getAbsoluteGravity(8388611, cs5.W(view) ? 1 : 0) & 7) == 3) {
            iA = -iA;
        }
        return iE + iA;
    }

    @Override // defpackage.o73
    public final int h(View view) {
        return super.h(view) - fan.a(4.0f, view.getResources());
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        this.n = false;
        ((o66) r9iVar.d).u = this.a.getResources().getDimensionPixelSize(2131167309);
        r9iVar.S(true);
        q((m66) r9iVar.c);
        this.k.F(this);
    }

    @Override // defpackage.o73, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.k.H(this);
        super.onDismiss();
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object tag = menuItem.getActionView().getTag();
        if (!(tag instanceof eri)) {
            return false;
        }
        eri eriVar = (eri) tag;
        this.n = true;
        lg lgVar = this.j;
        if (lgVar.b().equals(eriVar)) {
            return true;
        }
        this.m.run();
        lgVar.f(eriVar, true, true);
        this.k.k(eriVar);
        return true;
    }

    public final void q(Menu menu) {
        eri eriVarB = this.j.b();
        Resources resources = this.a.getResources();
        final int iA = fan.a(24.0f, resources);
        uri uriVar = new uri(resources, new oji(this));
        boolean zBooleanValue = ((Boolean) this.l.get()).booleanValue();
        for (final eri eriVar : Collections.unmodifiableList(this.k.a)) {
            if (!zBooleanValue || eriVar.e()) {
                final MenuItem menuItemAdd = menu.add(eriVar.getTitle());
                menuItemAdd.setActionView(2131558594);
                View actionView = menuItemAdd.getActionView();
                actionView.setTag(eriVar);
                if (eriVar.b()) {
                    actionView.setOnTouchListener(uriVar);
                } else {
                    actionView.setBackground(null);
                }
                r8n r8nVar = new r8n() { // from class: lri
                    @Override // defpackage.r8n
                    public final void a(View view) {
                        menuItemAdd.setIcon(eti.d(eriVar, this.a.a, iA));
                    }
                };
                dll dllVarS = q9n.s(actionView);
                if (dllVarS != null) {
                    u8n.b(dllVarS, actionView, r8nVar);
                }
                r8nVar.a(actionView);
                menuItemAdd.setCheckable(true);
                menuItemAdd.setChecked(eriVarB.equals(eriVar));
            }
        }
    }
}
