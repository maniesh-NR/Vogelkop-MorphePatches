package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.internal.j;
import com.opera.android.Lazy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.chromium.base.LocaleUtils;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class q6e implements w6f {
    public final iri b;
    public final wzg c;
    public final Resources e;
    public final kze f;
    public final ode g;
    public final k6e h;
    public final jbf i;
    public final b59 j;
    public final umi k;
    public final qie l;
    public final p1 m;
    public final Lazy n;
    public final x5f o;
    public final i3j p;
    public final ArrayList a = new ArrayList();
    public final h7f d = new h7f();

    public q6e(Context context, umi umiVar, nx5 nx5Var, wjh wjhVar, jbf jbfVar, plh plhVar, iri iriVar, uu1 uu1Var, kze kzeVar, ode odeVar, Lazy lazy, x5f x5fVar, k6e k6eVar) {
        qie qieVar = new qie((byte) 19);
        this.l = qieVar;
        wub wubVar = new wub(this);
        this.k = umiVar;
        Resources resources = context.getResources();
        this.e = resources;
        this.f = kzeVar;
        this.g = odeVar;
        this.h = k6eVar;
        this.i = jbfVar;
        wzg wzgVar = new wzg(resources, uu1Var);
        this.c = wzgVar;
        final byte b = 0;
        this.j = w1h.l(context, umiVar, "search engine manager", new bg1[0]);
        this.b = iriVar;
        p1 p1Var = new p1(jbfVar);
        this.m = p1Var;
        this.n = lazy;
        this.o = x5fVar;
        this.p = new i3j(context, new q4b(this, (byte) 28), new vg4(context, (byte) 14), umiVar);
        xf8.h0(kzeVar, new f7f(this) { // from class: o6e
            public final /* synthetic */ q6e b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                q6e q6eVar = this.b;
                switch (b2) {
                    case 0:
                        if (q6eVar.j()) {
                            q6eVar.l();
                            break;
                        }
                        break;
                    default:
                        if (q6eVar.j()) {
                            q6eVar.l();
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        xf8.h0(odeVar, new f7f(this) { // from class: o6e
            public final /* synthetic */ q6e b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                q6e q6eVar = this.b;
                switch (b22) {
                    case 0:
                        if (q6eVar.j()) {
                            q6eVar.l();
                            break;
                        }
                        break;
                    default:
                        if (q6eVar.j()) {
                            q6eVar.l();
                            break;
                        }
                        break;
                }
            }
        });
        jbfVar.F(new vy(this, (byte) 7));
        nml nmlVarE = umiVar.e(new m6e(this, b));
        nmlVarE.b(umiVar.f(new m6e(this, b2)));
        qieVar.n(new oml(nmlVarE), null);
        new ych(context, nx5Var, wjhVar, wzgVar, p1Var, k6eVar, wubVar, plhVar);
    }

    public static String e(eri eriVar) {
        String url = eriVar.getUrl();
        if (url.isEmpty()) {
            return null;
        }
        return Uri.parse(url).getHost();
    }

    @Override // defpackage.w6f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void F(kri kriVar) {
        this.d.b(kriVar);
        if (this.a.isEmpty()) {
            return;
        }
        kriVar.a(this);
    }

    public final eri b() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            eri.a.getClass();
            return cri.b;
        }
        long j = ((SharedPreferences) this.j.get()).getLong("default_search_engine_long", -1L);
        l6e l6eVarC = j < 0 ? null : c(j);
        if (l6eVarC != null) {
            return l6eVarC;
        }
        l6e l6eVar = (l6e) arrayList.get(0);
        int i = l6eVar.h;
        if (i == 1 || i == 2) {
            return l6eVar;
        }
        eri.a.getClass();
        return cri.b;
    }

    public final l6e c(long j) {
        if (j == -1) {
            return null;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l6e l6eVar = (l6e) obj;
            if (l6eVar.b == j) {
                return l6eVar;
            }
        }
        return null;
    }

    public final l6e f(eri eriVar) {
        l6e l6eVar;
        l6e l6eVar2;
        l6e l6eVarC = c(eriVar.getId());
        if (l6eVarC != null) {
            return l6eVarC;
        }
        String title = eriVar.getTitle();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            l6eVar = null;
            if (i2 >= size) {
                l6eVar2 = null;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            l6eVar2 = (l6e) obj;
            if (TextUtils.equals(l6eVar2.c, title)) {
                break;
            }
        }
        String strE = e(eriVar);
        if (strE != null) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                l6e l6eVar3 = (l6e) obj2;
                if (strE.equals(e(l6eVar3))) {
                    l6eVar = l6eVar3;
                    break;
                }
            }
        }
        return (l6eVar2 == l6eVar || l6eVar2 != null || l6eVar == null) ? l6eVar2 : l6eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(boolean z) {
        l6e iu4Var;
        ArrayList arrayList = this.a;
        int i = 0;
        Object[] objArr = 0;
        if (!arrayList.isEmpty()) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    i2 = -1;
                    break;
                }
                if (((l6e) arrayList.get(i2)).b == 9223372036854775804L) {
                    break;
                }
                i2++;
            }
            byte b = 1;
            if (z) {
                if (i2 == -1) {
                    if (!l6e.p("https://chatgpt.com/?q=%s")) {
                        String[] strArr = wqm.a;
                        String[] strArrSplit = aik.g("https://chatgpt.com/?q=%s").split("\\.");
                        int length = strArrSplit.length;
                        while (true) {
                            if (i >= length) {
                                hr5 hr5Var = l6e.k;
                                iu4Var = new iu4(4, "ChatGPT", "https://chatgpt.com/?q=%s", "ic_search_engine_chatgpt", null);
                                break;
                            }
                            if ("yandex".equals(strArrSplit[i])) {
                                iu4Var = new fco(4, "ChatGPT", "https://chatgpt.com/?q=%s", "ic_search_engine_chatgpt", null);
                                break;
                            }
                            i++;
                        }
                    } else {
                        k6e k6eVar = this.h;
                        iu4Var = new f1a("ChatGPT", "https://chatgpt.com/?q=%s", "ic_search_engine_chatgpt", null, 4, new i6e(k6eVar, objArr == true ? 1 : 0), new i6e(k6eVar, b));
                    }
                    iu4Var.i = this.c;
                    iu4Var.b = 9223372036854775804L;
                    if (arrayList.size() >= 2) {
                        arrayList.add(2, iu4Var);
                        return true;
                    }
                    arrayList.add(iu4Var);
                    return true;
                }
            } else if (i2 != -1) {
                arrayList.remove(i2);
                return true;
            }
        }
        return false;
    }

    public final ArrayList h(iri iriVar) throws XmlPullParserException, IOException {
        wzg wzgVar = this.c;
        p1 p1Var = this.m;
        k6e k6eVar = this.h;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(1);
        boolean zEquals = ((String) this.n.get()).toLowerCase(Locale.US).equals("ru");
        Resources resources = this.e;
        XmlResourceParser xml = zEquals ? resources.getXml(2132279304) : resources.getXml(2132279303);
        try {
            xml.next();
            xml.require(0, null, null);
            xml.next();
            xml.require(2, null, "search");
            while (xml.next() != 1) {
                if (xml.getEventType() == 2) {
                    j6e j6eVarI = x1p.I(xml, wzgVar, p1Var, k6eVar);
                    int i = j6eVarI.a.h;
                    if (i == 1 || i == 2) {
                        arrayList2.add(j6eVarI);
                    } else {
                        arrayList.add(j6eVarI);
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        arrayList2.addAll(arrayList);
        return iriVar.m(arrayList2);
    }

    public final void i(eri eriVar) {
        String strE = e(eriVar);
        if (strE != null) {
            if (eriVar.d()) {
                strE = "u_".concat(strE);
            }
            x5f x5fVar = this.o;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                b66 b66VarF = x56VarF.F(zpaVar);
                b66VarF.getClass();
                b66VarF.q(8, 1, strE);
                x5fVar.U0(x56VarF);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() throws Resources.NotFoundException {
        l6e l42Var;
        ArrayList arrayList = this.a;
        int i = 0;
        Object[] objArr = 0;
        if (!arrayList.isEmpty()) {
            byte b = 9;
            if (!((Boolean) this.f.g()).booleanValue()) {
                return arrayList.removeIf(new nn(b));
            }
            l6e l6eVarC = c(9223372036854775805L);
            String str = l6eVarC != null ? l6eVarC.c : null;
            String string = this.e.getString(2132017628);
            if (!string.equals(str)) {
                arrayList.removeIf(new nn(b));
                Uri.Builder builderBuildUpon = Uri.parse("opera-aria://ui/").buildUpon();
                builderBuildUpon.appendQueryParameter("language", LocaleUtils.getDefaultLocaleString());
                String strReplace = builderBuildUpon.build().buildUpon().appendQueryParameter("q", "PLACEHOLDER").build().toString().replace("PLACEHOLDER", "%s");
                byte b2 = 1;
                if (l6e.p(strReplace)) {
                    k6e k6eVar = this.h;
                    l42Var = new f1a(string, strReplace, "ic_ask_ai_engine", null, 4, new i6e(k6eVar, objArr == true ? 1 : 0), new i6e(k6eVar, b2));
                } else {
                    String[] strArr = wqm.a;
                    String[] strArrSplit = aik.g(strReplace).split("\\.");
                    int length = strArrSplit.length;
                    while (true) {
                        if (i >= length) {
                            hr5 hr5Var = l6e.k;
                            l42Var = strReplace.startsWith("opera-aria://ui/") ? new l42(4, string, strReplace, "ic_ask_ai_engine", null) : strReplace.startsWith("https://chatgpt.com/?q") ? new iu4(4, string, strReplace, "ic_ask_ai_engine", null) : new l6e(4, string, strReplace, "ic_ask_ai_engine", null);
                        } else {
                            if ("yandex".equals(strArrSplit[i])) {
                                l42Var = new fco(4, string, strReplace, "ic_ask_ai_engine", null);
                                break;
                            }
                            i++;
                        }
                    }
                }
                l42Var.i = this.c;
                l42Var.b = 9223372036854775805L;
                arrayList.add(1, l42Var);
                return true;
            }
        }
        return false;
    }

    public final void k(eri eriVar) {
        if ((eriVar instanceof l6e) && this.a.contains(eriVar) && eriVar.d() && eriVar.k() == null) {
            l6e l6eVar = (l6e) eriVar;
            this.p.s(l6eVar.d, new jkc(this, l6eVar, (byte) 13));
        }
    }

    public final void l() {
        h7f h7fVar = this.d;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((kri) g7fVarH.next()).a(this);
        }
    }

    @Override // defpackage.w6f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void H(kri kriVar) {
        this.d.c(kriVar);
    }

    public final void n(eri eriVar) {
        int i;
        if (eriVar instanceof l6e) {
            l6e l6eVar = (l6e) eriVar;
            ArrayList arrayList = this.a;
            if (!arrayList.contains(l6eVar) || (i = l6eVar.h) == 1 || i == 2) {
                return;
            }
            SharedPreferences sharedPreferences = (SharedPreferences) this.j.get();
            if (l6eVar.b == sharedPreferences.getLong("default_search_engine_long", -1L)) {
                j.a(sharedPreferences, "default_search_engine_long");
            }
            arrayList.remove(l6eVar);
            this.l.n(new oml(this.k.c(new hpd(this, l6eVar, (byte) 12))), null);
            l();
        }
    }

    public final void o(eri eriVar) {
        if ((eriVar instanceof l6e) && this.a.contains(eriVar)) {
            ((SharedPreferences) this.j.get()).edit().putLong("default_search_engine_long", eriVar.getId()).apply();
            l();
            i(eriVar);
        }
    }
}
