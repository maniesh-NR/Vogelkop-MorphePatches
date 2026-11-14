package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.leanplum.internal.ResourceQualifiers;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.bar.AutocompleteHelper$Callback;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.custom_views.SystemBarsBottomPlaceholderView;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class crk implements bcf, av4, mm9, ih4, lr8, n5o, ykj, ssl, h93, urg, hh4, h6f, yyk, AutocompleteHelper$Callback, ouh {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ crk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.av4
    public final void E(CheckBox checkBox) {
        ((jm9) this.b).c.setEnabled(checkBox.n);
    }

    public final void X(Bundle bundle, String str) {
        ((gil) this.b).invoke(Boolean.valueOf(bundle.getInt("result_code") == -1));
    }

    @Override // defpackage.lr8
    public final boolean a(String str) {
        syk sykVar = (syk) this.b;
        if (!str.startsWith("ofa://ui/")) {
            return false;
        }
        Context contextRequireContext = sykVar.requireContext();
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) contextRequireContext.getApplicationContext()).o().c(str, p6l.a) != null;
    }

    @Override // defpackage.ih4
    public final void cancel() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((CancellationSignal) obj).cancel();
                break;
            case 19:
                bf9 bf9Var = (bf9) obj;
                h5k h5kVar = bf9Var.q;
                if (h5kVar != null) {
                    ((q65) h5kVar.c).S();
                    bf9Var.q = null;
                    break;
                }
                break;
            default:
                ((j5m) obj).j = null;
                break;
        }
    }

    @Override // defpackage.h6f
    public final void d(boolean z, boolean z2) {
        x5f x5fVar = ((pom) this.b).c;
        if (x5fVar.h) {
            x5fVar.Z(null, z, z2);
        }
    }

    @Override // defpackage.yyk
    public final Object execute() {
        ydi ydiVar = (ydi) ((ks3) this.b).i;
        SQLiteDatabase sQLiteDatabaseH = ydiVar.h();
        sQLiteDatabaseH.beginTransaction();
        try {
            sQLiteDatabaseH.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseH.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ydiVar.b.d()).execute();
            sQLiteDatabaseH.setTransactionSuccessful();
            sQLiteDatabaseH.endTransaction();
            return null;
        } catch (Throwable th) {
            sQLiteDatabaseH.endTransaction();
            throw th;
        }
    }

    public final Object g(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((ymk) obj2).get();
                break;
        }
        return ((tb2) obj2).invoke(obj);
    }

    public final void h(long j, g1g g1gVar) {
        rm5.n(j, g1gVar, (hyl[]) ((oam) this.b).b);
    }

    public final Object k(g3d g3dVar) {
        qll qllVar = (qll) this.b;
        int i = ThemeableLottieAnimationView.x;
        return qllVar.b;
    }

    public final g3o l0(View view, g3o g3oVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                r9b r9bVarI = g3oVar.a.i(527);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ((w6j) obj).a;
                coordinatorLayout.setPadding(coordinatorLayout.getPaddingLeft(), r9bVarI.b, coordinatorLayout.getPaddingRight(), r9bVarI.d);
                return g3oVar;
            case 6:
                izk izkVar = (izk) obj;
                ArrayList arrayList = izkVar.b;
                d3o d3oVar = g3oVar.a;
                r9b r9bVarB = r9b.b(d3oVar.i(519), d3oVar.i(64));
                r9b r9bVarB2 = r9b.b(d3oVar.j(519), d3oVar.j(64));
                if (!r9bVarB.equals(izkVar.c) || !r9bVarB2.equals(izkVar.d)) {
                    izkVar.c = r9bVarB;
                    izkVar.d = r9bVarB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = ((l6h) arrayList.get(size)).a;
                        int size2 = arrayList2.size() - 1;
                        if (size2 >= 0) {
                            throw fki.n(size2, arrayList2);
                        }
                    }
                }
                return g3oVar;
            case 7:
                SystemBarsBottomPlaceholderView systemBarsBottomPlaceholderView = (SystemBarsBottomPlaceholderView) obj;
                int i = SystemBarsBottomPlaceholderView.b;
                int i2 = g3oVar.a.i(519).d;
                if (i2 != systemBarsBottomPlaceholderView.a) {
                    systemBarsBottomPlaceholderView.a = i2;
                    systemBarsBottomPlaceholderView.requestLayout();
                }
                return g3oVar;
            default:
                obm obmVar = (obm) obj;
                FrameLayout frameLayout = obmVar.l;
                d3o d3oVar2 = g3oVar.a;
                obmVar.m = r9b.a(d3oVar2.i(519), d3oVar2.i(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL));
                int iOrdinal = obmVar.g.ordinal();
                if (iOrdinal == 1) {
                    int i3 = obmVar.m.a;
                    int paddingTop = frameLayout.getPaddingTop();
                    r9b r9bVar = obmVar.m;
                    frameLayout.setPadding(i3, paddingTop, r9bVar.c, r9bVar.d);
                } else if (iOrdinal == 2) {
                    r9b r9bVar2 = obmVar.m;
                    frameLayout.setPadding(r9bVar2.a, r9bVar2.b, r9bVar2.c, r9bVar2.d);
                } else if (iOrdinal == 3) {
                    obmVar.a();
                }
                return g3oVar;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((ltl) this.b).onMenuItemClick(menuItem);
    }

    @Override // com.opera.android.bar.AutocompleteHelper$Callback
    public final void run(String str, String str2, int i) {
        cbk cbkVar = (cbk) this.b;
        if (str != null && str2 != null) {
            ((ArrayList) cbkVar.d).add(new cca(str, str2, i));
        }
        cbkVar.b();
    }

    @Override // defpackage.h93
    public final void s() {
        BrowserActivity browserActivityO = q9n.o(((wyl) this.b).requireContext());
        d8j d8jVar = browserActivityO != null ? (d8j) browserActivityO.g0.E(d8j.class) : null;
        if (d8jVar != null) {
            ((g8j) d8jVar).h();
        }
    }

    @Override // defpackage.urg
    public final boolean test(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 21:
                szb szbVar = (szb) obj;
                szb szbVar2 = ((r4m) obj2).b.i;
                if (szbVar2 != null && szbVar2.equals(szbVar)) {
                    break;
                }
                break;
            default:
                if (((kqm) obj).d.b == ((kqm) obj2).d.b) {
                    break;
                }
                break;
        }
        return true;
    }
}
