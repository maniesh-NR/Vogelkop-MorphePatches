package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.w;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.StylingImageView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class s63 extends k24 {
    public FrameLayout f;
    public View g;
    public View h;
    public boolean i;
    public epj j;
    public final r63 k = new r63(this, (byte) 0);

    public static epj o0(Context context) {
        Rect rectI = r9n.i(context);
        Size size = new Size(rectI.width(), rectI.height());
        epj.a.getClass();
        gpj gpjVarS = ddh.s(size.getHeight(), context);
        gpj gpjVar = gpj.a;
        if (gpjVarS.d()) {
            return epj.b;
        }
        int iOrdinal = ddh.t(size.getWidth(), context).ordinal();
        if (iOrdinal == 0) {
            return epj.c;
        }
        if (iOrdinal == 1) {
            return epj.d;
        }
        if (iOrdinal == 2) {
            return epj.e;
        }
        if (iOrdinal == 3) {
            return epj.f;
        }
        h9o.p();
        return null;
    }

    public static void p0(w wVar) {
        if (wVar.Y(-1, 1, "flow-scan-intro") || wVar.Y(-1, 1, "flow-generate") || wVar.Y(-1, 1, "flow-code-verification") || wVar.Y(-1, 1, "two-factor-authentication")) {
            return;
        }
        wVar.X();
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f = new FrameLayout(layoutInflater.getContext());
        q0();
        w parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.o.add(this.k);
        return this.f;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        epj epjVar = this.j;
        if (epjVar == null || epjVar == o0(requireContext())) {
            return;
        }
        r0();
        q0();
    }

    @Override // defpackage.k24
    public final void onDestroyView() {
        r0();
        w parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.o.remove(this.k);
        super.onDestroyView();
        this.f = null;
    }

    public final void onPause() {
        super/*androidx.fragment.app.Fragment*/.onPause();
        u0();
    }

    public final void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        v0();
    }

    public final void q0() {
        boolean z;
        Context context = getContext();
        if (context != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            this.j = o0(context);
            int iOrdinal = o0(context).ordinal();
            StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = null;
            final byte b = 0;
            final byte b2 = 1;
            if (iOrdinal == 0 || iOrdinal == 1) {
                z = false;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                    throw new RuntimeException(null, null);
                }
                z = true;
            }
            this.i = z;
            FrameLayout frameLayout = this.f;
            if (z) {
                layoutInflaterFrom.inflate(2131558839, (ViewGroup) frameLayout, true);
                FrameLayout frameLayout2 = this.f;
                WeakHashMap weakHashMap = r5n.a;
                View view = (View) m5n.f(frameLayout2, 2131362544);
                this.g = view;
                view.setOnClickListener(new View.OnClickListener(this) { // from class: q63
                    public final /* synthetic */ s63 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        byte b3 = b;
                        s63 s63Var = this.b;
                        switch (b3) {
                            case 0:
                                if (s63Var.getFragmentManager() != null) {
                                    s63.p0(s63Var.getFragmentManager());
                                    break;
                                }
                                break;
                            default:
                                if (s63Var.getFragmentManager() != null) {
                                    s63.p0(s63Var.getFragmentManager());
                                    break;
                                }
                                break;
                        }
                    }
                });
                this.g.setFocusable(false);
                View view2 = (View) m5n.f(this.f, 2131362840);
                this.h = view2;
                view2.setClipToOutline(true);
            } else {
                layoutInflaterFrom.inflate(2131558838, (ViewGroup) frameLayout, true);
                FrameLayout frameLayout3 = this.f;
                WeakHashMap weakHashMap2 = r5n.a;
                statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) ((View) m5n.f(frameLayout3, 2131364571));
                statusBarDrawingFrameLayout.d(true);
                q9n.f(statusBarDrawingFrameLayout, new lje(statusBarDrawingFrameLayout, (byte) 0));
            }
            dgh dghVarS0 = s0(layoutInflaterFrom, (ViewGroup) ((View) m5n.f(this.f, 2131362409)), o0(requireContext()));
            if (isResumed()) {
                v0();
            }
            ((StylingImageView) ((View) m5n.f(this.f, 2131362353))).setOnClickListener(new View.OnClickListener(this) { // from class: q63
                public final /* synthetic */ s63 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    byte b3 = b2;
                    s63 s63Var = this.b;
                    switch (b3) {
                        case 0:
                            if (s63Var.getFragmentManager() != null) {
                                s63.p0(s63Var.getFragmentManager());
                                break;
                            }
                            break;
                        default:
                            if (s63Var.getFragmentManager() != null) {
                                s63.p0(s63Var.getFragmentManager());
                                break;
                            }
                            break;
                    }
                }
            });
            q9n.f((View) m5n.f(this.f, 2131362467), new u7(this, (byte) 15));
            if (this.i) {
                x0();
            }
            if (statusBarDrawingFrameLayout != null) {
                if (dghVarS0 != null) {
                    if (dghVarS0 instanceof ick) {
                        lje ljeVar = new lje(statusBarDrawingFrameLayout, (byte) 1);
                        q9n.e(statusBarDrawingFrameLayout, ljeVar);
                        ljeVar.a(statusBarDrawingFrameLayout);
                        return;
                    } else if (dghVarS0 instanceof hck) {
                        e73 e73Var = new e73(statusBarDrawingFrameLayout, (hck) dghVarS0, (byte) 12);
                        q9n.e(statusBarDrawingFrameLayout, e73Var);
                        e73Var.a(statusBarDrawingFrameLayout);
                        return;
                    } else if (dghVarS0 instanceof kck) {
                        statusBarDrawingFrameLayout.c(false);
                        for (View view3 : ((kck) dghVarS0).a) {
                            kje kjeVar = new kje(view3, (byte) 2);
                            WeakHashMap weakHashMap3 = r5n.a;
                            h5n.c(view3, kjeVar);
                        }
                        return;
                    }
                }
                h9o.p();
            }
        }
    }

    public final void r0() {
        if (this.j == null) {
            return;
        }
        if (isResumed()) {
            u0();
        }
        t0();
        this.f.removeAllViews();
        this.j = null;
        this.g = null;
        this.h = null;
    }

    public abstract dgh s0(LayoutInflater layoutInflater, ViewGroup viewGroup, epj epjVar);

    public void t0() {
    }

    public void u0() {
    }

    public void v0() {
    }

    public final void w0(Context context) {
        zhj.a(this, 4099).c(context);
    }

    public final void x0() {
        s63 s63Var;
        View view;
        boolean z = true;
        for (s63 s63Var2 : getParentFragmentManager().c.f()) {
            if ((s63Var2 instanceof s63) && (view = (s63Var = s63Var2).g) != null && s63Var.h != null && s63Var.i) {
                view.setBackgroundColor(z ? view.getContext().getColor(2131099822) : 0);
                s63Var.h.setElevation(z ? fan.a(24.0f, r1.getResources()) : 0.0f);
                z = false;
            }
        }
    }
}
