package defpackage;

import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.OverlaidStatusBarDrawingView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lmhf;", "Lfp7;", "<init>", "()V", "x79", "z4o", "ihf", "lhf", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class mhf extends fp7 {
    public final zyk g = z4c.b(new yse(this, (byte) 2));
    public ihf h;

    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[PHI: r1
      0x009a: PHI (r1v16 int) = (r1v15 int), (r1v19 int), (r1v20 int) binds: [B:11:0x004a, B:15:0x005d, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x79 q0(android.view.LayoutInflater r17, android.view.ViewGroup r18, defpackage.ihf r19) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhf.q0(android.view.LayoutInflater, android.view.ViewGroup, ihf):x79");
    }

    @Override // defpackage.fp7
    public final void o0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        x79 x79VarQ0;
        ihf ihfVarP0 = p0();
        this.h = ihfVarP0;
        final byte b = 2;
        final byte b2 = 1;
        final byte b3 = 0;
        if (ihfVarP0.a) {
            ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558716, (ViewGroup) frameLayout, false);
            frameLayout.addView(constraintLayoutInflate);
            int i = 2131362409;
            LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) w1h.j(2131362409, constraintLayoutInflate);
            if (layoutDirectionLinearLayout != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                LayoutDirectionLinearLayout layoutDirectionLinearLayout2 = (LayoutDirectionLinearLayout) w1h.j(2131362840, constraintLayoutInflate);
                if (layoutDirectionLinearLayout2 != null) {
                    layoutDirectionLinearLayout2.setClipToOutline(true);
                    constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: hhf
                        public final /* synthetic */ mhf b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b4 = b3;
                            mhf mhfVar = this.b;
                            switch (b4) {
                                case 0:
                                    mhfVar.g0();
                                    break;
                                case 1:
                                    mhfVar.g0();
                                    break;
                                default:
                                    xih.t(((kxk) ((nhf) mhfVar.g.getValue()).b).f, false, null);
                                    mhfVar.g0();
                                    break;
                            }
                        }
                    });
                    x79VarQ0 = q0(layoutInflater, layoutDirectionLinearLayout, ihfVarP0);
                } else {
                    i = 2131362840;
                }
            }
            t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
            return;
        }
        x79VarQ0 = q0(layoutInflater, frameLayout, ihfVarP0);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) x79VarQ0.a;
        for (View view : (List) x79VarQ0.d) {
            odf odfVar = new odf((byte) 2);
            WeakHashMap weakHashMap = r5n.a;
            h5n.c(view, odfVar);
        }
        z4o z4oVar = (z4o) x79VarQ0.e;
        if (z4oVar instanceof jhf) {
            new lhf(constraintLayout2, ((jhf) z4oVar).r);
        } else {
            if (!(z4oVar instanceof khf)) {
                h9o.p();
                return;
            }
            new lhf(constraintLayout2, new gxh(0));
            OverlaidStatusBarDrawingView overlaidStatusBarDrawingView = ((khf) z4oVar).r;
            wuf wufVar = wuf.b;
            if (wufVar != overlaidStatusBarDrawingView.f) {
                overlaidStatusBarDrawingView.f = wufVar;
                overlaidStatusBarDrawingView.invalidate();
                c1f c1fVar = overlaidStatusBarDrawingView.c;
                if (c1fVar != null) {
                    c1fVar.e();
                }
            }
            lzb lzbVar = new lzb(z4oVar, (byte) 27);
            q9n.e(overlaidStatusBarDrawingView, lzbVar);
            lzbVar.a(overlaidStatusBarDrawingView);
        }
        ((StylingImageButton) x79VarQ0.b).setOnClickListener(new View.OnClickListener(this) { // from class: hhf
            public final /* synthetic */ mhf b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b2;
                mhf mhfVar = this.b;
                switch (b4) {
                    case 0:
                        mhfVar.g0();
                        break;
                    case 1:
                        mhfVar.g0();
                        break;
                    default:
                        xih.t(((kxk) ((nhf) mhfVar.g.getValue()).b).f, false, null);
                        mhfVar.g0();
                        break;
                }
            }
        });
        ((OperaMaterialButton) x79VarQ0.c).setOnClickListener(new View.OnClickListener(this) { // from class: hhf
            public final /* synthetic */ mhf b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b4 = b;
                mhf mhfVar = this.b;
                switch (b4) {
                    case 0:
                        mhfVar.g0();
                        break;
                    case 1:
                        mhfVar.g0();
                        break;
                    default:
                        xih.t(((kxk) ((nhf) mhfVar.g.getValue()).b).f, false, null);
                        mhfVar.g0();
                        break;
                }
            }
        });
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        if (Intrinsics.a(this.h, p0())) {
            return;
        }
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            z = !(frameLayout.getChildCount() == 0);
        }
        if (z) {
            isResumed();
            FrameLayout frameLayout2 = this.f;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
            }
            FrameLayout frameLayout3 = this.f;
            if (frameLayout3 != null) {
                o0(LayoutInflater.from(frameLayout3.getContext()), frameLayout3);
            }
            isResumed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ihf p0() {
        /*
            r3 = this;
            android.content.Context r3 = r3.requireContext()
            android.graphics.Rect r0 = r9n.i(r3)
            int r1 = r0.height()
            gpj r1 = ddh.s(r1, r3)
            gpj r2 = defpackage.gpj.a
            boolean r1 = r1.d()
            ihf r2 = new ihf
            if (r1 != 0) goto L2b
            int r0 = r0.width()
            hpj r3 = ddh.t(r0, r3)
            hpj r0 = defpackage.hpj.a
            int r3 = r3.ordinal()
            r0 = 1
            if (r3 >= r0) goto L2c
        L2b:
            r0 = 0
        L2c:
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhf.p0():ihf");
    }
}
