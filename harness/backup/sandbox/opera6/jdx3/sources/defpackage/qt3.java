package defpackage;

import J.N;
import android.app.WallpaperManager;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.w;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.SessionStore;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class qt3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ qt3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg2 gg2Var;
        b2l b2lVar;
        byte b = this.a;
        ijm ijmVar = ijm.b;
        byte b2 = 2;
        byte b3 = 1;
        xd5 xd5Var = this.b;
        switch (b) {
            case 0:
                int i = BrowserActivity.E1;
                xd5Var.v0();
                qim qimVar = xd5Var.o;
                Objects.requireNonNull(qimVar);
                joh.g(qimVar.e, new rxh(2132022058), 5000, new rxh(2132022059), new mt3(xd5Var, (byte) 12));
                break;
            case 1:
                int i2 = BrowserActivity.E1;
                xd5Var.v0();
                tg7 tg7Var = new tg7();
                xd5Var.N0 = tg7Var;
                qim qimVar2 = xd5Var.o;
                Objects.requireNonNull(qimVar2);
                ysj ysjVar = qimVar2.e;
                ysjVar.getClass();
                ysjVar.b(tg7Var, ijmVar);
                break;
            case 2:
                int i3 = BrowserActivity.E1;
                xd5Var.v0();
                qim qimVar3 = xd5Var.o;
                Objects.requireNonNull(qimVar3);
                joh.g(qimVar3.e, new rxh(2132019012), 5000, new rxh(2132020924), new mt3(xd5Var, (byte) 15));
                break;
            case 3:
                int i4 = BrowserActivity.E1;
                xd5Var.v0();
                qim qimVar4 = xd5Var.o;
                Objects.requireNonNull(qimVar4);
                joh.g(qimVar4.e, new rxh(2132019013), 5000, new rxh(2132020924), new mt3(xd5Var, (byte) 13));
                break;
            case 4:
                gbf gbfVar = xd5Var.M;
                if ((gbfVar != null ? gbfVar : null).j.p()) {
                    vml.c(new qt3(xd5Var, (byte) 6));
                }
                cg2 cg2Var = (cg2) xd5Var.y.k.f();
                if (cg2Var != null && (gg2Var = cg2Var.j) != null) {
                    Point point = gg2.G;
                    gg2Var.h(new vk1((byte) 20));
                    break;
                }
                break;
            case 5:
                ((g8j) ((d8j) xd5Var.g0.E(d8j.class))).l(ts1.class, null);
                break;
            case 6:
                int i5 = BrowserActivity.E1;
                xd5Var.B1();
                break;
            case 7:
                int i6 = BrowserActivity.E1;
                xd5Var.u1(null, 0);
                break;
            case 8:
                int i7 = BrowserActivity.E1;
                if (xd5Var.getLifecycle().i.d(qcc.e) && xd5Var.X0() && xd5Var.k0()) {
                    SharedPreferences sharedPreferences = ru9.c(xd5Var).a;
                    String[] strArr = OperaApplication.K;
                    SettingsManager settingsManagerJ = ((OperaApplication) xd5Var.getApplicationContext()).J();
                    if (!sharedPreferences.getBoolean("main.menu.button.hint.closed", false) && !sharedPreferences.getBoolean("main.menu.button.clicked", false)) {
                        if (!(settingsManagerJ.h ? true : settingsManagerJ.J())) {
                            qim qimVar5 = xd5Var.o;
                            Objects.requireNonNull(qimVar5);
                            oz3 oz3Var = qimVar5.g;
                            kt3 kt3Var = new kt3(xd5Var, b3);
                            oz3Var.getClass();
                            oz3Var.b(kt3Var, ijmVar);
                        }
                    }
                    ru9 ru9VarC = ru9.c(xd5Var);
                    SettingsManager settingsManagerH0 = xd5Var.H0();
                    k6l k6lVar = xd5Var.V;
                    if (k6lVar == null) {
                        k6lVar = null;
                    }
                    if (k6lVar.s(p6l.a) > 1 && (b2lVar = k6lVar.o) != null && ((d7l) b2lVar).n0()) {
                        SharedPreferences sharedPreferences2 = ru9VarC.a;
                        if (!sharedPreferences2.getBoolean("tab_gallery.gallery_button_hint_bubble_shown", false) && settingsManagerH0.i("feature_tips_notification") && !sharedPreferences2.getBoolean("tab_gallery.shown", false) && !sharedPreferences2.getBoolean("tab_gallery.tabui2_bubble_tour_shown", false)) {
                            qim qimVar6 = xd5Var.o;
                            Objects.requireNonNull(qimVar6);
                            oz3 oz3Var2 = qimVar6.g;
                            ru9 ru9VarC2 = ru9.c(xd5Var);
                            z43 z43Var = xd5Var.z;
                            View viewL = (z43Var != null ? z43Var : null).l();
                            if (viewL == null && (viewL = xd5Var.findViewById(2131362191)) == null) {
                                viewL = new ImageView(xd5Var);
                            }
                            ioc iocVar = new ioc(b2, viewL, ru9VarC2);
                            oz3Var2.getClass();
                            oz3Var2.b(iocVar, ijmVar);
                            break;
                        }
                    }
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int i8 = BrowserActivity.E1;
                b2l b2lVarW0 = xd5Var.w0();
                if (b2lVarW0 != null) {
                    d7l d7lVar = (d7l) b2lVarW0;
                    if (f03.J(Uri.parse(d7lVar.j.getUrl()), 3) && !d7lVar.f()) {
                        k6l k6lVar2 = xd5Var.V;
                        if (k6lVar2 == null) {
                            k6lVar2 = null;
                        }
                        k6lVar2.k(b2lVarW0);
                    }
                    w supportFragmentManager = xd5Var.getSupportFragmentManager();
                    String[] strArr2 = OperaApplication.K;
                    xih.v(supportFragmentManager, ((OperaApplication) xd5Var.getApplication()).b(), null, null);
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                int i9 = BrowserActivity.E1;
                k6l k6lVarW = xd5Var.W();
                if (k6lVarW != null) {
                    k6lVarW.z();
                    break;
                }
                break;
            case 11:
                int i10 = BrowserActivity.E1;
                xd5Var.finishAndRemoveTask();
                break;
            case 12:
                i12 i12Var = (i12) xd5Var.y.i0.get();
                new rml(Unit.a, i12Var.a).a(new g12(i12Var, (byte) 0)).t(new k51((byte) 28)).m(i12Var.d);
                break;
            case 13:
                onn onnVar = (onn) xd5Var.y.a.B().get();
                x5f x5fVar = onnVar.d;
                zpa zpaVar = x5fVar.d;
                b59 b59Var = onnVar.b;
                mgh mghVar = onnVar.c;
                OperaApplication operaApplication = (OperaApplication) mghVar.b;
                j4c j4cVar = (j4c) mghVar.c;
                if (r9n.H(operaApplication)) {
                    int wallpaperId = ((WallpaperManager) j4cVar.get()).getWallpaperId(1);
                    int wallpaperId2 = ((WallpaperManager) j4cVar.get()).getWallpaperId(2);
                    if (wallpaperId != ((SharedPreferences) b59Var.get()).getInt("home_screen_wallpaper_id", -1) && x5fVar.h) {
                        x56 x56VarF = zpa.F();
                        qu0 qu0VarZ = x56VarF.F(zpaVar).z();
                        qu0VarZ.getClass();
                        qu0VarZ.q(1, 1, "system_wallpaper");
                        x5fVar.U0(x56VarF);
                    }
                    if (wallpaperId2 != ((SharedPreferences) b59Var.get()).getInt("lock_screen_wallpaper_id", -2) && x5fVar.h) {
                        x56 x56VarF2 = zpa.F();
                        qu0 qu0VarA = x56VarF2.F(zpaVar).A();
                        qu0VarA.getClass();
                        qu0VarA.q(1, 1, "system_wallpaper");
                        x5fVar.U0(x56VarF2);
                        break;
                    }
                }
                break;
            case 14:
                int i11 = BrowserActivity.E1;
                xd5Var.x1();
                break;
            case 15:
                k6l k6lVar3 = xd5Var.V;
                k6l k6lVar4 = k6lVar3 != null ? k6lVar3 : null;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = Collections.unmodifiableList(k6lVar4.b).iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(Integer.valueOf(((d7l) ((b2l) it.next())).j.a().d));
                }
                LinkedHashSet linkedHashSetM0 = CollectionsKt.m0(linkedHashSet);
                fnh fnhVar = xd5Var.C;
                if (fnhVar != null) {
                    SessionStore sessionStore = fnhVar.f;
                    sessionStore.getClass();
                    ArrayList arrayList = new ArrayList();
                    N.MqkthI77(sessionStore.a, arrayList);
                    linkedHashSetM0.addAll((Set) arrayList.stream().map(new mn((byte) 18)).collect(Collectors.toSet()));
                }
                u4l u4lVar = (u4l) xd5Var.y.a.s.get();
                mr3 mr3Var = new mr3((byte) 3);
                u4lVar.getClass();
                u4lVar.d.f(new jbd(u4lVar, new lt(linkedHashSetM0, (byte) 1), mr3Var, (byte) 24));
                break;
            case 16:
                new zhj(new wzg(null, i8d.class, (byte) 4), null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(xd5Var);
                break;
            case 17:
                xd5Var.recreate();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                if (xd5Var.getLifecycle().i.d(qcc.e)) {
                    int i12 = BrowserActivity.E1;
                    xd5Var.b1();
                    break;
                }
                break;
            case 19:
                ku3 ku3Var = xd5Var.c1;
                ku3Var.a.b = true;
                ku3Var.d.sendEmptyMessage(1);
                break;
            case SizeUtil.textSize0 /* 20 */:
                xd5Var.y1();
                break;
            default:
                ipk ipkVarL0 = xd5Var.L0();
                ArrayList arrayList2 = ipkVarL0.m.a;
                arrayList2.add(new jn7("dummy " + arrayList2.size(), "https://en.wikipedia.org/wiki/" + new Random().nextLong(), new Date().getTime()));
                ipkVarL0.b.a();
                break;
        }
    }
}
