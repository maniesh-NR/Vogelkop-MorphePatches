package defpackage;

import ads_mobile_sdk.u13;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.zzca;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.utils.SizeUtil;
import com.opera.ad.interstitial.AdActivity;
import com.opera.android.BrowserActivity;
import com.opera.android.mainmenu.tiles.MainMenuTileLayout;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class roj implements vlf, n5o, m94, ykj, h6f, yyk, ed2, yjj, xk7, fua, v2p, g94, gjo, OnCompleteListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ roj(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gjo
    public final void a(int i) {
        qjo qjoVar = (qjo) this.b;
        ((gjo) ((p12) this.c).d).a(i);
        ((AdActivity) qjoVar.b).finish();
    }

    public final void accept(Object obj) {
        n9h n9hVar = (n9h) this.b;
        l4n l4nVar = (l4n) this.c;
        vsp vspVar = (vsp) obj;
        jn jnVar = (jn) n9hVar.c;
        HashMap map = vspVar.a;
        if (!vspVar.c || l4nVar.b / 1000.0f <= 0.0f) {
            return;
        }
        if (map.get(jnVar) == null && l4nVar.a / 1000.0f > 0.0f) {
            vspVar.a(JavaScriptMessage$MsgType.start, jnVar, (Object) null);
            map.put(jnVar, Boolean.TRUE);
        }
        vspVar.a(JavaScriptMessage$MsgType.timeupdate, jnVar, zzca.a(l4nVar));
    }

    public final ListenableFuture apply(Object obj) {
        lr lrVar = (lr) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        txi txiVar = (txi) lrVar.d;
        Integer num = (Integer) ((ai4) arrayList.get(0)).b.b(ai4.g, 100);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        Integer num2 = (Integer) ((ai4) arrayList.get(0)).b.b(ai4.f, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        ghf ghfVar = ((fgk) txiVar.b).w;
        return ghfVar != null ? ((wtk) ghfVar.b).a(iIntValue, iIntValue2) : new q0b(new Exception("Failed to take picture: pipeline is not ready."), (byte) 1);
    }

    public final Object attachCompleter(l94 l94Var) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                ((AtomicReference) obj).set(l94Var);
                return "SurfaceRequest-surface-recreation(" + ((buk) obj2).hashCode() + ")";
            case 5:
                all allVar = (all) obj2;
                Surface surface = (Surface) obj;
                allVar.h.a(surface, n97.a(), new ip1(l94Var, (byte) 9));
                return "provideSurface[request=" + allVar.h + " surface=" + surface + "]";
            default:
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final byte b2 = 1;
                l94Var.a(new Runnable() { // from class: vic
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        switch (b3) {
                            case 0:
                                atomicBoolean2.set(true);
                                break;
                            default:
                                atomicBoolean2.set(true);
                                break;
                        }
                    }
                }, l97.a);
                ((ExecutorService) obj2).execute(new h4m((Object) atomicBoolean, (Object) l94Var, obj, (byte) 11));
                return Unit.a;
        }
    }

    @Override // defpackage.xk7
    public final boolean b(int i) {
        vkn vknVar = (vkn) this.b;
        qln qlnVar = (qln) this.c;
        ujn ujnVar = vknVar.a;
        return (ujnVar.P(qlnVar.i()) == i || ((mkb) ((ArrayList) ujnVar.d).get(i)).a() == null) ? false : true;
    }

    @Override // defpackage.yjj
    public final i c(ViewGroup viewGroup) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                ujn ujnVar = (ujn) obj2;
                SettingsManager settingsManager = (SettingsManager) obj;
                ConstraintLayout constraintLayoutN = j7c.n(viewGroup, 2131559544, viewGroup, false);
                int i = 2131362857;
                MainMenuTileLayout mainMenuTileLayout = (MainMenuTileLayout) w1h.j(2131362857, constraintLayoutN);
                if (mainMenuTileLayout != null) {
                    i = 2131363643;
                    MainMenuTileLayout mainMenuTileLayout2 = (MainMenuTileLayout) w1h.j(2131363643, constraintLayoutN);
                    if (mainMenuTileLayout2 != null) {
                        i = 2131364754;
                        if (((LinearLayout) w1h.j(2131364754, constraintLayoutN)) != null) {
                            i = 2131365063;
                            OperaListItem operaListItem = (OperaListItem) w1h.j(2131365063, constraintLayoutN);
                            if (operaListItem != null) {
                                i = 2131365064;
                                LinearLayout linearLayout = (LinearLayout) w1h.j(2131365064, constraintLayoutN);
                                if (linearLayout != null) {
                                    break;
                                }
                            }
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(constraintLayoutN.getResources().getResourceName(i)));
                break;
            default:
                yw ywVar = (yw) obj2;
                esk eskVar = (esk) obj;
                View viewN = j7c.n(viewGroup, 2131559564, viewGroup, false);
                int i2 = 2131362543;
                View viewJ = w1h.j(2131362543, viewN);
                if (viewJ != null) {
                    b98 b98Var = new b98((FrameLayout) viewJ, (byte) 5);
                    ImageView imageView = (ImageView) w1h.j(2131363185, viewN);
                    if (imageView != null) {
                        q5g q5gVar = new q5g((FrameLayout) viewN, b98Var, imageView, (byte) 16);
                        imageView.setClipToOutline(true);
                        imageView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                        break;
                    } else {
                        i2 = 2131363185;
                    }
                }
                t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i2)));
                break;
        }
        return null;
    }

    @Override // defpackage.h6f
    public final void d(boolean z, boolean z2) {
        pom pomVar = (pom) this.b;
        gt0 gt0Var = (gt0) this.c;
        x5f x5fVar = pomVar.c;
        if (x5fVar.h) {
            x5fVar.Z(gt0Var, z, z2);
        }
    }

    @Override // defpackage.yyk
    public final Object execute() {
        byte b = this.a;
        Object obj = this.c;
        ks3 ks3Var = (ks3) this.b;
        switch (b) {
            case 7:
                ArrayList arrayList = (ArrayList) obj;
                ydi ydiVar = (ydi) ks3Var.c;
                ydiVar.getClass();
                if (arrayList.iterator().hasNext()) {
                    ydiVar.h().compileStatement("DELETE FROM events WHERE _id in ".concat(ydi.p(arrayList))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((ydi) ks3Var.i).n(((Integer) r2.getValue()).intValue(), xyc.g, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    public final Object g(Object obj) {
        byte b = this.a;
        int i = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                return Boolean.valueOf(qyn.v(((kuj) obj3).z, (Uri) obj2));
            case 12:
                ((Bitmap) obj3).recycle();
                ((ilm) obj2).run((gkn) obj);
                return null;
            case 14:
                try {
                    return kln.h(new String(s29.h(((s14) obj3).B((String) obj2)), StandardCharsets.UTF_8));
                } catch (IOException | JSONException unused) {
                    return null;
                }
            case 15:
                s14 s14Var = (s14) obj3;
                s14Var.getClass();
                ((j12) obj2).run((kln) obj);
                s14Var.G(new rl((byte) 4));
                return null;
            case 16:
                s14 s14Var2 = (s14) obj3;
                Runnable runnable = (Runnable) obj2;
                List<aln> list = (List) obj;
                ((kze) s14Var2.f).r(list);
                int i2 = 0;
                for (aln alnVar : list) {
                    if (alnVar.getId().startsWith("FILE_user_wallpaper_")) {
                        i++;
                    } else if (alnVar.getId().startsWith("FILE_storefront_wallpaper_")) {
                        i2++;
                    }
                }
                x5f x5fVar = ((onn) s14Var2.e).d;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    b66 b66VarF = x56VarF.F(zpaVar);
                    b66VarF.p(67, 1, i);
                    b66VarF.p(68, 1, i2);
                    x5fVar.U0(x56VarF);
                }
                s14Var2.b = true;
                runnable.run();
                return null;
            default:
                BrowserActivity browserActivity = (BrowserActivity) obj3;
                ru9 ru9Var = (ru9) obj2;
                AtomicBoolean atomicBoolean = syn.a;
                try {
                    if (syn.b(browserActivity)) {
                        nv6 nv6VarB = ru9Var.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("webapp_shortcut_migration_pending", false);
                        nv6VarB.w();
                    }
                    atomicBoolean.set(false);
                    return Unit.a;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
        }
    }

    @Override // defpackage.fua
    public final Drawable i() {
        return new BitmapDrawable(((Context) this.c).getResources(), (Bitmap) ((v4g) this.b).e);
    }

    public final Object k(g3d g3dVar) {
        return Integer.valueOf(f03.t(((i3d) this.c).b, (Context) this.b, 2131101243));
    }

    @Override // defpackage.g94
    public final void l(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case SizeUtil.textSize1 /* 22 */:
                hyg.c(new jro((String) obj3, (File) obj, (wci) obj2));
                break;
            case 23:
                lro lroVar = (lro) obj3;
                xbf xbfVar = (xbf) obj2;
                View view = (View) obj;
                qb7 qb7Var = lroVar.s;
                if (qb7Var != null) {
                    qb7Var.onAdClicked();
                }
                xbfVar.a(view);
                lroVar.s0(4);
                break;
            case SizeUtil.textSize2 /* 24 */:
            default:
                gxo.a(new h4m(obj, obj3, obj2, (byte) 14));
                break;
            case 25:
                bzo bzoVar = (bzo) obj3;
                pqo pqoVar = (pqo) obj2;
                qio qioVar = (qio) obj;
                bzoVar.getClass();
                qioVar.getClass();
                if (!(qioVar instanceof lio)) {
                    boolean zB = bzoVar.b((vho) ((mio) qioVar).a, pqoVar);
                    bn bnVar = bzoVar.b;
                    if (zB) {
                        bnVar.i();
                    } else {
                        bnVar.m(bm.d);
                    }
                }
                dgo dgoVar = new dgo(bzoVar, (byte) 7);
                if (qioVar instanceof lio) {
                    dgoVar.l(((lio) qioVar).a);
                    break;
                }
                break;
        }
    }

    public final void onComplete(Task task) {
        u13 u13Var = (u13) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (u13Var.f) {
            u13Var.e.remove(taskCompletionSource);
        }
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) throws Resources.NotFoundException {
        uoj uojVar = (uoj) this.b;
        OperaListItem operaListItem2 = (OperaListItem) this.c;
        s9g.h.p(uojVar.t, z ? kag.ASK : kag.DENIED);
        uojVar.I0(operaListItem2);
    }
}
