package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ SearchView a;

    public a(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.p;
        if (view == searchView.t) {
            searchView.t(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.a(true);
            View.OnClickListener onClickListener = searchView.L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.v) {
            searchView.j();
            return;
        }
        if (view == searchView.u) {
            searchView.m();
            return;
        }
        if (view != searchView.w) {
            if (view == searchAutoComplete) {
                searchAutoComplete.refreshAutoCompleteResults();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.c0;
        if (searchableInfo != null) {
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.i(searchView.H, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.G);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }
}
