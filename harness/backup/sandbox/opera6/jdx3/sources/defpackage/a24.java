package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class a24 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jf b;

    public /* synthetic */ a24(jf jfVar, byte b) {
        this.a = b;
        this.b = jfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        bf bfVar = bf.a;
        jf jfVar = this.b;
        switch (b) {
            case 0:
                jfVar.a.invoke(view, new ef(bfVar));
                break;
            default:
                jfVar.a.invoke(view, new ef(bfVar));
                break;
        }
    }
}
