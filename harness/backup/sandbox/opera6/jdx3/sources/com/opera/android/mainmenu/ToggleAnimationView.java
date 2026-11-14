package com.opera.android.mainmenu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.util.AttributeSet;
import com.opera.android.mainmenu.ToggleAnimationView;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.i3d;
import defpackage.prl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/mainmenu/ToggleAnimationView;", "Lcom/opera/android/widget/ThemeableLottieAnimationView;", "prl", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToggleAnimationView extends ThemeableLottieAnimationView {
    public static final List L = Arrays.asList("Ad blocking/On primary", "Data savings/On primary", "Night mode/On primary", "OnPrimary");
    public static final List M = Arrays.asList("Background", "VPN_Background_OFF", "VPN_Background_ON");
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public final ArrayList K;
    public boolean y;
    public boolean z;

    public ToggleAnimationView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.K = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(int i, int i2, int i3) {
        final byte b = 2;
        final byte b2 = 4;
        final byte b3 = 1;
        this.A = i;
        this.B = i2;
        this.C = i3;
        final byte b4 = 0;
        v(i3d.a("Center Transformation"), k3d.b, new ykj(this) { // from class: orl
            public final /* synthetic */ ToggleAnimationView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.mainmenu.ToggleAnimationView] */
            public final Object k(g3d g3dVar) {
                byte b5 = b4;
                ?? r3 = this.b;
                switch (b5) {
                    case 0:
                        List list = ToggleAnimationView.L;
                        return new PointF(r3.getMeasuredWidth() / 2.0f, r3.getMeasuredHeight() / 2.0f);
                    case 1:
                        List list2 = ToggleAnimationView.L;
                        return Integer.valueOf(p37.R(djh.b(g3dVar.f, 0.0f, 1.0f), r3.B((Integer) g3dVar.c), r3.B((Integer) g3dVar.d)));
                    case 2:
                        return Integer.valueOf(r3.J ? r3.I : r3.G);
                    case 3:
                        return Integer.valueOf(r3.J ? r3.H : r3.F);
                    case 4:
                        return Integer.valueOf(r3.y ? r3.E : r3.D);
                    case 5:
                        return Integer.valueOf(r3.y ? 0 : 100);
                    case 6:
                        if (r3.y && r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                    default:
                        if (r3.y && !r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                }
            }
        });
        for (String str : M) {
            PointF pointF = new PointF(getMeasuredWidth(), getMeasuredHeight());
            prl prlVar = new prl((byte) 21);
            prlVar.e = pointF;
            prlVar.d = pointF;
            a73 a73Var = (a73) prlVar.c;
            if (a73Var != null) {
                a73Var.h();
            }
            this.K.add(prlVar);
            a(i3d.a(str), k3d.g, prlVar);
        }
        C();
        dvb dvbVarA = i3d.a("Background");
        PointF pointF2 = k3d.a;
        v(dvbVarA, 1, new ykj(this) { // from class: orl
            public final /* synthetic */ ToggleAnimationView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.mainmenu.ToggleAnimationView] */
            public final Object k(g3d g3dVar) {
                byte b5 = b3;
                ?? r3 = this.b;
                switch (b5) {
                    case 0:
                        List list = ToggleAnimationView.L;
                        return new PointF(r3.getMeasuredWidth() / 2.0f, r3.getMeasuredHeight() / 2.0f);
                    case 1:
                        List list2 = ToggleAnimationView.L;
                        return Integer.valueOf(p37.R(djh.b(g3dVar.f, 0.0f, 1.0f), r3.B((Integer) g3dVar.c), r3.B((Integer) g3dVar.d)));
                    case 2:
                        return Integer.valueOf(r3.J ? r3.I : r3.G);
                    case 3:
                        return Integer.valueOf(r3.J ? r3.H : r3.F);
                    case 4:
                        return Integer.valueOf(r3.y ? r3.E : r3.D);
                    case 5:
                        return Integer.valueOf(r3.y ? 0 : 100);
                    case 6:
                        if (r3.y && r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                    default:
                        if (r3.y && !r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                }
            }
        });
        v(i3d.a("Surface/Surface container"), 1, new ykj(this) { // from class: orl
            public final /* synthetic */ ToggleAnimationView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.mainmenu.ToggleAnimationView] */
            public final Object k(g3d g3dVar) {
                byte b5 = b;
                ?? r3 = this.b;
                switch (b5) {
                    case 0:
                        List list = ToggleAnimationView.L;
                        return new PointF(r3.getMeasuredWidth() / 2.0f, r3.getMeasuredHeight() / 2.0f);
                    case 1:
                        List list2 = ToggleAnimationView.L;
                        return Integer.valueOf(p37.R(djh.b(g3dVar.f, 0.0f, 1.0f), r3.B((Integer) g3dVar.c), r3.B((Integer) g3dVar.d)));
                    case 2:
                        return Integer.valueOf(r3.J ? r3.I : r3.G);
                    case 3:
                        return Integer.valueOf(r3.J ? r3.H : r3.F);
                    case 4:
                        return Integer.valueOf(r3.y ? r3.E : r3.D);
                    case 5:
                        return Integer.valueOf(r3.y ? 0 : 100);
                    case 6:
                        if (r3.y && r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                    default:
                        if (r3.y && !r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                }
            }
        });
        final byte b5 = 3;
        v(i3d.a("VPN/Primary"), 1, new ykj(this) { // from class: orl
            public final /* synthetic */ ToggleAnimationView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.mainmenu.ToggleAnimationView] */
            public final Object k(g3d g3dVar) {
                byte b52 = b5;
                ?? r3 = this.b;
                switch (b52) {
                    case 0:
                        List list = ToggleAnimationView.L;
                        return new PointF(r3.getMeasuredWidth() / 2.0f, r3.getMeasuredHeight() / 2.0f);
                    case 1:
                        List list2 = ToggleAnimationView.L;
                        return Integer.valueOf(p37.R(djh.b(g3dVar.f, 0.0f, 1.0f), r3.B((Integer) g3dVar.c), r3.B((Integer) g3dVar.d)));
                    case 2:
                        return Integer.valueOf(r3.J ? r3.I : r3.G);
                    case 3:
                        return Integer.valueOf(r3.J ? r3.H : r3.F);
                    case 4:
                        return Integer.valueOf(r3.y ? r3.E : r3.D);
                    case 5:
                        return Integer.valueOf(r3.y ? 0 : 100);
                    case 6:
                        if (r3.y && r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                    default:
                        if (r3.y && !r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                }
            }
        });
        z(new i3d(2130969288, 1, "Surface/On surface variant", true), new i3d(2130969288, 2, "Surface/On surface variant", true));
        for (String str2 : L) {
            PointF pointF3 = k3d.a;
            Iterator it = Arrays.asList(1, 2).iterator();
            while (it.hasNext()) {
                v(i3d.a(str2), (Integer) it.next(), new ykj(this) { // from class: orl
                    public final /* synthetic */ ToggleAnimationView b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.mainmenu.ToggleAnimationView] */
                    public final Object k(g3d g3dVar) {
                        byte b52 = b2;
                        ?? r3 = this.b;
                        switch (b52) {
                            case 0:
                                List list = ToggleAnimationView.L;
                                return new PointF(r3.getMeasuredWidth() / 2.0f, r3.getMeasuredHeight() / 2.0f);
                            case 1:
                                List list2 = ToggleAnimationView.L;
                                return Integer.valueOf(p37.R(djh.b(g3dVar.f, 0.0f, 1.0f), r3.B((Integer) g3dVar.c), r3.B((Integer) g3dVar.d)));
                            case 2:
                                return Integer.valueOf(r3.J ? r3.I : r3.G);
                            case 3:
                                return Integer.valueOf(r3.J ? r3.H : r3.F);
                            case 4:
                                return Integer.valueOf(r3.y ? r3.E : r3.D);
                            case 5:
                                return Integer.valueOf(r3.y ? 0 : 100);
                            case 6:
                                if (r3.y && r3.z) {
                                    i = 100;
                                }
                                return Integer.valueOf(i);
                            default:
                                if (r3.y && !r3.z) {
                                    i = 100;
                                }
                                return Integer.valueOf(i);
                        }
                    }
                });
            }
        }
        dvb dvbVarA2 = i3d.a("VPN/Primary");
        PointF pointF4 = k3d.a;
        final byte b6 = 5;
        v(dvbVarA2, 4, new ykj(this) { // from class: orl
            public final /* synthetic */ ToggleAnimationView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.mainmenu.ToggleAnimationView] */
            public final Object k(g3d g3dVar) {
                byte b52 = b6;
                ?? r3 = this.b;
                switch (b52) {
                    case 0:
                        List list = ToggleAnimationView.L;
                        return new PointF(r3.getMeasuredWidth() / 2.0f, r3.getMeasuredHeight() / 2.0f);
                    case 1:
                        List list2 = ToggleAnimationView.L;
                        return Integer.valueOf(p37.R(djh.b(g3dVar.f, 0.0f, 1.0f), r3.B((Integer) g3dVar.c), r3.B((Integer) g3dVar.d)));
                    case 2:
                        return Integer.valueOf(r3.J ? r3.I : r3.G);
                    case 3:
                        return Integer.valueOf(r3.J ? r3.H : r3.F);
                    case 4:
                        return Integer.valueOf(r3.y ? r3.E : r3.D);
                    case 5:
                        return Integer.valueOf(r3.y ? 0 : 100);
                    case 6:
                        if (r3.y && r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                    default:
                        if (r3.y && !r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                }
            }
        });
        final byte b7 = 6;
        v(i3d.a("GradientLight"), 4, new ykj(this) { // from class: orl
            public final /* synthetic */ ToggleAnimationView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.mainmenu.ToggleAnimationView] */
            public final Object k(g3d g3dVar) {
                byte b52 = b7;
                ?? r3 = this.b;
                switch (b52) {
                    case 0:
                        List list = ToggleAnimationView.L;
                        return new PointF(r3.getMeasuredWidth() / 2.0f, r3.getMeasuredHeight() / 2.0f);
                    case 1:
                        List list2 = ToggleAnimationView.L;
                        return Integer.valueOf(p37.R(djh.b(g3dVar.f, 0.0f, 1.0f), r3.B((Integer) g3dVar.c), r3.B((Integer) g3dVar.d)));
                    case 2:
                        return Integer.valueOf(r3.J ? r3.I : r3.G);
                    case 3:
                        return Integer.valueOf(r3.J ? r3.H : r3.F);
                    case 4:
                        return Integer.valueOf(r3.y ? r3.E : r3.D);
                    case 5:
                        return Integer.valueOf(r3.y ? 0 : 100);
                    case 6:
                        if (r3.y && r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                    default:
                        if (r3.y && !r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                }
            }
        });
        final byte b8 = 7;
        v(i3d.a("GradientDark"), 4, new ykj(this) { // from class: orl
            public final /* synthetic */ ToggleAnimationView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, com.opera.android.mainmenu.ToggleAnimationView] */
            public final Object k(g3d g3dVar) {
                byte b52 = b8;
                ?? r3 = this.b;
                switch (b52) {
                    case 0:
                        List list = ToggleAnimationView.L;
                        return new PointF(r3.getMeasuredWidth() / 2.0f, r3.getMeasuredHeight() / 2.0f);
                    case 1:
                        List list2 = ToggleAnimationView.L;
                        return Integer.valueOf(p37.R(djh.b(g3dVar.f, 0.0f, 1.0f), r3.B((Integer) g3dVar.c), r3.B((Integer) g3dVar.d)));
                    case 2:
                        return Integer.valueOf(r3.J ? r3.I : r3.G);
                    case 3:
                        return Integer.valueOf(r3.J ? r3.H : r3.F);
                    case 4:
                        return Integer.valueOf(r3.y ? r3.E : r3.D);
                    case 5:
                        return Integer.valueOf(r3.y ? 0 : 100);
                    case 6:
                        if (r3.y && r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                    default:
                        if (r3.y && !r3.z) {
                            i = 100;
                        }
                        return Integer.valueOf(i);
                }
            }
        });
    }

    public final int B(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (Math.abs(Color.red(iIntValue) - 238) <= 1 && Math.abs(Color.green(iIntValue) - 237) <= 1 && Math.abs(Color.blue(iIntValue) - 219) <= 1) {
                return this.J ? this.I : this.G;
            }
        }
        return this.J ? this.H : this.F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C() {
        this.z = f03.V(2130971255, getContext());
        this.D = f03.t(this.B, getContext(), 2131101243);
        this.E = f03.t(this.C, getContext(), 2131101243);
        this.F = f03.t(this.A, getContext(), 2131101243);
        this.G = f03.t(2130969328, getContext(), 2131101243);
        this.H = p37.r(this.F, p37.a0(0.08f, this.D));
        this.I = p37.r(this.G, p37.a0(0.08f, f03.t(2130969288, getContext(), 2131101243)));
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            prl prlVar = (prl) obj;
            PointF pointF = new PointF(getMeasuredWidth(), getMeasuredHeight());
            if (!Intrinsics.a(prlVar.e, pointF)) {
                prlVar.e = pointF;
                prlVar.d = pointF;
                a73 a73Var = (a73) prlVar.c;
                if (a73Var != null) {
                    a73Var.h();
                }
            }
        }
    }

    @Override // com.opera.android.widget.ThemeableLottieAnimationView
    public final void y() {
        C();
        super.y();
    }
}
