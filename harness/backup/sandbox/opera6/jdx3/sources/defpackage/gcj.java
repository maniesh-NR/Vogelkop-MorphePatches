package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.FadingNestedScrollView;
import com.opera.android.custom_views.Spinner;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class gcj extends ltl {
    public static final Bitmap.CompressFormat y = Bitmap.CompressFormat.PNG;
    public final dx3 r;
    public final ag7 s;
    public final umi t;
    public final nej u;
    public final ysj v;
    public final orm w;
    public pt1 x;

    /* JADX WARN: Illegal instructions before constructor call */
    public gcj(dx3 dx3Var, ag7 ag7Var, umi umiVar, nej nejVar, ysj ysjVar, orm ormVar) {
        itl itlVar = (itl) u7k.j(2131559319).a;
        itlVar.e = true;
        itlVar.b = 2131755059;
        super(itlVar);
        this.r = dx3Var;
        this.s = ag7Var;
        this.t = umiVar;
        this.u = nejVar;
        this.v = ysjVar;
        this.w = ormVar;
    }

    public final void G0(Function1 function1) {
        pt1 pt1Var = this.x;
        if (pt1Var == null) {
            pt1Var = null;
        }
        RelativeLayout relativeLayout = (RelativeLayout) pt1Var.f;
        Bitmap bitmapU = z5i.u(relativeLayout.getWidth(), relativeLayout.getHeight(), Bitmap.Config.ARGB_8888);
        if (bitmapU != null) {
            bitmapU.eraseColor(0);
            relativeLayout.draw(new Canvas(bitmapU));
        } else {
            bitmapU = null;
        }
        if (bitmapU == null) {
            function1.invoke((Object) null);
        } else {
            new rml(Unit.a, this.t).a(new vvf(bitmapU, this, (byte) 17)).t(new vvf(bitmapU, function1, (byte) 18)).l();
        }
    }

    @Override // defpackage.ltl
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        byte b = 1;
        orm ormVar = this.w;
        if (itemId == 2131364409) {
            ((x5f) ormVar).S(27);
            G0(new ecj(this, (byte) 2));
        } else if (menuItem.getItemId() == 2131364410) {
            ((x5f) ormVar).S(26);
            G0(new ecj(this, b));
        }
        return true;
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) throws Resources.NotFoundException {
        ((x5f) this.w).S(25);
        View viewFindViewById = statusBarDrawingFrameLayout.findViewById(2131364104);
        int i = 2131362409;
        if (((FadingNestedScrollView) w1h.j(2131362409, viewFindViewById)) != null) {
            i = 2131363978;
            ImageView imageView = (ImageView) w1h.j(2131363978, viewFindViewById);
            if (imageView != null) {
                i = 2131363979;
                RelativeLayout relativeLayout = (RelativeLayout) w1h.j(2131363979, viewFindViewById);
                if (relativeLayout != null) {
                    StatusBarDrawingFrameLayout statusBarDrawingFrameLayout2 = (StatusBarDrawingFrameLayout) viewFindViewById;
                    i = 2131364417;
                    TextView textView = (TextView) w1h.j(2131364417, viewFindViewById);
                    if (textView != null) {
                        i = 2131364525;
                        Spinner spinner = (Spinner) w1h.j(2131364525, viewFindViewById);
                        if (spinner != null) {
                            i = 2131363525;
                            TextView textView2 = (TextView) w1h.j(2131363525, viewFindViewById);
                            if (textView2 != null) {
                                i = 2131364794;
                                if (w1h.j(2131364794, viewFindViewById) != null) {
                                    this.x = new pt1((ViewGroup) statusBarDrawingFrameLayout2, (View) imageView, (Object) relativeLayout, (View) textView, (View) spinner, (View) textView2, (byte) 18);
                                    Bundle arguments = getArguments();
                                    if (arguments != null) {
                                        Parcelable parcelable = arguments.getParcelable("share_intent");
                                        Intent intent = parcelable instanceof Intent ? (Intent) parcelable : null;
                                        if (intent != null) {
                                            String stringExtra = intent.getStringExtra("android.intent.extra.TITLE");
                                            String strJ = ocp.j(intent);
                                            byte b = 0;
                                            if (stringExtra != null && !StringsKt.N(stringExtra)) {
                                                pt1 pt1Var = this.x;
                                                if (pt1Var == null) {
                                                    pt1Var = null;
                                                }
                                                ((TextView) pt1Var.b).setVisibility(0);
                                                pt1 pt1Var2 = this.x;
                                                if (pt1Var2 == null) {
                                                    pt1Var2 = null;
                                                }
                                                ((TextView) pt1Var2.b).setText(stringExtra);
                                            }
                                            if (strJ != null) {
                                                pt1 pt1Var3 = this.x;
                                                if (pt1Var3 == null) {
                                                    pt1Var3 = null;
                                                }
                                                ((TextView) pt1Var3.c).setVisibility(0);
                                                pt1 pt1Var4 = this.x;
                                                if (pt1Var4 == null) {
                                                    pt1Var4 = null;
                                                }
                                                na2.R((TextView) pt1Var4.c, new dkl(strJ), new wkl());
                                                pt1 pt1Var5 = this.x;
                                                if (pt1Var5 == null) {
                                                    pt1Var5 = null;
                                                }
                                                ((Spinner) pt1Var5.g).a();
                                                pt1 pt1Var6 = this.x;
                                                if (pt1Var6 == null) {
                                                    pt1Var6 = null;
                                                }
                                                ((Spinner) pt1Var6.g).setAlpha(1.0f);
                                                pt1 pt1Var7 = this.x;
                                                ((ImageView) (pt1Var7 != null ? pt1Var7 : null).e).setAlpha(0.0f);
                                                Context context = statusBarDrawingFrameLayout.getContext();
                                                ecj ecjVar = new ecj(this, b);
                                                Resources resources = context.getResources();
                                                ArrayList arrayList = new ArrayList();
                                                int dimensionPixelSize = resources.getDimensionPixelSize(2131167494);
                                                int iT = f03.t(2130970478, context, 2131101243);
                                                Drawable drawableI0 = j14.i0(2131232497, context);
                                                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131167493);
                                                arrayList.add(new seh(drawableI0, new fr(dimensionPixelSize2, dimensionPixelSize2, (byte) 19)));
                                                Drawable drawableI02 = j14.i0(2131232496, context);
                                                if (dimensionPixelSize > 0) {
                                                    new rml(new teh(strJ, dimensionPixelSize, iT, arrayList, drawableI02), this.t).b(new bli((byte) 17)).t(new tji((Object) ecjVar, (byte) 16)).l();
                                                    return;
                                                } else {
                                                    hai.d();
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i)));
    }

    @Override // defpackage.ltl
    public final void z0() {
    }
}
