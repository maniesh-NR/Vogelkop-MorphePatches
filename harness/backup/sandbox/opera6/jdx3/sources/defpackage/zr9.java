package defpackage;

import J.N;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.button.MaterialButton;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.bookmarks.BookmarksImporterBridge;
import com.opera.android.import_data.ImportChromeBookmarksActivity;
import com.opera.android.import_data.ImportChromeDataActivity;
import com.opera.android.mainmenu.tiles.MainMenuTileLayout;
import com.opera.android.pushmessaging.GCMBackgroundService;
import com.opera.api.Callback;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class zr9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zr9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ zr9(npd npdVar, nod nodVar, Runnable runnable) {
        this.a = (byte) 28;
        this.b = npdVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 17;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                GCMBackgroundService gCMBackgroundService = (GCMBackgroundService) obj2;
                es9 es9Var = (es9) obj;
                int i = GCMBackgroundService.a;
                String[] strArr = OperaApplication.K;
                Rect rect = ((OperaApplication) gCMBackgroundService.getApplicationContext()).n;
                fsp.g(gCMBackgroundService, rect != null ? rect : null);
                e7d.a(gCMBackgroundService, new wt2(es9Var, (byte) 5));
                return;
            case 1:
                ((v1a) obj2).a((Callback) obj);
                return;
            case 2:
                ((nh4) obj2).F((d7a) obj, Unit.a);
                return;
            case 3:
                ((tq6) ((vea) ((sfa) obj2).c.a).b.d.get(((uea) obj).m)).c(true);
                return;
            case 4:
                bl9 bl9Var = (bl9) obj;
                ((bl9) obj2).d();
                if (bl9Var != null) {
                    bl9Var.d();
                    return;
                }
                return;
            case 5:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    taskCompletionSource.setResult(((lwa) obj2).h());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 6:
                fp1 fp1Var = (ImportChromeBookmarksActivity) obj2;
                int i2 = ImportChromeBookmarksActivity.b0;
                File fileE = s29.e(fp1Var);
                cgh.p((File) obj, fileE);
                File fileA = q3b.a(fileE);
                if (fileA == null) {
                    vml.c(new ld9(fp1Var, (byte) 25));
                    return;
                } else {
                    N.Mb0tu6VP(new BookmarksImporterBridge(new qq6(fp1Var, (byte) 20)), fileA.getAbsolutePath());
                    return;
                }
            case 7:
                fp1 fp1Var2 = (ImportChromeDataActivity) obj2;
                int i3 = ImportChromeDataActivity.d0;
                File fileE2 = s29.e(fp1Var2);
                cgh.p((File) obj, fileE2);
                File fileA2 = q3b.a(fileE2);
                if (fileA2 == null) {
                    vml.c(new ld9(fp1Var2, (byte) 26));
                    return;
                } else {
                    N.Mb0tu6VP(new BookmarksImporterBridge(new xm5(fp1Var2)), fileA2.getAbsolutePath());
                    return;
                }
            case 8:
                s75 s75Var = (s75) obj;
                ((Callback) obj2).run(oup.a0(s75Var.b, vtp.G(1, (Context) s75Var.c)));
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((aeb) obj2).a.v((lsc) obj);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                zdb zdbVar = (zdb) obj2;
                if (((ig) obj) != zdbVar.h) {
                    return;
                }
                zdbVar.k = true;
                while (true) {
                    ig igVar = zdbVar.h;
                    if (igVar == null) {
                        return;
                    }
                    igVar.b = null;
                    zdbVar.h = null;
                    d23 d23Var = zdbVar.i;
                    zdbVar.i = null;
                    d23Var.c(Boolean.FALSE);
                }
            case 11:
                gnb gnbVar = (gnb) obj;
                lni.h("JavaUploadDataSinkBase#executeOnExecutor " + ((String) obj2) + " running callback");
                try {
                    gnbVar.run();
                    Trace.endSection();
                    return;
                } finally {
                }
            case 12:
                pnb pnbVar = (pnb) obj2;
                mnb mnbVar = pnbVar.a;
                String str = pnbVar.p;
                mnbVar.getClass();
                mnbVar.b(new a32(mnbVar, (qqm) obj, str, b2), "onRedirectReceived");
                return;
            case 13:
                pnb pnbVar2 = (pnb) obj2;
                pnbVar2.c("read", new gnb(pnbVar2, (ge5) obj, (byte) 2));
                return;
            case 14:
                int i4 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 15:
                qq6 qq6Var = (qq6) obj2;
                float fMeasureText = ((TextView) qq6Var.b).getPaint().measureText((String) obj);
                TextView textView = (TextView) qq6Var.b;
                if (fMeasureText > textView.getWidth() - z7h.h(textView.getContext(), 64.0f)) {
                    textView.setGravity(8388629);
                    return;
                } else {
                    textView.setGravity(17);
                    return;
                }
            case 16:
                zzb zzbVar = (zzb) obj2;
                zzbVar.H();
                String str2 = ((tzb) obj).a;
                a0c a0cVar = zzbVar.e;
                wwc.i(a0cVar.getContext().getApplicationContext(), str2);
                a0cVar.g0();
                return;
            case 17:
                wth wthVar = (wth) obj2;
                bp3 bp3Var = (bp3) obj;
                HashSet hashSet = new HashSet();
                if (wthVar != null) {
                    hashSet.addAll((LinkedHashSet) wthVar.b);
                }
                ((z67) bp3Var.i).getClass();
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                v6f v6fVar = (v6f) obj;
                gkc gkcVar = (gkc) ((ode) ((ua7) obj2).b).g();
                if (gkcVar != null) {
                    v6fVar.a(gkcVar.a);
                    return;
                }
                return;
            case 19:
                l94 l94Var = (l94) obj;
                gkc gkcVar2 = (gkc) ((ode) ((ua7) obj2).b).g();
                if (gkcVar2 == null) {
                    l94Var.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    l94Var.b(gkcVar2.a);
                    return;
                }
            case SizeUtil.textSize0 /* 20 */:
                gkc gkcVar3 = (gkc) obj;
                v6f v6fVar2 = (v6f) ((Map.Entry) obj2).getKey();
                gkcVar3.getClass();
                v6fVar2.a(gkcVar3.a);
                return;
            case 21:
                s14 s14Var = (s14) obj2;
                moc mocVar = (moc) obj;
                y0a y0aVar = (y0a) s14Var.f;
                boolean z = ((aml) ((bml) s14Var.d).i()).a;
                if (mocVar.f != z) {
                    mocVar = new moc(mocVar.a, mocVar.b, mocVar.c, mocVar.d, mocVar.e, z);
                }
                y0aVar.run(mocVar);
                return;
            case SizeUtil.textSize1 /* 22 */:
                i7d i7dVar = (i7d) obj2;
                Callback callback = (Callback) obj;
                if (i7dVar.l == null || i7dVar.i) {
                    return;
                }
                Context contextRequireContext = i7dVar.requireContext();
                pt1 pt1Var = i7dVar.l;
                or2 or2Var = (or2) pt1Var.d;
                FrameLayout frameLayout = (FrameLayout) pt1Var.b;
                Rect rectR = q9n.r((LinearLayout) or2Var.c);
                ArrayList arrayList = new ArrayList();
                kf kfVar = (kf) ((or2) pt1Var.d).f;
                q9n.J((RelativeLayout) kfVar.b, MainMenuTileLayout.class, new yzb((Object) arrayList, (byte) 14));
                if (!arrayList.isEmpty()) {
                    Rect rectR2 = q9n.r((View) arrayList.get(0));
                    int size = arrayList.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            Object obj3 = arrayList.get(i6);
                            i6++;
                            Rect rectR3 = q9n.r((MainMenuTileLayout) obj3);
                            if (rectR3.top > rectR2.top) {
                                i5++;
                            }
                            if (i5 == 2) {
                                rect = rectR3;
                            } else {
                                rectR2 = rectR3;
                            }
                        }
                    }
                }
                int dimensionPixelSize = rect != null ? (rect.top - rectR.top) + contextRequireContext.getResources().getDimensionPixelSize(2131167709) : q9n.r((RelativeLayout) kfVar.b).bottom - rectR.top;
                int height = frameLayout.getRootView().getHeight();
                WeakHashMap weakHashMap = r5n.a;
                g3o g3oVarA = i5n.a(frameLayout);
                if (g3oVarA != null) {
                    r9b r9bVarJ = g3oVarA.a.j(130);
                    height -= r9bVarJ.b + r9bVarJ.d;
                }
                callback.run(Integer.valueOf(cs5.t(((Integer) ((StatusBarDrawingFrameLayout) pt1Var.c).i.g()).intValue() + dimensionPixelSize, 0, height)));
                return;
            case 23:
                int[] iArr = MaterialButton.O;
                ((MaterialButton) obj2).D((Drawable) obj);
                return;
            case SizeUtil.textSize2 /* 24 */:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr2 = MaterialButton.O;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.D;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.D = null;
                    materialButton.A = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
            case 25:
                rgd rgdVar = (rgd) obj2;
                rgdVar.B.set(rgdVar.x((i16) obj, rgdVar.v, 0));
                return;
            case 26:
                gid gidVar = (gid) obj2;
                kid kidVar = (kid) obj;
                if (gidVar.o) {
                    return;
                }
                kidVar.f(gidVar);
                return;
            case 27:
                sjg sjgVar = (sjg) obj;
                p12 p12Var = ((uld) obj2).a;
                sjg sjgVar2 = (sjg) p12Var.d;
                if (sjgVar == sjgVar2) {
                    tjg tjgVar = (tjg) ((xbf) p12Var.a).b;
                    ArrayList arrayList2 = tjgVar.t;
                    arrayList2.remove(sjgVar2);
                    arrayList2.add(sjgVar2);
                    tjgVar.n();
                    return;
                }
                return;
            case 28:
                ((npd) obj2).getClass();
                ((Runnable) obj).run();
                return;
            default:
                ((npd) obj2).t((xkg) null, (xkg) obj);
                return;
        }
    }
}
