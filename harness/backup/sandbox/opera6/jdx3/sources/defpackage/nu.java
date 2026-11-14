package defpackage;

import android.view.View;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public final /* synthetic */ class nu implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                if (z && (view instanceof AutoCompleteTextView)) {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view;
                    if (!autoCompleteTextView.isPopupShowing()) {
                        autoCompleteTextView.showDropDown();
                        break;
                    }
                }
                break;
            default:
                if (!z) {
                    q9n.u(view);
                    break;
                }
                break;
        }
    }
}
