package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.opera.android.bar.FindInPage;
import com.opera.android.custom_views.ActionBarSearchView;

/* loaded from: classes.dex */
public final class y39 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y39(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    int i = FindInPage.w;
                    q9n.u(((FindInPage) obj).findViewById(2131362964));
                    break;
                }
                break;
            case 1:
                if (!z) {
                    q9n.u(view);
                }
                dvc dvcVar = (dvc) obj;
                ActionBarSearchView actionBarSearchView = dvcVar.u;
                if (actionBarSearchView != null) {
                    if (!z) {
                        Drawable drawableX = f03.x(2130969054, actionBarSearchView.getContext());
                        if (drawableX != null) {
                            dvcVar.u.setBackground(drawableX);
                            break;
                        }
                    } else {
                        actionBarSearchView.setBackgroundResource(2131232752);
                        break;
                    }
                }
                break;
            default:
                View view2 = (SearchView) obj;
                View.OnFocusChangeListener onFocusChangeListener = ((SearchView) view2).K;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view2, z);
                    break;
                }
                break;
        }
    }
}
