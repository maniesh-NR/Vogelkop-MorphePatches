package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.browser.OperaPageRootView;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsStatisticView;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class o4g implements a5n {
    public final /* synthetic */ byte a = 0;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final Object k;
    public final Object l;

    /* JADX WARN: Multi-variable type inference failed */
    public o4g(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, StylingImageView stylingImageView, StylingTextView stylingTextView, StylingImageButton stylingImageButton, StylingTextView stylingTextView2, StylingImageButton stylingImageButton2, or2 or2Var, StylingTextView stylingTextView3, or2 or2Var2) {
        this.b = constraintLayout;
        this.d = materialButton;
        this.e = materialButton2;
        this.c = stylingImageView;
        this.f = stylingTextView;
        this.i = stylingImageButton;
        this.g = stylingTextView2;
        this.j = stylingImageButton2;
        this.k = or2Var;
        this.h = stylingTextView3;
        this.l = or2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o4g(ConstraintLayout constraintLayout, SettingsStatisticView settingsStatisticView, OperaListItem operaListItem, OperaListItem operaListItem2, TextView textView, TextView textView2, StylingImageView stylingImageView, View view, View view2, OperaListItem operaListItem3, SettingsStatisticView settingsStatisticView2) {
        this.b = constraintLayout;
        this.d = settingsStatisticView;
        this.e = operaListItem;
        this.f = operaListItem2;
        this.g = textView;
        this.h = textView2;
        this.c = stylingImageView;
        this.i = view;
        this.j = view2;
        this.k = operaListItem3;
        this.l = settingsStatisticView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o4g(OperaPageRootView operaPageRootView, OperaListItem operaListItem, OperaListItem operaListItem2, OperaListItem operaListItem3, ScrollView scrollView, MaterialButton materialButton, OperaListItem operaListItem4, OperaListItem operaListItem5, OperaListItem operaListItem6, OperaListItem operaListItem7, MaterialButton materialButton2, OperaListItem operaListItem8, OperaListItem operaListItem9) {
        this.b = operaPageRootView;
        this.e = operaListItem;
        this.c = operaListItem2;
        this.f = operaListItem3;
        this.d = materialButton;
        this.g = operaListItem4;
        this.h = operaListItem5;
        this.i = operaListItem6;
        this.j = operaListItem7;
        this.k = operaListItem8;
        this.l = operaListItem9;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            default:
                return (OperaPageRootView) this.b;
        }
    }
}
