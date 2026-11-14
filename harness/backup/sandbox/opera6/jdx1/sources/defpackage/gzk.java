package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gzk extends View {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ izk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzk(izk izkVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = izkVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        izk izkVar = this.b;
        ArrayList arrayList = izkVar.b;
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (izkVar.e != color) {
            izkVar.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((l6h) arrayList.get(size)).a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw fki.n(size2, arrayList2);
                }
            }
        }
    }
}
