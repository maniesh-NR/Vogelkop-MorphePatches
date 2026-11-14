package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.emoji2.emojipicker.EmojiView;
import com.google.android.material.textfield.TextInputEditText;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.account.auth.EditProfileAuthActivity;
import com.opera.android.account.auth.FinishAccountSetupAuthActivity;
import com.opera.android.browser.external.ExternalAppService;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.webcore.FastResizeWebViewContainer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final /* synthetic */ class bn7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bn7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ bn7(Object obj, int i, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ bn7(zi8 zi8Var, ckg ckgVar) {
        this.a = (byte) 16;
        this.b = ckgVar;
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [android.app.Activity, com.opera.android.FullscreenWebActivity, com.opera.android.account.auth.EditProfileAuthActivity] */
    @Override // java.lang.Runnable
    public final void run() {
        WebContents webContentsN0;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                en7 en7Var = (en7) obj;
                en7Var.f = true;
                en7Var.d();
                return;
            case 1:
                fn7 fn7Var = (fn7) ((wjh) obj).e;
                if (fn7Var != null) {
                    Iterator it = fn7Var.values().iterator();
                    while (it.hasNext()) {
                        ((ntk) it.next()).c();
                    }
                    return;
                }
                return;
            case 2:
                nn7 nn7Var = (nn7) obj;
                nn7Var.o = null;
                nn7Var.q();
                return;
            case 3:
                ua7 ua7Var = (ua7) obj;
                zo7 zo7Var = (zo7) ua7Var.d;
                Context context = (Context) ua7Var.b;
                qsh qshVarQ = w8h.q(context, context.getString(2132019796), "com.opera.android.live_score.LivescoreDynamicFeatureInstanceImpl", new Object[0]);
                cp7 cp7Var = qshVarQ != null ? (cp7) qshVarQ.c : null;
                if (cp7Var == null) {
                    ua7Var.c = ap7.a;
                    zo7Var.a.r(bp7.b);
                    return;
                } else {
                    ua7Var.c = ap7.c;
                    zo7Var.getClass();
                    cp7Var.getState().k(new cl4(new wg5(zo7Var, (byte) 27), (byte) 11));
                    return;
                }
            case 4:
                TextInputEditText textInputEditText = (OperaTextInputEditText) ((ss7) obj).t.d;
                l5b l5bVar = q9n.c;
                q9n.G(textInputEditText.getContext(), textInputEditText);
                return;
            case 5:
                yv7 yv7Var = (yv7) obj;
                yv7Var.q = null;
                if (yv7Var.l.isFocused()) {
                    q9n.H(yv7Var.l);
                    return;
                }
                return;
            case 6:
                ?? r6 = (EditProfileAuthActivity) obj;
                int i = EditProfileAuthActivity.V;
                if (!r6.R || r6.U || (webContentsN0 = r6.n0()) == null) {
                    return;
                }
                webContentsN0.stop();
                String[] strArr = OperaApplication.K;
                ((OperaApplication) r6.getApplication()).b().j(true);
                ((OperaApplication) r6.getApplication()).s().h();
                r6.finish();
                return;
            case 7:
                ((ew7) obj).c.g(ew7.f[0], Boolean.FALSE);
                return;
            case 8:
                ((ImageView) obj).sendAccessibilityEvent(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((EmojiView) obj).sendAccessibilityEvent(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((gb3) obj).invoke();
                return;
            case 11:
                ((d28) obj).a();
                return;
            case 12:
                NavigationController navigationControllerQ = ((k68) obj).a.q();
                if (navigationControllerQ != null) {
                    navigationControllerQ.b();
                    return;
                }
                return;
            case 13:
                km5 km5Var = (km5) obj;
                km5Var.a = true;
                if (((oml) km5Var.d) == null || !km5Var.b) {
                    return;
                }
                km5Var.d = null;
                ((bn7) km5Var.c).run();
                return;
            case 14:
                qi8 qi8Var = (qi8) obj;
                pr prVar = qi8Var.D;
                Context context2 = qi8Var.f;
                String str = tym.a;
                int iGenerateAudioSessionId = scd.E(context2).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                prVar.f = numValueOf;
                w03 w03Var = new w03(prVar, numValueOf, (byte) 0);
                szk szkVar = (szk) prVar.c;
                if (szkVar.a.getLooper().getThread().isAlive()) {
                    szkVar.c(w03Var);
                    return;
                }
                return;
            case 15:
                el6 el6Var = ((zi8) obj).u;
                el6Var.V(el6Var.Q(), 1034, new zk6((byte) 6));
                return;
            case 16:
                ckg ckgVar = (ckg) obj;
                try {
                    synchronized (ckgVar) {
                    }
                    try {
                        ckgVar.a.handleMessage(ckgVar.c, ckgVar.d);
                        ckgVar.a(true);
                        return;
                    } catch (Throwable th) {
                        ckgVar.a(true);
                        throw th;
                    }
                } catch (zh8 e) {
                    w7d.r("Unexpected error delivering message on external thread.", e);
                    rqd.p(e);
                    return;
                }
            case 17:
                boolean z = ExternalAppService.b;
                ((ExternalAppService) obj).stopSelf();
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                int i2 = FastResizeWebViewContainer.i;
                ((FastResizeWebViewContainer) obj).b();
                return;
            case 19:
                qq8 qq8Var = (qq8) obj;
                ((rq8) qq8Var.b).a((nq8) qq8Var.c, true);
                return;
            case SizeUtil.textSize0 /* 20 */:
                ar8 ar8Var = (ar8) obj;
                ar8Var.B = false;
                if (ar8Var.m) {
                    ar8Var.i.d(ar8Var.v);
                    return;
                }
                return;
            case 21:
                ns8 ns8Var = (ns8) obj;
                ns8Var.r = null;
                HashMap map = ns8Var.q;
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    if (!((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                        return;
                    }
                }
                Iterator it3 = map.keySet().iterator();
                while (it3.hasNext()) {
                    ((es8) it3.next()).V();
                }
                map.clear();
                qlk qlkVar = ns8Var.s;
                if (qlkVar != null) {
                    qlkVar.run();
                    ns8Var.s = null;
                    return;
                }
                return;
            case SizeUtil.textSize1 /* 22 */:
                ((cv8) obj).w.h();
                return;
            case 23:
                ((dw8) obj).e0();
                return;
            case SizeUtil.textSize2 /* 24 */:
                tw8 tw8Var = (tw8) obj;
                tw8Var.d = null;
                tw8Var.c = true;
                boolean zY = tw8Var.a.Y(true);
                tw8Var.c = false;
                if (zY) {
                    tw8Var.b.a0();
                    return;
                }
                return;
            case 25:
                int i3 = FinishAccountSetupAuthActivity.W;
                ((FinishAccountSetupAuthActivity) obj).N0();
                return;
            case 26:
                ((b59) obj).get();
                return;
            case 27:
                s9i s9iVar = (s9i) obj;
                s9iVar.e = null;
                ((i32) s9iVar.b).g(((SparseArray) s9iVar.d).clone());
                return;
            case 28:
                g89 g89Var = (g89) obj;
                boolean z2 = (((fom) ((hom) g89Var.b.c).i()).a & 4) != 0;
                if (z2 != g89Var.i) {
                    g89Var.i = z2;
                    g89Var.c();
                    return;
                }
                return;
            default:
                rma rmaVar = ((cd9) obj).p;
                if (rmaVar != null) {
                    rmaVar.l();
                    return;
                }
                return;
        }
    }
}
