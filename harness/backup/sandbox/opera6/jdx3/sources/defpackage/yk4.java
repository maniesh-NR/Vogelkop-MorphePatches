package defpackage;

import J.N;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextSwitcher;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.account.auth.EditProfileAuthActivity;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.esim.ui.EsimActivity;
import com.opera.android.suggestion.Suggestion;
import java.util.Arrays;
import java.util.Objects;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final /* synthetic */ class yk4 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yk4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ yk4(l18 l18Var, bz0 bz0Var) {
        this.a = (byte) 19;
        this.b = l18Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 8;
        ijm ijmVar = ijm.b;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((zk4) obj).I0().d.b.e(new lp2(), false);
                break;
            case 1:
                kl4 kl4Var = (kl4) obj;
                Suggestion suggestion = kl4Var.f;
                if (suggestion != null) {
                    kl4Var.e.C(suggestion);
                    kl4Var.c.invoke(suggestion);
                    break;
                }
                break;
            case 2:
                ((p35) obj).H0();
                break;
            case 3:
                t35 t35Var = (t35) obj;
                EditText editText = t35Var.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (view.hasFocus()) {
                        t35Var.i.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    t35Var.p();
                    break;
                }
                break;
            case 4:
                l55 l55Var = (l55) obj;
                l55Var.g = !l55Var.g;
                l55Var.a0();
                break;
            case 5:
                yl5 yl5Var = (yl5) obj;
                if (yl5Var.g != null) {
                    yl5Var.e.setVisibility(8);
                    yl5Var.f.setVisibility(0);
                    yl5Var.h.s.i(yl5Var.g);
                    break;
                }
                break;
            case 6:
                or2 or2Var = (or2) obj;
                ((TextSwitcher) or2Var.b).showNext();
                ((TextSwitcher) or2Var.f).showNext();
                break;
            case 7:
                WebContentsImpl webContentsImpl = (WebContentsImpl) obj;
                webContentsImpl.e();
                N.MYRJ_nNk(webContentsImpl.b);
                break;
            case 8:
                ((txi) obj).j();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                sb6 sb6Var = (sb6) obj;
                umi umiVar = sb6Var.v;
                r65 r65Var = sb6Var.w;
                dll dllVarV = hjf.v(sb6Var.requireContext());
                Objects.requireNonNull(dllVarV);
                new zhj(new wzg(new x65(umiVar, r65Var, dllVarV, null, null, false, null, true, false, true, false, true), x65.class, b2), null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(sb6Var.requireContext());
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                igi igiVar = (igi) obj;
                ((bbf) igiVar.c).a.dismiss();
                zhj.b(tc6.class).c((Context) igiVar.b);
                break;
            case 11:
                cf7 cf7Var = (cf7) obj;
                wzg wzgVar = new wzg(nz7Var, wg7.class, b2);
                Bundle bundle = new Bundle();
                bundle.putLong("download", ((re7) cf7Var.d).o);
                new zhj(wzgVar, bundle, 2, 4099, null, false, Arrays.asList(new n6h[0])).c((Context) cf7Var.e);
                break;
            case 12:
                ((ym7) obj).t();
                break;
            case 13:
                p8f p8fVar = ((wt7) obj).h;
                j55 j55Var = ((mrk) p8fVar.c).K;
                Suggestion suggestion2 = j55Var.p.b;
                if (suggestion2 != null) {
                    lcp.F(j55Var.e, suggestion2.b(), false);
                    j55Var.l = true;
                    j55Var.j(j55Var.h(j55Var.p.a), true);
                }
                ((dbf) p8fVar.d).A(qk0.H);
                break;
            case 14:
                ((lv7) obj).invoke();
                break;
            case 15:
                igi igiVar2 = (igi) obj;
                iv7 iv7Var = (iv7) igiVar2.c;
                akg akgVar = new akg(iv7Var.d, iv7Var.f, new d06(igiVar2));
                ((mrk) ((wzg) igiVar2.e).b).v.y0();
                akgVar.o(view);
                break;
            case 16:
                fp1 fp1Var = (EditProfileAuthActivity) obj;
                int i = EditProfileAuthActivity.V;
                z77 z77VarU = sfe.U(view.getContext());
                String[] strArr = OperaApplication.K;
                hy4 hy4Var = new hy4(((OperaApplication) fp1Var.getApplication()).b(), ((OperaApplication) fp1Var.getApplication()).s(), new ga6(fp1Var, b3));
                z77VarU.getClass();
                z77VarU.b(hy4Var, ijmVar);
                break;
            case 17:
                mz7 mz7Var = (mz7) obj;
                view.sendAccessibilityEvent(16384);
                iy7 iy7Var = mz7Var.c;
                nz7 nz7Var = mz7Var.g;
                iy7Var.invoke(mz7Var, nz7Var != null ? nz7Var : null);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ChromiumContent chromiumContent = (ChromiumContent) obj;
                if (!chromiumContent.h()) {
                    WebContents webContentsE = chromiumContent.e();
                    if (!webContentsE.isDestroyed()) {
                        webContentsE.z1();
                        break;
                    }
                }
                break;
            case 19:
                l18 l18Var = (l18) obj;
                EditText editText2 = l18Var.f;
                if (editText2 == null) {
                    l18Var.h0();
                    break;
                } else {
                    l18Var.m0(editText2.getText());
                    break;
                }
            case SizeUtil.textSize0 /* 20 */:
                b38 b38Var = (b38) obj;
                b38Var.b.E(b38Var.c);
                break;
            case 21:
                int i2 = EsimActivity.f0;
                ChromiumContent chromiumContent2 = ((EsimActivity) obj).N;
                if (chromiumContent2 != null) {
                    chromiumContent2.x(false);
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((v88) obj).c.setVisibility(0);
                break;
            case 23:
                kj8 kj8Var = (kj8) obj;
                kj8Var.b.q(kj8Var.c.b);
                break;
            case SizeUtil.textSize2 /* 24 */:
                uu8 uu8Var = (uu8) ((tu8) obj).b;
                if (uu8Var != null) {
                    uu8Var.c.run();
                    break;
                }
                break;
            case 25:
                ((wb9) obj).h.performClick();
                break;
            case 26:
                new jd9().w0(((ed9) obj).getContext());
                break;
            case 27:
                jd9 jd9Var = (jd9) obj;
                tc9 tc9Var = tc9.SHOW_QR_CODE;
                tc9[] tc9VarArr = {tc9Var};
                Context contextRequireContext = jd9Var.requireContext();
                String[] strArr2 = OperaApplication.K;
                if (!((OperaApplication) contextRequireContext.getApplicationContext()).b().f()) {
                    tc9VarArr = new tc9[]{tc9Var, tc9.SIGN_IN};
                }
                nej nejVarF = a4h.f(jd9Var.getActivity());
                im6 im6Var = new im6(jd9Var, tc9VarArr, view, (byte) 3);
                nejVarF.getClass();
                nejVarF.b(im6Var, ijmVar);
                break;
            case 28:
                g8j g8jVar = (g8j) ((fw9) obj).I0().c;
                nej nejVar = ((qim) g8jVar.c.get()).d;
                im6 im6Var2 = new im6((swf) g8jVar.d.get(), new qp2((byte) 19), view, (byte) 7);
                nejVar.getClass();
                nejVar.b(im6Var2, ijmVar);
                break;
            default:
                ((ld9) ((ks3) obj).h).run();
                break;
        }
    }
}
