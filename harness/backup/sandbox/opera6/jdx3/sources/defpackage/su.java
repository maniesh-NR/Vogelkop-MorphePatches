package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;
import com.leanplum.ActionContext;
import com.leanplum.internal.RequestBuilder;
import com.leanplum.messagetemplates.OperaSubscriptionDialog;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.account.auth.EditProfileAuthActivity;
import com.opera.android.autofill.OperaAutofillIntentDispatcherActivity;
import com.opera.android.http.server.HttpServer;
import com.opera.api.Callback;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.connection.RealCall;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class su implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ su(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ su(xu xuVar, q3 q3Var, zt1 zt1Var, String str) {
        this.a = (byte) 0;
        this.b = xuVar;
        this.c = q3Var;
        this.d = zt1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.content.Context, com.opera.android.autofill.OperaAutofillIntentDispatcherActivity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.content.Context, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.view.View, x83] */
    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        k02 k02VarA;
        Long l;
        String str;
        Object next;
        i1 i1VarM;
        i1 i1VarM2;
        ov0 ov0Var;
        byte b = 2;
        byte b2 = 10;
        byte b3 = 1;
        gri griVar = null;
        griVar = null;
        griVar = null;
        griVar = null;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                xu xuVar = (xu) this.b;
                q3 q3Var = (q3) this.c;
                zt1 zt1Var = (zt1) this.d;
                w3g w3gVar = (w3g) obj;
                if (w3gVar == null) {
                    q3Var.invoke(new rw7(new uu(zt1Var.getName())));
                    return;
                }
                vu vuVar = xuVar.f;
                z3 z3Var = new z3(q3Var, b2);
                vuVar.a = w3gVar;
                vuVar.b = z3Var;
                vuVar.a();
                return;
            case 1:
                wy wyVar = (wy) this.b;
                Callback callback = (Callback) this.d;
                w7h w7hVar = wyVar.q;
                su suVar = new su(wyVar, (orb) obj, callback, b);
                jec jecVar = (jec) w7hVar.f.f;
                orb orbVar = new orb();
                vpb vpbVar = new vpb();
                long jCurrentTimeMillis = System.currentTimeMillis() - 21600000;
                while (!jecVar.isEmpty() && ((ip) jecVar.get(0)).d < jCurrentTimeMillis) {
                    jecVar.remove(0);
                }
                Iterator<E> it = jecVar.iterator();
                while (it.hasNext()) {
                    ip ipVar = (ip) it.next();
                    orb orbVar2 = new orb();
                    orbVar2.p(ipVar.a, "placementId");
                    orbVar2.p(ipVar.b, "result");
                    orbVar2.p(tl.a(ipVar.c), "requestTime");
                    orbVar2.p(tl.a(ipVar.d), "receivingTime");
                    vpbVar.a(orbVar2);
                }
                orbVar.p(vpbVar, "adRequests");
                suVar.run(orbVar);
                return;
            case 2:
                wy wyVar2 = (wy) this.b;
                orb orbVar3 = (orb) this.c;
                Callback callback2 = (Callback) this.d;
                orb orbVar4 = (orb) obj;
                try {
                    String str2 = wyVar2.g.l;
                    orbVar3.p(str2 == null ? "success" : "error: ".concat(str2), "lastCachePreloadFetchResult");
                    Iterator<String> itKeys = orbVar4.a.keys();
                    while (itKeys.hasNext()) {
                        String next2 = itKeys.next();
                        orbVar3.p(orbVar4.a(next2), next2);
                    }
                    wyVar2.l.H0(orbVar3);
                } catch (JSONException unused) {
                }
                callback2.run(orbVar3);
                return;
            case 3:
                ebb ebbVar = (ebb) this.b;
                tz1 tz1Var = (tz1) this.c;
                String str3 = (String) this.d;
                List list = (List) obj;
                Iterator it2 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                    } else if (!((jz1) it2.next()).a.equals(str3)) {
                        i++;
                    }
                }
                if (i != -1) {
                    jz1 jz1Var = (jz1) list.get(i);
                    jz1 jz1Var2 = new jz1(jz1Var.a, jz1Var.b, jz1Var.c, ebbVar);
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.remove(i);
                    arrayList.add(0, jz1Var2);
                    tz1Var.h.r(arrayList);
                    return;
                }
                return;
            case 4:
                jz1 jz1Var3 = (jz1) this.b;
                tz1 tz1Var2 = (tz1) this.c;
                String str4 = (String) this.d;
                List list2 = (List) obj;
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        if (((jz1) it3.next()).a.equals(str4)) {
                            return;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(list2);
                arrayList2.add(0, jz1Var3);
                tz1Var2.h.r(arrayList2);
                return;
            case 5:
                t02 t02Var = (t02) this.b;
                String str5 = (String) this.c;
                l02 l02Var = (l02) this.d;
                isl islVar = (isl) obj;
                if (islVar instanceof jsl) {
                    String str6 = ((jsl) islVar).a;
                    if (Intrinsics.a(str6, str5)) {
                        k02VarA = j02.a;
                    } else {
                        l02Var.e = str6;
                        k02VarA = new i02(str6);
                    }
                } else {
                    if (!Intrinsics.a(islVar, hsl.a)) {
                        h9o.p();
                        return;
                    }
                    k02VarA = l02Var.a();
                }
                t02Var.invoke(k02VarA);
                return;
            case 6:
                l12 l12Var = (l12) this.b;
                p12 p12Var = (p12) this.c;
                pjn pjnVar = (pjn) this.d;
                Uri uri = (Uri) obj;
                if (uri == null) {
                    l12Var.a.m(2132019200);
                    return;
                } else {
                    ((qsh) p12Var.d).c(uri, new k12(pjnVar, b3));
                    return;
                }
            case 7:
                Uri uri2 = (Uri) this.b;
                ?? r2 = (BrowserActivity) this.c;
                l6e l6eVar = (l6e) this.d;
                ((a52) r2.y.j.get()).c(Collections.singletonList(new fz1(uri2, String.valueOf(System.currentTimeMillis()), (String) obj)), ez1.a, false);
                r2.d0.K(r2.getString(2132017492), 6, true, 1, false, l6eVar);
                return;
            case 8:
                fp1 fp1Var = (BrowserActivity) this.b;
                tun tunVar = (tun) this.c;
                String str7 = (String) this.d;
                Bitmap bitmap = (Bitmap) obj;
                String[] strArr = OperaApplication.K;
                nr8 nr8VarO = ((OperaApplication) fp1Var.getApplication()).o();
                String strD = tunVar.d();
                String[] strArr2 = aik.a;
                if (strD == null) {
                    strD = "";
                }
                nr8VarO.a(new mzj(strD, str7, bitmap, 8));
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                InetAddress inetAddress = (InetAddress) this.b;
                HttpServer httpServer = (HttpServer) this.c;
                hu5 hu5Var = (hu5) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    hu5Var.run(null);
                    return;
                }
                hu5Var.run(new zn4(httpServer, new Uri.Builder().scheme("http").encodedAuthority(inetAddress.getHostAddress() + ":" + httpServer.c).build()));
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                t25 t25Var = (t25) this.b;
                Callback callback3 = (Callback) this.c;
                s25 s25Var = (s25) this.d;
                int size = t25Var.g.size();
                t25Var.h = true;
                callback3.run(qyn.C(s25Var, ((Long) obj).longValue(), size, 2131886106, 2132021325));
                return;
            case 11:
                ((t25) this.b).a((s25) this.c, (Runnable) this.d);
                return;
            case 12:
                v25 v25Var = (v25) this.b;
                s25 s25Var2 = (s25) this.c;
                iu2 iu2Var = (iu2) this.d;
                v25Var.f = ((Long) obj).longValue() + v25Var.f;
                v25Var.e(s25Var2, iu2Var);
                return;
            case 13:
                t25 t25Var2 = (t25) this.b;
                Callback callback4 = (Callback) this.c;
                s25 s25Var3 = (s25) this.d;
                List<ilh> list4 = (List) obj;
                int size2 = list4.size();
                ArrayList arrayList3 = t25Var2.g;
                arrayList3.clear();
                long jLongValue = 0;
                while (true) {
                    long j = jLongValue;
                    for (ilh ilhVar : list4) {
                        arrayList3.add(Long.valueOf(ilhVar.a));
                        l = ilhVar.i;
                        if (l != null) {
                            break;
                        }
                    }
                    t25Var2.h = true;
                    callback4.run(qyn.C(s25Var3, j, size2, 2131886109, 2132021330));
                    return;
                    jLongValue = l.longValue() + j;
                    break;
                }
                break;
            case 14:
                ((t25) this.b).a((s25) this.c, (Runnable) this.d);
                return;
            case 15:
                HashSet hashSet = (HashSet) this.b;
                s25 s25Var4 = (s25) obj;
                fh4 fh4Var = new fh4((BrowserActivity) this.c, (gh2) this.d, (byte) 7);
                z4o.z0(s25Var4.a, hashSet);
                z zVar = new z(fh4Var);
                for (r25 r25Var : z4o.R()) {
                    if (hashSet.contains(r25Var.a) && r25Var.d(s25Var4)) {
                        r25Var.a(s25Var4, new k3(s25Var4, r25Var, zVar.b(), (byte) 26));
                    }
                }
                zVar.e();
                return;
            case 16:
                bk5 bk5Var = (bk5) this.b;
                gk5 gk5Var = (gk5) this.c;
                String str8 = (String) this.d;
                tw7 tw7Var = (tw7) obj;
                if (tw7Var instanceof rw7) {
                    bk5Var.c(str8, gk5Var, (List) ((rw7) tw7Var).a);
                    return;
                }
                if (!(tw7Var instanceof sw7)) {
                    h9o.p();
                    return;
                }
                vj5 vj5Var = (vj5) ((sw7) tw7Var).a;
                bk5Var.getClass();
                bk5Var.d(ak5.c);
                lh4 lh4Var = new lh4(new su((Object) bk5Var, (Object) gk5Var, (Object) vj5Var, (byte) 17), (byte) 0);
                bk5Var.g = lh4Var;
                new igi(bk5Var.c, vj5Var, lh4Var);
                return;
            case 17:
                bk5 bk5Var2 = (bk5) this.b;
                gk5 gk5Var2 = (gk5) this.c;
                vj5 vj5Var2 = (vj5) this.d;
                tw7 tw7Var2 = (tw7) obj;
                if (tw7Var2 instanceof rw7) {
                    bk5Var2.c(vj5Var2.p, gk5Var2, (List) ((rw7) tw7Var2).a);
                    return;
                }
                if (!(tw7Var2 instanceof sw7)) {
                    h9o.p();
                    return;
                }
                wj5 wj5Var = (wj5) ((sw7) tw7Var2).a;
                bk5Var2.getClass();
                bk5Var2.d(ak5.d);
                bk5Var2.g = null;
                bk5Var2.d.k(wj5Var, new su((Object) bk5Var2, (Object) gk5Var2, (Object) wj5Var, (byte) 18));
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                bk5 bk5Var3 = (bk5) this.b;
                gk5 gk5Var3 = (gk5) this.c;
                wj5 wj5Var2 = (wj5) this.d;
                tw7 tw7Var3 = (tw7) obj;
                if (tw7Var3 instanceof rw7) {
                    bk5Var3.c(wj5Var2.p, gk5Var3, (List) ((rw7) tw7Var3).a);
                    return;
                }
                if (!(tw7Var3 instanceof sw7)) {
                    h9o.p();
                    return;
                }
                uj5 uj5Var = (uj5) ((sw7) tw7Var3).a;
                jk5 jk5Var = bk5Var3.a;
                synchronized (jk5Var.d) {
                    str = jk5Var.e;
                    jk5Var.e = null;
                }
                if (str != null) {
                    nv6 nv6VarB = jk5Var.c.b();
                    ((SharedPreferences.Editor) nv6VarB.a).putString("config_bundle.active", str);
                    nv6VarB.w();
                    jk5Var.a.accept(str);
                }
                bk5Var3.e.run();
                dk5 dk5Var = new dk5(uj5Var, gk5Var3);
                lh4 lh4Var2 = bk5Var3.g;
                if (lh4Var2 != null) {
                    lh4Var2.b = null;
                    bk5Var3.g = null;
                }
                bk5Var3.h = null;
                bk5Var3.a.b.r(new eb8(dk5Var));
                bk5Var3.d(ak5.a);
                return;
            case 19:
                ((dnn) obj).a(new d5o((ju2) this.b, (String) this.c, (tzn) this.d));
                return;
            case SizeUtil.textSize0 /* 20 */:
                tn tnVar = (tn) this.b;
                tc2 tc2Var = (tc2) this.c;
                Runnable runnable = (Runnable) this.d;
                y73 y73Var = (y73) tnVar.d;
                gl6 gl6Var = new gl6((f3j) obj, tc2Var, runnable, b);
                y73Var.c = gl6Var;
                if (y73Var.b) {
                    y73Var.c = null;
                    gl6Var.run();
                    return;
                }
                return;
            case 21:
                ev7 ev7Var = (ev7) this.b;
                String str9 = (String) this.c;
                String str10 = (String) this.d;
                Drawable drawable = (Drawable) obj;
                vs vsVar = (vs) ev7Var.f;
                LinkedHashMap linkedHashMap = (LinkedHashMap) ev7Var.b;
                pde pdeVar = (pde) ev7Var.a;
                h6n it4 = new g6n((ChipGroup) vsVar.d).iterator();
                while (true) {
                    h6n h6nVar = it4;
                    if (h6nVar.hasNext()) {
                        next = h6nVar.next();
                        ?? r8 = (x83) ((View) next);
                        if (!r8.isSelected() || r8.A != hri.c) {
                        }
                    } else {
                        next = null;
                    }
                }
                gv6 gv6Var = (gv6) next;
                if (gv6Var != null) {
                    pvb pvbVar = ((uv7) pdeVar.g()).e;
                    String str11 = (pvbVar == null || (i1VarM2 = pvbVar.m()) == null) ? null : (String) i1VarM2.d;
                    pvb pvbVar2 = ((uv7) pdeVar.g()).e;
                    String str12 = (pvbVar2 == null || (i1VarM = pvbVar2.m()) == null) ? null : (String) i1VarM.e;
                    hri hriVar = hri.c;
                    gri griVar2 = (gri) linkedHashMap.get(hriVar);
                    if (griVar2 != null) {
                        if (str11 != null && str11.equals(str9) && str12 != null && str12.equals(str10)) {
                            griVar = griVar2;
                        }
                        if (griVar != null) {
                            gri griVarA = gri.a(griVar, drawable, 239);
                            linkedHashMap.put(hriVar, griVarA);
                            gv6Var.p(griVarA);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case SizeUtil.textSize1 /* 22 */:
                EditProfileAuthActivity editProfileAuthActivity = (EditProfileAuthActivity) this.b;
                db dbVar = (db) this.c;
                bf9 bf9Var = (bf9) this.d;
                int i2 = EditProfileAuthActivity.V;
                if (!editProfileAuthActivity.U && (ov0Var = editProfileAuthActivity.P) != null) {
                    ((MaterialButton) ((ov0) ov0Var.c).d).setVisibility(4);
                }
                if (dbVar.f()) {
                    dbVar.j(true);
                }
                bf9Var.h();
                return;
            case 23:
                g77 g77Var = (g77) this.b;
                nq8 nq8Var = (nq8) this.c;
                qq8 qq8Var = (qq8) this.d;
                pne pneVar = (pne) obj;
                on7 on7Var = pn7.b;
                y03 y03Var = new y03(cs5.x0(5, un7.e));
                fvh fvhVar = new fvh();
                qvh qvhVar = rvh.Companion;
                JSONObject jSONObject = new JSONObject();
                orb orbVar5 = new orb();
                orbVar5.p(nq8Var.a, "countryCode");
                orbVar5.p(nq8Var.b, "hashedOperaId");
                orbVar5.p(nq8Var.c, "product");
                orbVar5.p(nq8Var.d, "version");
                String str13 = nq8Var.e;
                if (str13 != null) {
                    orbVar5.p(str13, "abGroup");
                }
                try {
                    jSONObject.put("clientInfo", orb.t(orbVar5));
                    String string = jSONObject.toString();
                    Regex regex = esd.e;
                    esd esdVarX = wyh.x("application/json; charset=utf-8");
                    qvhVar.getClass();
                    fvhVar.e(RequestBuilder.POST, qvh.b(string, esdVarX));
                    String strK = sko.k("https://", pneVar.a, "/generate-catalog");
                    rma rmaVar = new rma((byte) 4);
                    rmaVar.o(strK, null);
                    fvhVar.a = rmaVar.d();
                    fvhVar.a("Api-Key", pneVar.b);
                    RealCall realCallQ = j7c.q(fvhVar, (t9f) ((ii) g77Var.b).get());
                    int i3 = y03Var.a;
                    if (i3 < 3) {
                        y03Var.a = i3 + 1;
                    }
                    realCallQ.enqueue(new ua7(g77Var, qq8Var, y03Var, b2));
                    return;
                } catch (JSONException e) {
                    t3p.n(e);
                    return;
                }
            case SizeUtil.textSize2 /* 24 */:
                ((mgh) this.c).b = ((bf9) this.b).p((Long) obj, (dg7) this.d);
                return;
            case 25:
                bf9 bf9Var2 = (bf9) this.b;
                az4 az4Var = (az4) this.c;
                String str14 = (String) this.d;
                bf9Var2.y = null;
                az4Var.run(new ze9((ke9) obj, str14));
                return;
            case 26:
                mgh mghVar = (mgh) this.b;
                myk mykVar = (myk) this.c;
                Callback callback5 = (Callback) this.d;
                List<jv5> list5 = (List) obj;
                Callback callback6 = (Callback) mghVar.c;
                if (callback6 != null) {
                    String host = dgh.h().getHost();
                    for (jv5 jv5Var : list5) {
                        if (!jv5Var.b.isEmpty() && jv5Var.d.equals("/") && jv5Var.c.endsWith(host)) {
                            callback6.run(af9.b);
                            return;
                        }
                    }
                    mghVar.b = new jyk(mykVar, new j12(callback5, (byte) 5));
                    return;
                }
                return;
            case 27:
                gv8 gv8Var = (gv8) this.b;
                ImageView imageView = (ImageView) this.c;
                igi igiVar = (igi) this.d;
                Bitmap bitmap2 = (Bitmap) obj;
                if (((Boolean) gv8Var.invoke()).booleanValue()) {
                    imageView.setImageDrawable(bitmap2 != null ? new hq4(((Number) ((zyk) igiVar.f).getValue()).floatValue(), 0, 14, bitmap2) : null);
                    return;
                }
                return;
            case 28:
                ?? r10 = (OperaAutofillIntentDispatcherActivity) this.b;
                s3g s3gVar = (s3g) this.c;
                t3g t3gVar = (t3g) this.d;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i4 = OperaAutofillIntentDispatcherActivity.i;
                if (!zBooleanValue) {
                    t3gVar.b(s3gVar, new ve9((OperaAutofillIntentDispatcherActivity) r10, t3gVar, s3gVar, (boolean) (objArr == true ? 1 : 0)));
                    return;
                }
                tv1 tv1Var = (tv1) ((OperaApplication) r10.u()).r.m.get();
                String string2 = r10.getString(2132017955);
                rxh rxhVar = new rxh(2132022056);
                rxh rxhVar2 = new rxh(2132018111);
                a32 a32Var = new a32((Object) r10, (Object) t3gVar, (Object) s3gVar, (byte) 22);
                tv1Var.getClass();
                new ev2(r10, string2, s3gVar, rxhVar, rxhVar2, a32Var).show();
                return;
            default:
                OperaSubscriptionDialog.onValidated$lambda$0((tcl) this.b, (ActionContext) this.c, (orm) this.d, (tw7) obj);
                return;
        }
    }
}
