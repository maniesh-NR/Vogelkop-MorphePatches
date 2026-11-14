package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.utilities.DisplayUtil;

/* loaded from: classes.dex */
public final class og5 extends cej {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ og5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public og5(zg zgVar, urj urjVar) {
        this.a = (byte) 6;
        this.b = zgVar;
    }

    private final void b(hjm hjmVar) {
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        zu5 zu5Var;
        qxh qxhVar;
        c37 c37Var;
        fua c37Var2;
        qxh qxhVar2;
        zu5 zu5Var2;
        rxh rxhVar;
        av5 av5Var;
        byte b = this.a;
        FrameLayout frameLayout = null;
        byte b2 = 1;
        byte b3 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new pg5((rg5) mejVar, (ue5) obj);
            case 1:
                return new lm6(mejVar, ((mm6) obj).a(), true, new qe6(this, (byte) 1));
            case 2:
                return new z4b(mejVar, this);
            case 3:
                Context context = mejVar.getContext();
                o4i o4iVar = (o4i) obj;
                qxh qxhVar3 = new qxh(o4iVar.a);
                qxh qxhVar4 = new qxh(o4iVar.b);
                qxh qxhVar5 = new qxh(o4iVar.d.a);
                zu5 zu5Var3 = new zu5((Object) o4iVar, context, (byte) 5);
                if (qxhVar5.a(context.getResources()).length() == 0) {
                    qxhVar = null;
                    zu5Var = null;
                } else {
                    zu5Var = zu5Var3;
                    qxhVar = qxhVar5;
                }
                Bitmap bitmap = o4iVar.g;
                if (bitmap != null) {
                    c37Var2 = null;
                    c37Var = new c37(context, bitmap);
                } else {
                    Bitmap bitmap2 = o4iVar.f;
                    c37Var = null;
                    c37Var2 = bitmap2 != null ? new c37(context, bitmap2) : new nx(context);
                }
                n4i n4iVar = o4iVar.e;
                if (n4iVar != null) {
                    qxh qxhVar6 = new qxh(n4iVar.a);
                    zu5 zu5Var4 = new zu5((Object) n4iVar, context, (byte) 6);
                    if (qxhVar6.a(context.getResources()).length() == 0) {
                        zu5Var4 = null;
                        qxhVar6 = null;
                    }
                    zu5Var2 = zu5Var4;
                    qxhVar2 = qxhVar6;
                } else {
                    qxhVar2 = null;
                    zu5Var2 = null;
                }
                CharSequence charSequence = o4iVar.c;
                if (charSequence != null) {
                    View viewInflate = LayoutInflater.from(context).inflate(2131559272, (ViewGroup) null, false);
                    yq1 yq1Var = (StylingTextView) w1h.j(2131364183, viewInflate);
                    if (yq1Var == null) {
                        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131364183)));
                        return null;
                    }
                    frameLayout = (FrameLayout) viewInflate;
                    yq1Var.setText(charSequence);
                }
                return new qf(mejVar, new gua(c37Var2, null, c37Var, null, qxhVar3, qxhVar4, frameLayout, qxhVar2, zu5Var2, qxhVar, zu5Var, true, null, false, null), b3);
            case 4:
                nv6 nv6VarB = ((ru9) obj).b();
                ((SharedPreferences.Editor) nv6VarB.a).putInt("sync.acknowledgement_state", 2);
                nv6VarB.w();
                Context context2 = mejVar.getContext();
                lxh lxhVar = new lxh(2131231676);
                rxh rxhVar2 = new rxh(2132022697);
                rxh rxhVar3 = new rxh(2132022696);
                rxh rxhVar4 = new rxh(2132020202);
                av5 av5Var2 = new av5(context2, b2);
                if (o18.h(context2, rxhVar4) == 0) {
                    rxhVar = null;
                    av5Var = null;
                } else {
                    rxhVar = rxhVar4;
                    av5Var = av5Var2;
                }
                return new qf(mejVar, new gua(null, lxhVar, null, null, rxhVar2, rxhVar3, null, rxhVar, av5Var, new rxh(2132019218), null, true, null, false, null), b3);
            case 5:
                return new rxk(mejVar, (z4k) obj);
            case 6:
                mejVar.getContext();
                return new pg5(mejVar, this, (zg) obj);
            default:
                return new qf(mejVar, obj, (byte) 4);
        }
    }

    @Override // defpackage.cej
    public final mej createSheetHost(Context context) {
        switch (this.a) {
            case 0:
                return new rg5(context);
            case 6:
                amn amnVar = new amn(this, context, (byte) 1);
                wq3 wq3Var = new wq3(context, 2132083096, false, (byte) 4);
                wq3Var.d = amnVar;
                return wq3Var;
            default:
                return super.createSheetHost(context);
        }
    }

    public final void d(Context context) {
        float dimension = context.getResources().getDimension(2131165352);
        if (dimension <= 0.0f) {
            dimension = DisplayUtil.c(context);
        }
        ((zg) this.b).a = (int) ((dimension - fan.a((r1 * 12) + 24, context.getResources())) / (context.getResources().getInteger(2131493010) + 0.5f));
    }

    @Override // defpackage.cej
    public final boolean isAllowed(b2l b2lVar) {
        switch (this.a) {
            case 6:
                return b2lVar == null || !((d7l) b2lVar).j.m();
            default:
                return super.isAllowed(b2lVar);
        }
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        byte b = this.a;
        vb0 vb0Var = vb0.d;
        hjm hjmVar2 = hjm.b;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                if (hjmVar == hjmVar2) {
                    ((mm6) obj).c(vb0Var, ac0.c, null);
                    break;
                }
                break;
            case 2:
                super.onFinished(hjmVar);
                if (hjmVar == hjmVar2) {
                    ((b5b) obj).b().a(vb0Var);
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
            default:
                super.onFinished(hjmVar);
                break;
            case 6:
                super.onFinished(hjmVar);
                zg zgVar = (zg) obj;
                qln qlnVar = (qln) zgVar.b;
                qlnVar.l.getClass();
                qs7.p = null;
                if (hjmVar == hjmVar2) {
                    qlnVar.o(false);
                }
                zgVar.c = null;
                if (zg.e == this) {
                    zg.e = null;
                    break;
                }
                break;
        }
    }
}
