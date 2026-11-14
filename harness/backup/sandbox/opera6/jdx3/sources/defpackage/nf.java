package defpackage;

import J.N;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.CreditCard;
import com.opera.android.bookmarks.ImportBookmarksBanner;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final /* synthetic */ class nf implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v21, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r1v48, types: [lj2, wh2] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 26;
        byte b3 = 2;
        ijm ijmVar = ijm.b;
        byte b4 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                qf qfVar = (qf) obj2;
                Context context = (Context) obj;
                if (((yu2) qfVar.d).b()) {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.REQUEST_SET_AUTOFILL_SERVICE");
                    intent.setData(Uri.parse("package:" + context.getPackageName()));
                    try {
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                qfVar.b();
                break;
            case 1:
                pk pkVarH0 = ((lk) obj2).H0();
                Uri uri = ((ak) obj).Z;
                pkVarH0.getClass();
                a8j a8jVar = a8j.a;
                vx3 vx3VarA = ay3.a(uri.toString(), lqm.E, false);
                vx3VarA.b = 3;
                vx3VarA.a(true);
                vx3VarA.f = true;
                a8jVar.invoke(new ay3(vx3VarA));
                break;
            case 2:
                wk wkVar = (wk) obj2;
                b = ((BigSwitchButton) obj).c == 3 ? (byte) 0 : (byte) 1;
                if (!wkVar.D) {
                    if (b != 0) {
                        xf8.s0(wkVar.getContext(), new gpk(b2), 2132017291, 2132017290);
                        break;
                    }
                } else {
                    wkVar.u.V(b, "ad_blocking");
                    break;
                }
                break;
            case 3:
                dp dpVar = (dp) obj2;
                xz xzVar = (xz) obj;
                mq mqVar = dpVar.c;
                yz yzVar = mqVar.d;
                if (yzVar != null) {
                    mqVar.g.v(xzVar, yzVar, mqVar.c);
                    xzVar.c();
                    kq kqVar = mqVar.l;
                    if (kqVar != null) {
                        kqVar.r(mqVar);
                    }
                }
                dpVar.b();
                break;
            case 4:
                mv mvVar = (mv) obj2;
                bz0 bz0Var = (bz0) obj;
                EditText editText = (EditText) bz0Var.findViewById(2131362658);
                if (editText != null) {
                    Context context2 = bz0Var.getContext();
                    String[] strArr = OperaApplication.K;
                    x5f x5fVar = ((OperaApplication) context2.getApplicationContext()).L().c;
                    if (x5fVar.h) {
                        x56 x56VarF = zpa.F();
                        x56VarF.d(23, 1);
                        x5fVar.U0(x56VarF);
                    }
                    editText.setEnabled(false);
                    ?? r2 = (OperaMaterialButton) bz0Var.f(-1);
                    r2.setClickable(false);
                    r2.R(true);
                    bz0Var.setCancelable(false);
                    ((fv) mvVar.b).a(editText.getText().toString(), new jv(bz0Var, b4));
                    break;
                } else {
                    bz0Var.dismiss();
                    break;
                }
            case 5:
                cx cxVarI0 = ((uw) ((wth) ((yw) obj2).e).b).I0();
                cxVarI0.d.c((Address) obj, new ax(cxVarI0, b4));
                break;
            case 6:
                new xw((Object) ((ww) obj2).c, (Address) obj, b4).p(view);
                break;
            case 7:
                ((View.OnClickListener) obj2).onClick(view);
                ((pa) ((qb7) obj).c).invoke();
                break;
            case 8:
                kr2 kr2Var = new kr2(view, new lr2((byte) 0), new w5f(b));
                ((View) obj2).postDelayed(new q02(kr2Var, b2), 4000L);
                kr2Var.j(((mr2) obj).k);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ole oleVar = (ole) obj;
                ru2 ru2Var = ((zs2) obj2).d;
                if (ru2Var != null) {
                    bt2 bt2Var = (bt2) oleVar.a;
                    if (!bt2Var.e.a()) {
                        i7f i7fVar = bt2Var.g;
                        g7f g7fVarC = u35.c(i7fVar, i7fVar);
                        while (g7fVarC.hasNext()) {
                            i7f i7fVar2 = ((ss2) g7fVarC.next()).a.d;
                            g7f g7fVarC2 = u35.c(i7fVar2, i7fVar2);
                            while (g7fVarC2.hasNext()) {
                                pu2 pu2Var = (pu2) g7fVarC2.next();
                                int i = ru2Var.a;
                                long j = pu2Var.a.a;
                                if (j != 0) {
                                    N.MzF9Ta1m(j, i);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                Dialog dialog = (Dialog) obj;
                ((rkj) obj2).invoke();
                if (Boolean.TRUE.booleanValue()) {
                    dialog.dismiss();
                    break;
                }
                break;
            case 11:
                Dialog dialog2 = (Dialog) obj;
                ((rkj) obj2).invoke();
                if (Boolean.TRUE.booleanValue()) {
                    dialog2.dismiss();
                    break;
                }
                break;
            case 12:
                ((f73) obj2).e.M((fdn) obj);
                break;
            case 13:
                ((View.OnClickListener) obj2).onClick(view);
                ((q73) obj).b();
                break;
            case 14:
                d83 d83Var = (d83) obj2;
                w3g w3gVar = (w3g) obj;
                wth wthVar = (wth) d83Var.d;
                if (wthVar != null) {
                    wthVar.b = null;
                    d83Var.d = null;
                }
                if (((a4g) d83Var.b) != null) {
                    jh3 jh3Var = (jh3) d83Var.f;
                    d83 d83Var2 = jh3Var.v;
                    wth wthVar2 = new wth((byte) 16);
                    wthVar2.b = d83Var2;
                    zhj.a(new q4g((a4g) d83Var2.b, w3gVar, jh3Var.u, jh3Var.t, wthVar2, jh3Var.x, jh3Var.y, jh3Var.A, jh3Var.B, jh3Var.H), 4099).c(jh3Var.getContext());
                    d83Var.d = wthVar2;
                    break;
                }
                break;
            case 15:
                y93 y93Var = (y93) obj;
                int bindingAdapterPosition = ((v93) obj2).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    y93Var.v.setCurrentItem(bindingAdapterPosition);
                    break;
                }
                break;
            case 16:
                ((ul3) obj2).b((pl3) obj);
                break;
            case 17:
                wl3 wl3Var = (wl3) obj;
                ((am3) obj2).m.j();
                pt1 pt1Var = wl3Var.a;
                ((ImportBookmarksBanner) pt1Var.f).setVisibility(8);
                wl3Var.b = true;
                ((AnimationEmptyListView) pt1Var.e).setVisibility(wl3Var.a(wl3Var.getResources().getConfiguration()) ? (byte) 0 : (byte) 8);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                gn3 gn3Var = (gn3) obj;
                gn3Var.s.K(((an3) obj2).i);
                gn3Var.b.j();
                break;
            case 19:
                ((jf) obj2).a.invoke(view, (ef) obj);
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((v3l) obj2).b.a.invoke(view, (ef) obj);
                break;
            case 21:
                ?? r12 = (BrowserActivity) obj;
                Integer num = ((n3l) obj2).c;
                if (num != null) {
                    String[] strArr2 = OperaApplication.K;
                    ((OperaApplication) r12.getApplication()).L().c.S(num.intValue());
                }
                int i2 = BrowserActivity.E1;
                k6l k6lVar = r12.V;
                r12.g1((k6lVar != null ? k6lVar : null).A().T());
                break;
            case SizeUtil.textSize1 /* 22 */:
                bv3 bv3Var = (bv3) obj2;
                bv3Var.c.a.c(new eof((Object) ((View) obj).getContext(), (Object) new iu2(bv3Var, (byte) 6), (byte) 13), bv3Var.d);
                break;
            case 23:
                oy3 oy3VarI0 = ((gy3) obj2).I0();
                rxh rxhVar = ((pab) ((uup) obj)).i;
                g8j g8jVar = oy3VarI0.d;
                r2 r2Var = new r2(1, oy3VarI0, oy3.class, "onResetLocationDialogClosed", "onResetLocationDialogClosed(Lcom/opera/android/view/SimpleDialogDestination$DialogResult;)V", 0, (byte) 15);
                g8jVar.getClass();
                pqh pqhVar = new pqh();
                pqhVar.a = pkj.c;
                z77 z77Var = ((qim) g8jVar.c.get()).c;
                fp1 fp1Var = g8jVar.a;
                qxh qxhVar = new qxh(phj.y(fp1Var.getString(2132019335, rxhVar.a(fp1Var.getResources()))));
                qu3 qu3Var = new qu3(pqhVar, b);
                qu3 qu3Var2 = new qu3(pqhVar, b3);
                mgf mgfVar = new mgf((Object) r2Var, (Object) pqhVar, (byte) 27);
                gkj gkjVar = new gkj(false, false);
                gkjVar.a = null;
                gkjVar.b = null;
                gkjVar.c = null;
                gkjVar.d = null;
                gkjVar.e = mgfVar;
                gkjVar.f = null;
                gkjVar.g = null;
                gkjVar.h = qu3Var;
                gkjVar.i = qu3Var2;
                gkjVar.j = null;
                gkjVar.k = 2132020916;
                gkjVar.l = 2132018111;
                gkjVar.m = 2132019338;
                gkjVar.n = true;
                gkjVar.o = qxhVar;
                z77Var.getClass();
                z77Var.b(gkjVar, ijmVar);
                break;
            case SizeUtil.textSize2 /* 24 */:
                dl4 dl4VarI0 = ((zk4) ((ole) ((yw) obj2).e).a).I0();
                ?? r1 = dl4VarI0.g;
                r1.b(r1.i, new fh4((CreditCard) obj, dl4VarI0, (byte) 2));
                break;
            case 25:
                ((yj5) obj2).onPositiveButtonClicked((bz0) obj);
                break;
            case 26:
                mom.b(((fk5) obj2).a, (gom) obj);
                break;
            case 27:
                new ghf((i4d) obj).I(((at5) obj2).b.getContext());
                break;
            case 28:
                wg5 wg5Var = (wg5) obj;
                int bindingAdapterPosition2 = ((xt5) obj2).getBindingAdapterPosition();
                k6l k6lVarValueOf = bindingAdapterPosition2 != -1 ? Integer.valueOf(bindingAdapterPosition2) : null;
                if (k6lVarValueOf != null) {
                    wg5Var.invoke(k6lVarValueOf);
                    break;
                }
                break;
            default:
                tim timVarL0 = nrf.l0("image_mode", ((OperaListItem) obj).A.D());
                z77 z77Var2 = ((tc6) obj2).y;
                z77Var2.getClass();
                z77Var2.b(timVarL0, ijmVar);
                break;
        }
    }
}
