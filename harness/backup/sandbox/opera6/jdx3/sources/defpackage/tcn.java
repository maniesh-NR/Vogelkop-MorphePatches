package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tcn extends lgn {
    public final /* synthetic */ byte d = 1;
    public final int e;
    public final boolean f;
    public final /* synthetic */ mgn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcn(rfn rfnVar, int i, boolean z) {
        super(rfnVar);
        Objects.requireNonNull(rfnVar);
        this.g = rfnVar;
        this.e = i;
        this.f = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcn(ucn ucnVar, int i, boolean z) {
        super(ucnVar);
        this.g = ucnVar;
        this.e = i;
        this.f = z;
    }

    @Override // defpackage.lgn
    public final rcn a(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
        byte b = this.d;
        boolean z = this.f;
        mgn mgnVar = this.g;
        byte b2 = 12;
        switch (b) {
            case 0:
                ucn ucnVar = (ucn) mgnVar;
                gjm gjmVar = ucnVar.j;
                ysj ysjVar = ucnVar.k;
                int iA = fan.a(4.0f, view.getContext().getResources());
                Resources resources = view.getContext().getResources();
                int i = this.e;
                String quantityString = resources.getQuantityString(2131886190, i, Integer.valueOf(i));
                Context context = view.getContext();
                bxc bxcVar = (bxc) cxc.t(context).i();
                String strA = z ? bxcVar.a(8, context) : bxcVar.a(7, context);
                if (strA == null) {
                    strA = context.getString(z ? 2132022149 : 2132022148);
                }
                rcn rcnVar = new rcn(viewGroup, view, iA, quantityString, strA, new wzg(view.getContext().getString(2132022147), new obn(ysjVar, gjmVar, (byte) 2), (byte) 12), 2131558573, z ? mf0.c : mf0.b);
                rcnVar.a(new scn(this, view, (byte) 0));
                return rcnVar;
            default:
                bxc bxcVar2 = (bxc) cxc.t(view.getContext()).i();
                yug yugVar = ((rfn) mgnVar).j;
                String strA2 = bxcVar2.a(4, view.getContext());
                String strA3 = bxcVar2.a(5, view.getContext());
                String strA4 = bxcVar2.a(6, view.getContext());
                Context context2 = view.getContext();
                int i2 = z ? 2132021688 : 2132022120;
                if (TextUtils.isEmpty(strA2)) {
                    strA2 = context2.getString(i2);
                }
                Context context3 = view.getContext();
                if (TextUtils.isEmpty(strA3)) {
                    strA3 = context3.getString(2132022119);
                }
                rcn rcnVar2 = new rcn(viewGroup, view, 0, strA2, strA3, new wzg(!TextUtils.isEmpty(strA4) ? strA4 : view.getContext().getString(2132022186), new pkm(yugVar, b2), (byte) 12), 2131558572, z ? mf0.f : mf0.d);
                rcnVar2.a(new scn(this, view, (byte) 1));
                return rcnVar2;
        }
    }
}
