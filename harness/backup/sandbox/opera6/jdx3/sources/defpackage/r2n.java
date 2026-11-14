package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewCompat$WebViewStartUpCallback;
import androidx.webkit.WebViewStartUpResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.leanplum.utils.SizeUtil;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.startup.WelcomeActivity;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.webapps.WebappActivity;
import com.opera.android.widget.MeasurableHeightScrollView;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class r2n implements m94, vlf, zph, fkj, OnCompleteListener, n5o, xk7, zvk, yk7, bcf, ph, bqb, m9n, pjk, WebViewCompat$WebViewStartUpCallback, ivn, yyk, OnFailureListener, tya, nc8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r2n(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ r2n(y2n y2nVar, q3j q3jVar) {
        this.a = (byte) 0;
        this.b = q3jVar;
    }

    public final void a() {
        ukn uknVar = (ukn) this.b;
        uknVar.s.f.r(new skn(uknVar, (byte) 1));
    }

    public final Object attachCompleter(l94 l94Var) {
        q3j q3jVar = (q3j) this.b;
        ((hbl) ((bfe) ((p3j) q3jVar).b.f)).a.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(l94Var.hashCode()));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        t2n t2nVar = new t2n(atomicBoolean, l94Var, q3jVar);
        l94Var.a(new h4m((Object) atomicBoolean, (Object) q3jVar, (Object) t2nVar, (byte) 5), n97.a());
        ((p3j) q3jVar).b.d(t2nVar);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(l94Var.hashCode()));
    }

    @Override // defpackage.xk7
    public final boolean b(int i) {
        qkn qknVar = (qkn) this.b;
        ujn ujnVar = qknVar.j;
        return (ujnVar.P(qknVar.b.i()) == i || ((mkb) ((ArrayList) ujnVar.d).get(i)).a() == null) ? false : true;
    }

    @Override // defpackage.pjk
    public final void c(boolean z) {
        ((mrn) this.b).p.f(new ern(z));
    }

    @Override // defpackage.ivn
    public final void d(int i, String str) {
        fp1 fp1Var = (WebappActivity) this.b;
        int i2 = WebappActivity.J;
        Intent intentB = mdb.b(fp1Var);
        intentB.setAction("android.intent.action.MAIN");
        intentB.addCategory("android.intent.category.LAUNCHER");
        intentB.setAction("com.opera.android.INTERNAL_WEB_SEARCH");
        intentB.putExtra("query", str);
        intentB.putExtra("com.opera.android.EXTRA_SEARCH_IN_NEW_TAB", true);
        intentB.putExtra("com.opera.android.EXTRA_SEARCH_INCOGNITO_MODE", vep.A(i));
        intentB.putExtra("com.opera.android.EXTRA_SEARCH_URL_ORIGIN", 0);
        fp1Var.startActivity(intentB);
    }

    @Override // defpackage.fkj
    public final void e(gkj gkjVar, hjm hjmVar) {
        i9c i9cVar = (i9c) this.b;
        if (gkjVar == ((gkj) i9cVar.g)) {
            i9cVar.g = null;
            if (hjmVar == hjm.a) {
                i9cVar.e(false);
            }
        }
    }

    @Override // defpackage.yyk
    public final Object execute() {
        t9l t9lVar = (t9l) this.b;
        SQLiteDatabase sQLiteDatabaseH = ((ydi) t9lVar.b).h();
        sQLiteDatabaseH.beginTransaction();
        try {
            Cursor cursorRawQuery = sQLiteDatabaseH.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
            try {
                Cursor cursor = cursorRawQuery;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] bArrDecode = null;
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    l45 l45VarA = dp2.a();
                    l45VarA.O(cursor.getString(1));
                    l45VarA.c = ryg.b(cursor.getInt(2));
                    String string = cursor.getString(3);
                    if (string != null) {
                        bArrDecode = Base64.decode(string, 0);
                    }
                    l45VarA.b = bArrDecode;
                    arrayList.add(l45VarA.n());
                }
                cursorRawQuery.close();
                sQLiteDatabaseH.setTransactionSuccessful();
                sQLiteDatabaseH.endTransaction();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((x77) t9lVar.c).n((dp2) obj, 1, false);
                }
                return null;
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        } catch (Throwable th2) {
            sQLiteDatabaseH.endTransaction();
            throw th2;
        }
    }

    @Override // defpackage.yk7
    public final Drawable f() {
        Context context = ((RecyclerView) this.b).getContext();
        x05 x05Var = new x05(context);
        x05Var.d(1);
        x05Var.b(new int[]{f03.t(2130969091, context, 2131101243)});
        Drawable drawableC = al2.c(x05Var);
        Drawable drawableF = sgb.F(2131231297, context);
        j14.n0(drawableF, f03.t(2130971269, context, 2131101243));
        return new w3a(j14.p(drawableF, drawableC), 17, false);
    }

    public final Object g(Object obj) throws cam {
        byte b = this.a;
        ArrayList arrayList = null;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                d7k d7kVar = (d7k) obj2;
                String str = (String) obj;
                if (str != null) {
                    d7kVar.invoke(new mjn(str));
                } else {
                    d7kVar.invoke(ljn.b);
                }
                return Unit.a;
            case 7:
                byte[] bArrB = ((c36) ((ra3) ((ojn) obj2).e.getValue()).b.get()).b(((min) obj).b);
                if (bArrB != null) {
                    return new String(bArrB);
                }
                return null;
            case 8:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            default:
                return ((n1) obj2).b0();
            case 11:
                try {
                    return vq8.j(new String(s29.h((File) ((vq8) obj2).f)));
                } catch (IOException | JSONException unused) {
                    return null;
                }
            case 12:
                ((lt2) obj2).run((aln) obj);
                return null;
            case 13:
                ArrayList arrayList2 = new ArrayList();
                File[] fileArrListFiles = ((File) ((s14) obj2).c).listFiles();
                if (fileArrListFiles != null) {
                    arrayList = new ArrayList(fileArrListFiles.length);
                    for (File file : fileArrListFiles) {
                        if (file.getName().endsWith(".json")) {
                            try {
                                arrayList.add(kln.h(new String(s29.h(file), StandardCharsets.UTF_8)));
                            } catch (IOException | JSONException unused2) {
                            }
                        }
                    }
                }
                if (arrayList != null) {
                    arrayList.sort(Comparator.comparing(new mn((byte) 26)));
                    arrayList2.addAll(arrayList);
                }
                return arrayList2;
        }
    }

    @Override // defpackage.zph
    public final boolean isEmpty() {
        List list;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ndn ndnVar = (ndn) obj;
                if (!ndnVar.t || (list = (List) ndnVar.d.g()) == null) {
                    return false;
                }
                return list.isEmpty();
            default:
                d83 d83Var = ((jdo) obj).v;
                if (d83Var == null) {
                    d83Var = null;
                }
                return ((ArrayList) d83Var.c).size() == ((TreeSet) d83Var.e).size();
        }
    }

    @Override // defpackage.m9n
    public final void j() {
        mqn mqnVar = (mqn) this.b;
        y83 y83Var = mqnVar.S;
        if (y83Var == null) {
            y83Var = null;
        }
        OperaBottomSheetBehavior operaBottomSheetBehaviorC = OperaBottomSheetBehavior.C((MeasurableHeightScrollView) y83Var.f);
        if (operaBottomSheetBehaviorC.q != 6) {
            return;
        }
        operaBottomSheetBehaviorC.o = true;
        vl6 vl6Var = mqnVar.T;
        ((OperaBottomSheetBehavior) (vl6Var != null ? vl6Var : null).b).I(3);
    }

    public final void k(Object obj) {
        ((tpn) this.b).a.D();
    }

    public final g3o l0(View view, g3o g3oVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                z63 z63Var = (z63) obj;
                pqh pqhVar = new pqh();
                d3o d3oVar = g3oVar.a;
                pqhVar.a = d3oVar.i(647);
                if (d3oVar.i(8).d != 0) {
                    r9b r9bVar = (r9b) pqhVar.a;
                    pqhVar.a = r9b.c(r9bVar.a, r9bVar.b, r9bVar.c, 0);
                }
                pt1 pt1Var = (pt1) z63Var.b;
                FrameLayout frameLayout = (FrameLayout) pt1Var.g;
                FrameLayout frameLayout2 = (FrameLayout) pt1Var.g;
                r9b r9bVar2 = (r9b) pqhVar.a;
                frameLayout.setPadding(r9bVar2.a, r9bVar2.b, r9bVar2.c, frameLayout.getPaddingBottom());
                if (frameLayout2.isLaidOut() && !frameLayout2.isLayoutRequested()) {
                    int i = ((r9b) pqhVar.a).a;
                    int height = frameLayout2.getHeight();
                    r9b r9bVar3 = (r9b) pqhVar.a;
                    z63Var.b(new Rect(i, height, r9bVar3.c, r9bVar3.d));
                    break;
                } else {
                    frameLayout2.addOnLayoutChangeListener(new kq2(z63Var, pqhVar, (byte) 3));
                    break;
                }
                break;
            default:
                int i2 = WelcomeActivity.w;
                ((WelcomeActivity) obj).O();
                break;
        }
        return g3oVar;
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        upn upnVar = (upn) this.b;
        if (tw7Var instanceof rw7) {
            qq8 qq8Var = upnVar.a;
        } else {
            if (tw7Var instanceof sw7) {
                return;
            }
            h9o.p();
        }
    }

    public final void o(uya uyaVar) {
        qdo qdoVar = (qdo) this.b;
        try {
            qya qyaVarE = uyaVar.e();
            if (qyaVarE != null) {
                qdoVar.c.f(qyaVarE);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                sgb.o((Intent) obj);
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((o4o) obj).b.trySetResult((Object) null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    public final void onFailure(Exception exc) {
        aco acoVar = (aco) this.b;
        exc.getMessage();
        p0k p0kVar = exc instanceof p0k ? (p0k) exc : null;
        Integer numValueOf = p0kVar != null ? Integer.valueOf(p0kVar.d()) : null;
        acoVar.m(numValueOf, false);
        if (numValueOf == null || numValueOf.intValue() != -1) {
            acoVar.p(exc);
        } else {
            vml.d(new ttn((Object) acoVar, (byte) 7), 10000L);
        }
    }

    @Override // androidx.webkit.WebViewCompat$WebViewStartUpCallback
    public final void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        WebViewCompat$WebViewStartUpCallback webViewCompat$WebViewStartUpCallback = (WebViewCompat$WebViewStartUpCallback) this.b;
        Uri uri = WebViewCompat.a;
        new Handler(Looper.getMainLooper()).post(new fmn((Object) webViewCompat$WebViewStartUpCallback, (Object) webViewStartUpResult, (byte) 4));
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        bdn bdnVar = (bdn) this.b;
        bdnVar.c.C(z);
        if (bdnVar.h.k == 1 || z) {
            return;
        }
        bdnVar.i.m();
    }
}
