package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.premium.ui.view.SubscriptionPlanList;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class zvd implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zvd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        byte b = this.a;
        int i = 2;
        ijm ijmVar = ijm.b;
        Object obj = null;
        boolean z = false;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                yvd yvdVar = (yvd) obj2;
                yvdVar.b();
                ((vk2) yvdVar.i).run(((jb9) yvdVar.d).g);
                break;
            case 1:
                z4k z4kVar = ((kue) obj2).g;
                z4kVar.getClass();
                new zhj(new wzg(obj, pte.class, (byte) 4), null, 1, -1, null, false, Arrays.asList(new n6h[0])).c(((c5k) z4kVar.b).c.getContext());
                break;
            case 2:
                hue hueVar = (hue) obj2;
                int bindingAdapterPosition = hueVar.getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    hueVar.b.a(bindingAdapterPosition);
                    break;
                }
                break;
            case 3:
                ive iveVar = (ive) obj2;
                j82 j82Var = (j82) iveVar.b;
                if (j82Var != null) {
                    hve hveVar = iveVar.m;
                    oqe oqeVarE0 = iveVar.e0();
                    hveVar.r(iveVar, j82Var);
                    uqe uqeVar = hveVar.h;
                    String str = ((fre) oqeVarE0).D.k;
                    uy8 uy8Var = uqeVar.h;
                    if (uy8Var.F.add(str)) {
                        x5f x5fVar = uy8Var.K.a;
                        if (x5fVar.h) {
                            zpa zpaVar = x5fVar.d;
                            x56 x56VarF = zpa.F();
                            new ck0(zpaVar, x56VarF).j(new j5f(str, od0.c, i));
                            x5fVar.U0(x56VarF);
                            break;
                        }
                    }
                }
                break;
            case 4:
                s2f s2fVar = (s2f) obj2;
                Context context = view.getContext();
                String str2 = s2fVar.c;
                boolean z2 = s2fVar.d;
                z77 z77VarU = sfe.U(context);
                mm2 mm2Var = new mm2(str2, z2);
                z77VarU.getClass();
                z77VarU.b(mm2Var, ijmVar);
                break;
            case 5:
                r2f r2fVar = (r2f) obj2;
                Context context2 = view.getContext();
                String str3 = (String) r2fVar.e;
                boolean z3 = r2fVar.d;
                z77 z77VarU2 = sfe.U(context2);
                mm2 mm2Var2 = new mm2(str3, z3);
                z77VarU2.getClass();
                z77VarU2.b(mm2Var2, ijmVar);
                break;
            case 6:
                ((g8j) ((a3f) obj2).I0().c).k();
                break;
            case 7:
                OperaListItem operaListItem = (OperaListItem) obj2;
                operaListItem.w.W();
                operaListItem.x.x();
                break;
            case 8:
                ((dnf) obj2).g();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((gim) obj2).b(view);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                q2f q2fVar = (q2f) obj2;
                q2fVar.f(hjm.a);
                View.OnClickListener onClickListener = q2fVar.e;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 11:
                z77 z77Var = ((q4g) obj2).G;
                wen wenVar = new wen();
                z77Var.getClass();
                z77Var.b(wenVar, ijmVar);
                break;
            case 12:
                a5g a5gVar = (a5g) obj2;
                EditText editText = a5gVar.f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = a5gVar.f;
                    if (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z = true;
                    }
                    EditText editText3 = a5gVar.f;
                    if (z) {
                        editText3.setTransformationMethod(null);
                    } else {
                        editText3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        a5gVar.f.setSelection(selectionEnd);
                    }
                    a5gVar.p();
                    break;
                }
                break;
            case 13:
                t5g t5gVar = (t5g) obj2;
                t5gVar.w.E(new ku(), new t7d(new s5g(t5gVar, b2), (byte) 3));
                break;
            case 14:
                vx3 vx3VarA = ay3.a(((g9g) obj2).w, lqm.u, false);
                vx3VarA.b = 3;
                o18.t(vx3VarA, true, vx3VarA);
                break;
            case 15:
                uig uigVar = (uig) obj2;
                String str4 = uigVar.n0;
                Drawable drawable = uigVar.l0;
                String str5 = uigVar.m0;
                Drawable drawable2 = uigVar.k0;
                boolean z4 = uigVar.p0;
                boolean z5 = !z4;
                if (z4 != z5) {
                    uigVar.p0 = z5;
                    ImageView imageView = uigVar.C;
                    if (imageView != null) {
                        if (z4) {
                            imageView.setImageDrawable(drawable);
                            imageView.setContentDescription(str4);
                        } else {
                            imageView.setImageDrawable(drawable2);
                            imageView.setContentDescription(str5);
                        }
                    }
                    ImageView imageView2 = uigVar.D;
                    if (imageView2 != null) {
                        if (!z4) {
                            imageView2.setImageDrawable(drawable2);
                            imageView2.setContentDescription(str5);
                            break;
                        } else {
                            imageView2.setImageDrawable(drawable);
                            imageView2.setContentDescription(str4);
                            break;
                        }
                    }
                }
                break;
            case 16:
                uig uigVar2 = ((nig) obj2).d;
                gig gigVar = uigVar2.o0;
                if (gigVar != null && gigVar.C(29)) {
                    nyl nylVarL = uigVar2.o0.L();
                    gig gigVar2 = uigVar2.o0;
                    String str6 = tym.a;
                    gigVar2.m(nylVarL.a().d(1).l(1, false).b());
                    uigVar2.l.b[1] = uigVar2.getResources().getString(2132018958);
                    uigVar2.q.dismiss();
                    break;
                }
                break;
            case 17:
                pig pigVar = (pig) obj2;
                uig uigVar3 = pigVar.e;
                int bindingAdapterPosition2 = pigVar.getBindingAdapterPosition();
                float[] fArr = uig.D0;
                View view2 = uigVar3.E;
                if (bindingAdapterPosition2 != 0) {
                    if (bindingAdapterPosition2 != 1) {
                        uigVar3.q.dismiss();
                        break;
                    } else {
                        nig nigVar = uigVar3.o;
                        view2.getClass();
                        uigVar3.b(nigVar, view2);
                        break;
                    }
                } else {
                    ky7 ky7Var = uigVar3.m;
                    view2.getClass();
                    uigVar3.b(ky7Var, view2);
                    break;
                }
            case SizeUtil.textSize0_1 /* 18 */:
                uig uigVar4 = ((nig) obj2).d;
                gig gigVar3 = uigVar4.o0;
                if (gigVar3 != null && gigVar3.C(29)) {
                    uigVar4.o0.m(uigVar4.o0.L().a().d(3).g().i((String) null).k().b());
                    uigVar4.q.dismiss();
                    break;
                }
                break;
            case 19:
                zig zigVar = (zig) obj2;
                zigVar.f();
                if (view.getId() != 2131362790) {
                    if (view.getId() == 2131362789) {
                        zigVar.s.start();
                        break;
                    }
                } else {
                    zigVar.r.start();
                    break;
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((xtg) obj2).G0();
                break;
            case 21:
                tah tahVar = ((cvg) obj2).t;
                tahVar.L(2);
                ((c0i) tahVar.g).a();
                break;
            case SizeUtil.textSize1 /* 22 */:
                tn tnVar = (tn) obj2;
                amk amkVarA = ((SubscriptionPlanList) ((or2) tnVar.b).e).a();
                if (amkVarA != null) {
                    tah tahVar2 = (tah) ((r9g) tnVar.d).b;
                    ((dpf) ((xb) tahVar2.e).e.g()).a(new ivg(tahVar2, amkVarA));
                    break;
                }
                break;
            case 23:
                ((tzg) obj2).dismiss();
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((ljh) obj2).h0();
                break;
            case 25:
                ((ljh) obj2).h0();
                break;
            case 26:
                ((pg5) obj2).b();
                break;
            case 27:
                ((pg5) obj2).b();
                break;
            case 28:
                ((lmh) obj2).c.invoke();
                break;
            default:
                g25.b(view.getContext(), 0, 2132018552, 2132020155, new sk((knh) obj2, (byte) 10));
                break;
        }
    }
}
