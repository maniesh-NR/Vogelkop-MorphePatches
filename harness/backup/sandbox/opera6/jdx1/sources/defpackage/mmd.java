package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mmd extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final LayoutInflater a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;

    public mmd(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130970325, 2130970334, 2130970331, 2130970330});
        this.b = sgb.F(typedArrayObtainStyledAttributes.getResourceId(0, 0), context);
        this.c = sgb.F(typedArrayObtainStyledAttributes.getResourceId(1, 0), context);
        this.d = sgb.F(typedArrayObtainStyledAttributes.getResourceId(2, 0), context);
        this.e = sgb.F(typedArrayObtainStyledAttributes.getResourceId(3, 0), context);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto Lc
            android.view.LayoutInflater r8 = r6.a
            r1 = 2131559074(0x7f0d02a2, float:1.8743482E38)
            android.view.View r8 = r8.inflate(r1, r9, r0)
        Lc:
            java.lang.Object r7 = r6.getItem(r7)
            cod r7 = (defpackage.cod) r7
            r9 = 2131363578(0x7f0a06fa, float:1.8346969E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2131363576(0x7f0a06f8, float:1.8346965E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r7.d
            r9.setText(r2)
            java.lang.String r2 = r7.e
            int r3 = r7.i
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L33
            if (r3 != r4) goto L45
        L33:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L45
            r3 = 80
            r9.setGravity(r3)
            r1.setVisibility(r0)
            r1.setText(r2)
            goto L54
        L45:
            r0 = 16
            r9.setGravity(r0)
            r9 = 8
            r1.setVisibility(r9)
            java.lang.String r9 = ""
            r1.setText(r9)
        L54:
            boolean r9 = r7.g
            r8.setEnabled(r9)
            da r9 = defpackage.nmd.y
            defpackage.r5n.l(r8, r9)
            r9 = 2131363577(0x7f0a06f9, float:1.8346967E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto La0
            android.net.Uri r0 = r7.f
            if (r0 == 0) goto L84
            android.content.Context r1 = r6.getContext()     // Catch: java.io.IOException -> L81
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L81
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.io.IOException -> L81
            r2 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch: java.io.IOException -> L81
            if (r0 == 0) goto L84
            goto L9d
        L81:
            r0.toString()
        L84:
            int r0 = r7.n
            if (r0 == r4) goto L9a
            if (r0 == r5) goto L97
            boolean r7 = r7.e()
            if (r7 == 0) goto L94
            android.graphics.drawable.Drawable r6 = r6.e
        L92:
            r0 = r6
            goto L9d
        L94:
            android.graphics.drawable.Drawable r6 = r6.b
            goto L92
        L97:
            android.graphics.drawable.Drawable r6 = r6.d
            goto L92
        L9a:
            android.graphics.drawable.Drawable r6 = r6.c
            goto L92
        L9d:
            r9.setImageDrawable(r0)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mmd.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((cod) getItem(i)).g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        cod codVar = (cod) getItem(i);
        ImageView imageView = (ImageView) view.findViewById(2131363577);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131363579);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        codVar.l(true);
    }
}
