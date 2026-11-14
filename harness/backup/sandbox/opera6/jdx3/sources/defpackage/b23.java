package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.opera.android.custom_views.DialogTitle;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public abstract class b23 extends nz0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b23(byte b) {
        super(true, false);
        this.a = b;
    }

    public Integer b(Context context) {
        return 2131232667;
    }

    public Integer d(Context context) {
        return 2131232668;
    }

    public int e() {
        return 2131165598;
    }

    public View f(Context context) {
        return null;
    }

    public CharSequence g(Context context) {
        return null;
    }

    public Integer h() {
        return null;
    }

    public CharSequence i(Context context) {
        return context.getString(2132018336);
    }

    public Drawable j(Context context) {
        return sgb.F(2131231984, context);
    }

    public int k(Context context) {
        return 2131231477;
    }

    public ColorStateList l(Context context) {
        return f03.u(2130969514, context, 2131101243);
    }

    public ColorStateList m(Context context) {
        return f03.u(2130969515, context, 2131101243);
    }

    public ImageView.ScaleType n() {
        return ImageView.ScaleType.CENTER;
    }

    public Integer o() {
        return null;
    }

    @Override // defpackage.nz0
    public void onCreateDialog(az0 az0Var) {
        CharSequence charSequenceI = i(az0Var.getContext());
        if (charSequenceI != null) {
            az0Var.setTitle(charSequenceI);
        }
        CharSequence charSequenceG = g(az0Var.getContext());
        if (charSequenceG != null) {
            az0Var.a.f = charSequenceG;
        }
        View viewF = f(az0Var.getContext());
        if (viewF != null) {
            az0Var.setView(viewF);
        }
    }

    @Override // defpackage.nz0
    public final void onDialogViewsInflated(bz0 bz0Var) throws Resources.NotFoundException {
        switch (this.a) {
            case 1:
                super.onDialogViewsInflated(bz0Var);
                Integer numO = o();
                if (numO != null) {
                    int iIntValue = numO.intValue();
                    ViewGroup viewGroup = (ViewGroup) bz0Var.findViewById(2131362013);
                    AppCompatImageView appCompatImageView = (StylingImageView) bz0Var.findViewById(2131362012);
                    if (viewGroup != null && appCompatImageView != null) {
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        layoutParams.width = -2;
                        layoutParams.height = -2;
                        viewGroup.setLayoutParams(layoutParams);
                        int dimensionPixelSize = bz0Var.getContext().getResources().getDimensionPixelSize(iIntValue);
                        ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
                        layoutParams2.width = dimensionPixelSize;
                        layoutParams2.height = dimensionPixelSize;
                        appCompatImageView.setLayoutParams(layoutParams2);
                    }
                }
                e73 e73Var = new e73(bz0Var, this, (byte) 13);
                View viewFindViewById = bz0Var.findViewById(2131362012);
                if (viewFindViewById != null) {
                    dll dllVarS = q9n.s(viewFindViewById);
                    if (dllVarS != null) {
                        u8n.b(dllVarS, viewFindViewById, e73Var);
                    }
                    e73Var.a(viewFindViewById);
                    break;
                }
                break;
            default:
                super.onDialogViewsInflated(bz0Var);
                break;
        }
    }

    @Override // defpackage.nz0
    public void onShowDialog(final bz0 bz0Var) throws Resources.NotFoundException {
        switch (this.a) {
            case 0:
                p(bz0Var);
                d(bz0Var.getContext());
                final byte b = 0;
                r8n r8nVar = new r8n(this) { // from class: a23
                    public final /* synthetic */ b23 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.r8n
                    public final void a(View view) {
                        byte b2 = b;
                        bz0 bz0Var2 = bz0Var;
                        b23 b23Var = this.b;
                        switch (b2) {
                            case 0:
                                int iIntValue = b23Var.d(bz0Var2.getContext()).intValue();
                                ViewGroup viewGroup = (ViewGroup) bz0Var2.findViewById(2131362008);
                                ImageView imageView = (ImageView) bz0Var2.findViewById(2131362009);
                                if (viewGroup != null && imageView != null) {
                                    viewGroup.setVisibility(iIntValue != 0 ? 0 : 8);
                                    imageView.setImageResource(iIntValue);
                                    break;
                                }
                                break;
                            default:
                                int iIntValue2 = b23Var.b(bz0Var2.getContext()).intValue();
                                int iE = b23Var.e();
                                ViewGroup viewGroup2 = (ViewGroup) bz0Var2.findViewById(2131362010);
                                ImageView imageView2 = (ImageView) bz0Var2.findViewById(2131362009);
                                ViewGroup viewGroup3 = (ViewGroup) bz0Var2.findViewById(2131363850);
                                if (viewGroup2 != null && imageView2 != null && viewGroup3 != null) {
                                    int dimensionPixelSize = bz0Var2.getContext().getResources().getDimensionPixelSize(iE);
                                    imageView2.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                    viewGroup2.setBackgroundResource(iIntValue2);
                                    break;
                                }
                                break;
                        }
                    }
                };
                View viewFindViewById = bz0Var.findViewById(2131362009);
                if (viewFindViewById != null) {
                    dll dllVarS = q9n.s(viewFindViewById);
                    if (dllVarS != null) {
                        u8n.b(dllVarS, viewFindViewById, r8nVar);
                    }
                    r8nVar.a(viewFindViewById);
                }
                b(bz0Var.getContext());
                final byte b2 = 1;
                r8n r8nVar2 = new r8n(this) { // from class: a23
                    public final /* synthetic */ b23 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.r8n
                    public final void a(View view) {
                        byte b22 = b2;
                        bz0 bz0Var2 = bz0Var;
                        b23 b23Var = this.b;
                        switch (b22) {
                            case 0:
                                int iIntValue = b23Var.d(bz0Var2.getContext()).intValue();
                                ViewGroup viewGroup = (ViewGroup) bz0Var2.findViewById(2131362008);
                                ImageView imageView = (ImageView) bz0Var2.findViewById(2131362009);
                                if (viewGroup != null && imageView != null) {
                                    viewGroup.setVisibility(iIntValue != 0 ? 0 : 8);
                                    imageView.setImageResource(iIntValue);
                                    break;
                                }
                                break;
                            default:
                                int iIntValue2 = b23Var.b(bz0Var2.getContext()).intValue();
                                int iE = b23Var.e();
                                ViewGroup viewGroup2 = (ViewGroup) bz0Var2.findViewById(2131362010);
                                ImageView imageView2 = (ImageView) bz0Var2.findViewById(2131362009);
                                ViewGroup viewGroup3 = (ViewGroup) bz0Var2.findViewById(2131363850);
                                if (viewGroup2 != null && imageView2 != null && viewGroup3 != null) {
                                    int dimensionPixelSize = bz0Var2.getContext().getResources().getDimensionPixelSize(iE);
                                    imageView2.setPaddingRelative(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                    viewGroup2.setBackgroundResource(iIntValue2);
                                    break;
                                }
                                break;
                        }
                    }
                };
                View viewFindViewById2 = bz0Var.findViewById(2131362010);
                if (viewFindViewById2 != null) {
                    dll dllVarS2 = q9n.s(viewFindViewById2);
                    if (dllVarS2 != null) {
                        u8n.b(dllVarS2, viewFindViewById2, r8nVar2);
                    }
                    r8nVar2.a(viewFindViewById2);
                    break;
                }
                break;
            default:
                p(bz0Var);
                break;
        }
    }

    public final void p(bz0 bz0Var) throws Resources.NotFoundException {
        Integer num;
        super.onShowDialog(bz0Var);
        yq1 yq1Var = (DialogTitle) bz0Var.findViewById(2131362006);
        if (yq1Var != null) {
            yq1Var.setTextAlignment(4);
            yq1Var.setGravity(1);
        }
        Integer numH = h();
        if (numH != null) {
            int iIntValue = numH.intValue();
            TextView textView = (TextView) bz0Var.findViewById(R.id.message);
            if (textView != null) {
                textView.setTextAlignment(iIntValue);
                if (iIntValue == 4) {
                    textView.setGravity(1);
                }
            }
        }
        switch (this.a) {
            case 0:
                num = 2131165289;
                break;
            default:
                num = null;
                break;
        }
        if (num != null) {
            int iIntValue2 = num.intValue();
            ViewGroup viewGroup = (ViewGroup) bz0Var.findViewById(2131362010);
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams).bottomMargin = bz0Var.getContext().getResources().getDimensionPixelSize(iIntValue2);
                    viewGroup.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
