package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.opera.android.custom_views.OperaRateBar;
import com.opera.android.custom_views.PullSpinner;

/* loaded from: classes.dex */
public final /* synthetic */ class hz0 implements r8n {
    public final /* synthetic */ byte a;

    public /* synthetic */ hz0(byte b) {
        this.a = b;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        switch (this.a) {
            case 0:
                ((TextView) view).setTextColor(f03.D(view.getContext()));
                break;
            case 1:
                Button button = view instanceof Button ? (Button) view : null;
                if (button != null) {
                    button.setTextColor(f03.y(((Button) view).getContext()));
                    break;
                }
                break;
            case 2:
                ImageView imageView = (ImageView) view;
                imageView.setImageDrawable(f03.x(2130969481, imageView.getContext()));
                break;
            case 3:
                PullSpinner pullSpinner = (PullSpinner) view;
                pullSpinner.e.c = f03.C(view.getContext());
                pullSpinner.invalidate();
                break;
            case 4:
                int i = OperaRateBar.u;
                view.setBackgroundTintList(nb6.v(2131103620, view.getContext()));
                break;
            case 5:
                ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
                if (imageView2 != null) {
                    imageView2.setImageDrawable(f03.x(2130969482, ((ImageView) view).getContext()));
                    break;
                }
                break;
            default:
                x05 x05Var = new x05(view.getContext());
                x05Var.d(0);
                x05Var.b(new int[]{f03.t(2130971253, view.getContext(), 2131101243), f03.t(2130971254, view.getContext(), 2131101243)});
                view.setBackground(al2.c(x05Var));
                break;
        }
    }
}
