package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.opera.android.custom_views.FitWindowsFrameLayoutWithToolbar;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.api.Callback;
import com.opera.hype.image.editor.TextBoxEditText;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class bm8 implements vlf, nl5, n5o, m9n, bcf, wf3, dwa, OnFailureListener, OnSuccessListener, ii2, mm9, ouh, Continuation, lva, tam, v2p, qnb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bm8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void X(Bundle bundle, String str) {
        eof eofVar = (eof) this.b;
        if ("FinishAccountSetupAuthPortalFragment_request".equals(str)) {
            eofVar.run(bundle);
        }
    }

    @Override // defpackage.lva
    public final void a(d5j d5jVar) {
        ((j3e) this.b).a(d5jVar);
    }

    public final void accept(Object obj) {
        ga6 ga6Var = (ga6) this.b;
        vho vhoVar = (vho) obj;
        if (vhoVar.a().j == dro.b) {
            w06 w06Var = vhoVar.a;
            w06 w06Var2 = w06.h;
            w06 w06Var3 = w06.b;
            if (w06Var == w06Var3 || w06Var == w06Var2) {
                xho xhoVar = vhoVar.a().a;
                zgb zgbVar = new zgb((chb) ga6Var.b, (byte) 3);
                String str = xhoVar.c;
                w06 w06Var4 = xhoVar.a;
                if ((w06Var4 != w06Var3 && w06Var4 != w06Var2) || TextUtils.isEmpty(str)) {
                    zgbVar.l(Boolean.FALSE);
                    return;
                }
                HashMap map = fip.a;
                fip.a((Context) phf.a.a, str, 32, 32, vhp.b, new smo(zgbVar, (byte) 2));
            }
        }
    }

    @Override // defpackage.nl5
    public final void b(int i) {
        ((im8) this.b).onResult(Boolean.valueOf(i == 1));
    }

    public final void d() {
        ((cd5) this.b).j0(Unit.a);
    }

    public final long e(long j) {
        return tym.j((j * r8.e) / 1000000, 0L, ((u69) this.b).j - 1);
    }

    @Override // defpackage.ii2
    public final void f(int i) {
        rma rmaVar = (rma) this.b;
        int i2 = rmaVar.b;
        if (i2 == 0 || i2 != 5) {
            return;
        }
        rmaVar.b = 0;
        rmaVar.i = null;
        ((q65) rmaVar.h).S();
        bf9 bf9Var = (bf9) rmaVar.d;
        pc9 pc9VarQ = bf9Var.q();
        if (pc9VarQ != null) {
            bf9Var.p(null, new dg7(pc9VarQ, (byte) 26));
        }
        cd9 cd9Var = (cd9) rmaVar.f;
        cd9Var.getClass();
        cd9Var.z0(new oc4((Object) cd9Var, i, (byte) 2));
    }

    public final Object g(Object obj) {
        byte b = this.a;
        oq8 oq8VarW = null;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                try {
                    return s29.i((File) ((r9i) obj2).d);
                } catch (IOException unused) {
                    return null;
                }
            case 3:
                rn9 rn9Var = (rn9) obj2;
                rq8 rq8Var = (rq8) rn9Var.c;
                String str = (String) obj;
                if (str != null) {
                    nq8 nq8Var = (nq8) rn9Var.d;
                    try {
                        oq8VarW = x7d.w(str, nq8Var.a, nq8Var.c);
                    } catch (JSONException unused2) {
                    }
                    rq8Var.b(oq8VarW);
                } else if (rn9Var.b) {
                    rq8Var.b(null);
                }
                return Unit.a;
            case 11:
                Long l = (Long) obj;
                Callback callback = (Callback) ((mgh) obj2).c;
                if (callback != null) {
                    callback.run(l);
                }
                return null;
            case 13:
                cd9 cd9Var = (cd9) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    cd9Var.s = null;
                }
                cd9Var.r = bitmap;
                cd9Var.q = null;
                cd9Var.n = 2;
                cd9Var.t = null;
                cd9Var.y0();
                return null;
            case 25:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                PackageManager packageManager = ((uab) obj2).a.getPackageManager();
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
                ArrayList arrayList = new ArrayList();
                for (ApplicationInfo applicationInfo : installedApplications) {
                    wt1 wt1Var = (zBooleanValue || !((applicationInfo.flags & 1) == 1)) ? new wt1(packageManager, applicationInfo) : null;
                    if (wt1Var != null) {
                        arrayList.add(wt1Var);
                    }
                }
                return CollectionsKt.c0(new au9((byte) 4), arrayList);
            default:
                ((tu) obj2).run((List) obj);
                return Unit.a;
        }
    }

    public final void h(long j, g1g g1gVar) {
        rm5.m(j, g1gVar, ((wn9) this.b).K);
    }

    @Override // defpackage.m9n
    public final void j() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((ar8) obj).p0();
                break;
            case 15:
                ((Function0) obj).invoke();
                break;
            default:
                ((can) ((x79) obj).a).b(true);
                break;
        }
    }

    @Override // defpackage.tam
    public final uam k(TextBoxEditText textBoxEditText) {
        lxa lxaVar = (lxa) this.b;
        return new w7j(textBoxEditText, lxaVar.h, p7n.a(lxaVar));
    }

    public final g3o l0(View view, g3o g3oVar) throws Resources.NotFoundException {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                FitWindowsFrameLayoutWithToolbar fitWindowsFrameLayoutWithToolbar = (FitWindowsFrameLayoutWithToolbar) obj;
                int i = FitWindowsFrameLayoutWithToolbar.c;
                r9b r9bVarI = g3oVar.a.i(647);
                int i2 = r9bVarI.b;
                fitWindowsFrameLayoutWithToolbar.a = i2;
                View view2 = fitWindowsFrameLayoutWithToolbar.b;
                if (view2 != null) {
                    view2.setPadding(0, i2, 0, 0);
                }
                fitWindowsFrameLayoutWithToolbar.setPadding(r9bVarI.a, 0, r9bVarI.c, r9bVarI.d);
                return g3oVar;
            default:
                ywa ywaVar = (ywa) obj;
                xtb[] xtbVarArr = ywa.g;
                int dimensionPixelSize = ywaVar.getResources().getDimensionPixelSize(2131165807);
                int dimensionPixelSize2 = ywaVar.getResources().getDimensionPixelSize(2131165815);
                so5 so5Var = new so5();
                so5Var.d(ywaVar.h0().a);
                r9b r9bVarI2 = g3oVar.a.i(519);
                int i3 = dimensionPixelSize + r9bVarI2.b;
                so5Var.n(ywaVar.h0().d.getId(), 3, i3);
                so5Var.n(ywaVar.h0().b.getId(), 3, i3);
                int i4 = dimensionPixelSize2 + r9bVarI2.d;
                h58 h58Var = nsl.l;
                w4 w4VarE = sko.e(h58Var, h58Var);
                while (w4VarE.hasNext()) {
                    nsl nslVar = (nsl) w4VarE.next();
                    ConstraintLayout constraintLayout = ywaVar.h0().a;
                    int i5 = nslVar.a;
                    WeakHashMap weakHashMap = r5n.a;
                    so5Var.n(((ImageView) ((View) m5n.f(constraintLayout, i5))).getId(), 4, i4);
                }
                so5Var.a(ywaVar.h0().a);
                int i6 = Build.VERSION.SDK_INT;
                t2o t2oVar = i6 >= 36 ? new t2o(g3oVar) : i6 >= 35 ? new s2o(g3oVar) : i6 >= 34 ? new r2o(g3oVar) : i6 >= 31 ? new q2o(g3oVar) : i6 >= 30 ? new p2o(g3oVar) : new o2o(g3oVar);
                t2oVar.d(519, r9b.c(r9bVarI2.a, 0, r9bVarI2.c, 0));
                return t2oVar.b();
        }
    }

    public final void onFailure(Exception exc) {
        ((g89) this.b).o.i(znm.a);
    }

    public final void onSuccess(Object obj) {
        ((tu7) this.b).invoke(obj);
    }

    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 28:
                ((tom) obj).close();
                break;
            default:
                mnb mnbVar = (mnb) obj;
                pnb pnbVar = mnbVar.d;
                if (pnbVar.f.compareAndSet(1, 4)) {
                    mnbVar.a.onResponseStarted(pnbVar, pnbVar.o);
                    break;
                }
                break;
        }
    }

    public final Object then(Task task) {
        Exception exception;
        x79 x79Var = (x79) this.b;
        x79Var.getClass();
        if (task.isSuccessful() || (exception = task.getException()) == null || TextUtils.isEmpty(exception.getMessage()) || !exception.getMessage().contains("FID_ALREADY_USED:")) {
            return task;
        }
        ((y49) x79Var.c).c.s().delete();
        return x79Var.R();
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        ((dm8) this.b).s.V(z ? 1 : 0, "page_menu_show_open_in_external_app");
    }
}
