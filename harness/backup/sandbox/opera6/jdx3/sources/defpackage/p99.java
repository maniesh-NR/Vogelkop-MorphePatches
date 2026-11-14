package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.touch.CurveOverlayView;
import java.util.Arrays;

/* loaded from: classes.dex */
public class p99 extends s63 {
    @Override // defpackage.k24
    public final void l0(boolean z) {
        y0();
    }

    @Override // defpackage.s63
    public final dgh s0(LayoutInflater layoutInflater, ViewGroup viewGroup, epj epjVar) {
        s9i s9iVar;
        int iOrdinal = epjVar.ordinal();
        final byte b = 0;
        final byte b2 = 1;
        int i = 2131363509;
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                h9o.p();
                return null;
            }
            if (viewGroup == null) {
                t3p.q("parent");
                return null;
            }
            layoutInflater.inflate(2131558861, viewGroup);
            ViewStub viewStub = (ViewStub) w1h.j(2131362224, viewGroup);
            if (viewStub == null) {
                i = 2131362224;
            } else if (((ViewStub) w1h.j(2131362225, viewGroup)) == null) {
                i = 2131362225;
            } else if (((CurveOverlayView) w1h.j(2131362467, viewGroup)) == null) {
                i = 2131362467;
            } else if (((LayoutDirectionLinearLayout) w1h.j(2131363145, viewGroup)) != null) {
                StylingImageView stylingImageView = (StylingImageView) w1h.j(2131362594, viewGroup);
                if (stylingImageView != null) {
                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363509, viewGroup);
                    if (stylingTextView != null) {
                        s9iVar = new s9i(stylingImageView, viewStub, stylingTextView, new hck(new dxh(2130969324)), (byte) 16, false);
                    }
                } else {
                    i = 2131362594;
                }
            } else {
                i = 2131363145;
            }
            t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
            return null;
        }
        if (viewGroup == null) {
            t3p.q("parent");
            return null;
        }
        layoutInflater.inflate(2131558862, viewGroup);
        ViewStub viewStub2 = (ViewStub) w1h.j(2131362224, viewGroup);
        if (viewStub2 == null) {
            i = 2131362224;
        } else if (((ViewStub) w1h.j(2131362225, viewGroup)) == null) {
            i = 2131362225;
        } else if (((CurveOverlayView) w1h.j(2131362467, viewGroup)) != null) {
            LinearLayout linearLayout = (LinearLayout) w1h.j(2131362704, viewGroup);
            if (linearLayout == null) {
                i = 2131362704;
            } else if (((LayoutDirectionLinearLayout) w1h.j(2131363145, viewGroup)) != null) {
                StylingImageView stylingImageView2 = (StylingImageView) w1h.j(2131362594, viewGroup);
                if (stylingImageView2 != null) {
                    StylingTextView stylingTextView2 = (StylingTextView) w1h.j(2131363509, viewGroup);
                    if (stylingTextView2 != null) {
                        i = 2131364554;
                        FrameLayout frameLayout = (FrameLayout) w1h.j(2131364554, viewGroup);
                        if (frameLayout != null) {
                            s9iVar = new s9i(stylingImageView2, viewStub2, stylingTextView2, new kck(Arrays.asList(frameLayout, linearLayout)), (byte) 16, false);
                        }
                    }
                } else {
                    i = 2131362594;
                }
            } else {
                i = 2131363145;
            }
        } else {
            i = 2131362467;
        }
        t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
        return null;
        s9i s9iVar2 = s9iVar;
        ((StylingImageView) s9iVar2.b).setOnClickListener(new View.OnClickListener(this) { // from class: o99
            public final /* synthetic */ p99 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                p99 p99Var = this.b;
                switch (b3) {
                    case 0:
                        p99Var.y0();
                        break;
                    default:
                        p99Var.y0();
                        break;
                }
            }
        });
        Button button = (Button) ((ViewStub) s9iVar2.c).inflate().findViewById(2131362223);
        button.setText(2132018586);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: o99
            public final /* synthetic */ p99 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                p99 p99Var = this.b;
                switch (b3) {
                    case 0:
                        p99Var.y0();
                        break;
                    default:
                        p99Var.y0();
                        break;
                }
            }
        });
        phj.b0((StylingTextView) s9iVar2.d, getString(2132019099), new dg7(this, (byte) 20));
        return (dgh) s9iVar2.e;
    }

    public final void y0() {
        if (getFragmentManager() == null || gge.G0(getFragmentManager())) {
            return;
        }
        s63.p0(getFragmentManager());
    }
}
