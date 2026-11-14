package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.adapter.SuggestionListItem;

/* loaded from: classes.dex */
public final class yk3 extends fmj implements View.OnClickListener {
    public final /* synthetic */ byte f;
    public final nv6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yk3(SuggestionListItem suggestionListItem, hqk hqkVar, nv6 nv6Var, byte b) {
        super(suggestionListItem, hqkVar);
        this.f = b;
        switch (b) {
            case 1:
                super(suggestionListItem, hqkVar);
                this.g = nv6Var;
                suggestionListItem.setOnClickListener(this);
                pc5 pc5Var = new pc5(this, (byte) 15);
                l5b l5bVar = q9n.c;
                dll dllVarV = hjf.v(suggestionListItem.getContext());
                if (dllVarV != null) {
                    u8n.b(dllVarV, suggestionListItem, pc5Var);
                    break;
                }
                break;
            default:
                this.g = nv6Var;
                Drawable drawableI0 = j14.i0(2131231795, suggestionListItem.getContext());
                Bitmap bitmapX = z5i.x(drawableI0, drawableI0.getIntrinsicWidth(), drawableI0.getIntrinsicHeight());
                if (bitmapX != null) {
                    Context context = suggestionListItem.getContext();
                    int i = this.e;
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970235});
                    int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    uq8 uq8Var = new uq8(context, gjf.a(context), i2, bitmapX);
                    uq8Var.setBounds(0, 0, i, i);
                    suggestionListItem.z(new mxh(uq8Var));
                }
                suggestionListItem.setOnClickListener(this);
                suggestionListItem.C(new rxh(2132018035));
                break;
        }
    }

    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        byte b = this.f;
        nv6 nv6Var = this.g;
        SuggestionListItem suggestionListItem = this.b;
        switch (b) {
            case 0:
                fqk fqkVar = (fqk) gqkVar;
                this.d = fqkVar;
                Suggestion suggestion = fqkVar.c;
                suggestionListItem.D = suggestion;
                suggestionListItem.E(new qxh(suggestion.b));
                nv6Var.D(fqkVar.c);
                break;
            default:
                fqk fqkVar2 = (fqk) gqkVar;
                this.d = fqkVar2;
                Suggestion suggestion2 = fqkVar2.c;
                suggestionListItem.D = suggestion2;
                suggestionListItem.E(new qxh(suggestion2.b));
                Suggestion suggestion3 = fqkVar2.c;
                suggestionListItem.C(new qxh(suggestion3.c));
                a0();
                nv6Var.D(suggestion3);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.opera.android.suggestion.adapter.SuggestionListItem, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void a0() {
        LayerDrawable layerDrawable;
        Suggestion suggestion;
        fqk fqkVar = this.d;
        Object obj = (fqkVar == null || (suggestion = fqkVar.c) == null) ? null : suggestion.k;
        nt8 nt8Var = obj instanceof nt8 ? (nt8) obj : null;
        if (nt8Var != null) {
            int iOrdinal = nt8Var.ordinal();
            ?? r5 = this.b;
            int i = this.e;
            if (iOrdinal == 0) {
                Context context = r5.getContext();
                ColorDrawable colorDrawable = new ColorDrawable(f03.t(2130969654, context, 2131101243));
                Drawable drawableF = sgb.F(2131231868, context);
                if (drawableF == null) {
                    qp2.n("Required value was null.");
                    return;
                }
                int i2 = i / 2;
                int intrinsicWidth = (drawableF.getIntrinsicWidth() * i2) / drawableF.getIntrinsicHeight();
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{colorDrawable, drawableF});
                layerDrawable2.setLayerSize(0, i, i);
                layerDrawable2.setLayerSize(1, intrinsicWidth, i2);
                layerDrawable2.setLayerGravity(1, 17);
                layerDrawable = layerDrawable2;
            } else {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                Context context2 = r5.getContext();
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{f03.t(2130971253, context2, 2131101243), f03.t(2130971254, context2, 2131101243)});
                s8n s8nVar = new s8n(context2, 2130970594);
                Drawable drawableF2 = sgb.F(2131231939, context2);
                j14.n0(drawableF2, f03.t(2130969273, s8nVar, 2131101243));
                int i3 = i / 2;
                layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawableF2});
                layerDrawable.setLayerSize(0, i, i);
                layerDrawable.setLayerSize(1, i3, i3);
                layerDrawable.setLayerGravity(1, 17);
            }
            Bitmap bitmapX = z5i.x(layerDrawable, i, i);
            if (bitmapX == null) {
                return;
            }
            Context context3 = r5.getContext();
            TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(new int[]{2130970235});
            int i4 = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            uq8 uq8Var = new uq8(context3, gjf.a(context3), i4, bitmapX);
            uq8Var.setBounds(0, 0, i, i);
            r5.z(new mxh(uq8Var));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f;
        hqk hqkVar = this.c;
        nv6 nv6Var = this.g;
        switch (b) {
            case 0:
                fqk fqkVar = this.d;
                if (fqkVar != null) {
                    Suggestion suggestion = fqkVar.c;
                    nv6Var.C(suggestion);
                    hqkVar.q(suggestion, true);
                    break;
                }
                break;
            default:
                fqk fqkVar2 = this.d;
                if (fqkVar2 != null) {
                    Suggestion suggestion2 = fqkVar2.c;
                    nv6Var.C(suggestion2);
                    hqkVar.q(suggestion2, true);
                    break;
                }
                break;
        }
    }
}
