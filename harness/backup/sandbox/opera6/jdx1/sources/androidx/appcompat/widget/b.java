package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {
    public final /* synthetic */ SearchView a;

    public b(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int length;
        SearchView searchView = this.a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.p;
        if (searchView.c0 != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.h(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.c0 != null && searchView.O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i == 66 || i == 84 || i == 61) {
                    searchView.l(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i == 21) {
                    length = 0;
                } else if (i == 22) {
                    length = searchAutoComplete.length();
                } else if (i == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
                searchAutoComplete.setSelection(length);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.setInputMethodMode(1);
                if (searchAutoComplete.enoughToFilter()) {
                    searchAutoComplete.showDropDown();
                }
                return true;
            }
        }
        return false;
    }
}
