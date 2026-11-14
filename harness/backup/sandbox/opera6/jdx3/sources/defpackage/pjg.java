package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.material.textfield.TextInputEditText;
import com.google.common.util.concurrent.ListenableFuture;
import com.leanplum.utils.SizeUtil;
import com.opera.android.PushedContentHandler;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.settings.SettingsManager;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.chromium.printing.PrintingContext;

/* loaded from: classes.dex */
public final /* synthetic */ class pjg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pjg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        dx3 dx3VarP;
        byte b = this.a;
        String str = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    ((ghd) ((qjg) obj).a.m.get()).play();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    return;
                }
            case 1:
                ((ko7) ((hd) obj).f).h();
                break;
            case 2:
                hd hdVar = (hd) ((ko7) obj).k;
                hdVar.b = true;
                ((we7) hdVar.g).a((xbf) hdVar.d);
                break;
            case 3:
                ((qkg) obj).u();
                break;
            case 4:
                ((kng) obj).a();
                break;
            case 5:
                ((cvg) obj).g0();
                break;
            case 6:
                ((fmk) obj).b();
                break;
            case 7:
                yvg yvgVar = (yvg) obj;
                yvgVar.a();
                if (!yvgVar.b.i.d(qcc.e)) {
                    gkj gkjVar = yvgVar.h;
                    if (gkjVar != null) {
                        gkjVar.finish(hjm.b);
                    }
                    Context context = yvgVar.a;
                    wub wubVarD = wub.D();
                    ua7 ua7VarT = zi4.t("account_and_subscriptions", new cm(str, 2131363773, (byte) 5));
                    ua7VarT.S(2131231676);
                    l1f l1fVar = (l1f) ua7VarT.b;
                    l1fVar.k = true;
                    l1fVar.d(true);
                    l1fVar.f(context.getString(2132022234));
                    l1fVar.e(context.getString(2132022233));
                    Intent intentB = mdb.b(context);
                    intentB.putExtra("DESTINATION_VIEW_ID", (int) j7c.f(10));
                    intentB.setAction("ACTION_DESTINATION_VIEW");
                    ua7VarT.N(yhe.f(context, 0, intentB, 0, false));
                    wubVarD.H(ua7VarT.l());
                }
                yvgVar.d();
                break;
            case 8:
                ((swg) obj).r();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                N.Mmq2M8tt(((PrintingContext) obj).b);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                nv6 nv6VarB = ru9.c(((q0h) obj).a).b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("privacy_settings.promotion.can_show", false);
                nv6VarB.w();
                break;
            case 11:
                j1h j1hVar = (j1h) obj;
                qdc qdcVar = j1hVar.f;
                if (j1hVar.b == 0) {
                    j1hVar.c = true;
                    qdcVar.e(occ.ON_PAUSE);
                }
                if (j1hVar.a == 0 && j1hVar.c) {
                    qdcVar.e(occ.ON_STOP);
                    j1hVar.d = true;
                    break;
                }
                break;
            case 12:
                ((hch) obj).f0();
                break;
            case 13:
                PushedContentHandler.Request request = (PushedContentHandler.Request) obj;
                request.b = null;
                long j = request.d;
                if (j != 0) {
                    N.MBqsUtXh(j);
                    request.d = 0L;
                }
                int i = request.c + 1;
                request.c = i;
                if (i >= 3) {
                    PushedContentHandler.this.e(SystemClock.elapsedRealtime() - request.a, false);
                    break;
                } else {
                    request.a();
                    break;
                }
            case 14:
                ((oih) obj).r();
                break;
            case 15:
                glh glhVar = (glh) obj;
                glhVar.a.getWritableDatabase();
                glhVar.f(new vk2((byte) 21));
                break;
            case 16:
                TextInputEditText textInputEditText = (OperaTextInputEditText) ((or2) ((f9c) obj).s).f;
                l5b l5bVar = q9n.c;
                q9n.G(textInputEditText.getContext(), textInputEditText);
                break;
            case 17:
                nlh nlhVar = (nlh) obj;
                SettingsManager settingsManager = nlhVar.E;
                if (Build.VERSION.SDK_INT >= 30 && (dx3VarP = q9n.p(nlhVar.requireActivity())) != null && settingsManager.z("offline_pages_location").isEmpty() && !settingsManager.O()) {
                    Resources resources = dx3VarP.getResources();
                    String string = resources.getString(2132020149, resources.getString(2132017591));
                    qxh qxhVar = string != null ? new qxh(string) : null;
                    yw3 yw3Var = new yw3(dx3VarP);
                    z77 z77Var = (z77) dx3VarP.getSystemService("com.opera.android.ui.DIALOG_QUEUE_SERVICE");
                    gkj gkjVar2 = new gkj(false, false);
                    gkjVar2.a = null;
                    gkjVar2.b = null;
                    gkjVar2.c = null;
                    gkjVar2.d = null;
                    gkjVar2.e = null;
                    gkjVar2.f = null;
                    gkjVar2.g = null;
                    gkjVar2.h = yw3Var;
                    gkjVar2.i = null;
                    gkjVar2.j = null;
                    gkjVar2.k = 2132019124;
                    gkjVar2.l = 2132018111;
                    gkjVar2.m = 2132020150;
                    gkjVar2.n = true;
                    gkjVar2.o = qxhVar;
                    z77Var.getClass();
                    z77Var.b(gkjVar2, ijm.b);
                    break;
                }
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                koh kohVar = (koh) ((n9h) obj).c;
                if (!kohVar.d) {
                    buk bukVar = kohVar.a;
                    zpl zplVar = kohVar.b;
                    moh mohVar = kohVar.g;
                    Objects.toString(mohVar.s);
                    cyd cydVar = mohVar.w;
                    cydVar.a();
                    k1g.O((ListenableFuture) cydVar.i).addListener(new jbd(kohVar, bukVar, zplVar, (byte) 15), mohVar.d);
                    break;
                }
                break;
            case 19:
                ((ijc) obj).g();
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((uwh) obj).e();
                break;
            case 21:
                c0i c0iVar = (c0i) obj;
                b0i b0iVar = c0iVar.d;
                c0iVar.a.getLifecycle().b(c0iVar);
                ig igVar = c0iVar.f;
                if (igVar != null) {
                    igVar.b = null;
                }
                c0iVar.e.r(Boolean.FALSE);
                wvg wvgVar = (wvg) c0iVar.c.i.g();
                if (!wvgVar.a()) {
                    b0iVar.J(1);
                    break;
                } else if (!wvgVar.b()) {
                    b0iVar.m();
                    break;
                } else {
                    b0iVar.J(2);
                    break;
                }
            case SizeUtil.textSize1 /* 22 */:
                f0i f0iVar = (f0i) obj;
                if (!f0iVar.f.f()) {
                    f0iVar.o0(4);
                    break;
                } else {
                    f0iVar.o0(1);
                    break;
                }
            case 23:
                ((l5b) obj).b = false;
                break;
            case SizeUtil.textSize2 /* 24 */:
                m5i m5iVar = (m5i) obj;
                umm ummVar = m5iVar.a;
                if (ummVar != null) {
                    ummVar.setState(m5i.g);
                }
                m5iVar.d = null;
                break;
            case 25:
                b6i b6iVar = (b6i) obj;
                boolean zH = b6iVar.h();
                if (b6iVar.p.compareAndSet(false, true) && zH) {
                    nx5 nx5Var = b6iVar.l.a;
                    if (nx5Var == null) {
                        nx5Var = null;
                    }
                    na2.B(nx5Var, b6iVar.s, (rx5) null, new f6i(b6iVar, (mt5) null, (byte) 0), 2);
                    break;
                }
                break;
            case 26:
                l8i l8iVar = (l8i) obj;
                l8iVar.b.postOnAnimation(new pjg(l8iVar.d, (byte) 27));
                break;
            case 27:
                ((ghf) obj).G();
                break;
            case 28:
                N.MtT_tevO(((bei) obj).a, (Object) null, (Object) null);
                break;
            default:
                nii niiVar = (nii) obj;
                niiVar.b.setVisibility(8);
                niiVar.a.setTranslationY(0.0f);
                break;
        }
    }
}
