package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import java.util.Collections;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class h0h extends o73 {
    public final /* synthetic */ byte j;
    public final Object k;
    public Object l;
    public final Object m;

    public h0h(blh blhVar, View view, ilh ilhVar) {
        this.j = (byte) 1;
        this.k = view;
        this.l = ilhVar;
        this.m = blhVar;
    }

    public h0h(String str, lag lagVar, r9g r9gVar) {
        this.j = (byte) 0;
        this.k = str;
        this.l = lagVar;
        this.m = r9gVar;
    }

    public h0h(n9k n9kVar) {
        this.j = (byte) 2;
        this.k = n9kVar;
        this.m = new he(this, (byte) 4);
    }

    @Override // defpackage.o73
    public final int e(View view) throws Resources.NotFoundException {
        switch (this.j) {
            case 0:
                int iE = super.e(view);
                int iA = fan.a(16.0f, view.getResources());
                return (Gravity.getAbsoluteGravity(d(view), cs5.W(view) ? 1 : 0) & 7) == 3 ? Math.max(iA, iE) : Math.min(-iA, iE);
            default:
                return super.e(view);
        }
    }

    @Override // defpackage.o73
    public final int h(View view) {
        switch (this.j) {
            case 0:
                return super.h(view) - fan.a(56.0f, view.getResources());
            default:
                return super.h(view);
        }
    }

    @Override // defpackage.o73
    public final boolean j(View view) {
        switch (this.j) {
            case 2:
                return true;
            default:
                return super.j(view);
        }
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        kag kagVarA;
        int i;
        byte b = this.j;
        Object obj = this.k;
        int i2 = 0;
        switch (b) {
            case 0:
                ((o66) r9iVar.d).u = this.a.getResources().getDimensionPixelSize(2131167309);
                r9iVar.S(true);
                m66 m66Var = (m66) r9iVar.c;
                String str = (String) obj;
                lag lagVar = (lag) this.l;
                jag jagVarF = s9g.h.f(str, false);
                if (jagVarF == null || (kagVarA = jagVarF.a(lagVar, (kag) null)) == null) {
                    kagVarA = null;
                } else if (!Boolean.TRUE.equals(jagVarF.b(lagVar))) {
                    kagVarA = kag.ASK;
                }
                for (kag kagVar : ui6.j(lagVar)) {
                    ptd ptdVarA = m66Var.a(0, 0, 0, ui6.R(this.a, lagVar, kagVar, str));
                    ptdVarA.setActionView(2131558594);
                    ptdVarA.setCheckable(true);
                    ptdVarA.setChecked(kagVar.equals(kagVarA));
                    View actionView = ptdVarA.getActionView();
                    actionView.setTag(kagVar);
                    actionView.setBackground(null);
                }
                break;
            case 1:
                r9iVar.L(2131755024);
                ((m66) r9iVar.c).findItem(2131363490).setVisible(false);
                break;
            default:
                dkf dkfVar = (dkf) r9iVar.b;
                m66 m66Var2 = (m66) r9iVar.c;
                this.l = dkfVar;
                r9iVar.L(2131755062);
                n9k n9kVar = (n9k) obj;
                r9l r9lVar = (r9l) n9kVar.b;
                r9l r9lVar2 = (r9l) n9kVar.b;
                boolean zK = r9lVar.k();
                if (zK) {
                    m66Var2.removeItem(2131364666);
                }
                MenuItem menuItemFindItem = m66Var2.findItem(2131364667);
                if (menuItemFindItem != null) {
                    dkf dkfVar2 = (dkf) this.l;
                    if (dkfVar2 == null) {
                        dkfVar2 = null;
                    }
                    menuItemFindItem.setTitle(dkfVar2.getString(zK ? 2132019983 : 2132017369));
                }
                if (r9lVar2.k() || ((ebl) r9lVar2.E.a).e.getVisibility() == 0) {
                    m66Var2.removeItem(2131364670);
                    i = 1;
                } else {
                    i = 0;
                }
                if (((ebl) r9lVar2.E.a).v.getVisibility() == 0) {
                    m66Var2.removeItem(2131364673);
                    i++;
                }
                if (i >= 2) {
                    m66Var2.removeItem(2131364004);
                }
                if (!exg.g(Collections.unmodifiableList(r9lVar2.c.b))) {
                    m66Var2.removeItem(2131364669);
                    i2 = 1;
                }
                if (!exg.i(Collections.unmodifiableList(r9lVar2.c.b))) {
                    m66Var2.removeItem(2131364675);
                    i2++;
                }
                if (r9lVar2.f().v.o.b.size() == 0) {
                    m66Var2.removeItem(2131364671);
                    m66Var2.removeItem(2131364668);
                    i2 += 2;
                }
                if (i2 >= 4) {
                    m66Var2.removeItem(2131362352);
                }
                g4l g4lVar = r9lVar2.D;
                if (g4lVar.b(true) && g4lVar.i.g() == a4l.c) {
                    MenuItem menuItemFindItem2 = m66Var2.findItem(2131364700);
                    if (menuItemFindItem2 != null) {
                        dkf dkfVar3 = (dkf) this.l;
                        if (dkfVar3 == null) {
                            dkfVar3 = null;
                        }
                        menuItemFindItem2.setTitle(dkfVar3.getString(((uz3) r9lVar2.D.c.d.d) != null ? 2132018386 : 2132021845));
                    }
                } else {
                    m66Var2.removeItem(2131364700);
                }
                dkf dkfVar4 = (dkf) this.l;
                zi4.y(dkfVar4 != null ? dkfVar4 : null).a((he) this.m);
                break;
        }
    }

    @Override // defpackage.o73, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.j) {
            case 2:
                super.onDismiss();
                dkf dkfVar = (dkf) this.l;
                if (dkfVar == null) {
                    dkfVar = null;
                }
                zi4.y(dkfVar).c((he) this.m);
                n9k n9kVar = (n9k) this.k;
                r9l r9lVar = (r9l) n9kVar.b;
                if (n9kVar.a) {
                    g4l g4lVar = r9lVar.D;
                    g4lVar.getClass();
                    xf8.F0(g4lVar.i, a4l.b);
                }
                g4l g4lVar2 = r9lVar.D;
                g4lVar2.j.remove(f4l.b);
                g4lVar2.d(new d4l(g4lVar2, (byte) 0));
                break;
            default:
                super.onDismiss();
                break;
        }
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        s3l s3lVar;
        byte b = this.j;
        Object obj = this.m;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                Object tag = menuItem.getActionView().getTag();
                if (!(tag instanceof kag)) {
                    return false;
                }
                String str = (String) obj2;
                lag lagVar = (lag) this.l;
                kag kagVar = (kag) tag;
                g0h g0hVar = (g0h) ((r9g) obj).b;
                Context contextRequireContext = ((i0h) g0hVar.c.c).requireContext();
                sz4 sz4Var = (sz4) contextRequireContext.getSystemService("com.opera.android.permissions.PermissionHandlerService");
                Objects.requireNonNull(sz4Var);
                if (lagVar == lag.b && kagVar == kag.GRANTED && yi4.T(sz4Var)) {
                    yi4.R(contextRequireContext, sz4Var, oi.d(contextRequireContext), new s2g(g0hVar, str, lagVar, kagVar));
                    return true;
                }
                s9g.h.o(false, str, lagVar, kagVar, true);
                return true;
            case 1:
                blh blhVar = (blh) obj;
                ilh ilhVar = (ilh) this.l;
                Context context = ((View) obj2).getContext();
                if (menuItem.getItemId() == 2131363482) {
                    blhVar.j.K0(Collections.singletonList(ilhVar), true, false, true);
                    return true;
                }
                if (menuItem.getItemId() == 2131363481) {
                    blhVar.j.K0(Collections.singletonList(ilhVar), true, true, true);
                    return true;
                }
                if (menuItem.getItemId() == 2131363476) {
                    nlh nlhVar = blhVar.j;
                    nlhVar.getClass();
                    zhj.a(new f9c(ilhVar, new eof(nlhVar, ilhVar, (byte) 11)), -1).c(nlhVar.getContext());
                    return true;
                }
                if (menuItem.getItemId() == 2131363473) {
                    nlh nlhVar2 = blhVar.j;
                    nlhVar2.G.c(Collections.singletonList(ilhVar));
                    return true;
                }
                if (menuItem.getItemId() == 2131363470) {
                    lcp.m(context, ilhVar.b);
                    return true;
                }
                if (menuItem.getItemId() != 2131363489) {
                    return false;
                }
                new ghf(new i4d(new e5f(ilhVar.b, ilhVar.c, (byte) 10))).I(context);
                return true;
            default:
                n9k n9kVar = (n9k) obj2;
                int itemId = menuItem.getItemId();
                if (itemId == 2131364700) {
                    ((r9l) n9kVar.b).z.b(vr0.v);
                    n9kVar.a = true;
                    return true;
                }
                if (itemId == 2131364672) {
                    r9l r9lVar = (r9l) n9kVar.b;
                    r9lVar.z.b(vr0.E);
                    r9lVar.A.y();
                    return true;
                }
                if (itemId == 2131364668) {
                    r9l r9lVar2 = (r9l) n9kVar.b;
                    p9l p9lVar = r9lVar2.A;
                    k6l k6lVar = r9lVar2.c;
                    s3l s3lVar2 = u3l.a;
                    int iOrdinal = r9lVar2.t.e.ordinal();
                    if (iOrdinal == 0) {
                        s3lVar = u3l.a;
                    } else if (iOrdinal == 1) {
                        s3lVar = u3l.b;
                    } else {
                        h9o.p();
                    }
                    p9lVar.g0(CollectionsKt.n0(exg.p(k6lVar, s3lVar, y6l.a)), pdb.c, vr0.f, true);
                    return true;
                }
                if (itemId == 2131364671) {
                    ((r9l) n9kVar.b).s(true, false);
                    return true;
                }
                if (itemId == 2131364670) {
                    ((r9l) n9kVar.b).n();
                    return true;
                }
                if (itemId == 2131364673) {
                    ((r9l) n9kVar.b).o();
                    return true;
                }
                if (itemId == 2131364666) {
                    r9l r9lVar3 = (r9l) n9kVar.b;
                    p6l p6lVar = r9lVar3.t.e;
                    p6l p6lVar2 = p6l.a;
                    if (p6lVar == p6lVar2) {
                        r9lVar3.l();
                    } else {
                        r9lVar3.A.j0(p6lVar2, null);
                    }
                    r9lVar3.j();
                    return true;
                }
                if (itemId == 2131364667) {
                    r9l r9lVar4 = (r9l) n9kVar.b;
                    p6l p6lVar3 = r9lVar4.t.e;
                    p6l p6lVar4 = p6l.b;
                    if (p6lVar3 == p6lVar4) {
                        r9lVar4.l();
                    } else {
                        r9lVar4.A.j0(p6lVar4, null);
                    }
                    r9lVar4.j();
                    return true;
                }
                if (itemId == 2131364669) {
                    r9l r9lVar5 = (r9l) n9kVar.b;
                    r9lVar5.A.o0(Collections.unmodifiableList(r9lVar5.c.b), true, true);
                    return true;
                }
                if (itemId == 2131364675) {
                    r9l r9lVar6 = (r9l) n9kVar.b;
                    r9lVar6.A.O(Collections.unmodifiableList(r9lVar6.c.b), true, true);
                    return true;
                }
                return false;
        }
    }
}
