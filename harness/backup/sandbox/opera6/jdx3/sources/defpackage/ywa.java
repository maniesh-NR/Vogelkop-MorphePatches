package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.opera.hype.image.editor.EditImage;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lywa;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "image-editor"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ywa extends Fragment {
    public static final /* synthetic */ xtb[] g = {new pee(ywa.class, "views", "getViews()Lcom/opera/hype/image/editor/databinding/HypeIeFragmentBinding;", 0)};
    public final qs2 a;
    public PointF b;
    public final zyk c;
    public final zyk d;
    public final xt2 e;
    public final zyk f;

    public ywa() {
        super(2131558926);
        this.a = new qs2(new bli((byte) 2), new qwa(this, (byte) 3));
        this.c = z4c.b(new qwa(this, (byte) 1));
        this.d = z4c.b(new qwa(this, (byte) 2));
        this.e = new xt2(this, (byte) 5);
        this.f = z4c.b(new qwa(this, (byte) 0));
    }

    public abstract lxa f0();

    public final lxa g0() {
        return (lxa) this.c.getValue();
    }

    public final ora h0() {
        xtb xtbVar = g[0];
        qs2 qs2Var = this.a;
        qs2Var.d();
        return (ora) qs2Var.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i0(nt5 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.uwa
            if (r0 == 0) goto L13
            r0 = r10
            uwa r0 = (defpackage.uwa) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            uwa r0 = new uwa
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            com.opera.hype.image.editor.EditImage r9 = r0.t
            ybh.y(r10)
            goto Lbf
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r9)
            return r6
        L35:
            ybh.y(r10)
            goto L76
        L39:
            ybh.y(r10)
            lxa r10 = r9.g0()
            qie r10 = r10.d
            r10.getClass()
            deg r10 = yne.b
            java.util.ArrayList r2 = defpackage.quk.a
            lxa r2 = r9.g0()
            android.net.Uri r2 = r2.e
            dwh r2 = r10.g(r2)
            r2.d = r5
            r2.b()
            int r7 = r2.f
            if (r7 != 0) goto Ld5
            android.graphics.drawable.ShapeDrawable r7 = r2.j
            if (r7 != 0) goto Lcf
            r2.e = r3
            r2.c = r5
            ora r7 = r9.h0()
            com.opera.hype.image.editor.EditImage r7 = r7.e
            ean r7 = r7.b
            ydb r7 = r7.a
            r0.w = r5
            java.lang.Object r10 = defpackage.quk.b(r2, r10, r7, r0)
            if (r10 == r1) goto Lbb
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L91
            androidx.fragment.app.r r9 = r9.requireActivity()
            java.lang.String r10 = "Couldn't open the image"
            android.widget.Toast r10 = android.widget.Toast.makeText(r9, r10, r3)
            r10.show()
            r9.finish()
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L91:
            ora r10 = r9.h0()
            com.opera.hype.image.editor.EditImage r10 = r10.e
            android.graphics.Bitmap r2 = r10.d()
            if (r2 != 0) goto La0
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        La0:
            lxa r9 = r9.g0()
            qie r9 = r9.d
            java.lang.Object r9 = r9.b
            cv6 r9 = bb7.a
            bz1 r5 = new bz1
            r7 = 14
            r5.<init>(r7, r6, r2)
            r0.t = r10
            r0.w = r4
            java.lang.Object r9 = na2.Z(r9, r5, r0)
            if (r9 != r1) goto Lbc
        Lbb:
            return r1
        Lbc:
            r8 = r10
            r10 = r9
            r9 = r8
        Lbf:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            qk3 r9 = r9.o
            fz2 r9 = r9.c
            xtb[] r0 = defpackage.qk3.d
            r0 = r0[r3]
            r9.g(r0, r10)
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        Lcf:
            java.lang.String r9 = "Placeholder image already set."
            defpackage.qp2.n(r9)
            return r6
        Ld5:
            java.lang.String r9 = "Placeholder resource already set."
            defpackage.qp2.n(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywa.i0(nt5):java.lang.Object");
    }

    public final void j0(nsl nslVar) {
        boolean z = nslVar != null ? nslVar.b : false;
        if (Build.VERSION.SDK_INT < 30) {
            h0().a.setSystemUiVisibility(z ? 6918 : 768);
            return;
        }
        WindowInsetsController windowInsetsController = h0().a.getWindowInsetsController();
        if (windowInsetsController != null) {
            if (z) {
                windowInsetsController.setSystemBarsBehavior(2);
                windowInsetsController.hide(WindowInsets.Type.systemBars());
                windowInsetsController.hide(WindowInsets.Type.navigationBars());
            } else {
                windowInsetsController.setSystemBarsBehavior(1);
                windowInsetsController.show(WindowInsets.Type.systemBars());
                windowInsetsController.show(WindowInsets.Type.navigationBars());
            }
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().a(this, this.e);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        zyk zykVar = this.d;
        if (zykVar.isInitialized()) {
            ((bz0) zykVar.getValue()).cancel();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        hy7 hy7VarF;
        super.onViewCreated(view, bundle);
        int i = 2131361857;
        ImageView imageView = (ImageView) w1h.j(2131361857, view);
        if (imageView != null) {
            i = 2131361877;
            ImageView imageView2 = (ImageView) w1h.j(2131361877, view);
            if (imageView2 != null) {
                i = 2131361878;
                ViewSwitcher viewSwitcher = (ViewSwitcher) w1h.j(2131361878, view);
                if (viewSwitcher != null) {
                    i = 2131362367;
                    if (((ImageView) w1h.j(2131362367, view)) != null) {
                        i = 2131362368;
                        if (((ImageView) w1h.j(2131362368, view)) != null) {
                            i = 2131362371;
                            if (((ImageView) w1h.j(2131362371, view)) != null) {
                                i = 2131362372;
                                if (((ImageView) w1h.j(2131362372, view)) != null) {
                                    i = 2131362379;
                                    if (((ImageView) w1h.j(2131362379, view)) != null) {
                                        i = 2131362380;
                                        if (((ImageView) w1h.j(2131362380, view)) != null) {
                                            i = 2131362381;
                                            if (((ImageView) w1h.j(2131362381, view)) != null) {
                                                i = 2131362662;
                                                EditImage editImage = (EditImage) w1h.j(2131362662, view);
                                                if (editImage != null) {
                                                    i = 2131363121;
                                                    ImageView imageView3 = (ImageView) w1h.j(2131363121, view);
                                                    if (imageView3 != null) {
                                                        i = 2131363122;
                                                        ImageView imageView4 = (ImageView) w1h.j(2131363122, view);
                                                        if (imageView4 != null) {
                                                            i = 2131363123;
                                                            View viewJ = w1h.j(2131363123, view);
                                                            if (viewJ != null) {
                                                                i = 2131363061;
                                                                ProgressBar progressBar = (ProgressBar) w1h.j(2131363061, view);
                                                                if (progressBar != null) {
                                                                    i = 2131364451;
                                                                    LinearLayout linearLayout = (LinearLayout) w1h.j(2131364451, view);
                                                                    if (linearLayout != null) {
                                                                        i = 2131364452;
                                                                        LinearLayout linearLayout2 = (LinearLayout) w1h.j(2131364452, view);
                                                                        if (linearLayout2 != null) {
                                                                            i = 2131364724;
                                                                            ImageView imageView5 = (ImageView) w1h.j(2131364724, view);
                                                                            if (imageView5 != null) {
                                                                                i = 2131364725;
                                                                                ImageView imageView6 = (ImageView) w1h.j(2131364725, view);
                                                                                if (imageView6 != null) {
                                                                                    i = 2131364726;
                                                                                    ImageView imageView7 = (ImageView) w1h.j(2131364726, view);
                                                                                    if (imageView7 != null) {
                                                                                        i = 2131364727;
                                                                                        ImageView imageView8 = (ImageView) w1h.j(2131364727, view);
                                                                                        if (imageView8 != null) {
                                                                                            i = 2131364728;
                                                                                            View viewJ2 = w1h.j(2131364728, view);
                                                                                            if (viewJ2 != null) {
                                                                                                i = 2131364788;
                                                                                                if (((ImageView) w1h.j(2131364788, view)) != null) {
                                                                                                    i = 2131364789;
                                                                                                    if (((ImageView) w1h.j(2131364789, view)) != null) {
                                                                                                        i = 2131364790;
                                                                                                        if (((ImageView) w1h.j(2131364790, view)) != null) {
                                                                                                            i = 2131364791;
                                                                                                            if (((ImageView) w1h.j(2131364791, view)) != null) {
                                                                                                                i = 2131364792;
                                                                                                                if (((ImageView) w1h.j(2131364792, view)) != null) {
                                                                                                                    i = 2131364793;
                                                                                                                    if (((ImageView) w1h.j(2131364793, view)) != null) {
                                                                                                                        ora oraVar = new ora((ConstraintLayout) view, imageView, imageView2, viewSwitcher, editImage, imageView3, imageView4, viewJ, progressBar, linearLayout, linearLayout2, imageView5, imageView6, imageView7, imageView8, viewJ2);
                                                                                                                        final byte b = 0;
                                                                                                                        xtb xtbVar = g[0];
                                                                                                                        qs2 qs2Var = this.a;
                                                                                                                        qs2Var.d();
                                                                                                                        qs2Var.e(oraVar);
                                                                                                                        mt5 mt5Var = null;
                                                                                                                        j14.Y(new ya9(g0().n, g0().m, new km4((byte) 6, (mt5) null, this), (byte) 0), fsp.y(getViewLifecycleOwner()));
                                                                                                                        ConstraintLayout constraintLayout = h0().a;
                                                                                                                        bm8 bm8Var = new bm8(this, (byte) 20);
                                                                                                                        WeakHashMap weakHashMap = r5n.a;
                                                                                                                        h5n.c(constraintLayout, bm8Var);
                                                                                                                        h0().b.setOnClickListener(new View.OnClickListener(this) { // from class: rwa
                                                                                                                            public final /* synthetic */ ywa b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view2) {
                                                                                                                                byte b2 = b;
                                                                                                                                ywa ywaVar = this.b;
                                                                                                                                switch (b2) {
                                                                                                                                    case 0:
                                                                                                                                        xtb[] xtbVarArr = ywa.g;
                                                                                                                                        ywaVar.g0().g();
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        xtb[] xtbVarArr2 = ywa.g;
                                                                                                                                        lxa lxaVarG0 = ywaVar.g0();
                                                                                                                                        nak nakVar = lxaVarG0.n;
                                                                                                                                        mt5 mt5Var2 = null;
                                                                                                                                        if (!lxaVarG0.o && nakVar.getValue() != null) {
                                                                                                                                            nakVar.j((Object) null);
                                                                                                                                            break;
                                                                                                                                        } else {
                                                                                                                                            nakVar.j((Object) null);
                                                                                                                                            d3k d3kVar = lxaVarG0.u;
                                                                                                                                            if (d3kVar != null) {
                                                                                                                                                d3kVar.k((CancellationException) null);
                                                                                                                                            }
                                                                                                                                            lxaVarG0.f(new fxa());
                                                                                                                                            lxaVarG0.u = na2.B(p7n.a(lxaVarG0), (CoroutineContext) null, (rx5) null, new p71((byte) 14, mt5Var2, (Object) lxaVarG0), 3);
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        final byte b2 = 1;
                                                                                                                        h0().c.setOnClickListener(new View.OnClickListener(this) { // from class: rwa
                                                                                                                            public final /* synthetic */ ywa b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view2) {
                                                                                                                                byte b22 = b2;
                                                                                                                                ywa ywaVar = this.b;
                                                                                                                                switch (b22) {
                                                                                                                                    case 0:
                                                                                                                                        xtb[] xtbVarArr = ywa.g;
                                                                                                                                        ywaVar.g0().g();
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        xtb[] xtbVarArr2 = ywa.g;
                                                                                                                                        lxa lxaVarG0 = ywaVar.g0();
                                                                                                                                        nak nakVar = lxaVarG0.n;
                                                                                                                                        mt5 mt5Var2 = null;
                                                                                                                                        if (!lxaVarG0.o && nakVar.getValue() != null) {
                                                                                                                                            nakVar.j((Object) null);
                                                                                                                                            break;
                                                                                                                                        } else {
                                                                                                                                            nakVar.j((Object) null);
                                                                                                                                            d3k d3kVar = lxaVarG0.u;
                                                                                                                                            if (d3kVar != null) {
                                                                                                                                                d3kVar.k((CancellationException) null);
                                                                                                                                            }
                                                                                                                                            lxaVarG0.f(new fxa());
                                                                                                                                            lxaVarG0.u = na2.B(p7n.a(lxaVarG0), (CoroutineContext) null, (rx5) null, new p71((byte) 14, mt5Var2, (Object) lxaVarG0), 3);
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        int iIndexOfChild = h0().d.indexOfChild(h0().c);
                                                                                                                        int iIndexOfChild2 = h0().d.indexOfChild(h0().i);
                                                                                                                        nak nakVar = g0().l;
                                                                                                                        xwa xwaVar = new xwa(this, iIndexOfChild, iIndexOfChild2, (mt5) null);
                                                                                                                        byte b3 = 2;
                                                                                                                        j14.Y(new z99(nakVar, xwaVar, (byte) 2), fsp.y(getViewLifecycleOwner()));
                                                                                                                        j14.Y(new z99(g0().m, new wwa(this, mt5Var, b2), (byte) 2), fsp.y(getViewLifecycleOwner()));
                                                                                                                        h0().e.m = new qq6(this, (byte) 19);
                                                                                                                        h0().e.r = new ge5(this, fsp.y(getViewLifecycleOwner()), (byte) 25);
                                                                                                                        h0().e.k(g0().t);
                                                                                                                        for (nsl nslVar : g0().f) {
                                                                                                                            ((View) m5n.f(h0().a, nslVar.a)).setOnClickListener(new jf7(this, nslVar, (byte) 12));
                                                                                                                        }
                                                                                                                        j14.Y(new z99((f99) g0().j.b, new vwa(this, mt5Var, b), (byte) 2), fsp.y(getViewLifecycleOwner()));
                                                                                                                        final i16 i16Var = g0().i;
                                                                                                                        h0().g.setOnClickListener(new View.OnClickListener() { // from class: swa
                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view2) {
                                                                                                                                xba xbaVar;
                                                                                                                                byte b4 = b;
                                                                                                                                i16 i16Var2 = i16Var;
                                                                                                                                switch (b4) {
                                                                                                                                    case 0:
                                                                                                                                        xtb[] xtbVarArr = ywa.g;
                                                                                                                                        zba zbaVar = (zba) i16Var2.b;
                                                                                                                                        nrl nrlVar = zbaVar.b;
                                                                                                                                        int i2 = zbaVar.c;
                                                                                                                                        if (i2 >= 0) {
                                                                                                                                            xba xbaVar2 = (xba) zbaVar.a.get(i2);
                                                                                                                                            Parcelable parcelable = xbaVar2.b;
                                                                                                                                            wba wbaVar = xbaVar2.a;
                                                                                                                                            if (wbaVar == wba.c) {
                                                                                                                                                cya cyaVar = (cya) parcelable;
                                                                                                                                                xbaVar = new xba(wbaVar, new cya(cyaVar.a, cyaVar.b, cyaVar.d, cyaVar.c));
                                                                                                                                            } else {
                                                                                                                                                wba wbaVar2 = wba.a;
                                                                                                                                                if (wbaVar == wbaVar2) {
                                                                                                                                                    wbaVar2 = wba.b;
                                                                                                                                                }
                                                                                                                                                xbaVar = new xba(wbaVar2, parcelable);
                                                                                                                                            }
                                                                                                                                            zbaVar.c--;
                                                                                                                                            nrlVar.h(xbaVar);
                                                                                                                                            nrlVar.A();
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        xtb[] xtbVarArr2 = ywa.g;
                                                                                                                                        zba zbaVar2 = (zba) i16Var2.b;
                                                                                                                                        nrl nrlVar2 = zbaVar2.b;
                                                                                                                                        int i3 = zbaVar2.c;
                                                                                                                                        ArrayList arrayList = zbaVar2.a;
                                                                                                                                        if (i3 < arrayList.size() - 1) {
                                                                                                                                            int i4 = zbaVar2.c + 1;
                                                                                                                                            zbaVar2.c = i4;
                                                                                                                                            nrlVar2.h((xba) arrayList.get(i4));
                                                                                                                                            nrlVar2.A();
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        h0().f.setOnClickListener(new View.OnClickListener() { // from class: swa
                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                            public final void onClick(View view2) {
                                                                                                                                xba xbaVar;
                                                                                                                                byte b4 = b2;
                                                                                                                                i16 i16Var2 = i16Var;
                                                                                                                                switch (b4) {
                                                                                                                                    case 0:
                                                                                                                                        xtb[] xtbVarArr = ywa.g;
                                                                                                                                        zba zbaVar = (zba) i16Var2.b;
                                                                                                                                        nrl nrlVar = zbaVar.b;
                                                                                                                                        int i2 = zbaVar.c;
                                                                                                                                        if (i2 >= 0) {
                                                                                                                                            xba xbaVar2 = (xba) zbaVar.a.get(i2);
                                                                                                                                            Parcelable parcelable = xbaVar2.b;
                                                                                                                                            wba wbaVar = xbaVar2.a;
                                                                                                                                            if (wbaVar == wba.c) {
                                                                                                                                                cya cyaVar = (cya) parcelable;
                                                                                                                                                xbaVar = new xba(wbaVar, new cya(cyaVar.a, cyaVar.b, cyaVar.d, cyaVar.c));
                                                                                                                                            } else {
                                                                                                                                                wba wbaVar2 = wba.a;
                                                                                                                                                if (wbaVar == wbaVar2) {
                                                                                                                                                    wbaVar2 = wba.b;
                                                                                                                                                }
                                                                                                                                                xbaVar = new xba(wbaVar2, parcelable);
                                                                                                                                            }
                                                                                                                                            zbaVar.c--;
                                                                                                                                            nrlVar.h(xbaVar);
                                                                                                                                            nrlVar.A();
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        xtb[] xtbVarArr2 = ywa.g;
                                                                                                                                        zba zbaVar2 = (zba) i16Var2.b;
                                                                                                                                        nrl nrlVar2 = zbaVar2.b;
                                                                                                                                        int i3 = zbaVar2.c;
                                                                                                                                        ArrayList arrayList = zbaVar2.a;
                                                                                                                                        if (i3 < arrayList.size() - 1) {
                                                                                                                                            int i4 = zbaVar2.c + 1;
                                                                                                                                            zbaVar2.c = i4;
                                                                                                                                            nrlVar2.h((xba) arrayList.get(i4));
                                                                                                                                            nrlVar2.A();
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        j14.Y(new z99((nak) i16Var.c, new vwa(this, mt5Var, b2), (byte) 2), fsp.y(getViewLifecycleOwner()));
                                                                                                                        ora oraVarH0 = h0();
                                                                                                                        d7h d7hVar = g0().k;
                                                                                                                        ddc ddcVarY = fsp.y(getViewLifecycleOwner());
                                                                                                                        shf shfVar = new shf();
                                                                                                                        shfVar.a = oraVarH0;
                                                                                                                        shfVar.b = d7hVar;
                                                                                                                        shfVar.c = oraVarH0.a.getContext();
                                                                                                                        h58 h58Var = n8g.h;
                                                                                                                        w4 w4VarE = sko.e(h58Var, h58Var);
                                                                                                                        while (w4VarE.hasNext()) {
                                                                                                                            n8g n8gVar = (n8g) w4VarE.next();
                                                                                                                            LinearLayout linearLayout3 = ((ora) shfVar.a).j;
                                                                                                                            int i2 = n8gVar.a;
                                                                                                                            WeakHashMap weakHashMap2 = r5n.a;
                                                                                                                            View view2 = (View) m5n.f(linearLayout3, i2);
                                                                                                                            view2.getBackground().setTint(((Context) shfVar.c).getColor(n8gVar.b));
                                                                                                                            view2.setOnClickListener(new j5g(shfVar, n8gVar, (byte) 14));
                                                                                                                        }
                                                                                                                        ((ora) shfVar.a).n.setOnClickListener(new tij(shfVar, (byte) 0));
                                                                                                                        ((ora) shfVar.a).l.setOnClickListener(new tij(shfVar, (byte) 1));
                                                                                                                        ((ora) shfVar.a).m.setOnClickListener(new tij(shfVar, (byte) 2));
                                                                                                                        byte b4 = 3;
                                                                                                                        ((ora) shfVar.a).o.setOnClickListener(new tij(shfVar, (byte) 3));
                                                                                                                        j14.Y(new z99((cw) ((d7h) shfVar.b).c, new udj((byte) 2, (mt5) null, shfVar), (byte) 2), ddcVarY);
                                                                                                                        if (bundle != null && (hy7VarF = getParentFragmentManager().F("hy7")) != null) {
                                                                                                                            hy7VarF.a = this;
                                                                                                                        }
                                                                                                                        na2.B(fsp.y(getViewLifecycleOwner()), (CoroutineContext) null, (rx5) null, new wwa(this, mt5Var, b), 3);
                                                                                                                        j14.Y(new z99(g0().p, new vwa(this, mt5Var, b3), (byte) 2), fsp.y(getViewLifecycleOwner()));
                                                                                                                        j14.Y(new z99(g0().n, new vwa(this, mt5Var, b4), (byte) 2), fsp.y(getViewLifecycleOwner()));
                                                                                                                        ArrayList arrayList = g0().b;
                                                                                                                        ndc viewLifecycleOwner = getViewLifecycleOwner();
                                                                                                                        twa twaVar = new twa(this);
                                                                                                                        qcc qccVar = qcc.a;
                                                                                                                        new vcc(arrayList, viewLifecycleOwner, twaVar);
                                                                                                                        if (bundle == null) {
                                                                                                                            na2.B(fsp.y(getViewLifecycleOwner()), (CoroutineContext) null, (rx5) null, new wwa(this, mt5Var, b3), 3);
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
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
