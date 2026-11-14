package defpackage;

import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.SuggestionListItem;

/* loaded from: classes.dex */
public abstract class fmj extends pa3 {
    public final SuggestionListItem b;
    public final hqk c;
    public fqk d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public fmj(SuggestionListItem suggestionListItem, hqk hqkVar) {
        super(suggestionListItem);
        this.b = suggestionListItem;
        this.c = hqkVar;
        this.e = new jxh(2131167618).k(suggestionListItem.getContext());
    }

    public final void Z(int i, Suggestion suggestion) {
        int i2;
        int i3;
        if (suggestion.a == 23) {
            i2 = 2131232265;
            i3 = 2132021718;
        } else {
            i2 = i != 0 ? i != 1 ? 0 : 2131232001 : 2131232000;
            i3 = 2132021056;
        }
        plf plfVar = new plf();
        SuggestionListItem suggestionListItem = this.b;
        suggestionListItem.y(plfVar);
        suggestionListItem.v(new lxh(i2));
        suggestionListItem.z = new rxh(i3);
        suggestionListItem.u();
    }
}
