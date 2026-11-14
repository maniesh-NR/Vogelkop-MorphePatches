package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.leanplum.ActionContext;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.messagetemplates.OperaSheet;
import com.leanplum.messagetemplates.OperaSubscriptionSheet;
import com.opera.android.BrowserActivity;
import com.opera.api.Callback;
import java.io.File;
import java.util.ArrayList;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class xx1 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xx1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ xx1(Object obj, Object obj2, String str, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = str;
        this.e = obj3;
    }

    public /* synthetic */ xx1(String str, String str2, shf shfVar, bha bhaVar) {
        this.a = (byte) 10;
        enk enkVar = enk.a;
        this.b = str;
        this.c = str2;
        this.d = shfVar;
        this.e = bhaVar;
    }

    public /* synthetic */ xx1(String str, String str2, shf shfVar, bha bhaVar, byte b) {
        this.a = (byte) 12;
        enk enkVar = enk.a;
        this.b = str;
        this.c = str2;
        this.d = shfVar;
        this.e = bhaVar;
    }

    public /* synthetic */ xx1(String str, String str2, shf shfVar, my9 my9Var) {
        this.a = (byte) 11;
        this.b = str;
        this.c = str2;
        this.d = shfVar;
        this.e = my9Var;
    }

    public /* synthetic */ xx1(s2g s2gVar, py9 py9Var, u3k u3kVar, String str) {
        this.a = (byte) 4;
        this.c = s2gVar;
        this.d = py9Var;
        this.e = u3kVar;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.Context, com.opera.android.BrowserActivity] */
    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        final byte b2 = 1;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                iy1 iy1Var = (iy1) obj5;
                String str = (String) obj4;
                File file = (File) obj3;
                ux1 ux1Var = (ux1) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    iy1Var.e(str, new v12(uri, file), ux1Var);
                    break;
                } else {
                    iy1Var.h.o(2132019200);
                    break;
                }
            case 1:
                ff3 ff3Var = (ff3) obj;
                ff3Var.s0(new l45((qb7) obj5, (String) obj4, (amk) obj3));
                ((Callback) obj2).run(ff3Var);
                break;
            case 2:
                ?? r2 = (BrowserActivity) obj5;
                r2.A0(new ay1((Context) r2, (Comparable) obj3, (String) obj4, obj, obj2, (byte) 1));
                break;
            case 3:
                Callback callback = (Callback) obj5;
                py9 py9Var = (py9) obj3;
                String str2 = (String) obj4;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                if (str4 != null) {
                    ((SharedPreferences) ((b59) py9Var.a.a).get()).edit().putLong("last_eligibility_check", System.currentTimeMillis()).apply();
                    shf shfVar = py9Var.b;
                    ((wth) shfVar.a).w(new ay1(str4, str2, str3, shfVar, (Callback) new my9(py9Var, str3, callback, (byte) 1), (byte) 6));
                    break;
                } else {
                    callback.run(jy9.a);
                    break;
                }
            case 4:
                final s2g s2gVar = (s2g) obj5;
                final py9 py9Var2 = (py9) obj3;
                final u3k u3kVar = (u3k) obj2;
                String str5 = (String) obj4;
                String str6 = (String) obj;
                if (str6 != null) {
                    shf shfVar2 = py9Var2.b;
                    u3kVar.getClass();
                    ((wth) shfVar2.a).w(new qe9(str6, u3kVar.a, u3kVar.b, str5, shfVar2, new Callback() { // from class: ny9
                        @Override // com.opera.api.Callback
                        public final void run(Object obj6) {
                            byte b3 = b2;
                            s2g s2gVar2 = s2gVar;
                            u3k u3kVar2 = u3kVar;
                            py9 py9Var3 = py9Var2;
                            z3k z3kVar = (z3k) obj6;
                            switch (b3) {
                                case 0:
                                    py9Var3.e(true, u3kVar2, z3kVar, s2gVar2);
                                    break;
                                default:
                                    py9Var3.e(false, u3kVar2, z3kVar, s2gVar2);
                                    break;
                            }
                        }
                    }, (byte) 5));
                    break;
                } else {
                    s2gVar.run(g4k.a);
                    break;
                }
            case 5:
                yi4.R((Context) obj5, (sz4) obj4, ((pdf) obj3).requireActivity(), new hu5(obj2, obj, (byte) 26));
                break;
            case 6:
                OperaSheet.lambda$initializeSheetRequest$0((ActionContext) obj5, (Context) obj4, (x5f) obj3, (x5f) obj2, (tw7) obj);
                break;
            case 7:
                OperaSubscriptionSheet.onValidated$lambda$0((tcl) obj5, (ActionContext) obj4, (orm) obj3, (skm) obj2, (tw7) obj);
                break;
            case 8:
                olh olhVar = (olh) obj5;
                d7l d7lVar = (d7l) obj3;
                String str7 = (String) obj4;
                wx wxVar = (wx) obj2;
                Long l = (Long) obj;
                if (l.longValue() != -1) {
                    d7lVar.d0(str7, false, new eof((Object) olhVar, (Object) str7, (byte) 12));
                }
                wxVar.run(l);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                slk slkVar = (slk) obj5;
                final u3k u3kVar2 = (u3k) obj3;
                String str8 = (String) obj4;
                h0d h0dVar = (h0d) obj;
                final py9 py9Var3 = slkVar.c;
                final s2g s2gVar2 = new s2g((Object) slkVar, (Object) u3kVar2, obj2, (byte) 7);
                if (h0dVar != h0d.c) {
                    shf shfVar3 = py9Var3.b;
                    u3kVar2.getClass();
                    String str9 = u3kVar2.a;
                    String str10 = u3kVar2.b;
                    final Object[] objArr5 = objArr == true ? 1 : 0;
                    ((wth) shfVar3.a).w(new ay1(str9, str10, str8, shfVar3, new Callback() { // from class: ny9
                        @Override // com.opera.api.Callback
                        public final void run(Object obj6) {
                            byte b3 = objArr5;
                            s2g s2gVar22 = s2gVar2;
                            u3k u3kVar22 = u3kVar2;
                            py9 py9Var32 = py9Var3;
                            z3k z3kVar = (z3k) obj6;
                            switch (b3) {
                                case 0:
                                    py9Var32.e(true, u3kVar22, z3kVar, s2gVar22);
                                    break;
                                default:
                                    py9Var32.e(false, u3kVar22, z3kVar, s2gVar22);
                                    break;
                            }
                        }
                    }, (byte) 5));
                    break;
                } else {
                    py9Var3.c.A(new xx1(s2gVar2, py9Var3, u3kVar2, str8));
                    break;
                }
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                enk enkVar = enk.a;
                String str11 = (String) obj4;
                String str12 = (String) obj5;
                shf shfVar4 = (shf) obj3;
                bha bhaVar = (bha) obj2;
                fvh fvhVar = new fvh();
                String string = ((Uri) obj).toString();
                rma rmaVar = new rma((byte) 4);
                rmaVar.o(string, null);
                hra hraVarD = rmaVar.d();
                if (fnk.a[0] != 1) {
                    h9o.p();
                    break;
                } else {
                    hra hraVarI = hraVarD.i("api/v1/subscriptions/google_billing/accountless/premium_beta/");
                    if (hraVarI == null) {
                        qp2.o("Required value was null.");
                        break;
                    } else {
                        fvhVar.a = hraVarI;
                        fvhVar.d("Authorization", "Bearer " + str11);
                        fvhVar.d("X-Purchase-Token", str12);
                        ((t9f) ((ii) shfVar4.c).get()).c(new kvh(fvhVar)).enqueue(new gnk(new b94((umi) shfVar4.b, bhaVar, objArr2 == true ? 1 : 0), true, (byte) 0));
                        break;
                    }
                }
            case 11:
                String str13 = (String) obj4;
                String str14 = (String) obj5;
                shf shfVar5 = (shf) obj3;
                my9 my9Var = (my9) obj2;
                fvh fvhVar2 = new fvh();
                hra hraVarI2 = w8h.l((Uri) obj).i("api/v1/free_trial/ofa/check_eligibility/premium_beta/");
                if (hraVarI2 == null) {
                    qp2.o("Required value was null.");
                    break;
                } else {
                    fvhVar2.a = hraVarI2;
                    fvhVar2.e(RequestBuilder.POST, w8h.i(str13, str14));
                    ((t9f) ((ii) shfVar5.c).get()).c(new kvh(fvhVar2)).enqueue(new p8f((byte) 22, (Object) new b94((umi) shfVar5.b, my9Var, objArr3 == true ? 1 : 0), (Object) str14, str13));
                    break;
                }
            case 12:
                enk enkVar2 = enk.a;
                String str15 = (String) obj4;
                String str16 = (String) obj5;
                shf shfVar6 = (shf) obj3;
                bha bhaVar2 = (bha) obj2;
                fvh fvhVar3 = new fvh();
                String string2 = ((Uri) obj).toString();
                rma rmaVar2 = new rma((byte) 4);
                rmaVar2.o(string2, null);
                hra hraVarD2 = rmaVar2.d();
                if (fnk.a[0] != 1) {
                    h9o.p();
                    break;
                } else {
                    hra hraVarI3 = hraVarD2.i("api/v1/subscriptions/google_billing/link_accountless_to_user/");
                    if (hraVarI3 == null) {
                        qp2.o("Required value was null.");
                        break;
                    } else {
                        fvhVar3.a = hraVarI3;
                        fvhVar3.d("Authorization", "Bearer " + str15);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("purchaseToken", orb.t(str16));
                            qvh qvhVar = rvh.Companion;
                            String string3 = jSONObject.toString();
                            Regex regex = esd.e;
                            esd esdVarX = wyh.x("application/json");
                            qvhVar.getClass();
                            fvhVar3.f(qvh.b(string3, esdVarX));
                            j7c.q(fvhVar3, (t9f) ((ii) shfVar6.c).get()).enqueue(new zg(new b94((umi) shfVar6.b, bhaVar2, objArr4 == true ? 1 : 0), 0, shfVar6, fvhVar3));
                            break;
                        } catch (JSONException e) {
                            t3p.n(e);
                            return;
                        }
                    }
                }
            default:
                bf9 bf9Var = (bf9) obj5;
                twl twlVar = (twl) obj;
                bf9Var.l = null;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) bf9Var.d.get()).edit();
                editorEdit.putString("device_id", twlVar.a).putString("device_auth_token", twlVar.b).putString("device_notification_token", (String) obj4).putString("device_version_token", (String) obj3);
                editorEdit.putStringSet("device_capabilities", (x1b) obj2);
                editorEdit.apply();
                ArrayList arrayList = bf9Var.g;
                if (bf9Var.r() >= 1) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList.clear();
                    int size = arrayList2.size();
                    while (i < size) {
                        Object obj6 = arrayList2.get(i);
                        i++;
                        ((Runnable) obj6).run();
                    }
                }
                bf9Var.z();
                break;
        }
    }
}
