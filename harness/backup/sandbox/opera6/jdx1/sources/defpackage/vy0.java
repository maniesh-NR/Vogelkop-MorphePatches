package defpackage;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class vy0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vy0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                wy0 wy0Var = (wy0) obj2;
                zy0 zy0Var = (zy0) obj;
                wy0Var.p.onClick(zy0Var.b, i);
                if (!wy0Var.s) {
                    zy0Var.b.dismiss();
                    break;
                }
                break;
            default:
                rn9 rn9Var = (rn9) obj2;
                rn9Var.G(rn9.v((ListView) obj));
                ((AlertDialog) rn9Var.c).dismiss();
                break;
        }
    }
}
