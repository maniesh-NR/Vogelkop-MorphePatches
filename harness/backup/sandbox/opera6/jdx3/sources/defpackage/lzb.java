package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.i;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OverlaidStatusBarDrawingView;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.bar.LimitedSideActionsAppbar;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.custom_views.ActionBarSearchView;
import com.opera.android.custom_views.LayoutDirectionActionBarContextView;
import com.opera.android.custom_views.LineHeaderTextView;
import com.opera.android.custom_views.OperaActionMenuItemView;
import com.opera.android.flow.MyFlowMessageRoot;
import com.opera.android.media.MediaPlayerMini;
import com.opera.android.settings.SettingsManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class lzb implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lzb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19, types: [android.view.View, com.opera.android.custom_views.LineHeaderTextView] */
    /* JADX WARN: Type inference failed for: r5v52, types: [android.graphics.drawable.Drawable$Callback, android.view.View, com.opera.android.custom_views.FadingRecyclerView] */
    @Override // defpackage.r8n
    public final void a(View view) {
        int iT;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mzb mzbVar = (mzb) obj;
                mzbVar.d.c.setTextColor(f03.t(((ydn) mzbVar.e.d).c.isEnabled() ? 2130970586 : 2130969091, ((i) mzbVar).itemView.getContext(), 2131101243));
                break;
            case 1:
                ActionBarContextView actionBarContextView = (LayoutDirectionActionBarContextView) obj;
                int i = LayoutDirectionActionBarContextView.H;
                if (actionBarContextView.c != null) {
                    ColorStateList colorStateListV = f03.v(actionBarContextView.getContext());
                    qe qeVar = actionBarContextView.c;
                    qeVar.j();
                    me meVar = qeVar.t.g;
                    j14.o0(meVar != null ? meVar.getDrawable() : null, colorStateListV);
                    j14.p0(actionBarContextView.c.j(), colorStateListV);
                    break;
                }
                break;
            case 2:
                LimitedSideActionsAppbar limitedSideActionsAppbar = (LimitedSideActionsAppbar) obj;
                int i2 = LimitedSideActionsAppbar.e;
                iec iecVar = limitedSideActionsAppbar.d;
                int iT2 = f03.t(2130968663, limitedSideActionsAppbar.getContext(), 2131099815);
                int iT3 = f03.t(2130968664, limitedSideActionsAppbar.getContext(), 2131099815);
                if (iT2 != iecVar.d || iT3 != iecVar.e) {
                    iecVar.d = iT2;
                    iecVar.e = iT3;
                    iecVar.h.invalidate();
                    break;
                }
                break;
            case 3:
                ?? r5 = (LineHeaderTextView) obj;
                int i3 = LineHeaderTextView.p;
                r5.o.setColor(f03.t(2130970698, r5.getContext(), 2131099816));
                r5.invalidate();
                break;
            case 4:
                ConstraintLayout constraintLayout = ((or2) obj).c;
                constraintLayout.setBackground(w8h.u(2131232747, constraintLayout.getContext()));
                break;
            case 5:
                eyi eyiVar = ((lrc) obj).s.a.i;
                xf8.G0((kze) eyiVar.d, eyiVar.b ? "ofa-private-mode" : "ofa-".concat(((SettingsManager) eyiVar.c).g().d));
                break;
            case 6:
                dvc dvcVar = (dvc) obj;
                boolean zHasFocus = dvcVar.v.hasFocus();
                ActionBarSearchView actionBarSearchView = dvcVar.u;
                if (actionBarSearchView != null) {
                    if (!zHasFocus) {
                        Drawable drawableX = f03.x(2130969054, actionBarSearchView.getContext());
                        if (drawableX != null) {
                            dvcVar.u.setBackground(drawableX);
                            break;
                        }
                    } else {
                        actionBarSearchView.setBackgroundResource(2131232752);
                        break;
                    }
                }
                break;
            case 7:
                hwc hwcVar = (hwc) obj;
                String str = hwcVar.e;
                if (str != null) {
                    hwcVar.c0(str);
                    break;
                }
                break;
            case 8:
                ((bpd) obj).b0();
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                nga ngaVar = ((i7d) obj).p;
                if (ngaVar != null && (iT = f03.t(2130969325, view.getContext(), 2131101243)) != ngaVar.a) {
                    ngaVar.a = iT;
                    ((StatusBarDrawingFrameLayout) ngaVar.c).e(p37.j0(ngaVar.b, iT));
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) ((wub) obj).a;
                statusBarDrawingFrameLayout.e(f03.t(2130969093, statusBarDrawingFrameLayout.getContext(), 2131101243));
                break;
            case 11:
                int i4 = MediaPlayerMini.d;
                ((MediaPlayerMini) obj).c.g();
                break;
            case 12:
                cmd cmdVar = (cmd) obj;
                if (cmdVar.g != null) {
                    cmdVar.U();
                    cmdVar.V();
                    break;
                }
                break;
            case 13:
                ((dwd) obj).f(view);
                break;
            case 14:
                ((d0e) obj).X();
                break;
            case 15:
                ((rhj) obj).d();
                break;
            case 16:
                ?? r52 = ((fge) obj).A;
                int defaultColor = f03.G(r52.getContext()).getDefaultColor();
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{p37.m0(defaultColor, 0), defaultColor, defaultColor});
                gradientDrawable.setSize(0, fan.a(64.0f, r52.getResources()));
                w3a w3aVar = new w3a(gradientDrawable, 87, false);
                w3a w3aVar2 = r52.U0;
                if (w3aVar2 != null) {
                    w3aVar2.setCallback(null);
                }
                r52.U0 = w3aVar;
                w3aVar.setCallback(r52);
                r52.invalidate();
                break;
            case 17:
                ((cge) obj).d.setColor(f03.F(view.getContext()).getDefaultColor());
                view.invalidate();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                MyFlowMessageRoot myFlowMessageRoot = (MyFlowMessageRoot) obj;
                int i5 = MyFlowMessageRoot.l;
                myFlowMessageRoot.d = sgb.F(2131231688, myFlowMessageRoot.getContext());
                myFlowMessageRoot.e = sgb.F(2131231687, myFlowMessageRoot.getContext());
                myFlowMessageRoot.f = sgb.F(2131231689, myFlowMessageRoot.getContext());
                myFlowMessageRoot.d.setCallback(myFlowMessageRoot);
                myFlowMessageRoot.e.setCallback(myFlowMessageRoot);
                myFlowMessageRoot.f.setCallback(myFlowMessageRoot);
                myFlowMessageRoot.d.setState(myFlowMessageRoot.getDrawableState());
                myFlowMessageRoot.e.setState(myFlowMessageRoot.getDrawableState());
                myFlowMessageRoot.f.setState(myFlowMessageRoot.getDrawableState());
                myFlowMessageRoot.invalidate();
                break;
            case 19:
                ((lqe) obj).b();
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((pte) obj).J0();
                break;
            case 21:
                ((ive) obj).m0();
                break;
            case SizeUtil.textSize1 /* 22 */:
                ((jve) obj).j0();
                break;
            case 23:
                ((kxe) obj).k.e(f03.t(2130971158, view.getContext(), 2131101243));
                break;
            case SizeUtil.textSize2 /* 24 */:
                k5o k5oVar = (k5o) obj;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ((or2) k5oVar.b).e;
                constraintLayout2.setBackgroundTintList(ColorStateList.valueOf(((v8k) ((tsd) k5oVar.c).g()).d(constraintLayout2.getContext())));
                break;
            case 25:
                vbf vbfVar = (vbf) obj;
                int i6 = vbfVar.o ? 2130971070 : 2130971076;
                bq1 bq1Var = vbfVar.s;
                bq1Var.setHintTextColor(f03.W(i6, bq1Var.getContext()));
                v73 v73Var = vbfVar.q;
                Iterator it = v73Var.a.values().iterator();
                while (it.hasNext()) {
                    ((uaf) it.next()).a(v73Var.b);
                }
                q9n.J(view, OmniButtonView.class, new rqd((byte) 29));
                break;
            case 26:
                boolean zI = f03.I(view.getContext());
                mcj mcjVar = ((pdf) obj).h;
                mcjVar.t(zI);
                mcjVar.r(zI);
                break;
            case 27:
                khf khfVar = (khf) ((z4o) obj);
                OverlaidStatusBarDrawingView overlaidStatusBarDrawingView = khfVar.r;
                int iA = khfVar.s.a(overlaidStatusBarDrawingView.getContext());
                if (iA != overlaidStatusBarDrawingView.e) {
                    overlaidStatusBarDrawingView.e = iA;
                    overlaidStatusBarDrawingView.invalidate();
                    c1f c1fVar = overlaidStatusBarDrawingView.c;
                    if (c1fVar != null) {
                        c1fVar.e();
                        break;
                    }
                }
                break;
            case 28:
                c1f c1fVar2 = ((lhf) obj).c;
                if (c1fVar2 != null) {
                    c1fVar2.e();
                    break;
                }
                break;
            default:
                int i7 = OperaActionMenuItemView.r;
                view.setBackground(f03.x(((OperaActionMenuItemView) obj).s() ? 2130970694 : 2130968581, view.getContext()));
                break;
        }
    }
}
