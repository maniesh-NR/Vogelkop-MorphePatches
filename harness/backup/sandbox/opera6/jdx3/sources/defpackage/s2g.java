package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Size;
import android.util.SparseBooleanArray;
import android.view.View;
import com.appsflyer.internal.j;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class s2g implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s2g(byte b, Object obj, Object obj2, String str) {
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
    }

    public /* synthetic */ s2g(g0h g0hVar, String str, lag lagVar, kag kagVar) {
        this.a = (byte) 2;
        this.d = str;
        this.b = lagVar;
        this.c = kagVar;
    }

    public /* synthetic */ s2g(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ s2g(String str, shf shfVar, bha bhaVar) {
        this.a = (byte) 9;
        this.d = str;
        this.b = shfVar;
        this.c = bhaVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        List listG;
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                x79 x79Var = (x79) obj4;
                r2g r2gVar = (r2g) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    v1 v1VarU = v1.u((Context) x79Var.d);
                    v1VarU.b(new i61((Object) x79Var, (Object) r2gVar, str2, (Object) str, (Object) v1VarU, (byte) 6));
                    break;
                } else {
                    x79Var.getClass();
                    r2gVar.run(null);
                    break;
                }
            case 1:
                p3g p3gVar = (p3g) obj4;
                tu tuVar = (tu) obj2;
                a4g a4gVar = (a4g) obj;
                try {
                    listG = y1j.g(new m2m(y1j.c(new d82(Collections.unmodifiableList(a4gVar.a), (byte) 1), new o5f(p3gVar, (q3g) obj3)), new m3g(p3gVar, a4gVar)));
                } catch (IllegalArgumentException unused) {
                    listG = l08.a;
                }
                tuVar.run(new o3g(listG));
                a4gVar.a();
                break;
            case 2:
                String str3 = (String) obj2;
                lag lagVar = (lag) obj4;
                kag kagVar = (kag) obj3;
                if (((Boolean) obj).booleanValue()) {
                    s9g.h.o(false, str3, lagVar, kagVar, true);
                    break;
                }
                break;
            case 3:
                ((ueh) obj4).A.invoke((Uri) obj3, (String) obj2);
                break;
            case 4:
                sjh sjhVar = (sjh) obj4;
                z1i z1iVar = (z1i) obj3;
                Long l = (Long) obj2;
                pjh pjhVar = (pjh) obj;
                if (pjhVar.b != eo0.e) {
                    j.d((SharedPreferences) tjh.a(sjhVar.a).a.get(), "hasRated", true);
                }
                ee0 ee0Var = pjhVar.a;
                eo0 eo0Var = pjhVar.b;
                String str4 = pjhVar.c;
                ((x5f) sjhVar.d).u0(eo0Var, ee0Var, sjhVar.h.b(), ((SharedPreferences) ((b59) sjhVar.i.a).get()).getInt("TOTAL_PAGE_LOADS", 0), z1iVar != null, l, pjhVar.d != null ? Long.valueOf(r1.intValue()) : null, ho0.b);
                ((x5f) sjhVar.e).t0(str4);
                break;
            case 5:
                olh olhVar = (olh) obj4;
                Uri uri = (Uri) obj;
                olhVar.getClass();
                ((SettingsManager) obj3).Y("offline_pages_location", uri.toString());
                if (((Uri) obj2).equals(uri)) {
                    syd sydVar = olhVar.a.f;
                    if (sydVar.f) {
                        sydVar.a((SharedPreferences) sydVar.c.get(), true);
                        break;
                    }
                }
                break;
            case 6:
                w6j w6jVar = (w6j) obj4;
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) w6jVar.d;
                sparseBooleanArray.put(((ozj) obj3).b(), ((Boolean) obj).booleanValue());
                if (((AtomicInteger) obj2).decrementAndGet() == 0) {
                    vml.a((mni) w6jVar.e);
                    Callback callback = (Callback) w6jVar.b;
                    if (callback != null) {
                        callback.run(sparseBooleanArray);
                        w6jVar.b = null;
                        break;
                    }
                }
                break;
            case 7:
                slk slkVar = (slk) obj4;
                u3k u3kVar = (u3k) obj3;
                bha bhaVar = (bha) obj2;
                h4k h4kVar = (h4k) obj;
                if (h4kVar instanceof f4k) {
                    zkk zkkVar = slkVar.e;
                    int i = u3kVar.c;
                    x5f x5fVar = zkkVar.a;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    bt0 bt0VarI = new ck0(zpaVar, x56VarF).i();
                    bt0VarI.a.p(27, 1, jCurrentTimeMillis);
                    bt0VarI.a.p(28, 1, i);
                    x5fVar.U0(x56VarF);
                    slkVar.b(null);
                }
                bhaVar.run(h4kVar);
                break;
            case 8:
                ((slk) obj4).c.b((h0d) obj, (String) obj2, (bha) obj3);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                String str5 = (String) obj2;
                shf shfVar = (shf) obj4;
                bha bhaVar2 = (bha) obj3;
                String string = ((Uri) obj).toString();
                rma rmaVar = new rma((byte) 4);
                rmaVar.o(string, null);
                hra hraVarI = rmaVar.d().i("api/v1/subscriptions/");
                if (hraVarI == null) {
                    qp2.o("Required value was null.");
                    break;
                } else {
                    fvh fvhVar = new fvh();
                    fvhVar.a = hraVarI;
                    fvhVar.d("Authorization", "Bearer ".concat(str5));
                    ((t9f) ((ii) shfVar.c).get()).c(new kvh(fvhVar)).enqueue(new gnk(new b94((umi) shfVar.b, bhaVar2, (byte) 0), false, (byte) 1));
                    break;
                }
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                xbf xbfVar = (xbf) obj4;
                fxk fxkVar = (fxk) obj3;
                vr9 vr9Var = (vr9) obj2;
                if (((Long) obj) == null) {
                    ((glh) xbfVar.d).d(fxkVar.a.toString(), fxkVar.c, fxkVar.b, -1L, null);
                }
                vr9Var.run();
                break;
            case 11:
                c8l c8lVar = (c8l) obj4;
                d7l d7lVar = (d7l) obj3;
                rv3 rv3Var = (rv3) obj2;
                yni yniVar = (yni) obj;
                dyg s7lVar = yniVar != null ? new s7l(yniVar) : r7l.b;
                mcj mcjVarC = c8lVar.c(d7lVar.T());
                rv3Var.a(d7lVar.j.getId(), s7lVar);
                if (yniVar != null) {
                    Bitmap bitmap = yniVar.a;
                    int id = d7lVar.j.getId();
                    boolean z2 = !f03.I(c8lVar.a);
                    Size sizeA = c8lVar.a(0.65f, bitmap);
                    l7l l7lVar = new l7l(u35.g(id, "med"), sizeA.getWidth(), sizeA.getHeight(), z2, yniVar.b);
                    Size sizeA2 = c8lVar.a(0.2f, bitmap);
                    x7l x7lVar = new x7l(mcjVarC, yniVar, new m7l(id, l7lVar, new l7l(u35.g(id, "min"), sizeA2.getWidth(), sizeA2.getHeight(), z2, yniVar.b)));
                    rg rgVar = new rg((Object) c8lVar, (Object) mcjVarC, (Object) rv3Var, (Object) d7lVar, (byte) 16);
                    c8lVar.h.add(x7lVar);
                    new rml(Unit.a, c8lVar.b).a(new q7l(c8lVar, x7lVar, rgVar, (byte) 0)).m(c8lVar.f);
                    break;
                }
                break;
            case 12:
                ((Callback) obj2).run((Set) Stream.concat(((Set) obj3).stream(), ((Set) obj).stream()).filter(new nn((vq8) obj4)).map(new mn((byte) 25)).filter(new nn((byte) 22)).collect(Collectors.toSet()));
                break;
            case 13:
                ((dnn) obj).a(new oam((bmn) obj4, (String) obj2, (String) obj3));
                break;
            case 14:
                jvg jvgVar = (jvg) obj4;
                qf qfVar = (qf) obj2;
                Uri uri2 = (Uri) obj;
                if (((View) obj3).isAttachedToWindow()) {
                    qfVar.b();
                    bmn bmnVar = (bmn) jvgVar.c;
                    bmnVar.i.e(new dmn(bmnVar.a == 2 ? wln.c : wln.c, new cmn(null, uri2.toString(), 0, 5, false)), false);
                    break;
                }
                break;
            case 15:
                ((qmn) obj).a(new wtm(z, (l45) obj4, (Context) obj3, (ilm) obj2));
                break;
            default:
                p12 p12Var = (p12) obj4;
                p12Var.getClass();
                eej eejVar = (eej) p12Var.d;
                qsh qshVar = new qsh(obj2, p12Var.f, (byte) 12);
                eejVar.getClass();
                v4g v4gVar = new v4g((p94) obj3, qshVar, (Bitmap) obj);
                nej nejVar = eejVar.a;
                nejVar.getClass();
                nejVar.b(v4gVar, ijm.b);
                p12Var.h = new WeakReference(v4gVar);
                break;
        }
    }
}
