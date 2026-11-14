package com.opera.android.suggestion.adapter;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.ui.catalog.widget.OperaListItem;
import defpackage.nr8;
import defpackage.pvb;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/suggestion/adapter/SuggestionListItem;", "Lcom/opera/android/ui/catalog/widget/OperaListItem;", "Lpvb;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuggestionListItem extends OperaListItem implements pvb {
    public static final int[] E = {R.attr.state_focused};
    public Suggestion D;

    public SuggestionListItem(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.opera.android.ui.catalog.widget.OperaListItem
    public final void G(int i) {
        super.G(i & (-5));
    }

    @Override // defpackage.pvb
    public final boolean a() {
        Suggestion suggestion = this.D;
        Integer numValueOf = suggestion != null ? Integer.valueOf(suggestion.a) : null;
        if (numValueOf != null && numValueOf.intValue() == 11) {
            return true;
        }
        if (numValueOf == null || numValueOf.intValue() != 26) {
            return super.a();
        }
        return true;
    }

    @Override // defpackage.pvb
    public final String c() {
        Suggestion suggestion = this.D;
        String strA = null;
        Integer numValueOf = suggestion != null ? Integer.valueOf(suggestion.a) : null;
        if ((numValueOf != null && numValueOf.intValue() == 0) || ((numValueOf != null && numValueOf.intValue() == 1) || ((numValueOf != null && numValueOf.intValue() == 2) || ((numValueOf != null && numValueOf.intValue() == 3) || ((numValueOf != null && numValueOf.intValue() == 4) || ((numValueOf != null && numValueOf.intValue() == 5) || ((numValueOf != null && numValueOf.intValue() == 6) || ((numValueOf != null && numValueOf.intValue() == 7) || ((numValueOf != null && numValueOf.intValue() == 8) || ((numValueOf != null && numValueOf.intValue() == 9) || ((numValueOf != null && numValueOf.intValue() == 10) || ((numValueOf != null && numValueOf.intValue() == 11) || ((numValueOf != null && numValueOf.intValue() == 12) || ((numValueOf != null && numValueOf.intValue() == 13) || ((numValueOf != null && numValueOf.intValue() == 14) || ((numValueOf != null && numValueOf.intValue() == 15) || ((numValueOf != null && numValueOf.intValue() == 18) || ((numValueOf != null && numValueOf.intValue() == 19) || ((numValueOf != null && numValueOf.intValue() == 23) || (numValueOf != null && numValueOf.intValue() == 24)))))))))))))))))))) {
            Suggestion suggestion2 = this.D;
            if (suggestion2 != null) {
                strA = suggestion2.a();
            }
        } else if ((numValueOf == null || numValueOf.intValue() != 16) && ((numValueOf == null || numValueOf.intValue() != 34) && ((numValueOf == null || numValueOf.intValue() != 17) && ((numValueOf == null || numValueOf.intValue() != 33) && ((numValueOf == null || numValueOf.intValue() != 21) && ((numValueOf == null || numValueOf.intValue() != 22) && ((numValueOf == null || numValueOf.intValue() != 25) && (numValueOf == null || numValueOf.intValue() != 26)))))))) {
            Suggestion suggestion3 = this.D;
            if (suggestion3 != null) {
                strA = suggestion3.a();
            }
        } else {
            Suggestion suggestion4 = this.D;
            if (suggestion4 != null) {
                strA = suggestion4.b;
            }
        }
        return strA == null ? "" : strA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvb
    public final View getView() {
        return this;
    }

    @Override // defpackage.pvb
    /* renamed from: j */
    public final boolean getA() {
        return this.D != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvb
    public final i1 m() {
        Suggestion suggestion = this.D;
        Integer numValueOf = suggestion != null ? Integer.valueOf(suggestion.a) : null;
        if ((numValueOf != null && numValueOf.intValue() == 0) || ((numValueOf != null && numValueOf.intValue() == 1) || ((numValueOf != null && numValueOf.intValue() == 2) || ((numValueOf != null && numValueOf.intValue() == 3) || ((numValueOf != null && numValueOf.intValue() == 4) || ((numValueOf != null && numValueOf.intValue() == 5) || ((numValueOf != null && numValueOf.intValue() == 6) || ((numValueOf != null && numValueOf.intValue() == 7) || ((numValueOf != null && numValueOf.intValue() == 8) || ((numValueOf != null && numValueOf.intValue() == 9) || ((numValueOf != null && numValueOf.intValue() == 10) || ((numValueOf != null && numValueOf.intValue() == 11) || ((numValueOf != null && numValueOf.intValue() == 12) || ((numValueOf != null && numValueOf.intValue() == 13) || ((numValueOf != null && numValueOf.intValue() == 14) || ((numValueOf != null && numValueOf.intValue() == 15) || ((numValueOf != null && numValueOf.intValue() == 23) || ((numValueOf != null && numValueOf.intValue() == 24) || (numValueOf != null && numValueOf.intValue() == 26))))))))))))))))))) {
            Suggestion suggestion2 = this.D;
            Integer numValueOf2 = suggestion2 != null ? Integer.valueOf(ybh.g(suggestion2)) : null;
            if (numValueOf2 != null) {
                return new i1(numValueOf2.intValue());
            }
        } else if ((numValueOf != null && numValueOf.intValue() == 16) || ((numValueOf != null && numValueOf.intValue() == 34) || ((numValueOf != null && numValueOf.intValue() == 17) || ((numValueOf != null && numValueOf.intValue() == 33) || ((numValueOf != null && numValueOf.intValue() == 21) || (numValueOf != null && numValueOf.intValue() == 22)))))) {
            Suggestion suggestion3 = this.D;
            String strA = suggestion3 != null ? suggestion3.a() : null;
            Suggestion suggestion4 = this.D;
            String str = suggestion4 != null ? suggestion4.h : null;
            if (strA != null && strA.length() != 0 && str != null && str.length() != 0) {
                return new i1(str, strA, nr8.e(getContext()));
            }
            Suggestion suggestion5 = this.D;
            Integer numValueOf3 = suggestion5 != null ? Integer.valueOf(ybh.g(suggestion5)) : null;
            if (numValueOf3 != null) {
                return new i1(numValueOf3.intValue());
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        return isSelected() ? View.mergeDrawableStates(super/*android.view.View*/.onCreateDrawableState(i + 1), E) : super/*android.view.View*/.onCreateDrawableState(i);
    }
}
