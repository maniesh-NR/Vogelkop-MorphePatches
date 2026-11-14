package defpackage;

import android.view.View;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.SuggestionListItem;

/* loaded from: classes.dex */
public final class nmh extends fmj {
    public final nv6 f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public nmh(SuggestionListItem suggestionListItem, hqk hqkVar, nv6 nv6Var, int i) {
        super(suggestionListItem, hqkVar);
        this.f = nv6Var;
        this.g = i;
        final byte b = 0;
        suggestionListItem.setOnClickListener(new View.OnClickListener(this) { // from class: mmh
            public final /* synthetic */ nmh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                nmh nmhVar = this.b;
                switch (b2) {
                    case 0:
                        fqk fqkVar = nmhVar.d;
                        if (fqkVar != null) {
                            Suggestion suggestion = fqkVar.c;
                            nmhVar.f.C(suggestion);
                            nmhVar.c.q(suggestion, true);
                            break;
                        }
                        break;
                    default:
                        fqk fqkVar2 = nmhVar.d;
                        if (fqkVar2 != null) {
                            Suggestion suggestion2 = fqkVar2.c;
                            nmhVar.f.C(suggestion2);
                            nmhVar.c.q(suggestion2, false);
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        suggestionListItem.w(new View.OnClickListener(this) { // from class: mmh
            public final /* synthetic */ nmh b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                nmh nmhVar = this.b;
                switch (b22) {
                    case 0:
                        fqk fqkVar = nmhVar.d;
                        if (fqkVar != null) {
                            Suggestion suggestion = fqkVar.c;
                            nmhVar.f.C(suggestion);
                            nmhVar.c.q(suggestion, true);
                            break;
                        }
                        break;
                    default:
                        fqk fqkVar2 = nmhVar.d;
                        if (fqkVar2 != null) {
                            Suggestion suggestion2 = fqkVar2.c;
                            nmhVar.f.C(suggestion2);
                            nmhVar.c.q(suggestion2, false);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        fqk fqkVar = (fqk) gqkVar;
        this.d = fqkVar;
        Suggestion suggestion = fqkVar.c;
        SuggestionListItem suggestionListItem = this.b;
        suggestionListItem.D = suggestion;
        suggestionListItem.E(new qxh(suggestion.b));
        Suggestion suggestion2 = fqkVar.c;
        suggestionListItem.z(new lxh(ybh.g(suggestion2)));
        Z(this.g ? 1 : 0, suggestion2);
    }
}
