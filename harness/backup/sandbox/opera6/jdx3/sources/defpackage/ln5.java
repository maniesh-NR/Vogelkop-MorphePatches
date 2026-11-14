package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.jensdriller.libs.undobar.MaxWidthLinearLayout;
import com.opera.android.custom_views.OperaButtonBarLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.startup.WelcomeActivity;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lln5;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Leak;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ln5 extends Fragment implements View.OnClickListener, eak {
    public pt1 a;
    public final pde b = new pde(kl0.h);

    @Override // defpackage.eak
    public final ikc T() {
        return this.b;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        requireActivity().T();
        requireActivity().V(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = requireArguments().getInt("key.consents");
        pt1 pt1Var = this.a;
        if (pt1Var == null) {
            pt1Var = null;
        }
        boolean zA = Intrinsics.a(view, (OperaMaterialButton) pt1Var.e);
        pt1 pt1Var2 = this.a;
        if (zA) {
            (pt1Var2 != null ? pt1Var2 : null).g.setEnabled(false);
            requireActivity().K(new o2c(i, i, true, false));
            return;
        }
        if (pt1Var2 == null) {
            pt1Var2 = null;
        }
        if (Intrinsics.a(view, pt1Var2.g)) {
            WelcomeActivity welcomeActivityRequireActivity = requireActivity();
            mdf mdfVar = (mdf) ((j4c) welcomeActivityRequireActivity.v.f).get();
            kl0 kl0Var = (kl0) CollectionsKt.R(mdfVar.e);
            if (kl0Var != null) {
                mdfVar.a(kl0Var, gl0.f);
            }
            bl9 bl9Var = welcomeActivityRequireActivity.n;
            if (bl9Var != null) {
                c76 c76Var = new c76();
                Bundle bundle = new Bundle();
                bundle.putInt("key.asked_consents", i);
                c76Var.setArguments(bundle);
                mn9 mn9Var = new mn9(null, false, null);
                ArrayDeque arrayDeque = (ArrayDeque) bl9Var.d;
                Fragment fragment = (Fragment) arrayDeque.peek();
                arrayDeque.push(c76Var);
                bl9Var.b(c76Var, fragment, mn9Var, new vr9(bl9Var, fragment));
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167613);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131167612);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(2131167611);
        pt1 pt1Var = this.a;
        if (pt1Var == null) {
            pt1Var = null;
        }
        ((OperaButtonBarLayout) pt1Var.f).setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(2131167613);
        pt1 pt1Var2 = this.a;
        MaxWidthLinearLayout maxWidthLinearLayout = (MaxWidthLinearLayout) (pt1Var2 == null ? null : pt1Var2).c;
        if (pt1Var2 == null) {
            pt1Var2 = null;
        }
        int paddingTop = ((MaxWidthLinearLayout) pt1Var2.c).getPaddingTop();
        pt1 pt1Var3 = this.a;
        maxWidthLinearLayout.setPaddingRelative(dimensionPixelSize4, paddingTop, dimensionPixelSize4, ((MaxWidthLinearLayout) (pt1Var3 != null ? pt1Var3 : null).c).getPaddingBottom());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558614, viewGroup, false);
        int i = 2131362022;
        MaterialButton materialButton = (OperaMaterialButton) w1h.j(2131362022, constraintLayoutInflate);
        if (materialButton != null) {
            i = 2131362222;
            OperaButtonBarLayout operaButtonBarLayout = (OperaButtonBarLayout) w1h.j(2131362222, constraintLayoutInflate);
            if (operaButtonBarLayout != null) {
                i = 2131362414;
                MaxWidthLinearLayout maxWidthLinearLayout = (MaxWidthLinearLayout) w1h.j(2131362414, constraintLayoutInflate);
                if (maxWidthLinearLayout != null) {
                    i = 2131362481;
                    MaterialButton materialButtonJ = w1h.j(2131362481, constraintLayoutInflate);
                    if (materialButtonJ != null) {
                        i = 2131362986;
                        if (((TextView) w1h.j(2131362986, constraintLayoutInflate)) != null) {
                            i = 2131363011;
                            TextView textView = (TextView) w1h.j(2131363011, constraintLayoutInflate);
                            if (textView != null) {
                                i = 2131363361;
                                if (((ImageView) w1h.j(2131363361, constraintLayoutInflate)) != null) {
                                    i = 2131363884;
                                    if (((RelativeLayout) w1h.j(2131363884, constraintLayoutInflate)) != null) {
                                        i = 2131363885;
                                        if (((StylingImageView) w1h.j(2131363885, constraintLayoutInflate)) != null) {
                                            i = 2131363886;
                                            if (((RelativeLayout) w1h.j(2131363886, constraintLayoutInflate)) != null) {
                                                i = 2131363887;
                                                if (((StylingImageView) w1h.j(2131363887, constraintLayoutInflate)) != null) {
                                                    i = 2131363525;
                                                    if (((TextView) w1h.j(2131363525, constraintLayoutInflate)) != null) {
                                                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                        this.a = new pt1((ViewGroup) constraintLayout, (View) materialButton, (Object) operaButtonBarLayout, (View) maxWidthLinearLayout, (View) materialButtonJ, (View) textView, (byte) 3);
                                                        return constraintLayout;
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
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        pt1 pt1Var = this.a;
        if (pt1Var == null) {
            pt1Var = null;
        }
        ((OperaMaterialButton) pt1Var.e).setOnClickListener(this);
        pt1 pt1Var2 = this.a;
        if (pt1Var2 == null) {
            pt1Var2 = null;
        }
        pt1Var2.g.setOnClickListener(this);
        pt1 pt1Var3 = this.a;
        TextView textView = (TextView) (pt1Var3 == null ? null : pt1Var3).b;
        if (pt1Var3 == null) {
            pt1Var3 = null;
        }
        phj.b0(textView, ((TextView) pt1Var3.b).getContext().getString(2132018362), new vk2((byte) 8));
        if (requireArguments().getBoolean("key.should_fade_buttons")) {
            pt1 pt1Var4 = this.a;
            if (pt1Var4 == null) {
                pt1Var4 = null;
            }
            OperaButtonBarLayout operaButtonBarLayout = (OperaButtonBarLayout) pt1Var4.f;
            operaButtonBarLayout.setAlpha(0.0f);
            operaButtonBarLayout.animate().setDuration(350L).setStartDelay(700L).alpha(1.0f).start();
        }
        pt1 pt1Var5 = this.a;
        ConstraintLayout constraintLayout = (ConstraintLayout) (pt1Var5 != null ? pt1Var5 : null).d;
        yq4 yq4Var = new yq4((byte) 23);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(constraintLayout, yq4Var);
    }
}
