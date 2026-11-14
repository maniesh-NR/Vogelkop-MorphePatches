package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.VpnProBanner;
import com.opera.android.startpage.livescore.LiveScoreCarouselStarButton;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class e73 implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e73(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                fdn fdnVar = (fdn) obj;
                ((f73) obj2).d.c.setImageDrawable(ddh.o(true, view.getContext(), fdnVar.h, fdnVar.i));
                break;
            case 1:
                StylingImageView stylingImageView = ((f73) obj2).d.f;
                Context context = view.getContext();
                ColorStateList colorStateListU = f03.u(((ac1) obj).b, context, 2131100356);
                if (colorStateListU == null) {
                    colorStateListU = ColorStateList.valueOf(context.getResources().getColor(2131100356));
                }
                stylingImageView.c(colorStateListU);
                break;
            case 2:
                o85 o85Var = (o85) obj2;
                o85Var.f((rmn) ((ize) obj).g());
                o85Var.a((q85) ((pde) o85Var.b.k).g());
                break;
            case 3:
                ImageView imageView = (ImageView) view.findViewById(2131362594);
                mej mejVar = ((at5) obj2).b;
                imageView.setImageDrawable(eti.d((eri) obj, mejVar.getContext(), fan.a(24.0f, mejVar.getContext().getResources())));
                break;
            case 4:
                dkf dkfVar = (dkf) obj;
                phj.w0((bz0) ((x77) obj2).d, sgb.F(2131232311, dkfVar), ImageView.ScaleType.CENTER_INSIDE, f03.W(2130969900, dkfVar), 0, (ColorStateList) null);
                break;
            case 5:
                EditText editText = (EditText) obj;
                ((AtomicInteger) obj2).set(editText.getCurrentHintTextColor());
                if (editText.hasFocus()) {
                    editText.setHintTextColor(0);
                    break;
                }
                break;
            case 6:
                TypedValue typedValue = new TypedValue();
                ((View) obj).getContext().getTheme().resolveAttribute(2130969733, typedValue, true);
                ((tu8) obj2).e.setImageResource(typedValue.resourceId);
                break;
            case 7:
                Toolbar toolbar = (Toolbar) obj;
                HashSet hashSet = FullscreenWebActivity.I;
                toolbar.A(((FullscreenWebActivity) obj2).l0(toolbar.getContext()));
                break;
            case 8:
                int i = LiveScoreCarouselStarButton.f;
                ((ImageView) ((kf) obj2).c).setImageTintList(nb6.v(2131100367, (Context) obj));
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                nga ngaVar = (nga) obj2;
                int iT = f03.t(2130971158, ((lrc) obj).l.getContext(), 2131101243);
                if (iT != ngaVar.a) {
                    ngaVar.a = iT;
                    ((StatusBarDrawingFrameLayout) ngaVar.c).e(p37.j0(ngaVar.b, iT));
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((kxe) obj2).H0((vs) obj);
                break;
            case 11:
                nga ngaVar2 = (nga) obj2;
                int iT2 = f03.t(2130971158, ((knh) obj).l.getContext(), 2131101243);
                if (iT2 != ngaVar2.a) {
                    ngaVar2.a = iT2;
                    ((StatusBarDrawingFrameLayout) ngaVar2.c).e(p37.j0(ngaVar2.b, iT2));
                    break;
                }
                break;
            case 12:
                ((StatusBarDrawingFrameLayout) obj2).e(((hck) obj).a.a(view.getContext()));
                break;
            case 13:
                b23 b23Var = (b23) obj;
                phj.w0((bz0) obj2, b23Var.j(view.getContext()), b23Var.n(), b23Var.m(view.getContext()), b23Var.k(view.getContext()), b23Var.l(view.getContext()));
                break;
            case 14:
                ((kdn) obj2).b.d.setImageResource(((ydn) ((tah) obj).d).c.isEnabled() ? 2131232587 : 2131232131);
                break;
            case 15:
                int i2 = VpnProBanner.q;
                ((VpnProBanner) obj2).setBackground(f03.x(2130970581, (Context) obj));
                break;
            default:
                nga ngaVar3 = (nga) obj2;
                int iT3 = f03.t(2130971158, ((mqn) obj).l.getContext(), 2131101243);
                if (iT3 != ngaVar3.a) {
                    ngaVar3.a = iT3;
                    ((StatusBarDrawingFrameLayout) ngaVar3.c).e(p37.j0(ngaVar3.b, iT3));
                    break;
                }
                break;
        }
    }
}
