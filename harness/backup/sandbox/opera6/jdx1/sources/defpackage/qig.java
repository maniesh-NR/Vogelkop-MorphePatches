package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class qig extends d {
    public final String[] a;
    public final String[] b;
    public final Drawable[] c;
    public final /* synthetic */ uig d;

    public qig(uig uigVar, String[] strArr, Drawable[] drawableArr) {
        this.d = uigVar;
        this.a = strArr;
        this.b = new String[strArr.length];
        this.c = drawableArr;
    }

    public final boolean G(int i) {
        uig uigVar = this.d;
        gig gigVar = uigVar.o0;
        if (gigVar != null) {
            return i != 0 ? i != 1 || (gigVar.C(30) && uigVar.o0.C(29)) : gigVar.C(13);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.d
    public final int getItemCount() {
        return this.a.length;
    }

    @Override // androidx.recyclerview.widget.d
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.d
    public final void onBindViewHolder(i iVar, int i) {
        pig pigVar = (pig) iVar;
        if (G(i)) {
            pigVar.itemView.setLayoutParams(new lph(-1, -2));
        } else {
            pigVar.itemView.setLayoutParams(new lph(0, 0));
        }
        pigVar.b.setText(this.a[i]);
        String str = this.b[i];
        TextView textView = pigVar.c;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.c[i];
        ImageView imageView = pigVar.d;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.d
    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        uig uigVar = this.d;
        return new pig(uigVar, LayoutInflater.from(uigVar.getContext()).inflate(2131558707, viewGroup, false));
    }
}
