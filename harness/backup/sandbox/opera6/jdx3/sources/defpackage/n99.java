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
public class n99 extends s63 {
    public bn7 l;
    public int m;

    @Override // defpackage.s63
    public final dgh s0(LayoutInflater layoutInflater, ViewGroup viewGroup, epj epjVar) {
        r9i r9iVar;
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
            layoutInflater.inflate(2131558840, viewGroup);
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
                        r9iVar = new r9i((Object) stylingImageView, (Object) viewStub, (Object) stylingTextView, (Object) new hck(new dxh(2130969120)), (byte) 16);
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
        layoutInflater.inflate(2131558841, viewGroup);
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
                            r9iVar = new r9i((Object) stylingImageView2, (Object) viewStub2, (Object) stylingTextView2, (Object) new kck(Arrays.asList(frameLayout, linearLayout)), (byte) 16);
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
        r9i r9iVar2 = r9iVar;
        ((StylingImageView) r9iVar2.b).setOnClickListener(new View.OnClickListener(this) { // from class: m99
            public final /* synthetic */ n99 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                n99 n99Var = this.b;
                switch (b3) {
                    case 0:
                        n99Var.g0();
                        break;
                    default:
                        n99Var.g0();
                        bn7 bn7Var = n99Var.l;
                        if (bn7Var != null) {
                            bn7Var.run();
                            break;
                        }
                        break;
                }
            }
        });
        Button button = (Button) ((ViewStub) r9iVar2.c).inflate().findViewById(2131362223);
        button.setText(2132021985);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: m99
            public final /* synthetic */ n99 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                n99 n99Var = this.b;
                switch (b3) {
                    case 0:
                        n99Var.g0();
                        break;
                    default:
                        n99Var.g0();
                        bn7 bn7Var = n99Var.l;
                        if (bn7Var != null) {
                            bn7Var.run();
                            break;
                        }
                        break;
                }
            }
        });
        int i2 = this.m;
        if (i2 != 0) {
            ((StylingTextView) r9iVar2.d).setText(i2);
        }
        return (dgh) r9iVar2.e;
    }
}
