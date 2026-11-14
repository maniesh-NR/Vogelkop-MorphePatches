package defpackage;

import android.view.View;
import android.widget.TextView;
import com.opera.android.custom_views.LayoutDirectionActionBarContextView;

/* loaded from: classes.dex */
public final class e2c implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LayoutDirectionActionBarContextView b;

    public /* synthetic */ e2c(LayoutDirectionActionBarContextView layoutDirectionActionBarContextView, byte b) {
        this.a = b;
        this.b = layoutDirectionActionBarContextView;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        byte b = this.a;
        LayoutDirectionActionBarContextView layoutDirectionActionBarContextView = this.b;
        switch (b) {
            case 0:
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    int i = layoutDirectionActionBarContextView.B;
                    if (i != 0) {
                        xf8.r0(textView, i);
                        break;
                    }
                }
                break;
            default:
                if (view instanceof TextView) {
                    TextView textView2 = (TextView) view;
                    int i2 = layoutDirectionActionBarContextView.C;
                    if (i2 != 0) {
                        xf8.r0(textView2, i2);
                        break;
                    }
                }
                break;
        }
    }
}
