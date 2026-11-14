package defpackage;

import J.N;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import com.leanplum.messagetemplates.OperaSheetRequest;
import com.leanplum.messagetemplates.UtilsKt;
import com.opera.android.account.auth.TwoFactorAuthenticationActivity;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class iyk implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iyk(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        ewg ewgVarH;
        byte b = this.a;
        Object[] objArr = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                fi2 fi2Var = (fi2) obj3;
                ab abVar = (ab) obj2;
                q43 q43Var = (q43) obj;
                int i = q43Var.a;
                String str = q43Var.b;
                if (i == 412) {
                    try {
                        fi2Var.run(new orb(str));
                        break;
                    } catch (JSONException unused) {
                    }
                }
                abVar.run(str);
                break;
            case 1:
                plk plkVar = (plk) obj3;
                plkVar.getClass();
                ArrayList arrayList = new ArrayList(((g4m) obj).b);
                if (arrayList.removeAll((ArrayList) obj2)) {
                    plkVar.s(arrayList);
                    break;
                }
                break;
            case 2:
                plk plkVar2 = (plk) obj3;
                szb szbVar = (szb) obj2;
                plkVar2.getClass();
                ArrayList arrayList2 = new ArrayList(((g4m) obj).a);
                Iterator it = arrayList2.iterator();
                it.getClass();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((j0c) next).a.equals(szbVar.toString())) {
                            ewgVarH = orf.h(next);
                        }
                    } else {
                        ewgVarH = h3.a;
                    }
                }
                j0c j0cVar = (j0c) ewgVarH.j();
                if (j0cVar != null) {
                    arrayList2.remove(j0cVar);
                    xl xlVar = (xl) plkVar2.b;
                    ((nrl) xlVar.l).d(new h4m((Object) xlVar, (Object) arrayList2, (Object) new d4m(plkVar2, (byte) 3), (byte) (objArr == true ? 1 : 0)));
                    break;
                }
                break;
            case 3:
                fp1 fp1Var = (TwoFactorAuthenticationActivity) obj3;
                Callback callback = (Callback) obj2;
                orb orbVar = (orb) obj;
                int i2 = TwoFactorAuthenticationActivity.T;
                if (orbVar != null) {
                    callback.run(orbVar.a.toString());
                    break;
                } else {
                    callback.run(null);
                    fp1Var.finish();
                    break;
                }
            case 4:
                Callback callback2 = (Callback) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Context context = (Context) ((d7h) obj3).b;
                if (bitmap == null) {
                    callback2.run(sgb.F(2131231847, context));
                    break;
                } else {
                    callback2.run(new BitmapDrawable(context.getResources(), bitmap));
                    break;
                }
            case 5:
                ((bz0) ((jl4) obj3).b).dismiss();
                ((su) obj2).run((tw7) obj);
                break;
            case 6:
                UtilsKt.performStringSubstitution$lambda$0((Callback) obj3, (OperaSheetRequest.Model) obj2, (ex1) obj);
                break;
            case 7:
                ydn ydnVar = (ydn) obj3;
                ydnVar.I(new vdn(ydnVar.p().a, ydnVar.c.isEnabled() ? false : ((vdn) obj2).b(), (efn) obj, null));
                break;
            case 8:
                bg7 bg7Var = (bg7) obj3;
                ((x5f) bg7Var.d).L(7, wb0.e, null);
                bg7Var.finish(hjm.a);
                wzg wzgVar = new wzg(null, i8d.class, (byte) 4);
                cg5 cg5Var = cg5.a;
                Bundle bundle = new Bundle();
                bundle.putInt("compose_highlight_target_key", 1);
                bundle.putString("compose_highlight_scroll_behavior", "AlignTopIfNotVisible");
                new zhj(wzgVar, bundle, 2, 4099, null, false, Arrays.asList(new n6h[0])).c((Context) obj2);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                w7j w7jVar = (w7j) obj3;
                sdn sdnVar = (sdn) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    w7jVar.n(sdnVar);
                    break;
                } else {
                    sdnVar.run(Boolean.valueOf(yi4.y((sz4) w7jVar.b)));
                    break;
                }
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                d7k d7kVar = (d7k) obj3;
                ojn ojnVar = (ojn) obj2;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    vj2 vj2Var = (vj2) ojnVar.d.getValue();
                    vj2Var.c(new qn(vj2Var, ojnVar, list, d7kVar, (byte) 26), new y1n((Object) d7kVar, (byte) 19));
                    break;
                } else {
                    d7kVar.invoke(ljn.c);
                    break;
                }
            case 11:
                ((qmn) obj).a(new n9h((byte) 12, (qsh) obj3, (Callback) obj2, false));
                break;
            case 12:
                pkn pknVar = (pkn) obj3;
                wln wlnVar = (wln) obj2;
                List list2 = (List) obj;
                qkn qknVar = pknVar.f;
                if (!qknVar.o && list2 != null && !list2.isEmpty()) {
                    if (list2.size() != 1) {
                        ContentResolver contentResolver = qknVar.f.getContext().getContentResolver();
                        ami amiVar = pknVar.c.f;
                        ilm ilmVar = new ilm(pknVar, (byte) 9);
                        s14 s14Var = (s14) amiVar.d;
                        ((umi) s14Var.d).e(new ws1(s14Var, list2, ilmVar, contentResolver, (byte) 19)).a(null);
                        break;
                    } else {
                        qknVar.a.e(new dmn(wlnVar, new cmn(null, ((Uri) list2.get(0)).toString(), 0, 5, true)), false);
                        break;
                    }
                }
                break;
            case 13:
                qln qlnVar = (qln) obj3;
                qjn qjnVar = (qjn) obj2;
                aln alnVar = (aln) obj;
                if (alnVar != null) {
                    Context context2 = qlnVar.a;
                    rgh rghVar = qlnVar.m;
                    String str2 = alnVar.c(context2, new o2c(false, (((Resources) rghVar.b).getDisplayMetrics().widthPixels * 90) / 100, ((((Resources) rghVar.b).getDisplayMetrics().heightPixels - ((Context) rghVar.a).getResources().getDimensionPixelSize(2131165344)) * 90) / 100, false)).c;
                    if (str2 != null && !str2.equals(qjnVar.a.c)) {
                        agm agmVar = qlnVar.g;
                        umi umiVar = qlnVar.b;
                        agmVar.getClass();
                        String[] strArr = wqm.a;
                        if (N.Mhbidx2d(str2) == 3) {
                            umiVar.g(new jp5(agmVar, str2, (byte) 10)).a(null);
                            break;
                        }
                    }
                }
                break;
            case 14:
                qln qlnVar2 = (qln) obj3;
                Callback callback3 = (Callback) obj2;
                aln alnVar2 = (aln) obj;
                if (alnVar2 == null) {
                    callback3.run(new zmn((byte) 0));
                    break;
                } else {
                    rgh rghVar2 = qlnVar2.m;
                    o2c o2cVar = new o2c(false, (((Resources) rghVar2.b).getDisplayMetrics().widthPixels * 90) / 100, ((((Resources) rghVar2.b).getDisplayMetrics().heightPixels - ((Context) rghVar2.a).getResources().getDimensionPixelSize(2131165344)) * 90) / 100, false);
                    new qjn(qlnVar2.g, alnVar2.c(qlnVar2.a, o2cVar), callback3, o2cVar);
                    break;
                }
            default:
                ((wx) obj3).run(new tun(((d7l) ((b2l) obj2)).l0(), (List) obj));
                break;
        }
    }
}
