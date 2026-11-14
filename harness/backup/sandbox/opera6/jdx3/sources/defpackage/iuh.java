package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ads.interactivemedia.v3.impl.data.zzbg;
import com.google.ads.interactivemedia.v3.impl.data.zzbq;
import com.google.ads.interactivemedia.v3.impl.data.zzbr;
import com.google.ads.interactivemedia.v3.impl.data.zzbs;
import com.google.ads.interactivemedia.v3.internal.zzls;
import com.google.ads.interactivemedia.v3.internal.zzlt;
import com.google.ads.interactivemedia.v3.internal.zzly;
import com.google.ads.interactivemedia.v3.internal.zzoa;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Tasks;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.browser.NavigationEntry;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.SimpleUrlLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class iuh implements o7h, hoj, NavigationHistory, qvi, oqp {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public iuh(byte b) {
        this.a = b;
        switch (b) {
            case 5:
                this.b = a77.a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.c = a77.a.b(PreviewGreenTintQuirk.class);
                break;
            case 6:
                this.b = new vci(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
                this.c = new vci(Constants.Crypt.KEY_LENGTH);
                break;
            default:
                this.b = null;
                this.c = null;
                break;
        }
    }

    public iuh(Handler handler, mi8 mi8Var) {
        this.a = (byte) 9;
        if (mi8Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = mi8Var;
    }

    public iuh(d7l d7lVar, NavigationHistory navigationHistory) {
        this.a = (byte) 7;
        this.b = navigationHistory;
        this.c = d7lVar;
    }

    public /* synthetic */ iuh(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public iuh(mbi mbiVar, zzbg zzbgVar) {
        this.a = (byte) 14;
        this.b = new zzly(mbiVar);
        this.c = zzbgVar;
    }

    public iuh(ole oleVar) {
        this.a = (byte) 4;
        this.b = oleVar;
        this.c = new LinkedHashSet();
    }

    public iuh(p7m p7mVar) {
        this.a = (byte) 8;
        this.c = p7mVar;
        this.b = new bq4(new byte[4], 4);
    }

    public iuh(qln qlnVar, RecyclerView recyclerView, wjn wjnVar, int i, int i2, enn ennVar) {
        this.a = (byte) 10;
        this.b = recyclerView;
        ujn ujnVar = new ujn(wjnVar, qlnVar.g, null, ennVar);
        this.c = ujnVar;
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(1, 0);
        t79 t79Var = new t79(recyclerView, gridLayoutManager, i2, 0, i, 0, 1, (byte) 0);
        k56 k56Var = new k56();
        k56Var.g = false;
        recyclerView.B0(k56Var);
        recyclerView.C0(gridLayoutManager);
        recyclerView.m(new i4a(t79Var));
        recyclerView.y0(ujnVar);
    }

    public iuh(v4b v4bVar) {
        this.a = (byte) 3;
        this.b = v4bVar;
        this.c = new File("site_images");
    }

    public iuh(wtm wtmVar) {
        this.a = (byte) 13;
        this.c = wtmVar;
    }

    public final void a(g1g g1gVar) {
        p7m p7mVar = (p7m) this.c;
        SparseArray sparseArray = p7mVar.h;
        bq4 bq4Var = (bq4) this.b;
        if (g1gVar.A() != 0 || (g1gVar.A() & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) == 0) {
            return;
        }
        g1gVar.O(6);
        int iA = g1gVar.a() / 4;
        for (int i = 0; i < iA; i++) {
            g1gVar.k(bq4Var.b, 0, 4);
            bq4Var.q(0);
            int i2 = bq4Var.i(16);
            bq4Var.t(3);
            if (i2 == 0) {
                bq4Var.t(13);
            } else {
                int i3 = bq4Var.i(13);
                if (sparseArray.get(i3) == null) {
                    sparseArray.put(i3, new rvi(new pyl(p7mVar, i3)));
                    p7mVar.n++;
                }
            }
        }
        if (p7mVar.a != 2) {
            sparseArray.remove(0);
        }
    }

    public final void b(r4n r4nVar) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new npl(this, r4nVar, (byte) 21));
        }
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final int d() {
        return ((NavigationHistory) this.b).d();
    }

    public final void e(pql pqlVar, en8 en8Var, s7m s7mVar) {
    }

    @Override // defpackage.hoj
    public final void f(String str, tmi tmiVar) {
        v4b v4bVar = (v4b) this.b;
        Uri uriH = v4bVar.h(new File((File) this.c, str));
        if (v4bVar.g(uriH) == null) {
            uriH = null;
        }
        tmiVar.invoke(uriH);
    }

    @Override // defpackage.oqp
    public final zzbs g(zzbr zzbrVar) {
        try {
            int i = zzbrVar.e() == zzbq.GET ? 0 : 1;
            zzly zzlyVar = (zzly) this.b;
            return zzbs.e(zzbrVar.c(), (String) Tasks.await(((zzbg) this.c).g() ? Tasks.forException(new zzls(8)) : zzlyVar.doRead(TaskApiCall.builder().setFeatures(new Feature[]{zzoa.b}).setAutoResolveMissingFeatures(false).run(new zzlt(zzlyVar, zzbrVar.f(), i, zzbrVar.b())).build()), zzbrVar.a() + zzbrVar.d(), TimeUnit.MILLISECONDS), "unknown");
        } catch (InterruptedException | TimeoutException unused) {
            return zzbs.d(101, zzbrVar.c());
        } catch (ExecutionException e) {
            zzls cause = e.getCause();
            return cause instanceof zzls ? zzbs.d(cause.a, zzbrVar.c()) : cause instanceof ApiException ? zzbs.d(102, zzbrVar.c()) : zzbs.d(100, zzbrVar.c());
        }
    }

    public final Object get() {
        tmj tmjVar = new tmj((byte) 9);
        cpj cpjVar = new cpj((byte) 7);
        Object obj = ((yhe) this.b).get();
        o7h o7hVar = (o7h) this.c;
        return new ydi(tmjVar, cpjVar, kn2.f, (dni) obj, o7hVar);
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final NavigationEntry i(int i) {
        NavigationEntry navigationEntryI = ((NavigationHistory) this.b).i(i);
        knf knfVar = (knf) ((SparseArray) ((d7l) this.c).e.b).get(navigationEntryI.getId());
        return knfVar == null ? navigationEntryI : new c7l(this, knfVar, navigationEntryI);
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final int j() {
        return ((NavigationHistory) this.b).j();
    }

    @Override // defpackage.hoj
    public final void m(SimpleUrlLoader simpleUrlLoader, String str, xnj xnjVar) {
        simpleUrlLoader.b(true, new m25(this, ((v4b) this.b).h(new File((File) this.c, str)), xnjVar, (byte) 3), new wa(xnjVar, (byte) 25));
    }

    @Override // defpackage.hoj
    public final void removeAll() {
        v4b v4bVar = (v4b) this.b;
        mea meaVarListIterator = v4bVar.i(v4bVar.h((File) this.c)).listIterator(0);
        while (true) {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                return;
            } else {
                v4bVar.k((Uri) meaVar.next());
            }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 11:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.b);
                sb.append(' ');
                ArrayList arrayList = (ArrayList) this.c;
                sb.append(arrayList.isEmpty() ? "" : "; ".concat(CollectionsKt.P(arrayList, ";", (CharSequence) null, (String) null, 0, (Function1) null, 62)));
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.opera.android.browser.NavigationHistory
    public final boolean v(int i) {
        return ((NavigationHistory) this.b).v(i);
    }
}
