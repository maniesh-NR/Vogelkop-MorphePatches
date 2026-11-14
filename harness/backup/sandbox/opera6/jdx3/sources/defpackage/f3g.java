package defpackage;

import android.view.View;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.SuggestionListItem;

/* loaded from: classes.dex */
public final class f3g extends fmj implements View.OnClickListener {
    public final nv6 f;
    public final wpk g;
    public e3g h;

    public f3g(SuggestionListItem suggestionListItem, hqk hqkVar, nv6 nv6Var, wpk wpkVar) {
        super(suggestionListItem, hqkVar);
        this.f = nv6Var;
        this.g = wpkVar;
        suggestionListItem.setOnClickListener(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.opera.android.suggestion.adapter.SuggestionListItem, com.opera.android.ui.catalog.widget.OperaListItem] */
    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        String str2;
        fqk fqkVar = (fqk) gqkVar;
        this.d = fqkVar;
        Suggestion suggestion = fqkVar.c;
        ?? r0 = this.b;
        r0.D = suggestion;
        r0.E((suggestion == null || (str2 = suggestion.b) == null) ? null : new qxh(str2));
        r0.C(suggestion != null ? new qxh(suggestion.a()) : null);
        int iE = nr8.e(r0.getContext());
        e3g e3gVar = new e3g((Object) this, (Object) fqkVar, (byte) 0);
        dwh dwhVarG = qbe.G(r0.getContext(), iE, suggestion.h);
        if (suggestion.a == 17) {
            dwhVarG.i(3, new int[0]);
        }
        dwhVarG.f(e3gVar);
        this.h = e3gVar;
    }

    @Override // defpackage.pa3
    public final void Y() {
        e3g e3gVar = this.h;
        if (e3gVar != null) {
            yne.b.a(e3gVar);
            this.h = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fqk fqkVar = this.d;
        if (fqkVar != null) {
            Suggestion suggestion = fqkVar.c;
            this.f.C(suggestion);
            this.c.q(suggestion, true);
        }
    }
}
