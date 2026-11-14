package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.Checkable;
import androidx.recyclerview.widget.i;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.autofill.AutofillManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class gf implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gf(f73 f73Var, fdn fdnVar) {
        this.a = (byte) 19;
        this.b = f73Var;
    }

    public /* synthetic */ gf(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException, Resources.NotFoundException {
        List list;
        w10 w10Var;
        aoo aooVar;
        vsn vsnVarG;
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 4;
        st[] stVarArr = null;
        stVarArr = null;
        byte b4 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                hf hfVar = (hf) obj;
                if (!hfVar.f) {
                    hfVar.f = true;
                    hfVar.e.invoke();
                    break;
                }
                break;
            case 1:
                hqk hqkVar = (hqk) ((eqk) obj).e.b;
                hqkVar.c.b(new rl((byte) 4));
                Iterator it = hqkVar.y.iterator();
                while (it.hasNext()) {
                    gqk gqkVar = (gqk) it.next();
                    if ((gqkVar instanceof fqk) && ((fqk) gqkVar).c.a == 11) {
                        it.remove();
                    } else if ((gqkVar instanceof eqk) && ((eqk) gqkVar).c.a == 29) {
                        it.remove();
                    }
                }
                hqkVar.notifyDataSetChanged();
                x5f x5fVar = hqkVar.f;
                if (x5fVar.h) {
                    x5fVar.o(13);
                    break;
                }
                break;
            case 2:
                ((qf) obj).b();
                break;
            case 3:
                ws wsVar = (ws) obj;
                ts tsVar = wsVar.d;
                if (tsVar != null) {
                    ct ctVar = wsVar.c.a;
                    ju juVarG0 = ctVar.G0();
                    juVarG0.getClass();
                    kq8 kq8Var = tsVar.a;
                    HashSet hashSet = juVarG0.o;
                    if (!hashSet.contains(kq8Var)) {
                        hashSet.add(kq8Var);
                        orm ormVar = (orm) juVarG0.e.b;
                        String strW = tw2.w(kq8Var);
                        x5f x5fVar2 = (x5f) ormVar;
                        if (x5fVar2.h) {
                            x5fVar2.j(0, strW, true);
                        }
                    }
                    qb7 qb7Var = juVarG0.c;
                    LinkedHashMap linkedHashMap = juVarG0.j;
                    if (linkedHashMap != null && (list = (List) linkedHashMap.get(tsVar)) != null) {
                        stVarArr = (st[]) list.toArray(new st[0]);
                    }
                    ctVar.r.E(new qs(tsVar, qb7Var.E(stVarArr)), new pb(new bt(ctVar, b4), b2));
                    break;
                }
                break;
            case 4:
                ot otVar = ((ct) obj).G0().d;
                MenuItem menuItem = (MenuItem) otVar.h;
                if (menuItem != null && !otVar.e() && !menuItem.isActionViewExpanded()) {
                    menuItem.expandActionView();
                    break;
                }
                break;
            case 5:
                au auVar = (au) obj;
                is isVar = auVar.e;
                if (isVar != null) {
                    auVar.d.r(isVar);
                    break;
                }
                break;
            case 6:
                cu cuVar = (cu) obj;
                is isVar2 = cuVar.e;
                if (isVar2 != null) {
                    cuVar.d.r(isVar2);
                    break;
                }
                break;
            case 7:
                du duVar = (du) obj;
                hs hsVar = duVar.e;
                if (hsVar != null) {
                    duVar.d.x(hsVar);
                    break;
                }
                break;
            case 8:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) obj;
                if (materialAutoCompleteTextView.hasFocus() && !materialAutoCompleteTextView.isPopupShowing()) {
                    materialAutoCompleteTextView.showDropDown();
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((uw) obj).I0().d.b.e(new jp2(), false);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                g10 g10Var = (g10) obj;
                x10 x10VarE0 = g10Var.e0();
                if (x10VarE0 != null && (w10Var = (w10) x10VarE0.d) != null) {
                    w00 w00Var = g10Var.G;
                    cie cieVar = w10Var.u;
                    w00Var.m = true;
                    cs5.q0(cieVar, 3);
                    jsd jsdVar = cieVar.P;
                    if (jsdVar != null && (aooVar = cieVar.w0) != null) {
                        aooVar.j(jsdVar);
                    }
                    w00Var.m = false;
                    break;
                }
                break;
            case 11:
                d10 d10Var = (d10) obj;
                SparseArray sparseArray = d10Var.I;
                c10 c10Var = (c10) sparseArray.get(view.getId());
                if (c10Var != null) {
                    lgh lghVar = (lgh) d10Var.H.get(d10Var.K);
                    boolean zV0 = d10Var.v0();
                    if (lghVar.a == 1) {
                        for (int i = 0; i < sparseArray.size(); i++) {
                            c10 c10Var2 = (c10) sparseArray.valueAt(i);
                            c10Var2.a(true, c10Var2 == c10Var, !zV0);
                        }
                    } else {
                        c10Var.a(true, ((Checkable) c10Var.c).isChecked(), !zV0);
                    }
                    d10Var.Z().n();
                    cs5.q0(d10Var.f0().u, 8);
                    d10Var.x.setEnabled(!d10Var.t0().isEmpty());
                    if (zV0) {
                        d10Var.x0(lghVar, d10Var.K, Collections.singletonList(c10Var), true);
                        break;
                    }
                }
                break;
            case 12:
                ((qt3) ((qt) obj).d).run();
                break;
            case 13:
                r22 r22Var = ((t42) obj).n;
                if (r22Var != null && (vsnVarG = r22Var.g()) != null) {
                    vsnVarG.h.run();
                    break;
                }
                break;
            case 14:
                mq2 mq2Var = (mq2) obj;
                if (!mq2Var.j.a()) {
                    j14.a0(mq2Var.f, mq2Var.c, mq2Var.g);
                    break;
                }
                break;
            case 15:
                pq2 pq2Var = (pq2) ((i) obj);
                ru2 ru2Var = pq2Var.f;
                if (ru2Var != null) {
                    pq2Var.d.l(ru2Var);
                    break;
                }
                break;
            case 16:
                pq2 pq2Var2 = (pq2) obj;
                ru2 ru2Var2 = pq2Var2.f;
                if (ru2Var2 != null) {
                    pq2Var2.d.l(ru2Var2);
                    break;
                }
                break;
            case 17:
                wr2 wr2Var = (wr2) ((bv1) obj).e;
                Context context = wr2Var.getContext();
                orm ormVar2 = wr2Var.v;
                AutofillManager autofillManager = wr2Var.s;
                np2 np2Var = new np2(ormVar2);
                np2Var.x = null;
                np2Var.w = autofillManager;
                np2Var.isVisible();
                np2Var.isVisible();
                zhj.a(np2Var, 4099).c(context);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                eu2 eu2Var = (eu2) obj;
                eu2Var.w.E(new ku(), new ug(new du2(eu2Var, b4), (byte) 8));
                break;
            case 19:
                tah tahVar = ((f73) obj).e;
                Context context2 = view.getContext();
                if (((ydn) tahVar.d).p().e) {
                    y1n y1nVar = (y1n) tahVar.f;
                    if (y1nVar != null) {
                        y1nVar.run();
                    }
                    if (((Boolean) ((ktg) ((Lazy) tahVar.b).get()).b.g()).booleanValue()) {
                        gtj.e((View) tahVar.g, context2.getString(2132022255), 5000).j();
                        break;
                    } else {
                        int iOrdinal = ((uvg) ((gmk) tahVar.i).a.g()).ordinal();
                        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                            if (iOrdinal == 4) {
                                new zhj(new wzg(stVarArr, i8d.class, b3), null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(context2);
                                break;
                            } else if (iOrdinal != 5) {
                            }
                        }
                        ((yug) tahVar.h).a(1);
                        break;
                    }
                }
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((v48) obj).dismiss();
                break;
            case 21:
                m93 m93Var = (m93) obj;
                zhj.a(new f9c(new va2(m93Var, (byte) 14)), 4099).c(m93Var.getContext());
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((zl3) obj).invoke(view);
                break;
            case 23:
                ((zl3) obj).invoke(view);
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((pm3) ((am3) obj).k).a(new int[0]);
                break;
            case 25:
                ((pm3) ((gn3) obj).e).a(new int[0]);
                break;
            case 26:
                wo3 wo3Var = (wo3) obj;
                z77 z77Var = wo3Var.v;
                ol5 ol5Var = new ol5(2132020917, 2132020916, new va2(wo3Var, (byte) 21));
                z77Var.getClass();
                z77Var.b(ol5Var, ijm.b);
                break;
            case 27:
                tah tahVar2 = (tah) obj;
                xj xjVar = (xj) tahVar2.g;
                View view2 = (View) xjVar.b;
                BrowserActivity browserActivity = (BrowserActivity) xjVar.c;
                int i2 = BrowserActivity.E1;
                if (view2.isAttachedToWindow()) {
                    k6l k6lVar = browserActivity.V;
                    if ((k6lVar != null ? k6lVar : null).o == null) {
                        ks3.B("BottomNavigationBar action without active tab", String.format(Locale.ROOT, "Pending session restore: %b. Activity state: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(browserActivity.g1.g != null), browserActivity.getLifecycle().i}, 2)));
                        break;
                    } else {
                        bq3 bq3Var = (bq3) tahVar2.f;
                        bq3Var.getClass();
                        new xp3(bq3Var, (byte) 0);
                        break;
                    }
                } else {
                    ks3.B("BottomNavigationBar action while detached", null);
                    break;
                }
            case 28:
                int i3 = BrowserActivity.E1;
                ((BrowserActivity) obj).S().d(false);
                break;
            default:
                ((pjg) obj).run();
                break;
        }
    }
}
