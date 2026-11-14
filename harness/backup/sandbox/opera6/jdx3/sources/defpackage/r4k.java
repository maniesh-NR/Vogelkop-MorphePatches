package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class r4k implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ r4k(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) throws Exception {
        wsk wskVarH;
        Object vpbVar = null;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((SettingsManager) obj).i("enable_search_shortcuts"));
            case 1:
                return ((f8k) obj).f;
            case 2:
                return Boolean.valueOf(((avl) obj).e != 2);
            case 3:
                return Boolean.valueOf(((t8k) obj).g);
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 5:
                v65 v65Var = (v65) obj;
                int i = v65Var == null ? -1 : pck.a[v65Var.ordinal()];
                if (i == -1) {
                    return null;
                }
                if (i == 1) {
                    return kl0.g;
                }
                if (i == 2) {
                    return kl0.i;
                }
                h9o.p();
                return null;
            case 6:
                String str = (String) obj;
                return StringsKt.N(str) ? str.length() < 4 ? "    " : str : "    ".concat(str);
            case 7:
                ajk ajkVar = (ajk) obj;
                return sko.v(ajkVar.b, " ", ajkVar.a);
            case 8:
                return Boolean.valueOf(((ulk) obj).b.before(new Date()));
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                pzh pzhVar = (pzh) obj;
                try {
                    if (pzhVar.q) {
                        try {
                            vpbVar = new vpb(new JSONObject(pzhVar.g.string()).getJSONArray("countries"));
                        } catch (JSONException unused) {
                        }
                    }
                    pzhVar.close();
                    return vpbVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vtp.v(pzhVar, th);
                        throw th2;
                    }
                }
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return null;
            case 11:
                wskVarH = ((osk) obj).h("SELECT * FROM domain_data");
                try {
                    int iF = hyg.f(wskVarH, "domain");
                    int iF2 = hyg.f(wskVarH, "rating");
                    int iF3 = hyg.f(wskVarH, "last_updated");
                    ArrayList arrayList = new ArrayList();
                    while (wskVarH.n()) {
                        arrayList.add(new hd7(wskVarH.l(iF), (int) wskVarH.getLong(iF2), wskVarH.getLong(iF3)));
                    }
                    return arrayList;
                } finally {
                }
            case 12:
                wskVarH = ((osk) obj).h("SELECT * FROM partner_tree LIMIT 1");
                try {
                    int iF4 = hyg.f(wskVarH, "received");
                    int iF5 = hyg.f(wskVarH, "keep_until");
                    int iF6 = hyg.f(wskVarH, "tree");
                    if (wskVarH.n()) {
                        vpbVar = new c3g(wskVarH.getLong(iF4), wskVarH.getBlob(iF6), wskVarH.getLong(iF5));
                    }
                    return vpbVar;
                } finally {
                }
            case 13:
                wskVarH = ((osk) obj).h("SELECT * FROM partner_data");
                try {
                    int iF7 = hyg.f(wskVarH, "id");
                    int iF8 = hyg.f(wskVarH, ImagesContract.URL);
                    int iF9 = hyg.f(wskVarH, "final_domain");
                    int iF10 = hyg.f(wskVarH, "title");
                    int iF11 = hyg.f(wskVarH, "score");
                    int iF12 = hyg.f(wskVarH, Constants.Keys.PUSH_MESSAGE_ICON_URL);
                    int iF13 = hyg.f(wskVarH, "received");
                    int iF14 = hyg.f(wskVarH, "keep_until");
                    int iF15 = hyg.f(wskVarH, "global_score");
                    int iF16 = hyg.f(wskVarH, "autocomplete_chars");
                    int iF17 = hyg.f(wskVarH, "recommend_chars");
                    ArrayList arrayList2 = new ArrayList();
                    while (wskVarH.n()) {
                        int i2 = iF14;
                        int i3 = iF13;
                        arrayList2.add(new l2g((int) wskVarH.getLong(iF7), wskVarH.l(iF8), wskVarH.l(iF9), wskVarH.l(iF10), wskVarH.getDouble(iF11), wskVarH.l(iF12), wskVarH.getLong(iF13), wskVarH.getLong(iF14), wskVarH.getDouble(iF15), (int) wskVarH.getLong(iF16), (int) wskVarH.getLong(iF17)));
                        iF13 = i3;
                        iF14 = i2;
                    }
                    return arrayList2;
                } finally {
                }
            case 14:
                try {
                    ((osk) obj).h("DELETE FROM partner_tree").n();
                    return null;
                } finally {
                }
            case 15:
                try {
                    ((osk) obj).h("DELETE FROM partner_data").n();
                    return null;
                } finally {
                }
            case 16:
                wskVarH = ((osk) obj).h("SELECT * FROM provider_info");
                try {
                    int iF18 = hyg.f(wskVarH, Constants.Params.TYPE);
                    int iF19 = hyg.f(wskVarH, "score");
                    ArrayList arrayList3 = new ArrayList();
                    while (wskVarH.n()) {
                        arrayList3.add(new r7h((int) wskVarH.getLong(iF18), wskVarH.getDouble(iF19)));
                    }
                    return arrayList3;
                } finally {
                }
            case 17:
                wskVarH = ((osk) obj).h("SELECT * FROM metadata");
                try {
                    int iF20 = hyg.f(wskVarH, "urlHash");
                    int iF21 = hyg.f(wskVarH, Constants.Params.TYPE);
                    int iF22 = hyg.f(wskVarH, "impressions");
                    int iF23 = hyg.f(wskVarH, "clicks");
                    int iF24 = hyg.f(wskVarH, "previous_impression_time");
                    int iF25 = hyg.f(wskVarH, "blacklisted");
                    ArrayList arrayList4 = new ArrayList();
                    while (wskVarH.n()) {
                        arrayList4.add(new nxd(wskVarH.l(iF20), (int) wskVarH.getLong(iF21), wskVarH.getLong(iF22), wskVarH.getLong(iF23), wskVarH.getLong(iF24), ((int) wskVarH.getLong(iF25)) != 0));
                    }
                    return arrayList4;
                } finally {
                }
            case SizeUtil.textSize0_1 /* 18 */:
                try {
                    ((osk) obj).h("DELETE FROM domain_data").n();
                    return null;
                } finally {
                }
            case 19:
                return new lpk(nb6.J(sfe.Q((List) obj, new o00((byte) 11))));
            case SizeUtil.textSize0 /* 20 */:
                return new lpk(nb6.J(sfe.p0((List) obj, 10)));
            case 21:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case SizeUtil.textSize1 /* 22 */:
                hbn hbnVar = (hbn) obj;
                if (hbnVar != null && hbnVar.a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                return Boolean.valueOf(((fyj) obj).d);
            case SizeUtil.textSize2 /* 24 */:
                return ((xsk) obj).a;
            case 25:
                return ((xsk) obj).a;
            case 26:
                xtb[] xtbVarArr = o0j.a;
                p0j p0jVar = n0j.m;
                xtb xtbVar = o0j.a[5];
                Boolean bool = Boolean.TRUE;
                p0jVar.getClass();
                ((q0j) obj).b(p0jVar, bool);
                return Unit.a;
            case 27:
                return Unit.a;
            case 28:
                ((nuk) ((Pair) obj).b).a();
                return Unit.a;
            default:
                return Float.valueOf(1.0f);
        }
    }
}
