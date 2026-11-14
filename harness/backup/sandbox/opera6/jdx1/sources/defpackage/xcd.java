package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* loaded from: classes.dex */
public final class xcd extends ArrayAdapter {
    public final ColorStateList a;
    public final ColorStateList b;
    public final /* synthetic */ MaterialAutoCompleteTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcd(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i, String[] strArr) {
        ColorStateList colorStateList;
        super(context, i, strArr);
        this.c = materialAutoCompleteTextView;
        ColorStateList colorStateList2 = materialAutoCompleteTextView.l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        int i2 = materialAutoCompleteTextView.k;
        if (i2 != 0 && colorStateList2 != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ab5.h(colorStateList2.getColorForState(iArr3, 0), i2), ab5.h(colorStateList2.getColorForState(iArr2, 0), i2), i2});
        }
        this.a = colorStateList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.c;
            ColorDrawable colorDrawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.k != 0) {
                ColorDrawable colorDrawable2 = new ColorDrawable(materialAutoCompleteTextView.k);
                ColorStateList colorStateList = this.b;
                if (colorStateList != null) {
                    colorDrawable2.setTintList(this.a);
                    ?? rippleDrawable = new RippleDrawable(colorStateList, colorDrawable2, null);
                    FocusRingDrawable focusRingDrawableF = FocusRingDrawable.f(getContext(), (LayerDrawable) rippleDrawable, (zdd) null);
                    if (focusRingDrawableF != null) {
                        focusRingDrawableF.o.x = materialAutoCompleteTextView.g;
                    }
                    colorDrawable = rippleDrawable;
                } else {
                    colorDrawable = colorDrawable2;
                }
            }
            textView.setBackground(colorDrawable);
        }
        return view2;
    }
}
