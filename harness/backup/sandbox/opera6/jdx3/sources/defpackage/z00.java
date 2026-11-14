package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.SmoothProgressBar;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z00 extends c10 {
    public final SmoothProgressBar d;
    public final TextView e;
    public final /* synthetic */ a10 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z00(a10 a10Var, int i, String str, View view) throws Resources.NotFoundException {
        super(view, str);
        this.f = a10Var;
        WeakHashMap weakHashMap = r5n.a;
        SmoothProgressBar smoothProgressBar = (SmoothProgressBar) ((View) m5n.f(view, 2131361978));
        this.d = smoothProgressBar;
        TextView textView = (TextView) ((View) m5n.f(view, 2131361979));
        this.e = textView;
        int[] intArray = view.getResources().getIntArray(2130903040);
        int i2 = intArray[i % intArray.length];
        Drawable progressDrawable = smoothProgressBar.getProgressDrawable();
        j14.n0(progressDrawable, i2);
        smoothProgressBar.setProgressDrawable(progressDrawable);
        textView.setTextColor(i2);
    }

    @Override // defpackage.c10
    public final void a(boolean z, boolean z2, boolean z3) {
        super.a(z, z2, z3);
        a10 a10Var = this.f;
        if (a10Var.L != null) {
            if (z2) {
                this.c.setEnabled(true);
            }
            Integer num = (Integer) a10Var.L.get(this.a);
            if (num == null) {
                return;
            }
            SmoothProgressBar smoothProgressBar = this.d;
            smoothProgressBar.setSelected(z2);
            smoothProgressBar.setVisibility(0);
            smoothProgressBar.a = z;
            smoothProgressBar.setProgress(num.intValue());
            TextView textView = this.e;
            textView.setVisibility(0);
            textView.setText(((i) a10Var).itemView.getResources().getString(2132018639, num));
        }
    }
}
