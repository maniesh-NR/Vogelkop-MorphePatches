package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.SuggestionListItem;

/* loaded from: classes.dex */
public final class zri extends fmj {
    public final boolean f;
    public final e3g g;
    public final int h;
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public zri(SuggestionListItem suggestionListItem, hqk hqkVar, int i) {
        super(suggestionListItem, hqkVar);
        this.f = i;
        this.g = new e3g((Object) suggestionListItem, (Object) this, (byte) 2);
        this.h = fan.a(4.0f, suggestionListItem.getResources());
        final byte b = 0;
        suggestionListItem.setOnClickListener(new View.OnClickListener(this) { // from class: yri
            public final /* synthetic */ zri b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                zri zriVar = this.b;
                switch (b2) {
                    case 0:
                        fqk fqkVar = zriVar.d;
                        if (fqkVar != null) {
                            zriVar.c.q(fqkVar.c, true);
                            break;
                        }
                        break;
                    default:
                        fqk fqkVar2 = zriVar.d;
                        if (fqkVar2 != null) {
                            zriVar.c.q(fqkVar2.c, false);
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        suggestionListItem.w(new View.OnClickListener(this) { // from class: yri
            public final /* synthetic */ zri b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                zri zriVar = this.b;
                switch (b22) {
                    case 0:
                        fqk fqkVar = zriVar.d;
                        if (fqkVar != null) {
                            zriVar.c.q(fqkVar.c, true);
                            break;
                        }
                        break;
                    default:
                        fqk fqkVar2 = zriVar.d;
                        if (fqkVar2 != null) {
                            zriVar.c.q(fqkVar2.c, false);
                            break;
                        }
                        break;
                }
            }
        });
        kkf kkfVar = new kkf(this, (byte) 14);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(suggestionListItem.getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, suggestionListItem, kkfVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.opera.android.suggestion.adapter.SuggestionListItem, com.opera.android.ui.catalog.widget.OperaListItem] */
    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        fqk fqkVar = (fqk) gqkVar;
        this.d = fqkVar;
        Suggestion suggestion = fqkVar.c;
        ?? r0 = this.b;
        r0.D = suggestion;
        if (suggestion != null) {
            r0.E(new qxh(suggestion.b));
            r0.C(new qxh(suggestion.c));
        }
        deg degVar = yne.b;
        e3g e3gVar = this.g;
        degVar.b(e3gVar);
        if (TextUtils.isEmpty(suggestion.h)) {
            Context context = r0.getContext();
            Drawable drawableI0 = j14.i0(2131232229, context);
            drawableI0.setTintList(f03.v(context));
            r0.z(new mxh(drawableI0));
            this.i = true;
        } else {
            dwh dwhVarI = degVar.i(suggestion.h);
            gvh gvhVar = dwhVarI.b;
            int i = this.e;
            gvhVar.b(i, i);
            dwhVarI.k(j14.E(i, this.h, suggestion.i));
            dwhVarI.b();
            dwhVarI.f(e3gVar);
            this.i = false;
        }
        boolean z = this.f;
        Z(z ? 1 : 0, fqkVar.c);
    }

    @Override // defpackage.pa3
    public final void Y() {
        yne.b.b(this.g);
        this.i = false;
    }
}
