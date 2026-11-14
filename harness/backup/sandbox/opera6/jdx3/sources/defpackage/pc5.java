package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.chip.Chip;
import com.leanplum.utils.SizeUtil;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.bar.ExtraSideActionsAppbar;
import com.opera.android.bar.FindInPage;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.custom_views.PullSpinner;
import com.opera.android.menu.CustomMenuItemView;
import com.opera.android.startpage.layout.feed_specific.HiddenStartPageContentHintView;
import com.opera.android.webcore.FastResizeWebViewContainer;
import com.opera.android.widget.ClickAwareCardView;
import com.opera.android.widget.GraphView;
import java.util.Optional;

/* loaded from: classes.dex */
public final /* synthetic */ class pc5 implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pc5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ pc5(tc6 tc6Var, GraphView graphView) {
        this.a = (byte) 3;
        this.b = graphView;
    }

    /* JADX WARN: Type inference failed for: r4v25, types: [android.view.View, com.opera.android.custom_views.FadingRecyclerView] */
    @Override // defpackage.r8n
    public final void a(View view) {
        String str;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((qc5) obj).a();
                break;
            case 1:
                int i = CustomMenuItemView.f;
                ((CustomMenuItemView) obj).d();
                break;
            case 2:
                c76 c76Var = (c76) obj;
                vs vsVar = c76Var.a;
                if (vsVar == null) {
                    vsVar = null;
                }
                MenuItem menuItemFindItem = ((LayoutDirectionToolbar) vsVar.e).o().findItem(2131363498);
                int iF0 = c76Var.f0(view.getContext(), menuItemFindItem.isEnabled());
                Drawable icon = menuItemFindItem.getIcon();
                if (icon != null) {
                    icon.setColorFilter(new PorterDuffColorFilter(iF0, PorterDuff.Mode.SRC_IN));
                    break;
                }
                break;
            case 3:
                GraphView graphView = (GraphView) obj;
                graphView.i = f03.u(2130969831, graphView.getContext(), 2131099816);
                graphView.invalidate();
                graphView.h = f03.u(2130969829, graphView.getContext(), 2131099816);
                graphView.a();
                break;
            case 4:
                wg7 wg7Var = (wg7) obj;
                StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = wg7Var.k;
                int iT = f03.t(wg7Var.P ? 2130969496 : 2130969497, statusBarDrawingFrameLayout.getContext(), 2131101243);
                if (iT != statusBarDrawingFrameLayout.k) {
                    statusBarDrawingFrameLayout.k = iT;
                    statusBarDrawingFrameLayout.b();
                    break;
                }
                break;
            case 5:
                ((ss7) obj).O0();
                break;
            case 6:
                ((hu7) obj).U();
                break;
            case 7:
                ((ou7) obj).U();
                break;
            case 8:
                Chip chip = (qu7) obj;
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(f03.t(2130969255, chip.getContext(), 2131101243));
                tx4 tx4Var = chip.e;
                if (tx4Var != null && tx4Var.I != colorStateListValueOf) {
                    tx4Var.I = colorStateListValueOf;
                    tx4Var.onStateChange(tx4Var.getState());
                }
                ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(f03.t(2130969254, chip.getContext(), 2131101243));
                chip.setTextColor(colorStateListValueOf2);
                tx4 tx4Var2 = chip.e;
                if (tx4Var2 != null && tx4Var2.X != colorStateListValueOf2) {
                    tx4Var2.X = colorStateListValueOf2;
                    if (tx4Var2.W()) {
                        tx4Var2.V.setTintList(colorStateListValueOf2);
                    }
                    tx4Var2.onStateChange(tx4Var2.getState());
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((wnm) ((igi) obj).g).u();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ExtraSideActionsAppbar extraSideActionsAppbar = (ExtraSideActionsAppbar) obj;
                int i2 = ExtraSideActionsAppbar.f;
                bn8 bn8Var = extraSideActionsAppbar.d;
                int iT2 = f03.t(2130969329, extraSideActionsAppbar.getContext(), 2131099815);
                int iT3 = f03.t(2130968665, extraSideActionsAppbar.getContext(), 2131099815);
                int iT4 = f03.t(2130968664, extraSideActionsAppbar.getContext(), 2131099815);
                bn8Var.h = iT2;
                bn8Var.g = iT3;
                bn8Var.i = iT4;
                bn8Var.k.invalidate();
                break;
            case 11:
                ?? r4 = (FadingRecyclerView) obj;
                int i3 = FadingRecyclerView.V0;
                r4.M0.setColor(f03.D(r4.getContext()).getDefaultColor());
                r4.invalidate();
                break;
            case 12:
                ((xo8) obj).b();
                break;
            case 13:
                WebContentsWrapper webContentsWrapper = (WebContentsWrapper) obj;
                int i4 = FastResizeWebViewContainer.i;
                if (!webContentsWrapper.h()) {
                    webContentsWrapper.i();
                    break;
                }
                break;
            case 14:
                ((fr8) obj).o();
                break;
            case 15:
                ((yk3) obj).a0();
                break;
            case 16:
                ((lu8) obj).j0();
                break;
            case 17:
                lx lxVar = (lx) obj;
                lxVar.j.setBackgroundColor(((Boolean) lxVar.i.g()).booleanValue() ? f03.t(2130969331, ((i) lxVar).itemView.getContext(), 2131101243) : 0);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                PullSpinner pullSpinner = ((tv8) obj).d;
                pullSpinner.e.c = f03.C(pullSpinner.getContext());
                pullSpinner.invalidate();
                break;
            case 19:
                xv8 xv8Var = (xv8) obj;
                boolean z = xv8Var.z;
                ClickAwareCardView clickAwareCardView = xv8Var.A;
                if (!z) {
                    clickAwareCardView.setBackgroundColor(0);
                    break;
                } else {
                    clickAwareCardView.setBackgroundColor(f03.t(2130969331, ((i) xv8Var).itemView.getContext(), 2131101243));
                    break;
                }
            case SizeUtil.textSize0 /* 20 */:
                FindInPage findInPage = (FindInPage) obj;
                int i5 = FindInPage.w;
                findInPage.k.setTextColor(findInPage.e > 0 ? findInPage.l.getHintTextColors() : f03.y(findInPage.k.getContext()));
                break;
            case 21:
                ja2 ja2Var = ((ac9) obj).b;
                if ((view instanceof ImageView) && (ja2Var instanceof zb9)) {
                    zb9 zb9Var = (zb9) ja2Var;
                    bc9.u((ImageView) view, zb9Var.e, zb9Var.f);
                    break;
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                cd9 cd9Var = (cd9) obj;
                if (cd9Var.n != 3 && (str = cd9Var.s) != null) {
                    cd9Var.C0(str);
                    break;
                }
                break;
            case 23:
                b5a b5aVar = (b5a) obj;
                RecyclerView recyclerView = b5aVar.a;
                b5aVar.l = f03.t(b5aVar.d, recyclerView.getContext(), 2131101243);
                b5aVar.k.clear();
                recyclerView.invalidate();
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((d5a) obj).c();
                break;
            case 25:
                ne5 ne5Var = (ne5) obj;
                ne5Var.n(((cyj) ((tsd) ne5Var.g).g()).h);
                break;
            case 26:
                ((r8a) obj).c.setColor(f03.F(view.getContext()).getDefaultColor());
                break;
            case 27:
                rxh rxhVar = HiddenStartPageContentHintView.p;
                ((HiddenStartPageContentHintView) obj).a(true);
                break;
            case 28:
                jba jbaVar = (jba) obj;
                ColorDrawable colorDrawable = jbaVar.b;
                int alpha = colorDrawable.getAlpha();
                View view2 = jbaVar.a;
                colorDrawable.setColor(f03.C(view2.getContext()));
                colorDrawable.setAlpha(alpha);
                Drawable background = view2.getBackground();
                if (!(background instanceof jba)) {
                    Drawable drawable = (Drawable) Optional.ofNullable(background).orElse(new ColorDrawable(0));
                    jbaVar.d = drawable;
                    jbaVar.setDrawableByLayerId(1234, drawable);
                    view2.setBackground(jbaVar);
                    break;
                }
                break;
            default:
                ((rkb) obj).e();
                break;
        }
    }
}
