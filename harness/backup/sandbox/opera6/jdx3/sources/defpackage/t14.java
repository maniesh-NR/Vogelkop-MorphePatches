package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.leanplum.utils.SizeUtil;
import com.opera.android.autofill.CreditCard;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.suggestion.ChatSuggestionView;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.Calendar;
import org.chromium.content.browser.accessibility.captioning.CaptioningController;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class t14 implements g94, jr9, rwg, ph4, ktn, jtl, xjj, gjc, xo4, fjc {
    public final /* synthetic */ byte a;

    public /* synthetic */ t14(byte b) {
        this.a = b;
    }

    public /* synthetic */ t14(zo4 zo4Var) {
        this.a = (byte) 20;
    }

    public static /* synthetic */ void c(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void f(String str, int i, int i2, Object obj) {
        throw new IllegalArgumentException(str + i + obj + i2);
    }

    public static /* synthetic */ void g(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void h(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // defpackage.rwg
    public final void a(buk bukVar) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(bukVar.b.getWidth(), bukVar.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        bukVar.a(surface, n97.a(), new jg4(surface, surfaceTexture, (byte) 0));
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 8:
                return new g1h((f1h) obj);
            default:
                return Integer.valueOf(((ybl) obj).a);
        }
    }

    public final void cancel() {
    }

    public final Object e(WebContentsImpl webContentsImpl) {
        return new CaptioningController(webContentsImpl);
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) throws Resources.NotFoundException, NumberFormatException {
        switch (this.a) {
            case SizeUtil.textSize0_1 /* 18 */:
                CreditCard creditCard = (CreditCard) obj;
                al4 al4Var = (al4) iVar;
                al4Var.c = creditCard;
                vs vsVar = al4Var.b;
                StylingImageView stylingImageView = (StylingImageView) vsVar.d;
                Context context = ((i) al4Var).itemView.getContext();
                int iV = y9m.V(creditCard.f, context);
                if (iV == 0) {
                    iV = y9m.V(5, context);
                }
                stylingImageView.setImageResource(iV);
                yq1 yq1Var = (StylingTextView) vsVar.c;
                yq1 yq1Var2 = (StylingTextView) vsVar.e;
                yq1Var.setText(creditCard.c);
                String str = creditCard.e;
                String str2 = creditCard.d;
                boolean z = true;
                try {
                    int i = Integer.parseInt(str);
                    int i2 = Integer.parseInt(str2);
                    Calendar calendar = Calendar.getInstance();
                    int i3 = calendar.get(1);
                    int i4 = calendar.get(2) + 1;
                    if (i >= i3 && (i != i3 || i2 >= i4)) {
                        z = false;
                    }
                } catch (NumberFormatException unused) {
                }
                LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) vsVar.b;
                if (z) {
                    yq1Var2.setTextColor(f03.t(2130969119, layoutDirectionLinearLayout.getContext(), 2131102430));
                    yq1Var2.setText(layoutDirectionLinearLayout.getContext().getString(2132020373));
                } else {
                    yq1Var2.setTextColor(f03.t(2130971076, layoutDirectionLinearLayout.getContext(), 2131101872));
                    yq1Var2.setText(str2 + ((i) al4Var).itemView.getResources().getString(2132017823) + str);
                }
                ((i) al4Var).itemView.setOnClickListener(new nf(al4Var.d, creditCard, (byte) 24));
                break;
            default:
                Suggestion suggestion = (Suggestion) obj;
                kl4 kl4Var = (kl4) iVar;
                kl4Var.f = suggestion;
                ((ChatSuggestionView) kl4Var.b.b).setText(suggestion.b);
                Suggestion suggestion2 = kl4Var.f;
                if (suggestion2 != null && kl4Var.g == 100) {
                    kl4Var.e.D(suggestion2);
                    break;
                }
                break;
        }
    }

    public final void invoke(Object obj) {
        ((eig) obj).G(fzl.b);
    }

    public final boolean j(int i) {
        switch (this.a) {
            case 26:
                if (i == 1 || i == 2 || i == 3 || i == 4 || i == 32) {
                }
                break;
            default:
                if (i == 2 || i == 3 || i == 4 || i == 11 || i == 32) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.jtl
    public final Object k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131558875, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131364231;
        RecyclerView recyclerViewJ = w1h.j(2131364231, viewInflate);
        if (recyclerViewJ != null) {
            i = 2131364241;
            OperaListItem operaListItem = (OperaListItem) w1h.j(2131364241, viewInflate);
            if (operaListItem != null) {
                i = 2131364254;
                View viewJ = w1h.j(2131364254, viewInflate);
                if (viewJ != null) {
                    jq2 jq2Var = new jq2((LayoutDirectionLinearLayout) viewJ, (byte) 1);
                    i = 2131364270;
                    SeparatorView separatorView = (SeparatorView) w1h.j(2131364270, viewInflate);
                    if (separatorView != null) {
                        return new gl9(jq2Var, (LinearLayout) viewInflate, recyclerViewJ, separatorView, operaListItem);
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g94
    public final void l(Object obj) {
    }

    @Override // defpackage.xo4
    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        switch (this.a) {
            case 21:
                return remoteMediaClient.stop();
            case SizeUtil.textSize1 /* 22 */:
                return remoteMediaClient.stop();
            case 23:
                return remoteMediaClient.pause();
            case SizeUtil.textSize2 /* 24 */:
                return remoteMediaClient.play();
            default:
                return remoteMediaClient.pause();
        }
    }

    public final void o(Object obj, w69 w69Var) {
        ((eig) obj).c(new dig(w69Var));
    }
}
