package defpackage;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.i;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.SuggestionListItem;

/* loaded from: classes.dex */
public final class yqm extends fmj {
    public final nv6 f;
    public final boolean g;
    public boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public yqm(SuggestionListItem suggestionListItem, hqk hqkVar, nv6 nv6Var, int i) {
        super(suggestionListItem, hqkVar);
        this.f = nv6Var;
        this.g = i;
        final byte b = 0;
        suggestionListItem.setOnClickListener(new View.OnClickListener(this) { // from class: xqm
            public final /* synthetic */ yqm b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                yqm yqmVar = this.b;
                switch (b2) {
                    case 0:
                        fqk fqkVar = yqmVar.d;
                        if (fqkVar != null) {
                            Suggestion suggestion = fqkVar.c;
                            yqmVar.f.C(suggestion);
                            yqmVar.c.q(suggestion, true);
                            break;
                        }
                        break;
                    default:
                        fqk fqkVar2 = yqmVar.d;
                        if (fqkVar2 != null) {
                            Suggestion suggestion2 = fqkVar2.c;
                            yqmVar.f.C(suggestion2);
                            yqmVar.c.q(suggestion2, false);
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        suggestionListItem.w(new View.OnClickListener(this) { // from class: xqm
            public final /* synthetic */ yqm b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                yqm yqmVar = this.b;
                switch (b22) {
                    case 0:
                        fqk fqkVar = yqmVar.d;
                        if (fqkVar != null) {
                            Suggestion suggestion = fqkVar.c;
                            yqmVar.f.C(suggestion);
                            yqmVar.c.q(suggestion, true);
                            break;
                        }
                        break;
                    default:
                        fqk fqkVar2 = yqmVar.d;
                        if (fqkVar2 != null) {
                            Suggestion suggestion2 = fqkVar2.c;
                            yqmVar.f.C(suggestion2);
                            yqmVar.c.q(suggestion2, false);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        String strG;
        fqk fqkVar = (fqk) gqkVar;
        this.d = fqkVar;
        boolean zA0 = z5i.a0(fqkVar.c.b());
        this.h = zA0;
        Suggestion suggestion = fqkVar.c;
        SuggestionListItem suggestionListItem = this.b;
        suggestionListItem.D = suggestion;
        fqk fqkVar2 = this.d;
        if (fqkVar2 == null) {
            strG = "";
        } else {
            Suggestion suggestion2 = fqkVar2.c;
            if (zA0) {
                strG = z5i.K(suggestion2.b());
                if (strG == null) {
                    strG = suggestion2.b;
                }
            } else {
                strG = suggestion2.b;
                if (strG.length() == 0) {
                    String strA0 = a0();
                    String[] strArr = wqm.a;
                    strG = aik.g(strA0);
                }
            }
        }
        suggestionListItem.E(new qxh(strG));
        suggestionListItem.z(new lxh(ybh.g(suggestion)));
        String strA02 = a0();
        if (strA02 == null) {
            suggestionListItem.C(null);
        } else {
            SpannableString spannableString = new SpannableString(strA02);
            Pair pairD = aik.d(strA02, str);
            Integer num = (Integer) pairD.first;
            Integer num2 = (Integer) pairD.second;
            if (num == null || num.intValue() != -1) {
                spannableString.setSpan(new StyleSpan(1), num.intValue(), num2.intValue(), 0);
            }
            suggestionListItem.C(new qxh(spannableString));
        }
        this.f.D(suggestion);
        Z(this.g ? 1 : 0, suggestion);
    }

    public final String a0() {
        fqk fqkVar = this.d;
        if (fqkVar == null) {
            return null;
        }
        if (this.h) {
            return ((i) this).itemView.getContext().getString(2132017532);
        }
        Suggestion suggestion = fqkVar.c;
        if (suggestion.a == 11) {
            return null;
        }
        return aik.s(aik.p(pik.D(500, BrowserUtils.getDisplayString(suggestion.b()))), aik.a);
    }
}
