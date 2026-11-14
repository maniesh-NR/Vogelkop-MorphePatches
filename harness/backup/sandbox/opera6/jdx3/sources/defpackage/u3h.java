package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.ProductSuggestionListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.text.NumberFormat;
import java.util.Currency;

/* loaded from: classes.dex */
public final class u3h extends pa3 implements View.OnClickListener {
    public final ProductSuggestionListItem b;
    public final hqk c;
    public final nv6 d;
    public fqk e;

    /* JADX WARN: Multi-variable type inference failed */
    public u3h(ProductSuggestionListItem productSuggestionListItem, hqk hqkVar, nv6 nv6Var) {
        super(productSuggestionListItem);
        this.b = productSuggestionListItem;
        this.c = hqkVar;
        this.d = nv6Var;
        productSuggestionListItem.setOnClickListener(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.opera.android.suggestion.adapter.ProductSuggestionListItem, java.lang.Object] */
    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        fqk fqkVar = (fqk) gqkVar;
        this.e = fqkVar;
        Suggestion suggestion = fqkVar.c;
        ?? r0 = this.b;
        r0.p = suggestion;
        pt1 pt1Var = r0.q;
        pt1Var.b.setText(suggestion.b);
        dwh dwhVarI = yne.b.i(suggestion.h);
        dwhVarI.b.c(new dcd(r0.getContext(), new ixh(46.0f).k(r0.getContext())));
        dwhVarI.g((ImageView) pt1Var.e, new isd((Object) r0, (byte) 14));
        Object obj = suggestion.k;
        c3h c3hVar = obj instanceof c3h ? (c3h) obj : null;
        if (c3hVar != null) {
            String str2 = c3hVar.d;
            pt1Var.g.setText(c3hVar.c);
            OperaTextView operaTextView = (OperaTextView) pt1Var.f;
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            currencyInstance.setCurrency(Currency.getInstance(c3hVar.b));
            operaTextView.setText(currencyInstance.format(Float.valueOf(c3hVar.a)));
            int iK = new ixh(28.0f).k(r0.getContext());
            if (r0.t.contains(str2)) {
                r0.s(c3hVar, iK);
            } else {
                r0.r(str2, iK, true, new q14((Object) r0, (Object) c3hVar, iK, (byte) 6));
            }
        }
        this.d.D(fqkVar.c);
    }

    @Override // defpackage.pa3
    public final void Y() {
        this.e = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fqk fqkVar = this.e;
        if (fqkVar != null) {
            Suggestion suggestion = fqkVar.c;
            if (view != ((i) this).itemView) {
                return;
            }
            this.d.C(suggestion);
            this.c.q(suggestion, true);
        }
    }
}
