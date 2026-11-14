package defpackage;

import android.content.Context;
import android.net.Uri;
import com.leanplum.ActionContext;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.messagetemplates.OperaSheet;
import com.leanplum.messagetemplates.ResourceWrapper;
import com.opera.android.BrowserActivity;
import com.opera.api.Callback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class ay1 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ay1(Context context, Comparable comparable, String str, Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = context;
        this.d = comparable;
        this.b = str;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ ay1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
        this.f = obj5;
    }

    public /* synthetic */ ay1(String str, String str2, String str3, shf shfVar, Callback callback, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = shfVar;
        this.f = callback;
    }

    public /* synthetic */ ay1(myk mykVar, String str, ji2 ji2Var, ji2 ji2Var2, mgh mghVar) {
        this.a = (byte) 7;
        this.c = mykVar;
        this.b = str;
        this.d = ji2Var;
        this.e = ji2Var2;
        this.f = mghVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                Callback callback = (Callback) obj6;
                iy1 iy1Var = (iy1) obj4;
                File file = (File) obj3;
                String str = (String) obj5;
                ux1 ux1Var = (ux1) obj2;
                int iOrdinal = ((m32) obj).ordinal();
                if (iOrdinal == 0) {
                    callback.run(dy1.a);
                    break;
                } else if (iOrdinal != 1) {
                    h9o.p();
                    break;
                } else {
                    new rml(Unit.a, iy1Var.a).b(new wx1(file, (byte) 2)).t(new z3(new qn(iy1Var, str, file, ux1Var, (byte) 2), (byte) 24)).l();
                    break;
                }
            case 1:
                List listSingletonList = Collections.singletonList(new y92((z92) obj, (Uri) obj4, (String) obj5, (String) obj3));
                int i = BrowserActivity.E1;
                ((BrowserActivity) obj6).i1(listSingletonList, (x92) obj2);
                break;
            case 2:
                OperaSheet.lambda$initializeSheetRequest$3((Context) obj6, (ActionContext) obj4, (String) obj5, (orm) obj3, (skm) obj2, (ResourceWrapper) obj);
                break;
            case 3:
                Context context = (Context) obj4;
                tta ttaVar = (tta) obj3;
                pde pdeVar = (pde) obj5;
                tt2 tt2Var = (tt2) obj2;
                List list = (List) obj;
                int size = list.size();
                int i2 = ((f8f) ((mdh) obj6).f.getValue()).c() ? 3 : 2;
                int iIntValue = ((Number) pdeVar.g()).intValue();
                int iWidth = r9n.i(context).width();
                sta staVar = ttaVar.h;
                int i3 = staVar.a;
                int i4 = iWidth - (iIntValue << 1);
                int i5 = ttaVar.c;
                int i6 = i5;
                int i7 = 1;
                while (i7 < 16 && i6 + i3 + i5 <= i4) {
                    i6 += i3 + i5;
                    i7++;
                }
                if (i7 > 1) {
                    djh.c((i4 - (i5 * i7)) / (i7 - 1), i3, staVar.b);
                }
                ydh ydhVar = new ydh(i2, i7, new ghf((Object) new kw3((byte) 23), (Object) new kw3((byte) 24), (Object) new kw3((byte) 25), (byte) 8));
                ydhVar.E(list);
                ArrayList arrayList = ydhVar.e;
                int size2 = arrayList.size();
                int i8 = 0;
                int i9 = 0;
                while (i9 < size2) {
                    Object obj7 = arrayList.get(i9);
                    i9++;
                    if (!((hq8) obj7).j()) {
                        i8++;
                    }
                }
                tt2Var.run(new b0k(size, 0, 0, i8, 0));
                break;
            case 4:
                String str2 = (String) obj5;
                String str3 = (String) obj6;
                String str4 = (String) obj4;
                shf shfVar = (shf) obj3;
                bha bhaVar = (bha) obj2;
                fvh fvhVar = new fvh();
                String string = ((Uri) obj).toString();
                rma rmaVar = new rma((byte) 4);
                rmaVar.o(string, null);
                hra hraVarI = rmaVar.d().i("/api/v1/free_trial/ofa/transfer/");
                if (hraVarI == null) {
                    qp2.o("Required value was null.");
                    break;
                } else {
                    fvhVar.a = hraVarI;
                    fvhVar.d("Authorization", "Bearer ".concat(str2));
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("device_id", orb.t(str3));
                        try {
                            jSONObject.put("subscription_id", orb.t(str4));
                            try {
                                jSONObject.put("package_name", orb.t("com.opera.browser.beta"));
                                qvh qvhVar = rvh.Companion;
                                String string2 = jSONObject.toString();
                                Regex regex = esd.e;
                                esd esdVarX = wyh.x("application/json");
                                qvhVar.getClass();
                                fvhVar.e(RequestBuilder.POST, qvh.b(string2, esdVarX));
                                ((t9f) ((ii) shfVar.c).get()).c(new kvh(fvhVar)).enqueue(new yhe(new b94((umi) shfVar.b, bhaVar, (byte) 0), (byte) 27));
                                break;
                            } catch (JSONException e) {
                                t3p.n(e);
                                return;
                            }
                        } catch (JSONException e2) {
                            t3p.n(e2);
                            return;
                        }
                    } catch (JSONException e3) {
                        t3p.n(e3);
                        return;
                    }
                }
            case 5:
                String str5 = (String) obj5;
                String str6 = (String) obj6;
                String str7 = (String) obj4;
                shf shfVar2 = (shf) obj3;
                ny9 ny9Var = (ny9) obj2;
                fvh fvhVar2 = new fvh();
                String string3 = ((Uri) obj).toString();
                rma rmaVar2 = new rma((byte) 4);
                rmaVar2.o(string3, null);
                hra hraVarI2 = rmaVar2.d().i("api/v1/free_trial/ofa/start/premium_beta/");
                if (hraVarI2 == null) {
                    qp2.o("Required value was null.");
                    break;
                } else {
                    fvhVar2.a = hraVarI2;
                    orb orbVarJ = o18.j("device_id", str5, "campaign", str6);
                    orbVarJ.p(str7, "token");
                    orbVarJ.p("com.opera.browser.beta", "package_name");
                    qvh qvhVar2 = rvh.Companion;
                    String string4 = orbVarJ.a.toString();
                    Regex regex2 = esd.e;
                    esd esdVarX2 = wyh.x("application/json");
                    qvhVar2.getClass();
                    fvhVar2.e(RequestBuilder.POST, qvh.b(string4, esdVarX2));
                    ((t9f) ((ii) shfVar2.c).get()).c(new kvh(fvhVar2)).enqueue(new isd(new b94((umi) shfVar2.b, ny9Var, (byte) 0), (byte) 28));
                    break;
                }
            case 6:
                String str8 = (String) obj5;
                String str9 = (String) obj6;
                String str10 = (String) obj4;
                shf shfVar3 = (shf) obj3;
                my9 my9Var = (my9) obj2;
                fvh fvhVar3 = new fvh();
                hra hraVarI3 = w8h.l((Uri) obj).i("api/v1/free_trial/ofa/user/check_eligibility/premium_beta/");
                if (hraVarI3 == null) {
                    qp2.o("Required value was null.");
                    break;
                } else {
                    fvhVar3.a = hraVarI3;
                    fvhVar3.d("Authorization", "Bearer ".concat(str8));
                    fvhVar3.e(RequestBuilder.POST, w8h.i(str9, str10));
                    ((t9f) ((ii) shfVar3.c).get()).c(new kvh(fvhVar3)).enqueue(new p8f((byte) 22, (Object) new b94((umi) shfVar3.b, my9Var, (byte) 0), (Object) str10, str9));
                    break;
                }
            default:
                myk mykVar = (myk) obj6;
                String str11 = (String) obj5;
                ji2 ji2Var = (ji2) obj4;
                ji2 ji2Var2 = (ji2) obj3;
                mgh mghVar = (mgh) obj2;
                String str12 = (String) obj;
                mykVar.c(str11);
                lyk lykVar = mykVar.i;
                if (lykVar != null) {
                    lykVar.cancel();
                }
                lyk lykVar2 = new lyk(mykVar, new jri(ji2Var, str12, (byte) 21), ji2Var2, null);
                mykVar.i = lykVar2;
                mghVar.b = lykVar2;
                mykVar.b.i(str12, null, null, str11, null);
                break;
        }
    }
}
