package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class asj extends na3 {
    public static final int[] E = {2130970792, 2130970795};
    public final AccessibilityManager C;
    public boolean D;

    public asj(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.C = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public final void i(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = ((na3) this).i.getChildAt(0).b;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.D = false;
        } else {
            this.D = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new j5g(this, onClickListener, (byte) 16));
        }
    }
}
