package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.view.MenuItem;
import android.view.View;
import com.opera.android.OperaApplication;
import com.opera.android.downloads.DownloadItem;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class jg7 implements View.OnClickListener, View.OnLongClickListener {
    public final wg7 a;
    public final rf7 b;
    public final tzi c;
    public final zg7 d;
    public final ze7 e;
    public final UndoBar f;
    public final g1j g;
    public final jv0 h;
    public final orm i;
    public final vwh j;
    public final HashSet k = new HashSet();

    public jg7(wg7 wg7Var, tzi tziVar, rf7 rf7Var, zg7 zg7Var, ze7 ze7Var, UndoBar undoBar, vwh vwhVar, g1j g1jVar, jv0 jv0Var, orm ormVar) {
        this.a = wg7Var;
        this.c = tziVar;
        this.b = rf7Var;
        this.d = zg7Var;
        this.e = ze7Var;
        this.f = undoBar;
        this.j = vwhVar;
        this.g = g1jVar;
        this.h = jv0Var;
        this.i = ormVar;
    }

    public static u92 a(re7 re7Var) {
        Uri uriG = re7Var.g();
        if (uriG == null) {
            return null;
        }
        String strF = re7Var.f();
        o29 o29VarG = rf7.g(re7Var);
        String strD = s29.d(strF);
        String str = re7Var.m;
        Set set = u92.e;
        if (vtp.a0(Long.valueOf(re7Var.j), str, o29VarG)) {
            return new u92(uriG, o29VarG, str, strD);
        }
        return null;
    }

    public static void b(Context context, re7 re7Var, Runnable runnable, ue7 ue7Var) {
        dx3 dx3VarP;
        if (!re7Var.A || (dx3VarP = q9n.p(context)) == null) {
            runnable.run();
            return;
        }
        rxh rxhVar = new rxh(2132018697);
        ws1 ws1Var = new ws1(dx3VarP, re7Var, runnable, ue7Var, (byte) 5);
        z77 z77Var = (z77) dx3VarP.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = null;
        gkjVar.e = null;
        gkjVar.f = null;
        gkjVar.g = null;
        gkjVar.h = ws1Var;
        gkjVar.i = null;
        gkjVar.j = null;
        gkjVar.k = 2132018696;
        gkjVar.l = 2132018111;
        gkjVar.m = 2132018698;
        gkjVar.n = true;
        gkjVar.o = rxhVar;
        z77Var.getClass();
        z77Var.b(gkjVar, ijm.b);
    }

    public final ArrayList c() {
        tzi tziVar = this.c;
        ArrayList arrayList = new ArrayList(((LinkedHashSet) tziVar.a.c).size());
        Iterator it = Collections.unmodifiableSet((LinkedHashSet) tziVar.a.c).iterator();
        while (it.hasNext()) {
            re7 re7VarI = this.e.I(((Long) it.next()).longValue());
            if (re7VarI != null) {
                arrayList.add(re7VarI);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        wg7 wg7Var = this.a;
        if (itemId == 2131362609) {
            View viewFindViewById = wg7Var.getView().findViewById(menuItem.getItemId());
            if (viewFindViewById != null) {
                new xw(wg7Var.L0(), new ig7(this)).o(viewFindViewById);
                return true;
            }
        } else {
            int itemId2 = menuItem.getItemId();
            orm ormVar = this.i;
            byte b = 0;
            int i = 0;
            if (itemId2 == 2131362605) {
                ArrayList arrayListC = c();
                int size = arrayListC.size();
                while (i < size) {
                    Object obj = arrayListC.get(i);
                    i++;
                    ((x5f) ormVar).O(oc0.f, ((re7) obj).c());
                }
                g(arrayListC, true);
                return true;
            }
            if (menuItem.getItemId() == 2131362608) {
                ArrayList arrayListC2 = c();
                int size2 = arrayListC2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListC2.get(i2);
                    i2++;
                    ((x5f) ormVar).O(oc0.d, ((re7) obj2).c());
                }
                g(arrayListC2, false);
                return true;
            }
            byte b2 = 2;
            if (menuItem.getItemId() == 2131362607 || menuItem.getItemId() == 2131362606) {
                ArrayList arrayListC3 = c();
                egd[] egdVarArr = new egd[arrayListC3.size()];
                for (int i3 = 0; i3 < arrayListC3.size(); i3++) {
                    egdVarArr[i3] = new egd((re7) arrayListC3.get(i3));
                }
                Context context = wg7Var.getContext();
                String[] strArr = OperaApplication.K;
                tjg tjgVarX = ((OperaApplication) context.getApplicationContext()).x();
                if (menuItem.getItemId() == 2131362607) {
                    ujc ujcVar = tjgVarX.i;
                    if (((gk9) ujcVar).b.getShuffleModeEnabled()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < ujcVar.p(); i4++) {
                            arrayList.add(ujcVar.Q(i4));
                        }
                        ArrayList arrayListC4 = w7d.C(ujcVar);
                        if (ujcVar.getShuffleModeEnabled()) {
                            uup.k(new evc(arrayList, arrayListC4), true).a(new qie((Object) tjgVarX, (byte) 8));
                            ujcVar.setShuffleModeEnabled(false);
                        }
                    }
                    tjgVarX.e(egdVarArr, new kjg(tjgVarX, b));
                } else {
                    tjgVarX.e(egdVarArr, new kjg(tjgVarX, b2));
                }
                this.c.d();
                return true;
            }
            if (menuItem.getItemId() != 2131362604) {
                return false;
            }
            List list = (List) c().stream().map(new mn((byte) 3)).filter(new nn(b2)).collect(Collectors.toList());
            if (!list.isEmpty()) {
                ArrayList arrayListC5 = c();
                int size3 = arrayListC5.size();
                while (b < size3) {
                    ((x5f) ormVar).O(oc0.m, ((re7) arrayListC5.get(b)).c());
                    b++;
                }
                wg7Var.g0();
                this.h.j(list, x92.c);
            }
        }
        return true;
    }

    public final void e(re7 re7Var, String str) {
        dd7 dd7VarE;
        Uri uriRenameDocument;
        this.b.getClass();
        boolean zK = re7Var.k();
        vwh vwhVar = this.j;
        if (!zK || str == null) {
            vwhVar.f(new glj(2132019064, 2500));
            return;
        }
        if (re7Var.f().equals(str)) {
            return;
        }
        DownloadItem downloadItem = re7Var.t;
        try {
            dd7VarE = re7Var.e();
        } catch (Exception unused) {
        }
        if (dd7VarE.i().getScheme().equals("file")) {
            if (dd7VarE.k(str)) {
                re7Var.x(str);
                downloadItem.d(dd7VarE.i().toString());
                re7Var.e = dd7VarE.i();
                ((ysi) this.d.b).l();
                return;
            }
            vwhVar.f(new glj(2132019064, 2500));
        }
        if (dd7VarE.i().getScheme().equals("content") && (uriRenameDocument = DocumentsContract.renameDocument(re7Var.a.d.b.getContentResolver(), dd7VarE.i(), str)) != null) {
            re7Var.x(str);
            downloadItem.d(uriRenameDocument.toString());
            re7Var.e = uriRenameDocument;
            ((ysi) this.d.b).l();
            return;
        }
        vwhVar.f(new glj(2132019064, 2500));
    }

    public final void f(Uri uri, String str) {
        Context context = this.a.getContext();
        String[] strArr = aik.a;
        if (str == null) {
            str = "";
        }
        new ghf(new i4d(new vvf(uri, str, (byte) 19))).I(context);
    }

    public final void g(List list, boolean z) {
        if (z) {
            this.k.addAll(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((re7) it.next()).s();
        }
        int i = z ? 2131886118 : 2131886119;
        UndoBar undoBar = this.f;
        undoBar.e(i);
        mgh mghVar = undoBar.c;
        if (list.isEmpty()) {
            return;
        }
        mghVar.f();
        undoBar.g = true;
        e5d e5dVarN = undoBar.e.N(list);
        ArrayList arrayList = (ArrayList) e5dVarN.c;
        if (!arrayList.isEmpty()) {
            mhk mhkVar = (mhk) mghVar.b;
            int size = arrayList.size();
            mkm mkmVar = new mkm(e5dVarN, size);
            mhkVar.b += size;
            ((LinkedList) mhkVar.c).add(mkmVar);
            undoBar.f();
            ami amiVar = undoBar.b;
            gtj gtjVar = (gtj) amiVar.c;
            if (gtjVar == null) {
                ((vwh) amiVar.b).f(new qt(amiVar));
            } else {
                amiVar.A(gtjVar);
                ((gtj) amiVar.c).j();
            }
        }
        undoBar.g = false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        re7 re7Var = view.getTag() instanceof re7 ? (re7) view.getTag() : null;
        if (this.a.m != null) {
            this.c.a.d(re7Var.o);
            return;
        }
        byte b = 2;
        if (view.getId() == 2131362577) {
            new nf7(re7Var, new x77(this, re7Var, view, b), this.g, this.h).p(view);
            return;
        }
        if (re7Var != null) {
            Context context = view.getContext();
            int iA = vep.A(re7Var.f);
            if (iA == 0) {
                re7Var.s();
                return;
            }
            if (iA == 1) {
                re7Var.u();
                return;
            }
            boolean z = false;
            if (iA != 2) {
                if (iA == 3) {
                    ((x5f) this.i).O(oc0.b, re7Var.c());
                    b(context, re7Var, new gg7(this, re7Var, context, false, (byte) 0), new hg7(this, context, z));
                    return;
                }
                return;
            }
            if (!re7Var.C()) {
                re7Var.u();
                return;
            }
            qxh qxhVar = new qxh(((Object) context.getString(2132018599)) + "\n\n" + ((Object) context.getString(2132018600)));
            uk6 uk6Var = new uk6((Object) re7Var, (byte) 14);
            z77 z77Var = (z77) context.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
            gkj gkjVar = new gkj(false, false);
            gkjVar.a = null;
            gkjVar.b = null;
            gkjVar.c = null;
            gkjVar.d = null;
            gkjVar.e = null;
            gkjVar.f = null;
            gkjVar.g = null;
            gkjVar.h = uk6Var;
            gkjVar.i = null;
            gkjVar.j = null;
            gkjVar.k = 2132020924;
            gkjVar.l = 2132018111;
            gkjVar.m = 2132018605;
            gkjVar.n = true;
            gkjVar.o = qxhVar;
            z77Var.getClass();
            z77Var.b(gkjVar, ijm.b);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        re7 re7Var = view.getTag() instanceof re7 ? (re7) view.getTag() : null;
        if (re7Var == null) {
            return false;
        }
        this.c.a.d(re7Var.o);
        return true;
    }
}
