package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class nz0 extends d63 {

    @Nullable
    private mz0 mClickHandler;
    private final boolean mUseIncognitoAwareTheme;
    private final boolean mUseScrollingAlertDialogAdapter;

    public nz0(boolean z, boolean z2) {
        this.mUseScrollingAlertDialogAdapter = z;
        this.mUseIncognitoAwareTheme = z2;
    }

    @Override // defpackage.b87
    @Nullable
    @SuppressLint({"SupportAlertDialogDetector"})
    public final rim createDialog(@NonNull Context context, @Nullable b2l b2lVar) {
        if (!isRequestValid(b2lVar)) {
            return null;
        }
        az0 az0Var = new az0(wrapContext(context), getTheme());
        onCreateDialog(az0Var);
        bz0 bz0VarCreate = az0Var.create();
        onDialogCreated(bz0VarCreate);
        bz0VarCreate.setOnDismissListener(new iz0(this, bz0VarCreate, (byte) 0));
        zy0 zy0Var = bz0VarCreate.g;
        bz0VarCreate.setOnCancelListener(new jz0(this, (byte) 0));
        bz0VarCreate.setOnShowListener(new kz0(this, bz0VarCreate, (byte) 0));
        Context context2 = bz0VarCreate.getContext();
        this.mClickHandler = new mz0(this, bz0VarCreate);
        zy0Var.c(-1, getPositiveButtonText(context2), this.mClickHandler, getPositiveButtonIcon(context2));
        zy0Var.c(-2, getNegativeButtonText(context2), this.mClickHandler, (Drawable) null);
        zy0Var.c(-3, getNeutralButtonText(context2), this.mClickHandler, (Drawable) null);
        ab abVar = new ab(this, (byte) 7);
        return this.mUseScrollingAlertDialogAdapter ? new lpi(bz0VarCreate, abVar) : new mx3(bz0VarCreate, abVar);
    }

    @Nullable
    public String getNegativeButtonText(@NonNull Context context) {
        return null;
    }

    @Nullable
    public String getNeutralButtonText(@NonNull Context context) {
        return null;
    }

    @Nullable
    public Drawable getPositiveButtonIcon(@NonNull Context context) {
        return null;
    }

    public String getPositiveButtonText(Context context) {
        return null;
    }

    public int getTheme() {
        return 0;
    }

    public boolean isRequestValid(@Nullable b2l b2lVar) {
        return true;
    }

    public void onCreateDialog(az0 az0Var) {
        az0Var.b(2132018477);
        az0Var.a.k = true;
        az0Var.a(2132018056);
    }

    public void onDialogCreated(@NonNull bz0 bz0Var) {
    }

    public void onDialogViewsInflated(@NonNull bz0 bz0Var) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3 = (LinearLayout) bz0Var.findViewById(2131364807);
        byte b = 0;
        if (linearLayout3 == null || linearLayout3.getVisibility() != 0) {
            bz0Var.findViewById(2131362834).setVisibility(0);
            TextView textView = (TextView) bz0Var.findViewById(R.id.message);
            if (textView != null) {
                hz0 hz0Var = new hz0(b);
                dll dllVarS = q9n.s(textView);
                if (dllVarS != null) {
                    u8n.b(dllVarS, textView, hz0Var);
                }
                hz0Var.a(textView);
            }
        } else {
            LinearLayout linearLayout4 = (LinearLayout) bz0Var.findViewById(2131364807);
            if (linearLayout4 != null && linearLayout4.getVisibility() == 0 && (linearLayout = (LinearLayout) bz0Var.findViewById(2131364779)) != null && linearLayout.getVisibility() == 8 && (linearLayout2 = (LinearLayout) bz0Var.findViewById(2131364807)) != null && linearLayout2.getChildCount() > 0) {
                View childAt = linearLayout2.getChildAt(0);
                linearLayout2.removeView(childAt);
                linearLayout2.addView(childAt, -1);
            }
        }
        if (useTapStealingProtection()) {
            hp2 hp2Var = new hp2((byte) 13, false);
            hp2Var.b = SystemClock.elapsedRealtime();
            bz0Var.f(-1).setOnClickListener(new lz0(this, bz0Var, -1, hp2Var));
            bz0Var.f(-2).setOnClickListener(new lz0(this, bz0Var, -2, hp2Var));
            bz0Var.f(-3).setOnClickListener(new lz0(this, bz0Var, -3, hp2Var));
        }
    }

    public void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
    }

    public void onNegativeButtonClicked(@NonNull bz0 bz0Var) {
    }

    public void onNeutralButtonClicked(@NonNull bz0 bz0Var) {
    }

    public void onPositiveButtonClicked(bz0 bz0Var) {
    }

    public void onShowDialog(@NonNull bz0 bz0Var) {
    }

    public boolean useTapStealingProtection() {
        return false;
    }

    @NonNull
    public Context wrapContext(@NonNull Context context) {
        return this.mUseIncognitoAwareTheme ? new s8n(context, 2130969943) : context;
    }
}
