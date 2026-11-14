package defpackage;

import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.bar.ExtraSideActionsAppbar;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.TabCountButton;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p3k implements t43 {
    public static final Set j;
    public final ExtraSideActionsAppbar a;
    public final ViewGroup b;
    public final ViewGroup c;
    public final View d;
    public final esg e;
    public boolean f;
    public final vs g;
    public final vs h;
    public final Set i;

    static {
        o3k[] o3kVarArrValues = o3k.values();
        HashSet hashSet = new HashSet(o3kVarArrValues.length);
        for (o3k o3kVar : o3kVarArrValues) {
            Objects.requireNonNull(o3kVar);
            if (!hashSet.add(o3kVar)) {
                s49.l(o3kVar, "duplicate element: ");
                return;
            }
        }
        j = Collections.unmodifiableSet(hashSet);
    }

    public p3k(View view, Set set) {
        int measuredWidth;
        int measuredWidth2;
        WeakHashMap weakHashMap = r5n.a;
        ExtraSideActionsAppbar extraSideActionsAppbar = (ExtraSideActionsAppbar) ((View) m5n.f(view, 2131362058));
        this.a = extraSideActionsAppbar;
        this.i = set;
        ViewGroup viewGroup = (ViewGroup) ((View) m5n.f(extraSideActionsAppbar, 2131362054));
        this.b = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) ((View) m5n.f(extraSideActionsAppbar, 2131362053));
        this.c = viewGroup2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        layoutInflaterFrom.inflate(2131558499, viewGroup);
        int i = 2131361880;
        AppCompatImageView appCompatImageView = (StylingImageButton) w1h.j(2131361880, viewGroup);
        if (appCompatImageView != null) {
            i = 2131362109;
            StylingImageButton stylingImageButton = (StylingImageButton) w1h.j(2131362109, viewGroup);
            if (stylingImageButton != null) {
                i = 2131363022;
                StylingImageButton stylingImageButton2 = (StylingImageButton) w1h.j(2131363022, viewGroup);
                if (stylingImageButton2 != null) {
                    this.g = new vs(viewGroup, (View) appCompatImageView, (Object) stylingImageButton, (Object) stylingImageButton2, (byte) 2);
                    if (viewGroup2 == null) {
                        t3p.q("parent");
                        throw null;
                    }
                    layoutInflaterFrom.inflate(2131558498, viewGroup2);
                    int i2 = 2131361889;
                    AppCompatImageView appCompatImageView2 = (StylingImageButton) w1h.j(2131361889, viewGroup2);
                    if (appCompatImageView2 != null) {
                        i2 = 2131364656;
                        TabCountButton tabCountButton = (TabCountButton) w1h.j(2131364656, viewGroup2);
                        if (tabCountButton != null) {
                            i2 = 2131364796;
                            StylingImageButton stylingImageButton3 = (StylingImageButton) w1h.j(2131364796, viewGroup2);
                            if (stylingImageButton3 != null) {
                                this.h = new vs(viewGroup2, (View) appCompatImageView2, (Object) tabCountButton, (Object) stylingImageButton3, (byte) 1);
                                b(viewGroup.getResources().getConfiguration());
                                View view2 = (View) m5n.f(extraSideActionsAppbar, 2131363731);
                                this.d = view2;
                                extraSideActionsAppbar.c = this;
                                if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
                                    viewGroup.measure(0, 0);
                                    measuredWidth = viewGroup.getMeasuredWidth();
                                } else {
                                    measuredWidth = viewGroup.getWidth();
                                }
                                l5b l5bVar = q9n.c;
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                    if (marginLayoutParams.getMarginStart() != measuredWidth) {
                                        marginLayoutParams.setMarginStart(measuredWidth);
                                        view2.setLayoutParams(layoutParams);
                                    }
                                }
                                if (!viewGroup2.isLaidOut() || viewGroup2.isLayoutRequested()) {
                                    viewGroup2.measure(0, 0);
                                    measuredWidth2 = viewGroup2.getMeasuredWidth();
                                } else {
                                    measuredWidth2 = viewGroup2.getWidth();
                                }
                                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                    if (marginLayoutParams2.getMarginEnd() != measuredWidth2) {
                                        marginLayoutParams2.setMarginEnd(measuredWidth2);
                                        view2.setLayoutParams(layoutParams2);
                                    }
                                }
                                this.e = new esg(view2, new mcj(new n3k(this, (byte) 0), new n3k(this, (byte) 1)));
                                return;
                            }
                        }
                    }
                    t3p.q("Missing required view with ID: ".concat(viewGroup2.getResources().getResourceName(i2)));
                    throw null;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
        throw null;
    }

    public static void a(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public final void b(Configuration configuration) {
        boolean z = false;
        boolean z2 = configuration.screenWidthDp >= 600;
        boolean z3 = !z2;
        if (z3 == this.f) {
            return;
        }
        this.f = z3;
        vs vsVar = this.g;
        AppCompatImageView appCompatImageView = (StylingImageButton) vsVar.c;
        Set set = this.i;
        a(appCompatImageView, z2 && set.contains(o3k.a));
        a((StylingImageButton) vsVar.d, z2 && set.contains(o3k.b));
        AppCompatImageView appCompatImageView2 = (StylingImageButton) vsVar.e;
        if (z2 && set.contains(o3k.c)) {
            z = true;
        }
        a(appCompatImageView2, z);
        vs vsVar2 = this.h;
        a((StylingImageButton) vsVar2.c, set.contains(o3k.e));
        a((StylingImageButton) vsVar2.e, set.contains(o3k.f));
        a((TabCountButton) vsVar2.d, set.contains(o3k.d));
    }

    @Override // defpackage.t43
    public final void onConfigurationChanged(Configuration configuration) {
        b(configuration);
        this.e.G();
    }
}
