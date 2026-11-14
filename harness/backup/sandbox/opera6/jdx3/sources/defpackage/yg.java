package defpackage;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import com.opera.android.translate_web_pages.NavEntryTranslationDataHelper;
import com.opera.android.translate_web_pages.TranslationData;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class yg extends y08 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public yg(k6l k6lVar, nw3 nw3Var, nw3 nw3Var2) {
        this.a = (byte) 1;
        this.c = new j4c(new uu1((byte) 24), (byte) 0);
        this.d = nw3Var;
        this.e = nw3Var2;
        this.b = true;
        k6lVar.b(this);
    }

    public yg(v3m v3mVar, k6l k6lVar) {
        this.a = (byte) 0;
        this.b = true;
        this.c = v3mVar;
        this.d = new NavEntryTranslationDataHelper(k6lVar);
        k6lVar.a(this);
    }

    public static void W(b2l b2lVar, boolean z) {
        vz5 vz5VarU = ((d7l) b2lVar).j.U();
        if (vz5VarU == null || vz5VarU.c == z) {
            return;
        }
        vz5VarU.c = z;
        if (z) {
            vz5VarU.b();
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        switch (this.a) {
            case 0:
                NavEntryTranslationDataHelper navEntryTranslationDataHelper = (NavEntryTranslationDataHelper) this.d;
                if (!navigationHandle.c) {
                    this.b = false;
                    if (!navigationHandle.h) {
                        W(b2lVar, true);
                        break;
                    } else {
                        vz5 vz5VarU = ((d7l) b2lVar).j.U();
                        if (vz5VarU != null) {
                            navEntryTranslationDataHelper.c(vz5VarU);
                            kze kzeVar = (kze) vz5VarU.f;
                            j5m j5mVar = (j5m) kzeVar.g();
                            Runnable runnable = j5mVar.j;
                            if (runnable != null) {
                                runnable.run();
                                j5mVar.j = null;
                            }
                            kzeVar.r((i5m) vz5VarU.d);
                            vz5VarU.b = -1;
                            r4m r4mVar = (r4m) this.e;
                            if (r4mVar != null) {
                                WebContents webContentsA = navEntryTranslationDataHelper.a();
                                r4mVar.c0(new p4m(r4mVar, vz5VarU, b2lVar, webContentsA == null ? TranslationData.c : (TranslationData) N.MrRsXZ81(webContentsA), (byte) 0));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void G(b2l b2lVar) {
        switch (this.a) {
            case 0:
                vz5 vz5VarU = ((d7l) b2lVar).j.U();
                NavEntryTranslationDataHelper navEntryTranslationDataHelper = (NavEntryTranslationDataHelper) this.d;
                navEntryTranslationDataHelper.c(vz5VarU);
                r4m r4mVar = (r4m) this.e;
                if (r4mVar != null) {
                    WebContents webContentsA = navEntryTranslationDataHelper.a();
                    r4mVar.c0(new p4m(r4mVar, vz5VarU, b2lVar, webContentsA == null ? TranslationData.c : (TranslationData) N.MrRsXZ81(webContentsA), (byte) 1));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        WebContents webContentsA;
        switch (this.a) {
            case 0:
                NavEntryTranslationDataHelper navEntryTranslationDataHelper = (NavEntryTranslationDataHelper) this.d;
                if (!navigationHandle.c) {
                    navEntryTranslationDataHelper.c(((d7l) b2lVar).j.U());
                    if (tjm.I0((v3m) this.c, b2lVar) && (webContentsA = navEntryTranslationDataHelper.a()) != null) {
                        TranslationData translationData = (TranslationData) N.MrRsXZ81(webContentsA);
                        N.MlKxOGph(webContentsA, translationData.a, translationData.b);
                    }
                    W(b2lVar, false);
                    this.b = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void S(d7l d7lVar) {
        switch (this.a) {
            case 0:
                NavEntryTranslationDataHelper navEntryTranslationDataHelper = (NavEntryTranslationDataHelper) this.d;
                vz5 vz5Var = null;
                navEntryTranslationDataHelper.c(null);
                r4m r4mVar = (r4m) this.e;
                if (r4mVar != null) {
                    WebContents webContentsA = navEntryTranslationDataHelper.a();
                    r4mVar.c0(new p4m(r4mVar, vz5Var, d7lVar, webContentsA == null ? TranslationData.c : (TranslationData) N.MrRsXZ81(webContentsA), (byte) 1));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void b(b2l b2lVar, yqa yqaVar) {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    W(b2lVar, true);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void j(b2l b2lVar) {
        int iLastIndexOf;
        boolean zT;
        if0 if0Var;
        switch (this.a) {
            case 1:
                d7l d7lVar = (d7l) b2lVar;
                if (!d7lVar.j.r() && !d7lVar.j.c0()) {
                    String url = d7lVar.j.getUrl();
                    Uri uri = Uri.parse(url);
                    String host = uri.getHost();
                    if (!TextUtils.isEmpty(host) && (iLastIndexOf = host.lastIndexOf(46)) != -1) {
                        int iLastIndexOf2 = host.lastIndexOf(46, iLastIndexOf - 1) + 1;
                        if (iLastIndexOf - iLastIndexOf2 == 7 && host.substring(iLastIndexOf2, iLastIndexOf).equals("booking")) {
                            if (d7lVar.j.m()) {
                                zT = false;
                            } else {
                                ydn ydnVarR = ((nw3) this.d).b.R();
                                vdn vdnVar = ydnVarR.d;
                                zT = (vdnVar.a && vdnVar.a()) ? ydnVarR.t(url) : true;
                            }
                            if (zT) {
                                boolean zMatches = ((Pattern) ((j4c) this.c).get()).matcher(url).matches();
                                if (zMatches && this.b) {
                                    N.MKxMLHJx();
                                }
                                String queryParameter = uri.getQueryParameter("aid");
                                if (queryParameter == null) {
                                    queryParameter = null;
                                } else {
                                    int iIndexOf = queryParameter.indexOf(59);
                                    if (iIndexOf != -1) {
                                        queryParameter = queryParameter.substring(0, iIndexOf);
                                    }
                                }
                                orm ormVar = (orm) ((nw3) this.e).get();
                                boolean zEquals = "1759515".equals(queryParameter);
                                x5f x5fVar = (x5f) ormVar;
                                if (x5fVar.h) {
                                    zpa zpaVar = x5fVar.d;
                                    if (queryParameter == null) {
                                        queryParameter = "missing";
                                    }
                                    x56 x56VarF = zpa.F();
                                    m80 m80VarX = x56VarF.E(zpaVar).x(zpaVar);
                                    if (zMatches) {
                                        m80VarX.e(!zEquals ? 1 : 0);
                                    } else {
                                        m80VarX.e(zEquals ? 2 : 3);
                                    }
                                    Map map = (Map) m80VarX.n(4);
                                    if (map == null || map.isEmpty()) {
                                        HashMap map2 = new HashMap();
                                        m80VarX.q(4, 1, map2);
                                        if0Var = new if0(m80VarX, 4, map2);
                                    } else {
                                        if0Var = new if0(m80VarX, 4, map);
                                    }
                                    t80 t80Var = (t80) if0Var.get(queryParameter);
                                    if (t80Var == null) {
                                        t80Var = new t80(2443, -1, 2);
                                        if0Var.put(queryParameter, t80Var);
                                    }
                                    t80Var.e(!zMatches ? 1 : 0);
                                    x5fVar.U0(x56VarF);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
