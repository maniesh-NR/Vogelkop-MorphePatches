package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class npl implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ npl(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        byte b = 1;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                ((wzg) ((w7j) this.b).b).c((w8k) this.c, 3);
                return;
            case 1:
                ((xx1) this.b).run((twl) this.c);
                return;
            case 2:
                ((Callback) this.b).run(new ArrayList((ArrayList) this.c));
                return;
            case 3:
                ((cxl) this.b).run(new ArrayList((ArrayList) this.c));
                return;
            case 4:
                ((Callback) this.b).run((rwl) this.c);
                return;
            case 5:
                ((bf9) this.b).A((String) this.c);
                return;
            case 6:
                bf9 bf9Var = (bf9) this.b;
                zzh zzhVar = (zzh) this.c;
                bf9Var.p = null;
                zzhVar.run(ixl.a);
                return;
            case 7:
                ((ode) ((c5o) this.b).a).r((String) this.c);
                return;
            case 8:
                new fd9((BrowserActivity) ((c5o) this.b).b, 0, 2132022045, (lld) this.c).e();
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                Runnable runnable = (Runnable) this.b;
                op1 op1Var = (op1) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    op1Var.a();
                }
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((d4m) this.c).run((g4m) ((xl) this.b).k);
                return;
            case 11:
                ((Callback) this.c).run((g4m) ((xl) this.b).k);
                return;
            case 12:
                r4m r4mVar = (r4m) this.b;
                String str = (String) this.c;
                y4m y4mVar = r4mVar.b;
                v3m v3mVar = y4mVar.d;
                boolean zG = v3mVar.g();
                plk plkVar = v3mVar.d;
                v3m v3mVar2 = y4mVar.d;
                if (!v3mVar2.g()) {
                    v3mVar2.b.V(1, "translate_web_pages_enabled");
                    v3mVar2.i(v3mVar2.d());
                }
                if (zG && y4mVar.H0(str)) {
                    ((xl) plkVar.b).j(new e4m(plkVar, str, b));
                    return;
                }
                ((xl) plkVar.b).j(new e4m(plkVar, str, objArr == true ? 1 : 0));
                r4m r4mVar2 = y4mVar.f;
                r4mVar2.c0(new o4m(r4mVar2, (byte) 3));
                ghf ghfVar = y4mVar.e;
                j5g j5gVar = new j5g(y4mVar, str, (byte) 24);
                String string = ((Resources) ghfVar.d).getString(2132021567);
                b2l b2lVar = ((k6l) ghfVar.b).o;
                if (b2lVar != null) {
                    ((aal) ghfVar.c).S(new c4m(ghfVar, string, 2132021998, j5gVar), b2lVar, true);
                    return;
                }
                return;
            case 13:
                jnm jnmVar = (jnm) this.b;
                rf7 rf7Var = (rf7) this.c;
                rf7Var.b(jnmVar.d);
                HashSet hashSetM = w1h.m((SharedPreferences) jnmVar.a.get(), "unseen_download_ids");
                if (hashSetM.retainAll(nb6.W(new bql((byte) 6), Collections.unmodifiableList(rf7Var.c)))) {
                    jnmVar.b(hashSetM);
                    jnmVar.c(!hashSetM.isEmpty());
                    return;
                }
                return;
            case 14:
                ((cul) ((lgf) ((cbk) ((z4k) this.b).b).e).i).c((hq8) this.c);
                return;
            case 15:
                ctm ctmVar = (ctm) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ThreadLocal threadLocal = ctmVar.d;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable2.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 16:
                c5j c5jVar = (c5j) this.b;
                ListenableFuture listenableFuture = (ListenableFuture) this.c;
                if (c5jVar.isCancelled()) {
                    listenableFuture.cancel(false);
                    return;
                }
                return;
            case 17:
                d0n d0nVar = (d0n) this.b;
                TextView textView = (TextView) this.c;
                if (d0nVar.g) {
                    PathInterpolator pathInterpolator = d0n.j;
                    uyg.c(textView, textView.getMeasuredHeight() / 3.0f);
                    return;
                }
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                y2n y2nVar = (y2n) this.b;
                if (((mtk) this.c) == y2nVar.s) {
                    y2nVar.L();
                    return;
                }
                return;
            case 19:
                t2n t2nVar = (t2n) this.b;
                q3j q3jVar = (q3j) this.c;
                ((ArrayList) ((p3j) q3jVar).b.e).remove(t2nVar);
                ((p3j) q3jVar).e.remove(t2nVar);
                return;
            case SizeUtil.textSize0 /* 20 */:
                iuh iuhVar = (iuh) this.b;
                h75 h75Var = (h75) this.c;
                mi8 mi8Var = (mi8) iuhVar.c;
                String str2 = tym.a;
                mi8Var.a.H.H(h75Var);
                return;
            case 21:
                iuh iuhVar2 = (iuh) this.b;
                r4n r4nVar = (r4n) this.c;
                mi8 mi8Var2 = (mi8) iuhVar2.c;
                String str3 = tym.a;
                qi8 qi8Var = mi8Var2.a;
                qi8Var.m0 = r4nVar;
                qi8Var.n.i(25, new dl6(r4nVar));
                return;
            case SizeUtil.textSize1 /* 22 */:
                iuh iuhVar3 = (iuh) this.b;
                nj6 nj6Var = (nj6) this.c;
                synchronized (nj6Var) {
                }
                mi8 mi8Var3 = (mi8) iuhVar3.c;
                String str4 = tym.a;
                el6 el6Var = mi8Var3.a.t;
                d11 d11VarR = el6Var.R((jrd) el6Var.d.f);
                el6Var.V(d11VarR, 1020, new uk6(d11VarR, nj6Var));
                return;
            case 23:
                c23 c23Var = (c23) this.b;
                d7l d7lVar = (d7l) this.c;
                c23Var.b = null;
                ucn ucnVar = (ucn) c23Var.c;
                t59 t59VarY = d7lVar.j.y();
                int i = t59VarY != null ? (int) t59VarY.a : 0;
                if (i < 5 || ucnVar.d(d7lVar) || d7lVar.n0()) {
                    return;
                }
                ucnVar.b(new tcn(ucnVar, i, d7lVar.j.m()));
                return;
            case SizeUtil.textSize2 /* 24 */:
                ((nkn) this.b).G0((FadingRecyclerView) this.c);
                return;
            case 25:
                ((gln) this.b).e((ArrayList) this.c);
                return;
            case 26:
                s14 s14Var = (s14) this.b;
                Iterator it = ((List) this.c).iterator();
                while (it.hasNext()) {
                    try {
                        File fileB = s14Var.B((String) it.next());
                        File file = new File((File) s14Var.c, kln.h(new String(s29.h(fileB), StandardCharsets.UTF_8)).b);
                        if (!fileB.delete()) {
                            file.delete();
                        }
                    } catch (IOException | JSONException unused) {
                    }
                }
                return;
            case 27:
                ((s14) this.b).G((Runnable) this.c);
                return;
            case 28:
                qln qlnVar = (qln) this.b;
                String str5 = (String) this.c;
                if (((List) ((kze) ((s14) qlnVar.f.d).f).g()).isEmpty() && qlnVar.f().equals("local_dir")) {
                    qlnVar.o(false);
                    qlnVar.n("most_popular");
                }
                if (qlnVar.i().equals(str5)) {
                    SettingsManager settingsManager = qlnVar.e;
                    y9j y9jVar = settingsManager.a;
                    if (y9jVar.contains("wallpaper_current")) {
                        y9jVar.remove("wallpaper_current");
                        settingsManager.Q("wallpaper_current");
                        return;
                    }
                    return;
                }
                return;
            default:
                ((tln) this.b).G0((FadingRecyclerView) this.c);
                return;
        }
    }
}
