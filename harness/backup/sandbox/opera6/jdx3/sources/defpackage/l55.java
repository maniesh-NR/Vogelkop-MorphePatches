package defpackage;

import android.content.Context;
import android.view.View;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.SuggestionListItem;

/* loaded from: classes.dex */
public final class l55 extends fmj implements View.OnClickListener {
    public static final /* synthetic */ int i = 0;
    public final boolean f;
    public boolean g;
    public final yk4 h;

    /* JADX WARN: Multi-variable type inference failed */
    public l55(SuggestionListItem suggestionListItem, hqk hqkVar, int i2) {
        super(suggestionListItem, hqkVar);
        this.f = i2 != 4;
        this.h = new yk4(this, (byte) 4);
        suggestionListItem.setOnClickListener(this);
        suggestionListItem.z(new lxh(i2 != 4 ? i2 != 5 ? 2131232051 : 2131232123 : 2131232174));
        u7 u7Var = new u7(this, (byte) 28);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(suggestionListItem.getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, suggestionListItem, u7Var);
    }

    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        fqk fqkVar = (fqk) gqkVar;
        this.d = fqkVar;
        qxh qxhVar = new qxh(fqkVar.c.b);
        SuggestionListItem suggestionListItem = this.b;
        suggestionListItem.E(qxhVar);
        fqk fqkVar2 = this.d;
        if (fqkVar2 == null || fqkVar2.c.d != null) {
            suggestionListItem.y(rlf.h);
            return;
        }
        suggestionListItem.y(new plf());
        suggestionListItem.w(this.h);
        suggestionListItem.x(new dxh(2130969900));
        this.g = false;
        a0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.opera.android.suggestion.adapter.SuggestionListItem, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void a0() {
        fqk fqkVar = this.d;
        if (fqkVar == null) {
            return;
        }
        Suggestion suggestion = fqkVar.c;
        ?? r1 = this.b;
        Context context = r1.getContext();
        if (this.g) {
            r1.v(new lxh(2131232292));
            r1.z = new qxh(context.getString(2132018245));
            r1.u();
            r1.E(new qxh(suggestion.b()));
            return;
        }
        r1.v(new lxh(2131232293));
        r1.z = new qxh(context.getString(2132018247));
        r1.u();
        r1.E(new qxh(suggestion.b));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fqk fqkVar = this.d;
        if (fqkVar == null) {
            return;
        }
        this.c.q(fqkVar.c, this.f);
    }
}
