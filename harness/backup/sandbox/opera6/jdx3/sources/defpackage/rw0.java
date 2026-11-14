package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final /* synthetic */ class rw0 implements cll {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.cll
    public final void K() {
        v22 v22VarG;
        r22 r22Var;
        vsn vsnVarG;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((igi) obj).A0();
                break;
            case 1:
                x22 x22Var = (x22) obj;
                b2l b2lVar = x22Var.b.o;
                if (b2lVar != null && (v22VarG = x22Var.g(b2lVar)) != null && v22VarG.f.i.d(qcc.e) && (r22Var = v22VarG.h) != null && (vsnVarG = r22Var.g()) != null) {
                    eyi eyiVar = vsnVarG.c.y;
                    xf8.G0((kze) eyiVar.d, eyiVar.b ? "ofa-private-mode" : "ofa-".concat(((SettingsManager) eyiVar.c).g().d));
                    break;
                }
                break;
            case 2:
                ((bp3) obj).i(true);
                break;
            case 3:
                int i = BrowserActivity.E1;
                f03.f((BrowserActivity) obj);
                break;
            case 4:
                w04 w04Var = (w04) obj;
                x05 x05Var = w04Var.b;
                Context context = w04Var.a;
                float fL = wz3.a.l(context);
                u05 u05Var = x05Var.a;
                u05Var.h = fL;
                u05Var.b.setStrokeWidth(fL);
                x05Var.invalidateSelf();
                x05Var.b(new int[]{f03.t(2130969303, context, 2131101243)});
                break;
            case 5:
                owa owaVar = (owa) obj;
                ShapeDrawable shapeDrawable = owaVar.b;
                shapeDrawable.getPaint().setColor(f03.t(2130969332, owaVar.a, 2131101243));
                shapeDrawable.invalidateSelf();
                break;
            case 6:
                nxa nxaVar = (nxa) obj;
                Context context2 = nxaVar.a;
                nxaVar.setDrawable(0, ui6.o(context2));
                Drawable drawableU = w8h.u(2131231724, context2);
                j14.n0(drawableU, j7h.k(2130969263, context2));
                nxaVar.setDrawable(1, new w3a(drawableU, 17, false));
                nxaVar.invalidateSelf();
                break;
            case 7:
                ((t59) obj).c();
                break;
            default:
                qln qlnVar = (qln) obj;
                if (((qjn) qlnVar.h.g()).a.b.a()) {
                    qlnVar.a(new vk2((byte) 26), 1);
                    break;
                }
                break;
        }
    }
}
