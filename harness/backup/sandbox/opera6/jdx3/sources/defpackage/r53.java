package defpackage;

import com.opera.android.custom_views.StylingTextView;
import com.opera.android.mainmenu.MainMenuSheetToggleLayout;
import com.opera.android.widget.MenuSettingsListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class r53 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y53 b;

    public /* synthetic */ r53(y53 y53Var, byte b) {
        this.a = b;
        this.b = y53Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y53 y53Var = this.b;
        switch (b) {
            case 0:
                y53Var.T(mh0.A);
                y53Var.b.a.b.e(new vfn(), false);
                break;
            case 1:
                h73 h73Var = y53Var.b;
                ((dpf) h73Var.m.e.g()).a(new ole(y53Var));
                f7d f7dVar = h73Var.a;
                db dbVar = f7dVar.g;
                ((dpf) f7dVar.f.e.g()).a(new z8b(f7dVar.a, dbVar));
                if (f7dVar.h.b()) {
                    slk slkVar = f7dVar.i;
                    slkVar.getClass();
                    slkVar.b(null);
                    break;
                }
                break;
            case 2:
                y53Var.T(mh0.B);
                y53Var.b.a.a(uxk.class);
                break;
            case 3:
                y53Var.T(mh0.p);
                g8j g8jVar = (g8j) ((d8j) y53Var.b.a.a.g0.E(d8j.class));
                g8jVar.b.e(new e6j(), false);
                break;
            case 4:
                y53Var.T(mh0.h);
                y53Var.b.a.getClass();
                ac8.a(new th8());
                break;
            case 5:
                y53Var.T(mh0.D);
                y53Var.b.a.b.e(new vfn(), false);
                break;
            case 6:
                y53Var.T(mh0.v);
                y53Var.b.a.a(tc6.class);
                break;
            case 7:
                y53Var.T(mh0.q);
                f7d f7dVar2 = y53Var.b.a;
                f7dVar2.getClass();
                f7dVar2.b.e(new qk(), false);
                break;
            case 8:
                y53Var.T(mh0.l);
                f7d f7dVar3 = y53Var.b.a;
                f7dVar3.getClass();
                f7dVar3.b.e(new exe(), false);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                or2 or2Var = y53Var.c;
                if (!y53Var.o) {
                    or2 or2Var2 = (or2) or2Var.b;
                    vs vsVar = ((MainMenuSheetToggleLayout) or2Var2.d).a;
                    if (vsVar != null) {
                        ((StylingTextView) vsVar.e).setSelected(true);
                    }
                    vs vsVar2 = ((MainMenuSheetToggleLayout) or2Var2.b).a;
                    if (vsVar2 != null) {
                        ((StylingTextView) vsVar2.e).setSelected(true);
                    }
                    vs vsVar3 = ((MainMenuSheetToggleLayout) or2Var2.e).a;
                    if (vsVar3 != null) {
                        ((StylingTextView) vsVar3.e).setSelected(true);
                    }
                    vs vsVar4 = ((MainMenuSheetToggleLayout) or2Var2.f).a;
                    if (vsVar4 != null) {
                        ((StylingTextView) vsVar4.e).setSelected(true);
                        break;
                    }
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                y53Var.T(mh0.s);
                ((ot2) ((jt2) y53Var.b.a.a.g0.E(jt2.class))).a(new int[0]);
                break;
            case 11:
                y53Var.T(mh0.r);
                ((g8j) ((d8j) y53Var.b.a.a.g0.E(d8j.class))).b(new int[0]);
                break;
            case 12:
                y53Var.T(mh0.t);
                ((ot2) ((jt2) y53Var.b.a.a.g0.E(jt2.class))).b(new int[0]);
                break;
            case 13:
                y53Var.T(mh0.u);
                ((ot2) ((jt2) y53Var.b.a.a.g0.E(jt2.class))).d();
                break;
            case 14:
                y53Var.T(mh0.C);
                y53Var.b.a.a(uxk.class);
                break;
            default:
                or2 or2Var3 = y53Var.c;
                MenuSettingsListItem menuSettingsListItem = (MenuSettingsListItem) ((ei) or2Var3.e).h;
                h73 h73Var2 = y53Var.b;
                y53Var.U(menuSettingsListItem, h73Var2.c.f);
                ei eiVar = (ei) or2Var3.e;
                MenuSettingsListItem menuSettingsListItem2 = (MenuSettingsListItem) eiVar.g;
                rs2 rs2Var = h73Var2.c;
                y53Var.U(menuSettingsListItem2, rs2Var.h);
                y53Var.U((MenuSettingsListItem) eiVar.e, rs2Var.g);
                break;
        }
    }
}
