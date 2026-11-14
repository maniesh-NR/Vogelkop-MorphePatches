package defpackage;

import android.view.View;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.SuggestionListItem;

/* loaded from: classes.dex */
public final class dsi extends fmj {
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public dsi(SuggestionListItem suggestionListItem, hqk hqkVar, int i) {
        super(suggestionListItem, hqkVar);
        this.f = i;
        final byte b = 0;
        suggestionListItem.setOnClickListener(new View.OnClickListener(this) { // from class: csi
            public final /* synthetic */ dsi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                dsi dsiVar = this.b;
                switch (b2) {
                    case 0:
                        fqk fqkVar = dsiVar.d;
                        if (fqkVar != null) {
                            dsiVar.c.q(fqkVar.c, true);
                            break;
                        }
                        break;
                    default:
                        fqk fqkVar2 = dsiVar.d;
                        if (fqkVar2 != null) {
                            dsiVar.c.q(fqkVar2.c, false);
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        suggestionListItem.w(new View.OnClickListener(this) { // from class: csi
            public final /* synthetic */ dsi b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                dsi dsiVar = this.b;
                switch (b22) {
                    case 0:
                        fqk fqkVar = dsiVar.d;
                        if (fqkVar != null) {
                            dsiVar.c.q(fqkVar.c, true);
                            break;
                        }
                        break;
                    default:
                        fqk fqkVar2 = dsiVar.d;
                        if (fqkVar2 != null) {
                            dsiVar.c.q(fqkVar2.c, false);
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
        boolean z = this.f;
        Z(z ? 1 : 0, fqkVar.c);
    }
}
