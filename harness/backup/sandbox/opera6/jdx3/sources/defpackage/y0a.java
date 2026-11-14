package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputEditText;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.history.e;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.sheet.VelocityTrackingCoordinatorLayout;
import com.opera.android.webcore.WebcoreRpcBridge;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.chromium.content_public.browser.MediaSession;

/* loaded from: classes.dex */
public final /* synthetic */ class y0a implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        ls6 ls6Var;
        String string;
        String string2;
        byte b = this.a;
        ls6 ls6Var2 = null;
        int i = 0;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ei7 ei7Var = (ei7) obj;
                b1a b1aVar = (b1a) ((c1a) obj2).h;
                b1aVar.getClass();
                if (ei7Var == ei7.b) {
                    b1aVar.c.V(we0.d, b1aVar.W());
                    return;
                }
                return;
            case 1:
                b1a b1aVar2 = (b1a) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                b1aVar2.X(true);
                return;
            case 2:
                ju2 ju2Var = (ju2) obj2;
                Boolean bool = (Boolean) obj;
                x5f x5fVar = (x5f) ju2Var.c;
                boolean zBooleanValue = bool.booleanValue();
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    ((un0) new ck0(zpaVar, x56VarF).e.getValue()).b.r(5, 1, zBooleanValue);
                    x5fVar.U0(x56VarF);
                }
                x5f x5fVar2 = (x5f) ju2Var.b;
                boolean zBooleanValue2 = bool.booleanValue();
                zpa zpaVar2 = x5fVar2.d;
                x56 x56VarF2 = zpa.F();
                new ck0(zpaVar2, x56VarF2).h().a.r(14, 1, zBooleanValue2);
                x5fVar2.U0(x56VarF2);
                return;
            case 3:
                qde qdeVar = ((e) obj2).g;
                ArrayList arrayList = qdeVar.l;
                arrayList.addAll((List) obj);
                qdeVar.r(CollectionsKt.k0(arrayList));
                return;
            case 4:
                vyn vynVar = (vyn) obj;
                String str = vynVar.a;
                ((eka) obj2).n(new sw7(new tha(str, str, vynVar.b, vynVar.c, new wha(vynVar.d, vynVar.e))));
                return;
            case 5:
                vyn vynVar2 = (vyn) obj;
                String str2 = vynVar2.a;
                ((cka) obj2).n(new sw7(new vka(str2, str2, vynVar2.b, vynVar2.c, new wka(vynVar2.d, vynVar2.e))));
                return;
            case 6:
                ((Button) obj2).setEnabled(((Boolean) obj).booleanValue());
                return;
            case 7:
                ((View) obj2).setEnabled(((Boolean) obj).booleanValue());
                return;
            case 8:
                ((TextInputEditText) obj2).setText((String) obj);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                Uri uri = Uri.parse((String) obj);
                Context context = ((u9c) obj2).a;
                context.startActivity(new wgf(uri, lqm.K).b(context, "com.opera.android.action.OPEN_URL"));
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((su) obj2).run(Boolean.valueOf(((r3g) obj) != null));
                return;
            case 11:
                igi igiVar = (igi) obj2;
                moc mocVar = (moc) obj;
                tpc tpcVar = mocVar.a;
                String str3 = mocVar.b;
                if (tpcVar != null && tpcVar.b != null && !TextUtils.isEmpty(str3) && mocVar.c && mocVar.d && mocVar.e && mocVar.f) {
                    tpc tpcVar2 = mocVar.a;
                    ls6Var = new ls6(tpcVar2.b, tpcVar2.c, str3);
                } else {
                    ls6Var = null;
                }
                if (Objects.equals((ls6) igiVar.g, ls6Var)) {
                    return;
                }
                synchronized (igi.j) {
                    igiVar.g = ls6Var;
                }
                boolean z = ls6Var != null;
                if (z != ((Boolean) ((kze) igiVar.b).g()).booleanValue()) {
                    ((kze) igiVar.b).r(Boolean.valueOf(z));
                }
                if (z) {
                    b59 b59Var = (b59) igiVar.f;
                    String string3 = ((SharedPreferences) b59Var.get()).getString("prefs_params_country", null);
                    if (string3 != null && (string = ((SharedPreferences) b59Var.get()).getString("prefs_params_language", null)) != null && (string2 = ((SharedPreferences) b59Var.get()).getString("prefs_params_user_id", null)) != null && ((SharedPreferences) b59Var.get()).getInt("prefs_params_version", 0) == 1) {
                        ls6Var2 = new ls6(string3, string, string2);
                    }
                    if (ls6Var.equals(ls6Var2)) {
                        return;
                    }
                    ((SharedPreferences) ((b59) igiVar.f).get()).edit().putString("prefs_params_country", ls6Var.a).putString("prefs_params_language", ls6Var.b).putString("prefs_params_user_id", ls6Var.c).putInt("prefs_params_version", 1).apply();
                    ((iv) igiVar.d).run();
                    return;
                }
                return;
            case 12:
                dka dkaVar = (dka) obj2;
                if (((Boolean) obj).booleanValue()) {
                    dkaVar.n(new sw7(Unit.a));
                    return;
                } else {
                    dkaVar.n(new rw7(new cqb(999, "Failed to subscribe")));
                    return;
                }
            case 13:
                dka dkaVar2 = (dka) obj2;
                if (((Boolean) obj).booleanValue()) {
                    dkaVar2.n(new sw7(Unit.a));
                    return;
                } else {
                    dkaVar2.n(new rw7(new cqb(999, "Failed to unsubscribe")));
                    return;
                }
            case 14:
                vyn vynVar3 = (vyn) obj;
                String str4 = vynVar3.a;
                ((dka) obj2).n(new sw7(new sha(str4, str4, vynVar3.b, vynVar3.c, new vha(vynVar3.d, vynVar3.e))));
                return;
            case 15:
                String str5 = (String) obj;
                long j = ((WebcoreRpcBridge) ((s9i) obj2).d).a;
                if (j != 0) {
                    N.MM1UajSt(j, str5);
                    return;
                }
                return;
            case 16:
                ((urc) obj2).g.r((epc) obj);
                return;
            case 17:
                ((iu2) obj2).run((ipf) obj);
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                i7d i7dVar = (i7d) obj2;
                Boolean bool2 = (Boolean) obj;
                pt1 pt1Var = i7dVar.l;
                if (pt1Var != null) {
                    ViewGroup.LayoutParams layoutParams = ((VelocityTrackingCoordinatorLayout) pt1Var.f).getLayoutParams();
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        int i2 = layoutParams2.gravity & (-8388616);
                        int i3 = bool2.booleanValue() ? i2 | 3 : i2 | 5;
                        if (i3 != layoutParams2.gravity) {
                            layoutParams2.gravity = i3;
                            ((VelocityTrackingCoordinatorLayout) i7dVar.l.f).setLayoutParams(layoutParams2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                h7d h7dVar = (h7d) obj2;
                int iIntValue = ((Integer) obj).intValue();
                boolean zS0 = i7d.s0(h7dVar.c.getConfiguration());
                vl6 vl6Var = h7dVar.a;
                if (zS0) {
                    ((OperaBottomSheetBehavior) vl6Var.b).I(3);
                    return;
                }
                byte b3 = h7dVar.f;
                OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) vl6Var.b;
                operaBottomSheetBehavior.H(iIntValue);
                operaBottomSheetBehavior.I(b3);
                if (b3 == 4 || b3 == 5) {
                    ((NestedScrollView) vl6Var.e).scrollTo(0, 0);
                    return;
                }
                return;
            case SizeUtil.textSize0 /* 20 */:
                ard ardVar = (ard) obj2;
                jkd jkdVar = (jkd) obj;
                MediaSession mediaSession = ardVar.j.a;
                if (mediaSession != null) {
                    ardVar.c.a(mediaSession, !jkdVar.c, true);
                    return;
                }
                return;
            case 21:
                Bitmap bitmap = (Bitmap) obj;
                ard ardVar2 = ((zqd) obj2).c;
                ardVar2.getClass();
                if (bitmap == null || bitmap.getWidth() < 114 || bitmap.getHeight() < 114) {
                    return;
                }
                if (ardVar2.f == null || (bitmap.getWidth() >= ardVar2.f.getWidth() && bitmap.getHeight() >= ardVar2.f.getHeight())) {
                    ardVar2.f = ipe.r(bitmap);
                    ardVar2.h();
                    return;
                }
                return;
            case SizeUtil.textSize1 /* 22 */:
                ((igi) obj2).B0((b2l) obj);
                return;
            case 23:
                syd sydVar = (syd) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (sydVar.f) {
                    return;
                }
                sydVar.f = true;
                sydVar.b.F(new t00(sydVar, sharedPreferences, b2));
                sydVar.a(sharedPreferences, false);
                return;
            case SizeUtil.textSize2 /* 24 */:
                ho7 ho7Var = (ho7) obj2;
                pne pneVar = (pne) obj;
                if (pneVar.c.isEmpty()) {
                    return;
                }
                HashMap map = new HashMap(ho7Var.a);
                String str6 = pneVar.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = pneVar.c.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new mq4(pneVar.a, new String[]{sko.j("sha256/", (String) it.next())}[0]));
                }
                map.put(str6, new nq4(CollectionsKt.n0(arrayList2), (CertificateChainCleaner) null));
                ho7Var.a = map;
                return;
            case 25:
                zne zneVar = (zne) obj2;
                pne pneVar2 = (pne) obj;
                HashMap map2 = zneVar.b;
                List list = pneVar2.c;
                String str7 = pneVar2.a;
                if (list.isEmpty()) {
                    return;
                }
                pne pneVar3 = (pne) map2.get(str7);
                if (pneVar3 == null || !pneVar2.c.equals(pneVar3.c)) {
                    map2.put(str7, pneVar2);
                    ArrayList arrayList3 = zneVar.a;
                    int size = arrayList3.size();
                    while (i < size) {
                        Object obj3 = arrayList3.get(i);
                        i++;
                        ((Callback) obj3).run(pneVar2);
                    }
                    return;
                }
                return;
            case 26:
                ((fqe) obj2).f.r((String) obj);
                return;
            case 27:
                hd hdVar = (hd) obj2;
                String str8 = (String) obj;
                if (hdVar.b || TextUtils.isEmpty(str8)) {
                    return;
                }
                hdVar.b = true;
                new kse(hdVar, (Context) hdVar.f, str8);
                return;
            case 28:
                kxe kxeVar = (kxe) ((wpe) obj2).c;
                kxeVar.L = false;
                if (((Boolean) obj).booleanValue()) {
                    kxeVar.y.V(1, "night_mode_overlay_keyboard");
                    return;
                }
                return;
            default:
                u1f u1fVar = (u1f) obj2;
                u1fVar.b.K();
                ((BrowserActivity) u1fVar.f).getLifecycle().a(new ob((Object) u1fVar, (byte) 12));
                return;
        }
    }
}
