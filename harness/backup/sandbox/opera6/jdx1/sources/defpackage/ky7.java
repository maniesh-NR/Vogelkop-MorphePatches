package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ky7 extends d {
    public final /* synthetic */ byte a = 0;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ky7(Context context, c82 c82Var, ry7 ry7Var) {
        this.c = c82Var;
        this.d = ry7Var;
        this.e = LayoutInflater.from(context);
    }

    public ky7(uig uigVar, String[] strArr, float[] fArr) {
        this.e = uigVar;
        this.c = strArr;
        this.d = fArr;
    }

    @Override // androidx.recyclerview.widget.d
    public final int getItemCount() {
        switch (this.a) {
            case 0:
                return ((ehc) ((c82) this.c).b).d();
            default:
                return ((String[]) this.c).length;
        }
    }

    @Override // androidx.recyclerview.widget.d
    public final void onBindViewHolder(i iVar, int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                c82 c82Var = (c82) obj;
                boolean z = i == this.b;
                View view = iVar.itemView;
                WeakHashMap weakHashMap = r5n.a;
                ImageView imageView = (ImageView) ((View) m5n.f(view, 2131362670));
                imageView.setImageDrawable(imageView.getContext().getDrawable(((ukb) ((ehc) c82Var.b).get(i)).a));
                imageView.setSelected(z);
                imageView.setContentDescription(((ukb) ((ehc) c82Var.b).get(i)).b.c);
                iVar.itemView.setOnClickListener(new g63(this, i, (byte) 1));
                if (z) {
                    imageView.post(new bn7(imageView, (byte) 8));
                }
                View view2 = (View) m5n.f(iVar.itemView, 2131362671);
                view2.setVisibility(z ? 0 : 8);
                view2.setSelected(z);
                break;
            default:
                rig rigVar = (rig) iVar;
                String[] strArr = (String[]) obj;
                if (i < strArr.length) {
                    rigVar.b.setText(strArr[i]);
                }
                if (i == this.b) {
                    rigVar.itemView.setSelected(true);
                    rigVar.c.setVisibility(0);
                } else {
                    rigVar.itemView.setSelected(false);
                    rigVar.c.setVisibility(4);
                }
                rigVar.itemView.setOnClickListener(new g63(this, i, (byte) 3));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.d
    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                return new zl5(((LayoutInflater) obj).inflate(2131558913, viewGroup, false));
            default:
                return new rig(LayoutInflater.from(((uig) obj).getContext()).inflate(2131558708, viewGroup, false));
        }
    }
}
