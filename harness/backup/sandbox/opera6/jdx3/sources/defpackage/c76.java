package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.LayoutDirectionToolbar;
import com.opera.android.startup.WelcomeActivity;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.AbstractList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lc76;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Lssl;", "Leak;", "<init>", "()V", "y9m", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c76 extends Fragment implements View.OnClickListener, ssl, eak {
    public static final int[] h = {1, 8, 16};
    public static final int[] i = {32, 64};
    public vs a;
    public x93 b;
    public FrameLayout c;
    public boolean d;
    public final pde e = new pde(kl0.k);
    public final a83 f = new a83(this, (byte) 2);
    public final xt2 g = new xt2(this, (byte) 2);

    @Override // defpackage.eak
    public final ikc T() {
        return this.e;
    }

    public final int f0(Context context, boolean z) {
        bmb bmbVar;
        x93 x93Var = this.b;
        if (x93Var == null) {
            x93Var = null;
        }
        if (!z) {
            return f03.u(2130969110, context, 2131099822).getColorForState(f03.i, context.getColor(2131099822));
        }
        bmb it = x93Var.H().iterator();
        do {
            bmbVar = it;
            if (!bmbVar.hasNext()) {
                return f03.u(2130969108, context, 2131099825).getDefaultColor();
            }
        } while (((dn5) bmbVar.next()).e);
        return f03.v(context).getDefaultColor();
    }

    public final void g0(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        FrameLayout frameLayout2 = this.c;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131558633, (ViewGroup) frameLayout2, false);
        frameLayout2.addView(constraintLayoutInflate);
        int i2 = 2131362395;
        MaterialButton materialButton = (OperaMaterialButton) w1h.j(2131362395, constraintLayoutInflate);
        if (materialButton != null) {
            i2 = 2131362414;
            NestedScrollView nestedScrollViewJ = w1h.j(2131362414, constraintLayoutInflate);
            if (nestedScrollViewJ != null) {
                int i3 = 2131363183;
                ImageView imageView = (ImageView) w1h.j(2131363183, nestedScrollViewJ);
                if (imageView != null) {
                    i3 = 2131363333;
                    RecyclerView recyclerViewJ = w1h.j(2131363333, nestedScrollViewJ);
                    if (recyclerViewJ != null) {
                        RecyclerView recyclerView = recyclerViewJ;
                        ov0 ov0Var = new ov0((View) nestedScrollViewJ, (Object) imageView, (Object) new hl4(recyclerView, (byte) 1), (byte) 9);
                        i2 = 2131364794;
                        LayoutDirectionToolbar layoutDirectionToolbarJ = w1h.j(2131364794, constraintLayoutInflate);
                        if (layoutDirectionToolbarJ != null) {
                            this.a = new vs((ViewGroup) constraintLayoutInflate, (View) materialButton, (Object) ov0Var, (Object) layoutDirectionToolbarJ, (byte) 9);
                            x93 x93Var = this.b;
                            if (x93Var == null) {
                                x93Var = null;
                            }
                            recyclerView.y0(x93Var);
                            vs vsVar = this.a;
                            if (vsVar == null) {
                                vsVar = null;
                            }
                            RecyclerView recyclerView2 = ((hl4) ((ov0) vsVar.d).d).b;
                            requireContext();
                            recyclerView2.C0(new LinearLayoutManager(1, false));
                            vs vsVar2 = this.a;
                            if (vsVar2 == null) {
                                vsVar2 = null;
                            }
                            ((OperaMaterialButton) vsVar2.c).setOnClickListener(this);
                            vs vsVar3 = this.a;
                            ((Toolbar) ((LayoutDirectionToolbar) (vsVar3 == null ? null : vsVar3).e)).H = this;
                            if (vsVar3 == null) {
                                vsVar3 = null;
                            }
                            ImageView imageView2 = (ImageView) ((ov0) vsVar3.d).c;
                            hz0 hz0Var = new hz0(this, (byte) 2);
                            q9n.e(imageView2, hz0Var);
                            hz0Var.a(imageView2);
                            vs vsVar4 = this.a;
                            if (vsVar4 == null) {
                                vsVar4 = null;
                            }
                            ConstraintLayout constraintLayout = vsVar4.b;
                            kp5 kp5Var = new kp5((byte) 20);
                            WeakHashMap weakHashMap = r5n.a;
                            h5n.c(constraintLayout, kp5Var);
                            h0();
                            vs vsVar5 = this.a;
                            LayoutDirectionToolbar layoutDirectionToolbar = (LayoutDirectionToolbar) (vsVar5 != null ? vsVar5 : null).e;
                            pc5 pc5Var = new pc5(this, (byte) 2);
                            dll dllVarS = q9n.s(layoutDirectionToolbar);
                            if (dllVarS == null) {
                                return;
                            }
                            u8n.b(dllVarS, layoutDirectionToolbar, pc5Var);
                            return;
                        }
                    }
                }
                t3p.q("Missing required view with ID: ".concat(nestedScrollViewJ.getResources().getResourceName(i3)));
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
    }

    public final void h0() {
        vs vsVar = this.a;
        if (vsVar == null) {
            vsVar = null;
        }
        MenuItem menuItemFindItem = ((LayoutDirectionToolbar) vsVar.e).o().findItem(2131363498);
        x93 x93Var = this.b;
        if (x93Var == null) {
            x93Var = null;
        }
        bmb it = x93Var.H().iterator();
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                menuItemFindItem.setIcon(2131232235);
                menuItemFindItem.setTitle(2132018543);
                break;
            }
            if (!((dn5) bmbVar.next()).e) {
                x93 x93Var2 = this.b;
                if (x93Var2 == null) {
                    x93Var2 = null;
                }
                bmb it2 = x93Var2.H().iterator();
                int i2 = 0;
                while (true) {
                    bmb bmbVar2 = it2;
                    if (!bmbVar2.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (((dn5) bmbVar2.next()).e) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    menuItemFindItem.setIcon(2131232237);
                    menuItemFindItem.setTitle(2132018543);
                } else {
                    menuItemFindItem.setIcon(2131232236);
                    menuItemFindItem.setTitle(2132021029);
                }
            }
        }
        vs vsVar2 = this.a;
        int iF0 = f0(((LayoutDirectionToolbar) (vsVar2 != null ? vsVar2 : null).e).getContext(), menuItemFindItem.isEnabled());
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(iF0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        requireActivity().T();
        requireActivity().V(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vs vsVar = this.a;
        if (vsVar == null) {
            vsVar = null;
        }
        if (Intrinsics.a(view, (OperaMaterialButton) vsVar.c)) {
            vs vsVar2 = this.a;
            if (vsVar2 == null) {
                vsVar2 = null;
            }
            ((LayoutDirectionToolbar) vsVar2.e).o().findItem(2131363498).setEnabled(false);
            h0();
            x93 x93Var = this.b;
            if (x93Var == null) {
                x93Var = null;
            }
            bmb it = x93Var.H().iterator();
            while (true) {
                bmb bmbVar = it;
                if (!bmbVar.hasNext()) {
                    break;
                } else {
                    ((dn5) bmbVar.next()).f = false;
                }
            }
            x93Var.notifyDataSetChanged();
            this.g.setEnabled(false);
            WelcomeActivity welcomeActivityRequireActivity = requireActivity();
            int i2 = requireArguments().getInt("key.asked_consents");
            x93 x93Var2 = this.b;
            welcomeActivityRequireActivity.K(new o2c(i2, (x93Var2 != null ? x93Var2 : null).G(), false, this.d));
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g0(getLayoutInflater());
    }

    public final void onCreate(Bundle bundle) {
        int i2;
        ehc ehcVar;
        int[] iArr;
        int i3;
        int i4;
        super.onCreate(bundle);
        int i5 = requireArguments().getInt("key.asked_consents");
        if (bundle != null) {
            int i6 = bundle.getInt("key.granted_consents", i5);
            this.d = bundle.getBoolean("key.has_interacted_with_menu", false);
            i2 = i6;
        } else {
            i2 = i5;
        }
        ehc ehcVarB = a.b();
        y9m.n(i5, i2, h, 2132021184, ehcVarB, true);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ehcVar = ehcVarB;
            iArr = i;
            if (i8 >= 2) {
                break;
            }
            i7 |= iArr[i8];
            i8++;
            ehcVarB = ehcVar;
        }
        boolean z = (i5 & i7) == i7;
        if (z) {
            i3 = i5;
            i4 = i2;
        } else {
            i3 = i7;
            i4 = i3;
        }
        y9m.n(i3, i4, iArr, 2132021231, ehcVar, z);
        this.b = new x93((AbstractList) a.a(ehcVar), (byte) 2);
        requireActivity().getOnBackPressedDispatcher().a(this, this.g);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = new FrameLayout(layoutInflater.getContext());
        g0(layoutInflater);
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        x93 x93Var = this.b;
        if (x93Var == null) {
            x93Var = null;
        }
        x93Var.unregisterAdapterDataObserver(this.f);
        vs vsVar = this.a;
        if (vsVar == null) {
            vsVar = null;
        }
        ((Toolbar) ((LayoutDirectionToolbar) vsVar.e)).H = null;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131363498) {
            return false;
        }
        this.d = true;
        x93 x93Var = this.b;
        if (x93Var == null) {
            x93Var = null;
        }
        bmb it = x93Var.H().iterator();
        int i2 = 0;
        while (true) {
            bmb bmbVar = it;
            if (!bmbVar.hasNext()) {
                i2 = -1;
                break;
            }
            if (((dn5) bmbVar.next()).e) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            bmb it2 = x93Var.H().iterator();
            while (true) {
                bmb bmbVar2 = it2;
                if (!bmbVar2.hasNext()) {
                    x93Var.notifyDataSetChanged();
                    return true;
                }
                ((dn5) bmbVar2.next()).e = false;
            }
        } else {
            bmb it3 = x93Var.H().iterator();
            while (true) {
                bmb bmbVar3 = it3;
                if (!bmbVar3.hasNext()) {
                    x93Var.notifyDataSetChanged();
                    return true;
                }
                ((dn5) bmbVar3.next()).e = true;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        x93 x93Var = this.b;
        if (x93Var == null) {
            x93Var = null;
        }
        bundle.putInt("key.granted_consents", x93Var.G());
        bundle.putBoolean("key.has_interacted_with_menu", this.d);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        x93 x93Var = this.b;
        if (x93Var == null) {
            x93Var = null;
        }
        x93Var.registerAdapterDataObserver(this.f);
        vs vsVar = this.a;
        ConstraintLayout constraintLayout = (vsVar != null ? vsVar : null).b;
        kp5 kp5Var = new kp5((byte) 19);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(constraintLayout, kp5Var);
    }
}
