package defpackage;

import android.text.TextUtils;
import com.leanplum.Leanplum;
import com.opera.android.BrowserActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class w43 extends y08 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public w43(b4b b4bVar, r9c r9cVar, k6l k6lVar) {
        this.a = (byte) 1;
        this.b = new HashSet();
        this.c = b4bVar;
        this.d = r9cVar;
        if (r9cVar.a) {
            k6lVar.a(this);
        }
    }

    public w43(BrowserActivity browserActivity, k6l k6lVar, pde pdeVar) {
        boolean z = false;
        this.a = (byte) 0;
        this.b = k6lVar;
        this.c = pdeVar;
        aib.A(k6lVar.w, browserActivity.getLifecycle(), this, new oc2(this, (byte) 8));
        pdeVar.j(browserActivity, new k9((Object) this, (byte) 11));
        b2l b2lVar = k6lVar.o;
        if (b2lVar != null && (!((d7l) b2lVar).n0() || ((Integer) pdeVar.g()).intValue() > 0)) {
            z = true;
        }
        this.d = new kze(Boolean.valueOf(z));
    }

    public w43(k6l k6lVar, hd hdVar, uk6 uk6Var) {
        this.a = (byte) 2;
        this.d = new HashSet();
        this.b = hdVar;
        this.c = uk6Var;
        k6lVar.b(this);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        switch (this.a) {
            case 0:
                W(b2lVar);
                break;
            case 1:
                d7l d7lVar = (d7l) b2lVar;
                if (!d7lVar.o0()) {
                    String url = d7lVar.j.getUrl();
                    HashSet hashSet = (HashSet) this.b;
                    String strI = wqm.i(url);
                    if (!TextUtils.isEmpty(strI)) {
                        String lowerCase = strI.toLowerCase(Locale.US);
                        a4b a4bVar = (a4b) ((b4b) this.c).i();
                        if (!a4bVar.a.isEmpty()) {
                            ArrayList arrayListR = aik.r(false, lowerCase, '.');
                            for (z3b z3bVar : a4bVar.a) {
                                String str = z3bVar.b;
                                if (!hashSet.contains(str)) {
                                    List list = z3bVar.a;
                                    int size = arrayListR.size() - 1;
                                    int size2 = list.size() - 1;
                                    if (size2 <= size) {
                                        while (true) {
                                            int i = size - 1;
                                            int i2 = size2 - 1;
                                            if (!((String) arrayListR.get(size)).equals(list.get(size2))) {
                                                break;
                                            }
                                            if (i2 < 0) {
                                                ((r9c) this.d).getClass();
                                                Leanplum.track(str);
                                                hashSet.add(str);
                                            } else {
                                                size = i;
                                                size2 = i2;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
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
                W(b2lVar);
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void I(b2l b2lVar) {
        String strI0;
        switch (this.a) {
            case 2:
                d7l d7lVar = (d7l) b2lVar;
                if (((HashSet) this.d).add(Integer.valueOf(d7lVar.j.getId())) && (strI0 = d7lVar.i0()) != null && ((mu6) ((uk6) this.c).b).a(b2lVar, strI0)) {
                    hd hdVar = (hd) this.b;
                    if (hdVar.b) {
                        String strG = aik.g(strI0);
                        if (strG.length() == 0) {
                            strG = null;
                        }
                        if (strG != null) {
                            n9a n9aVar = (n9a) hdVar.d;
                            w56 w56VarO = n9a.o();
                            new bk0(n9aVar, w56VarO).a(strG, new w5f((byte) 11));
                            if (!((mgh) hdVar.g).c(w56VarO)) {
                                new rml(Unit.a, (umi) hdVar.c).a(new o5f((Object) hdVar, (byte) 18)).m((qie) hdVar.f);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void R(d7l d7lVar) {
        switch (this.a) {
            case 2:
                ((HashSet) this.d).remove(Integer.valueOf(d7lVar.j.getId()));
                break;
        }
    }

    public final void W(b2l b2lVar) {
        boolean z = b2lVar != null && (!((d7l) b2lVar).n0() || ((Integer) ((pde) this.c).g()).intValue() > 0);
        kze kzeVar = (kze) this.d;
        if (z == ((Boolean) kzeVar.g()).booleanValue()) {
            return;
        }
        kzeVar.r(Boolean.valueOf(z));
    }
}
